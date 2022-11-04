package rd;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import rd.q;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class r extends i.d<r> {

    /* renamed from: e4 */
    private static final r f21055e4;

    /* renamed from: f4 */
    public static yd.s<r> f21056f4 = new a();
    private int U3;
    private List<s> V3;
    private q W3;
    private int X3;
    private q Y3;
    private int Z3;

    /* renamed from: a4 */
    private List<rd.b> f21057a4;

    /* renamed from: b4 */
    private List<Integer> f21058b4;

    /* renamed from: c4 */
    private byte f21059c4;

    /* renamed from: d4 */
    private int f21060d4;

    /* renamed from: q */
    private final yd.d f21061q;

    /* renamed from: x */
    private int f21062x;

    /* renamed from: y */
    private int f21063y;

    /* loaded from: classes.dex */
    static class a extends yd.b<r> {
        a() {
        }

        /* renamed from: m */
        public r d(yd.e eVar, yd.g gVar) {
            return new r(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<r, b> {
        private int U3;
        private int X3;
        private int Z3;

        /* renamed from: x */
        private int f21066x;

        /* renamed from: y */
        private int f21067y = 6;
        private List<s> V3 = Collections.emptyList();
        private q W3 = q.z0();
        private q Y3 = q.z0();

        /* renamed from: a4 */
        private List<rd.b> f21064a4 = Collections.emptyList();

        /* renamed from: b4 */
        private List<Integer> f21065b4 = Collections.emptyList();

        private b() {
            F();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f21066x & 128) != 128) {
                this.f21064a4 = new ArrayList(this.f21064a4);
                this.f21066x |= 128;
            }
        }

        private void D() {
            if ((this.f21066x & 4) != 4) {
                this.V3 = new ArrayList(this.V3);
                this.f21066x |= 4;
            }
        }

        private void E() {
            if ((this.f21066x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f21065b4 = new ArrayList(this.f21065b4);
                this.f21066x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void F() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        public b H(q qVar) {
            if ((this.f21066x & 32) == 32 && this.Y3 != q.z0()) {
                qVar = q.a1(this.Y3).m(qVar).y();
            }
            this.Y3 = qVar;
            this.f21066x |= 32;
            return this;
        }

        /* renamed from: I */
        public b m(r rVar) {
            if (rVar == r.t0()) {
                return this;
            }
            if (rVar.H0()) {
                M(rVar.x0());
            }
            if (rVar.I0()) {
                N(rVar.y0());
            }
            if (!rVar.V3.isEmpty()) {
                if (this.V3.isEmpty()) {
                    this.V3 = rVar.V3;
                    this.f21066x &= -5;
                } else {
                    D();
                    this.V3.addAll(rVar.V3);
                }
            }
            if (rVar.J0()) {
                K(rVar.C0());
            }
            if (rVar.K0()) {
                O(rVar.D0());
            }
            if (rVar.F0()) {
                H(rVar.v0());
            }
            if (rVar.G0()) {
                L(rVar.w0());
            }
            if (!rVar.f21057a4.isEmpty()) {
                if (this.f21064a4.isEmpty()) {
                    this.f21064a4 = rVar.f21057a4;
                    this.f21066x &= -129;
                } else {
                    C();
                    this.f21064a4.addAll(rVar.f21057a4);
                }
            }
            if (!rVar.f21058b4.isEmpty()) {
                if (this.f21065b4.isEmpty()) {
                    this.f21065b4 = rVar.f21058b4;
                    this.f21066x &= -257;
                } else {
                    E();
                    this.f21065b4.addAll(rVar.f21058b4);
                }
            }
            v(rVar);
            o(l().b(rVar.f21061q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.r.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.r> r1 = rd.r.f21056f4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.r r3 = (rd.r) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.r r4 = (rd.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.r.b.s(yd.e, yd.g):rd.r$b");
        }

        public b K(q qVar) {
            if ((this.f21066x & 8) == 8 && this.W3 != q.z0()) {
                qVar = q.a1(this.W3).m(qVar).y();
            }
            this.W3 = qVar;
            this.f21066x |= 8;
            return this;
        }

        public b L(int i10) {
            this.f21066x |= 64;
            this.Z3 = i10;
            return this;
        }

        public b M(int i10) {
            this.f21066x |= 1;
            this.f21067y = i10;
            return this;
        }

        public b N(int i10) {
            this.f21066x |= 2;
            this.U3 = i10;
            return this;
        }

        public b O(int i10) {
            this.f21066x |= 16;
            this.X3 = i10;
            return this;
        }

        /* renamed from: x */
        public r b() {
            r y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public r y() {
            r rVar = new r(this);
            int i10 = this.f21066x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            rVar.f21063y = this.f21067y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            rVar.U3 = this.U3;
            if ((this.f21066x & 4) == 4) {
                this.V3 = Collections.unmodifiableList(this.V3);
                this.f21066x &= -5;
            }
            rVar.V3 = this.V3;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.W3 = this.W3;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.X3 = this.X3;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.Y3 = this.Y3;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.Z3 = this.Z3;
            if ((this.f21066x & 128) == 128) {
                this.f21064a4 = Collections.unmodifiableList(this.f21064a4);
                this.f21066x &= -129;
            }
            rVar.f21057a4 = this.f21064a4;
            if ((this.f21066x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f21065b4 = Collections.unmodifiableList(this.f21065b4);
                this.f21066x &= -257;
            }
            rVar.f21058b4 = this.f21065b4;
            rVar.f21062x = i11;
            return rVar;
        }
    }

    static {
        r rVar = new r(true);
        f21055e4 = rVar;
        rVar.L0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private r(yd.e eVar, yd.g gVar) {
        List list;
        Object u10;
        this.f21059c4 = (byte) -1;
        this.f21060d4 = -1;
        L0();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 128;
            if (z10) {
                if (z11 & true) {
                    this.V3 = Collections.unmodifiableList(this.V3);
                }
                if (z11 & true) {
                    this.f21057a4 = Collections.unmodifiableList(this.f21057a4);
                }
                if (z11 & true) {
                    this.f21058b4 = Collections.unmodifiableList(this.f21058b4);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f21061q = r10.i();
                    throw th2;
                }
                this.f21061q = r10.i();
                u();
                return;
            }
            try {
                try {
                    try {
                        int K = eVar.K();
                        q.c cVar = null;
                        switch (K) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f21062x |= 1;
                                this.f21063y = eVar.s();
                                break;
                            case 16:
                                this.f21062x |= 2;
                                this.U3 = eVar.s();
                                break;
                            case 26:
                                if (!(z11 & true)) {
                                    this.V3 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.V3;
                                u10 = eVar.u(s.f21069d4, gVar);
                                list.add(u10);
                                break;
                            case 34:
                                cVar = (this.f21062x & 4) == 4 ? this.W3.g() : cVar;
                                q qVar = (q) eVar.u(q.f21020k4, gVar);
                                this.W3 = qVar;
                                if (cVar != null) {
                                    cVar.m(qVar);
                                    this.W3 = cVar.y();
                                }
                                this.f21062x |= 4;
                                break;
                            case 40:
                                this.f21062x |= 8;
                                this.X3 = eVar.s();
                                break;
                            case 50:
                                cVar = (this.f21062x & 16) == 16 ? this.Y3.g() : cVar;
                                q qVar2 = (q) eVar.u(q.f21020k4, gVar);
                                this.Y3 = qVar2;
                                if (cVar != null) {
                                    cVar.m(qVar2);
                                    this.Y3 = cVar.y();
                                }
                                this.f21062x |= 16;
                                break;
                            case 56:
                                this.f21062x |= 32;
                                this.Z3 = eVar.s();
                                break;
                            case 66:
                                if (!(z11 & true)) {
                                    this.f21057a4 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f21057a4;
                                u10 = eVar.u(rd.b.X3, gVar);
                                list.add(u10);
                                break;
                            case 248:
                                if (!(z11 & true)) {
                                    this.f21058b4 = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f21058b4;
                                u10 = Integer.valueOf(eVar.s());
                                list.add(u10);
                                break;
                            case 250:
                                int j10 = eVar.j(eVar.A());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.f21058b4 = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f21058b4.add(Integer.valueOf(eVar.s()));
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
                    } catch (IOException e10) {
                        throw new yd.k(e10.getMessage()).k(this);
                    }
                } catch (yd.k e11) {
                    throw e11.k(this);
                }
            } catch (Throwable th3) {
                if (z11 & true) {
                    this.V3 = Collections.unmodifiableList(this.V3);
                }
                if ((z11 & true) == r52) {
                    this.f21057a4 = Collections.unmodifiableList(this.f21057a4);
                }
                if (z11 & true) {
                    this.f21058b4 = Collections.unmodifiableList(this.f21058b4);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f21061q = r10.i();
                    throw th4;
                }
                this.f21061q = r10.i();
                u();
                throw th3;
            }
        }
    }

    private r(i.c<r, ?> cVar) {
        super(cVar);
        this.f21059c4 = (byte) -1;
        this.f21060d4 = -1;
        this.f21061q = cVar.l();
    }

    private r(boolean z10) {
        this.f21059c4 = (byte) -1;
        this.f21060d4 = -1;
        this.f21061q = yd.d.f26096c;
    }

    private void L0() {
        this.f21063y = 6;
        this.U3 = 0;
        this.V3 = Collections.emptyList();
        this.W3 = q.z0();
        this.X3 = 0;
        this.Y3 = q.z0();
        this.Z3 = 0;
        this.f21057a4 = Collections.emptyList();
        this.f21058b4 = Collections.emptyList();
    }

    public static b M0() {
        return b.B();
    }

    public static b N0(r rVar) {
        return M0().m(rVar);
    }

    public static r P0(InputStream inputStream, yd.g gVar) {
        return f21056f4.a(inputStream, gVar);
    }

    public static r t0() {
        return f21055e4;
    }

    public int A0() {
        return this.V3.size();
    }

    public List<s> B0() {
        return this.V3;
    }

    public q C0() {
        return this.W3;
    }

    public int D0() {
        return this.X3;
    }

    public List<Integer> E0() {
        return this.f21058b4;
    }

    public boolean F0() {
        return (this.f21062x & 16) == 16;
    }

    public boolean G0() {
        return (this.f21062x & 32) == 32;
    }

    public boolean H0() {
        return (this.f21062x & 1) == 1;
    }

    public boolean I0() {
        return (this.f21062x & 2) == 2;
    }

    public boolean J0() {
        return (this.f21062x & 4) == 4;
    }

    public boolean K0() {
        return (this.f21062x & 8) == 8;
    }

    /* renamed from: O0 */
    public b h() {
        return M0();
    }

    /* renamed from: Q0 */
    public b g() {
        return N0(this);
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f21059c4;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!I0()) {
            this.f21059c4 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < A0(); i10++) {
            if (!z0(i10).c()) {
                this.f21059c4 = (byte) 0;
                return false;
            }
        }
        if (J0() && !C0().c()) {
            this.f21059c4 = (byte) 0;
            return false;
        } else if (F0() && !v0().c()) {
            this.f21059c4 = (byte) 0;
            return false;
        } else {
            for (int i11 = 0; i11 < r0(); i11++) {
                if (!q0(i11).c()) {
                    this.f21059c4 = (byte) 0;
                    return false;
                }
            }
            if (!B()) {
                this.f21059c4 = (byte) 0;
                return false;
            }
            this.f21059c4 = (byte) 1;
            return true;
        }
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f21060d4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f21062x & 1) == 1 ? yd.f.o(1, this.f21063y) + 0 : 0;
        if ((this.f21062x & 2) == 2) {
            o10 += yd.f.o(2, this.U3);
        }
        for (int i11 = 0; i11 < this.V3.size(); i11++) {
            o10 += yd.f.s(3, this.V3.get(i11));
        }
        if ((this.f21062x & 4) == 4) {
            o10 += yd.f.s(4, this.W3);
        }
        if ((this.f21062x & 8) == 8) {
            o10 += yd.f.o(5, this.X3);
        }
        if ((this.f21062x & 16) == 16) {
            o10 += yd.f.s(6, this.Y3);
        }
        if ((this.f21062x & 32) == 32) {
            o10 += yd.f.o(7, this.Z3);
        }
        for (int i12 = 0; i12 < this.f21057a4.size(); i12++) {
            o10 += yd.f.s(8, this.f21057a4.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f21058b4.size(); i14++) {
            i13 += yd.f.p(this.f21058b4.get(i14).intValue());
        }
        int size = o10 + i13 + (E0().size() * 2) + G() + this.f21061q.size();
        this.f21060d4 = size;
        return size;
    }

    @Override // yd.i, yd.q
    public yd.s<r> i() {
        return f21056f4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f21062x & 1) == 1) {
            fVar.a0(1, this.f21063y);
        }
        if ((this.f21062x & 2) == 2) {
            fVar.a0(2, this.U3);
        }
        for (int i10 = 0; i10 < this.V3.size(); i10++) {
            fVar.d0(3, this.V3.get(i10));
        }
        if ((this.f21062x & 4) == 4) {
            fVar.d0(4, this.W3);
        }
        if ((this.f21062x & 8) == 8) {
            fVar.a0(5, this.X3);
        }
        if ((this.f21062x & 16) == 16) {
            fVar.d0(6, this.Y3);
        }
        if ((this.f21062x & 32) == 32) {
            fVar.a0(7, this.Z3);
        }
        for (int i11 = 0; i11 < this.f21057a4.size(); i11++) {
            fVar.d0(8, this.f21057a4.get(i11));
        }
        for (int i12 = 0; i12 < this.f21058b4.size(); i12++) {
            fVar.a0(31, this.f21058b4.get(i12).intValue());
        }
        W.a(200, fVar);
        fVar.i0(this.f21061q);
    }

    public rd.b q0(int i10) {
        return this.f21057a4.get(i10);
    }

    public int r0() {
        return this.f21057a4.size();
    }

    public List<rd.b> s0() {
        return this.f21057a4;
    }

    /* renamed from: u0 */
    public r f() {
        return f21055e4;
    }

    public q v0() {
        return this.Y3;
    }

    public int w0() {
        return this.Z3;
    }

    public int x0() {
        return this.f21063y;
    }

    public int y0() {
        return this.U3;
    }

    public s z0(int i10) {
        return this.V3.get(i10);
    }
}
