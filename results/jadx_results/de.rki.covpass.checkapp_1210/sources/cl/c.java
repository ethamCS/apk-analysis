package cl;

import rk.i;
/* loaded from: classes3.dex */
public class c {
    public static void a(i iVar, i iVar2, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = iVar.f21297d;
            if (i11 < i12) {
                int i13 = i11 + i10;
                int min = Math.min(i12, i13) - i11;
                int i14 = iVar.f21298q * i11;
                int i15 = 0;
                while (true) {
                    int i16 = iVar.f21298q;
                    if (i15 < i16) {
                        int min2 = Math.min(i10, i16 - i15) + i14;
                        while (i14 < min2) {
                            int i17 = i11 + min;
                            int i18 = i14;
                            for (int i19 = i11; i19 < i17; i19++) {
                                iVar2.f21296c[i19] = iVar.f21296c[i18];
                                i18 += iVar.f21298q;
                            }
                            i11 += iVar2.f21298q;
                            i14++;
                        }
                        i15 += i10;
                    }
                }
                i11 = i13;
            } else {
                return;
            }
        }
    }

    public static void b(i iVar) {
        int i10 = 0;
        while (i10 < iVar.f21297d) {
            int i11 = iVar.f21298q;
            int i12 = (i10 * i11) + i10 + 1;
            int i13 = i10 + 1;
            int i14 = i13 * i11;
            int i15 = i11 * i13;
            while (true) {
                i15 += i10;
                if (i12 < i14) {
                    double[] dArr = iVar.f21296c;
                    double d10 = dArr[i12];
                    dArr[i12] = dArr[i15];
                    dArr[i15] = d10;
                    i12++;
                    i10 = iVar.f21298q;
                }
            }
            i10 = i13;
        }
    }

    public static void c(i iVar, i iVar2) {
        for (int i10 = 0; i10 < iVar2.f21297d; i10++) {
            int i11 = iVar2.f21298q;
            int i12 = i10 * i11;
            int i13 = i11 + i12;
            int i14 = i10;
            while (i12 < i13) {
                iVar2.f21296c[i12] = iVar.f21296c[i14];
                i14 += iVar.f21298q;
                i12++;
            }
        }
    }
}
