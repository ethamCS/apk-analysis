package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class r2 extends f.a {

    /* renamed from: g */
    protected long[] f25253g;

    public r2() {
        this.f25253g = bj.m.c();
    }

    public r2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f25253g = q2.h(bigInteger);
    }

    public r2(long[] jArr) {
        this.f25253g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] c10 = bj.m.c();
        q2.b(this.f25253g, ((r2) fVar).f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] c10 = bj.m.c();
        q2.f(this.f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            return bj.m.e(this.f25253g, ((r2) obj).f25253g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 571;
    }

    @Override // ti.f
    public ti.f g() {
        long[] c10 = bj.m.c();
        q2.n(this.f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.m.f(this.f25253g);
    }

    public int hashCode() {
        return ak.a.K(this.f25253g, 0, 9) ^ 5711052;
    }

    @Override // ti.f
    public boolean i() {
        return bj.m.g(this.f25253g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] c10 = bj.m.c();
        q2.o(this.f25253g, ((r2) fVar).f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25253g;
        long[] jArr2 = ((r2) fVar).f25253g;
        long[] jArr3 = ((r2) fVar2).f25253g;
        long[] jArr4 = ((r2) fVar3).f25253g;
        long[] d10 = bj.m.d();
        q2.p(jArr, jArr2, d10);
        q2.p(jArr3, jArr4, d10);
        long[] c10 = bj.m.c();
        q2.t(d10, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] c10 = bj.m.c();
        q2.v(this.f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] c10 = bj.m.c();
        q2.w(this.f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25253g;
        long[] jArr2 = ((r2) fVar).f25253g;
        long[] jArr3 = ((r2) fVar2).f25253g;
        long[] d10 = bj.m.d();
        q2.x(jArr, d10);
        q2.p(jArr2, jArr3, d10);
        long[] c10 = bj.m.c();
        q2.t(d10, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] c10 = bj.m.c();
        q2.y(this.f25253g, i10, c10);
        return new r2(c10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25253g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.m.h(this.f25253g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] c10 = bj.m.c();
        q2.i(this.f25253g, c10);
        return new r2(c10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return q2.z(this.f25253g);
    }
}
