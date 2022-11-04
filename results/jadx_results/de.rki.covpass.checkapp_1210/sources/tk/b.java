package tk;

import java.util.Arrays;
import rk.i;
import rk.k;
import rk.l;
import rk.n;
/* loaded from: classes3.dex */
public class b {
    public static void a(l lVar, double d10) {
        int c10 = lVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            double[] dArr = lVar.f21296c;
            dArr[i10] = dArr[i10] / d10;
        }
    }

    public static double b(l lVar) {
        return cl.b.a(lVar, null);
    }

    public static n c(n nVar, int i10, int i11, int i12, int i13) {
        if (i11 <= i10 || i10 < 0 || i11 > nVar.f21297d) {
            throw new pk.c("srcY1 <= srcY0 || srcY0 < 0 || srcY1 > src.numRows");
        }
        if (i13 <= i12 || i12 < 0 || i13 > nVar.f21298q) {
            throw new pk.c("srcX1 <= srcX0 || srcX0 < 0 || srcX1 > src.numCols");
        }
        int i14 = i13 - i12;
        int i15 = i11 - i10;
        n nVar2 = new n(i15, i14);
        cl.b.b(nVar, i10, i12, nVar2, 0, 0, i15, i14);
        return nVar2;
    }

    public static void d(k kVar, int i10, int i11, int i12, int i13, k kVar2, int i14, int i15) {
        if (i11 < i10 || i10 < 0 || i11 > kVar.Z()) {
            throw new pk.c("srcY1 < srcY0 || srcY0 < 0 || srcY1 > src.numRows. " + pk.d.p(kVar, kVar2));
        } else if (i13 < i12 || i12 < 0 || i13 > kVar.w()) {
            throw new pk.c("srcX1 < srcX0 || srcX0 < 0 || srcX1 > src.numCols. " + pk.d.p(kVar, kVar2));
        } else {
            int i16 = i13 - i12;
            int i17 = i11 - i10;
            int i18 = i14 + i17;
            if (i18 > kVar2.Z()) {
                throw new pk.c("dst is too small in rows. " + kVar2.Z() + " < " + i18);
            }
            int i19 = i15 + i16;
            if (i19 <= kVar2.w()) {
                if (!(kVar instanceof n) || !(kVar2 instanceof n)) {
                    cl.a.a(kVar, i10, i12, kVar2, i14, i15, i17, i16);
                    return;
                } else {
                    cl.b.b((n) kVar, i10, i12, (n) kVar2, i14, i15, i17, i16);
                    return;
                }
            }
            throw new pk.c("dst is too small in columns. " + kVar2.w() + " < " + i19);
        }
    }

    public static void e(l lVar, double d10) {
        Arrays.fill(lVar.f21296c, 0, lVar.c(), d10);
    }

    public static n f(int i10, int i11) {
        n nVar = new n(i10, i11);
        if (i10 >= i11) {
            i10 = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            nVar.F(i12, i12, 1.0d);
        }
        return nVar;
    }

    public static void g(k kVar, k kVar2, int i10, int i11) {
        d(kVar, 0, kVar.Z(), 0, kVar.w(), kVar2, i10, i11);
    }

    public static <T extends i> T h(T t10, T t11, T t12) {
        T t13 = (T) pk.d.o(t12, t10, t10.f21297d, t11.f21298q);
        pk.d.i(t10, t13);
        pk.d.i(t11, t13);
        int i10 = t11.f21298q;
        if (i10 == 1) {
            dl.i.a(t10, t11, t13);
        } else if (i10 >= pk.a.f19249e) {
            dl.b.b(t10, t11, t13);
        } else {
            dl.b.c(t10, t11, t13);
        }
        return t13;
    }

    public static <T extends i> T i(T t10, T t11, T t12) {
        T t13 = (T) pk.d.o(t12, t10, t10.f21297d, t11.f21297d);
        pk.d.i(t10, t13);
        pk.d.i(t11, t13);
        if (t11.f21297d == 1) {
            dl.i.a(t10, t11, t13);
        } else {
            dl.b.a(t10, t11, t13);
        }
        return t13;
    }

    public static void j(double d10, l lVar) {
        int c10 = lVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            double[] dArr = lVar.f21296c;
            dArr[i10] = dArr[i10] * d10;
        }
    }

    public static void k(i iVar) {
        int i10 = iVar.f21297d;
        int i11 = iVar.f21298q;
        if (i10 >= i11) {
            i10 = i11;
        }
        int i12 = 0;
        Arrays.fill(iVar.f21296c, 0, iVar.c(), 0.0d);
        int i13 = 0;
        while (i12 < i10) {
            iVar.f21296c[i13] = 1.0d;
            i12++;
            i13 += iVar.f21298q + 1;
        }
    }

    public static n l(n nVar, n nVar2) {
        n n10 = pk.d.n(nVar2, nVar.f21298q, nVar.f21297d);
        int i10 = nVar.f21297d;
        int i11 = pk.a.f19248d;
        if (i10 <= i11 || nVar.f21298q <= i11) {
            cl.c.c(nVar, n10);
        } else {
            cl.c.a(nVar, n10, pk.a.f19246b);
        }
        return n10;
    }

    public static void m(n nVar) {
        int i10 = nVar.f21298q;
        int i11 = nVar.f21297d;
        if (i10 == i11) {
            cl.c.b(nVar);
            return;
        }
        n nVar2 = new n(i10, i11);
        l(nVar, nVar2);
        nVar.g(nVar2);
    }
}
