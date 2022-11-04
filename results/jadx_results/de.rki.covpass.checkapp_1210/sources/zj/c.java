package zj;

import java.lang.reflect.Array;
/* loaded from: classes3.dex */
public final class c {
    public static a a(b bVar, i iVar) {
        int d10 = bVar.d();
        int i10 = 1 << d10;
        int g10 = iVar.g();
        int i11 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, g10, i10);
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, g10, i10);
        for (int i12 = 0; i12 < i10; i12++) {
            iArr2[0][i12] = bVar.f(iVar.e(i12));
        }
        for (int i13 = 1; i13 < g10; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                iArr2[i13][i14] = bVar.h(iArr2[i13 - 1][i14], i14);
            }
        }
        int i15 = 0;
        while (i15 < g10) {
            int i16 = i11;
            while (i16 < i10) {
                for (int i17 = i11; i17 <= i15; i17++) {
                    iArr[i15][i16] = bVar.a(iArr[i15][i16], bVar.h(iArr2[i17][i16], iVar.f((g10 + i17) - i15)));
                }
                i16++;
                i11 = 0;
            }
            i15++;
            i11 = 0;
        }
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, g10 * d10, (i10 + 31) >>> 5);
        for (int i18 = 0; i18 < i10; i18++) {
            int i19 = i18 >>> 5;
            int i20 = 1 << (i18 & 31);
            for (int i21 = 0; i21 < g10; i21++) {
                int i22 = iArr[i21][i18];
                for (int i23 = 0; i23 < d10; i23++) {
                    if (((i22 >>> i23) & 1) != 0) {
                        int[] iArr4 = iArr3[(((i21 + 1) * d10) - i23) - 1];
                        iArr4[i19] = iArr4[i19] ^ i20;
                    }
                }
            }
        }
        return new a(i10, iArr3);
    }
}
