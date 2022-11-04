package kl;

import rk.b0;
import rk.o;
/* loaded from: classes3.dex */
public class a {
    public static void a(o oVar, o oVar2, o oVar3, b0 b0Var, rk.g gVar) {
        double[] a10 = pk.d.a(gVar, oVar.f21304y);
        int i10 = oVar.f21304y;
        int[] d10 = pk.d.d(b0Var, i10, i10);
        oVar3.e(oVar.f21301d + oVar2.f21301d, false);
        oVar3.V3 = false;
        oVar3.f21301d = 0;
        int i11 = oVar2.f21303x[0];
        for (int i12 = 1; i12 <= oVar2.U3; i12++) {
            int i13 = i12 - 1;
            int i14 = oVar2.f21303x[i12];
            oVar3.f21303x[i12] = oVar3.f21301d;
            if (i11 != i14) {
                for (int i15 = i11; i15 < i14; i15++) {
                    b(oVar, oVar2.f21302q[i15], oVar2.f21300c[i15], oVar3, i13 + 1, a10, d10);
                }
                int[] iArr = oVar3.f21303x;
                int i16 = iArr[i13 + 1];
                for (int i17 = iArr[i13]; i17 < i16; i17++) {
                    oVar3.f21300c[i17] = a10[oVar3.f21302q[i17]];
                }
                i11 = i14;
            }
        }
    }

    public static void b(o oVar, int i10, double d10, o oVar2, int i11, double[] dArr, int[] iArr) {
        int[] iArr2 = oVar.f21303x;
        int i12 = iArr2[i10 + 1];
        for (int i13 = iArr2[i10]; i13 < i12; i13++) {
            int i14 = oVar.f21302q[i13];
            if (iArr[i14] < i11) {
                int i15 = oVar2.f21301d;
                if (i15 >= oVar2.f21302q.length) {
                    oVar2.e((i15 * 2) + 1, true);
                }
                iArr[i14] = i11;
                int[] iArr3 = oVar2.f21302q;
                int i16 = oVar2.f21301d;
                iArr3[i16] = i14;
                int[] iArr4 = oVar2.f21303x;
                int i17 = i16 + 1;
                oVar2.f21301d = i17;
                iArr4[i11] = i17;
                dArr[i14] = oVar.f21300c[i13] * d10;
            } else {
                dArr[i14] = dArr[i14] + (oVar.f21300c[i13] * d10);
            }
        }
    }
}
