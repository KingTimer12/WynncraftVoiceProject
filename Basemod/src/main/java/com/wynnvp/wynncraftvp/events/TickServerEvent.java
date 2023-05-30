package com.wynnvp.wynncraftvp.events;

import com.wynnvp.wynncraftvp.ModCore;
import com.wynnvp.wynncraftvp.npc.NPCHandler;
import com.wynnvp.wynncraftvp.sound.Vector3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TickServerEvent {

    private static final int DISTANCE_MULTI = 2;

    private static final int BLOCKS_PER_BLOCKS = 53;

    static int ticks = 1;

    @SubscribeEvent
    public void onTickEvent(TickEvent.ClientTickEvent event) {
        if (!ModCore.inServer || NPCHandler.getNamesHandlers().isEmpty())
            return;
        if (ticks % 20 == 0) {
            checkArround();
            ticks = 1;
        }
        ticks++;
    }

    private void checkArround() {
        if (Minecraft.getMinecraft().player == null) return;
        EntityPlayerSP player = Minecraft.getMinecraft().player;

        final Map<String, Vector3> setToRemove = new HashMap<>();
        for (Map.Entry<String, List<Vector3>> value : NPCHandler.getNamesHandlers().entrySet()) {
            for (Vector3 vec3d : value.getValue()) {
                final double distance = player.getDistance(vec3d.x, vec3d.y, vec3d.z);
                final int multiply = DISTANCE_MULTI * BLOCKS_PER_BLOCKS;
                if (distance >= multiply || distance <= -(multiply)) {
                    setToRemove.put(value.getKey(), vec3d);
                }
            }
        }
        for (Map.Entry<String, Vector3> stringVec3dEntry : setToRemove.entrySet()) {
            NPCHandler.getNamesHandlers().get(stringVec3dEntry.getKey()).remove(stringVec3dEntry.getValue());
            if (NPCHandler.getNamesHandlers().get(stringVec3dEntry.getKey()).isEmpty())
                NPCHandler.remove(stringVec3dEntry.getKey());
        }
        setToRemove.clear();
    }

}
