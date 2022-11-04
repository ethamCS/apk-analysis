package rd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class d extends i.d<d> {
    private static final d Y3;
    public static yd.s<d> Z3 = new a();
    private List<u> U3;
    private List<Integer> V3;
    private byte W3;
    private int X3;

    /* renamed from: q */
    private final yd.d f20873q;

    /* renamed from: x */
    private int f20874x;

    /* renamed from: y */
    private int f20875y;

    /* loaded from: classes.dex */
    static class a extends yd.b<d> {
        a() {
        }

        /* renamed from: m */
        public d d(yd.e eVar, yd.g gVar) {
            return new d(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<d, b> {

        /* renamed from: x */
        private int f20876x;

        /* renamed from: y */
        private int f20877y = 6;
        private List<u> U3 = Collections.emptyList();
        private List<Integer> V3 = Collections.emptyList();

        private b() {
            E();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f20876x & 2) != 2) {
                this.U3 = new ArrayList(this.U3);
                this.f20876x |= 2;
            }
        }

        private void D() {
            if ((this.f20876x & 4) != 4) {
                this.V3 = new ArrayList(this.V3);
                this.f20876x |= 4;
            }
        }

        private void E() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: F */
        public b m(d dVar) {
            if (dVar == d.j0()) {
                return this;
            }
            if (dVar.q0()) {
                I(dVar.l0());
            }
            if (!dVar.U3.isEmpty()) {
                if (this.U3.isEmpty()) {
                    this.U3 = dVar.U3;
                    this.f20876x &= -3;
                } else {
                    C();
                    this.U3.addAll(dVar.U3);
                }
            }
            if (!dVar.V3.isEmpty()) {
                if (this.V3.isEmpty()) {
                    this.V3 = dVar.V3;
                    this.f20876x &= -5;
                } else {
                    D();
                    this.V3.addAll(dVar.V3);
                }
            }
            v(dVar);
            o(l().b(dVar.f20873q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.d.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.d> r1 = rd.d.Z3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.d r3 = (rd.d) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.d r4 = (rd.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.d.b.s(yd.e, yd.g):rd.d$b");
        }

        public b I(int i10) {
            this.f20876x |= 1;
            this.f20877y = i10;
            return this;
        }

        /* renamed from: x */
        public d b() {
            d y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public d y() {
            d dVar = new d(this);
            int i10 = 1;
            if ((this.f20876x & 1) != 1) {
                i10 = 0;
            }
            dVar.f20875y = this.f20877y;
            if ((this.f20876x & 2) == 2) {
                this.U3 = Collections.unmodifiableList(this.U3);
                this.f20876x &= -3;
            }
            dVar.U3 = this.U3;
            if ((this.f20876x & 4) == 4) {
                this.V3 = Collections.unmodifiableList(this.V3);
                this.f20876x &= -5;
            }
            dVar.V3 = this.V3;
            dVar.f20874x = i10;
            return dVar;
        }
    }

    static {
        d dVar = new d(true);
        Y3 = dVar;
        dVar.r0();
    }

    private d(yd.e eVar, yd.g gVar) {
        List list;
        Object u10;
        this.W3 = (byte) -1;
        this.X3 = -1;
        r0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K != 8) {
                            if (K == 18) {
                                if (!(z11 & true)) {
                                    this.U3 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.U3;
                                u10 = eVar.u(u.f21090c4, gVar);
                            } else if (K == 248) {
                                if (!(z11 & true)) {
                                    this.V3 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.V3;
                                u10 = Integer.valueOf(eVar.s());
                            } else if (K == 250) {
                                int j10 = eVar.j(eVar.A());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.V3 = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.V3.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                            } else if (!y(eVar, J, gVar, K)) {
                            }
                            list.add(u10);
                        } else {
                            this.f20874x |= 1;
                            this.f20875y = eVar.s();
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
                    this.U3 = Collections.unmodifiableList(this.U3);
                }
                if (z11 & true) {
                    this.V3 = Collections.unmodifiableList(this.V3);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f20873q = r10.i();
                    throw th3;
                }
                this.f20873q = r10.i();
                u();
                throw th2;
            }
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
            this.f20873q = r10.i();
            throw th4;
        }
        this.f20873q = r10.i();
        u();
    }

    private d(i.c<d, ?> cVar) {
        super(cVar);
        this.W3 = (byte) -1;
        this.X3 = -1;
        this.f20873q = cVar.l();
    }

    private d(boolean z10) {
        this.W3 = (byte) -1;
        this.X3 = -1;
        this.f20873q = yd.d.f26096c;
    }

    public static d j0() {
        return Y3;
    }

    private void r0() {
        this.f20875y = 6;
        this.U3 = Collections.emptyList();
        this.V3 = Collections.emptyList();
    }

    public static b s0() {
        return b.B();
    }

    public static b t0(d dVar) {
        return s0().m(dVar);
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.W3;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < n0(); i10++) {
            if (!m0(i10).c()) {
                this.W3 = (byte) 0;
                return false;
            }
        }
        if (!B()) {
            this.W3 = (byte) 0;
            return false;
        }
        this.W3 = (byte) 1;
        return true;
    }

    @Override // yd.q
    public int e() {
        int i10 = this.X3;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f20874x & 1) == 1 ? yd.f.o(1, this.f20875y) + 0 : 0;
        for (int i11 = 0; i11 < this.U3.size(); i11++) {
            o10 += yd.f.s(2, this.U3.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.V3.size(); i13++) {
            i12 += yd.f.p(this.V3.get(i13).intValue());
        }
        int size = o10 + i12 + (p0().size() * 2) + G() + this.f20873q.size();
        this.X3 = size;
        return size;
    }

    @Override // yd.i, yd.q
    public yd.s<d> i() {
        return Z3;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f20874x & 1) == 1) {
            fVar.a0(1, this.f20875y);
        }
        for (int i10 = 0; i10 < this.U3.size(); i10++) {
            fVar.d0(2, this.U3.get(i10));
        }
        for (int i11 = 0; i11 < this.V3.size(); i11++) {
            fVar.a0(31, this.V3.get(i11).intValue());
        }
        W.a(19000, fVar);
        fVar.i0(this.f20873q);
    }

    /* renamed from: k0 */
    public d f() {
        return Y3;
    }

    public int l0() {
        return this.f20875y;
    }

    public u m0(int i10) {
        return this.U3.get(i10);
    }

    public int n0() {
        return this.U3.size();
    }

    public List<u> o0() {
        return this.U3;
    }

    public List<Integer> p0() {
        return this.V3;
    }

    public boolean q0() {
        return (this.f20874x & 1) == 1;
    }

    /* renamed from: u0 */
    public b h() {
        return s0();
    }

    /* renamed from: v0 */
    public b g() {
        return t0(this);
    }
}
