package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class h1 extends f.a {

    /* renamed from: g */
    protected long[] f25162g;

    public h1() {
        this.f25162g = bj.f.i();
    }

    public h1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f25162g = g1.e(bigInteger);
    }

    public h1(long[] jArr) {
        this.f25162g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] i10 = bj.f.i();
        g1.a(this.f25162g, ((h1) fVar).f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] i10 = bj.f.i();
        g1.c(this.f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            return bj.f.n(this.f25162g, ((h1) obj).f25162g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 163;
    }

    @Override // ti.f
    public ti.f g() {
        long[] i10 = bj.f.i();
        g1.k(this.f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.f.t(this.f25162g);
    }

    public int hashCode() {
        return ak.a.K(this.f25162g, 0, 3) ^ 163763;
    }

    @Override // ti.f
    public boolean i() {
        return bj.f.v(this.f25162g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] i10 = bj.f.i();
        g1.l(this.f25162g, ((h1) fVar).f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25162g;
        long[] jArr2 = ((h1) fVar).f25162g;
        long[] jArr3 = ((h1) fVar2).f25162g;
        long[] jArr4 = ((h1) fVar3).f25162g;
        long[] k10 = bj.f.k();
        g1.m(jArr, jArr2, k10);
        g1.m(jArr3, jArr4, k10);
        long[] i10 = bj.f.i();
        g1.n(k10, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] i10 = bj.f.i();
        g1.o(this.f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] i10 = bj.f.i();
        g1.p(this.f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25162g;
        long[] jArr2 = ((h1) fVar).f25162g;
        long[] jArr3 = ((h1) fVar2).f25162g;
        long[] k10 = bj.f.k();
        g1.q(jArr, k10);
        g1.m(jArr2, jArr3, k10);
        long[] i10 = bj.f.i();
        g1.n(k10, i10);
        return new h1(i10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] i11 = bj.f.i();
        g1.r(this.f25162g, i10, i11);
        return new h1(i11);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25162g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.f.I(this.f25162g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] i10 = bj.f.i();
        g1.f(this.f25162g, i10);
        return new h1(i10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return g1.s(this.f25162g);
    }
}
