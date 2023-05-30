package com.wynnvp.wynncraftvp.networking.packet.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.network.play.server.SPacketEntity;

import java.util.Optional;

public class VOWPacketEntity extends SPacketEntity {

    public Optional<EntityArmorStand> getArmor() {
        if (Minecraft.getMinecraft().world == null) return Optional.empty();
        final Entity entity = getEntity(Minecraft.getMinecraft().world);
        if (entity instanceof EntityArmorStand) return Optional.of((EntityArmorStand) entity);
        return Optional.empty();
    }

}
