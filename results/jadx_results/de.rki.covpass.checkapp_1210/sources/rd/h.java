package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import rd.q;
import yd.a;
import yd.d;
import yd.i;
import yd.j;
/* loaded from: classes.dex */
public final class h extends yd.i implements yd.r {

    /* renamed from: b4 */
    private static final h f20907b4;

    /* renamed from: c4 */
    public static yd.s<h> f20908c4 = new a();
    private c U3;
    private q V3;
    private int W3;
    private List<h> X3;
    private List<h> Y3;
    private byte Z3;

    /* renamed from: a4 */
    private int f20909a4;

    /* renamed from: d */
    private final yd.d f20910d;

    /* renamed from: q */
    private int f20911q;

    /* renamed from: x */
    private int f20912x;

    /* renamed from: y */
    private int f20913y;

    /* loaded from: classes.dex */
    static class a extends yd.b<h> {
        a() {
        }

        /* renamed from: m */
        public h d(yd.e eVar, yd.g gVar) {
            return new h(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<h, b> implements yd.r {
        private int V3;

        /* renamed from: d */
        private int f20914d;

        /* renamed from: q */
        private int f20915q;

        /* renamed from: x */
        private int f20916x;

        /* renamed from: y */
        private c f20917y = c.TRUE;
        private q U3 = q.z0();
        private List<h> W3 = Collections.emptyList();
        private List<h> X3 = Collections.emptyList();

        private b() {
            A();
        }

        private void A() {
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f20914d & 32) != 32) {
                this.W3 = new ArrayList(this.W3);
                this.f20914d |= 32;
            }
        }

        private void y() {
            if ((this.f20914d & 64) != 64) {
                this.X3 = new ArrayList(this.X3);
                this.f20914d |= 64;
            }
        }

        /* renamed from: B */
        public b m(h hVar) {
            if (hVar == h.h0()) {
                return this;
            }
            if (hVar.p0()) {
                F(hVar.i0());
            }
            if (hVar.s0()) {
                I(hVar.n0());
            }
            if (hVar.o0()) {
                E(hVar.g0());
            }
            if (hVar.q0()) {
                D(hVar.j0());
            }
            if (hVar.r0()) {
                H(hVar.k0());
            }
            if (!hVar.X3.isEmpty()) {
                if (this.W3.isEmpty()) {
                    this.W3 = hVar.X3;
                    this.f20914d &= -33;
                } else {
                    x();
                    this.W3.addAll(hVar.X3);
                }
            }
            if (!hVar.Y3.isEmpty()) {
                if (this.X3.isEmpty()) {
                    this.X3 = hVar.Y3;
                    this.f20914d &= -65;
                } else {
                    y();
                    this.X3.addAll(hVar.Y3);
                }
            }
            o(l().b(hVar.f20910d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.h.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.h> r1 = rd.h.f20908c4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.h r3 = (rd.h) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.h r4 = (rd.h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.h.b.s(yd.e, yd.g):rd.h$b");
        }

        public b D(q qVar) {
            if ((this.f20914d & 8) == 8 && this.U3 != q.z0()) {
                qVar = q.a1(this.U3).m(qVar).y();
            }
            this.U3 = qVar;
            this.f20914d |= 8;
            return this;
        }

        public b E(c cVar) {
            Objects.requireNonNull(cVar);
            this.f20914d |= 4;
            this.f20917y = cVar;
            return this;
        }

        public b F(int i10) {
            this.f20914d |= 1;
            this.f20915q = i10;
            return this;
        }

        public b H(int i10) {
            this.f20914d |= 16;
            this.V3 = i10;
            return this;
        }

        public b I(int i10) {
            this.f20914d |= 2;
            this.f20916x = i10;
            return this;
        }

        /* renamed from: q */
        public h b() {
            h t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public h t() {
            h hVar = new h(this);
            int i10 = this.f20914d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            hVar.f20912x = this.f20915q;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            hVar.f20913y = this.f20916x;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            hVar.U3 = this.f20917y;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            hVar.V3 = this.U3;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            hVar.W3 = this.V3;
            if ((this.f20914d & 32) == 32) {
                this.W3 = Collections.unmodifiableList(this.W3);
                this.f20914d &= -33;
            }
            hVar.X3 = this.W3;
            if ((this.f20914d & 64) == 64) {
                this.X3 = Collections.unmodifiableList(this.X3);
                this.f20914d &= -65;
            }
            hVar.Y3 = this.X3;
            hVar.f20911q = i11;
            return hVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    /* loaded from: classes.dex */
    public enum c implements j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: y */
        private static j.b<c> f20921y = new a();

        /* renamed from: c */
        private final int f20922c;

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
            this.f20922c = i11;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return FALSE;
                }
                if (i10 == 2) {
                    return NULL;
                }
                return null;
            }
            return TRUE;
        }

        @Override // yd.j.a
        public final int c() {
            return this.f20922c;
        }
    }

    static {
        h hVar = new h(true);
        f20907b4 = hVar;
        hVar.t0();
    }

    private h(yd.e eVar, yd.g gVar) {
        List list;
        yd.q u10;
        this.Z3 = (byte) -1;
        this.f20909a4 = -1;
        t0();
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
                            if (K == 8) {
                                this.f20911q |= 1;
                                this.f20912x = eVar.s();
                            } else if (K == 16) {
                                this.f20911q |= 2;
                                this.f20913y = eVar.s();
                            } else if (K == 24) {
                                int n10 = eVar.n();
                                c b10 = c.b(n10);
                                if (b10 == null) {
                                    J.o0(K);
                                    J.o0(n10);
                                } else {
                                    this.f20911q |= 4;
                                    this.U3 = b10;
                                }
                            } else if (K == 34) {
                                q.c g10 = (this.f20911q & 8) == 8 ? this.V3.g() : null;
                                q qVar = (q) eVar.u(q.f21020k4, gVar);
                                this.V3 = qVar;
                                if (g10 != null) {
                                    g10.m(qVar);
                                    this.V3 = g10.y();
                                }
                                this.f20911q |= 8;
                            } else if (K != 40) {
                                if (K == 50) {
                                    if (!(z11 & true)) {
                                        this.X3 = new ArrayList();
                                        z11 |= true;
                                    }
                                    list = this.X3;
                                    u10 = eVar.u(f20908c4, gVar);
                                } else if (K == 58) {
                                    if (!(z11 & true)) {
                                        this.Y3 = new ArrayList();
                                        z11 |= true;
                                    }
                                    list = this.Y3;
                                    u10 = eVar.u(f20908c4, gVar);
                                } else if (!y(eVar, J, gVar, K)) {
                                }
                                list.add(u10);
                            } else {
                                this.f20911q |= 16;
                                this.W3 = eVar.s();
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
                    this.X3 = Collections.unmodifiableList(this.X3);
                }
                if (z11 & true) {
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20910d = r10.i();
                    throw th3;
                }
                this.f20910d = r10.i();
                u();
                throw th2;
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
            this.f20910d = r10.i();
            throw th4;
        }
        this.f20910d = r10.i();
        u();
    }

    private h(i.b bVar) {
        super(bVar);
        this.Z3 = (byte) -1;
        this.f20909a4 = -1;
        this.f20910d = bVar.l();
    }

    private h(boolean z10) {
        this.Z3 = (byte) -1;
        this.f20909a4 = -1;
        this.f20910d = yd.d.f26096c;
    }

    public static h h0() {
        return f20907b4;
    }

    private void t0() {
        this.f20912x = 0;
        this.f20913y = 0;
        this.U3 = c.TRUE;
        this.V3 = q.z0();
        this.W3 = 0;
        this.X3 = Collections.emptyList();
        this.Y3 = Collections.emptyList();
    }

    public static b u0() {
        return b.w();
    }

    public static b v0(h hVar) {
        return u0().m(hVar);
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
        if (q0() && !j0().c()) {
            this.Z3 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < f0(); i10++) {
            if (!e0(i10).c()) {
                this.Z3 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < m0(); i11++) {
            if (!l0(i11).c()) {
                this.Z3 = (byte) 0;
                return false;
            }
        }
        this.Z3 = (byte) 1;
        return true;
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f20909a4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f20911q & 1) == 1 ? yd.f.o(1, this.f20912x) + 0 : 0;
        if ((this.f20911q & 2) == 2) {
            o10 += yd.f.o(2, this.f20913y);
        }
        if ((this.f20911q & 4) == 4) {
            o10 += yd.f.h(3, this.U3.c());
        }
        if ((this.f20911q & 8) == 8) {
            o10 += yd.f.s(4, this.V3);
        }
        if ((this.f20911q & 16) == 16) {
            o10 += yd.f.o(5, this.W3);
        }
        for (int i11 = 0; i11 < this.X3.size(); i11++) {
            o10 += yd.f.s(6, this.X3.get(i11));
        }
        for (int i12 = 0; i12 < this.Y3.size(); i12++) {
            o10 += yd.f.s(7, this.Y3.get(i12));
        }
        int size = o10 + this.f20910d.size();
        this.f20909a4 = size;
        return size;
    }

    public h e0(int i10) {
        return this.X3.get(i10);
    }

    public int f0() {
        return this.X3.size();
    }

    public c g0() {
        return this.U3;
    }

    @Override // yd.i, yd.q
    public yd.s<h> i() {
        return f20908c4;
    }

    public int i0() {
        return this.f20912x;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        if ((this.f20911q & 1) == 1) {
            fVar.a0(1, this.f20912x);
        }
        if ((this.f20911q & 2) == 2) {
            fVar.a0(2, this.f20913y);
        }
        if ((this.f20911q & 4) == 4) {
            fVar.S(3, this.U3.c());
        }
        if ((this.f20911q & 8) == 8) {
            fVar.d0(4, this.V3);
        }
        if ((this.f20911q & 16) == 16) {
            fVar.a0(5, this.W3);
        }
        for (int i10 = 0; i10 < this.X3.size(); i10++) {
            fVar.d0(6, this.X3.get(i10));
        }
        for (int i11 = 0; i11 < this.Y3.size(); i11++) {
            fVar.d0(7, this.Y3.get(i11));
        }
        fVar.i0(this.f20910d);
    }

    public q j0() {
        return this.V3;
    }

    public int k0() {
        return this.W3;
    }

    public h l0(int i10) {
        return this.Y3.get(i10);
    }

    public int m0() {
        return this.Y3.size();
    }

    public int n0() {
        return this.f20913y;
    }

    public boolean o0() {
        return (this.f20911q & 4) == 4;
    }

    public boolean p0() {
        return (this.f20911q & 1) == 1;
    }

    public boolean q0() {
        return (this.f20911q & 8) == 8;
    }

    public boolean r0() {
        return (this.f20911q & 16) == 16;
    }

    public boolean s0() {
        return (this.f20911q & 2) == 2;
    }

    /* renamed from: w0 */
    public b h() {
        return u0();
    }

    /* renamed from: x0 */
    public b g() {
        return v0(this);
    }
}
