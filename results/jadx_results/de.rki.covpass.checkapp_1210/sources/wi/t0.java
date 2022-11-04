package wi;

import ti.i;
/* loaded from: classes3.dex */
public class t0 extends i.c {
    public t0(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public t0(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        s0 s0Var = (s0) this.f22405c;
        if (s0Var.i()) {
            return i10.u();
        }
        s0 s0Var2 = (s0) this.f22404b;
        s0 s0Var3 = (s0) this.f22406d[0];
        int[] k10 = bj.n.k(17);
        int[] k11 = bj.n.k(17);
        int[] k12 = bj.n.k(17);
        r0.n(s0Var.f25261g, k12);
        int[] k13 = bj.n.k(17);
        r0.n(k12, k13);
        boolean h10 = s0Var3.h();
        int[] iArr = s0Var3.f25261g;
        if (!h10) {
            r0.n(iArr, k11);
            iArr = k11;
        }
        r0.p(s0Var2.f25261g, iArr, k10);
        r0.a(s0Var2.f25261g, iArr, k11);
        r0.h(k11, k10, k11);
        bj.n.c(17, k11, k11, k11);
        r0.m(k11);
        r0.h(k12, s0Var2.f25261g, k12);
        bj.n.M(17, k12, 2, 0);
        r0.m(k12);
        bj.n.N(17, k13, 3, 0, k10);
        r0.m(k10);
        s0 s0Var4 = new s0(k13);
        r0.n(k11, s0Var4.f25261g);
        int[] iArr2 = s0Var4.f25261g;
        r0.p(iArr2, k12, iArr2);
        int[] iArr3 = s0Var4.f25261g;
        r0.p(iArr3, k12, iArr3);
        s0 s0Var5 = new s0(k12);
        r0.p(k12, s0Var4.f25261g, s0Var5.f25261g);
        int[] iArr4 = s0Var5.f25261g;
        r0.h(iArr4, k11, iArr4);
        int[] iArr5 = s0Var5.f25261g;
        r0.p(iArr5, k10, iArr5);
        s0 s0Var6 = new s0(k11);
        r0.q(s0Var.f25261g, s0Var6.f25261g);
        if (!h10) {
            int[] iArr6 = s0Var6.f25261g;
            r0.h(iArr6, s0Var3.f25261g, iArr6);
        }
        return new t0(i10, s0Var4, s0Var5, new ti.f[]{s0Var6});
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
        s0 s0Var = (s0) this.f22404b;
        s0 s0Var2 = (s0) this.f22405c;
        s0 s0Var3 = (s0) iVar.q();
        s0 s0Var4 = (s0) iVar.r();
        s0 s0Var5 = (s0) this.f22406d[0];
        s0 s0Var6 = (s0) iVar.s(0);
        int[] k10 = bj.n.k(17);
        int[] k11 = bj.n.k(17);
        int[] k12 = bj.n.k(17);
        int[] k13 = bj.n.k(17);
        boolean h10 = s0Var5.h();
        if (h10) {
            iArr2 = s0Var3.f25261g;
            iArr = s0Var4.f25261g;
        } else {
            r0.n(s0Var5.f25261g, k12);
            r0.h(k12, s0Var3.f25261g, k11);
            r0.h(k12, s0Var5.f25261g, k12);
            r0.h(k12, s0Var4.f25261g, k12);
            iArr2 = k11;
            iArr = k12;
        }
        boolean h11 = s0Var6.h();
        if (h11) {
            iArr4 = s0Var.f25261g;
            iArr3 = s0Var2.f25261g;
        } else {
            r0.n(s0Var6.f25261g, k13);
            r0.h(k13, s0Var.f25261g, k10);
            r0.h(k13, s0Var6.f25261g, k13);
            r0.h(k13, s0Var2.f25261g, k13);
            iArr4 = k10;
            iArr3 = k13;
        }
        int[] k14 = bj.n.k(17);
        r0.p(iArr4, iArr2, k14);
        r0.p(iArr3, iArr, k11);
        if (bj.n.A(17, k14)) {
            return bj.n.A(17, k11) ? J() : i10.u();
        }
        r0.n(k14, k12);
        int[] k15 = bj.n.k(17);
        r0.h(k12, k14, k15);
        r0.h(k12, iArr4, k12);
        r0.h(iArr3, k15, k10);
        s0 s0Var7 = new s0(k13);
        r0.n(k11, s0Var7.f25261g);
        int[] iArr5 = s0Var7.f25261g;
        r0.a(iArr5, k15, iArr5);
        int[] iArr6 = s0Var7.f25261g;
        r0.p(iArr6, k12, iArr6);
        int[] iArr7 = s0Var7.f25261g;
        r0.p(iArr7, k12, iArr7);
        s0 s0Var8 = new s0(k15);
        r0.p(k12, s0Var7.f25261g, s0Var8.f25261g);
        r0.h(s0Var8.f25261g, k11, k11);
        r0.p(k11, k10, s0Var8.f25261g);
        s0 s0Var9 = new s0(k14);
        if (!h10) {
            int[] iArr8 = s0Var9.f25261g;
            r0.h(iArr8, s0Var5.f25261g, iArr8);
        }
        if (!h11) {
            int[] iArr9 = s0Var9.f25261g;
            r0.h(iArr9, s0Var6.f25261g, iArr9);
        }
        return new t0(i10, s0Var7, s0Var8, new ti.f[]{s0Var9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new t0(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new t0(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
