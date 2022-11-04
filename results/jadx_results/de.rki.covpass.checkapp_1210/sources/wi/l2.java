package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class l2 extends f.a {

    /* renamed from: g */
    protected long[] f25199g;

    public l2() {
        this.f25199g = bj.k.c();
    }

    public l2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f25199g = k2.e(bigInteger);
    }

    public l2(long[] jArr) {
        this.f25199g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] c10 = bj.k.c();
        k2.a(this.f25199g, ((l2) fVar).f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] c10 = bj.k.c();
        k2.c(this.f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return bj.k.e(this.f25199g, ((l2) obj).f25199g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 409;
    }

    @Override // ti.f
    public ti.f g() {
        long[] c10 = bj.k.c();
        k2.l(this.f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.k.f(this.f25199g);
    }

    public int hashCode() {
        return ak.a.K(this.f25199g, 0, 7) ^ 4090087;
    }

    @Override // ti.f
    public boolean i() {
        return bj.k.g(this.f25199g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] c10 = bj.k.c();
        k2.m(this.f25199g, ((l2) fVar).f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25199g;
        long[] jArr2 = ((l2) fVar).f25199g;
        long[] jArr3 = ((l2) fVar2).f25199g;
        long[] jArr4 = ((l2) fVar3).f25199g;
        long[] l10 = bj.n.l(13);
        k2.n(jArr, jArr2, l10);
        k2.n(jArr3, jArr4, l10);
        long[] c10 = bj.k.c();
        k2.o(l10, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] c10 = bj.k.c();
        k2.p(this.f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] c10 = bj.k.c();
        k2.q(this.f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25199g;
        long[] jArr2 = ((l2) fVar).f25199g;
        long[] jArr3 = ((l2) fVar2).f25199g;
        long[] l10 = bj.n.l(13);
        k2.r(jArr, l10);
        k2.n(jArr2, jArr3, l10);
        long[] c10 = bj.k.c();
        k2.o(l10, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] c10 = bj.k.c();
        k2.s(this.f25199g, i10, c10);
        return new l2(c10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25199g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.k.h(this.f25199g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] c10 = bj.k.c();
        k2.f(this.f25199g, c10);
        return new l2(c10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return k2.t(this.f25199g);
    }
}
