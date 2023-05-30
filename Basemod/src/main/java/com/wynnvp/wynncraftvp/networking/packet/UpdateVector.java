package com.wynnvp.wynncraftvp.networking.packet;

import com.wynnvp.wynncraftvp.ModCore;
import com.wynnvp.wynncraftvp.networking.annotations.ListenPacket;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntityTeleport;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntityVelocity;
import com.wynnvp.wynncraftvp.npc.NPCHandler;
import com.wynnvp.wynncraftvp.npc.QuestMarkHandler;
import com.wynnvp.wynncraftvp.sound.Vector3;
import com.wynnvp.wynncraftvp.utils.StringBlacklist;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;

import java.util.List;

public class UpdateVector implements VOWPacket {

    @ListenPacket
    public void onPacketTeleport(VOWPacketEntityTeleport packet) {
        if (!ModCore.inServer) return;
        EntityArmorStand armorStand = packet.getArmor();
        if (armorStand == null)
            return;
        updateVector(armorStand);
    }

    @ListenPacket
    public void onPacketVelocity(VOWPacketEntityVelocity packet) {
        if (!ModCore.inServer) return;
        EntityArmorStand armorStand = packet.getArmor();
        if (armorStand == null)
            return;
        updateVector(armorStand);
    }

    private void updateVector(EntityArmorStand armorStand) {
        final String name = armorStand.getCustomNameTag();
        if (name.isEmpty()) return;
        String rawName = TextFormatting.getTextWithoutFormattingCodes(name.toLowerCase().trim().replace(" ", "").replace("'", ""));
        if (rawName == null || StringBlacklist.has(rawName)) return;

        //Get rawname if original is ???
        if (rawName.contains("???")) {
            String quest = QuestMarkHandler.getWichQuest().get(rawName);
            if (quest == null || quest.isEmpty()) return;
            //Get by quest
            rawName = ModCore.instance.soundsHandler.getNPCName(quest);
        }

        if (ModCore.instance.soundsHandler.containsName(rawName)) {
            updateVelocity(rawName, armorStand);
        }
    }

    private void updateVelocity(String rawName, EntityArmorStand armorStand) {
        Vector3 armorVector = new Vector3((float) armorStand.posX, (float) armorStand.posY, (float) armorStand.posZ);
        if (NPCHandler.getNamesHandlers().containsKey(rawName)) {
            List<Vector3> vec3dList = NPCHandler.getNamesHandlers().get(rawName);
            if (vec3dList.size() == 1) {
                vec3dList.set(0, armorVector);
            } else {
                NPCHandler.find(rawName).ifPresent(approxi -> {
                    int result = 0;
                    for (int index = 0; index < vec3dList.size(); index++) {
                        Vector3 now = NPCHandler.getNamesHandlers().get(rawName).get(index);
                        if (now == approxi) {
                            result = index;
                            break;
                        }
                    }
                    vec3dList.set(result, armorVector);
                });
            }
            NPCHandler.getNamesHandlers().put(rawName, vec3dList);
        } else {
            NPCHandler.add(rawName, armorVector);
        }
    }
}
