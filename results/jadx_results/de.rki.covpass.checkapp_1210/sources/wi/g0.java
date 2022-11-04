package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class g0 extends f.b {

    /* renamed from: h */
    public static final BigInteger f25151h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: g */
    protected int[] f25152g;

    public g0() {
        this.f25152g = bj.h.i();
    }

    public g0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25151h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f25152g = f0.c(bigInteger);
    }

    public g0(int[] iArr) {
        this.f25152g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] i10 = bj.h.i();
        f0.a(this.f25152g, ((g0) fVar).f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] i10 = bj.h.i();
        f0.b(this.f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] i10 = bj.h.i();
        f0.d(((g0) fVar).f25152g, i10);
        f0.f(i10, this.f25152g, i10);
        return new g0(i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return bj.h.n(this.f25152g, ((g0) obj).f25152g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25151h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] i10 = bj.h.i();
        f0.d(this.f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.h.t(this.f25152g);
    }

    public int hashCode() {
        return f25151h.hashCode() ^ ak.a.J(this.f25152g, 0, 8);
    }

    @Override // ti.f
    public boolean i() {
        return bj.h.v(this.f25152g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] i10 = bj.h.i();
        f0.f(this.f25152g, ((g0) fVar).f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] i10 = bj.h.i();
        f0.h(this.f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25152g;
        if (bj.h.v(iArr) || bj.h.t(iArr)) {
            return this;
        }
        int[] i10 = bj.h.i();
        f0.m(iArr, i10);
        f0.f(i10, iArr, i10);
        int[] i11 = bj.h.i();
        f0.m(i10, i11);
        f0.f(i11, iArr, i11);
        int[] i12 = bj.h.i();
        f0.n(i11, 3, i12);
        f0.f(i12, i11, i12);
        f0.n(i12, 3, i12);
        f0.f(i12, i11, i12);
        f0.n(i12, 2, i12);
        f0.f(i12, i10, i12);
        int[] i13 = bj.h.i();
        f0.n(i12, 11, i13);
        f0.f(i13, i12, i13);
        f0.n(i13, 22, i12);
        f0.f(i12, i13, i12);
        int[] i14 = bj.h.i();
        f0.n(i12, 44, i14);
        f0.f(i14, i12, i14);
        int[] i15 = bj.h.i();
        f0.n(i14, 88, i15);
        f0.f(i15, i14, i15);
        f0.n(i15, 44, i14);
        f0.f(i14, i12, i14);
        f0.n(i14, 3, i12);
        f0.f(i12, i11, i12);
        f0.n(i12, 23, i12);
        f0.f(i12, i13, i12);
        f0.n(i12, 6, i12);
        f0.f(i12, i10, i12);
        f0.n(i12, 2, i12);
        f0.m(i12, i10);
        if (!bj.h.n(iArr, i10)) {
            return null;
        }
        return new g0(i12);
    }

    @Override // ti.f
    public ti.f o() {
        int[] i10 = bj.h.i();
        f0.m(this.f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] i10 = bj.h.i();
        f0.o(this.f25152g, ((g0) fVar).f25152g, i10);
        return new g0(i10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.h.q(this.f25152g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.h.J(this.f25152g);
    }
}
