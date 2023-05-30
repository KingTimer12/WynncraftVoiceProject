package com.wynnvp.wynncraftvp.networking.packet;

import com.wynnvp.wynncraftvp.ModCore;
import com.wynnvp.wynncraftvp.networking.annotations.ListenPacket;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntity;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntityMetadata;
import com.wynnvp.wynncraftvp.npc.NPCHandler;
import com.wynnvp.wynncraftvp.npc.QuestMarkHandler;
import com.wynnvp.wynncraftvp.sound.Vector3;
import com.wynnvp.wynncraftvp.utils.StringBlacklist;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.text.TextFormatting;

public class AddArmorStand implements VOWPacket {

    @ListenPacket
    public void onPacketEntity(VOWPacketEntity packet) {
        if (!ModCore.inServer) return;

        if (!Minecraft.getMinecraft().isCallingFromMinecraftThread()) {
            Minecraft.getMinecraft().addScheduledTask(() -> onPacketEntity(packet));
            return;
        }
        packet.getArmor().ifPresent(this::setNamesHandlerProtocol);
    }

    @ListenPacket
    public void onPacketEntityMetadata(VOWPacketEntityMetadata packet) {
        if (!ModCore.inServer) return;
        if (!Minecraft.getMinecraft().isCallingFromMinecraftThread()) {
            Minecraft.getMinecraft().addScheduledTask(() -> onPacketEntityMetadata(packet));
            return;
        }
        packet.getArmor().ifPresent(this::setNamesHandlerProtocol);
    }

    private void setNamesHandlerProtocol(EntityArmorStand armorStand) {
        String armorStandName = armorStand.getCustomNameTag();
        if (armorStandName.isEmpty())
            return;
        String rawName = TextFormatting.getTextWithoutFormattingCodes(armorStandName.toLowerCase().trim().replace(" ", "").replace("'", ""));
        if (rawName == null || StringBlacklist.has(rawName))
            return;
        if (rawName.contains("???")) {
            String quest = (String) QuestMarkHandler.getWichQuest().get(rawName);
            if (quest == null || quest.isEmpty())
                return;
            rawName = ModCore.instance.soundsHandler.getNPCName(quest);
        }
        if (ModCore.instance.soundsHandler.containsName(rawName))
            NPCHandler.add(rawName, new Vector3((float) armorStand.posX, (float) armorStand.posY, (float) armorStand.posZ));
    }

}
