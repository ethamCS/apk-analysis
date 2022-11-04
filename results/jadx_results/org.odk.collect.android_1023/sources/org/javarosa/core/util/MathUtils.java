package org.javarosa.core.util;

import java.util.Random;
/* loaded from: classes.dex */
public class MathUtils {
    private static Random r;

    public static long modLongNotSuck(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static long divLongNotSuck(long j, long j2) {
        return (j - modLongNotSuck(j, j2)) / j2;
    }

    public static Random getRand() {
        if (r == null) {
            r = new Random();
        }
        return r;
    }
}
