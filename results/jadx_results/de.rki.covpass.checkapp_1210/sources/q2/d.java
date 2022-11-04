package q2;
/* loaded from: classes.dex */
public class d {
    public static double a(c4.q qVar, double d10, double d11) {
        int i10 = (int) ((d11 + 1.0d) - d10);
        int[] iArr = new int[i10];
        c3.b.a(qVar, d10, iArr);
        return b(iArr, i10, qVar.f6220q * qVar.f6221x) + d10;
    }

    public static int b(int[] iArr, int i10, int i11) {
        double[] dArr = new double[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                dArr[i12] = 0.0d;
            } else {
                dArr[i12] = i13 / i11;
                dArr[i12] = dArr[i12] * Math.log(dArr[i12]);
            }
        }
        int i14 = 0;
        int i15 = 0;
        double d10 = 0.0d;
        for (int i16 = 0; i16 < i10; i16++) {
            i15 += iArr[i16];
            double d11 = i15 / i11;
            if (d11 != 0.0d && d11 != 1.0d) {
                double d12 = 1.0d - d11;
                double d13 = 0.0d;
                for (int i17 = 0; i17 <= i16; i17++) {
                    d13 += dArr[i17];
                }
                double d14 = d13 / d11;
                double d15 = 0.0d;
                for (int i18 = i16 + 1; i18 < i10; i18++) {
                    d15 += dArr[i18];
                }
                double log = ((Math.log(d11) + Math.log(d12)) - d14) - (d15 / d12);
                if (log > d10) {
                    i14 = i16;
                    d10 = log;
                }
            }
        }
        return i14;
    }

    public static double c(c4.q qVar, double d10, double d11) {
        int i10 = (int) ((d11 + 1.0d) - d10);
        int[] iArr = new int[i10];
        c3.b.a(qVar, d10, iArr);
        return d(iArr, i10) + d10;
    }

    public static int d(int[] iArr, int i10) {
        double[] dArr;
        int i11;
        int i12;
        double d10;
        double[] dArr2;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= i10) {
                break;
            } else if (iArr[i14] != 0) {
                i13 = i14;
                break;
            } else {
                i14++;
            }
        }
        int i15 = i10 - 1;
        int i16 = i15;
        while (true) {
            if (i16 < i13) {
                break;
            } else if (iArr[i16] != 0) {
                i15 = i16;
                break;
            } else {
                i16--;
            }
        }
        double d11 = 1.0d / (i15 - i13);
        double[] dArr3 = new double[i10];
        long j10 = 0;
        long j11 = 0;
        for (int i17 = i13; i17 < i10; i17++) {
            j10 += iArr[i17] * i17;
            j11 += iArr[i17];
            dArr3[i17] = j10 / j11;
        }
        double[] dArr4 = new double[i10];
        int i18 = i15;
        long j12 = 0;
        long j13 = 0;
        while (i18 >= 0) {
            j12 += iArr[i18] * i18;
            long j14 = j13 + iArr[i18];
            dArr4[i18] = j12 / j14;
            i18--;
            j13 = j14;
        }
        double d12 = Double.MAX_VALUE;
        int i19 = -1;
        int i20 = i13;
        while (i20 <= i15) {
            double d13 = 0.0d;
            int i21 = i13;
            while (i21 <= i20) {
                double abs = 1.0d / ((Math.abs(i21 - dArr3[i20]) * d11) + 1.0d);
                if (abs < 1.0E-6d || abs > 0.999999d) {
                    d10 = d12;
                    dArr2 = dArr3;
                    i12 = i19;
                } else {
                    dArr2 = dArr3;
                    i12 = i19;
                    d10 = d12;
                    double d14 = 1.0d - abs;
                    d13 += iArr[i21] * (((-abs) * Math.log(abs)) - (d14 * Math.log(d14)));
                }
                i21++;
                i19 = i12;
                dArr3 = dArr2;
                d12 = d10;
            }
            double d15 = d12;
            double[] dArr5 = dArr3;
            int i22 = i19;
            int i23 = i20 + 1;
            int i24 = i23;
            while (i24 <= i15) {
                double abs2 = 1.0d / ((Math.abs(i24 - dArr4[i20]) * d11) + 1.0d);
                if (abs2 < 1.0E-6d) {
                    dArr = dArr4;
                    i11 = i13;
                } else if (abs2 <= 0.999999d) {
                    dArr = dArr4;
                    i11 = i13;
                    double d16 = 1.0d - abs2;
                    d13 += iArr[i24] * (((-abs2) * Math.log(abs2)) - (d16 * Math.log(d16)));
                } else {
                    dArr = dArr4;
                    i11 = i13;
                }
                i24++;
                i13 = i11;
                dArr4 = dArr;
            }
            double[] dArr6 = dArr4;
            int i25 = i13;
            if (d13 < d15) {
                i19 = i20;
                d15 = d13;
            } else {
                i19 = i22;
            }
            i20 = i23;
            i13 = i25;
            dArr4 = dArr6;
            dArr3 = dArr5;
            d12 = d15;
        }
        return i19;
    }

    public static double e(c4.q qVar, double d10, double d11) {
        int i10 = (int) ((d11 + 1.0d) - d10);
        int[] iArr = new int[i10];
        c3.b.a(qVar, d10, iArr);
        return f(iArr, i10) + d10;
    }

    public static int f(int[] iArr, int i10) {
        double d10;
        double d11;
        double d12 = 0.5d;
        int b10 = (int) (c3.c.b(iArr, i10) + 0.5d);
        while (true) {
            int i11 = (int) (b10 + d12);
            long j10 = 0;
            long j11 = 0;
            for (int i12 = 0; i12 <= i11; i12++) {
                j11 += iArr[i12] * i12;
                j10 += iArr[i12];
            }
            double d13 = j10 == 0 ? 0.0d : j11 / j10;
            long j12 = 0;
            long j13 = 0;
            for (int i13 = i11 + 1; i13 < i10; i13++) {
                j12 += iArr[i13] * i13;
                j13 += iArr[i13];
            }
            double d14 = j13 == 0 ? 0.0d : j12 / j13;
            double log = (d13 - d14) / (Math.log(d13) - Math.log(d14));
            if (log < (-pk.d.f19262a)) {
                d10 = 0.5d;
                d11 = log - 0.5d;
            } else {
                d10 = 0.5d;
                d11 = log + 0.5d;
            }
            int i14 = (int) d11;
            if (Math.abs(i14 - b10) <= d10) {
                return i11;
            }
            b10 = i14;
            d12 = d10;
        }
    }

    public static double g(c4.q qVar, double d10, double d11) {
        int i10 = (int) ((d11 + 1.0d) - d10);
        int[] iArr = new int[i10];
        c3.b.a(qVar, d10, iArr);
        return h(iArr, i10, qVar.f6220q * qVar.f6221x) + d10;
    }

    public static int h(int[] iArr, int i10, int i11) {
        double d10;
        int i12 = i10;
        double d11 = i12;
        double d12 = 0.0d;
        double d13 = 0.0d;
        for (int i13 = 0; i13 < i12; i13++) {
            d13 += (i13 / d11) * iArr[i13];
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        double d14 = 0.0d;
        while (i14 < i12) {
            i15 += iArr[i14];
            if (i15 == 0) {
                d10 = d11;
            } else {
                int i17 = i11 - i15;
                if (i17 == 0) {
                    break;
                }
                d10 = d11;
                double d15 = d12 + ((i14 / d11) * iArr[i14]);
                double d16 = i15;
                double d17 = i17;
                double d18 = (d15 / d16) - ((d13 - d15) / d17);
                double d19 = d16 * d17 * d18 * d18;
                if (d19 > d14) {
                    d14 = d19;
                    i16 = i14;
                }
                d12 = d15;
            }
            i14++;
            i12 = i10;
            d11 = d10;
        }
        return i16;
    }

    public static <T extends c4.q<T>> c4.l i(T t10, c4.l lVar, x3.b bVar, double d10, boolean z10, T t11, c4.q qVar) {
        if (t10 instanceof c4.a) {
            return n.a((c4.a) t10, lVar, bVar, (float) d10, z10, (c4.a) t11, (c4.a) qVar);
        }
        if (t10 instanceof c4.l) {
            return n.c((c4.l) t10, lVar, bVar, (float) d10, z10, (c4.l) t11, (c4.l) qVar);
        }
        if (t10 instanceof c4.k) {
            return n.b((c4.k) t10, lVar, bVar, (float) d10, z10, (c4.k) t11, (c4.k) qVar);
        }
        String simpleName = t10.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown image type: " + simpleName);
    }

    public static <T extends c4.q<T>> c4.l j(T t10, c4.l lVar, x3.b bVar, double d10, boolean z10, T t11, T t12, ll.d dVar) {
        if (t10 instanceof c4.a) {
            return n.d((c4.a) t10, lVar, bVar, (float) d10, z10, (c4.a) t11, (c4.a) t12, dVar);
        }
        if (t10 instanceof c4.l) {
            return n.f((c4.l) t10, lVar, bVar, (float) d10, z10, (c4.l) t11, (c4.l) t12, dVar);
        }
        if (t10 instanceof c4.k) {
            return n.e((c4.k) t10, lVar, bVar, (float) d10, z10, (c4.k) t11, (c4.k) t12, dVar);
        }
        String simpleName = t10.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown image type: " + simpleName);
    }

    public static <T extends c4.q<T>> c4.l k(T t10, c4.l lVar, double d10, boolean z10) {
        if (t10 instanceof c4.a) {
            return n.g((c4.a) t10, lVar, (float) d10, z10);
        }
        if (t10 instanceof c4.l) {
            return n.l((c4.l) t10, lVar, (int) d10, z10);
        }
        if (t10 instanceof c4.k) {
            return n.k((c4.k) t10, lVar, (int) d10, z10);
        }
        if (t10 instanceof c4.g) {
            return n.i((c4.g) t10, lVar, (int) d10, z10);
        }
        if (t10 instanceof c4.h) {
            return n.j((c4.h) t10, lVar, (int) d10, z10);
        }
        if (t10 instanceof c4.b) {
            return n.h((c4.b) t10, lVar, d10, z10);
        }
        String simpleName = t10.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown image type: " + simpleName);
    }
}
