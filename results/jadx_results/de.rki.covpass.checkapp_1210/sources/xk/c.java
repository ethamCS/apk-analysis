package xk;

import rk.n;
/* loaded from: classes3.dex */
public class c {
    public static double a(int i10, int i11, double[] dArr, double d10) {
        double d11 = 0.0d;
        for (int i12 = i10; i12 < i11; i12++) {
            double d12 = dArr[i12] / d10;
            dArr[i12] = d12;
            d11 += d12 * d12;
        }
        double sqrt = Math.sqrt(d11);
        return dArr[i10] < 0.0d ? -sqrt : sqrt;
    }

    public static double b(int i10, int i11, double[] dArr, int i12, double d10) {
        double d11 = 0.0d;
        for (int i13 = i10; i13 < i11; i13++) {
            int i14 = i12 + i13;
            double d12 = dArr[i14] / d10;
            dArr[i14] = d12;
            d11 += d12 * d12;
        }
        double sqrt = Math.sqrt(d11);
        return dArr[i12 + i10] < 0.0d ? -sqrt : sqrt;
    }

    public static void c(int i10, int i11, double[] dArr, double d10) {
        while (i10 < i11) {
            dArr[i10] = dArr[i10] / d10;
            i10++;
        }
    }

    public static void d(int i10, int i11, int i12, double[] dArr, double[] dArr2, int i13, double d10) {
        int i14 = (i10 * i12) + i13;
        while (i10 < i11) {
            double d11 = dArr[i10] / d10;
            dArr[i10] = d11;
            dArr2[i14] = d11;
            i10++;
            i14 += i12;
        }
    }

    public static void e(int i10, int i11, double[] dArr, double[] dArr2, int i12, double d10) {
        while (i10 < i11) {
            int i13 = i10 + i12;
            double d11 = dArr2[i13] / d10;
            dArr2[i13] = d11;
            dArr[i10] = d11;
            i10++;
        }
    }

    public static double f(double[] dArr, int i10, int i11) {
        int i12 = i11 + i10;
        double d10 = -1.0d;
        while (i10 < i12) {
            double d11 = dArr[i10];
            if (d11 < 0.0d) {
                d11 = -d11;
            }
            if (d11 > d10) {
                d10 = d11;
            }
            i10++;
        }
        return d10;
    }

    public static void g(n nVar, double[] dArr, double d10, int i10, int i11, int i12) {
        for (int i13 = i10; i13 < nVar.f21297d; i13++) {
            int i14 = (nVar.f21298q * i13) + i11;
            double d11 = 0.0d;
            int i15 = i11;
            int i16 = i14;
            while (i15 < i12) {
                d11 += nVar.f21296c[i16] * dArr[i15];
                i15++;
                i16++;
            }
            double d12 = (-d10) * d11;
            int i17 = i11;
            while (i17 < i12) {
                double[] dArr2 = nVar.f21296c;
                dArr2[i14] = dArr2[i14] + (dArr[i17] * d12);
                i17++;
                i14++;
            }
        }
    }

    public static void h(n nVar, double[] dArr, double d10, int i10, int i11, int i12, double[] dArr2) {
        int i13 = i10;
        while (true) {
            int i14 = nVar.f21298q;
            if (i13 >= i14) {
                break;
            }
            dArr2[i13] = dArr[i11] * nVar.f21296c[(i14 * i11) + i13];
            i13++;
        }
        for (int i15 = i11 + 1; i15 < i12; i15++) {
            int i16 = (nVar.f21298q * i15) + i10;
            double d11 = dArr[i15];
            int i17 = i10;
            while (i17 < nVar.f21298q) {
                dArr2[i17] = dArr2[i17] + (nVar.f21296c[i16] * d11);
                i17++;
                i16++;
            }
        }
        for (int i18 = i10; i18 < nVar.f21298q; i18++) {
            dArr2[i18] = dArr2[i18] * d10;
        }
        for (int i19 = i11; i19 < i12; i19++) {
            double d12 = dArr[i19];
            int i20 = (nVar.f21298q * i19) + i10;
            int i21 = i10;
            while (i21 < nVar.f21298q) {
                double[] dArr3 = nVar.f21296c;
                dArr3[i20] = dArr3[i20] - (dArr2[i21] * d12);
                i21++;
                i20++;
            }
        }
    }
}
