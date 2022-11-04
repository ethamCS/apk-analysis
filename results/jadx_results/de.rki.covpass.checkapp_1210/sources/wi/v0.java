package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class v0 extends f.a {

    /* renamed from: g */
    protected long[] f25284g;

    public v0() {
        this.f25284g = bj.d.g();
    }

    public v0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f25284g = u0.e(bigInteger);
    }

    public v0(long[] jArr) {
        this.f25284g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] g10 = bj.d.g();
        u0.a(this.f25284g, ((v0) fVar).f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] g10 = bj.d.g();
        u0.c(this.f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            return bj.d.k(this.f25284g, ((v0) obj).f25284g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 113;
    }

    @Override // ti.f
    public ti.f g() {
        long[] g10 = bj.d.g();
        u0.j(this.f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.d.p(this.f25284g);
    }

    public int hashCode() {
        return ak.a.K(this.f25284g, 0, 2) ^ 113009;
    }

    @Override // ti.f
    public boolean i() {
        return bj.d.r(this.f25284g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] g10 = bj.d.g();
        u0.k(this.f25284g, ((v0) fVar).f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25284g;
        long[] jArr2 = ((v0) fVar).f25284g;
        long[] jArr3 = ((v0) fVar2).f25284g;
        long[] jArr4 = ((v0) fVar3).f25284g;
        long[] i10 = bj.d.i();
        u0.l(jArr, jArr2, i10);
        u0.l(jArr3, jArr4, i10);
        long[] g10 = bj.d.g();
        u0.m(i10, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] g10 = bj.d.g();
        u0.n(this.f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] g10 = bj.d.g();
        u0.o(this.f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25284g;
        long[] jArr2 = ((v0) fVar).f25284g;
        long[] jArr3 = ((v0) fVar2).f25284g;
        long[] i10 = bj.d.i();
        u0.p(jArr, i10);
        u0.l(jArr2, jArr3, i10);
        long[] g10 = bj.d.g();
        u0.m(i10, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] g10 = bj.d.g();
        u0.q(this.f25284g, i10, g10);
        return new v0(g10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25284g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.d.y(this.f25284g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] g10 = bj.d.g();
        u0.f(this.f25284g, g10);
        return new v0(g10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return u0.r(this.f25284g);
    }
}
