package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class i extends f.b {

    /* renamed from: h */
    public static final BigInteger f25163h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: g */
    protected int[] f25164g;

    public i() {
        this.f25164g = bj.e.d();
    }

    public i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25163h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f25164g = h.c(bigInteger);
    }

    public i(int[] iArr) {
        this.f25164g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] d10 = bj.e.d();
        h.a(this.f25164g, ((i) fVar).f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] d10 = bj.e.d();
        h.b(this.f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] d10 = bj.e.d();
        h.d(((i) fVar).f25164g, d10);
        h.f(d10, this.f25164g, d10);
        return new i(d10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return bj.e.f(this.f25164g, ((i) obj).f25164g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25163h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] d10 = bj.e.d();
        h.d(this.f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.e.j(this.f25164g);
    }

    public int hashCode() {
        return f25163h.hashCode() ^ ak.a.J(this.f25164g, 0, 5);
    }

    @Override // ti.f
    public boolean i() {
        return bj.e.k(this.f25164g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] d10 = bj.e.d();
        h.f(this.f25164g, ((i) fVar).f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] d10 = bj.e.d();
        h.h(this.f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25164g;
        if (bj.e.k(iArr) || bj.e.j(iArr)) {
            return this;
        }
        int[] d10 = bj.e.d();
        h.m(iArr, d10);
        h.f(d10, iArr, d10);
        int[] d11 = bj.e.d();
        h.n(d10, 2, d11);
        h.f(d11, d10, d11);
        h.n(d11, 4, d10);
        h.f(d10, d11, d10);
        h.n(d10, 8, d11);
        h.f(d11, d10, d11);
        h.n(d11, 16, d10);
        h.f(d10, d11, d10);
        h.n(d10, 32, d11);
        h.f(d11, d10, d11);
        h.n(d11, 64, d10);
        h.f(d10, d11, d10);
        h.m(d10, d11);
        h.f(d11, iArr, d11);
        h.n(d11, 29, d11);
        h.m(d11, d10);
        if (!bj.e.f(iArr, d10)) {
            return null;
        }
        return new i(d11);
    }

    @Override // ti.f
    public ti.f o() {
        int[] d10 = bj.e.d();
        h.m(this.f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] d10 = bj.e.d();
        h.o(this.f25164g, ((i) fVar).f25164g, d10);
        return new i(d10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.e.h(this.f25164g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.e.u(this.f25164g);
    }
}
