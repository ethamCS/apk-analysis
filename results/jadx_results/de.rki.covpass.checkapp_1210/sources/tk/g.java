package tk;

import rk.n;
/* loaded from: classes3.dex */
public class g {
    public static void a(n nVar, boolean z10, double[] dArr, int i10, n nVar2, boolean z11) {
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = -1.0d;
            int i12 = -1;
            for (int i13 = i11; i13 < i10; i13++) {
                double d11 = dArr[i13];
                if (d11 > d10) {
                    i12 = i13;
                    d10 = d11;
                }
            }
            if (i12 != i11) {
                if (i12 == -1) {
                    return;
                }
                double d12 = dArr[i11];
                dArr[i11] = d10;
                dArr[i12] = d12;
                if (nVar2 != null) {
                    b(nVar2, z11, i11, i12);
                }
                if (nVar != null) {
                    b(nVar, z10, i11, i12);
                }
            }
        }
    }

    private static void b(n nVar, boolean z10, int i10, int i11) {
        int i12 = 0;
        if (z10) {
            while (i12 < nVar.f21298q) {
                double d10 = nVar.d(i10, i12);
                nVar.F(i10, i12, nVar.d(i11, i12));
                nVar.F(i11, i12, d10);
                i12++;
            }
            return;
        }
        while (i12 < nVar.f21297d) {
            double d11 = nVar.d(i12, i10);
            nVar.F(i12, i10, nVar.d(i12, i11));
            nVar.F(i12, i11, d11);
            i12++;
        }
    }
}
