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
public final class b extends yd.i implements yd.r {
    private static final b W3;
    public static yd.s<b> X3 = new a();
    private byte U3;
    private int V3;

    /* renamed from: d */
    private final yd.d f20779d;

    /* renamed from: q */
    private int f20780q;

    /* renamed from: x */
    private int f20781x;

    /* renamed from: y */
    private List<C0339b> f20782y;

    /* loaded from: classes.dex */
    static class a extends yd.b<b> {
        a() {
        }

        /* renamed from: m */
        public b d(yd.e eVar, yd.g gVar) {
            return new b(eVar, gVar);
        }
    }

    /* renamed from: rd.b$b */
    /* loaded from: classes.dex */
    public static final class C0339b extends yd.i implements yd.r {
        private static final C0339b W3;
        public static yd.s<C0339b> X3 = new a();
        private byte U3;
        private int V3;

        /* renamed from: d */
        private final yd.d f20783d;

        /* renamed from: q */
        private int f20784q;

        /* renamed from: x */
        private int f20785x;

        /* renamed from: y */
        private c f20786y;

        /* renamed from: rd.b$b$a */
        /* loaded from: classes.dex */
        static class a extends yd.b<C0339b> {
            a() {
            }

            /* renamed from: m */
            public C0339b d(yd.e eVar, yd.g gVar) {
                return new C0339b(eVar, gVar);
            }
        }

        /* renamed from: rd.b$b$b */
        /* loaded from: classes.dex */
        public static final class C0340b extends i.b<C0339b, C0340b> implements yd.r {

            /* renamed from: d */
            private int f20787d;

            /* renamed from: q */
            private int f20788q;

            /* renamed from: x */
            private c f20789x = c.n0();

            private C0340b() {
                x();
            }

            public static C0340b w() {
                return new C0340b();
            }

            private void x() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public rd.b.C0339b.C0340b s(yd.e r3, yd.g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    yd.s<rd.b$b> r1 = rd.b.C0339b.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                    rd.b$b r3 = (rd.b.C0339b) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                    rd.b$b r4 = (rd.b.C0339b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: rd.b.C0339b.C0340b.s(yd.e, yd.g):rd.b$b$b");
            }

            public C0340b B(c cVar) {
                if ((this.f20787d & 2) == 2 && this.f20789x != c.n0()) {
                    cVar = c.H0(this.f20789x).m(cVar).t();
                }
                this.f20789x = cVar;
                this.f20787d |= 2;
                return this;
            }

            public C0340b C(int i10) {
                this.f20787d |= 1;
                this.f20788q = i10;
                return this;
            }

            /* renamed from: q */
            public C0339b b() {
                C0339b t10 = t();
                if (t10.c()) {
                    return t10;
                }
                throw a.AbstractC0456a.d(t10);
            }

            public C0339b t() {
                C0339b c0339b = new C0339b(this);
                int i10 = this.f20787d;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                c0339b.f20785x = this.f20788q;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0339b.f20786y = this.f20789x;
                c0339b.f20784q = i11;
                return c0339b;
            }

            /* renamed from: v */
            public C0340b k() {
                return w().m(t());
            }

            /* renamed from: y */
            public C0340b m(C0339b c0339b) {
                if (c0339b == C0339b.M()) {
                    return this;
                }
                if (c0339b.W()) {
                    C(c0339b.N());
                }
                if (c0339b.b0()) {
                    B(c0339b.V());
                }
                o(l().b(c0339b.f20783d));
                return this;
            }
        }

        /* renamed from: rd.b$b$c */
        /* loaded from: classes.dex */
        public static final class c extends yd.i implements yd.r {

            /* renamed from: f4 */
            private static final c f20790f4;

            /* renamed from: g4 */
            public static yd.s<c> f20791g4 = new a();
            private float U3;
            private double V3;
            private int W3;
            private int X3;
            private int Y3;
            private b Z3;

            /* renamed from: a4 */
            private List<c> f20792a4;

            /* renamed from: b4 */
            private int f20793b4;

            /* renamed from: c4 */
            private int f20794c4;

            /* renamed from: d */
            private final yd.d f20795d;

            /* renamed from: d4 */
            private byte f20796d4;

            /* renamed from: e4 */
            private int f20797e4;

            /* renamed from: q */
            private int f20798q;

            /* renamed from: x */
            private EnumC0342c f20799x;

            /* renamed from: y */
            private long f20800y;

            /* renamed from: rd.b$b$c$a */
            /* loaded from: classes.dex */
            static class a extends yd.b<c> {
                a() {
                }

                /* renamed from: m */
                public c d(yd.e eVar, yd.g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: rd.b$b$c$b */
            /* loaded from: classes.dex */
            public static final class C0341b extends i.b<c, C0341b> implements yd.r {
                private double U3;
                private int V3;
                private int W3;
                private int X3;

                /* renamed from: a4 */
                private int f20801a4;

                /* renamed from: b4 */
                private int f20802b4;

                /* renamed from: d */
                private int f20803d;

                /* renamed from: x */
                private long f20805x;

                /* renamed from: y */
                private float f20806y;

                /* renamed from: q */
                private EnumC0342c f20804q = EnumC0342c.BYTE;
                private b Y3 = b.b0();
                private List<c> Z3 = Collections.emptyList();

                private C0341b() {
                    y();
                }

                public static C0341b w() {
                    return new C0341b();
                }

                private void x() {
                    if ((this.f20803d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                        this.Z3 = new ArrayList(this.Z3);
                        this.f20803d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }

                private void y() {
                }

                public C0341b A(b bVar) {
                    if ((this.f20803d & 128) == 128 && this.Y3 != b.b0()) {
                        bVar = b.g0(this.Y3).m(bVar).t();
                    }
                    this.Y3 = bVar;
                    this.f20803d |= 128;
                    return this;
                }

                /* renamed from: B */
                public C0341b m(c cVar) {
                    if (cVar == c.n0()) {
                        return this;
                    }
                    if (cVar.E0()) {
                        M(cVar.u0());
                    }
                    if (cVar.C0()) {
                        K(cVar.s0());
                    }
                    if (cVar.B0()) {
                        J(cVar.r0());
                    }
                    if (cVar.y0()) {
                        F(cVar.o0());
                    }
                    if (cVar.D0()) {
                        L(cVar.t0());
                    }
                    if (cVar.x0()) {
                        E(cVar.m0());
                    }
                    if (cVar.z0()) {
                        H(cVar.p0());
                    }
                    if (cVar.v0()) {
                        A(cVar.h0());
                    }
                    if (!cVar.f20792a4.isEmpty()) {
                        if (this.Z3.isEmpty()) {
                            this.Z3 = cVar.f20792a4;
                            this.f20803d &= -257;
                        } else {
                            x();
                            this.Z3.addAll(cVar.f20792a4);
                        }
                    }
                    if (cVar.w0()) {
                        D(cVar.i0());
                    }
                    if (cVar.A0()) {
                        I(cVar.q0());
                    }
                    o(l().b(cVar.f20795d));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* renamed from: C */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public rd.b.C0339b.c.C0341b s(yd.e r3, yd.g r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        yd.s<rd.b$b$c> r1 = rd.b.C0339b.c.f20791g4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                        rd.b$b$c r3 = (rd.b.C0339b.c) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                        rd.b$b$c r4 = (rd.b.C0339b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: rd.b.C0339b.c.C0341b.s(yd.e, yd.g):rd.b$b$c$b");
                }

                public C0341b D(int i10) {
                    this.f20803d |= 512;
                    this.f20801a4 = i10;
                    return this;
                }

                public C0341b E(int i10) {
                    this.f20803d |= 32;
                    this.W3 = i10;
                    return this;
                }

                public C0341b F(double d10) {
                    this.f20803d |= 8;
                    this.U3 = d10;
                    return this;
                }

                public C0341b H(int i10) {
                    this.f20803d |= 64;
                    this.X3 = i10;
                    return this;
                }

                public C0341b I(int i10) {
                    this.f20803d |= 1024;
                    this.f20802b4 = i10;
                    return this;
                }

                public C0341b J(float f10) {
                    this.f20803d |= 4;
                    this.f20806y = f10;
                    return this;
                }

                public C0341b K(long j10) {
                    this.f20803d |= 2;
                    this.f20805x = j10;
                    return this;
                }

                public C0341b L(int i10) {
                    this.f20803d |= 16;
                    this.V3 = i10;
                    return this;
                }

                public C0341b M(EnumC0342c enumC0342c) {
                    Objects.requireNonNull(enumC0342c);
                    this.f20803d |= 1;
                    this.f20804q = enumC0342c;
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
                    int i10 = this.f20803d;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    cVar.f20799x = this.f20804q;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f20800y = this.f20805x;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.U3 = this.f20806y;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.V3 = this.U3;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.W3 = this.V3;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.X3 = this.W3;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.Y3 = this.X3;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.Z3 = this.Y3;
                    if ((this.f20803d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.Z3 = Collections.unmodifiableList(this.Z3);
                        this.f20803d &= -257;
                    }
                    cVar.f20792a4 = this.Z3;
                    if ((i10 & 512) == 512) {
                        i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    cVar.f20793b4 = this.f20801a4;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    cVar.f20794c4 = this.f20802b4;
                    cVar.f20798q = i11;
                    return cVar;
                }

                /* renamed from: v */
                public C0341b k() {
                    return w().m(t());
                }
            }

            /* renamed from: rd.b$b$c$c */
            /* loaded from: classes.dex */
            public enum EnumC0342c implements j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: d4 */
                private static j.b<EnumC0342c> f20811d4 = new a();

                /* renamed from: c */
                private final int f20816c;

                /* renamed from: rd.b$b$c$c$a */
                /* loaded from: classes.dex */
                static class a implements j.b<EnumC0342c> {
                    a() {
                    }

                    /* renamed from: b */
                    public EnumC0342c a(int i10) {
                        return EnumC0342c.b(i10);
                    }
                }

                EnumC0342c(int i10, int i11) {
                    this.f20816c = i11;
                }

                public static EnumC0342c b(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // yd.j.a
                public final int c() {
                    return this.f20816c;
                }
            }

            static {
                c cVar = new c(true);
                f20790f4 = cVar;
                cVar.F0();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(yd.e eVar, yd.g gVar) {
                this.f20796d4 = (byte) -1;
                this.f20797e4 = -1;
                F0();
                d.b r10 = yd.d.r();
                yd.f J = yd.f.J(r10, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    ?? r52 = 256;
                    if (z10) {
                        if (z11 & true) {
                            this.f20792a4 = Collections.unmodifiableList(this.f20792a4);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f20795d = r10.i();
                            throw th2;
                        }
                        this.f20795d = r10.i();
                        u();
                        return;
                    }
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    break;
                                case 8:
                                    int n10 = eVar.n();
                                    EnumC0342c b10 = EnumC0342c.b(n10);
                                    if (b10 == null) {
                                        J.o0(K);
                                        J.o0(n10);
                                        continue;
                                    } else {
                                        this.f20798q |= 1;
                                        this.f20799x = b10;
                                    }
                                case 16:
                                    this.f20798q |= 2;
                                    this.f20800y = eVar.H();
                                    continue;
                                case 29:
                                    this.f20798q |= 4;
                                    this.U3 = eVar.q();
                                    continue;
                                case 33:
                                    this.f20798q |= 8;
                                    this.V3 = eVar.m();
                                    continue;
                                case 40:
                                    this.f20798q |= 16;
                                    this.W3 = eVar.s();
                                    continue;
                                case 48:
                                    this.f20798q |= 32;
                                    this.X3 = eVar.s();
                                    continue;
                                case 56:
                                    this.f20798q |= 64;
                                    this.Y3 = eVar.s();
                                    continue;
                                case 66:
                                    c g10 = (this.f20798q & 128) == 128 ? this.Z3.g() : null;
                                    b bVar = (b) eVar.u(b.X3, gVar);
                                    this.Z3 = bVar;
                                    if (g10 != null) {
                                        g10.m(bVar);
                                        this.Z3 = g10.t();
                                    }
                                    this.f20798q |= 128;
                                    continue;
                                case 74:
                                    if (!(z11 & true)) {
                                        this.f20792a4 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f20792a4.add(eVar.u(f20791g4, gVar));
                                    continue;
                                case 80:
                                    this.f20798q |= 512;
                                    this.f20794c4 = eVar.s();
                                    continue;
                                case 88:
                                    this.f20798q |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    this.f20793b4 = eVar.s();
                                    continue;
                                default:
                                    r52 = y(eVar, J, gVar, K);
                                    if (r52 == 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z10 = true;
                        } catch (Throwable th3) {
                            if ((z11 & true) == r52) {
                                this.f20792a4 = Collections.unmodifiableList(this.f20792a4);
                            }
                            try {
                                J.I();
                            } catch (IOException unused2) {
                            } catch (Throwable th4) {
                                this.f20795d = r10.i();
                                throw th4;
                            }
                            this.f20795d = r10.i();
                            u();
                            throw th3;
                        }
                    } catch (yd.k e10) {
                        throw e10.k(this);
                    } catch (IOException e11) {
                        throw new yd.k(e11.getMessage()).k(this);
                    }
                }
            }

            private c(i.b bVar) {
                super(bVar);
                this.f20796d4 = (byte) -1;
                this.f20797e4 = -1;
                this.f20795d = bVar.l();
            }

            private c(boolean z10) {
                this.f20796d4 = (byte) -1;
                this.f20797e4 = -1;
                this.f20795d = yd.d.f26096c;
            }

            private void F0() {
                this.f20799x = EnumC0342c.BYTE;
                this.f20800y = 0L;
                this.U3 = 0.0f;
                this.V3 = 0.0d;
                this.W3 = 0;
                this.X3 = 0;
                this.Y3 = 0;
                this.Z3 = b.b0();
                this.f20792a4 = Collections.emptyList();
                this.f20793b4 = 0;
                this.f20794c4 = 0;
            }

            public static C0341b G0() {
                return C0341b.w();
            }

            public static C0341b H0(c cVar) {
                return G0().m(cVar);
            }

            public static c n0() {
                return f20790f4;
            }

            public boolean A0() {
                return (this.f20798q & 512) == 512;
            }

            public boolean B0() {
                return (this.f20798q & 4) == 4;
            }

            public boolean C0() {
                return (this.f20798q & 2) == 2;
            }

            public boolean D0() {
                return (this.f20798q & 16) == 16;
            }

            public boolean E0() {
                return (this.f20798q & 1) == 1;
            }

            /* renamed from: I0 */
            public C0341b h() {
                return G0();
            }

            /* renamed from: J0 */
            public C0341b g() {
                return H0(this);
            }

            @Override // yd.r
            public final boolean c() {
                byte b10 = this.f20796d4;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (v0() && !h0().c()) {
                    this.f20796d4 = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < k0(); i10++) {
                    if (!j0(i10).c()) {
                        this.f20796d4 = (byte) 0;
                        return false;
                    }
                }
                this.f20796d4 = (byte) 1;
                return true;
            }

            @Override // yd.q
            public int e() {
                int i10 = this.f20797e4;
                if (i10 != -1) {
                    return i10;
                }
                int h10 = (this.f20798q & 1) == 1 ? yd.f.h(1, this.f20799x.c()) + 0 : 0;
                if ((this.f20798q & 2) == 2) {
                    h10 += yd.f.A(2, this.f20800y);
                }
                if ((this.f20798q & 4) == 4) {
                    h10 += yd.f.l(3, this.U3);
                }
                if ((this.f20798q & 8) == 8) {
                    h10 += yd.f.f(4, this.V3);
                }
                if ((this.f20798q & 16) == 16) {
                    h10 += yd.f.o(5, this.W3);
                }
                if ((this.f20798q & 32) == 32) {
                    h10 += yd.f.o(6, this.X3);
                }
                if ((this.f20798q & 64) == 64) {
                    h10 += yd.f.o(7, this.Y3);
                }
                if ((this.f20798q & 128) == 128) {
                    h10 += yd.f.s(8, this.Z3);
                }
                for (int i11 = 0; i11 < this.f20792a4.size(); i11++) {
                    h10 += yd.f.s(9, this.f20792a4.get(i11));
                }
                if ((this.f20798q & 512) == 512) {
                    h10 += yd.f.o(10, this.f20794c4);
                }
                if ((this.f20798q & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    h10 += yd.f.o(11, this.f20793b4);
                }
                int size = h10 + this.f20795d.size();
                this.f20797e4 = size;
                return size;
            }

            public b h0() {
                return this.Z3;
            }

            @Override // yd.i, yd.q
            public yd.s<c> i() {
                return f20791g4;
            }

            public int i0() {
                return this.f20793b4;
            }

            @Override // yd.q
            public void j(yd.f fVar) {
                e();
                if ((this.f20798q & 1) == 1) {
                    fVar.S(1, this.f20799x.c());
                }
                if ((this.f20798q & 2) == 2) {
                    fVar.t0(2, this.f20800y);
                }
                if ((this.f20798q & 4) == 4) {
                    fVar.W(3, this.U3);
                }
                if ((this.f20798q & 8) == 8) {
                    fVar.Q(4, this.V3);
                }
                if ((this.f20798q & 16) == 16) {
                    fVar.a0(5, this.W3);
                }
                if ((this.f20798q & 32) == 32) {
                    fVar.a0(6, this.X3);
                }
                if ((this.f20798q & 64) == 64) {
                    fVar.a0(7, this.Y3);
                }
                if ((this.f20798q & 128) == 128) {
                    fVar.d0(8, this.Z3);
                }
                for (int i10 = 0; i10 < this.f20792a4.size(); i10++) {
                    fVar.d0(9, this.f20792a4.get(i10));
                }
                if ((this.f20798q & 512) == 512) {
                    fVar.a0(10, this.f20794c4);
                }
                if ((this.f20798q & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    fVar.a0(11, this.f20793b4);
                }
                fVar.i0(this.f20795d);
            }

            public c j0(int i10) {
                return this.f20792a4.get(i10);
            }

            public int k0() {
                return this.f20792a4.size();
            }

            public List<c> l0() {
                return this.f20792a4;
            }

            public int m0() {
                return this.X3;
            }

            public double o0() {
                return this.V3;
            }

            public int p0() {
                return this.Y3;
            }

            public int q0() {
                return this.f20794c4;
            }

            public float r0() {
                return this.U3;
            }

            public long s0() {
                return this.f20800y;
            }

            public int t0() {
                return this.W3;
            }

            public EnumC0342c u0() {
                return this.f20799x;
            }

            public boolean v0() {
                return (this.f20798q & 128) == 128;
            }

            public boolean w0() {
                return (this.f20798q & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
            }

            public boolean x0() {
                return (this.f20798q & 32) == 32;
            }

            public boolean y0() {
                return (this.f20798q & 8) == 8;
            }

            public boolean z0() {
                return (this.f20798q & 64) == 64;
            }
        }

        static {
            C0339b c0339b = new C0339b(true);
            W3 = c0339b;
            c0339b.c0();
        }

        private C0339b(yd.e eVar, yd.g gVar) {
            this.U3 = (byte) -1;
            this.V3 = -1;
            c0();
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
                                    this.f20784q |= 1;
                                    this.f20785x = eVar.s();
                                } else if (K == 18) {
                                    c.C0341b g10 = (this.f20784q & 2) == 2 ? this.f20786y.g() : null;
                                    c cVar = (c) eVar.u(c.f20791g4, gVar);
                                    this.f20786y = cVar;
                                    if (g10 != null) {
                                        g10.m(cVar);
                                        this.f20786y = g10.t();
                                    }
                                    this.f20784q |= 2;
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
                        this.f20783d = r10.i();
                        throw th3;
                    }
                    this.f20783d = r10.i();
                    u();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f20783d = r10.i();
                throw th4;
            }
            this.f20783d = r10.i();
            u();
        }

        private C0339b(i.b bVar) {
            super(bVar);
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f20783d = bVar.l();
        }

        private C0339b(boolean z10) {
            this.U3 = (byte) -1;
            this.V3 = -1;
            this.f20783d = yd.d.f26096c;
        }

        public static C0339b M() {
            return W3;
        }

        private void c0() {
            this.f20785x = 0;
            this.f20786y = c.n0();
        }

        public static C0340b d0() {
            return C0340b.w();
        }

        public static C0340b e0(C0339b c0339b) {
            return d0().m(c0339b);
        }

        public int N() {
            return this.f20785x;
        }

        public c V() {
            return this.f20786y;
        }

        public boolean W() {
            return (this.f20784q & 1) == 1;
        }

        public boolean b0() {
            return (this.f20784q & 2) == 2;
        }

        @Override // yd.r
        public final boolean c() {
            byte b10 = this.U3;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!W()) {
                this.U3 = (byte) 0;
                return false;
            } else if (!b0()) {
                this.U3 = (byte) 0;
                return false;
            } else if (!V().c()) {
                this.U3 = (byte) 0;
                return false;
            } else {
                this.U3 = (byte) 1;
                return true;
            }
        }

        @Override // yd.q
        public int e() {
            int i10 = this.V3;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f20784q & 1) == 1) {
                i11 = 0 + yd.f.o(1, this.f20785x);
            }
            if ((this.f20784q & 2) == 2) {
                i11 += yd.f.s(2, this.f20786y);
            }
            int size = i11 + this.f20783d.size();
            this.V3 = size;
            return size;
        }

        /* renamed from: f0 */
        public C0340b h() {
            return d0();
        }

        /* renamed from: g0 */
        public C0340b g() {
            return e0(this);
        }

        @Override // yd.i, yd.q
        public yd.s<C0339b> i() {
            return X3;
        }

        @Override // yd.q
        public void j(yd.f fVar) {
            e();
            if ((this.f20784q & 1) == 1) {
                fVar.a0(1, this.f20785x);
            }
            if ((this.f20784q & 2) == 2) {
                fVar.d0(2, this.f20786y);
            }
            fVar.i0(this.f20783d);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i.b<b, c> implements yd.r {

        /* renamed from: d */
        private int f20817d;

        /* renamed from: q */
        private int f20818q;

        /* renamed from: x */
        private List<C0339b> f20819x = Collections.emptyList();

        private c() {
            y();
        }

        public static c w() {
            return new c();
        }

        private void x() {
            if ((this.f20817d & 2) != 2) {
                this.f20819x = new ArrayList(this.f20819x);
                this.f20817d |= 2;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public c m(b bVar) {
            if (bVar == b.b0()) {
                return this;
            }
            if (bVar.d0()) {
                C(bVar.c0());
            }
            if (!bVar.f20782y.isEmpty()) {
                if (this.f20819x.isEmpty()) {
                    this.f20819x = bVar.f20782y;
                    this.f20817d &= -3;
                } else {
                    x();
                    this.f20819x.addAll(bVar.f20782y);
                }
            }
            o(l().b(bVar.f20779d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.b.c s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.b> r1 = rd.b.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.b r3 = (rd.b) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.b r4 = (rd.b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.b.c.s(yd.e, yd.g):rd.b$c");
        }

        public c C(int i10) {
            this.f20817d |= 1;
            this.f20818q = i10;
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
            int i10 = 1;
            if ((this.f20817d & 1) != 1) {
                i10 = 0;
            }
            bVar.f20781x = this.f20818q;
            if ((this.f20817d & 2) == 2) {
                this.f20819x = Collections.unmodifiableList(this.f20819x);
                this.f20817d &= -3;
            }
            bVar.f20782y = this.f20819x;
            bVar.f20780q = i10;
            return bVar;
        }

        /* renamed from: v */
        public c k() {
            return w().m(t());
        }
    }

    static {
        b bVar = new b(true);
        W3 = bVar;
        bVar.e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(yd.e eVar, yd.g gVar) {
        this.U3 = (byte) -1;
        this.V3 = -1;
        e0();
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
                            this.f20780q |= 1;
                            this.f20781x = eVar.s();
                        } else if (K == 18) {
                            if (!(z11 & true)) {
                                this.f20782y = new ArrayList();
                                z11 |= true;
                            }
                            this.f20782y.add(eVar.u(C0339b.X3, gVar));
                        } else if (!y(eVar, J, gVar, K)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f20782y = Collections.unmodifiableList(this.f20782y);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f20779d = r10.i();
                        throw th3;
                    }
                    this.f20779d = r10.i();
                    u();
                    throw th2;
                }
            } catch (yd.k e10) {
                throw e10.k(this);
            } catch (IOException e11) {
                throw new yd.k(e11.getMessage()).k(this);
            }
        }
        if (z11 & true) {
            this.f20782y = Collections.unmodifiableList(this.f20782y);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20779d = r10.i();
            throw th4;
        }
        this.f20779d = r10.i();
        u();
    }

    private b(i.b bVar) {
        super(bVar);
        this.U3 = (byte) -1;
        this.V3 = -1;
        this.f20779d = bVar.l();
    }

    private b(boolean z10) {
        this.U3 = (byte) -1;
        this.V3 = -1;
        this.f20779d = yd.d.f26096c;
    }

    public static b b0() {
        return W3;
    }

    private void e0() {
        this.f20781x = 0;
        this.f20782y = Collections.emptyList();
    }

    public static c f0() {
        return c.w();
    }

    public static c g0(b bVar) {
        return f0().m(bVar);
    }

    public C0339b N(int i10) {
        return this.f20782y.get(i10);
    }

    public int V() {
        return this.f20782y.size();
    }

    public List<C0339b> W() {
        return this.f20782y;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.U3;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!d0()) {
            this.U3 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < V(); i10++) {
            if (!N(i10).c()) {
                this.U3 = (byte) 0;
                return false;
            }
        }
        this.U3 = (byte) 1;
        return true;
    }

    public int c0() {
        return this.f20781x;
    }

    public boolean d0() {
        return (this.f20780q & 1) == 1;
    }

    @Override // yd.q
    public int e() {
        int i10 = this.V3;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f20780q & 1) == 1 ? yd.f.o(1, this.f20781x) + 0 : 0;
        for (int i11 = 0; i11 < this.f20782y.size(); i11++) {
            o10 += yd.f.s(2, this.f20782y.get(i11));
        }
        int size = o10 + this.f20779d.size();
        this.V3 = size;
        return size;
    }

    /* renamed from: h0 */
    public c h() {
        return f0();
    }

    @Override // yd.i, yd.q
    public yd.s<b> i() {
        return X3;
    }

    /* renamed from: i0 */
    public c g() {
        return g0(this);
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        if ((this.f20780q & 1) == 1) {
            fVar.a0(1, this.f20781x);
        }
        for (int i10 = 0; i10 < this.f20782y.size(); i10++) {
            fVar.d0(2, this.f20782y.get(i10));
        }
        fVar.i0(this.f20779d);
    }
}
