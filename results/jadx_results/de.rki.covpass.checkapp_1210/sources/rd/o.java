package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import yd.a;
import yd.d;
import yd.i;
import yd.j;
/* loaded from: classes.dex */
public final class o extends yd.i implements yd.r {
    private static final o U3;
    public static yd.s<o> V3 = new a();

    /* renamed from: d */
    private final yd.d f20994d;

    /* renamed from: q */
    private List<c> f20995q;

    /* renamed from: x */
    private byte f20996x;

    /* renamed from: y */
    private int f20997y;

    /* loaded from: classes.dex */
    static class a extends yd.b<o> {
        a() {
        }

        /* renamed from: m */
        public o d(yd.e eVar, yd.g gVar) {
            return new o(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<o, b> implements yd.r {

        /* renamed from: d */
        private int f20998d;

        /* renamed from: q */
        private List<c> f20999q = Collections.emptyList();

        private b() {
            y();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f20998d & 1) != 1) {
                this.f20999q = new ArrayList(this.f20999q);
                this.f20998d |= 1;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public b m(o oVar) {
            if (oVar == o.I()) {
                return this;
            }
            if (!oVar.f20995q.isEmpty()) {
                if (this.f20999q.isEmpty()) {
                    this.f20999q = oVar.f20995q;
                    this.f20998d &= -2;
                } else {
                    x();
                    this.f20999q.addAll(oVar.f20995q);
                }
            }
            o(l().b(oVar.f20994d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.o.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.o> r1 = rd.o.V3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.o r3 = (rd.o) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.o r4 = (rd.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.o.b.s(yd.e, yd.g):rd.o$b");
        }

        /* renamed from: q */
        public o b() {
            o t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public o t() {
            o oVar = new o(this);
            if ((this.f20998d & 1) == 1) {
                this.f20999q = Collections.unmodifiableList(this.f20999q);
                this.f20998d &= -2;
            }
            oVar.f20995q = this.f20999q;
            return oVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends yd.i implements yd.r {
        private static final c X3;
        public static yd.s<c> Y3 = new a();
        private EnumC0344c U3;
        private byte V3;
        private int W3;

        /* renamed from: d */
        private final yd.d f21000d;

        /* renamed from: q */
        private int f21001q;

        /* renamed from: x */
        private int f21002x;

        /* renamed from: y */
        private int f21003y;

        /* loaded from: classes.dex */
        static class a extends yd.b<c> {
            a() {
            }

            /* renamed from: m */
            public c d(yd.e eVar, yd.g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends i.b<c, b> implements yd.r {

            /* renamed from: d */
            private int f21004d;

            /* renamed from: x */
            private int f21006x;

            /* renamed from: q */
            private int f21005q = -1;

            /* renamed from: y */
            private EnumC0344c f21007y = EnumC0344c.PACKAGE;

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
            public rd.o.c.b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<rd.o$c> r1 = rd.o.c.Y3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    rd.o$c r3 = (rd.o.c) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    rd.o$c r4 = (rd.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: rd.o.c.b.s(yd.e, yd.g):rd.o$c$b");
            }

            public b B(EnumC0344c enumC0344c) {
                Objects.requireNonNull(enumC0344c);
                this.f21004d |= 4;
                this.f21007y = enumC0344c;
                return this;
            }

            public b C(int i10) {
                this.f21004d |= 1;
                this.f21005q = i10;
                return this;
            }

            public b D(int i10) {
                this.f21004d |= 2;
                this.f21006x = i10;
                return this;
            }

            /* renamed from: q */
            public c b() {
                c t10 = t();
                if (t10.c()) {
                    return t10;
                }
                throw a.AbstractC0456a.d(t10);
            }

            public c t() {
                c cVar = new c(this);
                int i10 = this.f21004d;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                cVar.f21002x = this.f21005q;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f21003y = this.f21006x;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.U3 = this.f21007y;
                cVar.f21001q = i11;
                return cVar;
            }

            /* renamed from: v */
            public b k() {
                return w().m(t());
            }

            /* renamed from: y */
            public b m(c cVar) {
                if (cVar == c.N()) {
                    return this;
                }
                if (cVar.d0()) {
                    C(cVar.W());
                }
                if (cVar.e0()) {
                    D(cVar.b0());
                }
                if (cVar.c0()) {
                    B(cVar.V());
                }
                o(l().b(cVar.f21000d));
                return this;
            }
        }

        /* renamed from: rd.o$c$c */
        /* loaded from: classes.dex */
        public enum EnumC0344c implements j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: y */
            private static j.b<EnumC0344c> f21011y = new a();

            /* renamed from: c */
            private final int f21012c;

            /* renamed from: rd.o$c$c$a */
            /* loaded from: classes.dex */
            static class a implements j.b<EnumC0344c> {
                a() {
                }

                /* renamed from: b */
                public EnumC0344c a(int i10) {
                    return EnumC0344c.b(i10);
                }
            }

            EnumC0344c(int i10, int i11) {
                this.f21012c = i11;
            }

            public static EnumC0344c b(int i10) {
                if (i10 != 0) {
                    if (i10 == 1) {
                        return PACKAGE;
                    }
                    if (i10 == 2) {
                        return LOCAL;
                    }
                    return null;
                }
                return CLASS;
            }

            @Override // yd.j.a
            public final int c() {
                return this.f21012c;
            }
        }

        static {
            c cVar = new c(true);
            X3 = cVar;
            cVar.f0();
        }

        private c(yd.e eVar, yd.g gVar) {
            this.V3 = (byte) -1;
            this.W3 = -1;
            f0();
            d.b r10 = yd.d.r();
            yd.f J = yd.f.J(r10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f21001q |= 1;
                                this.f21002x = eVar.s();
                            } else if (K == 16) {
                                this.f21001q |= 2;
                                this.f21003y = eVar.s();
                            } else if (K == 24) {
                                int n10 = eVar.n();
                                EnumC0344c b10 = EnumC0344c.b(n10);
                                if (b10 == null) {
                                    J.o0(K);
                                    J.o0(n10);
                                } else {
                                    this.f21001q |= 4;
                                    this.U3 = b10;
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
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f21000d = r10.i();
                        throw th3;
                    }
                    this.f21000d = r10.i();
                    u();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f21000d = r10.i();
                throw th4;
            }
            this.f21000d = r10.i();
            u();
        }

        private c(i.b bVar) {
            super(bVar);
            this.V3 = (byte) -1;
            this.W3 = -1;
            this.f21000d = bVar.l();
        }

        private c(boolean z10) {
            this.V3 = (byte) -1;
            this.W3 = -1;
            this.f21000d = yd.d.f26096c;
        }

        public static c N() {
            return X3;
        }

        private void f0() {
            this.f21002x = -1;
            this.f21003y = 0;
            this.U3 = EnumC0344c.PACKAGE;
        }

        public static b g0() {
            return b.w();
        }

        public static b h0(c cVar) {
            return g0().m(cVar);
        }

        public EnumC0344c V() {
            return this.U3;
        }

        public int W() {
            return this.f21002x;
        }

        public int b0() {
            return this.f21003y;
        }

        @Override // yd.r
        public final boolean c() {
            byte b10 = this.V3;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!e0()) {
                this.V3 = (byte) 0;
                return false;
            }
            this.V3 = (byte) 1;
            return true;
        }

        public boolean c0() {
            return (this.f21001q & 4) == 4;
        }

        public boolean d0() {
            return (this.f21001q & 1) == 1;
        }

        @Override // yd.q
        public int e() {
            int i10 = this.W3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f21001q & 1) == 1) {
                i11 = 0 + yd.f.o(1, this.f21002x);
            }
            if ((this.f21001q & 2) == 2) {
                i11 += yd.f.o(2, this.f21003y);
            }
            if ((this.f21001q & 4) == 4) {
                i11 += yd.f.h(3, this.U3.c());
            }
            int size = i11 + this.f21000d.size();
            this.W3 = size;
            return size;
        }

        public boolean e0() {
            return (this.f21001q & 2) == 2;
        }

        @Override // yd.i, yd.q
        public yd.s<c> i() {
            return Y3;
        }

        /* renamed from: i0 */
        public b h() {
            return g0();
        }

        @Override // yd.q
        public void j(yd.f fVar) {
            e();
            if ((this.f21001q & 1) == 1) {
                fVar.a0(1, this.f21002x);
            }
            if ((this.f21001q & 2) == 2) {
                fVar.a0(2, this.f21003y);
            }
            if ((this.f21001q & 4) == 4) {
                fVar.S(3, this.U3.c());
            }
            fVar.i0(this.f21000d);
        }

        /* renamed from: j0 */
        public b g() {
            return h0(this);
        }
    }

    static {
        o oVar = new o(true);
        U3 = oVar;
        oVar.V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o(yd.e eVar, yd.g gVar) {
        this.f20996x = (byte) -1;
        this.f20997y = -1;
        V();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!(z11 & true)) {
                                    this.f20995q = new ArrayList();
                                    z11 |= true;
                                }
                                this.f20995q.add(eVar.u(c.Y3, gVar));
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
                if (z11 & true) {
                    this.f20995q = Collections.unmodifiableList(this.f20995q);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20994d = r10.i();
                    throw th3;
                }
                this.f20994d = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f20995q = Collections.unmodifiableList(this.f20995q);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20994d = r10.i();
            throw th4;
        }
        this.f20994d = r10.i();
        u();
    }

    private o(i.b bVar) {
        super(bVar);
        this.f20996x = (byte) -1;
        this.f20997y = -1;
        this.f20994d = bVar.l();
    }

    private o(boolean z10) {
        this.f20996x = (byte) -1;
        this.f20997y = -1;
        this.f20994d = yd.d.f26096c;
    }

    public static o I() {
        return U3;
    }

    private void V() {
        this.f20995q = Collections.emptyList();
    }

    public static b W() {
        return b.w();
    }

    public static b b0(o oVar) {
        return W().m(oVar);
    }

    public c M(int i10) {
        return this.f20995q.get(i10);
    }

    public int N() {
        return this.f20995q.size();
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f20996x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < N(); i10++) {
            if (!M(i10).c()) {
                this.f20996x = (byte) 0;
                return false;
            }
        }
        this.f20996x = (byte) 1;
        return true;
    }

    /* renamed from: c0 */
    public b h() {
        return W();
    }

    /* renamed from: d0 */
    public b g() {
        return b0(this);
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f20997y;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f20995q.size(); i12++) {
            i11 += yd.f.s(1, this.f20995q.get(i12));
        }
        int size = i11 + this.f20994d.size();
        this.f20997y = size;
        return size;
    }

    @Override // yd.i, yd.q
    public yd.s<o> i() {
        return V3;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        for (int i10 = 0; i10 < this.f20995q.size(); i10++) {
            fVar.d0(1, this.f20995q.get(i10));
        }
        fVar.i0(this.f20994d);
    }
}
