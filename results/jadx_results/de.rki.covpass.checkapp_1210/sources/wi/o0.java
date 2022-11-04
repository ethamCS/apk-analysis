package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class o0 extends f.b {

    /* renamed from: h */
    public static final BigInteger f25227h = new BigInteger(1, bk.f.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: g */
    protected int[] f25228g;

    public o0() {
        this.f25228g = bj.n.k(12);
    }

    public o0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25227h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f25228g = n0.e(bigInteger);
    }

    public o0(int[] iArr) {
        this.f25228g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] k10 = bj.n.k(12);
        n0.a(this.f25228g, ((o0) fVar).f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] k10 = bj.n.k(12);
        n0.c(this.f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] k10 = bj.n.k(12);
        n0.f(((o0) fVar).f25228g, k10);
        n0.h(k10, this.f25228g, k10);
        return new o0(k10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            return bj.n.o(12, this.f25228g, ((o0) obj).f25228g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25227h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] k10 = bj.n.k(12);
        n0.f(this.f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.n.z(12, this.f25228g);
    }

    public int hashCode() {
        return f25227h.hashCode() ^ ak.a.J(this.f25228g, 0, 12);
    }

    @Override // ti.f
    public boolean i() {
        return bj.n.A(12, this.f25228g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] k10 = bj.n.k(12);
        n0.h(this.f25228g, ((o0) fVar).f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] k10 = bj.n.k(12);
        n0.i(this.f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25228g;
        if (bj.n.A(12, iArr) || bj.n.z(12, iArr)) {
            return this;
        }
        int[] k10 = bj.n.k(12);
        int[] k11 = bj.n.k(12);
        int[] k12 = bj.n.k(12);
        int[] k13 = bj.n.k(12);
        n0.n(iArr, k10);
        n0.h(k10, iArr, k10);
        n0.o(k10, 2, k11);
        n0.h(k11, k10, k11);
        n0.n(k11, k11);
        n0.h(k11, iArr, k11);
        n0.o(k11, 5, k12);
        n0.h(k12, k11, k12);
        n0.o(k12, 5, k13);
        n0.h(k13, k11, k13);
        n0.o(k13, 15, k11);
        n0.h(k11, k13, k11);
        n0.o(k11, 2, k12);
        n0.h(k10, k12, k10);
        n0.o(k12, 28, k12);
        n0.h(k11, k12, k11);
        n0.o(k11, 60, k12);
        n0.h(k12, k11, k12);
        n0.o(k12, 120, k11);
        n0.h(k11, k12, k11);
        n0.o(k11, 15, k11);
        n0.h(k11, k13, k11);
        n0.o(k11, 33, k11);
        n0.h(k11, k10, k11);
        n0.o(k11, 64, k11);
        n0.h(k11, iArr, k11);
        n0.o(k11, 30, k10);
        n0.n(k10, k11);
        if (!bj.n.o(12, iArr, k11)) {
            return null;
        }
        return new o0(k10);
    }

    @Override // ti.f
    public ti.f o() {
        int[] k10 = bj.n.k(12);
        n0.n(this.f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] k10 = bj.n.k(12);
        n0.q(this.f25228g, ((o0) fVar).f25228g, k10);
        return new o0(k10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.n.t(this.f25228g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.n.V(12, this.f25228g);
    }
}
