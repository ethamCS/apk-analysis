package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class s0 extends f.b {

    /* renamed from: h */
    public static final BigInteger f25260h = new BigInteger(1, bk.f.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    protected int[] f25261g;

    public s0() {
        this.f25261g = bj.n.k(17);
    }

    public s0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25260h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f25261g = r0.c(bigInteger);
    }

    public s0(int[] iArr) {
        this.f25261g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] k10 = bj.n.k(17);
        r0.a(this.f25261g, ((s0) fVar).f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] k10 = bj.n.k(17);
        r0.b(this.f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] k10 = bj.n.k(17);
        r0.f(((s0) fVar).f25261g, k10);
        r0.h(k10, this.f25261g, k10);
        return new s0(k10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return bj.n.o(17, this.f25261g, ((s0) obj).f25261g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25260h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] k10 = bj.n.k(17);
        r0.f(this.f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.n.z(17, this.f25261g);
    }

    public int hashCode() {
        return f25260h.hashCode() ^ ak.a.J(this.f25261g, 0, 17);
    }

    @Override // ti.f
    public boolean i() {
        return bj.n.A(17, this.f25261g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] k10 = bj.n.k(17);
        r0.h(this.f25261g, ((s0) fVar).f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] k10 = bj.n.k(17);
        r0.i(this.f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25261g;
        if (bj.n.A(17, iArr) || bj.n.z(17, iArr)) {
            return this;
        }
        int[] k10 = bj.n.k(17);
        int[] k11 = bj.n.k(17);
        r0.o(iArr, 519, k10);
        r0.n(k10, k11);
        if (!bj.n.o(17, iArr, k11)) {
            return null;
        }
        return new s0(k10);
    }

    @Override // ti.f
    public ti.f o() {
        int[] k10 = bj.n.k(17);
        r0.n(this.f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] k10 = bj.n.k(17);
        r0.p(this.f25261g, ((s0) fVar).f25261g, k10);
        return new s0(k10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.n.t(this.f25261g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.n.V(17, this.f25261g);
    }
}
