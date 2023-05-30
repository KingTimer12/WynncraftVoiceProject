package com.wynnvp.wynncraftvp.networking.packet.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.network.play.server.SPacketEntity;
import net.minecraft.network.play.server.SPacketEntityTeleport;

import java.util.Optional;

public class VOWPacketEntityTeleport extends SPacketEntityTeleport {

    public Optional<EntityArmorStand> getArmor() {
        if (Minecraft.getMinecraft().world == null) return Optional.empty();
        final Entity entity = Minecraft.getMinecraft().world.getEntityByID(getEntityId());
        if (entity instanceof EntityArmorStand) return Optional.of((EntityArmorStand) entity);
        return Optional.empty();
    }

}
