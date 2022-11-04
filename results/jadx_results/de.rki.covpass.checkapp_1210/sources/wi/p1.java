package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class p1 extends f.a {

    /* renamed from: g */
    protected long[] f25237g;

    public p1() {
        this.f25237g = bj.h.j();
    }

    public p1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f25237g = o1.e(bigInteger);
    }

    public p1(long[] jArr) {
        this.f25237g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] j10 = bj.h.j();
        o1.a(this.f25237g, ((p1) fVar).f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] j10 = bj.h.j();
        o1.c(this.f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            return bj.h.o(this.f25237g, ((p1) obj).f25237g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 193;
    }

    @Override // ti.f
    public ti.f g() {
        long[] j10 = bj.h.j();
        o1.l(this.f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.h.u(this.f25237g);
    }

    public int hashCode() {
        return ak.a.K(this.f25237g, 0, 4) ^ 1930015;
    }

    @Override // ti.f
    public boolean i() {
        return bj.h.w(this.f25237g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] j10 = bj.h.j();
        o1.m(this.f25237g, ((p1) fVar).f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25237g;
        long[] jArr2 = ((p1) fVar).f25237g;
        long[] jArr3 = ((p1) fVar2).f25237g;
        long[] jArr4 = ((p1) fVar3).f25237g;
        long[] l10 = bj.h.l();
        o1.n(jArr, jArr2, l10);
        o1.n(jArr3, jArr4, l10);
        long[] j10 = bj.h.j();
        o1.o(l10, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] j10 = bj.h.j();
        o1.p(this.f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] j10 = bj.h.j();
        o1.q(this.f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25237g;
        long[] jArr2 = ((p1) fVar).f25237g;
        long[] jArr3 = ((p1) fVar2).f25237g;
        long[] l10 = bj.h.l();
        o1.r(jArr, l10);
        o1.n(jArr2, jArr3, l10);
        long[] j10 = bj.h.j();
        o1.o(l10, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] j10 = bj.h.j();
        o1.s(this.f25237g, i10, j10);
        return new p1(j10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25237g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.h.K(this.f25237g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] j10 = bj.h.j();
        o1.f(this.f25237g, j10);
        return new p1(j10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return o1.t(this.f25237g);
    }
}
