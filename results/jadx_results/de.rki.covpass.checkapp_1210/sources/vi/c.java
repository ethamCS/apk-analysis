package vi;

import bj.h;
import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class c extends f.b {

    /* renamed from: h */
    public static final BigInteger f24382h = new BigInteger(1, bk.f.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    protected int[] f24383g;

    public c() {
        this.f24383g = h.i();
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f24382h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f24383g = b.d(bigInteger);
    }

    public c(int[] iArr) {
        this.f24383g = iArr;
    }

    @Override // ti.f
    public f a(f fVar) {
        int[] i10 = h.i();
        b.a(this.f24383g, ((c) fVar).f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f b() {
        int[] i10 = h.i();
        b.b(this.f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f d(f fVar) {
        int[] i10 = h.i();
        b.e(((c) fVar).f24383g, i10);
        b.g(i10, this.f24383g, i10);
        return new c(i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return h.n(this.f24383g, ((c) obj).f24383g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f24382h.bitLength();
    }

    @Override // ti.f
    public f g() {
        int[] i10 = h.i();
        b.e(this.f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public boolean h() {
        return h.t(this.f24383g);
    }

    public int hashCode() {
        return f24382h.hashCode() ^ ak.a.J(this.f24383g, 0, 8);
    }

    @Override // ti.f
    public boolean i() {
        return h.v(this.f24383g);
    }

    @Override // ti.f
    public f j(f fVar) {
        int[] i10 = h.i();
        b.g(this.f24383g, ((c) fVar).f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f m() {
        int[] i10 = h.i();
        b.i(this.f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f n() {
        int[] iArr = this.f24383g;
        if (h.v(iArr) || h.t(iArr)) {
            return this;
        }
        int[] i10 = h.i();
        b.n(iArr, i10);
        b.g(i10, iArr, i10);
        int[] i11 = h.i();
        b.o(i10, 2, i11);
        b.g(i11, i10, i11);
        int[] i12 = h.i();
        b.o(i11, 2, i12);
        b.g(i12, i10, i12);
        b.o(i12, 6, i10);
        b.g(i10, i12, i10);
        int[] i13 = h.i();
        b.o(i10, 12, i13);
        b.g(i13, i10, i13);
        b.o(i13, 6, i10);
        b.g(i10, i12, i10);
        b.n(i10, i12);
        b.g(i12, iArr, i12);
        b.o(i12, 31, i13);
        b.g(i13, i12, i10);
        b.o(i13, 32, i13);
        b.g(i13, i10, i13);
        b.o(i13, 62, i13);
        b.g(i13, i10, i13);
        b.o(i13, 4, i13);
        b.g(i13, i11, i13);
        b.o(i13, 32, i13);
        b.g(i13, iArr, i13);
        b.o(i13, 62, i13);
        b.n(i13, i11);
        if (!h.n(iArr, i11)) {
            return null;
        }
        return new c(i13);
    }

    @Override // ti.f
    public f o() {
        int[] i10 = h.i();
        b.n(this.f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public f r(f fVar) {
        int[] i10 = h.i();
        b.q(this.f24383g, ((c) fVar).f24383g, i10);
        return new c(i10);
    }

    @Override // ti.f
    public boolean s() {
        return h.q(this.f24383g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return h.J(this.f24383g);
    }
}
