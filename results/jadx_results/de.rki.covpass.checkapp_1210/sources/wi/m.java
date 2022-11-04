package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class m extends f.b {

    /* renamed from: h */
    public static final BigInteger f25200h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: g */
    protected int[] f25201g;

    public m() {
        this.f25201g = bj.e.d();
    }

    public m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25200h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f25201g = l.c(bigInteger);
    }

    public m(int[] iArr) {
        this.f25201g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] d10 = bj.e.d();
        l.a(this.f25201g, ((m) fVar).f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] d10 = bj.e.d();
        l.b(this.f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] d10 = bj.e.d();
        l.d(((m) fVar).f25201g, d10);
        l.f(d10, this.f25201g, d10);
        return new m(d10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return bj.e.f(this.f25201g, ((m) obj).f25201g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25200h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] d10 = bj.e.d();
        l.d(this.f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.e.j(this.f25201g);
    }

    public int hashCode() {
        return f25200h.hashCode() ^ ak.a.J(this.f25201g, 0, 5);
    }

    @Override // ti.f
    public boolean i() {
        return bj.e.k(this.f25201g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] d10 = bj.e.d();
        l.f(this.f25201g, ((m) fVar).f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] d10 = bj.e.d();
        l.h(this.f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25201g;
        if (bj.e.k(iArr) || bj.e.j(iArr)) {
            return this;
        }
        int[] d10 = bj.e.d();
        l.m(iArr, d10);
        l.f(d10, iArr, d10);
        int[] d11 = bj.e.d();
        l.m(d10, d11);
        l.f(d11, iArr, d11);
        int[] d12 = bj.e.d();
        l.m(d11, d12);
        l.f(d12, iArr, d12);
        int[] d13 = bj.e.d();
        l.n(d12, 3, d13);
        l.f(d13, d11, d13);
        l.n(d13, 7, d12);
        l.f(d12, d13, d12);
        l.n(d12, 3, d13);
        l.f(d13, d11, d13);
        int[] d14 = bj.e.d();
        l.n(d13, 14, d14);
        l.f(d14, d12, d14);
        l.n(d14, 31, d12);
        l.f(d12, d14, d12);
        l.n(d12, 62, d14);
        l.f(d14, d12, d14);
        l.n(d14, 3, d12);
        l.f(d12, d11, d12);
        l.n(d12, 18, d12);
        l.f(d12, d13, d12);
        l.n(d12, 2, d12);
        l.f(d12, iArr, d12);
        l.n(d12, 3, d12);
        l.f(d12, d10, d12);
        l.n(d12, 6, d12);
        l.f(d12, d11, d12);
        l.n(d12, 2, d12);
        l.f(d12, iArr, d12);
        l.m(d12, d10);
        if (!bj.e.f(iArr, d10)) {
            return null;
        }
        return new m(d12);
    }

    @Override // ti.f
    public ti.f o() {
        int[] d10 = bj.e.d();
        l.m(this.f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] d10 = bj.e.d();
        l.o(this.f25201g, ((m) fVar).f25201g, d10);
        return new m(d10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.e.h(this.f25201g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.e.u(this.f25201g);
    }
}
