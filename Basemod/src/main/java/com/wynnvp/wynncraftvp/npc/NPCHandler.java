package com.wynnvp.wynncraftvp.npc;

import com.wynnvp.wynncraftvp.sound.Vector3;
import com.wynnvp.wynncraftvp.utils.VectorUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.Vec3d;

import java.util.*;

public class NPCHandler {

    private static final Map<String, List<Vector3>> namesHandlers = new HashMap<>();

    public static void add(String name, Vector3 vector) {
        if (namesHandlers.containsKey(name)) {
            List<Vector3> list = namesHandlers.get(name);
            if (list.contains(vector)) return;
            list.add(new Vector3(vector.x, vector.y, vector.z));
            namesHandlers.put(name, list);
        } else {
            namesHandlers.put(name, new ArrayList<>(Collections.singletonList(new Vector3(vector.x, vector.y, vector.z))));
        }
    }

    //Get the closest armorstand
    //WARNING: System in test
    public static Optional<Vector3> find(String rawNames) {
        Vector3 result;
        final List<Vector3> list = namesHandlers.getOrDefault(rawNames, new ArrayList<>());
        if (Minecraft.getMinecraft().player == null) {
            return list.stream().findAny();
        }
        final Vec3d playerPosition = Minecraft.getMinecraft().player.getPositionVector();
        try {
            result = list.stream()
                    .sorted(Comparator.comparingDouble(o -> VectorUtils.distanceTo(o, playerPosition)))
                    .findAny().orElse(null);
        } catch (IllegalArgumentException exception) {
            result = list.stream().findAny().orElse(null);
        }
        return Optional.ofNullable(result);
    }

    public static void remove(String name) {
        namesHandlers.remove(name);
    }

    public static Map<String, List<Vector3>> getNamesHandlers() {
        return namesHandlers;
    }
}
