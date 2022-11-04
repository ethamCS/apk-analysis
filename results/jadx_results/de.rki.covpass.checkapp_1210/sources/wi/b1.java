package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class b1 extends f.a {

    /* renamed from: g */
    protected long[] f25107g;

    public b1() {
        this.f25107g = bj.f.i();
    }

    public b1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f25107g = a1.e(bigInteger);
    }

    public b1(long[] jArr) {
        this.f25107g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] i10 = bj.f.i();
        a1.a(this.f25107g, ((b1) fVar).f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] i10 = bj.f.i();
        a1.c(this.f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            return bj.f.n(this.f25107g, ((b1) obj).f25107g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 131;
    }

    @Override // ti.f
    public ti.f g() {
        long[] i10 = bj.f.i();
        a1.k(this.f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.f.t(this.f25107g);
    }

    public int hashCode() {
        return ak.a.K(this.f25107g, 0, 3) ^ 131832;
    }

    @Override // ti.f
    public boolean i() {
        return bj.f.v(this.f25107g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] i10 = bj.f.i();
        a1.l(this.f25107g, ((b1) fVar).f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25107g;
        long[] jArr2 = ((b1) fVar).f25107g;
        long[] jArr3 = ((b1) fVar2).f25107g;
        long[] jArr4 = ((b1) fVar3).f25107g;
        long[] l10 = bj.n.l(5);
        a1.m(jArr, jArr2, l10);
        a1.m(jArr3, jArr4, l10);
        long[] i10 = bj.f.i();
        a1.n(l10, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] i10 = bj.f.i();
        a1.o(this.f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] i10 = bj.f.i();
        a1.p(this.f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25107g;
        long[] jArr2 = ((b1) fVar).f25107g;
        long[] jArr3 = ((b1) fVar2).f25107g;
        long[] l10 = bj.n.l(5);
        a1.q(jArr, l10);
        a1.m(jArr2, jArr3, l10);
        long[] i10 = bj.f.i();
        a1.n(l10, i10);
        return new b1(i10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] i11 = bj.f.i();
        a1.r(this.f25107g, i10, i11);
        return new b1(i11);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25107g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.f.I(this.f25107g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] i10 = bj.f.i();
        a1.f(this.f25107g, i10);
        return new b1(i10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return a1.s(this.f25107g);
    }
}
