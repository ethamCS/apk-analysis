package wi;

import java.math.BigInteger;
import ti.f;
/* loaded from: classes3.dex */
public class f2 extends f.a {

    /* renamed from: g */
    protected long[] f25144g;

    public f2() {
        this.f25144g = bj.i.c();
    }

    public f2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f25144g = e2.e(bigInteger);
    }

    public f2(long[] jArr) {
        this.f25144g = jArr;
    }

    @Override // ti.f
    public ti.f a(ti.f fVar) {
        long[] c10 = bj.i.c();
        e2.a(this.f25144g, ((f2) fVar).f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f b() {
        long[] c10 = bj.i.c();
        e2.c(this.f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f d(ti.f fVar) {
        return j(fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            return bj.i.e(this.f25144g, ((f2) obj).f25144g);
        }
        return false;
    }

    @Override // ti.f
    public int f() {
        return 283;
    }

    @Override // ti.f
    public ti.f g() {
        long[] c10 = bj.i.c();
        e2.l(this.f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public boolean h() {
        return bj.i.f(this.f25144g);
    }

    public int hashCode() {
        return ak.a.K(this.f25144g, 0, 5) ^ 2831275;
    }

    @Override // ti.f
    public boolean i() {
        return bj.i.g(this.f25144g);
    }

    @Override // ti.f
    public ti.f j(ti.f fVar) {
        long[] c10 = bj.i.c();
        e2.m(this.f25144g, ((f2) fVar).f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f k(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        return l(fVar, fVar2, fVar3);
    }

    @Override // ti.f
    public ti.f l(ti.f fVar, ti.f fVar2, ti.f fVar3) {
        long[] jArr = this.f25144g;
        long[] jArr2 = ((f2) fVar).f25144g;
        long[] jArr3 = ((f2) fVar2).f25144g;
        long[] jArr4 = ((f2) fVar3).f25144g;
        long[] l10 = bj.n.l(9);
        e2.n(jArr, jArr2, l10);
        e2.n(jArr3, jArr4, l10);
        long[] c10 = bj.i.c();
        e2.o(l10, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f m() {
        return this;
    }

    @Override // ti.f
    public ti.f n() {
        long[] c10 = bj.i.c();
        e2.p(this.f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f o() {
        long[] c10 = bj.i.c();
        e2.q(this.f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f p(ti.f fVar, ti.f fVar2) {
        long[] jArr = this.f25144g;
        long[] jArr2 = ((f2) fVar).f25144g;
        long[] jArr3 = ((f2) fVar2).f25144g;
        long[] l10 = bj.n.l(9);
        e2.r(jArr, l10);
        e2.n(jArr2, jArr3, l10);
        long[] c10 = bj.i.c();
        e2.o(l10, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f q(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] c10 = bj.i.c();
        e2.s(this.f25144g, i10, c10);
        return new f2(c10);
    }

    @Override // ti.f
    public ti.f r(ti.f fVar) {
        return a(fVar);
    }

    @Override // ti.f
    public boolean s() {
        return (this.f25144g[0] & 1) != 0;
    }

    @Override // ti.f
    public BigInteger t() {
        return bj.i.h(this.f25144g);
    }

    @Override // ti.f.a
    public ti.f u() {
        long[] c10 = bj.i.c();
        e2.f(this.f25144g, c10);
        return new f2(c10);
    }

    @Override // ti.f.a
    public boolean v() {
        return true;
    }

    @Override // ti.f.a
    public int w() {
        return e2.t(this.f25144g);
    }
}
