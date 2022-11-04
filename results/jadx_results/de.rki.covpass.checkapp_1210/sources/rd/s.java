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
public final class s extends i.d<s> {

    /* renamed from: c4 */
    private static final s f21068c4;

    /* renamed from: d4 */
    public static yd.s<s> f21069d4 = new a();
    private int U3;
    private boolean V3;
    private c W3;
    private List<q> X3;
    private List<Integer> Y3;
    private int Z3;

    /* renamed from: a4 */
    private byte f21070a4;

    /* renamed from: b4 */
    private int f21071b4;

    /* renamed from: q */
    private final yd.d f21072q;

    /* renamed from: x */
    private int f21073x;

    /* renamed from: y */
    private int f21074y;

    /* loaded from: classes.dex */
    static class a extends yd.b<s> {
        a() {
        }

        /* renamed from: m */
        public s d(yd.e eVar, yd.g gVar) {
            return new s(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<s, b> {
        private int U3;
        private boolean V3;
        private c W3 = c.INV;
        private List<q> X3 = Collections.emptyList();
        private List<Integer> Y3 = Collections.emptyList();

        /* renamed from: x */
        private int f21075x;

        /* renamed from: y */
        private int f21076y;

        private b() {
            E();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f21075x & 32) != 32) {
                this.Y3 = new ArrayList(this.Y3);
                this.f21075x |= 32;
            }
        }

        private void D() {
            if ((this.f21075x & 16) != 16) {
                this.X3 = new ArrayList(this.X3);
                this.f21075x |= 16;
            }
        }

        private void E() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: F */
        public b m(s sVar) {
            if (sVar == s.m0()) {
                return this;
            }
            if (sVar.w0()) {
                I(sVar.o0());
            }
            if (sVar.x0()) {
                J(sVar.p0());
            }
            if (sVar.y0()) {
                K(sVar.q0());
            }
            if (sVar.z0()) {
                L(sVar.v0());
            }
            if (!sVar.X3.isEmpty()) {
                if (this.X3.isEmpty()) {
                    this.X3 = sVar.X3;
                    this.f21075x &= -17;
                } else {
                    D();
                    this.X3.addAll(sVar.X3);
                }
            }
            if (!sVar.Y3.isEmpty()) {
                if (this.Y3.isEmpty()) {
                    this.Y3 = sVar.Y3;
                    this.f21075x &= -33;
                } else {
                    C();
                    this.Y3.addAll(sVar.Y3);
                }
            }
            v(sVar);
            o(l().b(sVar.f21072q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.s.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.s> r1 = rd.s.f21069d4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.s r3 = (rd.s) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.s r4 = (rd.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.s.b.s(yd.e, yd.g):rd.s$b");
        }

        public b I(int i10) {
            this.f21075x |= 1;
            this.f21076y = i10;
            return this;
        }

        public b J(int i10) {
            this.f21075x |= 2;
            this.U3 = i10;
            return this;
        }

        public b K(boolean z10) {
            this.f21075x |= 4;
            this.V3 = z10;
            return this;
        }

        public b L(c cVar) {
            Objects.requireNonNull(cVar);
            this.f21075x |= 8;
            this.W3 = cVar;
            return this;
        }

        /* renamed from: x */
        public s b() {
            s y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public s y() {
            s sVar = new s(this);
            int i10 = this.f21075x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            sVar.f21074y = this.f21076y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            sVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            sVar.V3 = this.V3;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            sVar.W3 = this.W3;
            if ((this.f21075x & 16) == 16) {
                this.X3 = Collections.unmodifiableList(this.X3);
                this.f21075x &= -17;
            }
            sVar.X3 = this.X3;
            if ((this.f21075x & 32) == 32) {
                this.Y3 = Collections.unmodifiableList(this.Y3);
                this.f21075x &= -33;
            }
            sVar.Y3 = this.Y3;
            sVar.f21073x = i11;
            return sVar;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: y */
        private static j.b<c> f21080y = new a();

        /* renamed from: c */
        private final int f21081c;

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
            this.f21081c = i11;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                return null;
            }
            return IN;
        }

        @Override // yd.j.a
        public final int c() {
            return this.f21081c;
        }
    }

    static {
        s sVar = new s(true);
        f21068c4 = sVar;
        sVar.A0();
    }

    private s(yd.e eVar, yd.g gVar) {
        List list;
        Object u10;
        this.Z3 = -1;
        this.f21070a4 = (byte) -1;
        this.f21071b4 = -1;
        A0();
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
                            this.f21073x |= 1;
                            this.f21074y = eVar.s();
                        } else if (K == 16) {
                            this.f21073x |= 2;
                            this.U3 = eVar.s();
                        } else if (K == 24) {
                            this.f21073x |= 4;
                            this.V3 = eVar.k();
                        } else if (K != 32) {
                            if (K == 42) {
                                if (!(z11 & true)) {
                                    this.X3 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.X3;
                                u10 = eVar.u(q.f21020k4, gVar);
                            } else if (K == 48) {
                                if (!(z11 & true)) {
                                    this.Y3 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.Y3;
                                u10 = Integer.valueOf(eVar.s());
                            } else if (K == 50) {
                                int j10 = eVar.j(eVar.A());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.Y3 = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.Y3.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                            list.add(u10);
                        } else {
                            int n10 = eVar.n();
                            c b10 = c.b(n10);
                            if (b10 == null) {
                                J.o0(K);
                                J.o0(n10);
                            } else {
                                this.f21073x |= 8;
                                this.W3 = b10;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.X3 = Collections.unmodifiableList(this.X3);
                    }
                    if (z11 & true) {
                        this.Y3 = Collections.unmodifiableList(this.Y3);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f21072q = r10.i();
                        throw th3;
                    }
                    this.f21072q = r10.i();
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
            this.X3 = Collections.unmodifiableList(this.X3);
        }
        if (z11 & true) {
            this.Y3 = Collections.unmodifiableList(this.Y3);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21072q = r10.i();
            throw th4;
        }
        this.f21072q = r10.i();
        u();
    }

    private s(i.c<s, ?> cVar) {
        super(cVar);
        this.Z3 = -1;
        this.f21070a4 = (byte) -1;
        this.f21071b4 = -1;
        this.f21072q = cVar.l();
    }

    private s(boolean z10) {
        this.Z3 = -1;
        this.f21070a4 = (byte) -1;
        this.f21071b4 = -1;
        this.f21072q = yd.d.f26096c;
    }

    private void A0() {
        this.f21074y = 0;
        this.U3 = 0;
        this.V3 = false;
        this.W3 = c.INV;
        this.X3 = Collections.emptyList();
        this.Y3 = Collections.emptyList();
    }

    public static b B0() {
        return b.B();
    }

    public static b C0(s sVar) {
        return B0().m(sVar);
    }

    public static s m0() {
        return f21068c4;
    }

    /* renamed from: D0 */
    public b h() {
        return B0();
    }

    /* renamed from: E0 */
    public b g() {
        return C0(this);
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f21070a4;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!w0()) {
            this.f21070a4 = (byte) 0;
            return false;
        } else if (!x0()) {
            this.f21070a4 = (byte) 0;
            return false;
        } else {
            for (int i10 = 0; i10 < s0(); i10++) {
                if (!r0(i10).c()) {
                    this.f21070a4 = (byte) 0;
                    return false;
                }
            }
            if (!B()) {
                this.f21070a4 = (byte) 0;
                return false;
            }
            this.f21070a4 = (byte) 1;
            return true;
        }
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f21071b4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f21073x & 1) == 1 ? yd.f.o(1, this.f21074y) + 0 : 0;
        if ((this.f21073x & 2) == 2) {
            o10 += yd.f.o(2, this.U3);
        }
        if ((this.f21073x & 4) == 4) {
            o10 += yd.f.a(3, this.V3);
        }
        if ((this.f21073x & 8) == 8) {
            o10 += yd.f.h(4, this.W3.c());
        }
        for (int i11 = 0; i11 < this.X3.size(); i11++) {
            o10 += yd.f.s(5, this.X3.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.Y3.size(); i13++) {
            i12 += yd.f.p(this.Y3.get(i13).intValue());
        }
        int i14 = o10 + i12;
        if (!t0().isEmpty()) {
            i14 = i14 + 1 + yd.f.p(i12);
        }
        this.Z3 = i12;
        int G = i14 + G() + this.f21072q.size();
        this.f21071b4 = G;
        return G;
    }

    @Override // yd.i, yd.q
    public yd.s<s> i() {
        return f21069d4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f21073x & 1) == 1) {
            fVar.a0(1, this.f21074y);
        }
        if ((this.f21073x & 2) == 2) {
            fVar.a0(2, this.U3);
        }
        if ((this.f21073x & 4) == 4) {
            fVar.L(3, this.V3);
        }
        if ((this.f21073x & 8) == 8) {
            fVar.S(4, this.W3.c());
        }
        for (int i10 = 0; i10 < this.X3.size(); i10++) {
            fVar.d0(5, this.X3.get(i10));
        }
        if (t0().size() > 0) {
            fVar.o0(50);
            fVar.o0(this.Z3);
        }
        for (int i11 = 0; i11 < this.Y3.size(); i11++) {
            fVar.b0(this.Y3.get(i11).intValue());
        }
        W.a(1000, fVar);
        fVar.i0(this.f21072q);
    }

    /* renamed from: n0 */
    public s f() {
        return f21068c4;
    }

    public int o0() {
        return this.f21074y;
    }

    public int p0() {
        return this.U3;
    }

    public boolean q0() {
        return this.V3;
    }

    public q r0(int i10) {
        return this.X3.get(i10);
    }

    public int s0() {
        return this.X3.size();
    }

    public List<Integer> t0() {
        return this.Y3;
    }

    public List<q> u0() {
        return this.X3;
    }

    public c v0() {
        return this.W3;
    }

    public boolean w0() {
        return (this.f21073x & 1) == 1;
    }

    public boolean x0() {
        return (this.f21073x & 2) == 2;
    }

    public boolean y0() {
        return (this.f21073x & 4) == 4;
    }

    public boolean z0() {
        return (this.f21073x & 8) == 8;
    }
}
