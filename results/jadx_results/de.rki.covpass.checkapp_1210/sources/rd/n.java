package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import rd.q;
import rd.u;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class n extends i.d<n> {

    /* renamed from: k4 */
    private static final n f20970k4;

    /* renamed from: l4 */
    public static yd.s<n> f20971l4 = new a();
    private int U3;
    private int V3;
    private q W3;
    private int X3;
    private List<s> Y3;
    private q Z3;

    /* renamed from: a4 */
    private int f20972a4;

    /* renamed from: b4 */
    private List<q> f20973b4;

    /* renamed from: c4 */
    private List<Integer> f20974c4;

    /* renamed from: d4 */
    private int f20975d4;

    /* renamed from: e4 */
    private u f20976e4;

    /* renamed from: f4 */
    private int f20977f4;

    /* renamed from: g4 */
    private int f20978g4;

    /* renamed from: h4 */
    private List<Integer> f20979h4;

    /* renamed from: i4 */
    private byte f20980i4;

    /* renamed from: j4 */
    private int f20981j4;

    /* renamed from: q */
    private final yd.d f20982q;

    /* renamed from: x */
    private int f20983x;

    /* renamed from: y */
    private int f20984y;

    /* loaded from: classes.dex */
    static class a extends yd.b<n> {
        a() {
        }

        /* renamed from: m */
        public n d(yd.e eVar, yd.g gVar) {
            return new n(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<n, b> {
        private int V3;
        private int X3;

        /* renamed from: a4 */
        private int f20985a4;

        /* renamed from: e4 */
        private int f20989e4;

        /* renamed from: f4 */
        private int f20990f4;

        /* renamed from: x */
        private int f20992x;

        /* renamed from: y */
        private int f20993y = 518;
        private int U3 = 2054;
        private q W3 = q.z0();
        private List<s> Y3 = Collections.emptyList();
        private q Z3 = q.z0();

        /* renamed from: b4 */
        private List<q> f20986b4 = Collections.emptyList();

        /* renamed from: c4 */
        private List<Integer> f20987c4 = Collections.emptyList();

        /* renamed from: d4 */
        private u f20988d4 = u.k0();

        /* renamed from: g4 */
        private List<Integer> f20991g4 = Collections.emptyList();

        private b() {
            H();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f20992x & 512) != 512) {
                this.f20987c4 = new ArrayList(this.f20987c4);
                this.f20992x |= 512;
            }
        }

        private void D() {
            if ((this.f20992x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f20986b4 = new ArrayList(this.f20986b4);
                this.f20992x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void E() {
            if ((this.f20992x & 32) != 32) {
                this.Y3 = new ArrayList(this.Y3);
                this.f20992x |= 32;
            }
        }

        private void F() {
            if ((this.f20992x & 8192) != 8192) {
                this.f20991g4 = new ArrayList(this.f20991g4);
                this.f20992x |= 8192;
            }
        }

        private void H() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: I */
        public b m(n nVar) {
            if (nVar == n.A0()) {
                return this;
            }
            if (nVar.Q0()) {
                N(nVar.C0());
            }
            if (nVar.T0()) {
                Q(nVar.F0());
            }
            if (nVar.S0()) {
                P(nVar.E0());
            }
            if (nVar.W0()) {
                L(nVar.I0());
            }
            if (nVar.X0()) {
                S(nVar.J0());
            }
            if (!nVar.Y3.isEmpty()) {
                if (this.Y3.isEmpty()) {
                    this.Y3 = nVar.Y3;
                    this.f20992x &= -33;
                } else {
                    E();
                    this.Y3.addAll(nVar.Y3);
                }
            }
            if (nVar.U0()) {
                K(nVar.G0());
            }
            if (nVar.V0()) {
                R(nVar.H0());
            }
            if (!nVar.f20973b4.isEmpty()) {
                if (this.f20986b4.isEmpty()) {
                    this.f20986b4 = nVar.f20973b4;
                    this.f20992x &= -257;
                } else {
                    D();
                    this.f20986b4.addAll(nVar.f20973b4);
                }
            }
            if (!nVar.f20974c4.isEmpty()) {
                if (this.f20987c4.isEmpty()) {
                    this.f20987c4 = nVar.f20974c4;
                    this.f20992x &= -513;
                } else {
                    C();
                    this.f20987c4.addAll(nVar.f20974c4);
                }
            }
            if (nVar.Z0()) {
                M(nVar.L0());
            }
            if (nVar.R0()) {
                O(nVar.D0());
            }
            if (nVar.Y0()) {
                T(nVar.K0());
            }
            if (!nVar.f20979h4.isEmpty()) {
                if (this.f20991g4.isEmpty()) {
                    this.f20991g4 = nVar.f20979h4;
                    this.f20992x &= -8193;
                } else {
                    F();
                    this.f20991g4.addAll(nVar.f20979h4);
                }
            }
            v(nVar);
            o(l().b(nVar.f20982q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.n.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.n> r1 = rd.n.f20971l4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.n r3 = (rd.n) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.n r4 = (rd.n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.n.b.s(yd.e, yd.g):rd.n$b");
        }

        public b K(q qVar) {
            if ((this.f20992x & 64) == 64 && this.Z3 != q.z0()) {
                qVar = q.a1(this.Z3).m(qVar).y();
            }
            this.Z3 = qVar;
            this.f20992x |= 64;
            return this;
        }

        public b L(q qVar) {
            if ((this.f20992x & 8) == 8 && this.W3 != q.z0()) {
                qVar = q.a1(this.W3).m(qVar).y();
            }
            this.W3 = qVar;
            this.f20992x |= 8;
            return this;
        }

        public b M(u uVar) {
            if ((this.f20992x & 1024) == 1024 && this.f20988d4 != u.k0()) {
                uVar = u.A0(this.f20988d4).m(uVar).y();
            }
            this.f20988d4 = uVar;
            this.f20992x |= 1024;
            return this;
        }

        public b N(int i10) {
            this.f20992x |= 1;
            this.f20993y = i10;
            return this;
        }

        public b O(int i10) {
            this.f20992x |= 2048;
            this.f20989e4 = i10;
            return this;
        }

        public b P(int i10) {
            this.f20992x |= 4;
            this.V3 = i10;
            return this;
        }

        public b Q(int i10) {
            this.f20992x |= 2;
            this.U3 = i10;
            return this;
        }

        public b R(int i10) {
            this.f20992x |= 128;
            this.f20985a4 = i10;
            return this;
        }

        public b S(int i10) {
            this.f20992x |= 16;
            this.X3 = i10;
            return this;
        }

        public b T(int i10) {
            this.f20992x |= 4096;
            this.f20990f4 = i10;
            return this;
        }

        /* renamed from: x */
        public n b() {
            n y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public n y() {
            n nVar = new n(this);
            int i10 = this.f20992x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            nVar.f20984y = this.f20993y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            nVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            nVar.V3 = this.V3;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            nVar.W3 = this.W3;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            nVar.X3 = this.X3;
            if ((this.f20992x & 32) == 32) {
                this.Y3 = Collections.unmodifiableList(this.Y3);
                this.f20992x &= -33;
            }
            nVar.Y3 = this.Y3;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            nVar.Z3 = this.Z3;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            nVar.f20972a4 = this.f20985a4;
            if ((this.f20992x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f20986b4 = Collections.unmodifiableList(this.f20986b4);
                this.f20992x &= -257;
            }
            nVar.f20973b4 = this.f20986b4;
            if ((this.f20992x & 512) == 512) {
                this.f20987c4 = Collections.unmodifiableList(this.f20987c4);
                this.f20992x &= -513;
            }
            nVar.f20974c4 = this.f20987c4;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            nVar.f20976e4 = this.f20988d4;
            if ((i10 & 2048) == 2048) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            nVar.f20977f4 = this.f20989e4;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            nVar.f20978g4 = this.f20990f4;
            if ((this.f20992x & 8192) == 8192) {
                this.f20991g4 = Collections.unmodifiableList(this.f20991g4);
                this.f20992x &= -8193;
            }
            nVar.f20979h4 = this.f20991g4;
            nVar.f20983x = i11;
            return nVar;
        }
    }

    static {
        n nVar = new n(true);
        f20970k4 = nVar;
        nVar.a1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private n(yd.e eVar, yd.g gVar) {
        int j10;
        int i10;
        int i11;
        List list;
        yd.q qVar;
        this.f20975d4 = -1;
        this.f20980i4 = (byte) -1;
        this.f20981j4 = -1;
        a1();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 256;
            if (z10) {
                boolean z12 = z11 ? 1 : 0;
                boolean z13 = z11 ? 1 : 0;
                boolean z14 = z11 ? 1 : 0;
                boolean z15 = z11 ? 1 : 0;
                boolean z16 = z11 ? 1 : 0;
                boolean z17 = z11 ? 1 : 0;
                boolean z18 = z11 ? 1 : 0;
                boolean z19 = z11 ? 1 : 0;
                boolean z20 = z11 ? 1 : 0;
                boolean z21 = z11 ? 1 : 0;
                boolean z22 = z11 ? 1 : 0;
                if (z12 & true) {
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                if (z11 & true) {
                    this.f20973b4 = Collections.unmodifiableList(this.f20973b4);
                }
                if (z11 & true) {
                    this.f20974c4 = Collections.unmodifiableList(this.f20974c4);
                }
                if (z11 & true) {
                    this.f20979h4 = Collections.unmodifiableList(this.f20979h4);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20982q = r10.i();
                    throw th2;
                }
                this.f20982q = r10.i();
                u();
                return;
            }
            try {
                try {
                    int K = eVar.K();
                    q.c cVar = null;
                    u.b g10 = null;
                    q.c g11 = null;
                    switch (K) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f20983x |= 2;
                            this.U3 = eVar.s();
                            break;
                        case 16:
                            this.f20983x |= 4;
                            this.V3 = eVar.s();
                            break;
                        case 26:
                            i10 = 8;
                            cVar = (this.f20983x & 8) == 8 ? this.W3.g() : cVar;
                            q qVar2 = (q) eVar.u(q.f21020k4, gVar);
                            this.W3 = qVar2;
                            if (cVar != null) {
                                cVar.m(qVar2);
                                this.W3 = cVar.y();
                            }
                            i11 = this.f20983x;
                            this.f20983x = i11 | i10;
                            break;
                        case 34:
                            boolean z23 = z11 & true;
                            boolean z24 = z11;
                            if (!z23) {
                                this.Y3 = new ArrayList();
                                z24 = z11 | true;
                            }
                            list = this.Y3;
                            z11 = z24;
                            qVar = eVar.u(s.f21069d4, gVar);
                            list.add(qVar);
                            break;
                        case 42:
                            g11 = (this.f20983x & 32) == 32 ? this.Z3.g() : g11;
                            q qVar3 = (q) eVar.u(q.f21020k4, gVar);
                            this.Z3 = qVar3;
                            if (g11 != null) {
                                g11.m(qVar3);
                                this.Z3 = g11.y();
                            }
                            this.f20983x |= 32;
                            break;
                        case 50:
                            i10 = 128;
                            g10 = (this.f20983x & 128) == 128 ? this.f20976e4.g() : g10;
                            u uVar = (u) eVar.u(u.f21090c4, gVar);
                            this.f20976e4 = uVar;
                            if (g10 != null) {
                                g10.m(uVar);
                                this.f20976e4 = g10.y();
                            }
                            i11 = this.f20983x;
                            this.f20983x = i11 | i10;
                            break;
                        case 56:
                            this.f20983x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            this.f20977f4 = eVar.s();
                            break;
                        case 64:
                            this.f20983x |= 512;
                            this.f20978g4 = eVar.s();
                            break;
                        case 72:
                            this.f20983x |= 16;
                            this.X3 = eVar.s();
                            break;
                        case 80:
                            this.f20983x |= 64;
                            this.f20972a4 = eVar.s();
                            break;
                        case 88:
                            this.f20983x |= 1;
                            this.f20984y = eVar.s();
                            break;
                        case 98:
                            boolean z25 = z11 & true;
                            boolean z26 = z11;
                            if (!z25) {
                                this.f20973b4 = new ArrayList();
                                z26 = z11 | true;
                            }
                            list = this.f20973b4;
                            z11 = z26;
                            qVar = eVar.u(q.f21020k4, gVar);
                            list.add(qVar);
                            break;
                        case 104:
                            boolean z27 = z11 & true;
                            boolean z28 = z11;
                            if (!z27) {
                                this.f20974c4 = new ArrayList();
                                z28 = z11 | true;
                            }
                            list = this.f20974c4;
                            z11 = z28;
                            qVar = Integer.valueOf(eVar.s());
                            list.add(qVar);
                            break;
                        case 106:
                            j10 = eVar.j(eVar.A());
                            boolean z29 = z11 & true;
                            z11 = z11;
                            if (!z29) {
                                z11 = z11;
                                if (eVar.e() > 0) {
                                    this.f20974c4 = new ArrayList();
                                    z11 |= true;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20974c4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            break;
                        case 248:
                            boolean z30 = z11 & true;
                            boolean z31 = z11;
                            if (!z30) {
                                this.f20979h4 = new ArrayList();
                                z31 = z11 | true;
                            }
                            list = this.f20979h4;
                            z11 = z31;
                            qVar = Integer.valueOf(eVar.s());
                            list.add(qVar);
                            break;
                        case 250:
                            j10 = eVar.j(eVar.A());
                            boolean z32 = z11 & true;
                            z11 = z11;
                            if (!z32) {
                                z11 = z11;
                                if (eVar.e() > 0) {
                                    this.f20979h4 = new ArrayList();
                                    z11 |= true;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20979h4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            break;
                        default:
                            r52 = y(eVar, J, gVar, K);
                            if (r52 != 0) {
                                break;
                            } else {
                                z10 = true;
                                break;
                            }
                    }
                } catch (yd.k e10) {
                    throw e10.k(this);
                } catch (IOException e11) {
                    throw new yd.k(e11.getMessage()).k(this);
                }
            } catch (Throwable th3) {
                if (z11 & true) {
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                if ((z11 & true) == r52) {
                    this.f20973b4 = Collections.unmodifiableList(this.f20973b4);
                }
                if (z11 & true) {
                    this.f20974c4 = Collections.unmodifiableList(this.f20974c4);
                }
                if (z11 & true) {
                    this.f20979h4 = Collections.unmodifiableList(this.f20979h4);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f20982q = r10.i();
                    throw th4;
                }
                this.f20982q = r10.i();
                u();
                throw th3;
            }
        }
    }

    private n(i.c<n, ?> cVar) {
        super(cVar);
        this.f20975d4 = -1;
        this.f20980i4 = (byte) -1;
        this.f20981j4 = -1;
        this.f20982q = cVar.l();
    }

    private n(boolean z10) {
        this.f20975d4 = -1;
        this.f20980i4 = (byte) -1;
        this.f20981j4 = -1;
        this.f20982q = yd.d.f26096c;
    }

    public static n A0() {
        return f20970k4;
    }

    private void a1() {
        this.f20984y = 518;
        this.U3 = 2054;
        this.V3 = 0;
        this.W3 = q.z0();
        this.X3 = 0;
        this.Y3 = Collections.emptyList();
        this.Z3 = q.z0();
        this.f20972a4 = 0;
        this.f20973b4 = Collections.emptyList();
        this.f20974c4 = Collections.emptyList();
        this.f20976e4 = u.k0();
        this.f20977f4 = 0;
        this.f20978g4 = 0;
        this.f20979h4 = Collections.emptyList();
    }

    public static b b1() {
        return b.B();
    }

    public static b c1(n nVar) {
        return b1().m(nVar);
    }

    /* renamed from: B0 */
    public n f() {
        return f20970k4;
    }

    public int C0() {
        return this.f20984y;
    }

    public int D0() {
        return this.f20977f4;
    }

    public int E0() {
        return this.V3;
    }

    public int F0() {
        return this.U3;
    }

    public q G0() {
        return this.Z3;
    }

    public int H0() {
        return this.f20972a4;
    }

    public q I0() {
        return this.W3;
    }

    public int J0() {
        return this.X3;
    }

    public int K0() {
        return this.f20978g4;
    }

    public u L0() {
        return this.f20976e4;
    }

    public s M0(int i10) {
        return this.Y3.get(i10);
    }

    public int N0() {
        return this.Y3.size();
    }

    public List<s> O0() {
        return this.Y3;
    }

    public List<Integer> P0() {
        return this.f20979h4;
    }

    public boolean Q0() {
        return (this.f20983x & 1) == 1;
    }

    public boolean R0() {
        return (this.f20983x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean S0() {
        return (this.f20983x & 4) == 4;
    }

    public boolean T0() {
        return (this.f20983x & 2) == 2;
    }

    public boolean U0() {
        return (this.f20983x & 32) == 32;
    }

    public boolean V0() {
        return (this.f20983x & 64) == 64;
    }

    public boolean W0() {
        return (this.f20983x & 8) == 8;
    }

    public boolean X0() {
        return (this.f20983x & 16) == 16;
    }

    public boolean Y0() {
        return (this.f20983x & 512) == 512;
    }

    public boolean Z0() {
        return (this.f20983x & 128) == 128;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f20980i4;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!S0()) {
            this.f20980i4 = (byte) 0;
            return false;
        } else if (W0() && !I0().c()) {
            this.f20980i4 = (byte) 0;
            return false;
        } else {
            for (int i10 = 0; i10 < N0(); i10++) {
                if (!M0(i10).c()) {
                    this.f20980i4 = (byte) 0;
                    return false;
                }
            }
            if (U0() && !G0().c()) {
                this.f20980i4 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < x0(); i11++) {
                if (!w0(i11).c()) {
                    this.f20980i4 = (byte) 0;
                    return false;
                }
            }
            if (Z0() && !L0().c()) {
                this.f20980i4 = (byte) 0;
                return false;
            } else if (!B()) {
                this.f20980i4 = (byte) 0;
                return false;
            } else {
                this.f20980i4 = (byte) 1;
                return true;
            }
        }
    }

    /* renamed from: d1 */
    public b h() {
        return b1();
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f20981j4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f20983x & 2) == 2 ? yd.f.o(1, this.U3) + 0 : 0;
        if ((this.f20983x & 4) == 4) {
            o10 += yd.f.o(2, this.V3);
        }
        if ((this.f20983x & 8) == 8) {
            o10 += yd.f.s(3, this.W3);
        }
        for (int i11 = 0; i11 < this.Y3.size(); i11++) {
            o10 += yd.f.s(4, this.Y3.get(i11));
        }
        if ((this.f20983x & 32) == 32) {
            o10 += yd.f.s(5, this.Z3);
        }
        if ((this.f20983x & 128) == 128) {
            o10 += yd.f.s(6, this.f20976e4);
        }
        if ((this.f20983x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            o10 += yd.f.o(7, this.f20977f4);
        }
        if ((this.f20983x & 512) == 512) {
            o10 += yd.f.o(8, this.f20978g4);
        }
        if ((this.f20983x & 16) == 16) {
            o10 += yd.f.o(9, this.X3);
        }
        if ((this.f20983x & 64) == 64) {
            o10 += yd.f.o(10, this.f20972a4);
        }
        if ((this.f20983x & 1) == 1) {
            o10 += yd.f.o(11, this.f20984y);
        }
        for (int i12 = 0; i12 < this.f20973b4.size(); i12++) {
            o10 += yd.f.s(12, this.f20973b4.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f20974c4.size(); i14++) {
            i13 += yd.f.p(this.f20974c4.get(i14).intValue());
        }
        int i15 = o10 + i13;
        if (!y0().isEmpty()) {
            i15 = i15 + 1 + yd.f.p(i13);
        }
        this.f20975d4 = i13;
        int i16 = 0;
        for (int i17 = 0; i17 < this.f20979h4.size(); i17++) {
            i16 += yd.f.p(this.f20979h4.get(i17).intValue());
        }
        int size = i15 + i16 + (P0().size() * 2) + G() + this.f20982q.size();
        this.f20981j4 = size;
        return size;
    }

    /* renamed from: e1 */
    public b g() {
        return c1(this);
    }

    @Override // yd.i, yd.q
    public yd.s<n> i() {
        return f20971l4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f20983x & 2) == 2) {
            fVar.a0(1, this.U3);
        }
        if ((this.f20983x & 4) == 4) {
            fVar.a0(2, this.V3);
        }
        if ((this.f20983x & 8) == 8) {
            fVar.d0(3, this.W3);
        }
        for (int i10 = 0; i10 < this.Y3.size(); i10++) {
            fVar.d0(4, this.Y3.get(i10));
        }
        if ((this.f20983x & 32) == 32) {
            fVar.d0(5, this.Z3);
        }
        if ((this.f20983x & 128) == 128) {
            fVar.d0(6, this.f20976e4);
        }
        if ((this.f20983x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            fVar.a0(7, this.f20977f4);
        }
        if ((this.f20983x & 512) == 512) {
            fVar.a0(8, this.f20978g4);
        }
        if ((this.f20983x & 16) == 16) {
            fVar.a0(9, this.X3);
        }
        if ((this.f20983x & 64) == 64) {
            fVar.a0(10, this.f20972a4);
        }
        if ((this.f20983x & 1) == 1) {
            fVar.a0(11, this.f20984y);
        }
        for (int i11 = 0; i11 < this.f20973b4.size(); i11++) {
            fVar.d0(12, this.f20973b4.get(i11));
        }
        if (y0().size() > 0) {
            fVar.o0(106);
            fVar.o0(this.f20975d4);
        }
        for (int i12 = 0; i12 < this.f20974c4.size(); i12++) {
            fVar.b0(this.f20974c4.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.f20979h4.size(); i13++) {
            fVar.a0(31, this.f20979h4.get(i13).intValue());
        }
        W.a(19000, fVar);
        fVar.i0(this.f20982q);
    }

    public q w0(int i10) {
        return this.f20973b4.get(i10);
    }

    public int x0() {
        return this.f20973b4.size();
    }

    public List<Integer> y0() {
        return this.f20974c4;
    }

    public List<q> z0() {
        return this.f20973b4;
    }
}
