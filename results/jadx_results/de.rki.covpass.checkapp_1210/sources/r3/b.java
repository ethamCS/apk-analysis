package r3;

import z3.c;
import z3.d;
import z3.f;
import z3.g;
import z3.h;
import z3.i;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public static float f20440a = 0.01f;

    /* renamed from: b */
    public static double f20441b = 0.01d;

    public static <T extends i> T a(int i10, boolean z10, int i11, double d10, int i12) {
        if (i12 <= 0) {
            i12 = g(d10, 0);
        } else if (d10 <= 0.0d) {
            d10 = h(i12, 0);
        }
        if (i10 == 2) {
            if (i11 == 32) {
                f e10 = e(d10, i12, true, z10);
                return z10 ? e10 : w2.a.c(e10, f20440a);
            } else if (i11 != 64) {
                throw new IllegalArgumentException("Bits must be 32 or 64");
            } else {
                g f10 = f(d10, i12, true, z10);
                if (!z10) {
                    throw new IllegalArgumentException("64bit int kernels supported");
                }
                return f10;
            }
        } else if (i10 != 1) {
            throw new IllegalArgumentException("DOF not supported");
        } else {
            if (i11 == 32) {
                z3.b c10 = c(d10, i12, true, z10);
                return z10 ? c10 : w2.a.a(c10, f20440a);
            } else if (i11 == 64) {
                c d11 = d(d10, i12, true, z10);
                return z10 ? d11 : w2.a.b(d11, f20441b);
            } else {
                throw new IllegalArgumentException("Bits must be 32 or 64 not " + i11);
            }
        }
    }

    public static <T extends i> T b(Class<T> cls, double d10, int i10) {
        int i11;
        boolean z10;
        int i12;
        if (z3.b.class != cls) {
            if (c.class != cls) {
                if (d.class == cls) {
                    i11 = 1;
                } else if (h.class == cls) {
                    i11 = 2;
                } else if (f.class == cls) {
                    i11 = 2;
                } else if (g.class != cls) {
                    String simpleName = cls.getSimpleName();
                    throw new RuntimeException("Unknown kernel type. " + simpleName);
                } else {
                    i11 = 2;
                }
                z10 = false;
                i12 = 32;
                return (T) a(i11, z10, i12, d10, i10);
            }
            i11 = 1;
            z10 = true;
            i12 = 64;
            return (T) a(i11, z10, i12, d10, i10);
        }
        i11 = 1;
        z10 = true;
        i12 = 32;
        return (T) a(i11, z10, i12, d10, i10);
    }

    protected static z3.b c(double d10, int i10, boolean z10, boolean z11) {
        z3.b bVar;
        int i11 = 0;
        if (z10) {
            bVar = new z3.b((i10 * 2) + 1);
            int i12 = i10;
            while (i12 >= (-i10)) {
                bVar.f26447c[i11] = (float) nk.a.a(0.0d, d10, i12);
                i12--;
                i11++;
            }
        } else {
            bVar = new z3.b(i10 * 2);
            int i13 = i10;
            while (i13 > (-i10)) {
                bVar.f26447c[i11] = (float) nk.a.a(0.0d, d10, i13 - 0.5d);
                i13--;
                i11++;
            }
        }
        if (z11) {
            w2.a.l(bVar);
        }
        return bVar;
    }

    protected static c d(double d10, int i10, boolean z10, boolean z11) {
        c cVar;
        int i11 = 0;
        if (z10) {
            cVar = new c((i10 * 2) + 1);
            int i12 = i10;
            while (i12 >= (-i10)) {
                cVar.f26448c[i11] = nk.a.a(0.0d, d10, i12);
                i12--;
                i11++;
            }
        } else {
            cVar = new c(i10 * 2);
            int i13 = i10;
            while (i13 > (-i10)) {
                cVar.f26448c[i11] = nk.a.a(0.0d, d10, i13 - 0.5d);
                i13--;
                i11++;
            }
        }
        if (z11) {
            w2.a.m(cVar);
        }
        return cVar;
    }

    public static f e(double d10, int i10, boolean z10, boolean z11) {
        z3.b c10 = c(d10, i10, z10, false);
        f f10 = w2.a.f(c10, c10);
        if (z11) {
            w2.a.n(f10);
        }
        return f10;
    }

    public static g f(double d10, int i10, boolean z10, boolean z11) {
        c d11 = d(d10, i10, z10, false);
        g g10 = w2.a.g(d11, d11);
        if (z11) {
            w2.a.o(g10);
        }
        return g10;
    }

    public static int g(double d10, int i10) {
        if (d10 > 0.0d) {
            return (int) Math.ceil(((((i10 * 0.8d) + 5.0d) * d10) - 1.0d) / 2.0d);
        }
        throw new IllegalArgumentException("Sigma must be > 0");
    }

    public static double h(double d10, int i10) {
        if (d10 > 0.0d) {
            return ((d10 * 2.0d) + 1.0d) / ((i10 * 0.8d) + 5.0d);
        }
        throw new IllegalArgumentException("Radius must be > 0");
    }
}
