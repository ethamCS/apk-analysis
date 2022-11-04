package rd;

import java.io.IOException;
import java.util.Objects;
import yd.a;
import yd.d;
import yd.i;
import yd.j;
/* loaded from: classes.dex */
public final class v extends yd.i implements yd.r {

    /* renamed from: a4 */
    private static final v f21097a4;

    /* renamed from: b4 */
    public static yd.s<v> f21098b4 = new a();
    private c U3;
    private int V3;
    private int W3;
    private d X3;
    private byte Y3;
    private int Z3;

    /* renamed from: d */
    private final yd.d f21099d;

    /* renamed from: q */
    private int f21100q;

    /* renamed from: x */
    private int f21101x;

    /* renamed from: y */
    private int f21102y;

    /* loaded from: classes.dex */
    static class a extends yd.b<v> {
        a() {
        }

        /* renamed from: m */
        public v d(yd.e eVar, yd.g gVar) {
            return new v(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<v, b> implements yd.r {
        private int U3;
        private int V3;

        /* renamed from: d */
        private int f21103d;

        /* renamed from: q */
        private int f21104q;

        /* renamed from: x */
        private int f21105x;

        /* renamed from: y */
        private c f21106y = c.ERROR;
        private d W3 = d.LANGUAGE_VERSION;

        private b() {
            x();
        }

        public static b w() {
            return new b();
        }

        private void x() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.v.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.v> r1 = rd.v.f21098b4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.v r3 = (rd.v) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.v r4 = (rd.v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.v.b.s(yd.e, yd.g):rd.v$b");
        }

        public b B(int i10) {
            this.f21103d |= 8;
            this.U3 = i10;
            return this;
        }

        public b C(c cVar) {
            Objects.requireNonNull(cVar);
            this.f21103d |= 4;
            this.f21106y = cVar;
            return this;
        }

        public b D(int i10) {
            this.f21103d |= 16;
            this.V3 = i10;
            return this;
        }

        public b E(int i10) {
            this.f21103d |= 1;
            this.f21104q = i10;
            return this;
        }

        public b F(int i10) {
            this.f21103d |= 2;
            this.f21105x = i10;
            return this;
        }

        public b H(d dVar) {
            Objects.requireNonNull(dVar);
            this.f21103d |= 32;
            this.W3 = dVar;
            return this;
        }

        /* renamed from: q */
        public v b() {
            v t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public v t() {
            v vVar = new v(this);
            int i10 = this.f21103d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            vVar.f21101x = this.f21104q;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f21102y = this.f21105x;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.U3 = this.f21106y;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.V3 = this.U3;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.W3 = this.V3;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.X3 = this.W3;
            vVar.f21100q = i11;
            return vVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }

        /* renamed from: y */
        public b m(v vVar) {
            if (vVar == v.b0()) {
                return this;
            }
            if (vVar.l0()) {
                E(vVar.f0());
            }
            if (vVar.m0()) {
                F(vVar.g0());
            }
            if (vVar.j0()) {
                C(vVar.d0());
            }
            if (vVar.i0()) {
                B(vVar.c0());
            }
            if (vVar.k0()) {
                D(vVar.e0());
            }
            if (vVar.n0()) {
                H(vVar.h0());
            }
            o(l().b(vVar.f21099d));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: y */
        private static j.b<c> f21110y = new a();

        /* renamed from: c */
        private final int f21111c;

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
            this.f21111c = i11;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return ERROR;
                }
                if (i10 == 2) {
                    return HIDDEN;
                }
                return null;
            }
            return WARNING;
        }

        @Override // yd.j.a
        public final int c() {
            return this.f21111c;
        }
    }

    /* loaded from: classes.dex */
    public enum d implements j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: y */
        private static j.b<d> f21115y = new a();

        /* renamed from: c */
        private final int f21116c;

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
            this.f21116c = i11;
        }

        public static d b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return COMPILER_VERSION;
                }
                if (i10 == 2) {
                    return API_VERSION;
                }
                return null;
            }
            return LANGUAGE_VERSION;
        }

        @Override // yd.j.a
        public final int c() {
            return this.f21116c;
        }
    }

    static {
        v vVar = new v(true);
        f21097a4 = vVar;
        vVar.o0();
    }

    private v(yd.e eVar, yd.g gVar) {
        int n10;
        this.Y3 = (byte) -1;
        this.Z3 = -1;
        o0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f21100q |= 1;
                                this.f21101x = eVar.s();
                            } else if (K == 16) {
                                this.f21100q |= 2;
                                this.f21102y = eVar.s();
                            } else if (K == 24) {
                                n10 = eVar.n();
                                c b10 = c.b(n10);
                                if (b10 == null) {
                                    J.o0(K);
                                    J.o0(n10);
                                } else {
                                    this.f21100q |= 4;
                                    this.U3 = b10;
                                }
                            } else if (K == 32) {
                                this.f21100q |= 8;
                                this.V3 = eVar.s();
                            } else if (K == 40) {
                                this.f21100q |= 16;
                                this.W3 = eVar.s();
                            } else if (K == 48) {
                                n10 = eVar.n();
                                d b11 = d.b(n10);
                                if (b11 == null) {
                                    J.o0(K);
                                    J.o0(n10);
                                } else {
                                    this.f21100q |= 32;
                                    this.X3 = b11;
                                }
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new yd.k(e10.getMessage()).k(this);
                    }
                } catch (yd.k e11) {
                    throw e11.k(this);
                }
            } catch (Throwable th2) {
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f21099d = r10.i();
                    throw th3;
                }
                this.f21099d = r10.i();
                u();
                throw th2;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21099d = r10.i();
            throw th4;
        }
        this.f21099d = r10.i();
        u();
    }

    private v(i.b bVar) {
        super(bVar);
        this.Y3 = (byte) -1;
        this.Z3 = -1;
        this.f21099d = bVar.l();
    }

    private v(boolean z10) {
        this.Y3 = (byte) -1;
        this.Z3 = -1;
        this.f21099d = yd.d.f26096c;
    }

    public static v b0() {
        return f21097a4;
    }

    private void o0() {
        this.f21101x = 0;
        this.f21102y = 0;
        this.U3 = c.ERROR;
        this.V3 = 0;
        this.W3 = 0;
        this.X3 = d.LANGUAGE_VERSION;
    }

    public static b p0() {
        return b.w();
    }

    public static b q0(v vVar) {
        return p0().m(vVar);
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.Y3;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.Y3 = (byte) 1;
        return true;
    }

    public int c0() {
        return this.V3;
    }

    public c d0() {
        return this.U3;
    }

    @Override // yd.q
    public int e() {
        int i10 = this.Z3;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        if ((this.f21100q & 1) == 1) {
            i11 = 0 + yd.f.o(1, this.f21101x);
        }
        if ((this.f21100q & 2) == 2) {
            i11 += yd.f.o(2, this.f21102y);
        }
        if ((this.f21100q & 4) == 4) {
            i11 += yd.f.h(3, this.U3.c());
        }
        if ((this.f21100q & 8) == 8) {
            i11 += yd.f.o(4, this.V3);
        }
        if ((this.f21100q & 16) == 16) {
            i11 += yd.f.o(5, this.W3);
        }
        if ((this.f21100q & 32) == 32) {
            i11 += yd.f.h(6, this.X3.c());
        }
        int size = i11 + this.f21099d.size();
        this.Z3 = size;
        return size;
    }

    public int e0() {
        return this.W3;
    }

    public int f0() {
        return this.f21101x;
    }

    public int g0() {
        return this.f21102y;
    }

    public d h0() {
        return this.X3;
    }

    @Override // yd.i, yd.q
    public yd.s<v> i() {
        return f21098b4;
    }

    public boolean i0() {
        return (this.f21100q & 8) == 8;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        if ((this.f21100q & 1) == 1) {
            fVar.a0(1, this.f21101x);
        }
        if ((this.f21100q & 2) == 2) {
            fVar.a0(2, this.f21102y);
        }
        if ((this.f21100q & 4) == 4) {
            fVar.S(3, this.U3.c());
        }
        if ((this.f21100q & 8) == 8) {
            fVar.a0(4, this.V3);
        }
        if ((this.f21100q & 16) == 16) {
            fVar.a0(5, this.W3);
        }
        if ((this.f21100q & 32) == 32) {
            fVar.S(6, this.X3.c());
        }
        fVar.i0(this.f21099d);
    }

    public boolean j0() {
        return (this.f21100q & 4) == 4;
    }

    public boolean k0() {
        return (this.f21100q & 16) == 16;
    }

    public boolean l0() {
        return (this.f21100q & 1) == 1;
    }

    public boolean m0() {
        return (this.f21100q & 2) == 2;
    }

    public boolean n0() {
        return (this.f21100q & 32) == 32;
    }

    /* renamed from: r0 */
    public b h() {
        return p0();
    }

    /* renamed from: s0 */
    public b g() {
        return q0(this);
    }
}
