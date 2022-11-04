package u7;

import java.util.Objects;
/* loaded from: classes.dex */
public final class d implements Comparable<d> {
    public static final d V3;
    public static final d Y3;
    public static final d Z3;

    /* renamed from: b4 */
    private static final b f23207b4;

    /* renamed from: c4 */
    private static final n<d> f23208c4;

    /* renamed from: d4 */
    private static final n<d> f23209d4;

    /* renamed from: c */
    private final m f23213c;

    /* renamed from: d */
    private final m f23214d;

    /* renamed from: q */
    private final byte f23215q;

    /* renamed from: x */
    public static final d f23211x = r(f.Y(0), f.Y(0), 4);

    /* renamed from: y */
    public static final d f23212y = r(f.Y(0), f.Y(0), 3);
    public static final d U3 = r(f.Y(0), f.Y(0), 1);
    public static final d W3 = r(f.Y(0), f.Y(0), 2);
    public static final d X3 = r(f.Y(0), f.Y(0), 8);

    /* renamed from: a4 */
    private static final d[] f23206a4 = x(-24, 128);

    /* renamed from: e4 */
    private static final int[] f23210e4 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* loaded from: classes.dex */
    private static final class b implements o<d> {
        private b() {
        }

        @Override // u7.o
        public f a(f fVar, l lVar) {
            if (fVar.H1()) {
                return fVar;
            }
            boolean j10 = lVar.j();
            int G = j10 ? lVar.G() : 0;
            return (!j10 || G != 0) ? fVar.C1(1) != 0 ? j10 ? q.s(fVar, G) : q.t(fVar, lVar.F()) : j10 ? q.n(G) : q.p(lVar.F()) : fVar;
        }

        @Override // u7.o
        public int f() {
            return 1;
        }

        @Override // u7.o
        public int h() {
            return 10;
        }

        @Override // u7.o
        public m k(m mVar, m mVar2) {
            if (mVar.J()) {
                return mVar;
            }
            boolean h10 = mVar2.h();
            int D = h10 ? mVar2.D() : 0;
            if (h10 && D == 0) {
                return mVar;
            }
            f B = mVar.B();
            return m.p(B.C1(1) != 0 ? h10 ? q.s(B, D) : q.t(B, mVar2.B()) : h10 ? q.n(D) : q.p(mVar2.B()));
        }

        @Override // u7.o
        public p m(f fVar, int i10, int i11) {
            return new u7.b(fVar, i10, i11);
        }

        @Override // u7.o
        public l o(f fVar) {
            long h02 = fVar.h0();
            return h02 != Long.MAX_VALUE ? l.r(h02) : l.q(fVar.g0());
        }

        @Override // u7.o
        public l p(f fVar, f fVar2) {
            if (!fVar2.H1() && fVar2.d0(f.Y(10)).compareTo(f.Y(1)) != 0 && !fVar2.H1()) {
                f i02 = fVar2.i0();
                f d12 = fVar2.d1(i02);
                l lVar = new l(0);
                while (true) {
                    f[] K = d12.K(f.Z(5L));
                    f fVar3 = K[0];
                    if (!K[1].H1()) {
                        break;
                    }
                    lVar.t();
                    d12 = fVar3;
                }
                if (d12.compareTo(f.Y(1)) != 0) {
                    return null;
                }
                l q10 = l.q(i02);
                return lVar.compareTo(q10) > 0 ? lVar : q10;
            }
            return null;
        }

        @Override // u7.o
        public p q(m mVar, int i10, int i11) {
            return mVar.h() ? new u7.b(mVar.D(), i10, i11) : new u7.b(mVar.B(), i10, i11);
        }

        /* renamed from: r */
        public d d(f fVar, f fVar2, int i10) {
            return d.s(m.p(fVar), m.p(fVar2), i10);
        }

        /* renamed from: s */
        public d l(m mVar, m mVar2, int i10) {
            return d.s(mVar, mVar2, i10);
        }

        /* renamed from: t */
        public f j(d dVar) {
            return dVar.f23214d.B();
        }

        /* renamed from: u */
        public m g(d dVar) {
            return dVar.f23214d;
        }

        /* renamed from: v */
        public int e(d dVar) {
            return dVar.f23215q & 255;
        }

        /* renamed from: w */
        public f b(d dVar) {
            return dVar.f23213c.B();
        }

        /* renamed from: x */
        public m i(d dVar) {
            return dVar.f23213c;
        }

        /* renamed from: y */
        public int n(d dVar) {
            return dVar.k0();
        }

        /* renamed from: z */
        public d c(int i10) {
            return i10 == 0 ? d.Z3 : i10 == 1 ? d.V3 : d.D(i10);
        }
    }

    static {
        m r10 = m.r(1);
        m mVar = m.f23252x;
        V3 = new d(r10, mVar, (byte) 0);
        Y3 = new d(m.r(10), mVar, (byte) 0);
        Z3 = new d(mVar, mVar, (byte) 0);
        b bVar = new b();
        f23207b4 = bVar;
        f23208c4 = new r(bVar);
        f23209d4 = new t(new k(bVar));
    }

    d(m mVar, m mVar2, byte b10) {
        this.f23213c = mVar;
        this.f23214d = mVar2;
        this.f23215q = b10;
    }

    public static d A(e eVar) {
        Objects.requireNonNull(eVar, "bigfloat");
        int i10 = 0;
        if (eVar.y() || eVar.x()) {
            int S = eVar.S() | (eVar.x() ? 2 : 0) | (eVar.B() ? 4 : 0);
            if (eVar.C()) {
                i10 = 8;
            }
            return r(eVar.Q(), eVar.O(), S | i10);
        }
        f O = eVar.O();
        f P = eVar.P();
        if (P.H1()) {
            return eVar.S() ? U3 : Z3;
        } else if (O.H1()) {
            return B(P);
        } else {
            if (O.I1() <= 0) {
                return p(P.K0(q.m(O.L0())), O);
            }
            l q10 = l.q(O);
            if (P.I1() < 0) {
                i10 = 1;
            }
            if (i10 != 0) {
                P = P.L0();
            }
            while (q10.L() > 0) {
                int i11 = 1000000;
                if (q10.l(1000000) < 0) {
                    i11 = q10.G();
                }
                P = P.a1(i11);
                q10.g(-i11);
            }
            if (i10 != 0) {
                P = P.L0();
            }
            return B(P);
        }
    }

    public static d B(f fVar) {
        return p(fVar, f.Y(0));
    }

    public static d C(int i10) {
        return (i10 < -24 || i10 > 128) ? i10 == Integer.MIN_VALUE ? p(f.Y(i10), f.Y(0)) : i10 < 0 ? new d(m.r(i10).w(), m.f23252x, (byte) 1) : new d(m.r(i10), m.f23252x, (byte) 0) : f23206a4[i10 - (-24)];
    }

    public static d D(long j10) {
        return (j10 < -24 || j10 > 128) ? (j10 <= -2147483648L || j10 > 2147483647L) ? p(f.Z(j10), f.Y(0)) : j10 < 0 ? new d(m.r((int) j10).w(), m.f23252x, (byte) 1) : new d(m.r((int) j10), m.f23252x, (byte) 0) : f23206a4[(int) (j10 - (-24))];
    }

    private static f E(e eVar) {
        if (eVar.R() && !eVar.T()) {
            return eVar.O().d(eVar.Q().l0().l1(1));
        }
        return f.Y(0);
    }

    private static f[] F(d dVar) {
        if (!dVar.h0()) {
            return new f[]{f.Y(0), f.Y(0)};
        }
        if (dVar.j0()) {
            return new f[]{f.Y(0), f.Y(0)};
        }
        f e02 = dVar.e0();
        f[] g10 = q.g(dVar.g0());
        f d10 = e02.d(g10[0].l1(1));
        f d11 = e02.d(g10[1].l1(1));
        return new f[]{f.G0(d10, d11), f.E0(d10, d11)};
    }

    static n<d> G(c cVar) {
        return (cVar == null || cVar == c.f23191x) ? f23208c4 : (cVar.F() || cVar.D() != 0) ? f23209d4 : f23208c4;
    }

    private static long H(long j10, int i10, boolean z10) {
        while (j10 < 4503599627370496L) {
            j10 <<= 1;
            i10--;
        }
        long j11 = (j10 & 4503599627370495L) | ((i10 + 1075) << 52);
        return z10 ? j11 | Long.MIN_VALUE : j11;
    }

    private f W(boolean z10) {
        if (h0()) {
            int I1 = e0().I1();
            if (j0()) {
                return f.Y(0);
            }
            if (I1 == 0) {
                return f0();
            }
            if (I1 > 0) {
                if (e0().o0().C1(64) > 0) {
                    throw new UnsupportedOperationException("Not enough memory to store as EInteger.");
                }
                return f0().K0(q.p(e0()));
            } else if (z10 && !this.f23213c.I()) {
                throw new ArithmeticException("Not an exact integer");
            } else {
                l x10 = this.f23214d.C().x();
                u7.b bVar = new u7.b(this.f23213c.B(), 0, 0);
                if (!z10) {
                    bVar.v(x10);
                } else if (!bVar.t(x10)) {
                    throw new ArithmeticException("Not an exact integer");
                }
                f c10 = bVar.c();
                return i0() ? c10.L0() : c10;
            }
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    private String Y(int i10) {
        int i11;
        StringBuilder sb2;
        StringBuilder sb3;
        int i12;
        int D;
        StringBuilder sb4;
        StringBuilder sb5;
        int i13 = 1;
        int i14 = (this.f23215q & 1) != 0 ? 1 : 0;
        if (!h0()) {
            byte b10 = this.f23215q;
            if ((b10 & 2) != 0) {
                return i14 != 0 ? "-Infinity" : "Infinity";
            } else if ((b10 & 8) != 0) {
                if (this.f23213c.J()) {
                    return i14 != 0 ? "-sNaN" : "sNaN";
                }
                if (i14 != 0) {
                    sb5 = new StringBuilder();
                    sb5.append("-sNaN");
                } else {
                    sb5 = new StringBuilder();
                    sb5.append("sNaN");
                }
                sb5.append(this.f23213c);
                return sb5.toString();
            } else if ((b10 & 4) != 0) {
                if (this.f23213c.J()) {
                    return i14 != 0 ? "-NaN" : "NaN";
                }
                if (i14 != 0) {
                    sb4 = new StringBuilder();
                    sb4.append("-NaN");
                } else {
                    sb4 = new StringBuilder();
                    sb4.append("NaN");
                }
                sb4.append(this.f23213c);
                return sb4.toString();
            }
        }
        int i15 = -this.f23214d.K();
        if (i15 == 0) {
            String mVar = this.f23213c.toString();
            if (i14 == 0) {
                return mVar;
            }
            return "-" + mVar;
        }
        boolean J = this.f23213c.J();
        if (i10 == 2 && J && i15 < 0) {
            String mVar2 = this.f23213c.toString();
            if (i14 == 0) {
                return mVar2;
            }
            return "-" + mVar2;
        }
        if (i10 == 0 && this.f23213c.h() && this.f23214d.h()) {
            int D2 = this.f23214d.D();
            int D3 = this.f23213c.D();
            if (D3 < 1000 && D2 == -2) {
                int i16 = D3 % 10;
                int i17 = D3 / 10;
                int i18 = i17 % 10;
                int i19 = i17 / 10;
                int i20 = i14 + 4;
                char[] cArr = new char[i20];
                if (i14 != 0) {
                    cArr[0] = '-';
                } else {
                    i13 = 0;
                }
                int i21 = i13 + 1;
                cArr[i13] = (char) (i19 + 48);
                int i22 = i21 + 1;
                cArr[i21] = '.';
                cArr[i22] = (char) (i18 + 48);
                cArr[i22 + 1] = (char) (i16 + 48);
                return new String(cArr, 0, i20);
            } else if (D3 < 100 && D2 == -1) {
                int i23 = D3 % 10;
                int i24 = D3 / 10;
                int i25 = i14 + 3;
                char[] cArr2 = new char[i25];
                if (i14 != 0) {
                    cArr2[0] = '-';
                } else {
                    i13 = 0;
                }
                int i26 = i13 + 1;
                cArr2[i13] = (char) (i24 + 48);
                cArr2[i26] = '.';
                cArr2[i26 + 1] = (char) (i23 + 48);
                return new String(cArr2, 0, i25);
            }
        }
        String mVar3 = this.f23213c.toString();
        if (i10 == 0 && mVar3.length() < 100 && this.f23214d.h() && (D = this.f23214d.D()) > -100 && D < 100) {
            int length = (mVar3.length() + D) - 1;
            if (i15 >= 0 && length >= -6 && i15 > 0) {
                int length2 = mVar3.length();
                int i27 = D + length2;
                if (i27 < 0) {
                    int i28 = -i27;
                    int i29 = i28 + 2 + i14 + length2;
                    char[] cArr3 = new char[i29];
                    if (i14 != 0) {
                        cArr3[0] = '-';
                    } else {
                        i13 = 0;
                    }
                    int i30 = i13 + 1;
                    cArr3[i13] = '0';
                    int i31 = i30 + 1;
                    cArr3[i30] = '.';
                    int i32 = 0;
                    while (i32 < i28) {
                        cArr3[i31] = '0';
                        i32++;
                        i31++;
                    }
                    int i33 = 0;
                    while (i33 < length2) {
                        cArr3[i31] = mVar3.charAt(i33);
                        i33++;
                        i31++;
                    }
                    return new String(cArr3, 0, i29);
                } else if (i27 == 0) {
                    int i34 = i14 + 2 + length2;
                    char[] cArr4 = new char[i34];
                    if (i14 != 0) {
                        cArr4[0] = '-';
                    } else {
                        i13 = 0;
                    }
                    int i35 = i13 + 1;
                    cArr4[i13] = '0';
                    int i36 = i35 + 1;
                    cArr4[i35] = '.';
                    int i37 = 0;
                    while (i37 < length2) {
                        cArr4[i36] = mVar3.charAt(i37);
                        i37++;
                        i36++;
                    }
                    return new String(cArr4, 0, i34);
                } else if (i27 > 0 && i27 <= length2) {
                    int i38 = i14 + 1 + length2;
                    char[] cArr5 = new char[i38];
                    if (i14 != 0) {
                        cArr5[0] = '-';
                    } else {
                        i13 = 0;
                    }
                    int i39 = 0;
                    while (i39 < i27) {
                        cArr5[i13] = mVar3.charAt(i39);
                        i39++;
                        i13++;
                    }
                    int i40 = i13 + 1;
                    cArr5[i13] = '.';
                    while (i27 < length2) {
                        cArr5[i40] = mVar3.charAt(i27);
                        i27++;
                        i40++;
                    }
                    return new String(cArr5, 0, i38);
                }
            }
        }
        l q10 = l.q(e0());
        l lVar = new l(mVar3.length());
        l m10 = q10.m();
        q10.b(lVar).p();
        l lVar2 = new l(1);
        l lVar3 = new l(-6);
        if (i10 == 1) {
            l m11 = q10.m();
            boolean z10 = q10.L() < 0;
            int G = q10.m().a().y(3).G();
            if (!J || (q10.compareTo(lVar3) >= 0 && i15 >= 0)) {
                i11 = 2;
                if (G == 1) {
                    if (z10) {
                        lVar2.g(2);
                        i12 = -2;
                        m11.g(i12);
                    }
                    lVar2.t();
                    m11.p();
                } else {
                    i12 = -2;
                    if (G == 2) {
                        if (!z10) {
                            lVar2.g(2);
                            m11.g(i12);
                        }
                        lVar2.t();
                        m11.p();
                    }
                }
            } else if (G != 1) {
                i11 = 2;
                if (G == 2) {
                    if (!z10) {
                        lVar2.t();
                        m11.t();
                    }
                    lVar2.g(i11);
                    m11.g(i11);
                }
                lVar3.t();
            } else if (z10) {
                lVar2.t();
                m11.t();
                i11 = 2;
                lVar3.t();
            } else {
                i11 = 2;
                lVar2.g(i11);
                m11.g(i11);
                lVar3.t();
            }
            q10 = m11;
        } else {
            i11 = 2;
        }
        int i41 = Integer.MAX_VALUE;
        if (i10 != i11 && (q10.compareTo(lVar3) < 0 || i15 < 0)) {
            if (i10 != 1 || !J || lVar2.l(1) <= 0) {
                l m12 = lVar2.m();
                int l10 = m12.l(mVar3.length());
                if (l10 > 0) {
                    m12.D(mVar3.length());
                    StringBuilder sb6 = new StringBuilder();
                    if (i14 != 0) {
                        sb6.append('-');
                    }
                    sb6.append(mVar3);
                    h(sb6, '0', m12);
                    sb3 = sb6;
                } else if (l10 < 0) {
                    if (!m12.j()) {
                        throw new UnsupportedOperationException();
                    }
                    int G2 = m12.G();
                    if (m12.L() < 0) {
                        G2 = 0;
                    }
                    l g10 = new l(mVar3.length()).g(6);
                    if (g10.l(Integer.MAX_VALUE) <= 0) {
                        i41 = g10.G();
                    }
                    StringBuilder sb7 = new StringBuilder(i41);
                    if (i14 != 0) {
                        sb7.append('-');
                    }
                    sb7.append((CharSequence) mVar3, 0, G2);
                    sb7.append('.');
                    sb7.append((CharSequence) mVar3, G2, (mVar3.length() - G2) + G2);
                    sb3 = sb7;
                } else if (q10.L() == 0 && i14 == 0) {
                    return mVar3;
                } else {
                    if (q10.L() == 0 && i14 != 0) {
                        return "-" + mVar3;
                    }
                    sb3 = new StringBuilder();
                    if (i14 != 0) {
                        sb3.append('-');
                    }
                    sb3.append(mVar3);
                }
            } else {
                sb3 = new StringBuilder();
                if (i14 != 0) {
                    sb3.append('-');
                }
                sb3.append(mVar3);
                sb3.append('.');
                h(sb3, '0', lVar2.m().p());
            }
            if (q10.L() != 0) {
                sb3.append(q10.L() < 0 ? "E-" : "E+");
                q10.a();
                sb3.append(q10.toString());
            }
            return sb3.toString();
        } else if (i15 <= 0) {
            if (i10 != 2 || i15 >= 0) {
                if (i14 == 0) {
                    return mVar3;
                }
                return "-" + mVar3;
            }
            l m13 = m10.m();
            StringBuilder sb8 = new StringBuilder();
            if (i14 != 0) {
                sb8.append('-');
            }
            sb8.append(mVar3);
            h(sb8, '0', m13);
            return sb8.toString();
        } else {
            l b11 = m10.m().b(lVar);
            int l11 = b11.l(0);
            if (l11 < 0) {
                l g11 = new l(mVar3.length()).g(6);
                if (g11.l(Integer.MAX_VALUE) <= 0) {
                    i41 = g11.G();
                }
                sb2 = new StringBuilder(i41);
                if (i14 != 0) {
                    sb2.append('-');
                }
                sb2.append("0.");
                h(sb2, '0', b11.m().x());
            } else if (l11 != 0) {
                if (b11.l(mVar3.length()) > 0) {
                    if (!lVar.j()) {
                        throw new UnsupportedOperationException();
                    }
                    int G3 = lVar.G();
                    if (G3 < 0) {
                        G3 = 0;
                    }
                    l g12 = new l(mVar3.length()).g(6);
                    if (g12.l(Integer.MAX_VALUE) <= 0) {
                        i41 = g12.G();
                    }
                    sb2 = new StringBuilder(i41);
                    if (i14 != 0) {
                        sb2.append('-');
                    }
                    sb2.append((CharSequence) mVar3, 0, G3);
                    h(sb2, '0', b11.m().D(sb2.length()));
                    sb2.append('.');
                    sb2.append((CharSequence) mVar3, G3, (mVar3.length() - G3) + G3);
                } else if (!b11.j()) {
                    throw new UnsupportedOperationException();
                } else {
                    int G4 = b11.G();
                    if (G4 < 0) {
                        G4 = 0;
                    }
                    l g13 = new l(mVar3.length()).g(6);
                    if (g13.l(Integer.MAX_VALUE) <= 0) {
                        i41 = g13.G();
                    }
                    sb2 = new StringBuilder(i41);
                    if (i14 != 0) {
                        sb2.append('-');
                    }
                    sb2.append((CharSequence) mVar3, 0, G4);
                    sb2.append('.');
                    sb2.append((CharSequence) mVar3, G4, (mVar3.length() - G4) + G4);
                }
                return sb2.toString();
            } else {
                l g14 = new l(mVar3.length()).g(6);
                if (g14.l(Integer.MAX_VALUE) <= 0) {
                    i41 = g14.G();
                }
                sb2 = new StringBuilder(i41);
                if (i14 != 0) {
                    sb2.append('-');
                }
                sb2.append("0.");
            }
            sb2.append(mVar3);
            return sb2.toString();
        }
    }

    private e Z(e eVar) {
        return i0() ? eVar.D() : eVar;
    }

    private static boolean h(StringBuilder sb2, char c10, l lVar) {
        if (lVar.l(Integer.MAX_VALUE) > 0 || lVar.L() < 0) {
            throw new UnsupportedOperationException();
        }
        int G = lVar.G();
        int i10 = 0;
        if (G <= 10000) {
            while (i10 < G) {
                sb2.append(c10);
                i10++;
            }
            return true;
        }
        StringBuilder sb3 = new StringBuilder(10000);
        for (int i11 = 0; i11 < 10000; i11++) {
            sb2.append(c10);
        }
        String sb4 = sb3.toString();
        int i12 = G / 10000;
        int i13 = G % 10000;
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(sb4);
        }
        while (i10 < i13) {
            sb2.append(c10);
            i10++;
        }
        return true;
    }

    private static int j(d dVar, e eVar) {
        if (eVar == null) {
            return 1;
        }
        if (dVar.J()) {
            return !eVar.y();
        }
        int k02 = dVar.k0();
        int U = eVar.U();
        if (k02 != U) {
            return k02 < U ? -1 : 1;
        } else if (U == 0 || k02 == 0) {
            return 0;
        } else {
            if (dVar.I()) {
                if (eVar.x()) {
                    return 0;
                }
                return dVar.i0() ? -1 : 1;
            } else if (eVar.x()) {
                return eVar.S() ? 1 : -1;
            } else {
                if (eVar.O().compareTo(f.Z(-1000L)) < 0) {
                    if (eVar.b(null).compareTo(e.V3) < 0 && dVar.b(null).compareTo(V3) >= 0) {
                        return k02 > 0 ? 1 : -1;
                    }
                    if (eVar.O().a().compareTo(eVar.P().o0()) > 0) {
                        int j10 = j(dVar, e.h(eVar.P(), f.Y(-1000)));
                        if (eVar.U() < 0 && j10 < 0) {
                            return -1;
                        }
                        if (eVar.U() > 0 && j10 > 0) {
                            return 1;
                        }
                    }
                    f[] F = F(dVar);
                    f E = E(eVar);
                    if (F[0].I1() < 0 && F[0].C1(-1000) >= 0 && E.C1(-4000) < 0) {
                        return k02 > 0 ? 1 : -1;
                    } else if (F[1].I1() < 0 && F[1].C1(-1000) < 0 && E.C1(-1000) < 0) {
                        f a10 = F[0].b(1).a();
                        f a11 = F[1].b(1).a();
                        f a12 = E.b(1).a();
                        if (a12.J0(1000).M(f.G0(a10, a11)).C1(3321) < 0) {
                            return k02 > 0 ? -1 : 1;
                        }
                        if (a12.J0(1000).M(f.E0(a10, a11)).C1(3322) > 0) {
                            return k02 > 0 ? 1 : -1;
                        }
                    }
                }
                if (eVar.O().C1(1000) > 0) {
                    if (dVar.b(null).m(B(f.Y(1).a1(999))) <= 0) {
                        return k02 > 0 ? -1 : 1;
                    }
                    f[] F2 = F(dVar);
                    f E2 = E(eVar);
                    if (F2[0].I1() > 0 && F2[0].compareTo(E2) >= 0) {
                        return k02 > 0 ? 1 : -1;
                    } else if (F2[1].I1() > 0 && F2[1].C1(1000) < 0 && E2.C1(4000) >= 0) {
                        return k02 > 0 ? -1 : 1;
                    } else if (F2[0].I1() > 0 && F2[0].C1(1000) >= 0 && E2.C1(1000) >= 0) {
                        f b10 = F2[0].b(1);
                        f b11 = F2[1].b(1);
                        f b12 = E2.b(1);
                        if (b12.J0(1000).M(f.G0(b10, b11)).C1(3321) < 0) {
                            return k02 > 0 ? 1 : -1;
                        }
                        if (b12.J0(1000).M(f.E0(b10, b11)).C1(3322) >= 0) {
                            return k02 > 0 ? -1 : 1;
                        }
                    }
                }
                return dVar.compareTo(A(eVar));
            }
        }
    }

    public static d o(int i10, int i11) {
        return (i11 != 0 || i10 < -24 || i10 > 128) ? i10 < 0 ? i10 == Integer.MIN_VALUE ? new d(m.s(-2147483648L).w(), m.r(i11), (byte) 1) : new d(m.r(-i10), m.r(i11), (byte) 1) : i10 == 0 ? new d(m.f23252x, m.r(i11), (byte) 0) : new d(m.r(i10), m.r(i11), (byte) 0) : f23206a4[i10 - (-24)];
    }

    public static d p(f fVar, f fVar2) {
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
            return new d(p10, p11, (byte) i10);
        }
        return o(fVar.s1(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d q(f fVar, boolean z10, boolean z11, c cVar) {
        Objects.requireNonNull(fVar, "diag");
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("Diagnostic information must be 0 or greater,  was: " + fVar);
        } else if (fVar.H1() && z11 == 0) {
            return z10 ? X3 : f23211x;
        } else {
            int i10 = 8;
            if (cVar == null || !cVar.A()) {
                if (!z10) {
                    i10 = 4;
                }
                return new d(m.p(fVar), m.f23252x, (byte) ((z11 ? 1 : 0) | i10));
            }
            d Q = new d(m.p(fVar), m.f23252x, (byte) (z11 | 4)).Q(cVar);
            int i11 = Q.f23215q & (-5);
            if (!z10) {
                i10 = 4;
            }
            return new d(Q.f23213c, Q.f23214d, (byte) (i11 | i10));
        }
    }

    static d r(f fVar, f fVar2, int i10) {
        Objects.requireNonNull(fVar, "mantissa");
        Objects.requireNonNull(fVar2, "exponent");
        return new d(m.p(fVar), m.p(fVar2), (byte) i10);
    }

    static d s(m mVar, m mVar2, int i10) {
        Objects.requireNonNull(mVar, "mantissa");
        Objects.requireNonNull(mVar2, "exponent");
        return new d(mVar, mVar2, (byte) i10);
    }

    private static d[] x(int i10, int i11) {
        d[] dVarArr = new d[(i11 - i10) + 1];
        int i12 = i10;
        while (i12 <= i11) {
            if (i12 == 0) {
                dVarArr[i12 - i10] = Z3;
            } else if (i12 == 1) {
                dVarArr[i12 - i10] = V3;
            } else if (i12 == 10) {
                dVarArr[i12 - i10] = Y3;
            } else {
                dVarArr[i12 - i10] = new d(m.r(Math.abs(i12)), m.f23252x, (byte) (i12 < 0 ? 1 : 0));
            }
            i12++;
        }
        return dVarArr;
    }

    private boolean y(d dVar) {
        return dVar != null && this.f23215q == dVar.f23215q && this.f23213c.equals(dVar.f23213c) && this.f23214d.equals(dVar.f23214d);
    }

    public static d z(long j10) {
        int[] iArr = {(int) (j10 & 4294967295L), (int) ((j10 >> 32) & 4294967295L)};
        int i10 = (iArr[1] >> 20) & 2047;
        int i11 = (iArr[1] >> 31) != 0 ? 1 : 0;
        if (i10 == 2047) {
            if ((iArr[1] & 1048575) == 0 && iArr[0] == 0) {
                return i11 != 0 ? f23212y : W3;
            }
            boolean z10 = (iArr[1] & 524288) != 0;
            iArr[1] = iArr[1] & 524287;
            long j11 = (4294967295L & iArr[0]) | (iArr[1] << 32);
            return (j11 == 0 && i11 == 0) ? z10 ? f23211x : X3 : new d(m.s(j11), m.f23252x, (byte) ((z10 ? 4 : 8) | i11));
        }
        iArr[1] = iArr[1] & 1048575;
        if (i10 == 0) {
            i10++;
        } else {
            iArr[1] = iArr[1] | 1048576;
        }
        if ((iArr[1] | iArr[0]) == 0) {
            return i11 != 0 ? U3 : Z3;
        }
        int w9 = (i10 + q.w(iArr)) - 1075;
        long j12 = (4294967295L & iArr[0]) | (iArr[1] << 32);
        if (w9 == 0) {
            if (i11 != 0) {
                j12 = -j12;
            }
            return D(j12);
        }
        f Z = f.Z(j12);
        if (w9 > 0) {
            f a12 = Z.a1(w9);
            if (i11 != 0) {
                a12 = a12.L0();
            }
            return B(a12);
        }
        f K0 = Z.K0(q.l(-w9));
        if (i11 != 0) {
            K0 = K0.L0();
        }
        return p(K0, f.Y(w9));
    }

    public boolean I() {
        return (this.f23215q & 2) != 0;
    }

    public boolean J() {
        return (this.f23215q & 12) != 0;
    }

    public boolean K() {
        return (this.f23215q & 3) == 3;
    }

    public boolean L() {
        return (this.f23215q & 3) == 2;
    }

    public boolean M() {
        return (this.f23215q & 4) != 0;
    }

    public boolean N() {
        return (this.f23215q & 8) != 0;
    }

    public d O() {
        return new d(this.f23213c, this.f23214d, (byte) (this.f23215q ^ 1));
    }

    public d P(c cVar) {
        return G(cVar).a(this, cVar);
    }

    public d Q(c cVar) {
        return G(cVar).b(this, cVar);
    }

    public double R() {
        return Double.longBitsToDouble(S());
    }

    public long S() {
        long j10;
        long j11;
        if (L()) {
            return 9218868437227405312L;
        }
        if (K()) {
            return -4503599627370496L;
        }
        if (i0() && j0()) {
            return Long.MIN_VALUE;
        }
        if (j0()) {
            return 0L;
        }
        if (h0()) {
            if (this.f23214d.l(0) == 0 && this.f23213c.j()) {
                long E = this.f23213c.E();
                if (E < 9007199254740992L) {
                    return H(E, 0, i0());
                }
            }
            if (this.f23214d.l(0) < 0 && this.f23214d.l(-8) >= 0 && this.f23213c.h()) {
                int D = this.f23213c.D();
                int i10 = f23210e4[-this.f23214d.D()];
                if (D != Integer.MIN_VALUE) {
                    if (D % i10 == 0) {
                        return H(D / i10, 0, i0());
                    }
                    for (long abs = Math.abs(D); abs < 1048576; abs <<= 1) {
                    }
                    int a10 = q.a(D);
                    int a11 = q.a(i10);
                    int max = a10 <= a11 ? (a11 - a10) + 53 + 1 : Math.max(0, 54 - (a10 - a11));
                    if (a11 + max > 63) {
                        f[] K = f.Y(D).a1(max).K(f.Y(i10));
                        f fVar = K[0];
                        f fVar2 = K[1];
                        long j12 = -1;
                        if (!fVar.C() || !fVar2.C()) {
                            j11 = -1;
                        } else {
                            j12 = fVar.u1();
                            j11 = fVar2.u1();
                        }
                        j10 = j12;
                    } else {
                        long j13 = D << max;
                        long j14 = i10;
                        j10 = j13 / j14;
                        j11 = j13 - (j14 * j10);
                    }
                    int i11 = -max;
                    if (j10 >= 9007199254740992L) {
                        while (j10 >= 18014398509481984L) {
                            j11 |= j10 & 1;
                            j10 >>= 1;
                            i11++;
                        }
                        long j15 = (!((j10 & 3) == 3 && j11 == 0) && ((j10 & 1) == 0 || j11 == 0)) ? j10 >> 1 : (j10 >> 1) + 1;
                        while (true) {
                            i11++;
                            if (j15 < 9007199254740992L) {
                                break;
                            }
                            j15 >>= 1;
                        }
                        long j16 = (j15 & 4503599627370495L) | ((i11 + 1075) << 52);
                        return i0() ? j16 | Long.MIN_VALUE : j16;
                    }
                }
            }
            if (this.f23214d.l(309) > 0) {
                return i0() ? -4503599627370496L : 9218868437227405312L;
            }
        }
        return U(c.f23185r).F();
    }

    public e T() {
        return U(c.f23191x);
    }

    public e U(c cVar) {
        f e02 = e0();
        f g02 = g0();
        if (J()) {
            return e.j(g0(), N(), i0(), cVar);
        }
        if (L()) {
            return e.W3.E(cVar);
        }
        if (K()) {
            return e.f23219y.E(cVar);
        }
        if (g02.H1()) {
            return (i0() ? e.U3 : e.Z3).E(cVar);
        } else if (e02.H1()) {
            return Z(e.s(g02)).E(cVar);
        } else {
            c cVar2 = c.f23185r;
            if (cVar != null && cVar.A() && cVar.x() && !cVar.F() && cVar.u().compareTo(cVar2.u()) <= 0 && cVar.v().compareTo(cVar2.v()) >= 0 && cVar.B().compareTo(cVar2.B()) <= 0) {
                f[] g10 = q.g(g02);
                int i10 = 1;
                if (e02.d(g10[1].l1(1)).C1(-326) < 0) {
                    f l12 = cVar.v().n1(cVar.B().l1(1)).l1(2);
                    if (i0()) {
                        i10 = -1;
                    }
                    return e.h(f.Y(i10), l12).E(cVar);
                } else if (e02.C1(309) > 0) {
                    return e.w().g(cVar, i0());
                } else {
                    f fVar = g10[0];
                    if (e02.I1() >= 0) {
                        if (fVar.l1(2).C1(309) > 0) {
                            return e.w().g(cVar, i0());
                        }
                    }
                    if (fVar.d(e02).l1(2).C1(309) > 0) {
                        return e.w().g(cVar, i0());
                    }
                }
            }
            if (e02.I1() > 0) {
                if (cVar == c.f23184q) {
                    if (e02.C1(39) > 0) {
                        return i0() ? e.f23219y : e.W3;
                    }
                } else if (cVar == cVar2 && e02.C1(309) > 0) {
                    return i0() ? e.f23219y : e.W3;
                }
                return Z(e.s(g02.K0(q.p(e02)))).E(cVar);
            }
            f p10 = q.p(e02.L0());
            if (cVar == null) {
                cVar = c.f23191x;
            }
            if (cVar.A()) {
                e s10 = e.s(g02);
                if (k0() < 0) {
                    s10 = s10.D();
                }
                return s10.m(e.s(p10), cVar);
            } else if (!cVar.z()) {
                e s11 = e.s(g02);
                if (k0() < 0) {
                    s11 = s11.D();
                }
                e s12 = e.s(p10);
                e m10 = s11.m(s12, cVar);
                return !m10.y() ? m10 : s11.m(s12, cVar.j(f.E0(g02.o0(), f.Y(53))));
            } else if (cVar.D() != 0) {
                c f10 = cVar.f();
                return (e) cVar.g(U(f10), f10);
            } else {
                c k10 = cVar.k();
                e s13 = e.s(g02);
                if (k0() < 0) {
                    s13 = s13.D();
                }
                e s14 = e.s(p10);
                e m11 = s13.m(s14, k10);
                if (!m11.y()) {
                    cVar.G(cVar.w() | k10.w());
                    return m11;
                }
                c k11 = cVar.j(f.E0(g02.o0(), f.Y(53))).k();
                e m12 = s13.m(s14, k11);
                cVar.G(k11.w() | cVar.w());
                return m12;
            }
        }
    }

    public f V() {
        return W(false);
    }

    public String X() {
        return Y(2);
    }

    public d a() {
        return i0() ? new d(this.f23213c, this.f23214d, (byte) (this.f23215q & (-2))) : this;
    }

    public d b(c cVar) {
        return ((cVar == null || cVar == c.f23191x) ? f23208c4 : f23209d4).f(this, cVar);
    }

    public d d(d dVar) {
        return (!h0() || dVar == null || !dVar.h0() || ((this.f23215q | dVar.f23215q) & 1) != 0 || this.f23214d.compareTo(dVar.f23214d) != 0) ? g(dVar, c.f23191x) : new d(m.g(this.f23213c, dVar.f23213c), this.f23214d, (byte) 0);
    }

    /* renamed from: d0 */
    public int compareTo(d dVar) {
        return m(dVar);
    }

    public final f e0() {
        return this.f23214d.B();
    }

    public boolean equals(Object obj) {
        return y(obj instanceof d ? (d) obj : null);
    }

    public final f f0() {
        return i0() ? this.f23213c.B().L0() : this.f23213c.B();
    }

    public d g(d dVar, c cVar) {
        return G(cVar).d(this, dVar, cVar);
    }

    public final f g0() {
        return this.f23213c.B();
    }

    public final boolean h0() {
        return (this.f23215q & 14) == 0;
    }

    public int hashCode() {
        return (this.f23214d.hashCode() * 964453723) + 964453631 + (this.f23213c.hashCode() * 964453939) + (this.f23215q * 964453967);
    }

    public final boolean i0() {
        return (this.f23215q & 1) != 0;
    }

    public final boolean j0() {
        return (this.f23215q & 14) == 0 && this.f23213c.J();
    }

    public final int k0() {
        if ((this.f23215q & 14) != 0 || !this.f23213c.J()) {
            return (this.f23215q & 1) != 0 ? -1 : 1;
        }
        return 0;
    }

    public int l(e eVar) {
        return j(this, eVar);
    }

    public int m(d dVar) {
        return f23208c4.e(this, dVar);
    }

    public d t(int i10) {
        return v(C(i10));
    }

    public String toString() {
        return Y(0);
    }

    public d v(d dVar) {
        return w(dVar, c.e(i.None));
    }

    public d w(d dVar, c cVar) {
        return G(cVar).c(this, dVar, cVar);
    }
}
