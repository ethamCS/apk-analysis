package wi;

import ti.i;
/* loaded from: classes3.dex */
public class z extends i.c {
    public z(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public z(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        y yVar = (y) this.f22405c;
        if (yVar.i()) {
            return i10.u();
        }
        y yVar2 = (y) this.f22404b;
        y yVar3 = (y) this.f22406d[0];
        int[] e10 = bj.g.e();
        x.m(yVar.f25307g, e10);
        int[] e11 = bj.g.e();
        x.m(e10, e11);
        int[] e12 = bj.g.e();
        x.m(yVar2.f25307g, e12);
        x.l(bj.g.b(e12, e12, e12), e12);
        x.f(e10, yVar2.f25307g, e10);
        x.l(bj.n.M(7, e10, 2, 0), e10);
        int[] e13 = bj.g.e();
        x.l(bj.n.N(7, e11, 3, 0, e13), e13);
        y yVar4 = new y(e11);
        x.m(e12, yVar4.f25307g);
        int[] iArr = yVar4.f25307g;
        x.o(iArr, e10, iArr);
        int[] iArr2 = yVar4.f25307g;
        x.o(iArr2, e10, iArr2);
        y yVar5 = new y(e10);
        x.o(e10, yVar4.f25307g, yVar5.f25307g);
        int[] iArr3 = yVar5.f25307g;
        x.f(iArr3, e12, iArr3);
        int[] iArr4 = yVar5.f25307g;
        x.o(iArr4, e13, iArr4);
        y yVar6 = new y(e12);
        x.p(yVar.f25307g, yVar6.f25307g);
        if (!yVar3.h()) {
            int[] iArr5 = yVar6.f25307g;
            x.f(iArr5, yVar3.f25307g, iArr5);
        }
        return new z(i10, yVar4, yVar5, new ti.f[]{yVar6});
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
        y yVar = (y) this.f22404b;
        y yVar2 = (y) this.f22405c;
        y yVar3 = (y) iVar.q();
        y yVar4 = (y) iVar.r();
        y yVar5 = (y) this.f22406d[0];
        y yVar6 = (y) iVar.s(0);
        int[] f10 = bj.g.f();
        int[] e10 = bj.g.e();
        int[] e11 = bj.g.e();
        int[] e12 = bj.g.e();
        boolean h10 = yVar5.h();
        if (h10) {
            iArr2 = yVar3.f25307g;
            iArr = yVar4.f25307g;
        } else {
            x.m(yVar5.f25307g, e11);
            x.f(e11, yVar3.f25307g, e10);
            x.f(e11, yVar5.f25307g, e11);
            x.f(e11, yVar4.f25307g, e11);
            iArr2 = e10;
            iArr = e11;
        }
        boolean h11 = yVar6.h();
        if (h11) {
            iArr4 = yVar.f25307g;
            iArr3 = yVar2.f25307g;
        } else {
            x.m(yVar6.f25307g, e12);
            x.f(e12, yVar.f25307g, f10);
            x.f(e12, yVar6.f25307g, e12);
            x.f(e12, yVar2.f25307g, e12);
            iArr4 = f10;
            iArr3 = e12;
        }
        int[] e13 = bj.g.e();
        x.o(iArr4, iArr2, e13);
        x.o(iArr3, iArr, e10);
        if (bj.g.l(e13)) {
            return bj.g.l(e10) ? J() : i10.u();
        }
        x.m(e13, e11);
        int[] e14 = bj.g.e();
        x.f(e11, e13, e14);
        x.f(e11, iArr4, e11);
        x.h(e14, e14);
        bj.g.m(iArr3, e14, f10);
        x.l(bj.g.b(e11, e11, e14), e14);
        y yVar7 = new y(e12);
        x.m(e10, yVar7.f25307g);
        int[] iArr5 = yVar7.f25307g;
        x.o(iArr5, e14, iArr5);
        y yVar8 = new y(e14);
        x.o(e11, yVar7.f25307g, yVar8.f25307g);
        x.g(yVar8.f25307g, e10, f10);
        x.k(f10, yVar8.f25307g);
        y yVar9 = new y(e13);
        if (!h10) {
            int[] iArr6 = yVar9.f25307g;
            x.f(iArr6, yVar5.f25307g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = yVar9.f25307g;
            x.f(iArr7, yVar6.f25307g, iArr7);
        }
        return new z(i10, yVar7, yVar8, new ti.f[]{yVar9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new z(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new z(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
