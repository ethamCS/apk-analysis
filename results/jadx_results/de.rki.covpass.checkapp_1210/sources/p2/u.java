package p2;

import p2.g;
/* loaded from: classes.dex */
public class u {
    public static int a(int i10, int i11, int i12, int i13) {
        int i14 = i12 - i13;
        for (int i15 = i13 - 1; i15 >= 0; i15--) {
            if (((1 << (i15 + i14)) & i10) != 0) {
                i10 ^= i11 << i15;
            }
        }
        return i10;
    }

    public static boolean b(int i10) {
        return a(i10, 1335, 15, 5) == 0;
    }

    public static boolean c(int i10) {
        return a(i10, 7973, 18, 6) == 0;
    }

    public static int d(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i13 - i14;
        int i16 = 255;
        int i17 = -1;
        for (int i18 = 0; i18 < i10; i18++) {
            int i19 = i18 << i15;
            int a10 = n2.a.a((i19 ^ a(i19, i12, i13, i14)) ^ i11);
            if (a10 < i16) {
                i17 = i18;
                i16 = a10;
            } else if (a10 == i16) {
                i17 = -1;
            }
        }
        return i17;
    }

    public static int e(int i10) {
        return d(32, i10, 1335, 15, 5);
    }

    public static int f(int i10) {
        return d(64, i10, 7973, 18, 6);
    }

    public static void g(int i10, g gVar) {
        gVar.X3 = g.c.g(i10 >> 3);
        gVar.Y3 = t.b(i10 & 7);
    }
}
