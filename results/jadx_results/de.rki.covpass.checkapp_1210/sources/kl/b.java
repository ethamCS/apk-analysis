package kl;

import rk.b0;
import rk.r;
import rk.z;
/* loaded from: classes3.dex */
public class b {
    public static void a(z zVar, z zVar2, z zVar3, b0 b0Var, r rVar) {
        float[] b10 = pk.d.b(rVar, zVar.f21325y);
        int i10 = zVar.f21325y;
        int[] d10 = pk.d.d(b0Var, i10, i10);
        zVar3.e(zVar.f21322d + zVar2.f21322d, false);
        zVar3.V3 = false;
        zVar3.f21322d = 0;
        int i11 = zVar2.f21324x[0];
        for (int i12 = 1; i12 <= zVar2.U3; i12++) {
            int i13 = i12 - 1;
            int i14 = zVar2.f21324x[i12];
            zVar3.f21324x[i12] = zVar3.f21322d;
            if (i11 != i14) {
                while (i11 < i14) {
                    b(zVar, zVar2.f21323q[i11], zVar2.f21321c[i11], zVar3, i13 + 1, b10, d10);
                    i11++;
                }
                int[] iArr = zVar3.f21324x;
                int i15 = iArr[i13 + 1];
                for (int i16 = iArr[i13]; i16 < i15; i16++) {
                    zVar3.f21321c[i16] = b10[zVar3.f21323q[i16]];
                }
                i11 = i14;
            }
        }
    }

    public static void b(z zVar, int i10, float f10, z zVar2, int i11, float[] fArr, int[] iArr) {
        int[] iArr2 = zVar.f21324x;
        int i12 = iArr2[i10 + 1];
        for (int i13 = iArr2[i10]; i13 < i12; i13++) {
            int i14 = zVar.f21323q[i13];
            if (iArr[i14] < i11) {
                int i15 = zVar2.f21322d;
                if (i15 >= zVar2.f21323q.length) {
                    zVar2.e((i15 * 2) + 1, true);
                }
                iArr[i14] = i11;
                int[] iArr3 = zVar2.f21323q;
                int i16 = zVar2.f21322d;
                iArr3[i16] = i14;
                int[] iArr4 = zVar2.f21324x;
                int i17 = i16 + 1;
                zVar2.f21322d = i17;
                iArr4[i11] = i17;
                fArr[i14] = zVar.f21321c[i13] * f10;
            } else {
                fArr[i14] = fArr[i14] + (zVar.f21321c[i13] * f10);
            }
        }
    }
}
