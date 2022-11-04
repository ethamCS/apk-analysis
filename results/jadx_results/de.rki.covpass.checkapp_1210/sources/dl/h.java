package dl;

import rk.i0;
/* loaded from: classes3.dex */
public class h {
    public static void a(i0 i0Var, i0 i0Var2, i0 i0Var3) {
        if (i0Var == i0Var3 || i0Var2 == i0Var3) {
            throw new IllegalArgumentException("Neither 'a' or 'b' can be the same matrix as 'c'");
        }
        int i10 = i0Var.f21290q;
        if (i10 != i0Var2.f21289d) {
            throw new pk.c("The 'a' and 'b' matrices do not have compatible dimensions");
        }
        int i11 = i0Var.f21289d;
        if (i11 != i0Var3.f21289d || i0Var2.f21290q != i0Var3.f21290q) {
            throw new pk.c("The results matrix does not have the desired dimensions");
        }
        if (i10 == 0 || i11 == 0) {
            tk.f.a(i0Var3, 0.0d, 0.0d);
            return;
        }
        int e10 = i0Var.e();
        int e11 = i0Var2.e();
        int e12 = i0Var3.e();
        int i12 = i0Var2.f21289d * e11;
        int i13 = 0;
        for (int i14 = 0; i14 < i0Var.f21289d; i14++) {
            int i15 = i14 * e10;
            int i16 = e11 + 0;
            double[] dArr = i0Var.f21288c;
            int i17 = i15 + 1;
            double d10 = dArr[i15];
            int i18 = i17 + 1;
            double d11 = dArr[i17];
            int i19 = i13;
            int i20 = 0;
            while (i20 < i16) {
                double[] dArr2 = i0Var2.f21288c;
                int i21 = i20 + 1;
                double d12 = dArr2[i20];
                i20 = i21 + 1;
                double d13 = dArr2[i21];
                double[] dArr3 = i0Var3.f21288c;
                int i22 = i19 + 1;
                dArr3[i19] = (d10 * d12) - (d11 * d13);
                i19 = i22 + 1;
                dArr3[i22] = (d13 * d10) + (d12 * d11);
            }
            while (i20 != i12) {
                int i23 = i20 + e11;
                double[] dArr4 = i0Var.f21288c;
                int i24 = i18 + 1;
                double d14 = dArr4[i18];
                i18 = i24 + 1;
                double d15 = dArr4[i24];
                int i25 = i13;
                while (i20 < i23) {
                    double[] dArr5 = i0Var2.f21288c;
                    int i26 = i20 + 1;
                    double d16 = dArr5[i20];
                    i20 = i26 + 1;
                    double d17 = dArr5[i26];
                    double[] dArr6 = i0Var3.f21288c;
                    int i27 = i25 + 1;
                    dArr6[i25] = dArr6[i25] + ((d14 * d16) - (d15 * d17));
                    i25 = i27 + 1;
                    dArr6[i27] = dArr6[i27] + (d17 * d14) + (d16 * d15);
                }
            }
            i13 += e12;
        }
    }

    public static void b(i0 i0Var, i0 i0Var2, i0 i0Var3) {
        if (i0Var == i0Var3 || i0Var2 == i0Var3) {
            throw new IllegalArgumentException("Neither 'a' or 'b' can be the same matrix as 'c'");
        }
        if (i0Var.f21290q != i0Var2.f21289d) {
            throw new pk.c("The 'a' and 'b' matrices do not have compatible dimensions");
        }
        if (i0Var.f21289d != i0Var3.f21289d || i0Var2.f21290q != i0Var3.f21290q) {
            throw new pk.c("The results matrix does not have the desired dimensions");
        }
        int e10 = i0Var.e();
        int e11 = i0Var2.e();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i0Var.f21289d; i12++) {
            for (int i13 = 0; i13 < i0Var2.f21290q; i13++) {
                int i14 = i13 * 2;
                int i15 = i10 + e10;
                double d10 = 0.0d;
                int i16 = i10;
                double d11 = 0.0d;
                while (i16 < i15) {
                    int i17 = i15;
                    double[] dArr = i0Var.f21288c;
                    int i18 = i16 + 1;
                    double d12 = dArr[i16];
                    i16 = i18 + 1;
                    double d13 = dArr[i18];
                    double[] dArr2 = i0Var2.f21288c;
                    double d14 = dArr2[i14];
                    double d15 = dArr2[i14 + 1];
                    d10 += (d12 * d14) - (d13 * d15);
                    d11 += (d12 * d15) + (d13 * d14);
                    i14 += e11;
                    i15 = i17;
                }
                double[] dArr3 = i0Var3.f21288c;
                int i19 = i11 + 1;
                dArr3[i11] = d10;
                i11 = i19 + 1;
                dArr3[i19] = d11;
            }
            i10 += e10;
        }
    }
}
