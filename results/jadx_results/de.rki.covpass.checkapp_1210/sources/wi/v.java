package wi;

import ti.i;
/* loaded from: classes3.dex */
public class v extends i.c {
    public v(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public v(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        u uVar = (u) this.f22405c;
        if (uVar.i()) {
            return i10.u();
        }
        u uVar2 = (u) this.f22404b;
        u uVar3 = (u) this.f22406d[0];
        int[] h10 = bj.f.h();
        int[] h11 = bj.f.h();
        int[] h12 = bj.f.h();
        t.n(uVar.f25276g, h12);
        int[] h13 = bj.f.h();
        t.n(h12, h13);
        boolean h14 = uVar3.h();
        int[] iArr = uVar3.f25276g;
        if (!h14) {
            t.n(iArr, h11);
            iArr = h11;
        }
        t.q(uVar2.f25276g, iArr, h10);
        t.a(uVar2.f25276g, iArr, h11);
        t.g(h11, h10, h11);
        t.m(bj.f.b(h11, h11, h11), h11);
        t.g(h12, uVar2.f25276g, h12);
        t.m(bj.n.M(6, h12, 2, 0), h12);
        t.m(bj.n.N(6, h13, 3, 0, h10), h10);
        u uVar4 = new u(h13);
        t.n(h11, uVar4.f25276g);
        int[] iArr2 = uVar4.f25276g;
        t.q(iArr2, h12, iArr2);
        int[] iArr3 = uVar4.f25276g;
        t.q(iArr3, h12, iArr3);
        u uVar5 = new u(h12);
        t.q(h12, uVar4.f25276g, uVar5.f25276g);
        int[] iArr4 = uVar5.f25276g;
        t.g(iArr4, h11, iArr4);
        int[] iArr5 = uVar5.f25276g;
        t.q(iArr5, h10, iArr5);
        u uVar6 = new u(h11);
        t.r(uVar.f25276g, uVar6.f25276g);
        if (!h14) {
            int[] iArr6 = uVar6.f25276g;
            t.g(iArr6, uVar3.f25276g, iArr6);
        }
        return new v(i10, uVar4, uVar5, new ti.f[]{uVar6});
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
        u uVar = (u) this.f22404b;
        u uVar2 = (u) this.f22405c;
        u uVar3 = (u) iVar.q();
        u uVar4 = (u) iVar.r();
        u uVar5 = (u) this.f22406d[0];
        u uVar6 = (u) iVar.s(0);
        int[] j10 = bj.f.j();
        int[] h10 = bj.f.h();
        int[] h11 = bj.f.h();
        int[] h12 = bj.f.h();
        boolean h13 = uVar5.h();
        if (h13) {
            iArr2 = uVar3.f25276g;
            iArr = uVar4.f25276g;
        } else {
            t.n(uVar5.f25276g, h11);
            t.g(h11, uVar3.f25276g, h10);
            t.g(h11, uVar5.f25276g, h11);
            t.g(h11, uVar4.f25276g, h11);
            iArr2 = h10;
            iArr = h11;
        }
        boolean h14 = uVar6.h();
        if (h14) {
            iArr4 = uVar.f25276g;
            iArr3 = uVar2.f25276g;
        } else {
            t.n(uVar6.f25276g, h12);
            t.g(h12, uVar.f25276g, j10);
            t.g(h12, uVar6.f25276g, h12);
            t.g(h12, uVar2.f25276g, h12);
            iArr4 = j10;
            iArr3 = h12;
        }
        int[] h15 = bj.f.h();
        t.q(iArr4, iArr2, h15);
        t.q(iArr3, iArr, h10);
        if (bj.f.u(h15)) {
            return bj.f.u(h10) ? J() : i10.u();
        }
        t.n(h15, h11);
        int[] h16 = bj.f.h();
        t.g(h11, h15, h16);
        t.g(h11, iArr4, h11);
        t.i(h16, h16);
        bj.f.x(iArr3, h16, j10);
        t.m(bj.f.b(h11, h11, h16), h16);
        u uVar7 = new u(h12);
        t.n(h10, uVar7.f25276g);
        int[] iArr5 = uVar7.f25276g;
        t.q(iArr5, h16, iArr5);
        u uVar8 = new u(h16);
        t.q(h11, uVar7.f25276g, uVar8.f25276g);
        t.h(uVar8.f25276g, h10, j10);
        t.l(j10, uVar8.f25276g);
        u uVar9 = new u(h15);
        if (!h13) {
            int[] iArr6 = uVar9.f25276g;
            t.g(iArr6, uVar5.f25276g, iArr6);
        }
        if (!h14) {
            int[] iArr7 = uVar9.f25276g;
            t.g(iArr7, uVar6.f25276g, iArr7);
        }
        return new v(i10, uVar7, uVar8, new ti.f[]{uVar9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new v(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new v(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
