package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class t extends yd.i implements yd.r {
    private static final t W3;
    public static yd.s<t> X3 = new a();
    private byte U3;
    private int V3;

    /* renamed from: d */
    private final yd.d f21082d;

    /* renamed from: q */
    private int f21083q;

    /* renamed from: x */
    private List<q> f21084x;

    /* renamed from: y */
    private int f21085y;

    /* loaded from: classes.dex */
    static class a extends yd.b<t> {
        a() {
        }

        /* renamed from: m */
        public t d(yd.e eVar, yd.g gVar) {
            return new t(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<t, b> implements yd.r {

        /* renamed from: d */
        private int f21086d;

        /* renamed from: q */
        private List<q> f21087q = Collections.emptyList();

        /* renamed from: x */
        private int f21088x = -1;

        private b() {
            y();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f21086d & 1) != 1) {
                this.f21087q = new ArrayList(this.f21087q);
                this.f21086d |= 1;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public b m(t tVar) {
            if (tVar == t.N()) {
                return this;
            }
            if (!tVar.f21084x.isEmpty()) {
                if (this.f21087q.isEmpty()) {
                    this.f21087q = tVar.f21084x;
                    this.f21086d &= -2;
                } else {
                    x();
                    this.f21087q.addAll(tVar.f21084x);
                }
            }
            if (tVar.d0()) {
                C(tVar.V());
            }
            o(l().b(tVar.f21082d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.t.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.t> r1 = rd.t.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.t r3 = (rd.t) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.t r4 = (rd.t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.t.b.s(yd.e, yd.g):rd.t$b");
        }

        public b C(int i10) {
            this.f21086d |= 2;
            this.f21088x = i10;
            return this;
        }

        /* renamed from: q */
        public t b() {
            t t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public t t() {
            t tVar = new t(this);
            int i10 = this.f21086d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f21087q = Collections.unmodifiableList(this.f21087q);
                this.f21086d &= -2;
            }
            tVar.f21084x = this.f21087q;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            tVar.f21085y = this.f21088x;
            tVar.f21083q = i11;
            return tVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    static {
        t tVar = new t(true);
        W3 = tVar;
        tVar.e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t(yd.e eVar, yd.g gVar) {
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
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!(z11 & true)) {
                                    this.f21084x = new ArrayList();
                                    z11 |= true;
                                }
                                this.f21084x.add(eVar.u(q.f21020k4, gVar));
                            } else if (K == 16) {
                                this.f21083q |= 1;
                                this.f21085y = eVar.s();
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
                    this.f21084x = Collections.unmodifiableList(this.f21084x);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f21082d = r10.i();
                    throw th3;
                }
                this.f21082d = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f21084x = Collections.unmodifiableList(this.f21084x);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21082d = r10.i();
            throw th4;
        }
        this.f21082d = r10.i();
        u();
    }

    private t(i.b bVar) {
        super(bVar);
        this.U3 = (byte) -1;
        this.V3 = -1;
        this.f21082d = bVar.l();
    }

    private t(boolean z10) {
        this.U3 = (byte) -1;
        this.V3 = -1;
        this.f21082d = yd.d.f26096c;
    }

    public static t N() {
        return W3;
    }

    private void e0() {
        this.f21084x = Collections.emptyList();
        this.f21085y = -1;
    }

    public static b f0() {
        return b.w();
    }

    public static b g0(t tVar) {
        return f0().m(tVar);
    }

    public int V() {
        return this.f21085y;
    }

    public q W(int i10) {
        return this.f21084x.get(i10);
    }

    public int b0() {
        return this.f21084x.size();
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
        for (int i10 = 0; i10 < b0(); i10++) {
            if (!W(i10).c()) {
                this.U3 = (byte) 0;
                return false;
            }
        }
        this.U3 = (byte) 1;
        return true;
    }

    public List<q> c0() {
        return this.f21084x;
    }

    public boolean d0() {
        return (this.f21083q & 1) == 1;
    }

    @Override // yd.q
    public int e() {
        int i10 = this.V3;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21084x.size(); i12++) {
            i11 += yd.f.s(1, this.f21084x.get(i12));
        }
        if ((this.f21083q & 1) == 1) {
            i11 += yd.f.o(2, this.f21085y);
        }
        int size = i11 + this.f21082d.size();
        this.V3 = size;
        return size;
    }

    /* renamed from: h0 */
    public b h() {
        return f0();
    }

    @Override // yd.i, yd.q
    public yd.s<t> i() {
        return X3;
    }

    /* renamed from: i0 */
    public b g() {
        return g0(this);
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        for (int i10 = 0; i10 < this.f21084x.size(); i10++) {
            fVar.d0(1, this.f21084x.get(i10));
        }
        if ((this.f21083q & 1) == 1) {
            fVar.a0(2, this.f21085y);
        }
        fVar.i0(this.f21082d);
    }
}
