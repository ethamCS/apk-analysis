package rd;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rd.l;
import rd.o;
import rd.p;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class m extends i.d<m> {
    private static final m Z3;

    /* renamed from: a4 */
    public static yd.s<m> f20964a4 = new a();
    private o U3;
    private l V3;
    private List<c> W3;
    private byte X3;
    private int Y3;

    /* renamed from: q */
    private final yd.d f20965q;

    /* renamed from: x */
    private int f20966x;

    /* renamed from: y */
    private p f20967y;

    /* loaded from: classes.dex */
    static class a extends yd.b<m> {
        a() {
        }

        /* renamed from: m */
        public m d(yd.e eVar, yd.g gVar) {
            return new m(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<m, b> {

        /* renamed from: x */
        private int f20968x;

        /* renamed from: y */
        private p f20969y = p.I();
        private o U3 = o.I();
        private l V3 = l.m0();
        private List<c> W3 = Collections.emptyList();

        private b() {
            D();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f20968x & 8) != 8) {
                this.W3 = new ArrayList(this.W3);
                this.f20968x |= 8;
            }
        }

        private void D() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: E */
        public b m(m mVar) {
            if (mVar == m.m0()) {
                return this;
            }
            if (mVar.t0()) {
                J(mVar.q0());
            }
            if (mVar.s0()) {
                I(mVar.p0());
            }
            if (mVar.r0()) {
                H(mVar.o0());
            }
            if (!mVar.W3.isEmpty()) {
                if (this.W3.isEmpty()) {
                    this.W3 = mVar.W3;
                    this.f20968x &= -9;
                } else {
                    C();
                    this.W3.addAll(mVar.W3);
                }
            }
            v(mVar);
            o(l().b(mVar.f20965q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.m.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.m> r1 = rd.m.f20964a4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.m r3 = (rd.m) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.m r4 = (rd.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.m.b.s(yd.e, yd.g):rd.m$b");
        }

        public b H(l lVar) {
            if ((this.f20968x & 4) == 4 && this.V3 != l.m0()) {
                lVar = l.D0(this.V3).m(lVar).y();
            }
            this.V3 = lVar;
            this.f20968x |= 4;
            return this;
        }

        public b I(o oVar) {
            if ((this.f20968x & 2) == 2 && this.U3 != o.I()) {
                oVar = o.b0(this.U3).m(oVar).t();
            }
            this.U3 = oVar;
            this.f20968x |= 2;
            return this;
        }

        public b J(p pVar) {
            if ((this.f20968x & 1) == 1 && this.f20969y != p.I()) {
                pVar = p.b0(this.f20969y).m(pVar).t();
            }
            this.f20969y = pVar;
            this.f20968x |= 1;
            return this;
        }

        /* renamed from: x */
        public m b() {
            m y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public m y() {
            m mVar = new m(this);
            int i10 = this.f20968x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            mVar.f20967y = this.f20969y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            mVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            mVar.V3 = this.V3;
            if ((this.f20968x & 8) == 8) {
                this.W3 = Collections.unmodifiableList(this.W3);
                this.f20968x &= -9;
            }
            mVar.W3 = this.W3;
            mVar.f20966x = i11;
            return mVar;
        }
    }

    static {
        m mVar = new m(true);
        Z3 = mVar;
        mVar.u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(yd.e eVar, yd.g gVar) {
        int i10;
        int i11;
        this.X3 = (byte) -1;
        this.Y3 = -1;
        u0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        o.b bVar = null;
                        p.b g10 = null;
                        l.b g11 = null;
                        if (K != 10) {
                            if (K == 18) {
                                i10 = 2;
                                bVar = (this.f20966x & 2) == 2 ? this.U3.g() : bVar;
                                o oVar = (o) eVar.u(o.V3, gVar);
                                this.U3 = oVar;
                                if (bVar != null) {
                                    bVar.m(oVar);
                                    this.U3 = bVar.t();
                                }
                                i11 = this.f20966x;
                            } else if (K == 26) {
                                i10 = 4;
                                g11 = (this.f20966x & 4) == 4 ? this.V3.g() : g11;
                                l lVar = (l) eVar.u(l.f20958b4, gVar);
                                this.V3 = lVar;
                                if (g11 != null) {
                                    g11.m(lVar);
                                    this.V3 = g11.y();
                                }
                                i11 = this.f20966x;
                            } else if (K == 34) {
                                boolean z12 = z11 & true;
                                z11 = z11;
                                if (!z12) {
                                    this.W3 = new ArrayList();
                                    z11 |= true;
                                }
                                this.W3.add(eVar.u(c.A4, gVar));
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                            this.f20966x = i11 | i10;
                        } else {
                            g10 = (this.f20966x & 1) == 1 ? this.f20967y.g() : g10;
                            p pVar = (p) eVar.u(p.V3, gVar);
                            this.f20967y = pVar;
                            if (g10 != null) {
                                g10.m(pVar);
                                this.f20967y = g10.t();
                            }
                            this.f20966x |= 1;
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
                    this.W3 = Collections.unmodifiableList(this.W3);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20965q = r10.i();
                    throw th3;
                }
                this.f20965q = r10.i();
                u();
                throw th2;
            }
        }
        boolean z13 = z11 ? 1 : 0;
        boolean z14 = z11 ? 1 : 0;
        boolean z15 = z11 ? 1 : 0;
        boolean z16 = z11 ? 1 : 0;
        boolean z17 = z11 ? 1 : 0;
        if (z13 & true) {
            this.W3 = Collections.unmodifiableList(this.W3);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20965q = r10.i();
            throw th4;
        }
        this.f20965q = r10.i();
        u();
    }

    private m(i.c<m, ?> cVar) {
        super(cVar);
        this.X3 = (byte) -1;
        this.Y3 = -1;
        this.f20965q = cVar.l();
    }

    private m(boolean z10) {
        this.X3 = (byte) -1;
        this.Y3 = -1;
        this.f20965q = yd.d.f26096c;
    }

    public static m m0() {
        return Z3;
    }

    private void u0() {
        this.f20967y = p.I();
        this.U3 = o.I();
        this.V3 = l.m0();
        this.W3 = Collections.emptyList();
    }

    public static b v0() {
        return b.B();
    }

    public static b w0(m mVar) {
        return v0().m(mVar);
    }

    public static m y0(InputStream inputStream, yd.g gVar) {
        return f20964a4.c(inputStream, gVar);
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.X3;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (s0() && !p0().c()) {
            this.X3 = (byte) 0;
            return false;
        } else if (r0() && !o0().c()) {
            this.X3 = (byte) 0;
            return false;
        } else {
            for (int i10 = 0; i10 < k0(); i10++) {
                if (!j0(i10).c()) {
                    this.X3 = (byte) 0;
                    return false;
                }
            }
            if (!B()) {
                this.X3 = (byte) 0;
                return false;
            }
            this.X3 = (byte) 1;
            return true;
        }
    }

    @Override // yd.q
    public int e() {
        int i10 = this.Y3;
        if (i10 != -1) {
            return i10;
        }
        int s10 = (this.f20966x & 1) == 1 ? yd.f.s(1, this.f20967y) + 0 : 0;
        if ((this.f20966x & 2) == 2) {
            s10 += yd.f.s(2, this.U3);
        }
        if ((this.f20966x & 4) == 4) {
            s10 += yd.f.s(3, this.V3);
        }
        for (int i11 = 0; i11 < this.W3.size(); i11++) {
            s10 += yd.f.s(4, this.W3.get(i11));
        }
        int G = s10 + G() + this.f20965q.size();
        this.Y3 = G;
        return G;
    }

    @Override // yd.i, yd.q
    public yd.s<m> i() {
        return f20964a4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f20966x & 1) == 1) {
            fVar.d0(1, this.f20967y);
        }
        if ((this.f20966x & 2) == 2) {
            fVar.d0(2, this.U3);
        }
        if ((this.f20966x & 4) == 4) {
            fVar.d0(3, this.V3);
        }
        for (int i10 = 0; i10 < this.W3.size(); i10++) {
            fVar.d0(4, this.W3.get(i10));
        }
        W.a(200, fVar);
        fVar.i0(this.f20965q);
    }

    public c j0(int i10) {
        return this.W3.get(i10);
    }

    public int k0() {
        return this.W3.size();
    }

    public List<c> l0() {
        return this.W3;
    }

    /* renamed from: n0 */
    public m f() {
        return Z3;
    }

    public l o0() {
        return this.V3;
    }

    public o p0() {
        return this.U3;
    }

    public p q0() {
        return this.f20967y;
    }

    public boolean r0() {
        return (this.f20966x & 4) == 4;
    }

    public boolean s0() {
        return (this.f20966x & 2) == 2;
    }

    public boolean t0() {
        return (this.f20966x & 1) == 1;
    }

    /* renamed from: x0 */
    public b h() {
        return v0();
    }

    /* renamed from: z0 */
    public b g() {
        return w0(this);
    }
}
