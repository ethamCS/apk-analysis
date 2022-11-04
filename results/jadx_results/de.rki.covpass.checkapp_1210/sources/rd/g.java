package rd;

import java.io.IOException;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class g extends i.d<g> {
    private static final g W3;
    public static yd.s<g> X3 = new a();
    private byte U3;
    private int V3;

    /* renamed from: q */
    private final yd.d f20902q;

    /* renamed from: x */
    private int f20903x;

    /* renamed from: y */
    private int f20904y;

    /* loaded from: classes.dex */
    static class a extends yd.b<g> {
        a() {
        }

        /* renamed from: m */
        public g d(yd.e eVar, yd.g gVar) {
            return new g(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<g, b> {

        /* renamed from: x */
        private int f20905x;

        /* renamed from: y */
        private int f20906y;

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
        public b m(g gVar) {
            if (gVar == g.f0()) {
                return this;
            }
            if (gVar.i0()) {
                F(gVar.h0());
            }
            v(gVar);
            o(l().b(gVar.f20902q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.g.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.g> r1 = rd.g.X3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.g r3 = (rd.g) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.g r4 = (rd.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.g.b.s(yd.e, yd.g):rd.g$b");
        }

        public b F(int i10) {
            this.f20905x |= 1;
            this.f20906y = i10;
            return this;
        }

        /* renamed from: x */
        public g b() {
            g y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public g y() {
            g gVar = new g(this);
            int i10 = 1;
            if ((this.f20905x & 1) != 1) {
                i10 = 0;
            }
            gVar.f20904y = this.f20906y;
            gVar.f20903x = i10;
            return gVar;
        }
    }

    static {
        g gVar = new g(true);
        W3 = gVar;
        gVar.j0();
    }

    private g(yd.e eVar, yd.g gVar) {
        this.U3 = (byte) -1;
        this.V3 = -1;
        j0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f20903x |= 1;
                            this.f20904y = eVar.s();
                        } else if (!y(eVar, J, gVar, K)) {
                        }
                    }
                    z10 = true;
                } catch (yd.k e10) {
                    throw e10.k(this);
                } catch (IOException e11) {
                    throw new yd.k(e11.getMessage()).k(this);
                }
            } catch (Throwable th2) {
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20902q = r10.i();
                    throw th3;
                }
                this.f20902q = r10.i();
                u();
                throw th2;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f20902q = r10.i();
            throw th4;
        }
        this.f20902q = r10.i();
        u();
    }

    private g(i.c<g, ?> cVar) {
        super(cVar);
        this.U3 = (byte) -1;
        this.V3 = -1;
        this.f20902q = cVar.l();
    }

    private g(boolean z10) {
        this.U3 = (byte) -1;
        this.V3 = -1;
        this.f20902q = yd.d.f26096c;
    }

    public static g f0() {
        return W3;
    }

    private void j0() {
        this.f20904y = 0;
    }

    public static b k0() {
        return b.B();
    }

    public static b l0(g gVar) {
        return k0().m(gVar);
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
        if (!B()) {
            this.U3 = (byte) 0;
            return false;
        }
        this.U3 = (byte) 1;
        return true;
    }

    @Override // yd.q
    public int e() {
        int i10 = this.V3;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        if ((this.f20903x & 1) == 1) {
            i11 = 0 + yd.f.o(1, this.f20904y);
        }
        int G = i11 + G() + this.f20902q.size();
        this.V3 = G;
        return G;
    }

    /* renamed from: g0 */
    public g f() {
        return W3;
    }

    public int h0() {
        return this.f20904y;
    }

    @Override // yd.i, yd.q
    public yd.s<g> i() {
        return X3;
    }

    public boolean i0() {
        return (this.f20903x & 1) == 1;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f20903x & 1) == 1) {
            fVar.a0(1, this.f20904y);
        }
        W.a(200, fVar);
        fVar.i0(this.f20902q);
    }

    /* renamed from: m0 */
    public b h() {
        return k0();
    }

    /* renamed from: n0 */
    public b g() {
        return l0(this);
    }
}
