package wi;

import ti.i;
/* loaded from: classes3.dex */
public class d extends i.c {
    public d(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public d(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        c cVar = (c) this.f22405c;
        if (cVar.i()) {
            return i10.u();
        }
        c cVar2 = (c) this.f22404b;
        c cVar3 = (c) this.f22406d[0];
        int[] f10 = bj.d.f();
        int[] f11 = bj.d.f();
        int[] f12 = bj.d.f();
        b.n(cVar.f25110g, f12);
        int[] f13 = bj.d.f();
        b.n(f12, f13);
        boolean h10 = cVar3.h();
        int[] iArr = cVar3.f25110g;
        if (!h10) {
            b.n(iArr, f11);
            iArr = f11;
        }
        b.q(cVar2.f25110g, iArr, f10);
        b.a(cVar2.f25110g, iArr, f11);
        b.g(f11, f10, f11);
        b.m(bj.d.b(f11, f11, f11), f11);
        b.g(f12, cVar2.f25110g, f12);
        b.m(bj.n.M(4, f12, 2, 0), f12);
        b.m(bj.n.N(4, f13, 3, 0, f10), f10);
        c cVar4 = new c(f13);
        b.n(f11, cVar4.f25110g);
        int[] iArr2 = cVar4.f25110g;
        b.q(iArr2, f12, iArr2);
        int[] iArr3 = cVar4.f25110g;
        b.q(iArr3, f12, iArr3);
        c cVar5 = new c(f12);
        b.q(f12, cVar4.f25110g, cVar5.f25110g);
        int[] iArr4 = cVar5.f25110g;
        b.g(iArr4, f11, iArr4);
        int[] iArr5 = cVar5.f25110g;
        b.q(iArr5, f10, iArr5);
        c cVar6 = new c(f11);
        b.r(cVar.f25110g, cVar6.f25110g);
        if (!h10) {
            int[] iArr6 = cVar6.f25110g;
            b.g(iArr6, cVar3.f25110g, iArr6);
        }
        return new d(i10, cVar4, cVar5, new ti.f[]{cVar6});
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
        c cVar = (c) this.f22404b;
        c cVar2 = (c) this.f22405c;
        c cVar3 = (c) iVar.q();
        c cVar4 = (c) iVar.r();
        c cVar5 = (c) this.f22406d[0];
        c cVar6 = (c) iVar.s(0);
        int[] h10 = bj.d.h();
        int[] f10 = bj.d.f();
        int[] f11 = bj.d.f();
        int[] f12 = bj.d.f();
        boolean h11 = cVar5.h();
        if (h11) {
            iArr2 = cVar3.f25110g;
            iArr = cVar4.f25110g;
        } else {
            b.n(cVar5.f25110g, f11);
            b.g(f11, cVar3.f25110g, f10);
            b.g(f11, cVar5.f25110g, f11);
            b.g(f11, cVar4.f25110g, f11);
            iArr2 = f10;
            iArr = f11;
        }
        boolean h12 = cVar6.h();
        if (h12) {
            iArr4 = cVar.f25110g;
            iArr3 = cVar2.f25110g;
        } else {
            b.n(cVar6.f25110g, f12);
            b.g(f12, cVar.f25110g, h10);
            b.g(f12, cVar6.f25110g, f12);
            b.g(f12, cVar2.f25110g, f12);
            iArr4 = h10;
            iArr3 = f12;
        }
        int[] f13 = bj.d.f();
        b.q(iArr4, iArr2, f13);
        b.q(iArr3, iArr, f10);
        if (bj.d.q(f13)) {
            return bj.d.q(f10) ? J() : i10.u();
        }
        b.n(f13, f11);
        int[] f14 = bj.d.f();
        b.g(f11, f13, f14);
        b.g(f11, iArr4, f11);
        b.i(f14, f14);
        bj.d.s(iArr3, f14, h10);
        b.m(bj.d.b(f11, f11, f14), f14);
        c cVar7 = new c(f12);
        b.n(f10, cVar7.f25110g);
        int[] iArr5 = cVar7.f25110g;
        b.q(iArr5, f14, iArr5);
        c cVar8 = new c(f14);
        b.q(f11, cVar7.f25110g, cVar8.f25110g);
        b.h(cVar8.f25110g, f10, h10);
        b.l(h10, cVar8.f25110g);
        c cVar9 = new c(f13);
        if (!h11) {
            int[] iArr6 = cVar9.f25110g;
            b.g(iArr6, cVar5.f25110g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = cVar9.f25110g;
            b.g(iArr7, cVar6.f25110g, iArr7);
        }
        return new d(i10, cVar7, cVar8, new ti.f[]{cVar9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new d(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new d(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
