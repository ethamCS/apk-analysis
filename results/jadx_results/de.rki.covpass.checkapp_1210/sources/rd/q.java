package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.conscrypt.PSKKeyManager;
import yd.a;
import yd.d;
import yd.i;
import yd.j;
/* loaded from: classes.dex */
public final class q extends i.d<q> {

    /* renamed from: j4 */
    private static final q f21019j4;

    /* renamed from: k4 */
    public static yd.s<q> f21020k4 = new a();
    private boolean U3;
    private int V3;
    private q W3;
    private int X3;
    private int Y3;
    private int Z3;

    /* renamed from: a4 */
    private int f21021a4;

    /* renamed from: b4 */
    private int f21022b4;

    /* renamed from: c4 */
    private q f21023c4;

    /* renamed from: d4 */
    private int f21024d4;

    /* renamed from: e4 */
    private q f21025e4;

    /* renamed from: f4 */
    private int f21026f4;

    /* renamed from: g4 */
    private int f21027g4;

    /* renamed from: h4 */
    private byte f21028h4;

    /* renamed from: i4 */
    private int f21029i4;

    /* renamed from: q */
    private final yd.d f21030q;

    /* renamed from: x */
    private int f21031x;

    /* renamed from: y */
    private List<b> f21032y;

    /* loaded from: classes.dex */
    static class a extends yd.b<q> {
        a() {
        }

        /* renamed from: m */
        public q d(yd.e eVar, yd.g gVar) {
            return new q(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends yd.i implements yd.r {
        private static final b X3;
        public static yd.s<b> Y3 = new a();
        private int U3;
        private byte V3;
        private int W3;

        /* renamed from: d */
        private final yd.d f21033d;

        /* renamed from: q */
        private int f21034q;

        /* renamed from: x */
        private c f21035x;

        /* renamed from: y */
        private q f21036y;

        /* loaded from: classes.dex */
        static class a extends yd.b<b> {
            a() {
            }

            /* renamed from: m */
            public b d(yd.e eVar, yd.g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* renamed from: rd.q$b$b */
        /* loaded from: classes.dex */
        public static final class C0345b extends i.b<b, C0345b> implements yd.r {

            /* renamed from: d */
            private int f21037d;

            /* renamed from: q */
            private c f21038q = c.INV;

            /* renamed from: x */
            private q f21039x = q.z0();

            /* renamed from: y */
            private int f21040y;

            private C0345b() {
                x();
            }

            public static C0345b w() {
                return new C0345b();
            }

            private void x() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public rd.q.b.C0345b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<rd.q$b> r1 = rd.q.b.Y3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    rd.q$b r3 = (rd.q.b) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    rd.q$b r4 = (rd.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: rd.q.b.C0345b.s(yd.e, yd.g):rd.q$b$b");
            }

            public C0345b B(q qVar) {
                if ((this.f21037d & 2) == 2 && this.f21039x != q.z0()) {
                    qVar = q.a1(this.f21039x).m(qVar).y();
                }
                this.f21039x = qVar;
                this.f21037d |= 2;
                return this;
            }

            public C0345b C(c cVar) {
                Objects.requireNonNull(cVar);
                this.f21037d |= 1;
                this.f21038q = cVar;
                return this;
            }

            public C0345b D(int i10) {
                this.f21037d |= 4;
                this.f21040y = i10;
                return this;
            }

            /* renamed from: q */
            public b b() {
                b t10 = t();
                if (t10.c()) {
                    return t10;
                }
                throw a.AbstractC0456a.d(t10);
            }

            public b t() {
                b bVar = new b(this);
                int i10 = this.f21037d;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                bVar.f21035x = this.f21038q;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f21036y = this.f21039x;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.U3 = this.f21040y;
                bVar.f21034q = i11;
                return bVar;
            }

            /* renamed from: v */
            public C0345b k() {
                return w().m(t());
            }

            /* renamed from: y */
            public C0345b m(b bVar) {
                if (bVar == b.N()) {
                    return this;
                }
                if (bVar.c0()) {
                    C(bVar.V());
                }
                if (bVar.d0()) {
                    B(bVar.W());
                }
                if (bVar.e0()) {
                    D(bVar.b0());
                }
                o(l().b(bVar.f21033d));
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum c implements j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
            private static j.b<c> U3 = new a();

            /* renamed from: c */
            private final int f21045c;

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
                this.f21045c = i11;
            }

            public static c b(int i10) {
                if (i10 != 0) {
                    if (i10 == 1) {
                        return OUT;
                    }
                    if (i10 == 2) {
                        return INV;
                    }
                    if (i10 == 3) {
                        return STAR;
                    }
                    return null;
                }
                return IN;
            }

            @Override // yd.j.a
            public final int c() {
                return this.f21045c;
            }
        }

        static {
            b bVar = new b(true);
            X3 = bVar;
            bVar.f0();
        }

        private b(yd.e eVar, yd.g gVar) {
            this.V3 = (byte) -1;
            this.W3 = -1;
            f0();
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
                                    int n10 = eVar.n();
                                    c b10 = c.b(n10);
                                    if (b10 == null) {
                                        J.o0(K);
                                        J.o0(n10);
                                    } else {
                                        this.f21034q |= 1;
                                        this.f21035x = b10;
                                    }
                                } else if (K == 18) {
                                    c g10 = (this.f21034q & 2) == 2 ? this.f21036y.g() : null;
                                    q qVar = (q) eVar.u(q.f21020k4, gVar);
                                    this.f21036y = qVar;
                                    if (g10 != null) {
                                        g10.m(qVar);
                                        this.f21036y = g10.y();
                                    }
                                    this.f21034q |= 2;
                                } else if (K == 24) {
                                    this.f21034q |= 4;
                                    this.U3 = eVar.s();
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
                        this.f21033d = r10.i();
                        throw th3;
                    }
                    this.f21033d = r10.i();
                    u();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f21033d = r10.i();
                throw th4;
            }
            this.f21033d = r10.i();
            u();
        }

        private b(i.b bVar) {
            super(bVar);
            this.V3 = (byte) -1;
            this.W3 = -1;
            this.f21033d = bVar.l();
        }

        private b(boolean z10) {
            this.V3 = (byte) -1;
            this.W3 = -1;
            this.f21033d = yd.d.f26096c;
        }

        public static b N() {
            return X3;
        }

        private void f0() {
            this.f21035x = c.INV;
            this.f21036y = q.z0();
            this.U3 = 0;
        }

        public static C0345b g0() {
            return C0345b.w();
        }

        public static C0345b h0(b bVar) {
            return g0().m(bVar);
        }

        public c V() {
            return this.f21035x;
        }

        public q W() {
            return this.f21036y;
        }

        public int b0() {
            return this.U3;
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
            if (!d0() || W().c()) {
                this.V3 = (byte) 1;
                return true;
            }
            this.V3 = (byte) 0;
            return false;
        }

        public boolean c0() {
            return (this.f21034q & 1) == 1;
        }

        public boolean d0() {
            return (this.f21034q & 2) == 2;
        }

        @Override // yd.q
        public int e() {
            int i10 = this.W3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f21034q & 1) == 1) {
                i11 = 0 + yd.f.h(1, this.f21035x.c());
            }
            if ((this.f21034q & 2) == 2) {
                i11 += yd.f.s(2, this.f21036y);
            }
            if ((this.f21034q & 4) == 4) {
                i11 += yd.f.o(3, this.U3);
            }
            int size = i11 + this.f21033d.size();
            this.W3 = size;
            return size;
        }

        public boolean e0() {
            return (this.f21034q & 4) == 4;
        }

        @Override // yd.i, yd.q
        public yd.s<b> i() {
            return Y3;
        }

        /* renamed from: i0 */
        public C0345b h() {
            return g0();
        }

        @Override // yd.q
        public void j(yd.f fVar) {
            e();
            if ((this.f21034q & 1) == 1) {
                fVar.S(1, this.f21035x.c());
            }
            if ((this.f21034q & 2) == 2) {
                fVar.d0(2, this.f21036y);
            }
            if ((this.f21034q & 4) == 4) {
                fVar.a0(3, this.U3);
            }
            fVar.i0(this.f21033d);
        }

        /* renamed from: j0 */
        public C0345b g() {
            return h0(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i.c<q, c> {
        private boolean U3;
        private int V3;
        private int X3;
        private int Y3;
        private int Z3;

        /* renamed from: a4 */
        private int f21046a4;

        /* renamed from: b4 */
        private int f21047b4;

        /* renamed from: d4 */
        private int f21049d4;

        /* renamed from: f4 */
        private int f21051f4;

        /* renamed from: g4 */
        private int f21052g4;

        /* renamed from: x */
        private int f21053x;

        /* renamed from: y */
        private List<b> f21054y = Collections.emptyList();
        private q W3 = q.z0();

        /* renamed from: c4 */
        private q f21048c4 = q.z0();

        /* renamed from: e4 */
        private q f21050e4 = q.z0();

        private c() {
            D();
        }

        public static c B() {
            return new c();
        }

        private void C() {
            if ((this.f21053x & 1) != 1) {
                this.f21054y = new ArrayList(this.f21054y);
                this.f21053x |= 1;
            }
        }

        private void D() {
        }

        /* renamed from: A */
        public c k() {
            return B().m(y());
        }

        public c E(q qVar) {
            if ((this.f21053x & 2048) == 2048 && this.f21050e4 != q.z0()) {
                qVar = q.a1(this.f21050e4).m(qVar).y();
            }
            this.f21050e4 = qVar;
            this.f21053x |= 2048;
            return this;
        }

        public c F(q qVar) {
            if ((this.f21053x & 8) == 8 && this.W3 != q.z0()) {
                qVar = q.a1(this.W3).m(qVar).y();
            }
            this.W3 = qVar;
            this.f21053x |= 8;
            return this;
        }

        /* renamed from: H */
        public c m(q qVar) {
            if (qVar == q.z0()) {
                return this;
            }
            if (!qVar.f21032y.isEmpty()) {
                if (this.f21054y.isEmpty()) {
                    this.f21054y = qVar.f21032y;
                    this.f21053x &= -2;
                } else {
                    C();
                    this.f21054y.addAll(qVar.f21032y);
                }
            }
            if (qVar.S0()) {
                P(qVar.F0());
            }
            if (qVar.P0()) {
                N(qVar.C0());
            }
            if (qVar.Q0()) {
                F(qVar.D0());
            }
            if (qVar.R0()) {
                O(qVar.E0());
            }
            if (qVar.N0()) {
                L(qVar.y0());
            }
            if (qVar.W0()) {
                S(qVar.J0());
            }
            if (qVar.X0()) {
                T(qVar.K0());
            }
            if (qVar.V0()) {
                R(qVar.I0());
            }
            if (qVar.T0()) {
                J(qVar.G0());
            }
            if (qVar.U0()) {
                Q(qVar.H0());
            }
            if (qVar.L0()) {
                E(qVar.t0());
            }
            if (qVar.M0()) {
                K(qVar.u0());
            }
            if (qVar.O0()) {
                M(qVar.B0());
            }
            v(qVar);
            o(l().b(qVar.f21030q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.q.c s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.q> r1 = rd.q.f21020k4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.q r3 = (rd.q) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.q r4 = (rd.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.q.c.s(yd.e, yd.g):rd.q$c");
        }

        public c J(q qVar) {
            if ((this.f21053x & 512) == 512 && this.f21048c4 != q.z0()) {
                qVar = q.a1(this.f21048c4).m(qVar).y();
            }
            this.f21048c4 = qVar;
            this.f21053x |= 512;
            return this;
        }

        public c K(int i10) {
            this.f21053x |= 4096;
            this.f21051f4 = i10;
            return this;
        }

        public c L(int i10) {
            this.f21053x |= 32;
            this.Y3 = i10;
            return this;
        }

        public c M(int i10) {
            this.f21053x |= 8192;
            this.f21052g4 = i10;
            return this;
        }

        public c N(int i10) {
            this.f21053x |= 4;
            this.V3 = i10;
            return this;
        }

        public c O(int i10) {
            this.f21053x |= 16;
            this.X3 = i10;
            return this;
        }

        public c P(boolean z10) {
            this.f21053x |= 2;
            this.U3 = z10;
            return this;
        }

        public c Q(int i10) {
            this.f21053x |= 1024;
            this.f21049d4 = i10;
            return this;
        }

        public c R(int i10) {
            this.f21053x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.f21047b4 = i10;
            return this;
        }

        public c S(int i10) {
            this.f21053x |= 64;
            this.Z3 = i10;
            return this;
        }

        public c T(int i10) {
            this.f21053x |= 128;
            this.f21046a4 = i10;
            return this;
        }

        /* renamed from: x */
        public q b() {
            q y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public q y() {
            q qVar = new q(this);
            int i10 = this.f21053x;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f21054y = Collections.unmodifiableList(this.f21054y);
                this.f21053x &= -2;
            }
            qVar.f21032y = this.f21054y;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            qVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            qVar.V3 = this.V3;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            qVar.W3 = this.W3;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            qVar.X3 = this.X3;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            qVar.Y3 = this.Y3;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            qVar.Z3 = this.Z3;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            qVar.f21021a4 = this.f21046a4;
            if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                i11 |= 128;
            }
            qVar.f21022b4 = this.f21047b4;
            if ((i10 & 512) == 512) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            qVar.f21023c4 = this.f21048c4;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            qVar.f21024d4 = this.f21049d4;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            qVar.f21025e4 = this.f21050e4;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            qVar.f21026f4 = this.f21051f4;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            qVar.f21027g4 = this.f21052g4;
            qVar.f21031x = i11;
            return qVar;
        }
    }

    static {
        q qVar = new q(true);
        f21019j4 = qVar;
        qVar.Y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(yd.e eVar, yd.g gVar) {
        int i10;
        int i11;
        this.f21028h4 = (byte) -1;
        this.f21029i4 = -1;
        Y0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        c cVar = null;
                        switch (K) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f21031x |= 4096;
                                this.f21027g4 = eVar.s();
                                break;
                            case 18:
                                if (!(z11 & true)) {
                                    this.f21032y = new ArrayList();
                                    z11 |= true;
                                }
                                this.f21032y.add(eVar.u(b.Y3, gVar));
                                break;
                            case 24:
                                this.f21031x |= 1;
                                this.U3 = eVar.k();
                                break;
                            case 32:
                                this.f21031x |= 2;
                                this.V3 = eVar.s();
                                break;
                            case 42:
                                i10 = 4;
                                cVar = (this.f21031x & 4) == 4 ? this.W3.g() : cVar;
                                q qVar = (q) eVar.u(f21020k4, gVar);
                                this.W3 = qVar;
                                if (cVar != null) {
                                    cVar.m(qVar);
                                    this.W3 = cVar.y();
                                }
                                i11 = this.f21031x;
                                this.f21031x = i11 | i10;
                                break;
                            case 48:
                                this.f21031x |= 16;
                                this.Y3 = eVar.s();
                                break;
                            case 56:
                                this.f21031x |= 32;
                                this.Z3 = eVar.s();
                                break;
                            case 64:
                                this.f21031x |= 8;
                                this.X3 = eVar.s();
                                break;
                            case 72:
                                this.f21031x |= 64;
                                this.f21021a4 = eVar.s();
                                break;
                            case 82:
                                int i12 = this.f21031x;
                                i10 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                cVar = (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.f21023c4.g() : cVar;
                                q qVar2 = (q) eVar.u(f21020k4, gVar);
                                this.f21023c4 = qVar2;
                                if (cVar != null) {
                                    cVar.m(qVar2);
                                    this.f21023c4 = cVar.y();
                                }
                                i11 = this.f21031x;
                                this.f21031x = i11 | i10;
                                break;
                            case 88:
                                this.f21031x |= 512;
                                this.f21024d4 = eVar.s();
                                break;
                            case 96:
                                this.f21031x |= 128;
                                this.f21022b4 = eVar.s();
                                break;
                            case 106:
                                i10 = 1024;
                                cVar = (this.f21031x & 1024) == 1024 ? this.f21025e4.g() : cVar;
                                q qVar3 = (q) eVar.u(f21020k4, gVar);
                                this.f21025e4 = qVar3;
                                if (cVar != null) {
                                    cVar.m(qVar3);
                                    this.f21025e4 = cVar.y();
                                }
                                i11 = this.f21031x;
                                this.f21031x = i11 | i10;
                                break;
                            case 112:
                                this.f21031x |= 2048;
                                this.f21026f4 = eVar.s();
                                break;
                            default:
                                if (y(eVar, J, gVar, K)) {
                                    break;
                                } else {
                                    z10 = true;
                                    break;
                                }
                        }
                    } catch (IOException e10) {
                        throw new yd.k(e10.getMessage()).k(this);
                    }
                } catch (yd.k e11) {
                    throw e11.k(this);
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f21032y = Collections.unmodifiableList(this.f21032y);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f21030q = r10.i();
                    throw th3;
                }
                this.f21030q = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f21032y = Collections.unmodifiableList(this.f21032y);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21030q = r10.i();
            throw th4;
        }
        this.f21030q = r10.i();
        u();
    }

    private q(i.c<q, ?> cVar) {
        super(cVar);
        this.f21028h4 = (byte) -1;
        this.f21029i4 = -1;
        this.f21030q = cVar.l();
    }

    private q(boolean z10) {
        this.f21028h4 = (byte) -1;
        this.f21029i4 = -1;
        this.f21030q = yd.d.f26096c;
    }

    private void Y0() {
        this.f21032y = Collections.emptyList();
        this.U3 = false;
        this.V3 = 0;
        this.W3 = z0();
        this.X3 = 0;
        this.Y3 = 0;
        this.Z3 = 0;
        this.f21021a4 = 0;
        this.f21022b4 = 0;
        this.f21023c4 = z0();
        this.f21024d4 = 0;
        this.f21025e4 = z0();
        this.f21026f4 = 0;
        this.f21027g4 = 0;
    }

    public static c Z0() {
        return c.B();
    }

    public static c a1(q qVar) {
        return Z0().m(qVar);
    }

    public static q z0() {
        return f21019j4;
    }

    /* renamed from: A0 */
    public q f() {
        return f21019j4;
    }

    public int B0() {
        return this.f21027g4;
    }

    public int C0() {
        return this.V3;
    }

    public q D0() {
        return this.W3;
    }

    public int E0() {
        return this.X3;
    }

    public boolean F0() {
        return this.U3;
    }

    public q G0() {
        return this.f21023c4;
    }

    public int H0() {
        return this.f21024d4;
    }

    public int I0() {
        return this.f21022b4;
    }

    public int J0() {
        return this.Z3;
    }

    public int K0() {
        return this.f21021a4;
    }

    public boolean L0() {
        return (this.f21031x & 1024) == 1024;
    }

    public boolean M0() {
        return (this.f21031x & 2048) == 2048;
    }

    public boolean N0() {
        return (this.f21031x & 16) == 16;
    }

    public boolean O0() {
        return (this.f21031x & 4096) == 4096;
    }

    public boolean P0() {
        return (this.f21031x & 2) == 2;
    }

    public boolean Q0() {
        return (this.f21031x & 4) == 4;
    }

    public boolean R0() {
        return (this.f21031x & 8) == 8;
    }

    public boolean S0() {
        return (this.f21031x & 1) == 1;
    }

    public boolean T0() {
        return (this.f21031x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean U0() {
        return (this.f21031x & 512) == 512;
    }

    public boolean V0() {
        return (this.f21031x & 128) == 128;
    }

    public boolean W0() {
        return (this.f21031x & 32) == 32;
    }

    public boolean X0() {
        return (this.f21031x & 64) == 64;
    }

    /* renamed from: b1 */
    public c h() {
        return Z0();
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f21028h4;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < w0(); i10++) {
            if (!v0(i10).c()) {
                this.f21028h4 = (byte) 0;
                return false;
            }
        }
        if (Q0() && !D0().c()) {
            this.f21028h4 = (byte) 0;
            return false;
        } else if (T0() && !G0().c()) {
            this.f21028h4 = (byte) 0;
            return false;
        } else if (L0() && !t0().c()) {
            this.f21028h4 = (byte) 0;
            return false;
        } else if (!B()) {
            this.f21028h4 = (byte) 0;
            return false;
        } else {
            this.f21028h4 = (byte) 1;
            return true;
        }
    }

    /* renamed from: c1 */
    public c g() {
        return a1(this);
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f21029i4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f21031x & 4096) == 4096 ? yd.f.o(1, this.f21027g4) + 0 : 0;
        for (int i11 = 0; i11 < this.f21032y.size(); i11++) {
            o10 += yd.f.s(2, this.f21032y.get(i11));
        }
        if ((this.f21031x & 1) == 1) {
            o10 += yd.f.a(3, this.U3);
        }
        if ((this.f21031x & 2) == 2) {
            o10 += yd.f.o(4, this.V3);
        }
        if ((this.f21031x & 4) == 4) {
            o10 += yd.f.s(5, this.W3);
        }
        if ((this.f21031x & 16) == 16) {
            o10 += yd.f.o(6, this.Y3);
        }
        if ((this.f21031x & 32) == 32) {
            o10 += yd.f.o(7, this.Z3);
        }
        if ((this.f21031x & 8) == 8) {
            o10 += yd.f.o(8, this.X3);
        }
        if ((this.f21031x & 64) == 64) {
            o10 += yd.f.o(9, this.f21021a4);
        }
        if ((this.f21031x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            o10 += yd.f.s(10, this.f21023c4);
        }
        if ((this.f21031x & 512) == 512) {
            o10 += yd.f.o(11, this.f21024d4);
        }
        if ((this.f21031x & 128) == 128) {
            o10 += yd.f.o(12, this.f21022b4);
        }
        if ((this.f21031x & 1024) == 1024) {
            o10 += yd.f.s(13, this.f21025e4);
        }
        if ((this.f21031x & 2048) == 2048) {
            o10 += yd.f.o(14, this.f21026f4);
        }
        int G = o10 + G() + this.f21030q.size();
        this.f21029i4 = G;
        return G;
    }

    @Override // yd.i, yd.q
    public yd.s<q> i() {
        return f21020k4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f21031x & 4096) == 4096) {
            fVar.a0(1, this.f21027g4);
        }
        for (int i10 = 0; i10 < this.f21032y.size(); i10++) {
            fVar.d0(2, this.f21032y.get(i10));
        }
        if ((this.f21031x & 1) == 1) {
            fVar.L(3, this.U3);
        }
        if ((this.f21031x & 2) == 2) {
            fVar.a0(4, this.V3);
        }
        if ((this.f21031x & 4) == 4) {
            fVar.d0(5, this.W3);
        }
        if ((this.f21031x & 16) == 16) {
            fVar.a0(6, this.Y3);
        }
        if ((this.f21031x & 32) == 32) {
            fVar.a0(7, this.Z3);
        }
        if ((this.f21031x & 8) == 8) {
            fVar.a0(8, this.X3);
        }
        if ((this.f21031x & 64) == 64) {
            fVar.a0(9, this.f21021a4);
        }
        if ((this.f21031x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            fVar.d0(10, this.f21023c4);
        }
        if ((this.f21031x & 512) == 512) {
            fVar.a0(11, this.f21024d4);
        }
        if ((this.f21031x & 128) == 128) {
            fVar.a0(12, this.f21022b4);
        }
        if ((this.f21031x & 1024) == 1024) {
            fVar.d0(13, this.f21025e4);
        }
        if ((this.f21031x & 2048) == 2048) {
            fVar.a0(14, this.f21026f4);
        }
        W.a(200, fVar);
        fVar.i0(this.f21030q);
    }

    public q t0() {
        return this.f21025e4;
    }

    public int u0() {
        return this.f21026f4;
    }

    public b v0(int i10) {
        return this.f21032y.get(i10);
    }

    public int w0() {
        return this.f21032y.size();
    }

    public List<b> x0() {
        return this.f21032y;
    }

    public int y0() {
        return this.Y3;
    }
}
