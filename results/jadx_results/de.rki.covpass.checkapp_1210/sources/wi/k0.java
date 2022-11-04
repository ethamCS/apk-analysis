package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class k0 extends f.b {

    /* renamed from: h */
    public static final BigInteger f25189h = new BigInteger(1, bk.f.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    protected int[] f25190g;

    public k0() {
        this.f25190g = bj.h.i();
    }

    public k0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25189h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f25190g = j0.d(bigInteger);
    }

    public k0(int[] iArr) {
        this.f25190g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] i10 = bj.h.i();
        j0.a(this.f25190g, ((k0) fVar).f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] i10 = bj.h.i();
        j0.b(this.f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] i10 = bj.h.i();
        j0.e(((k0) fVar).f25190g, i10);
        j0.g(i10, this.f25190g, i10);
        return new k0(i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            return bj.h.n(this.f25190g, ((k0) obj).f25190g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25189h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] i10 = bj.h.i();
        j0.e(this.f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.h.t(this.f25190g);
    }

    public int hashCode() {
        return f25189h.hashCode() ^ ak.a.J(this.f25190g, 0, 8);
    }

    @Override // ti.f
    public boolean i() {
        return bj.h.v(this.f25190g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] i10 = bj.h.i();
        j0.g(this.f25190g, ((k0) fVar).f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] i10 = bj.h.i();
        j0.i(this.f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25190g;
        if (bj.h.v(iArr) || bj.h.t(iArr)) {
            return this;
        }
        int[] i10 = bj.h.i();
        int[] i11 = bj.h.i();
        j0.n(iArr, i10);
        j0.g(i10, iArr, i10);
        j0.o(i10, 2, i11);
        j0.g(i11, i10, i11);
        j0.o(i11, 4, i10);
        j0.g(i10, i11, i10);
        j0.o(i10, 8, i11);
        j0.g(i11, i10, i11);
        j0.o(i11, 16, i10);
        j0.g(i10, i11, i10);
        j0.o(i10, 32, i10);
        j0.g(i10, iArr, i10);
        j0.o(i10, 96, i10);
        j0.g(i10, iArr, i10);
        j0.o(i10, 94, i10);
        j0.n(i10, i11);
        if (!bj.h.n(iArr, i11)) {
            return null;
        }
        return new k0(i10);
    }

    @Override // ti.f
    public ti.f o() {
        int[] i10 = bj.h.i();
        j0.n(this.f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] i10 = bj.h.i();
        j0.q(this.f25190g, ((k0) fVar).f25190g, i10);
        return new k0(i10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.h.q(this.f25190g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.h.J(this.f25190g);
    }
}
