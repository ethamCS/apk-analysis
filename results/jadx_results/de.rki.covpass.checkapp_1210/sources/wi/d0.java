package wi;

import ti.i;
/* loaded from: classes3.dex */
public class d0 extends i.c {
    public d0(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public d0(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // ti.i
    public ti.i H() {
        return (u() || this.f22405c.i()) ? this : J().a(this);
    }

    @Override // ti.i
    public ti.i J() {
        if (u()) {
            return this;
        }
        ti.e i10 = i();
        c0 c0Var = (c0) this.f22405c;
        if (c0Var.i()) {
            return i10.u();
        }
        c0 c0Var2 = (c0) this.f22404b;
        c0 c0Var3 = (c0) this.f22406d[0];
        int[] e10 = bj.g.e();
        int[] e11 = bj.g.e();
        int[] e12 = bj.g.e();
        b0.n(c0Var.f25112g, e12);
        int[] e13 = bj.g.e();
        b0.n(e12, e13);
        boolean h10 = c0Var3.h();
        int[] iArr = c0Var3.f25112g;
        if (!h10) {
            b0.n(iArr, e11);
            iArr = e11;
        }
        b0.q(c0Var2.f25112g, iArr, e10);
        b0.a(c0Var2.f25112g, iArr, e11);
        b0.g(e11, e10, e11);
        b0.m(bj.g.b(e11, e11, e11), e11);
        b0.g(e12, c0Var2.f25112g, e12);
        b0.m(bj.n.M(7, e12, 2, 0), e12);
        b0.m(bj.n.N(7, e13, 3, 0, e10), e10);
        c0 c0Var4 = new c0(e13);
        b0.n(e11, c0Var4.f25112g);
        int[] iArr2 = c0Var4.f25112g;
        b0.q(iArr2, e12, iArr2);
        int[] iArr3 = c0Var4.f25112g;
        b0.q(iArr3, e12, iArr3);
        c0 c0Var5 = new c0(e12);
        b0.q(e12, c0Var4.f25112g, c0Var5.f25112g);
        int[] iArr4 = c0Var5.f25112g;
        b0.g(iArr4, e11, iArr4);
        int[] iArr5 = c0Var5.f25112g;
        b0.q(iArr5, e10, iArr5);
        c0 c0Var6 = new c0(e11);
        b0.r(c0Var.f25112g, c0Var6.f25112g);
        if (!h10) {
            int[] iArr6 = c0Var6.f25112g;
            b0.g(iArr6, c0Var3.f25112g, iArr6);
        }
        return new d0(i10, c0Var4, c0Var5, new ti.f[]{c0Var6});
    }

    @Override // ti.i
    public ti.i K(ti.i iVar) {
        return this == iVar ? H() : u() ? iVar : iVar.u() ? J() : this.f22405c.i() ? iVar : J().a(iVar);
    }

    @Override // ti.i
    public ti.i a(ti.i iVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        if (this == iVar) {
            return J();
        }
        ti.e i10 = i();
        c0 c0Var = (c0) this.f22404b;
        c0 c0Var2 = (c0) this.f22405c;
        c0 c0Var3 = (c0) iVar.q();
        c0 c0Var4 = (c0) iVar.r();
        c0 c0Var5 = (c0) this.f22406d[0];
        c0 c0Var6 = (c0) iVar.s(0);
        int[] f10 = bj.g.f();
        int[] e10 = bj.g.e();
        int[] e11 = bj.g.e();
        int[] e12 = bj.g.e();
        boolean h10 = c0Var5.h();
        if (h10) {
            iArr2 = c0Var3.f25112g;
            iArr = c0Var4.f25112g;
        } else {
            b0.n(c0Var5.f25112g, e11);
            b0.g(e11, c0Var3.f25112g, e10);
            b0.g(e11, c0Var5.f25112g, e11);
            b0.g(e11, c0Var4.f25112g, e11);
            iArr2 = e10;
            iArr = e11;
        }
        boolean h11 = c0Var6.h();
        if (h11) {
            iArr4 = c0Var.f25112g;
            iArr3 = c0Var2.f25112g;
        } else {
            b0.n(c0Var6.f25112g, e12);
            b0.g(e12, c0Var.f25112g, f10);
            b0.g(e12, c0Var6.f25112g, e12);
            b0.g(e12, c0Var2.f25112g, e12);
            iArr4 = f10;
            iArr3 = e12;
        }
        int[] e13 = bj.g.e();
        b0.q(iArr4, iArr2, e13);
        b0.q(iArr3, iArr, e10);
        if (bj.g.l(e13)) {
            return bj.g.l(e10) ? J() : i10.u();
        }
        b0.n(e13, e11);
        int[] e14 = bj.g.e();
        b0.g(e11, e13, e14);
        b0.g(e11, iArr4, e11);
        b0.i(e14, e14);
        bj.g.m(iArr3, e14, f10);
        b0.m(bj.g.b(e11, e11, e14), e14);
        c0 c0Var7 = new c0(e12);
        b0.n(e10, c0Var7.f25112g);
        int[] iArr5 = c0Var7.f25112g;
        b0.q(iArr5, e14, iArr5);
        c0 c0Var8 = new c0(e14);
        b0.q(e11, c0Var7.f25112g, c0Var8.f25112g);
        b0.h(c0Var8.f25112g, e10, f10);
        b0.l(f10, c0Var8.f25112g);
        c0 c0Var9 = new c0(e13);
        if (!h10) {
            int[] iArr6 = c0Var9.f25112g;
            b0.g(iArr6, c0Var5.f25112g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = c0Var9.f25112g;
            b0.g(iArr7, c0Var6.f25112g, iArr7);
        }
        return new d0(i10, c0Var7, c0Var8, new ti.f[]{c0Var9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new d0(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new d0(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
