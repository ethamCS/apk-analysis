package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class c extends f.b {

    /* renamed from: h */
    public static final BigInteger f25109h = new BigInteger(1, bk.f.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    protected int[] f25110g;

    public c() {
        this.f25110g = bj.d.f();
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25109h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f25110g = b.d(bigInteger);
    }

    public c(int[] iArr) {
        this.f25110g = iArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        int[] f10 = bj.d.f();
        b.a(this.f25110g, ((c) fVar).f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public ti.f b() {
        int[] f10 = bj.d.f();
        b.b(this.f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        int[] f10 = bj.d.f();
        b.e(((c) fVar).f25110g, f10);
        b.g(f10, this.f25110g, f10);
        return new c(f10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return bj.d.j(this.f25110g, ((c) obj).f25110g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return f25109h.bitLength();
    }

    @Override // ti.f
    public ti.f g() {
        int[] f10 = bj.d.f();
        b.e(this.f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.d.o(this.f25110g);
    }

    public int hashCode() {
        return f25109h.hashCode() ^ ak.a.J(this.f25110g, 0, 4);
    }

    @Override // ti.f
    public boolean i() {
        return bj.d.q(this.f25110g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        int[] f10 = bj.d.f();
        b.g(this.f25110g, ((c) fVar).f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public ti.f m() {
        int[] f10 = bj.d.f();
        b.i(this.f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public ti.f n() {
        int[] iArr = this.f25110g;
        if (bj.d.q(iArr) || bj.d.o(iArr)) {
            return this;
        }
        int[] f10 = bj.d.f();
        b.n(iArr, f10);
        b.g(f10, iArr, f10);
        int[] f11 = bj.d.f();
        b.o(f10, 2, f11);
        b.g(f11, f10, f11);
        int[] f12 = bj.d.f();
        b.o(f11, 4, f12);
        b.g(f12, f11, f12);
        b.o(f12, 2, f11);
        b.g(f11, f10, f11);
        b.o(f11, 10, f10);
        b.g(f10, f11, f10);
        b.o(f10, 10, f12);
        b.g(f12, f11, f12);
        b.n(f12, f11);
        b.g(f11, iArr, f11);
        b.o(f11, 95, f11);
        b.n(f11, f12);
        if (!bj.d.j(iArr, f12)) {
            return null;
        }
        return new c(f11);
    }

    @Override // ti.f
    public ti.f o() {
        int[] f10 = bj.d.f();
        b.n(this.f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        int[] f10 = bj.d.f();
        b.q(this.f25110g, ((c) fVar).f25110g, f10);
        return new c(f10);
    }

    @Override // ti.f
    public boolean s() {
        return bj.d.m(this.f25110g, 0) == 1;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.d.x(this.f25110g);
    }
}
