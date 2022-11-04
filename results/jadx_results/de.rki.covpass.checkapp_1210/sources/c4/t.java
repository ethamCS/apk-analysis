package c4;

import c4.n;
import java.io.Serializable;
/* loaded from: classes.dex */
public class t<T extends n> implements Serializable {

    /* renamed from: c */
    b f6258c;

    /* renamed from: d */
    p f6259d;

    /* renamed from: q */
    public int f6260q;

    /* renamed from: x */
    public static final t<l> f6256x = n(l.class);

    /* renamed from: y */
    public static final t<j> f6257y = n(j.class);
    public static final t<k> U3 = n(k.class);
    public static final t<g> V3 = n(g.class);
    public static final t<h> W3 = n(h.class);
    public static final t<i> X3 = n(i.class);
    public static final t<c4.a> Y3 = n(c4.a.class);
    public static final t<c4.b> Z3 = n(c4.b.class);

    /* renamed from: a4 */
    public static final t<e0> f6240a4 = i(0, e0.class);

    /* renamed from: b4 */
    public static final t<c0> f6241b4 = i(0, c0.class);

    /* renamed from: c4 */
    public static final t<d0> f6242c4 = i(0, d0.class);

    /* renamed from: d4 */
    public static final t<z> f6243d4 = i(0, z.class);

    /* renamed from: e4 */
    public static final t<a0> f6244e4 = i(0, a0.class);

    /* renamed from: f4 */
    public static final t<b0> f6245f4 = i(0, b0.class);

    /* renamed from: g4 */
    public static final t<u> f6246g4 = i(0, u.class);

    /* renamed from: h4 */
    public static final t<v> f6247h4 = i(0, v.class);

    /* renamed from: i4 */
    public static final t<f0<l>> f6248i4 = k(0, l.class);

    /* renamed from: j4 */
    public static final t<f0<j>> f6249j4 = k(0, j.class);

    /* renamed from: k4 */
    public static final t<f0<k>> f6250k4 = k(0, k.class);

    /* renamed from: l4 */
    public static final t<f0<g>> f6251l4 = k(0, g.class);

    /* renamed from: m4 */
    public static final t<f0<h>> f6252m4 = k(0, h.class);

    /* renamed from: n4 */
    public static final t<f0<i>> f6253n4 = k(0, i.class);

    /* renamed from: o4 */
    public static final t<f0<c4.a>> f6254o4 = k(0, c4.a.class);

    /* renamed from: p4 */
    public static final t<f0<c4.b>> f6255p4 = k(0, c4.b.class);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6261a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6262b;

        static {
            int[] iArr = new int[p.values().length];
            f6262b = iArr;
            try {
                iArr[p.F32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6262b[p.F64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6262b[p.U8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6262b[p.S8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6262b[p.U16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6262b[p.S16.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6262b[p.S32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6262b[p.S64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6262b[p.I8.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6262b[p.I16.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[b.values().length];
            f6261a = iArr2;
            try {
                iArr2[b.GRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6261a[b.INTERLEAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6261a[b.PLANAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        GRAY,
        PLANAR,
        INTERLEAVED
    }

    public t(b bVar, p pVar, int i10) {
        this.f6258c = bVar;
        this.f6259d = pVar;
        this.f6260q = i10;
    }

    public static Class g(b bVar, p pVar) {
        int i10 = a.f6261a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                switch (a.f6262b[pVar.ordinal()]) {
                    case 1:
                        return u.class;
                    case 2:
                        return v.class;
                    case 3:
                        return e0.class;
                    case 4:
                        return c0.class;
                    case 5:
                        return d0.class;
                    case 6:
                        return z.class;
                    case 7:
                        return a0.class;
                    case 8:
                        return b0.class;
                    case 9:
                        return x.class;
                    case 10:
                        return w.class;
                    default:
                        throw new RuntimeException("Support this image type thing");
                }
            } else if (i10 != 3) {
                throw new IncompatibleClassChangeError();
            }
        }
        switch (a.f6262b[pVar.ordinal()]) {
            case 1:
                return c4.a.class;
            case 2:
                return c4.b.class;
            case 3:
                return l.class;
            case 4:
                return j.class;
            case 5:
                return k.class;
            case 6:
                return g.class;
            case 7:
                return h.class;
            case 8:
                return i.class;
            case 9:
                return e.class;
            case 10:
                return d.class;
            default:
                throw new RuntimeException("Support this image type thing");
        }
    }

    public static <I extends r<I>> t<I> i(int i10, Class<I> cls) {
        return new t<>(b.INTERLEAVED, p.g(cls), i10);
    }

    public static <I extends q<I>> t<f0<I>> k(int i10, Class<I> cls) {
        return new t<>(b.PLANAR, p.g(cls), i10);
    }

    public static <I extends q<I>> t<I> n(Class<I> cls) {
        return new t<>(b.GRAY, p.g(cls), 1);
    }

    public T b(int i10, int i11) {
        int i12 = a.f6261a[this.f6258c.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return r.I(f(), i10, i11, this.f6260q);
            }
            if (i12 != 3) {
                throw new IllegalArgumentException("Type not yet supported");
            }
            return new f0(f(), i10, i11, this.f6260q);
        }
        return q.I(f(), i10, i11);
    }

    public p c() {
        return this.f6259d;
    }

    public b e() {
        return this.f6258c;
    }

    public Class f() {
        return g(this.f6258c, this.f6259d);
    }

    public int h() {
        return this.f6260q;
    }

    public boolean j(t tVar) {
        return this.f6258c == tVar.f6258c && this.f6259d == tVar.f6259d && this.f6260q == tVar.f6260q;
    }

    public String toString() {
        b bVar = this.f6258c;
        p pVar = this.f6259d;
        int i10 = this.f6260q;
        return "ImageType( " + bVar + " " + pVar + " " + i10 + " )";
    }
}
