package dl;
/* loaded from: classes3.dex */
public class b {
    public static void a(rk.i iVar, rk.i iVar2, rk.i iVar3) {
        pk.d.h((iVar == iVar3 || iVar2 == iVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(iVar.f21298q, iVar2.f21298q, "The 'A' and 'B' matrices do not have compatible dimensions");
        iVar3.U(iVar.f21297d, iVar2.f21297d);
        for (int i10 = 0; i10 < iVar.f21297d; i10++) {
            int i11 = iVar2.f21297d * i10;
            int i12 = iVar2.f21298q;
            int i13 = i10 * i12;
            int i14 = i12 + i13;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iVar2.f21297d) {
                double d10 = 0.0d;
                int i17 = i13;
                while (i17 < i14) {
                    d10 += iVar.f21296c[i17] * iVar2.f21296c[i16];
                    i17++;
                    i16++;
                }
                iVar3.f(i11, d10);
                i15++;
                i11++;
            }
        }
    }

    public static void b(rk.i iVar, rk.i iVar2, rk.i iVar3) {
        int i10 = 0;
        pk.d.h((iVar == iVar3 || iVar2 == iVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(iVar.f21298q, iVar2.f21297d, "The 'A' and 'B' matrices do not have compatible dimensions");
        iVar3.U(iVar.f21297d, iVar2.f21298q);
        if (iVar.f21298q == 0 || iVar.f21297d == 0) {
            tk.b.e(iVar3, 0.0d);
            return;
        }
        int i11 = iVar2.f21297d * iVar2.f21298q;
        int i12 = 0;
        while (i12 < iVar.f21297d) {
            int i13 = iVar3.f21298q * i12;
            int i14 = iVar.f21298q * i12;
            int i15 = iVar2.f21298q + i10;
            int i16 = i14 + 1;
            double d10 = iVar.f21296c[i14];
            int i17 = i10;
            int i18 = i13;
            while (i17 < i15) {
                iVar3.f(i18, d10 * iVar2.f21296c[i17]);
                i18++;
                i17++;
                i11 = i11;
            }
            while (i17 != i11) {
                int i19 = iVar2.f21298q + i17;
                int i20 = i16 + 1;
                double d11 = iVar.f21296c[i16];
                int i21 = i13;
                while (i17 < i19) {
                    double[] dArr = iVar3.f21296c;
                    dArr[i21] = dArr[i21] + (iVar2.f21296c[i17] * d11);
                    i21++;
                    i17++;
                }
                i16 = i20;
            }
            i12++;
            i10 = 0;
        }
    }

    public static void c(rk.i iVar, rk.i iVar2, rk.i iVar3) {
        pk.d.h((iVar == iVar3 || iVar2 == iVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(iVar.f21298q, iVar2.f21297d, "The 'A' and 'B' matrices do not have compatible dimensions");
        iVar3.U(iVar.f21297d, iVar2.f21298q);
        for (int i10 = 0; i10 < iVar.f21297d; i10++) {
            int i11 = iVar2.f21298q * i10;
            int i12 = iVar.f21298q * i10;
            int i13 = 0;
            while (i13 < iVar2.f21298q) {
                double d10 = 0.0d;
                int i14 = iVar2.f21297d + i12;
                int i15 = i13;
                for (int i16 = i12; i16 < i14; i16++) {
                    d10 += iVar.f21296c[i16] * iVar2.f21296c[i15];
                    i15 += iVar2.f21298q;
                }
                iVar3.f(i11, d10);
                i13++;
                i11++;
            }
        }
    }
}
