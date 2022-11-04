package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class b2 extends f.a {

    /* renamed from: g */
    protected long[] f25108g;

    public b2() {
        this.f25108g = bj.h.j();
    }

    public b2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f25108g = a2.e(bigInteger);
    }

    public b2(long[] jArr) {
        this.f25108g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] j10 = bj.h.j();
        a2.a(this.f25108g, ((b2) fVar).f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] j10 = bj.h.j();
        a2.c(this.f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return bj.h.o(this.f25108g, ((b2) obj).f25108g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 239;
    }

    @Override // ti.f
    public ti.f g() {
        long[] j10 = bj.h.j();
        a2.l(this.f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.h.u(this.f25108g);
    }

    public int hashCode() {
        return ak.a.K(this.f25108g, 0, 4) ^ 23900158;
    }

    @Override // ti.f
    public boolean i() {
        return bj.h.w(this.f25108g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] j10 = bj.h.j();
        a2.m(this.f25108g, ((b2) fVar).f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25108g;
        long[] jArr2 = ((b2) fVar).f25108g;
        long[] jArr3 = ((b2) fVar2).f25108g;
        long[] jArr4 = ((b2) fVar3).f25108g;
        long[] l10 = bj.h.l();
        a2.n(jArr, jArr2, l10);
        a2.n(jArr3, jArr4, l10);
        long[] j10 = bj.h.j();
        a2.o(l10, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] j10 = bj.h.j();
        a2.p(this.f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] j10 = bj.h.j();
        a2.q(this.f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25108g;
        long[] jArr2 = ((b2) fVar).f25108g;
        long[] jArr3 = ((b2) fVar2).f25108g;
        long[] l10 = bj.h.l();
        a2.r(jArr, l10);
        a2.n(jArr2, jArr3, l10);
        long[] j10 = bj.h.j();
        a2.o(l10, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] j10 = bj.h.j();
        a2.s(this.f25108g, i10, j10);
        return new b2(j10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25108g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.h.K(this.f25108g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] j10 = bj.h.j();
        a2.f(this.f25108g, j10);
        return new b2(j10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return a2.t(this.f25108g);
    }
}
