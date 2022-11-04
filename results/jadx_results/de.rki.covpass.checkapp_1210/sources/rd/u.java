package rd;

import java.io.IOException;
import rd.q;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class u extends i.d<u> {

    /* renamed from: b4 */
    private static final u f21089b4;

    /* renamed from: c4 */
    public static yd.s<u> f21090c4 = new a();
    private int U3;
    private q V3;
    private int W3;
    private q X3;
    private int Y3;
    private byte Z3;

    /* renamed from: a4 */
    private int f21091a4;

    /* renamed from: q */
    private final yd.d f21092q;

    /* renamed from: x */
    private int f21093x;

    /* renamed from: y */
    private int f21094y;

    /* loaded from: classes.dex */
    static class a extends yd.b<u> {
        a() {
        }

        /* renamed from: m */
        public u d(yd.e eVar, yd.g gVar) {
            return new u(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<u, b> {
        private int U3;
        private int W3;
        private int Y3;

        /* renamed from: x */
        private int f21095x;

        /* renamed from: y */
        private int f21096y;
        private q V3 = q.z0();
        private q X3 = q.z0();

        private b() {
            C();
        }

        public static b B() {
            return new b();
        }

        private void C() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: D */
        public b m(u uVar) {
            if (uVar == u.k0()) {
                return this;
            }
            if (uVar.s0()) {
                I(uVar.m0());
            }
            if (uVar.t0()) {
                J(uVar.n0());
            }
            if (uVar.u0()) {
                F(uVar.o0());
            }
            if (uVar.v0()) {
                K(uVar.p0());
            }
            if (uVar.w0()) {
                H(uVar.q0());
            }
            if (uVar.x0()) {
                L(uVar.r0());
            }
            v(uVar);
            o(l().b(uVar.f21092q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.u.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.u> r1 = rd.u.f21090c4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.u r3 = (rd.u) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.u r4 = (rd.u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.u.b.s(yd.e, yd.g):rd.u$b");
        }

        public b F(q qVar) {
            if ((this.f21095x & 4) == 4 && this.V3 != q.z0()) {
                qVar = q.a1(this.V3).m(qVar).y();
            }
            this.V3 = qVar;
            this.f21095x |= 4;
            return this;
        }

        public b H(q qVar) {
            if ((this.f21095x & 16) == 16 && this.X3 != q.z0()) {
                qVar = q.a1(this.X3).m(qVar).y();
            }
            this.X3 = qVar;
            this.f21095x |= 16;
            return this;
        }

        public b I(int i10) {
            this.f21095x |= 1;
            this.f21096y = i10;
            return this;
        }

        public b J(int i10) {
            this.f21095x |= 2;
            this.U3 = i10;
            return this;
        }

        public b K(int i10) {
            this.f21095x |= 8;
            this.W3 = i10;
            return this;
        }

        public b L(int i10) {
            this.f21095x |= 32;
            this.Y3 = i10;
            return this;
        }

        /* renamed from: x */
        public u b() {
            u y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public u y() {
            u uVar = new u(this);
            int i10 = this.f21095x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            uVar.f21094y = this.f21096y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            uVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            uVar.V3 = this.V3;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            uVar.W3 = this.W3;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            uVar.X3 = this.X3;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            uVar.Y3 = this.Y3;
            uVar.f21093x = i11;
            return uVar;
        }
    }

    static {
        u uVar = new u(true);
        f21089b4 = uVar;
        uVar.y0();
    }

    private u(yd.e eVar, yd.g gVar) {
        this.Z3 = (byte) -1;
        this.f21091a4 = -1;
        y0();
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
                                this.f21093x |= 1;
                                this.f21094y = eVar.s();
                            } else if (K != 16) {
                                q.c cVar = null;
                                if (K == 26) {
                                    cVar = (this.f21093x & 4) == 4 ? this.V3.g() : cVar;
                                    q qVar = (q) eVar.u(q.f21020k4, gVar);
                                    this.V3 = qVar;
                                    if (cVar != null) {
                                        cVar.m(qVar);
                                        this.V3 = cVar.y();
                                    }
                                    this.f21093x |= 4;
                                } else if (K == 34) {
                                    cVar = (this.f21093x & 16) == 16 ? this.X3.g() : cVar;
                                    q qVar2 = (q) eVar.u(q.f21020k4, gVar);
                                    this.X3 = qVar2;
                                    if (cVar != null) {
                                        cVar.m(qVar2);
                                        this.X3 = cVar.y();
                                    }
                                    this.f21093x |= 16;
                                } else if (K == 40) {
                                    this.f21093x |= 8;
                                    this.W3 = eVar.s();
                                } else if (K == 48) {
                                    this.f21093x |= 32;
                                    this.Y3 = eVar.s();
                                } else if (!y(eVar, J, gVar, K)) {
                                }
                            } else {
                                this.f21093x |= 2;
                                this.U3 = eVar.s();
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
                    this.f21092q = r10.i();
                    throw th3;
                }
                this.f21092q = r10.i();
                u();
                throw th2;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21092q = r10.i();
            throw th4;
        }
        this.f21092q = r10.i();
        u();
    }

    private u(i.c<u, ?> cVar) {
        super(cVar);
        this.Z3 = (byte) -1;
        this.f21091a4 = -1;
        this.f21092q = cVar.l();
    }

    private u(boolean z10) {
        this.Z3 = (byte) -1;
        this.f21091a4 = -1;
        this.f21092q = yd.d.f26096c;
    }

    public static b A0(u uVar) {
        return z0().m(uVar);
    }

    public static u k0() {
        return f21089b4;
    }

    private void y0() {
        this.f21094y = 0;
        this.U3 = 0;
        this.V3 = q.z0();
        this.W3 = 0;
        this.X3 = q.z0();
        this.Y3 = 0;
    }

    public static b z0() {
        return b.B();
    }

    /* renamed from: B0 */
    public b h() {
        return z0();
    }

    /* renamed from: C0 */
    public b g() {
        return A0(this);
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.Z3;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!t0()) {
            this.Z3 = (byte) 0;
            return false;
        } else if (u0() && !o0().c()) {
            this.Z3 = (byte) 0;
            return false;
        } else if (w0() && !q0().c()) {
            this.Z3 = (byte) 0;
            return false;
        } else if (!B()) {
            this.Z3 = (byte) 0;
            return false;
        } else {
            this.Z3 = (byte) 1;
            return true;
        }
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f21091a4;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        if ((this.f21093x & 1) == 1) {
            i11 = 0 + yd.f.o(1, this.f21094y);
        }
        if ((this.f21093x & 2) == 2) {
            i11 += yd.f.o(2, this.U3);
        }
        if ((this.f21093x & 4) == 4) {
            i11 += yd.f.s(3, this.V3);
        }
        if ((this.f21093x & 16) == 16) {
            i11 += yd.f.s(4, this.X3);
        }
        if ((this.f21093x & 8) == 8) {
            i11 += yd.f.o(5, this.W3);
        }
        if ((this.f21093x & 32) == 32) {
            i11 += yd.f.o(6, this.Y3);
        }
        int G = i11 + G() + this.f21092q.size();
        this.f21091a4 = G;
        return G;
    }

    @Override // yd.i, yd.q
    public yd.s<u> i() {
        return f21090c4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f21093x & 1) == 1) {
            fVar.a0(1, this.f21094y);
        }
        if ((this.f21093x & 2) == 2) {
            fVar.a0(2, this.U3);
        }
        if ((this.f21093x & 4) == 4) {
            fVar.d0(3, this.V3);
        }
        if ((this.f21093x & 16) == 16) {
            fVar.d0(4, this.X3);
        }
        if ((this.f21093x & 8) == 8) {
            fVar.a0(5, this.W3);
        }
        if ((this.f21093x & 32) == 32) {
            fVar.a0(6, this.Y3);
        }
        W.a(200, fVar);
        fVar.i0(this.f21092q);
    }

    /* renamed from: l0 */
    public u f() {
        return f21089b4;
    }

    public int m0() {
        return this.f21094y;
    }

    public int n0() {
        return this.U3;
    }

    public q o0() {
        return this.V3;
    }

    public int p0() {
        return this.W3;
    }

    public q q0() {
        return this.X3;
    }

    public int r0() {
        return this.Y3;
    }

    public boolean s0() {
        return (this.f21093x & 1) == 1;
    }

    public boolean t0() {
        return (this.f21093x & 2) == 2;
    }

    public boolean u0() {
        return (this.f21093x & 4) == 4;
    }

    public boolean v0() {
        return (this.f21093x & 8) == 8;
    }

    public boolean w0() {
        return (this.f21093x & 16) == 16;
    }

    public boolean x0() {
        return (this.f21093x & 32) == 32;
    }
}
