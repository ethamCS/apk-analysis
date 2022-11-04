package w2;

import z3.b;
import z3.c;
import z3.d;
import z3.f;
import z3.g;
import z3.h;
/* loaded from: classes.dex */
public class a {
    public static d a(b bVar, float f10) {
        d dVar = new d(bVar.f26453a, bVar.f26454b);
        e(bVar.f26447c, dVar.f26449c, bVar.f26453a, f10);
        return dVar;
    }

    public static d b(c cVar, double d10) {
        d dVar = new d(cVar.f26453a, cVar.f26454b);
        d(cVar.f26448c, dVar.f26449c, cVar.f26453a, d10);
        return dVar;
    }

    public static h c(f fVar, float f10) {
        h hVar = new h(fVar.f26453a);
        float[] fArr = fVar.f26450c;
        int[] iArr = hVar.f26452c;
        int i10 = fVar.f26453a;
        e(fArr, iArr, i10 * i10, f10);
        return hVar;
    }

    public static void d(double[] dArr, int[] iArr, int i10, double d10) {
        double j10 = j(dArr, i10, h(dArr, i10) * d10);
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = (int) (dArr[i11] / j10);
        }
    }

    public static void e(float[] fArr, int[] iArr, int i10, float f10) {
        float k10 = k(fArr, i10, i(fArr, i10) * f10);
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = (int) (fArr[i11] / k10);
        }
    }

    public static f f(b bVar, b bVar2) {
        int i10 = bVar.f26453a;
        int i11 = bVar2.f26453a;
        if (i10 == i11) {
            if (bVar.f26454b != i11 / 2) {
                throw new IllegalArgumentException("Only kernels with the offset in the middle supported");
            }
            f fVar = new f(i10);
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = 0;
                while (i14 < i10) {
                    fVar.f26450c[i12] = bVar.f26447c[i13] * bVar2.f26447c[i14];
                    i14++;
                    i12++;
                }
            }
            return fVar;
        }
        throw new IllegalArgumentException("Only kernels with the same width supported");
    }

    public static g g(c cVar, c cVar2) {
        int i10 = cVar.f26453a;
        int i11 = cVar2.f26453a;
        if (i10 == i11) {
            if (cVar.f26454b != i11 / 2) {
                throw new IllegalArgumentException("Only kernels with the offset in the middle supported");
            }
            g gVar = new g(i10);
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = 0;
                while (i14 < i10) {
                    gVar.f26451c[i12] = cVar.f26448c[i13] * cVar2.f26448c[i14];
                    i14++;
                    i12++;
                }
            }
            return gVar;
        }
        throw new IllegalArgumentException("Only kernels with the same width supported");
    }

    public static double h(double[] dArr, int i10) {
        double d10 = 0.0d;
        for (int i11 = 0; i11 < i10; i11++) {
            double abs = Math.abs(dArr[i11]);
            if (abs > d10) {
                d10 = abs;
            }
        }
        return d10;
    }

    public static float i(float[] fArr, int i10) {
        float f10 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float abs = Math.abs(fArr[i11]);
            if (abs > f10) {
                f10 = abs;
            }
        }
        return f10;
    }

    public static double j(double[] dArr, int i10, double d10) {
        double d11 = 3.4028234663852886E38d;
        for (int i11 = 0; i11 < i10; i11++) {
            double abs = Math.abs(dArr[i11]);
            if (abs < d11 && abs >= d10) {
                d11 = abs;
            }
        }
        return d11;
    }

    public static float k(float[] fArr, int i10, float f10) {
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < i10; i11++) {
            float abs = Math.abs(fArr[i11]);
            if (abs < f11 && abs >= f10) {
                f11 = abs;
            }
        }
        return f11;
    }

    public static void l(b bVar) {
        float[] fArr = bVar.f26447c;
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = fArr[i10] / f10;
        }
    }

    public static void m(c cVar) {
        double[] dArr = cVar.f26448c;
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr[i10] = dArr[i10] / d10;
        }
    }

    public static void n(f fVar) {
        float[] fArr = fVar.f26450c;
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = fArr[i10] / f10;
        }
    }

    public static void o(g gVar) {
        double[] dArr = gVar.f26451c;
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr[i10] = dArr[i10] / d10;
        }
    }
}
