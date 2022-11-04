package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class u extends f.b {

    /* renamed from: h */
    public static final BigInteger f25275h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    protected int[] f25276g;

    public u() {
        this.f25276g = bj.f.h();
    }

    public u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25275h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f25276g = t.d(bigInteger);
    }

    public u(int[] iArr) {
        this.f25276g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] h10 = bj.f.h();
        t.a(this.f25276g, ((u) fVar).f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] h10 = bj.f.h();
        t.b(this.f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] h10 = bj.f.h();
        t.e(((u) fVar).f25276g, h10);
        t.g(h10, this.f25276g, h10);
        return new u(h10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return bj.f.m(this.f25276g, ((u) obj).f25276g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25275h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] h10 = bj.f.h();
        t.e(this.f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.f.s(this.f25276g);
    }

    public int hashCode() {
        return f25275h.hashCode() ^ ak.a.J(this.f25276g, 0, 6);
    }

    @Override // ti.f
    public boolean i() {
        return bj.f.u(this.f25276g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] h10 = bj.f.h();
        t.g(this.f25276g, ((u) fVar).f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] h10 = bj.f.h();
        t.i(this.f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25276g;
        if (bj.f.u(iArr) || bj.f.s(iArr)) {
            return this;
        }
        int[] h10 = bj.f.h();
        int[] h11 = bj.f.h();
        t.n(iArr, h10);
        t.g(h10, iArr, h10);
        t.o(h10, 2, h11);
        t.g(h11, h10, h11);
        t.o(h11, 4, h10);
        t.g(h10, h11, h10);
        t.o(h10, 8, h11);
        t.g(h11, h10, h11);
        t.o(h11, 16, h10);
        t.g(h10, h11, h10);
        t.o(h10, 32, h11);
        t.g(h11, h10, h11);
        t.o(h11, 64, h10);
        t.g(h10, h11, h10);
        t.o(h10, 62, h10);
        t.n(h10, h11);
        if (!bj.f.m(iArr, h11)) {
            return null;
        }
        return new u(h10);
    }

    @Override // ti.f
    public ti.f o() {
        int[] h10 = bj.f.h();
        t.n(this.f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] h10 = bj.f.h();
        t.q(this.f25276g, ((u) fVar).f25276g, h10);
        return new u(h10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.f.p(this.f25276g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.f.H(this.f25276g);
    }
}
