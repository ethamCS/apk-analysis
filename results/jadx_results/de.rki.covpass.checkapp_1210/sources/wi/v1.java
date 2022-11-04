package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class v1 extends f.a {

    /* renamed from: g */
    protected long[] f25285g;

    public v1() {
        this.f25285g = bj.h.j();
    }

    public v1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f25285g = u1.e(bigInteger);
    }

    public v1(long[] jArr) {
        this.f25285g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] j10 = bj.h.j();
        u1.a(this.f25285g, ((v1) fVar).f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] j10 = bj.h.j();
        u1.c(this.f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            return bj.h.o(this.f25285g, ((v1) obj).f25285g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 233;
    }

    @Override // ti.f
    public ti.f g() {
        long[] j10 = bj.h.j();
        u1.l(this.f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.h.u(this.f25285g);
    }

    public int hashCode() {
        return ak.a.K(this.f25285g, 0, 4) ^ 2330074;
    }

    @Override // ti.f
    public boolean i() {
        return bj.h.w(this.f25285g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] j10 = bj.h.j();
        u1.m(this.f25285g, ((v1) fVar).f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25285g;
        long[] jArr2 = ((v1) fVar).f25285g;
        long[] jArr3 = ((v1) fVar2).f25285g;
        long[] jArr4 = ((v1) fVar3).f25285g;
        long[] l10 = bj.h.l();
        u1.n(jArr, jArr2, l10);
        u1.n(jArr3, jArr4, l10);
        long[] j10 = bj.h.j();
        u1.o(l10, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] j10 = bj.h.j();
        u1.p(this.f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] j10 = bj.h.j();
        u1.q(this.f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25285g;
        long[] jArr2 = ((v1) fVar).f25285g;
        long[] jArr3 = ((v1) fVar2).f25285g;
        long[] l10 = bj.h.l();
        u1.r(jArr, l10);
        u1.n(jArr2, jArr3, l10);
        long[] j10 = bj.h.j();
        u1.o(l10, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] j10 = bj.h.j();
        u1.s(this.f25285g, i10, j10);
        return new v1(j10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25285g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.h.K(this.f25285g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] j10 = bj.h.j();
        u1.f(this.f25285g, j10);
        return new v1(j10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return u1.t(this.f25285g);
    }
}
