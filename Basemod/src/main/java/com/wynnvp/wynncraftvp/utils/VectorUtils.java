package com.wynnvp.wynncraftvp.utils;

import com.wynnvp.wynncraftvp.sound.Vector3;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class VectorUtils {

    public static double distanceTo(Vector3 v1, Vector3 v2) {
        double d0 = v1.x - v2.x;
        double d1 = v1.y - v2.y;
        double d2 = v1.z - v2.z;
        return MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
    }

    public static double distanceTo(Vector3 v1, Vec3d v2) {
        Vector3 vector3 = new Vector3((float) v2.x, (float) v2.y, (float) v2.z);
        return distanceTo(v1, v2);
    }

}
