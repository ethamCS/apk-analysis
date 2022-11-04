package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class y extends f.b {

    /* renamed from: h */
    public static final BigInteger f25305h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: i */
    private static final int[] f25306i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: g */
    protected int[] f25307g;

    public y() {
        this.f25307g = bj.g.e();
    }

    public y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25305h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f25307g = x.c(bigInteger);
    }

    public y(int[] iArr) {
        this.f25307g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] e10 = bj.g.e();
        x.a(this.f25307g, ((y) fVar).f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] e10 = bj.g.e();
        x.b(this.f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] e10 = bj.g.e();
        x.d(((y) fVar).f25307g, e10);
        x.f(e10, this.f25307g, e10);
        return new y(e10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return bj.g.g(this.f25307g, ((y) obj).f25307g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25305h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] e10 = bj.g.e();
        x.d(this.f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.g.k(this.f25307g);
    }

    public int hashCode() {
        return f25305h.hashCode() ^ ak.a.J(this.f25307g, 0, 7);
    }

    @Override // ti.f
    public boolean i() {
        return bj.g.l(this.f25307g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] e10 = bj.g.e();
        x.f(this.f25307g, ((y) fVar).f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] e10 = bj.g.e();
        x.h(this.f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25307g;
        if (bj.g.l(iArr) || bj.g.k(iArr)) {
            return this;
        }
        int[] e10 = bj.g.e();
        x.m(iArr, e10);
        x.f(e10, iArr, e10);
        x.m(e10, e10);
        x.f(e10, iArr, e10);
        int[] e11 = bj.g.e();
        x.m(e10, e11);
        x.f(e11, iArr, e11);
        int[] e12 = bj.g.e();
        x.n(e11, 4, e12);
        x.f(e12, e11, e12);
        int[] e13 = bj.g.e();
        x.n(e12, 3, e13);
        x.f(e13, e10, e13);
        x.n(e13, 8, e13);
        x.f(e13, e12, e13);
        x.n(e13, 4, e12);
        x.f(e12, e11, e12);
        x.n(e12, 19, e11);
        x.f(e11, e13, e11);
        int[] e14 = bj.g.e();
        x.n(e11, 42, e14);
        x.f(e14, e11, e14);
        x.n(e14, 23, e11);
        x.f(e11, e12, e11);
        x.n(e11, 84, e12);
        x.f(e12, e14, e12);
        x.n(e12, 20, e12);
        x.f(e12, e13, e12);
        x.n(e12, 3, e12);
        x.f(e12, iArr, e12);
        x.n(e12, 2, e12);
        x.f(e12, iArr, e12);
        x.n(e12, 4, e12);
        x.f(e12, e10, e12);
        x.m(e12, e12);
        x.m(e12, e14);
        if (bj.g.g(iArr, e14)) {
            return new y(e12);
        }
        x.f(e12, f25306i, e12);
        x.m(e12, e14);
        if (!bj.g.g(iArr, e14)) {
            return null;
        }
        return new y(e12);
    }

    @Override // ti.f
    public ti.f o() {
        int[] e10 = bj.g.e();
        x.m(this.f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] e10 = bj.g.e();
        x.o(this.f25307g, ((y) fVar).f25307g, e10);
        return new y(e10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.g.i(this.f25307g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.g.u(this.f25307g);
    }
}
