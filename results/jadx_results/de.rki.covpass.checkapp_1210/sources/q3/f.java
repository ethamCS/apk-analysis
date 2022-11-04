package q3;

import c4.l;
import c4.q;
import c4.t;
import h2.f;
import h2.h;
import h2.i;
import h2.k;
import q2.g;
import q2.j;
import q2.m;
import q2.p;
import q2.r;
import q2.s;
import q2.v;
import q2.w;
import q3.a;
import r2.a0;
import r2.b0;
import r2.c0;
import r2.d0;
/* loaded from: classes.dex */
public class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19618a;

        static {
            int[] iArr = new int[g.values().length];
            f19618a = iArr;
            try {
                iArr[g.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19618a[g.GLOBAL_OTSU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19618a[g.GLOBAL_ENTROPY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19618a[g.GLOBAL_LI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19618a[g.GLOBAL_HUANG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19618a[g.LOCAL_GAUSSIAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19618a[g.LOCAL_NIBLACK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19618a[g.LOCAL_SAVOLA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19618a[g.LOCAL_WOLF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19618a[g.LOCAL_NICK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19618a[g.LOCAL_MEAN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19618a[g.LOCAL_OTSU.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19618a[g.BLOCK_MIN_MAX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19618a[g.BLOCK_MEAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19618a[g.BLOCK_OTSU.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static <T extends q<T>> h<T> a(x3.b bVar, double d10, boolean z10, boolean z11, Class<T> cls) {
        a.d dVar = q3.a.f19610i;
        if (dVar != null) {
            return dVar.a(bVar, d10, z10, z11, cls);
        }
        g.a b0Var = cls == l.class ? new b0(d10, z10) : new a0((float) d10, z10);
        return j3.a.f13972c ? new m(b0Var, bVar, z11, cls) : new q2.g(b0Var, bVar, z11, cls);
    }

    public static <T extends q<T>> h<T> b(x3.b bVar, double d10, boolean z10, boolean z11, double d11, Class<T> cls) {
        a.e eVar = q3.a.f19609h;
        if (eVar != null) {
            return eVar.a(bVar, d10, z10, d11, z11, cls);
        }
        g.a d0Var = cls == l.class ? new d0(d11, d10, z10) : new c0((float) d11, (float) d10, z10);
        return j3.a.f13972c ? new m(d0Var, bVar, z11, cls) : new q2.g(d0Var, bVar, z11, cls);
    }

    public static <T extends q<T>> h<T> c(x3.b bVar, double d10, boolean z10, boolean z11, boolean z12, double d11, Class<T> cls) {
        a.f fVar = q3.a.f19611j;
        if (fVar != null) {
            return fVar.a(z12, bVar, d11, d10, z10, z11, cls);
        }
        j jVar = new j(z12, d11, d10, z10);
        return new i(j3.a.f13972c ? new m(jVar, bVar, z11, l.class) : new q2.g(jVar, bVar, z11, l.class), cls);
    }

    public static <T extends q<T>> h<T> d(int i10, int i11, double d10, boolean z10, Class<T> cls) {
        a.AbstractC0316a abstractC0316a = q3.a.f19602a;
        return abstractC0316a != null ? abstractC0316a.a(i10, i11, z10, cls) : new f.a(i10, i11, d10, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> e(double d10, boolean z10, Class<T> cls) {
        a.b bVar = q3.a.f19603b;
        return bVar != null ? bVar.a(d10, z10, cls) : new h2.g(d10, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> f(double d10, double d11, double d12, boolean z10, Class<T> cls) {
        return new f.b(d10, d11, d12, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> g(double d10, double d11, double d12, boolean z10, Class<T> cls) {
        return new f.c(d10, d11, d12, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> h(double d10, double d11, double d12, boolean z10, Class<T> cls) {
        a.c cVar = q3.a.f19604c;
        return cVar != null ? cVar.a(d10, d11, z10, cls) : new f.d(d10, d11, d12, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> i(x3.b bVar, double d10, boolean z10, Class<T> cls) {
        a.g gVar = q3.a.f19605d;
        return gVar != null ? gVar.a(bVar, d10, z10, cls) : new h2.j(bVar, d10, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> j(x3.b bVar, double d10, boolean z10, Class<T> cls) {
        a.h hVar = q3.a.f19607f;
        return hVar != null ? hVar.a(bVar, d10, z10, cls) : new k(bVar, d10, z10, t.n(cls));
    }

    public static <T extends q<T>> h<T> k(x3.b bVar, boolean z10, float f10, Class<T> cls) {
        return l(s.e.NIBLACK, bVar, z10, f10, cls);
    }

    protected static <T extends q<T>> h<T> l(s.e eVar, x3.b bVar, boolean z10, float f10, Class<T> cls) {
        if (q3.a.f19606e == null) {
            return new i(j3.a.f13972c ? new v(bVar, f10, z10, eVar) : new s(bVar, f10, z10, eVar), cls);
        }
        throw new RuntimeException("Update how overrides are handled for Niblack family");
    }

    public static <T extends q<T>> h<T> m(x3.b bVar, boolean z10, float f10, Class<T> cls) {
        return new i(new w(bVar, f10, z10), cls);
    }

    public static <T extends q<T>> h<T> n(x3.b bVar, double d10, boolean z10, boolean z11, double d11, Class<T> cls) {
        a.i iVar = q3.a.f19608g;
        if (iVar != null) {
            return iVar.a(z11, bVar, d11, d10, z10, cls);
        }
        return new i(j3.a.f13972c ? new r(z11, bVar, d11, d10, z10) : new p(z11, bVar, d11, d10, z10), cls);
    }

    public static <T extends q<T>> h<T> o(x3.b bVar, boolean z10, float f10, Class<T> cls) {
        return l(s.e.SAUVOLA, bVar, z10, f10, cls);
    }

    public static <T extends q<T>> h<T> p(x3.b bVar, boolean z10, float f10, Class<T> cls) {
        return l(s.e.WOLF_JOLION, bVar, z10, f10, cls);
    }

    public static <T extends q<T>> h<T> q(b bVar, Class<T> cls) {
        switch (a.f19618a[bVar.f19612c.ordinal()]) {
            case 1:
                return e(bVar.f19613d, bVar.f19615x, cls);
            case 2:
                return h(bVar.W3, bVar.X3, bVar.f19614q, bVar.f19615x, cls);
            case 3:
                return d(bVar.W3, bVar.X3, bVar.f19614q, bVar.f19615x, cls);
            case 4:
                return g(bVar.W3, bVar.X3, bVar.f19614q, bVar.f19615x, cls);
            case 5:
                return f(bVar.W3, bVar.X3, bVar.f19614q, bVar.f19615x, cls);
            case 6:
                return i(bVar.f19616y, bVar.f19614q, bVar.f19615x, cls);
            case 7:
                return k(bVar.f19616y, bVar.f19615x, bVar.U3, cls);
            case 8:
                return o(bVar.f19616y, bVar.f19615x, bVar.U3, cls);
            case 9:
                return p(bVar.f19616y, bVar.f19615x, bVar.U3, cls);
            case 10:
                return m(bVar.f19616y, bVar.f19615x, bVar.V3, cls);
            case 11:
                return j(bVar.f19616y, bVar.f19614q, bVar.f19615x, cls);
            case 12:
                d dVar = (d) bVar;
                return n(bVar.f19616y, bVar.f19614q, bVar.f19615x, dVar.f19617a4, dVar.Z3, cls);
            case 13:
                c cVar = (c) bVar;
                return b(cVar.f19616y, cVar.f19614q, cVar.f19615x, cVar.Y3, cVar.Z3, cls);
            case 14:
                return a(bVar.f19616y, bVar.f19614q, bVar.f19615x, bVar.Y3, cls);
            case 15:
                d dVar2 = (d) bVar;
                return c(dVar2.f19616y, dVar2.f19614q, dVar2.f19615x, dVar2.Y3, dVar2.f19617a4, dVar2.Z3, cls);
            default:
                throw new IncompatibleClassChangeError();
        }
    }
}
