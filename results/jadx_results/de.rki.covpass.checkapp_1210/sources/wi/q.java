package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class q extends f.b {

    /* renamed from: h */
    public static final BigInteger f25238h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: g */
    protected int[] f25239g;

    public q() {
        this.f25239g = bj.f.h();
    }

    public q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25238h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f25239g = p.c(bigInteger);
    }

    public q(int[] iArr) {
        this.f25239g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] h10 = bj.f.h();
        p.a(this.f25239g, ((q) fVar).f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] h10 = bj.f.h();
        p.b(this.f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] h10 = bj.f.h();
        p.d(((q) fVar).f25239g, h10);
        p.f(h10, this.f25239g, h10);
        return new q(h10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return bj.f.m(this.f25239g, ((q) obj).f25239g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25238h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] h10 = bj.f.h();
        p.d(this.f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.f.s(this.f25239g);
    }

    public int hashCode() {
        return f25238h.hashCode() ^ ak.a.J(this.f25239g, 0, 6);
    }

    @Override // ti.f
    public boolean i() {
        return bj.f.u(this.f25239g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] h10 = bj.f.h();
        p.f(this.f25239g, ((q) fVar).f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] h10 = bj.f.h();
        p.h(this.f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25239g;
        if (bj.f.u(iArr) || bj.f.s(iArr)) {
            return this;
        }
        int[] h10 = bj.f.h();
        p.m(iArr, h10);
        p.f(h10, iArr, h10);
        int[] h11 = bj.f.h();
        p.m(h10, h11);
        p.f(h11, iArr, h11);
        int[] h12 = bj.f.h();
        p.n(h11, 3, h12);
        p.f(h12, h11, h12);
        p.n(h12, 2, h12);
        p.f(h12, h10, h12);
        p.n(h12, 8, h10);
        p.f(h10, h12, h10);
        p.n(h10, 3, h12);
        p.f(h12, h11, h12);
        int[] h13 = bj.f.h();
        p.n(h12, 16, h13);
        p.f(h13, h10, h13);
        p.n(h13, 35, h10);
        p.f(h10, h13, h10);
        p.n(h10, 70, h13);
        p.f(h13, h10, h13);
        p.n(h13, 19, h10);
        p.f(h10, h12, h10);
        p.n(h10, 20, h10);
        p.f(h10, h12, h10);
        p.n(h10, 4, h10);
        p.f(h10, h11, h10);
        p.n(h10, 6, h10);
        p.f(h10, h11, h10);
        p.m(h10, h10);
        p.m(h10, h11);
        if (!bj.f.m(iArr, h11)) {
            return null;
        }
        return new q(h10);
    }

    @Override // ti.f
    public ti.f o() {
        int[] h10 = bj.f.h();
        p.m(this.f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] h10 = bj.f.h();
        p.o(this.f25239g, ((q) fVar).f25239g, h10);
        return new q(h10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.f.p(this.f25239g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.f.H(this.f25239g);
    }
}
