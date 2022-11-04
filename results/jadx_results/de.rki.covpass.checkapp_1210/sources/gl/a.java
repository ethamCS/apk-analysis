package gl;

import rk.g0;
import rk.i0;
import rk.j;
import rk.k;
import rk.n;
import rk.u;
import rk.v;
import rk.y;
/* loaded from: classes3.dex */
public class a {
    public static void a(rk.b bVar, g0 g0Var) {
        if (bVar.Z() == g0Var.Z()) {
            if (bVar.w() != g0Var.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < bVar.Z(); i10++) {
                for (int i11 = 0; i11 < bVar.w(); i11++) {
                    g0Var.D(i10, i11, bVar.o(i10, i11), bVar.m(i10, i11));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void b(j jVar, u uVar) {
        uVar.f21312c = (float) jVar.f21291c;
        uVar.f21313d = (float) jVar.f21292d;
        uVar.f21314q = (float) jVar.f21293q;
        uVar.f21315x = (float) jVar.f21294x;
        uVar.f21316y = (float) jVar.f21295y;
        uVar.U3 = (float) jVar.U3;
        uVar.V3 = (float) jVar.V3;
        uVar.W3 = (float) jVar.W3;
        uVar.X3 = (float) jVar.X3;
    }

    public static void c(k kVar, rk.b bVar) {
        if (kVar.Z() == bVar.Z()) {
            if (kVar.w() != bVar.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < kVar.Z(); i10++) {
                for (int i11 = 0; i11 < kVar.w(); i11++) {
                    bVar.R(i10, i11, (float) kVar.l(i10, i11), 0.0f);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void d(k kVar, v vVar) {
        if (kVar.Z() == vVar.Z()) {
            if (kVar.w() != vVar.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < kVar.Z(); i10++) {
                for (int i11 = 0; i11 < kVar.w(); i11++) {
                    vVar.K(i10, i11, (float) kVar.l(i10, i11));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void e(k kVar, g0 g0Var) {
        if (kVar.Z() == g0Var.Z()) {
            if (kVar.w() != g0Var.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < kVar.Z(); i10++) {
                for (int i11 = 0; i11 < kVar.w(); i11++) {
                    g0Var.D(i10, i11, kVar.l(i10, i11), 0.0d);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void f(n nVar, rk.d dVar) {
        int c10 = nVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            float[] fArr = dVar.f21267c;
            int i12 = i10 + 1;
            fArr[i10] = (float) nVar.f21296c[i11];
            i10 = i12 + 1;
            fArr[i12] = 0.0f;
        }
    }

    public static void g(n nVar, y yVar) {
        int c10 = nVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            yVar.f21317c[i10] = (float) nVar.f21296c[i10];
        }
    }

    public static void h(n nVar, i0 i0Var) {
        int c10 = nVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            double[] dArr = i0Var.f21288c;
            int i12 = i10 + 1;
            dArr[i10] = nVar.f21296c[i11];
            i10 = i12 + 1;
            dArr[i12] = 0.0d;
        }
    }

    public static void i(v vVar, rk.b bVar) {
        if (vVar.Z() == bVar.Z()) {
            if (vVar.w() != bVar.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < vVar.Z(); i10++) {
                for (int i11 = 0; i11 < vVar.w(); i11++) {
                    bVar.R(i10, i11, vVar.l(i10, i11), 0.0f);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void j(v vVar, k kVar) {
        if (vVar.Z() == kVar.Z()) {
            if (vVar.w() != kVar.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < vVar.Z(); i10++) {
                for (int i11 = 0; i11 < vVar.w(); i11++) {
                    kVar.L(i10, i11, vVar.l(i10, i11));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void k(v vVar, g0 g0Var) {
        if (vVar.Z() == g0Var.Z()) {
            if (vVar.w() != g0Var.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < vVar.Z(); i10++) {
                for (int i11 = 0; i11 < vVar.w(); i11++) {
                    g0Var.D(i10, i11, vVar.l(i10, i11), 0.0d);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }

    public static void l(y yVar, rk.d dVar) {
        int c10 = yVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            float[] fArr = dVar.f21267c;
            int i12 = i10 + 1;
            fArr[i10] = yVar.f21317c[i11];
            i10 = i12 + 1;
            fArr[i12] = 0.0f;
        }
    }

    public static void m(y yVar, n nVar) {
        int c10 = yVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            nVar.f21296c[i10] = yVar.f21317c[i10];
        }
    }

    public static void n(y yVar, i0 i0Var) {
        int c10 = yVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            double[] dArr = i0Var.f21288c;
            int i12 = i10 + 1;
            dArr[i10] = yVar.f21317c[i11];
            i10 = i12 + 1;
            dArr[i12] = 0.0d;
        }
    }

    public static void o(g0 g0Var, rk.b bVar) {
        if (g0Var.Z() == bVar.Z()) {
            if (g0Var.w() != bVar.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
            for (int i10 = 0; i10 < g0Var.Z(); i10++) {
                for (int i11 = 0; i11 < g0Var.w(); i11++) {
                    bVar.R(i10, i11, (float) g0Var.o(i10, i11), (float) g0Var.m(i10, i11));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of rows do not match");
    }
}
