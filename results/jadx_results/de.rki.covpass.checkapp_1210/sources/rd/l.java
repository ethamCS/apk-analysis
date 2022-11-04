package rd;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rd.t;
import rd.w;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class l extends i.d<l> {

    /* renamed from: a4 */
    private static final l f20957a4;

    /* renamed from: b4 */
    public static yd.s<l> f20958b4 = new a();
    private List<n> U3;
    private List<r> V3;
    private t W3;
    private w X3;
    private byte Y3;
    private int Z3;

    /* renamed from: q */
    private final yd.d f20959q;

    /* renamed from: x */
    private int f20960x;

    /* renamed from: y */
    private List<i> f20961y;

    /* loaded from: classes.dex */
    static class a extends yd.b<l> {
        a() {
        }

        /* renamed from: m */
        public l d(yd.e eVar, yd.g gVar) {
            return new l(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<l, b> {

        /* renamed from: x */
        private int f20962x;

        /* renamed from: y */
        private List<i> f20963y = Collections.emptyList();
        private List<n> U3 = Collections.emptyList();
        private List<r> V3 = Collections.emptyList();
        private t W3 = t.N();
        private w X3 = w.I();

        private b() {
            F();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f20962x & 1) != 1) {
                this.f20963y = new ArrayList(this.f20963y);
                this.f20962x |= 1;
            }
        }

        private void D() {
            if ((this.f20962x & 2) != 2) {
                this.U3 = new ArrayList(this.U3);
                this.f20962x |= 2;
            }
        }

        private void E() {
            if ((this.f20962x & 4) != 4) {
                this.V3 = new ArrayList(this.V3);
                this.f20962x |= 4;
            }
        }

        private void F() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: H */
        public b m(l lVar) {
            if (lVar == l.m0()) {
                return this;
            }
            if (!lVar.f20961y.isEmpty()) {
                if (this.f20963y.isEmpty()) {
                    this.f20963y = lVar.f20961y;
                    this.f20962x &= -2;
                } else {
                    C();
                    this.f20963y.addAll(lVar.f20961y);
                }
            }
            if (!lVar.U3.isEmpty()) {
                if (this.U3.isEmpty()) {
                    this.U3 = lVar.U3;
                    this.f20962x &= -3;
                } else {
                    D();
                    this.U3.addAll(lVar.U3);
                }
            }
            if (!lVar.V3.isEmpty()) {
                if (this.V3.isEmpty()) {
                    this.V3 = lVar.V3;
                    this.f20962x &= -5;
                } else {
                    E();
                    this.V3.addAll(lVar.V3);
                }
            }
            if (lVar.z0()) {
                J(lVar.x0());
            }
            if (lVar.A0()) {
                K(lVar.y0());
            }
            v(lVar);
            o(l().b(lVar.f20959q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.l.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.l> r1 = rd.l.f20958b4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.l r3 = (rd.l) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.l r4 = (rd.l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.l.b.s(yd.e, yd.g):rd.l$b");
        }

        public b J(t tVar) {
            if ((this.f20962x & 8) == 8 && this.W3 != t.N()) {
                tVar = t.g0(this.W3).m(tVar).t();
            }
            this.W3 = tVar;
            this.f20962x |= 8;
            return this;
        }

        public b K(w wVar) {
            if ((this.f20962x & 16) == 16 && this.X3 != w.I()) {
                wVar = w.b0(this.X3).m(wVar).t();
            }
            this.X3 = wVar;
            this.f20962x |= 16;
            return this;
        }

        /* renamed from: x */
        public l b() {
            l y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public l y() {
            l lVar = new l(this);
            int i10 = this.f20962x;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f20963y = Collections.unmodifiableList(this.f20963y);
                this.f20962x &= -2;
            }
            lVar.f20961y = this.f20963y;
            if ((this.f20962x & 2) == 2) {
                this.U3 = Collections.unmodifiableList(this.U3);
                this.f20962x &= -3;
            }
            lVar.U3 = this.U3;
            if ((this.f20962x & 4) == 4) {
                this.V3 = Collections.unmodifiableList(this.V3);
                this.f20962x &= -5;
            }
            lVar.V3 = this.V3;
            if ((i10 & 8) != 8) {
                i11 = 0;
            }
            lVar.W3 = this.W3;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            lVar.X3 = this.X3;
            lVar.f20960x = i11;
            return lVar;
        }
    }

    static {
        l lVar = new l(true);
        f20957a4 = lVar;
        lVar.B0();
    }

    private l(yd.e eVar, yd.g gVar) {
        List list;
        yd.q u10;
        this.Y3 = (byte) -1;
        this.Z3 = -1;
        B0();
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
                            if (K == 26) {
                                boolean z12 = z11 & true;
                                boolean z13 = z11;
                                if (!z12) {
                                    this.f20961y = new ArrayList();
                                    z13 = z11 | true;
                                }
                                list = this.f20961y;
                                u10 = eVar.u(i.f20924l4, gVar);
                                z11 = z13;
                            } else if (K == 34) {
                                boolean z14 = z11 & true;
                                boolean z15 = z11;
                                if (!z14) {
                                    this.U3 = new ArrayList();
                                    z15 = z11 | true;
                                }
                                list = this.U3;
                                u10 = eVar.u(n.f20971l4, gVar);
                                z11 = z15;
                            } else if (K != 42) {
                                w.b bVar = null;
                                t.b g10 = null;
                                if (K == 242) {
                                    g10 = (this.f20960x & 1) == 1 ? this.W3.g() : g10;
                                    t tVar = (t) eVar.u(t.X3, gVar);
                                    this.W3 = tVar;
                                    if (g10 != null) {
                                        g10.m(tVar);
                                        this.W3 = g10.t();
                                    }
                                    this.f20960x |= 1;
                                } else if (K == 258) {
                                    bVar = (this.f20960x & 2) == 2 ? this.X3.g() : bVar;
                                    w wVar = (w) eVar.u(w.V3, gVar);
                                    this.X3 = wVar;
                                    if (bVar != null) {
                                        bVar.m(wVar);
                                        this.X3 = bVar.t();
                                    }
                                    this.f20960x |= 2;
                                } else if (!y(eVar, J, gVar, K)) {
                                }
                            } else {
                                boolean z16 = z11 & true;
                                boolean z17 = z11;
                                if (!z16) {
                                    this.V3 = new ArrayList();
                                    z17 = z11 | true;
                                }
                                list = this.V3;
                                u10 = eVar.u(r.f21056f4, gVar);
                                z11 = z17;
                            }
                            list.add(u10);
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
                    this.f20961y = Collections.unmodifiableList(this.f20961y);
                }
                if (z11 & true) {
                    this.U3 = Collections.unmodifiableList(this.U3);
                }
                if (z11 & true) {
                    this.V3 = Collections.unmodifiableList(this.V3);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20959q = r10.i();
                    throw th3;
                }
                this.f20959q = r10.i();
                u();
                throw th2;
            }
        }
        boolean z18 = z11 ? 1 : 0;
        boolean z19 = z11 ? 1 : 0;
        boolean z20 = z11 ? 1 : 0;
        boolean z21 = z11 ? 1 : 0;
        boolean z22 = z11 ? 1 : 0;
        boolean z23 = z11 ? 1 : 0;
        boolean z24 = z11 ? 1 : 0;
        boolean z25 = z11 ? 1 : 0;
        boolean z26 = z11 ? 1 : 0;
        if (z18 & true) {
            this.f20961y = Collections.unmodifiableList(this.f20961y);
        }
        if (z11 & true) {
            this.U3 = Collections.unmodifiableList(this.U3);
        }
        if (z11 & true) {
            this.V3 = Collections.unmodifiableList(this.V3);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20959q = r10.i();
            throw th4;
        }
        this.f20959q = r10.i();
        u();
    }

    private l(i.c<l, ?> cVar) {
        super(cVar);
        this.Y3 = (byte) -1;
        this.Z3 = -1;
        this.f20959q = cVar.l();
    }

    private l(boolean z10) {
        this.Y3 = (byte) -1;
        this.Z3 = -1;
        this.f20959q = yd.d.f26096c;
    }

    private void B0() {
        this.f20961y = Collections.emptyList();
        this.U3 = Collections.emptyList();
        this.V3 = Collections.emptyList();
        this.W3 = t.N();
        this.X3 = w.I();
    }

    public static b C0() {
        return b.B();
    }

    public static b D0(l lVar) {
        return C0().m(lVar);
    }

    public static l F0(InputStream inputStream, yd.g gVar) {
        return f20958b4.c(inputStream, gVar);
    }

    public static l m0() {
        return f20957a4;
    }

    public boolean A0() {
        return (this.f20960x & 2) == 2;
    }

    /* renamed from: E0 */
    public b h() {
        return C0();
    }

    /* renamed from: G0 */
    public b g() {
        return D0(this);
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
        for (int i10 = 0; i10 < p0(); i10++) {
            if (!o0(i10).c()) {
                this.Y3 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < s0(); i11++) {
            if (!r0(i11).c()) {
                this.Y3 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < v0(); i12++) {
            if (!u0(i12).c()) {
                this.Y3 = (byte) 0;
                return false;
            }
        }
        if (z0() && !x0().c()) {
            this.Y3 = (byte) 0;
            return false;
        } else if (!B()) {
            this.Y3 = (byte) 0;
            return false;
        } else {
            this.Y3 = (byte) 1;
            return true;
        }
    }

    @Override // yd.q
    public int e() {
        int i10 = this.Z3;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f20961y.size(); i12++) {
            i11 += yd.f.s(3, this.f20961y.get(i12));
        }
        for (int i13 = 0; i13 < this.U3.size(); i13++) {
            i11 += yd.f.s(4, this.U3.get(i13));
        }
        for (int i14 = 0; i14 < this.V3.size(); i14++) {
            i11 += yd.f.s(5, this.V3.get(i14));
        }
        if ((this.f20960x & 1) == 1) {
            i11 += yd.f.s(30, this.W3);
        }
        if ((this.f20960x & 2) == 2) {
            i11 += yd.f.s(32, this.X3);
        }
        int G = i11 + G() + this.f20959q.size();
        this.Z3 = G;
        return G;
    }

    @Override // yd.i, yd.q
    public yd.s<l> i() {
        return f20958b4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        for (int i10 = 0; i10 < this.f20961y.size(); i10++) {
            fVar.d0(3, this.f20961y.get(i10));
        }
        for (int i11 = 0; i11 < this.U3.size(); i11++) {
            fVar.d0(4, this.U3.get(i11));
        }
        for (int i12 = 0; i12 < this.V3.size(); i12++) {
            fVar.d0(5, this.V3.get(i12));
        }
        if ((this.f20960x & 1) == 1) {
            fVar.d0(30, this.W3);
        }
        if ((this.f20960x & 2) == 2) {
            fVar.d0(32, this.X3);
        }
        W.a(200, fVar);
        fVar.i0(this.f20959q);
    }

    /* renamed from: n0 */
    public l f() {
        return f20957a4;
    }

    public i o0(int i10) {
        return this.f20961y.get(i10);
    }

    public int p0() {
        return this.f20961y.size();
    }

    public List<i> q0() {
        return this.f20961y;
    }

    public n r0(int i10) {
        return this.U3.get(i10);
    }

    public int s0() {
        return this.U3.size();
    }

    public List<n> t0() {
        return this.U3;
    }

    public r u0(int i10) {
        return this.V3.get(i10);
    }

    public int v0() {
        return this.V3.size();
    }

    public List<r> w0() {
        return this.V3;
    }

    public t x0() {
        return this.W3;
    }

    public w y0() {
        return this.X3;
    }

    public boolean z0() {
        return (this.f20960x & 1) == 1;
    }
}
