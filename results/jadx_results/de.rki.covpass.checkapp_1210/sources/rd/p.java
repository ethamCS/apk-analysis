package rd;

import java.io.IOException;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class p extends yd.i implements yd.r {
    private static final p U3;
    public static yd.s<p> V3 = new a();

    /* renamed from: d */
    private final yd.d f21013d;

    /* renamed from: q */
    private yd.o f21014q;

    /* renamed from: x */
    private byte f21015x;

    /* renamed from: y */
    private int f21016y;

    /* loaded from: classes.dex */
    static class a extends yd.b<p> {
        a() {
        }

        /* renamed from: m */
        public p d(yd.e eVar, yd.g gVar) {
            return new p(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.b<p, b> implements yd.r {

        /* renamed from: d */
        private int f21017d;

        /* renamed from: q */
        private yd.o f21018q = yd.n.f26161d;

        private b() {
            y();
        }

        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f21017d & 1) != 1) {
                this.f21018q = new yd.n(this.f21018q);
                this.f21017d |= 1;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public b m(p pVar) {
            if (pVar == p.I()) {
                return this;
            }
            if (!pVar.f21014q.isEmpty()) {
                if (this.f21018q.isEmpty()) {
                    this.f21018q = pVar.f21014q;
                    this.f21017d &= -2;
                } else {
                    x();
                    this.f21018q.addAll(pVar.f21014q);
                }
            }
            o(l().b(pVar.f21013d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.p.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.p> r1 = rd.p.V3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.p r3 = (rd.p) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.p r4 = (rd.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.p.b.s(yd.e, yd.g):rd.p$b");
        }

        /* renamed from: q */
        public p b() {
            p t10 = t();
            if (t10.c()) {
                return t10;
            }
            throw a.AbstractC0456a.d(t10);
        }

        public p t() {
            p pVar = new p(this);
            if ((this.f21017d & 1) == 1) {
                this.f21018q = this.f21018q.g();
                this.f21017d &= -2;
            }
            pVar.f21014q = this.f21018q;
            return pVar;
        }

        /* renamed from: v */
        public b k() {
            return w().m(t());
        }
    }

    static {
        p pVar = new p(true);
        U3 = pVar;
        pVar.V();
    }

    private p(yd.e eVar, yd.g gVar) {
        this.f21015x = (byte) -1;
        this.f21016y = -1;
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
                                yd.d l10 = eVar.l();
                                if (!(z11 & true)) {
                                    this.f21014q = new yd.n();
                                    z11 |= true;
                                }
                                this.f21014q.v(l10);
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
                    this.f21014q = this.f21014q.g();
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f21013d = r10.i();
                    throw th3;
                }
                this.f21013d = r10.i();
                u();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f21014q = this.f21014q.g();
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f21013d = r10.i();
            throw th4;
        }
        this.f21013d = r10.i();
        u();
    }

    private p(i.b bVar) {
        super(bVar);
        this.f21015x = (byte) -1;
        this.f21016y = -1;
        this.f21013d = bVar.l();
    }

    private p(boolean z10) {
        this.f21015x = (byte) -1;
        this.f21016y = -1;
        this.f21013d = yd.d.f26096c;
    }

    public static p I() {
        return U3;
    }

    private void V() {
        this.f21014q = yd.n.f26161d;
    }

    public static b W() {
        return b.w();
    }

    public static b b0(p pVar) {
        return W().m(pVar);
    }

    public String M(int i10) {
        return this.f21014q.get(i10);
    }

    public yd.t N() {
        return this.f21014q;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f21015x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f21015x = (byte) 1;
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
        int i10 = this.f21016y;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21014q.size(); i12++) {
            i11 += yd.f.e(this.f21014q.x(i12));
        }
        int size = 0 + i11 + (N().size() * 1) + this.f21013d.size();
        this.f21016y = size;
        return size;
    }

    @Override // yd.i, yd.q
    public yd.s<p> i() {
        return V3;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        for (int i10 = 0; i10 < this.f21014q.size(); i10++) {
            fVar.O(1, this.f21014q.x(i10));
        }
        fVar.i0(this.f21013d);
    }
}
