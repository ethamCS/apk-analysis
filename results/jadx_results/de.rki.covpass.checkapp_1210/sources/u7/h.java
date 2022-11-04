package u7;

import java.util.Objects;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public final class h implements Comparable<h> {
    public static final h U3;
    public static final h W3;
    public static final h X3;

    /* renamed from: x */
    public static final h f23228x;

    /* renamed from: y */
    public static final h f23229y;

    /* renamed from: c */
    private final m f23230c;

    /* renamed from: d */
    private final byte f23231d;

    /* renamed from: q */
    private final m f23232q;
    public static final h V3 = o(f.Y(1));
    public static final h Y3 = o(f.Y(10));
    public static final h Z3 = o(f.Y(0));

    static {
        m mVar = m.f23252x;
        m mVar2 = m.f23253y;
        f23228x = new h(mVar, mVar2, (byte) 4);
        f23229y = new h(mVar, mVar2, (byte) 3);
        U3 = new h(mVar, mVar2, (byte) 1);
        W3 = new h(mVar, mVar2, (byte) 2);
        X3 = new h(mVar, mVar2, (byte) 8);
    }

    private h(m mVar, m mVar2, byte b10) {
        this.f23232q = mVar;
        this.f23230c = mVar2;
        this.f23231d = b10;
    }

    public static h g(f fVar, f fVar2) {
        Objects.requireNonNull(fVar, "numerator");
        Objects.requireNonNull(fVar2, "denominator");
        if (!fVar2.H1()) {
            int i10 = 1;
            boolean z10 = fVar.I1() < 0;
            boolean z11 = fVar2.I1() < 0;
            if (z10 == z11) {
                i10 = 0;
            }
            byte b10 = (byte) i10;
            if (z10) {
                fVar = fVar.L0();
            }
            if (z11) {
                fVar2 = fVar2.L0();
            }
            return new h(m.p(fVar), m.p(fVar2), b10);
        }
        throw new IllegalArgumentException("denominator is zero");
    }

    public static h h(f fVar, boolean z10, boolean z11) {
        Objects.requireNonNull(fVar, "diag");
        if (fVar.I1() >= 0) {
            if (!fVar.H1() || z11) {
                return new h(m.p(fVar), m.f23253y, (byte) ((z10 ? 8 : 4) | (z11 ? 1 : 0)));
            }
            return z10 ? X3 : f23228x;
        }
        throw new IllegalArgumentException("Diagnostic information must be 0 or greater,  was: " + fVar);
    }

    public static h j(long j10) {
        return m(e.r(j10));
    }

    public static h l(d dVar) {
        Objects.requireNonNull(dVar, "ef");
        if (!dVar.h0()) {
            return dVar.I() ? dVar.i0() ? f23229y : W3 : h(dVar.g0(), dVar.N(), dVar.i0());
        }
        f f02 = dVar.f0();
        f e02 = dVar.e0();
        if (e02.H1()) {
            return f02.I1() != 0 ? o(f02) : dVar.i0() ? U3 : Z3;
        }
        boolean z10 = f02.I1() < 0;
        f a10 = f02.a();
        f Y = f.Y(1);
        if (e02.I1() < 0) {
            Y = q.p(e02.L0());
        } else {
            a10 = a10.K0(q.p(e02));
        }
        if (z10) {
            a10 = a10.L0();
        }
        h g10 = g(a10, Y);
        return (!dVar.i0() || a10.I1() != 0) ? g10 : g10.x();
    }

    public static h m(e eVar) {
        Objects.requireNonNull(eVar, "ef");
        if (!eVar.R()) {
            return eVar.x() ? eVar.S() ? f23229y : W3 : h(eVar.Q(), eVar.C(), eVar.S());
        }
        f P = eVar.P();
        f O = eVar.O();
        if (O.H1()) {
            return P.I1() != 0 ? o(P) : eVar.S() ? U3 : Z3;
        }
        boolean z10 = P.I1() < 0;
        f a10 = P.a();
        f Y = f.Y(1);
        if (O.I1() < 0) {
            Y = Y.b1(O.L0());
        } else {
            a10 = a10.b1(O);
        }
        if (z10) {
            a10 = a10.L0();
        }
        h g10 = g(a10, Y);
        return (!eVar.S() || a10.I1() != 0) ? g10 : g10.x();
    }

    public static h o(f fVar) {
        return g(fVar, f.Y(1));
    }

    public static h p(long j10) {
        return o(f.Z(j10));
    }

    public e A(c cVar) {
        if (r()) {
            return e.j(G(), w(), I(), cVar);
        }
        if (t()) {
            return e.W3.E(cVar);
        }
        if (s()) {
            return e.f23219y.E(cVar);
        }
        return ((!I() || !J()) ? e.s(F()) : e.U3).m(e.s(E()), cVar);
    }

    public e B(c cVar) {
        if (cVar == null) {
            return A(null);
        }
        if (r()) {
            return e.j(G(), w(), I(), cVar);
        }
        if (t()) {
            return e.W3.E(cVar);
        }
        if (s()) {
            return e.f23219y.E(cVar);
        }
        if (J()) {
            return I() ? e.U3 : e.Z3;
        }
        e s10 = (!I() || !J()) ? e.s(F()) : e.U3;
        e s11 = e.s(E());
        e m10 = s10.m(s11, null);
        return m10.y() ? s10.m(s11, cVar) : m10;
    }

    public f C() {
        if (H()) {
            return F().M(E());
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    /* renamed from: D */
    public int compareTo(h hVar) {
        return d(hVar);
    }

    public final f E() {
        return this.f23230c.B();
    }

    public final f F() {
        return (I() ? this.f23232q.w() : this.f23232q).B();
    }

    public final f G() {
        return this.f23232q.B();
    }

    public final boolean H() {
        return !r() && !q();
    }

    public final boolean I() {
        return (this.f23231d & 1) != 0;
    }

    public final boolean J() {
        return (this.f23231d & 14) == 0 && this.f23232q.J();
    }

    public final int K() {
        if ((this.f23231d & 14) != 0) {
            if (I()) {
                return -1;
            }
        } else if (this.f23232q.J()) {
            return 0;
        } else {
            if (I()) {
                return -1;
            }
        }
        return 1;
    }

    public int a(e eVar) {
        if (eVar == null) {
            return 1;
        }
        if (r()) {
            return !eVar.y();
        }
        int K = K();
        int U = eVar.U();
        if (K != U) {
            return K < U ? -1 : 1;
        } else if (U == 0 || K == 0) {
            return 0;
        } else {
            if (q()) {
                if (eVar.x()) {
                    return 0;
                }
                return I() ? -1 : 1;
            } else if (eVar.x()) {
                return eVar.S() ? 1 : -1;
            } else {
                f O = eVar.O();
                if (O.H1()) {
                    return F().compareTo(E().K0(eVar.P()));
                }
                if (O.a().compareTo(f.Z(1000L)) > 0) {
                    f[] K2 = G().K(E());
                    f fVar = K2[0];
                    f fVar2 = K2[1];
                    e a10 = eVar.a();
                    e s10 = e.s(fVar);
                    if (fVar2.H1()) {
                        int compareTo = s10.compareTo(a10);
                        return I() ? -compareTo : compareTo;
                    } else if (s10.compareTo(a10) > 0) {
                        return I() ? -1 : 1;
                    } else if (e.s(fVar.d(f.Y(1))).compareTo(a10) < 0) {
                        return I() ? 1 : -1;
                    } else if (e.s(G()).m(e.s(E()), c.d(PSKKeyManager.MAX_KEY_LENGTH_BYTES, i.Down)).compareTo(a10) > 0) {
                        return I() ? -1 : 1;
                    } else if (eVar.O().I1() > 0 && G().l0().l1(1).compareTo(eVar.O()) < 0) {
                        return I() ? 1 : -1;
                    }
                }
                return d(m(eVar));
            }
        }
    }

    public int b(d dVar) {
        if (dVar == null) {
            return 1;
        }
        if (r()) {
            return !dVar.J();
        }
        int K = K();
        int k02 = dVar.k0();
        if (K != k02) {
            return K < k02 ? -1 : 1;
        } else if (k02 == 0 || K == 0) {
            return 0;
        } else {
            if (q()) {
                if (dVar.I()) {
                    return 0;
                }
                return I() ? -1 : 1;
            } else if (dVar.I()) {
                return dVar.i0() ? 1 : -1;
            } else if (dVar.e0().H1()) {
                return F().compareTo(E().K0(dVar.f0()));
            } else {
                if (dVar.e0().a().compareTo(f.Z(50L)) > 0) {
                    f[] K2 = G().K(E());
                    f fVar = K2[0];
                    f fVar2 = K2[1];
                    d a10 = dVar.a();
                    d B = d.B(fVar);
                    if (fVar2.H1()) {
                        int compareTo = B.compareTo(a10);
                        return I() ? -compareTo : compareTo;
                    } else if (B.compareTo(a10) > 0) {
                        return I() ? -1 : 1;
                    } else if (d.B(fVar.d(f.Y(1))).compareTo(a10) < 0) {
                        return I() ? 1 : -1;
                    } else if (d.B(G()).w(d.B(E()), c.d(20, i.Down)).compareTo(a10) > 0) {
                        return I() ? -1 : 1;
                    } else if (dVar.e0().I1() > 0 && G().g0().l1(1).compareTo(dVar.e0()) < 0) {
                        return I() ? 1 : -1;
                    }
                }
                return d(l(dVar));
            }
        }
    }

    public int d(h hVar) {
        if (hVar == null) {
            return 1;
        }
        if (this == hVar) {
            return 0;
        }
        if (r()) {
            return !hVar.r();
        }
        if (hVar.r()) {
            return -1;
        }
        int K = K();
        int K2 = hVar.K();
        if (K != K2) {
            return K < K2 ? -1 : 1;
        } else if (K2 == 0 || K == 0) {
            return 0;
        } else {
            if (q()) {
                if (hVar.q()) {
                    return 0;
                }
                return I() ? -1 : 1;
            } else if (hVar.q()) {
                return hVar.I() ? 1 : -1;
            } else {
                int compareTo = this.f23230c.compareTo(hVar.f23230c);
                int compareTo2 = this.f23232q.compareTo(hVar.f23232q);
                if (K < 0) {
                    compareTo2 = -compareTo2;
                }
                if (compareTo2 == 0) {
                    return K < 0 ? compareTo : -compareTo;
                } else if (compareTo == 0) {
                    return compareTo2;
                } else {
                    f F = F();
                    f E = E();
                    f F2 = hVar.F();
                    f E2 = hVar.E();
                    int compareTo3 = F.a().compareTo(E);
                    int compareTo4 = F2.a().compareTo(E2);
                    if (compareTo3 == 0 && compareTo4 == 0) {
                        return 0;
                    }
                    if (compareTo3 == 0) {
                        return K < 0 ? compareTo4 : -compareTo4;
                    } else if (compareTo4 == 0) {
                        return K < 0 ? -compareTo3 : compareTo3;
                    } else if (compareTo3 < 0 && compareTo4 > 0) {
                        return K < 0 ? 1 : -1;
                    } else if (compareTo3 > 0 && compareTo4 < 0) {
                        return K < 0 ? -1 : 1;
                    } else {
                        f d10 = F.o0().d(E2.o0());
                        f d11 = E.o0().d(F2.o0());
                        return d10.l1(1).compareTo(d11) > 0 ? K < 0 ? -1 : 1 : d11.l1(1).compareTo(d10) > 0 ? K < 0 ? 1 : -1 : F.K0(E2).compareTo(E.K0(F2));
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        m mVar;
        m mVar2;
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && ((mVar = this.f23232q) != null ? mVar.equals(hVar.f23232q) : hVar.f23232q == null) && ((mVar2 = this.f23230c) != null ? mVar2.equals(hVar.f23230c) : hVar.f23230c == null) && this.f23231d == hVar.f23231d;
    }

    public int hashCode() {
        m mVar = this.f23232q;
        int i10 = 1857066527;
        if (mVar != null) {
            i10 = 1857066527 + (mVar.hashCode() * 1857066539);
        }
        m mVar2 = this.f23230c;
        if (mVar2 != null) {
            i10 += mVar2.hashCode() * 1857066551;
        }
        return i10 + (this.f23231d * 1857066623);
    }

    public boolean q() {
        return (this.f23231d & 2) != 0;
    }

    public boolean r() {
        return (this.f23231d & 12) != 0;
    }

    public boolean s() {
        return (this.f23231d & 3) == 3;
    }

    public boolean t() {
        return (this.f23231d & 3) == 2;
    }

    public String toString() {
        String str;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        if (!H()) {
            if (w()) {
                if (this.f23232q.J()) {
                    return I() ? "-sNaN" : "sNaN";
                }
                if (I()) {
                    sb4 = new StringBuilder();
                    sb4.append("-sNaN");
                } else {
                    sb4 = new StringBuilder();
                    sb4.append("sNaN");
                }
                sb4.append(this.f23232q);
                return sb4.toString();
            } else if (v()) {
                if (this.f23232q.J()) {
                    return I() ? "-NaN" : "NaN";
                }
                if (I()) {
                    sb3 = new StringBuilder();
                    sb3.append("-NaN");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append("NaN");
                }
                sb3.append(this.f23232q);
                return sb3.toString();
            } else if (q()) {
                return I() ? "-Infinity" : "Infinity";
            }
        }
        if (!this.f23232q.J() || !I()) {
            sb2 = new StringBuilder();
            sb2.append(F());
            str = "/";
        } else {
            sb2 = new StringBuilder();
            str = "-0/";
        }
        sb2.append(str);
        sb2.append(E());
        return sb2.toString();
    }

    public boolean v() {
        return (this.f23231d & 4) != 0;
    }

    public boolean w() {
        return (this.f23231d & 8) != 0;
    }

    public h x() {
        return new h(this.f23232q, this.f23230c, (byte) (this.f23231d ^ 1));
    }

    public d y(c cVar) {
        if (r()) {
            return d.q(G(), w(), I(), cVar);
        }
        if (t()) {
            return d.W3.Q(cVar);
        }
        if (s()) {
            return d.f23212y.Q(cVar);
        }
        return ((!I() || !J()) ? d.B(F()) : d.U3).w(d.B(E()), cVar);
    }

    public d z(c cVar) {
        if (cVar == null) {
            return y(null);
        }
        if (r()) {
            return d.q(G(), w(), I(), cVar);
        }
        if (t()) {
            return d.W3.Q(cVar);
        }
        if (s()) {
            return d.f23212y.Q(cVar);
        }
        if (I() && J()) {
            return d.U3;
        }
        f F = F();
        f E = E();
        d B = (!I() || !J()) ? d.B(F) : d.U3;
        d B2 = d.B(E);
        d w9 = B.w(B2, null);
        return w9.J() ? B.w(B2, cVar) : w9;
    }
}
