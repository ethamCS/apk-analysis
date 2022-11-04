package rd;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import rd.e;
import rd.q;
import rd.t;
import yd.a;
import yd.d;
import yd.i;
/* loaded from: classes.dex */
public final class i extends i.d<i> {

    /* renamed from: k4 */
    private static final i f20923k4;

    /* renamed from: l4 */
    public static yd.s<i> f20924l4 = new a();
    private int U3;
    private int V3;
    private q W3;
    private int X3;
    private List<s> Y3;
    private q Z3;

    /* renamed from: a4 */
    private int f20925a4;

    /* renamed from: b4 */
    private List<q> f20926b4;

    /* renamed from: c4 */
    private List<Integer> f20927c4;

    /* renamed from: d4 */
    private int f20928d4;

    /* renamed from: e4 */
    private List<u> f20929e4;

    /* renamed from: f4 */
    private t f20930f4;

    /* renamed from: g4 */
    private List<Integer> f20931g4;

    /* renamed from: h4 */
    private e f20932h4;

    /* renamed from: i4 */
    private byte f20933i4;

    /* renamed from: j4 */
    private int f20934j4;

    /* renamed from: q */
    private final yd.d f20935q;

    /* renamed from: x */
    private int f20936x;

    /* renamed from: y */
    private int f20937y;

    /* loaded from: classes.dex */
    static class a extends yd.b<i> {
        a() {
        }

        /* renamed from: m */
        public i d(yd.e eVar, yd.g gVar) {
            return new i(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<i, b> {
        private int V3;
        private int X3;

        /* renamed from: a4 */
        private int f20938a4;

        /* renamed from: x */
        private int f20945x;

        /* renamed from: y */
        private int f20946y = 6;
        private int U3 = 6;
        private q W3 = q.z0();
        private List<s> Y3 = Collections.emptyList();
        private q Z3 = q.z0();

        /* renamed from: b4 */
        private List<q> f20939b4 = Collections.emptyList();

        /* renamed from: c4 */
        private List<Integer> f20940c4 = Collections.emptyList();

        /* renamed from: d4 */
        private List<u> f20941d4 = Collections.emptyList();

        /* renamed from: e4 */
        private t f20942e4 = t.N();

        /* renamed from: f4 */
        private List<Integer> f20943f4 = Collections.emptyList();

        /* renamed from: g4 */
        private e f20944g4 = e.I();

        private b() {
            I();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f20945x & 512) != 512) {
                this.f20940c4 = new ArrayList(this.f20940c4);
                this.f20945x |= 512;
            }
        }

        private void D() {
            if ((this.f20945x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f20939b4 = new ArrayList(this.f20939b4);
                this.f20945x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void E() {
            if ((this.f20945x & 32) != 32) {
                this.Y3 = new ArrayList(this.Y3);
                this.f20945x |= 32;
            }
        }

        private void F() {
            if ((this.f20945x & 1024) != 1024) {
                this.f20941d4 = new ArrayList(this.f20941d4);
                this.f20945x |= 1024;
            }
        }

        private void H() {
            if ((this.f20945x & 4096) != 4096) {
                this.f20943f4 = new ArrayList(this.f20943f4);
                this.f20945x |= 4096;
            }
        }

        private void I() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        public b J(e eVar) {
            if ((this.f20945x & 8192) == 8192 && this.f20944g4 != e.I()) {
                eVar = e.b0(this.f20944g4).m(eVar).t();
            }
            this.f20944g4 = eVar;
            this.f20945x |= 8192;
            return this;
        }

        /* renamed from: K */
        public b m(i iVar) {
            if (iVar == i.C0()) {
                return this;
            }
            if (iVar.U0()) {
                P(iVar.E0());
            }
            if (iVar.W0()) {
                R(iVar.G0());
            }
            if (iVar.V0()) {
                Q(iVar.F0());
            }
            if (iVar.Z0()) {
                N(iVar.J0());
            }
            if (iVar.a1()) {
                T(iVar.K0());
            }
            if (!iVar.Y3.isEmpty()) {
                if (this.Y3.isEmpty()) {
                    this.Y3 = iVar.Y3;
                    this.f20945x &= -33;
                } else {
                    E();
                    this.Y3.addAll(iVar.Y3);
                }
            }
            if (iVar.X0()) {
                M(iVar.H0());
            }
            if (iVar.Y0()) {
                S(iVar.I0());
            }
            if (!iVar.f20926b4.isEmpty()) {
                if (this.f20939b4.isEmpty()) {
                    this.f20939b4 = iVar.f20926b4;
                    this.f20945x &= -257;
                } else {
                    D();
                    this.f20939b4.addAll(iVar.f20926b4);
                }
            }
            if (!iVar.f20927c4.isEmpty()) {
                if (this.f20940c4.isEmpty()) {
                    this.f20940c4 = iVar.f20927c4;
                    this.f20945x &= -513;
                } else {
                    C();
                    this.f20940c4.addAll(iVar.f20927c4);
                }
            }
            if (!iVar.f20929e4.isEmpty()) {
                if (this.f20941d4.isEmpty()) {
                    this.f20941d4 = iVar.f20929e4;
                    this.f20945x &= -1025;
                } else {
                    F();
                    this.f20941d4.addAll(iVar.f20929e4);
                }
            }
            if (iVar.b1()) {
                O(iVar.O0());
            }
            if (!iVar.f20931g4.isEmpty()) {
                if (this.f20943f4.isEmpty()) {
                    this.f20943f4 = iVar.f20931g4;
                    this.f20945x &= -4097;
                } else {
                    H();
                    this.f20943f4.addAll(iVar.f20931g4);
                }
            }
            if (iVar.T0()) {
                J(iVar.B0());
            }
            v(iVar);
            o(l().b(iVar.f20935q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.i.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.i> r1 = rd.i.f20924l4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.i r3 = (rd.i) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
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
                rd.i r4 = (rd.i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: rd.i.b.s(yd.e, yd.g):rd.i$b");
        }

        public b M(q qVar) {
            if ((this.f20945x & 64) == 64 && this.Z3 != q.z0()) {
                qVar = q.a1(this.Z3).m(qVar).y();
            }
            this.Z3 = qVar;
            this.f20945x |= 64;
            return this;
        }

        public b N(q qVar) {
            if ((this.f20945x & 8) == 8 && this.W3 != q.z0()) {
                qVar = q.a1(this.W3).m(qVar).y();
            }
            this.W3 = qVar;
            this.f20945x |= 8;
            return this;
        }

        public b O(t tVar) {
            if ((this.f20945x & 2048) == 2048 && this.f20942e4 != t.N()) {
                tVar = t.g0(this.f20942e4).m(tVar).t();
            }
            this.f20942e4 = tVar;
            this.f20945x |= 2048;
            return this;
        }

        public b P(int i10) {
            this.f20945x |= 1;
            this.f20946y = i10;
            return this;
        }

        public b Q(int i10) {
            this.f20945x |= 4;
            this.V3 = i10;
            return this;
        }

        public b R(int i10) {
            this.f20945x |= 2;
            this.U3 = i10;
            return this;
        }

        public b S(int i10) {
            this.f20945x |= 128;
            this.f20938a4 = i10;
            return this;
        }

        public b T(int i10) {
            this.f20945x |= 16;
            this.X3 = i10;
            return this;
        }

        /* renamed from: x */
        public i b() {
            i y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public i y() {
            i iVar = new i(this);
            int i10 = this.f20945x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            iVar.f20937y = this.f20946y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            iVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            iVar.V3 = this.V3;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            iVar.W3 = this.W3;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            iVar.X3 = this.X3;
            if ((this.f20945x & 32) == 32) {
                this.Y3 = Collections.unmodifiableList(this.Y3);
                this.f20945x &= -33;
            }
            iVar.Y3 = this.Y3;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            iVar.Z3 = this.Z3;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            iVar.f20925a4 = this.f20938a4;
            if ((this.f20945x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f20939b4 = Collections.unmodifiableList(this.f20939b4);
                this.f20945x &= -257;
            }
            iVar.f20926b4 = this.f20939b4;
            if ((this.f20945x & 512) == 512) {
                this.f20940c4 = Collections.unmodifiableList(this.f20940c4);
                this.f20945x &= -513;
            }
            iVar.f20927c4 = this.f20940c4;
            if ((this.f20945x & 1024) == 1024) {
                this.f20941d4 = Collections.unmodifiableList(this.f20941d4);
                this.f20945x &= -1025;
            }
            iVar.f20929e4 = this.f20941d4;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            iVar.f20930f4 = this.f20942e4;
            if ((this.f20945x & 4096) == 4096) {
                this.f20943f4 = Collections.unmodifiableList(this.f20943f4);
                this.f20945x &= -4097;
            }
            iVar.f20931g4 = this.f20943f4;
            if ((i10 & 8192) == 8192) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            iVar.f20932h4 = this.f20944g4;
            iVar.f20936x = i11;
            return iVar;
        }
    }

    static {
        i iVar = new i(true);
        f20923k4 = iVar;
        iVar.c1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private i(yd.e eVar, yd.g gVar) {
        int i10;
        int i11;
        List list;
        int j10;
        yd.q qVar;
        this.f20928d4 = -1;
        this.f20933i4 = (byte) -1;
        this.f20934j4 = -1;
        c1();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 1024;
            if (z10) {
                boolean z12 = z11 ? 1 : 0;
                boolean z13 = z11 ? 1 : 0;
                boolean z14 = z11 ? 1 : 0;
                boolean z15 = z11 ? 1 : 0;
                boolean z16 = z11 ? 1 : 0;
                boolean z17 = z11 ? 1 : 0;
                boolean z18 = z11 ? 1 : 0;
                boolean z19 = z11 ? 1 : 0;
                boolean z20 = z11 ? 1 : 0;
                boolean z21 = z11 ? 1 : 0;
                boolean z22 = z11 ? 1 : 0;
                boolean z23 = z11 ? 1 : 0;
                if (z12 & true) {
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                if (z11 & true) {
                    this.f20929e4 = Collections.unmodifiableList(this.f20929e4);
                }
                if (z11 & true) {
                    this.f20926b4 = Collections.unmodifiableList(this.f20926b4);
                }
                if (z11 & true) {
                    this.f20927c4 = Collections.unmodifiableList(this.f20927c4);
                }
                if (z11 & true) {
                    this.f20931g4 = Collections.unmodifiableList(this.f20931g4);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20935q = r10.i();
                    throw th2;
                }
                this.f20935q = r10.i();
                u();
                return;
            }
            try {
                try {
                    try {
                        int K = eVar.K();
                        e.b bVar = null;
                        t.b g10 = null;
                        q.c g11 = null;
                        q.c g12 = null;
                        switch (K) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f20936x |= 2;
                                this.U3 = eVar.s();
                                break;
                            case 16:
                                this.f20936x |= 4;
                                this.V3 = eVar.s();
                                break;
                            case 26:
                                i10 = 8;
                                g12 = (this.f20936x & 8) == 8 ? this.W3.g() : g12;
                                q qVar2 = (q) eVar.u(q.f21020k4, gVar);
                                this.W3 = qVar2;
                                if (g12 != null) {
                                    g12.m(qVar2);
                                    this.W3 = g12.y();
                                }
                                i11 = this.f20936x;
                                this.f20936x = i11 | i10;
                                break;
                            case 34:
                                boolean z24 = z11 & true;
                                boolean z25 = z11;
                                if (!z24) {
                                    this.Y3 = new ArrayList();
                                    z25 = z11 | true;
                                }
                                list = this.Y3;
                                z11 = z25;
                                qVar = eVar.u(s.f21069d4, gVar);
                                list.add(qVar);
                                break;
                            case 42:
                                g11 = (this.f20936x & 32) == 32 ? this.Z3.g() : g11;
                                q qVar3 = (q) eVar.u(q.f21020k4, gVar);
                                this.Z3 = qVar3;
                                if (g11 != null) {
                                    g11.m(qVar3);
                                    this.Z3 = g11.y();
                                }
                                this.f20936x |= 32;
                                break;
                            case 50:
                                boolean z26 = z11 & true;
                                boolean z27 = z11;
                                if (!z26) {
                                    this.f20929e4 = new ArrayList();
                                    z27 = z11 | true;
                                }
                                list = this.f20929e4;
                                z11 = z27;
                                qVar = eVar.u(u.f21090c4, gVar);
                                list.add(qVar);
                                break;
                            case 56:
                                this.f20936x |= 16;
                                this.X3 = eVar.s();
                                break;
                            case 64:
                                this.f20936x |= 64;
                                this.f20925a4 = eVar.s();
                                break;
                            case 72:
                                this.f20936x |= 1;
                                this.f20937y = eVar.s();
                                break;
                            case 82:
                                boolean z28 = z11 & true;
                                boolean z29 = z11;
                                if (!z28) {
                                    this.f20926b4 = new ArrayList();
                                    z29 = z11 | true;
                                }
                                list = this.f20926b4;
                                z11 = z29;
                                qVar = eVar.u(q.f21020k4, gVar);
                                list.add(qVar);
                                break;
                            case 88:
                                boolean z30 = z11 & true;
                                boolean z31 = z11;
                                if (!z30) {
                                    this.f20927c4 = new ArrayList();
                                    z31 = z11 | true;
                                }
                                list = this.f20927c4;
                                z11 = z31;
                                qVar = Integer.valueOf(eVar.s());
                                list.add(qVar);
                                break;
                            case 90:
                                j10 = eVar.j(eVar.A());
                                boolean z32 = z11 & true;
                                z11 = z11;
                                if (!z32) {
                                    z11 = z11;
                                    if (eVar.e() > 0) {
                                        this.f20927c4 = new ArrayList();
                                        z11 |= true;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f20927c4.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                                break;
                            case 242:
                                i10 = 128;
                                g10 = (this.f20936x & 128) == 128 ? this.f20930f4.g() : g10;
                                t tVar = (t) eVar.u(t.X3, gVar);
                                this.f20930f4 = tVar;
                                if (g10 != null) {
                                    g10.m(tVar);
                                    this.f20930f4 = g10.t();
                                }
                                i11 = this.f20936x;
                                this.f20936x = i11 | i10;
                                break;
                            case 248:
                                boolean z33 = z11 & true;
                                boolean z34 = z11;
                                if (!z33) {
                                    this.f20931g4 = new ArrayList();
                                    z34 = z11 | true;
                                }
                                list = this.f20931g4;
                                z11 = z34;
                                qVar = Integer.valueOf(eVar.s());
                                list.add(qVar);
                                break;
                            case 250:
                                j10 = eVar.j(eVar.A());
                                boolean z35 = z11 & true;
                                z11 = z11;
                                if (!z35) {
                                    z11 = z11;
                                    if (eVar.e() > 0) {
                                        this.f20931g4 = new ArrayList();
                                        z11 |= true;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f20931g4.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                                break;
                            case 258:
                                bVar = (this.f20936x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.f20932h4.g() : bVar;
                                e eVar2 = (e) eVar.u(e.V3, gVar);
                                this.f20932h4 = eVar2;
                                if (bVar != null) {
                                    bVar.m(eVar2);
                                    this.f20932h4 = bVar.t();
                                }
                                this.f20936x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                if ((z11 & true) == r52) {
                    this.f20929e4 = Collections.unmodifiableList(this.f20929e4);
                }
                if (z11 & true) {
                    this.f20926b4 = Collections.unmodifiableList(this.f20926b4);
                }
                if (z11 & true) {
                    this.f20927c4 = Collections.unmodifiableList(this.f20927c4);
                }
                if (z11 & true) {
                    this.f20931g4 = Collections.unmodifiableList(this.f20931g4);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f20935q = r10.i();
                    throw th4;
                }
                this.f20935q = r10.i();
                u();
                throw th3;
            }
        }
    }

    private i(i.c<i, ?> cVar) {
        super(cVar);
        this.f20928d4 = -1;
        this.f20933i4 = (byte) -1;
        this.f20934j4 = -1;
        this.f20935q = cVar.l();
    }

    private i(boolean z10) {
        this.f20928d4 = -1;
        this.f20933i4 = (byte) -1;
        this.f20934j4 = -1;
        this.f20935q = yd.d.f26096c;
    }

    public static i C0() {
        return f20923k4;
    }

    private void c1() {
        this.f20937y = 6;
        this.U3 = 6;
        this.V3 = 0;
        this.W3 = q.z0();
        this.X3 = 0;
        this.Y3 = Collections.emptyList();
        this.Z3 = q.z0();
        this.f20925a4 = 0;
        this.f20926b4 = Collections.emptyList();
        this.f20927c4 = Collections.emptyList();
        this.f20929e4 = Collections.emptyList();
        this.f20930f4 = t.N();
        this.f20931g4 = Collections.emptyList();
        this.f20932h4 = e.I();
    }

    public static b d1() {
        return b.B();
    }

    public static b e1(i iVar) {
        return d1().m(iVar);
    }

    public static i g1(InputStream inputStream, yd.g gVar) {
        return f20924l4.c(inputStream, gVar);
    }

    public List<q> A0() {
        return this.f20926b4;
    }

    public e B0() {
        return this.f20932h4;
    }

    /* renamed from: D0 */
    public i f() {
        return f20923k4;
    }

    public int E0() {
        return this.f20937y;
    }

    public int F0() {
        return this.V3;
    }

    public int G0() {
        return this.U3;
    }

    public q H0() {
        return this.Z3;
    }

    public int I0() {
        return this.f20925a4;
    }

    public q J0() {
        return this.W3;
    }

    public int K0() {
        return this.X3;
    }

    public s L0(int i10) {
        return this.Y3.get(i10);
    }

    public int M0() {
        return this.Y3.size();
    }

    public List<s> N0() {
        return this.Y3;
    }

    public t O0() {
        return this.f20930f4;
    }

    public u P0(int i10) {
        return this.f20929e4.get(i10);
    }

    public int Q0() {
        return this.f20929e4.size();
    }

    public List<u> R0() {
        return this.f20929e4;
    }

    public List<Integer> S0() {
        return this.f20931g4;
    }

    public boolean T0() {
        return (this.f20936x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean U0() {
        return (this.f20936x & 1) == 1;
    }

    public boolean V0() {
        return (this.f20936x & 4) == 4;
    }

    public boolean W0() {
        return (this.f20936x & 2) == 2;
    }

    public boolean X0() {
        return (this.f20936x & 32) == 32;
    }

    public boolean Y0() {
        return (this.f20936x & 64) == 64;
    }

    public boolean Z0() {
        return (this.f20936x & 8) == 8;
    }

    public boolean a1() {
        return (this.f20936x & 16) == 16;
    }

    public boolean b1() {
        return (this.f20936x & 128) == 128;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f20933i4;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!V0()) {
            this.f20933i4 = (byte) 0;
            return false;
        } else if (Z0() && !J0().c()) {
            this.f20933i4 = (byte) 0;
            return false;
        } else {
            for (int i10 = 0; i10 < M0(); i10++) {
                if (!L0(i10).c()) {
                    this.f20933i4 = (byte) 0;
                    return false;
                }
            }
            if (X0() && !H0().c()) {
                this.f20933i4 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < y0(); i11++) {
                if (!x0(i11).c()) {
                    this.f20933i4 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < Q0(); i12++) {
                if (!P0(i12).c()) {
                    this.f20933i4 = (byte) 0;
                    return false;
                }
            }
            if (b1() && !O0().c()) {
                this.f20933i4 = (byte) 0;
                return false;
            } else if (T0() && !B0().c()) {
                this.f20933i4 = (byte) 0;
                return false;
            } else if (!B()) {
                this.f20933i4 = (byte) 0;
                return false;
            } else {
                this.f20933i4 = (byte) 1;
                return true;
            }
        }
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f20934j4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f20936x & 2) == 2 ? yd.f.o(1, this.U3) + 0 : 0;
        if ((this.f20936x & 4) == 4) {
            o10 += yd.f.o(2, this.V3);
        }
        if ((this.f20936x & 8) == 8) {
            o10 += yd.f.s(3, this.W3);
        }
        for (int i11 = 0; i11 < this.Y3.size(); i11++) {
            o10 += yd.f.s(4, this.Y3.get(i11));
        }
        if ((this.f20936x & 32) == 32) {
            o10 += yd.f.s(5, this.Z3);
        }
        for (int i12 = 0; i12 < this.f20929e4.size(); i12++) {
            o10 += yd.f.s(6, this.f20929e4.get(i12));
        }
        if ((this.f20936x & 16) == 16) {
            o10 += yd.f.o(7, this.X3);
        }
        if ((this.f20936x & 64) == 64) {
            o10 += yd.f.o(8, this.f20925a4);
        }
        if ((this.f20936x & 1) == 1) {
            o10 += yd.f.o(9, this.f20937y);
        }
        for (int i13 = 0; i13 < this.f20926b4.size(); i13++) {
            o10 += yd.f.s(10, this.f20926b4.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f20927c4.size(); i15++) {
            i14 += yd.f.p(this.f20927c4.get(i15).intValue());
        }
        int i16 = o10 + i14;
        if (!z0().isEmpty()) {
            i16 = i16 + 1 + yd.f.p(i14);
        }
        this.f20928d4 = i14;
        if ((this.f20936x & 128) == 128) {
            i16 += yd.f.s(30, this.f20930f4);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f20931g4.size(); i18++) {
            i17 += yd.f.p(this.f20931g4.get(i18).intValue());
        }
        int size = i16 + i17 + (S0().size() * 2);
        if ((this.f20936x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            size += yd.f.s(32, this.f20932h4);
        }
        int G = size + G() + this.f20935q.size();
        this.f20934j4 = G;
        return G;
    }

    /* renamed from: f1 */
    public b h() {
        return d1();
    }

    /* renamed from: h1 */
    public b g() {
        return e1(this);
    }

    @Override // yd.i, yd.q
    public yd.s<i> i() {
        return f20924l4;
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f20936x & 2) == 2) {
            fVar.a0(1, this.U3);
        }
        if ((this.f20936x & 4) == 4) {
            fVar.a0(2, this.V3);
        }
        if ((this.f20936x & 8) == 8) {
            fVar.d0(3, this.W3);
        }
        for (int i10 = 0; i10 < this.Y3.size(); i10++) {
            fVar.d0(4, this.Y3.get(i10));
        }
        if ((this.f20936x & 32) == 32) {
            fVar.d0(5, this.Z3);
        }
        for (int i11 = 0; i11 < this.f20929e4.size(); i11++) {
            fVar.d0(6, this.f20929e4.get(i11));
        }
        if ((this.f20936x & 16) == 16) {
            fVar.a0(7, this.X3);
        }
        if ((this.f20936x & 64) == 64) {
            fVar.a0(8, this.f20925a4);
        }
        if ((this.f20936x & 1) == 1) {
            fVar.a0(9, this.f20937y);
        }
        for (int i12 = 0; i12 < this.f20926b4.size(); i12++) {
            fVar.d0(10, this.f20926b4.get(i12));
        }
        if (z0().size() > 0) {
            fVar.o0(90);
            fVar.o0(this.f20928d4);
        }
        for (int i13 = 0; i13 < this.f20927c4.size(); i13++) {
            fVar.b0(this.f20927c4.get(i13).intValue());
        }
        if ((this.f20936x & 128) == 128) {
            fVar.d0(30, this.f20930f4);
        }
        for (int i14 = 0; i14 < this.f20931g4.size(); i14++) {
            fVar.a0(31, this.f20931g4.get(i14).intValue());
        }
        if ((this.f20936x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            fVar.d0(32, this.f20932h4);
        }
        W.a(19000, fVar);
        fVar.i0(this.f20935q);
    }

    public q x0(int i10) {
        return this.f20926b4.get(i10);
    }

    public int y0() {
        return this.f20926b4.size();
    }

    public List<Integer> z0() {
        return this.f20927c4;
    }
}
