package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import rd.h;
import yd.a;
import yd.d;
import yd.i;
import yd.j;
/* loaded from: classes.dex */
public final class f extends yd.i implements yd.r {
    private static final f Y3;
    public static yd.s<f> Z3 = new a();
    private h U3;
    private d V3;
    private byte W3;
    private int X3;

    /* renamed from: d */
    private final yd.d f20884d;

    /* renamed from: q */
    private int f20885q;

    /* renamed from: x */
    private c f20886x;

    /* renamed from: y */
    private List<h> f20887y;

    /* loaded from: classes.dex */
    static class a extends yd.b<f> {
        a() {
        }

        /* renamed from: m */
        public f d(yd.e eVar, yd.g gVar) {
            return new f(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<f, b> implements yd.r {

        /* renamed from: d */
        private int f20888d;

        /* renamed from: q */
        private c f20889q = c.RETURNS_CONSTANT;

        /* renamed from: x */
        private List<h> f20890x = Collections.emptyList();

        /* renamed from: y */
        private h f20891y = h.h0();
        private d U3 = d.AT_MOST_ONCE;

        private b() {
            y();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f20888d & 2) != 2) {
                this.f20890x = new ArrayList(this.f20890x);
                this.f20888d |= 2;
            }
        }

        private void y() {
        }

        public b A(h hVar) {
            if ((this.f20888d & 4) == 4 && this.f20891y != h.h0()) {
                hVar = h.v0(this.f20891y).m(hVar).t();
            }
            this.f20891y = hVar;
            this.f20888d |= 4;
            return this;
        }

        /* renamed from: B */
        public b m(f fVar) {
            if (fVar == f.b0()) {
                return this;
            }
            if (fVar.h0()) {
                D(fVar.e0());
            }
            if (!fVar.f20887y.isEmpty()) {
                if (this.f20890x.isEmpty()) {
                    this.f20890x = fVar.f20887y;
                    this.f20888d &= -3;
                } else {
                    x();
                    this.f20890x.addAll(fVar.f20887y);
                }
            }
            if (fVar.g0()) {
                A(fVar.W());
            }
            if (fVar.i0()) {
                E(fVar.f0());
            }
            o(l().b(fVar.f20884d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.f.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.f> r1 = rd.f.Z3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.f r3 = (rd.f) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                yd.q r4 = r3.b()     // Catch: java.lang.Throwable -> Lf
                rd.f r4 = (rd.f) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: rd.f.b.s(yd.e, yd.g):rd.f$b");
        }

        public b D(c cVar) {
            Objects.requireNonNull(cVar);
            this.f20888d |= 1;
            this.f20889q = cVar;
            return this;
        }

        public b E(d dVar) {
            Objects.requireNonNull(dVar);
            this.f20888d |= 8;
            this.U3 = dVar;
            return this;
        }

        /* renamed from: q */
        public f b() {
            f t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public f t() {
            f fVar = new f(this);
            int i10 = this.f20888d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            fVar.f20886x = this.f20889q;
            if ((this.f20888d & 2) == 2) {
                this.f20890x = Collections.unmodifiableList(this.f20890x);
                this.f20888d &= -3;
            }
            fVar.f20887y = this.f20890x;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            fVar.U3 = this.f20891y;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            fVar.V3 = this.U3;
            fVar.f20885q = i11;
            return fVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    /* loaded from: classes.dex */
    public enum c implements j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: y */
        private static j.b<c> f20895y = new a();

        /* renamed from: c */
        private final int f20896c;

        /* loaded from: classes.dex */
        static class a implements j.b<c> {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.b(i10);
            }
        }

        c(int i10, int i11) {
            this.f20896c = i11;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return CALLS;
                }
                if (i10 == 2) {
                    return RETURNS_NOT_NULL;
                }
                return null;
            }
            return RETURNS_CONSTANT;
        }

        @Override // yd.j.a
        public final int c() {
            return this.f20896c;
        }
    }

    /* loaded from: classes.dex */
    public enum d implements j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: y */
        private static j.b<d> f20900y = new a();

        /* renamed from: c */
        private final int f20901c;

        /* loaded from: classes.dex */
        static class a implements j.b<d> {
            a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.b(i10);
            }
        }

        d(int i10, int i11) {
            this.f20901c = i11;
        }

        public static d b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i10 == 2) {
                    return AT_LEAST_ONCE;
                }
                return null;
            }
            return AT_MOST_ONCE;
        }

        @Override // yd.j.a
        public final int c() {
            return this.f20901c;
        }
    }

    static {
        f fVar = new f(true);
        Y3 = fVar;
        fVar.j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(yd.e eVar, yd.g gVar) {
        int n10;
        this.W3 = (byte) -1;
        this.X3 = -1;
        j0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            n10 = eVar.n();
                            c b10 = c.b(n10);
                            if (b10 == null) {
                                J.o0(K);
                                J.o0(n10);
                            } else {
                                this.f20885q |= 1;
                                this.f20886x = b10;
                            }
                        } else if (K == 18) {
                            if (!(z11 & true)) {
                                this.f20887y = new ArrayList();
                                z11 |= true;
                            }
                            this.f20887y.add(eVar.u(h.f20908c4, gVar));
                        } else if (K == 26) {
                            h.b g10 = (this.f20885q & 2) == 2 ? this.U3.g() : null;
                            h hVar = (h) eVar.u(h.f20908c4, gVar);
                            this.U3 = hVar;
                            if (g10 != null) {
                                g10.m(hVar);
                                this.U3 = g10.t();
                            }
                            this.f20885q |= 2;
                        } else if (K == 32) {
                            n10 = eVar.n();
                            d b11 = d.b(n10);
                            if (b11 == null) {
                                J.o0(K);
                                J.o0(n10);
                            } else {
                                this.f20885q |= 4;
                                this.V3 = b11;
                            }
                        } else if (!y(eVar, J, gVar, K)) {
                        }
                    }
                    z10 = true;
                } catch (yd.k e10) {
                    throw e10.k(this);
                } catch (IOException e11) {
                    throw new yd.k(e11.getMessage()).k(this);
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f20887y = Collections.unmodifiableList(this.f20887y);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20884d = r10.i();
                    throw th3;
                }
                this.f20884d = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f20887y = Collections.unmodifiableList(this.f20887y);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20884d = r10.i();
            throw th4;
        }
        this.f20884d = r10.i();
        u();
    }

    private f(i.b bVar) {
        super(bVar);
        this.W3 = (byte) -1;
        this.X3 = -1;
        this.f20884d = bVar.l();
    }

    private f(boolean z10) {
        this.W3 = (byte) -1;
        this.X3 = -1;
        this.f20884d = yd.d.f26096c;
    }

    public static f b0() {
        return Y3;
    }

    private void j0() {
        this.f20886x = c.RETURNS_CONSTANT;
        this.f20887y = Collections.emptyList();
        this.U3 = h.h0();
        this.V3 = d.AT_MOST_ONCE;
    }

    public static b k0() {
        return b.w();
    }

    public static b l0(f fVar) {
        return k0().m(fVar);
    }

    public h W() {
        return this.U3;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.W3;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < d0(); i10++) {
            if (!c0(i10).c()) {
                this.W3 = (byte) 0;
                return false;
            }
        }
        if (!g0() || W().c()) {
            this.W3 = (byte) 1;
            return true;
        }
        this.W3 = (byte) 0;
        return false;
    }

    public h c0(int i10) {
        return this.f20887y.get(i10);
    }

    public int d0() {
        return this.f20887y.size();
    }

    @Override // yd.q
    public int e() {
        int i10 = this.X3;
        if (i10 != -1) {
            return i10;
        }
        int h10 = (this.f20885q & 1) == 1 ? yd.f.h(1, this.f20886x.c()) + 0 : 0;
        for (int i11 = 0; i11 < this.f20887y.size(); i11++) {
            h10 += yd.f.s(2, this.f20887y.get(i11));
        }
        if ((this.f20885q & 2) == 2) {
            h10 += yd.f.s(3, this.U3);
        }
        if ((this.f20885q & 4) == 4) {
            h10 += yd.f.h(4, this.V3.c());
        }
        int size = h10 + this.f20884d.size();
        this.X3 = size;
        return size;
    }

    public c e0() {
        return this.f20886x;
    }

    public d f0() {
        return this.V3;
    }

    public boolean g0() {
        return (this.f20885q & 2) == 2;
    }

    public boolean h0() {
        return (this.f20885q & 1) == 1;
    }

    @Override // yd.i, yd.q
    public yd.s<f> i() {
        return Z3;
    }

    public boolean i0() {
        return (this.f20885q & 4) == 4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        if ((this.f20885q & 1) == 1) {
            fVar.S(1, this.f20886x.c());
        }
        for (int i10 = 0; i10 < this.f20887y.size(); i10++) {
            fVar.d0(2, this.f20887y.get(i10));
        }
        if ((this.f20885q & 2) == 2) {
            fVar.d0(3, this.U3);
        }
        if ((this.f20885q & 4) == 4) {
            fVar.S(4, this.V3.c());
        }
        fVar.i0(this.f20884d);
    }

    /* renamed from: m0 */
    public b h() {
        return k0();
    }

    /* renamed from: n0 */
    public b g() {
        return l0(this);
    }
}
