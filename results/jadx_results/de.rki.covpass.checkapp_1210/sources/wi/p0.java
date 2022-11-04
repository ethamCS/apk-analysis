package wi;

import ti.i;
/* loaded from: classes3.dex */
public class p0 extends i.c {
    public p0(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public p0(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        o0 o0Var = (o0) this.f22405c;
        if (o0Var.i()) {
            return i10.u();
        }
        o0 o0Var2 = (o0) this.f22404b;
        o0 o0Var3 = (o0) this.f22406d[0];
        int[] k10 = bj.n.k(12);
        int[] k11 = bj.n.k(12);
        int[] k12 = bj.n.k(12);
        n0.n(o0Var.f25228g, k12);
        int[] k13 = bj.n.k(12);
        n0.n(k12, k13);
        boolean h10 = o0Var3.h();
        int[] iArr = o0Var3.f25228g;
        if (!h10) {
            n0.n(iArr, k11);
            iArr = k11;
        }
        n0.q(o0Var2.f25228g, iArr, k10);
        n0.a(o0Var2.f25228g, iArr, k11);
        n0.h(k11, k10, k11);
        n0.m(bj.n.c(12, k11, k11, k11), k11);
        n0.h(k12, o0Var2.f25228g, k12);
        n0.m(bj.n.M(12, k12, 2, 0), k12);
        n0.m(bj.n.N(12, k13, 3, 0, k10), k10);
        o0 o0Var4 = new o0(k13);
        n0.n(k11, o0Var4.f25228g);
        int[] iArr2 = o0Var4.f25228g;
        n0.q(iArr2, k12, iArr2);
        int[] iArr3 = o0Var4.f25228g;
        n0.q(iArr3, k12, iArr3);
        o0 o0Var5 = new o0(k12);
        n0.q(k12, o0Var4.f25228g, o0Var5.f25228g);
        int[] iArr4 = o0Var5.f25228g;
        n0.h(iArr4, k11, iArr4);
        int[] iArr5 = o0Var5.f25228g;
        n0.q(iArr5, k10, iArr5);
        o0 o0Var6 = new o0(k11);
        n0.r(o0Var.f25228g, o0Var6.f25228g);
        if (!h10) {
            int[] iArr6 = o0Var6.f25228g;
            n0.h(iArr6, o0Var3.f25228g, iArr6);
        }
        return new p0(i10, o0Var4, o0Var5, new ti.f[]{o0Var6});
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
        o0 o0Var = (o0) this.f22404b;
        o0 o0Var2 = (o0) this.f22405c;
        o0 o0Var3 = (o0) iVar.q();
        o0 o0Var4 = (o0) iVar.r();
        o0 o0Var5 = (o0) this.f22406d[0];
        o0 o0Var6 = (o0) iVar.s(0);
        int[] k10 = bj.n.k(24);
        int[] k11 = bj.n.k(24);
        int[] k12 = bj.n.k(12);
        int[] k13 = bj.n.k(12);
        boolean h10 = o0Var5.h();
        if (h10) {
            iArr2 = o0Var3.f25228g;
            iArr = o0Var4.f25228g;
        } else {
            n0.n(o0Var5.f25228g, k12);
            n0.h(k12, o0Var3.f25228g, k11);
            n0.h(k12, o0Var5.f25228g, k12);
            n0.h(k12, o0Var4.f25228g, k12);
            iArr2 = k11;
            iArr = k12;
        }
        boolean h11 = o0Var6.h();
        if (h11) {
            iArr4 = o0Var.f25228g;
            iArr3 = o0Var2.f25228g;
        } else {
            n0.n(o0Var6.f25228g, k13);
            n0.h(k13, o0Var.f25228g, k10);
            n0.h(k13, o0Var6.f25228g, k13);
            n0.h(k13, o0Var2.f25228g, k13);
            iArr4 = k10;
            iArr3 = k13;
        }
        int[] k14 = bj.n.k(12);
        n0.q(iArr4, iArr2, k14);
        int[] k15 = bj.n.k(12);
        n0.q(iArr3, iArr, k15);
        if (bj.n.A(12, k14)) {
            return bj.n.A(12, k15) ? J() : i10.u();
        }
        n0.n(k14, k12);
        int[] k16 = bj.n.k(12);
        n0.h(k12, k14, k16);
        n0.h(k12, iArr4, k12);
        n0.i(k16, k16);
        bj.j.a(iArr3, k16, k10);
        n0.m(bj.n.c(12, k12, k12, k16), k16);
        o0 o0Var7 = new o0(k13);
        n0.n(k15, o0Var7.f25228g);
        int[] iArr5 = o0Var7.f25228g;
        n0.q(iArr5, k16, iArr5);
        o0 o0Var8 = new o0(k16);
        n0.q(k12, o0Var7.f25228g, o0Var8.f25228g);
        bj.j.a(o0Var8.f25228g, k15, k11);
        n0.b(k10, k11, k10);
        n0.l(k10, o0Var8.f25228g);
        o0 o0Var9 = new o0(k14);
        if (!h10) {
            int[] iArr6 = o0Var9.f25228g;
            n0.h(iArr6, o0Var5.f25228g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = o0Var9.f25228g;
            n0.h(iArr7, o0Var6.f25228g, iArr7);
        }
        return new p0(i10, o0Var7, o0Var8, new ti.f[]{o0Var9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new p0(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new p0(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
