package u7;

import java.util.Objects;
/* loaded from: classes.dex */
public final class e implements Comparable<e> {
    public static final e U3;
    public static final e V3;
    public static final e W3;
    public static final e X3;
    public static final e Y3;
    public static final e Z3;

    /* renamed from: a4 */
    private static final e[] f23216a4 = o(-24, 128);

    /* renamed from: b4 */
    private static final n<e> f23217b4 = new t(new k(new b()));

    /* renamed from: x */
    public static final e f23218x;

    /* renamed from: y */
    public static final e f23219y;

    /* renamed from: c */
    private final m f23220c;

    /* renamed from: d */
    private final m f23221d;

    /* renamed from: q */
    private final byte f23222q;

    /* loaded from: classes.dex */
    private static final class b implements o<e> {
        private b() {
        }

        @Override // u7.o
        public f a(f fVar, l lVar) {
            return lVar.L() <= 0 ? fVar : fVar.I1() < 0 ? lVar.A(fVar.L0()).L0() : lVar.A(fVar);
        }

        @Override // u7.o
        public int f() {
            return 1;
        }

        @Override // u7.o
        public int h() {
            return 2;
        }

        @Override // u7.o
        public m k(m mVar, m mVar2) {
            return mVar2.K() <= 0 ? mVar : m.p(a(mVar.B(), l.q(mVar2.B())));
        }

        @Override // u7.o
        public p m(f fVar, int i10, int i11) {
            return new u7.a(fVar, i10, i11);
        }

        @Override // u7.o
        public l o(f fVar) {
            return l.q(fVar.o0());
        }

        @Override // u7.o
        public l p(f fVar, f fVar2) {
            if (fVar2.H1()) {
                return null;
            }
            if (fVar2.n0(0) && fVar2.compareTo(f.Y(1)) != 0) {
                return null;
            }
            f i02 = fVar2.i0();
            if (!fVar2.o0().equals(i02.b(1))) {
                return null;
            }
            return l.q(i02);
        }

        @Override // u7.o
        public p q(m mVar, int i10, int i11) {
            return mVar.h() ? new u7.a(mVar.D(), i10, i11) : new u7.a(mVar.B(), i10, i11);
        }

        /* renamed from: r */
        public e d(f fVar, f fVar2, int i10) {
            return new e(m.p(fVar), m.p(fVar2), (byte) i10);
        }

        /* renamed from: s */
        public e l(m mVar, m mVar2, int i10) {
            return new e(mVar, mVar2, (byte) i10);
        }

        /* renamed from: t */
        public f j(e eVar) {
            return eVar.f23220c.B();
        }

        /* renamed from: u */
        public m g(e eVar) {
            return eVar.f23220c;
        }

        /* renamed from: v */
        public int e(e eVar) {
            return eVar.f23222q;
        }

        /* renamed from: w */
        public f b(e eVar) {
            return eVar.f23221d.B();
        }

        /* renamed from: x */
        public m i(e eVar) {
            return eVar.f23221d;
        }

        /* renamed from: y */
        public int n(e eVar) {
            return eVar.U();
        }

        /* renamed from: z */
        public e c(int i10) {
            return e.t(i10);
        }
    }

    static {
        m mVar = m.f23252x;
        f23218x = new e(mVar, mVar, (byte) 4);
        f23219y = new e(mVar, mVar, (byte) 3);
        U3 = new e(mVar, mVar, (byte) 1);
        V3 = new e(m.f23253y, mVar, (byte) 0);
        W3 = new e(mVar, mVar, (byte) 2);
        X3 = new e(mVar, mVar, (byte) 8);
        Y3 = new e(m.r(10), mVar, (byte) 0);
        Z3 = new e(mVar, mVar, (byte) 0);
    }

    private e(m mVar, m mVar2, byte b10) {
        this.f23221d = mVar;
        this.f23220c = mVar2;
        this.f23222q = b10;
    }

    private f I(boolean z10) {
        if (R()) {
            boolean z11 = false;
            if (T()) {
                return f.Y(0);
            }
            int I1 = O().I1();
            if (I1 == 0) {
                return P();
            }
            if (I1 > 0) {
                f O = O();
                f P = P();
                if (P.H1()) {
                    return P;
                }
                if (P.I1() < 0) {
                    z11 = true;
                }
                if (z11) {
                    P = P.L0();
                }
                f b12 = P.b1(O);
                return z11 ? b12.L0() : b12;
            } else if (z10 && !this.f23221d.I()) {
                throw new ArithmeticException("Not an exact integer");
            } else {
                l x10 = l.q(O()).x();
                u7.a aVar = new u7.a(Q(), 0, 0);
                aVar.n(x10);
                if (z10 && (aVar.h() != 0 || aVar.a() != 0)) {
                    throw new ArithmeticException("Not an exact integer");
                }
                f c10 = aVar.c();
                return S() ? c10.L0() : c10;
            }
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public static e d(int i10, int i11) {
        return (i11 != 0 || i10 < -24 || i10 > 128) ? i10 < 0 ? i10 == Integer.MIN_VALUE ? new e(m.s(-2147483648L).w(), m.r(i11), (byte) 1) : new e(m.r(-i10), m.r(i11), (byte) 1) : i10 == 0 ? new e(m.f23252x, m.r(i11), (byte) 0) : new e(m.r(i10), m.r(i11), (byte) 0) : f23216a4[i10 - (-24)];
    }

    public static e g(f fVar, int i10) {
        Objects.requireNonNull(fVar, "mantissa");
        if (fVar.B()) {
            return d(fVar.s1(), i10);
        }
        m p10 = m.p(fVar);
        int K = p10.K();
        if (K < 0) {
            p10 = p10.w();
        }
        return new e(p10, m.r(i10), (byte) (K < 0 ? 1 : 0));
    }

    public static e h(f fVar, f fVar2) {
        Objects.requireNonNull(fVar, "mantissa");
        Objects.requireNonNull(fVar2, "exponent");
        int i10 = 0;
        if (!fVar.B() || !fVar2.H1()) {
            m p10 = m.p(fVar);
            int K = p10.K();
            if (K < 0) {
                p10 = p10.w();
            }
            m p11 = m.p(fVar2);
            if (K < 0) {
                i10 = 1;
            }
            return new e(p10, p11, (byte) i10);
        }
        return d(fVar.s1(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e j(f fVar, boolean z10, boolean z11, c cVar) {
        Objects.requireNonNull(fVar, "diag");
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("Diagnostic information must be 0 or greater,  was: " + fVar);
        } else if (fVar.H1() && z11 == 0) {
            return z10 ? X3 : f23218x;
        } else {
            int i10 = 8;
            if (cVar == null || !cVar.A()) {
                if (!z10) {
                    i10 = 4;
                }
                return new e(m.p(fVar), m.f23252x, (byte) ((z11 ? 1 : 0) | i10));
            }
            e E = new e(m.p(fVar), m.f23252x, (byte) (z11 | 4)).E(cVar);
            int i11 = E.f23222q & (-5);
            if (!z10) {
                i10 = 4;
            }
            return new e(E.f23221d, E.f23220c, (byte) (i11 | i10));
        }
    }

    static e l(f fVar, f fVar2, int i10) {
        Objects.requireNonNull(fVar, "mantissa");
        Objects.requireNonNull(fVar2, "exponent");
        return new e(m.p(fVar).a(), m.p(fVar2), (byte) i10);
    }

    private static e[] o(int i10, int i11) {
        e[] eVarArr = new e[(i11 - i10) + 1];
        int i12 = i10;
        while (i12 <= i11) {
            if (i12 == 0) {
                eVarArr[i12 - i10] = Z3;
            } else if (i12 == 1) {
                eVarArr[i12 - i10] = V3;
            } else if (i12 == 10) {
                eVarArr[i12 - i10] = Y3;
            } else {
                eVarArr[i12 - i10] = new e(m.r(Math.abs(i12)), m.f23252x, (byte) (i12 < 0 ? 1 : 0));
            }
            i12++;
        }
        return eVarArr;
    }

    public static e q(double d10) {
        return r(Double.doubleToRawLongBits(d10));
    }

    public static e r(long j10) {
        int i10 = (int) ((j10 >> 52) & 2047);
        boolean z10 = true;
        int i11 = (j10 >> 63) != 0 ? 1 : 0;
        if (i10 == 2047) {
            if ((j10 & 4503599627370495L) == 0) {
                return i11 != 0 ? f23219y : W3;
            }
            if (((j10 >> 32) & 524288) == 0) {
                z10 = false;
            }
            long j11 = j10 & 2251799813685247L;
            if (j11 == 0 && i11 == 0) {
                return z10 ? f23218x : X3;
            }
            return l(f.Z(j11), f.Y(0), (z10 ? 4 : 8) | i11);
        }
        long j12 = j10 & 4503599627370495L;
        if (i10 == 0) {
            i10++;
        } else {
            j12 |= 4503599627370496L;
        }
        if (j12 == 0) {
            return i11 != 0 ? U3 : Z3;
        }
        while ((1 & j12) == 0) {
            j12 >>= 1;
            i10++;
        }
        return l(f.Z(j12), f.Z(i10 - 1075), i11);
    }

    public static e s(f fVar) {
        return g(fVar, 0);
    }

    public static e t(int i10) {
        if (i10 < -24 || i10 > 128) {
            if (i10 == Integer.MIN_VALUE) {
                return s(f.Y(i10));
            }
            return new e(m.r(Math.abs(i10)), m.f23252x, (byte) (i10 < 0 ? 1 : 0));
        }
        return f23216a4[i10 - (-24)];
    }

    public static e v(long j10) {
        if (j10 < -24 || j10 > 128) {
            if (j10 == Long.MIN_VALUE) {
                return s(f.Z(j10));
            }
            return new e(m.s(Math.abs(j10)), m.f23252x, (byte) (j10 < 0 ? 1 : 0));
        }
        return f23216a4[((int) j10) + 24];
    }

    public static n<e> w() {
        return f23217b4;
    }

    public boolean A() {
        return (this.f23222q & 3) == 2;
    }

    public boolean B() {
        return (this.f23222q & 4) != 0;
    }

    public boolean C() {
        return (this.f23222q & 8) != 0;
    }

    public e D() {
        return new e(this.f23221d, this.f23220c, (byte) (this.f23222q ^ 1));
    }

    public e E(c cVar) {
        return f23217b4.b(this, cVar);
    }

    public long F() {
        if (A()) {
            return 9218868437227405312L;
        }
        if (z()) {
            return -4503599627370496L;
        }
        boolean z10 = false;
        if (y()) {
            int[] iArr = {0, 2146435072};
            if (S()) {
                iArr[1] = iArr[1] | Integer.MIN_VALUE;
            }
            if (B()) {
                iArr[1] = iArr[1] | 524288;
            } else if (Q().H1()) {
                iArr[1] = iArr[1] | 262144;
            }
            if (!Q().H1()) {
                int[] s10 = l.s(Q(), 2);
                iArr[0] = s10[0];
                iArr[1] = iArr[1] | (s10[1] & 524287);
                if (((s10[1] & 524287) | s10[0]) == 0 && !B()) {
                    iArr[1] = iArr[1] | 262144;
                }
            }
            return (iArr[0] & 4294967295L) | (iArr[1] << 32);
        }
        e E = (!R() || this.f23221d.m(4503599627370496L) >= 0 || this.f23220c.l(-900) < 0 || this.f23220c.l(900) > 0) ? E(c.f23185r) : this;
        if (!E.R()) {
            return E.F();
        }
        long E2 = E.f23221d.E();
        if (E.S() && E2 == 0) {
            return Long.MIN_VALUE;
        }
        if (E2 == 0) {
            return 0L;
        }
        long b10 = q.b(E2);
        int D = E.f23220c.D();
        if (b10 < 53) {
            int i10 = 53 - ((int) b10);
            D -= i10;
            if (D < -1074) {
                i10 -= (-1074) - D;
                z10 = true;
                D = -1074;
            }
            E2 <<= i10;
        }
        long j10 = E2 & 4503599627370495L;
        if (!z10) {
            j10 |= (D + 1075) << 52;
        }
        return E.S() ? j10 | Long.MIN_VALUE : j10;
    }

    public d G() {
        return d.A(this);
    }

    public f H() {
        return I(false);
    }

    public String J(c cVar) {
        d Q;
        e E;
        if (cVar == null || !cVar.A()) {
            return toString();
        }
        if (y()) {
            E = j(Q(), C(), S(), cVar);
        } else {
            if (!x()) {
                c n10 = cVar.n();
                e E2 = E(cVar);
                if (E2.x()) {
                    return E2.toString();
                }
                if (!T()) {
                    d G = G();
                    if (cVar.B().C1(10) >= 0) {
                        f d10 = cVar.B().c1(1).d(f.Y(3));
                        f g02 = G.g0();
                        f e02 = G.e0();
                        boolean i02 = G.i0();
                        u7.b bVar = new u7.b(g02, 0, 0);
                        bVar.g(l.q(d10), null, false);
                        f c10 = bVar.c();
                        f d11 = e02.d(bVar.j().F());
                        if ((bVar.h() != 0 || bVar.a() != 0) && c10.S0(10).s1() != 9) {
                            c10 = c10.b(1);
                        }
                        d p10 = d.p(c10, d11);
                        G = i02 ? p10.O() : p10;
                    }
                    boolean G1 = Q().G1();
                    f Y = f.Y(0);
                    while (true) {
                        f d12 = Y.d(f.Y(1));
                        Q = G.Q(n10.j(d12));
                        if (Q.U(n10).compareTo(E2) == 0) {
                            break;
                        }
                        Y = d12;
                    }
                    if (G1 && Y.I1() > 0) {
                        c j10 = n10.j(Y);
                        d P = G.Q(j10).P(j10);
                        if (P.U(n10).compareTo(E2) == 0) {
                            Q = P;
                        }
                    }
                    return (Q.e0().I1() <= 0 || Q.a().compareTo(d.C(10000000)) >= 0) ? Q.toString() : Q.X();
                }
            }
            E = E(cVar);
        }
        return E.toString();
    }

    /* renamed from: N */
    public int compareTo(e eVar) {
        return f23217b4.e(this, eVar);
    }

    public final f O() {
        return this.f23220c.B();
    }

    public final f P() {
        return S() ? this.f23221d.B().L0() : this.f23221d.B();
    }

    public final f Q() {
        return this.f23221d.B();
    }

    public final boolean R() {
        return (this.f23222q & 14) == 0;
    }

    public final boolean S() {
        return (this.f23222q & 1) != 0;
    }

    public final boolean T() {
        return (this.f23222q & 14) == 0 && this.f23221d.J();
    }

    public final int U() {
        if ((this.f23222q & 14) != 0 || !this.f23221d.J()) {
            return (this.f23222q & 1) != 0 ? -1 : 1;
        }
        return 0;
    }

    public e a() {
        return S() ? new e(this.f23221d, this.f23220c, (byte) (this.f23222q & (-2))) : this;
    }

    public e b(c cVar) {
        return f23217b4.f(this, cVar);
    }

    public boolean equals(Object obj) {
        return p(obj instanceof e ? (e) obj : null);
    }

    public int hashCode() {
        return (this.f23220c.hashCode() * 403797019) + 403796923 + (this.f23221d.hashCode() * 403797059) + (this.f23222q * 403797127);
    }

    public e m(e eVar, c cVar) {
        return f23217b4.c(this, eVar, cVar);
    }

    public boolean p(e eVar) {
        return eVar != null && this.f23220c.equals(eVar.f23220c) && this.f23221d.equals(eVar.f23221d) && this.f23222q == eVar.f23222q;
    }

    public String toString() {
        return d.A(this).toString();
    }

    public boolean x() {
        return (this.f23222q & 2) != 0;
    }

    public boolean y() {
        return (this.f23222q & 12) != 0;
    }

    public boolean z() {
        return (this.f23222q & 3) == 3;
    }
}
