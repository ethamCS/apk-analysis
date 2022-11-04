package wi;

import ti.i;
/* loaded from: classes3.dex */
public class j extends i.c {
    public j(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public j(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        i iVar = (i) this.f22405c;
        if (iVar.i()) {
            return i10.u();
        }
        i iVar2 = (i) this.f22404b;
        i iVar3 = (i) this.f22406d[0];
        int[] d10 = bj.e.d();
        int[] d11 = bj.e.d();
        int[] d12 = bj.e.d();
        h.m(iVar.f25164g, d12);
        int[] d13 = bj.e.d();
        h.m(d12, d13);
        boolean h10 = iVar3.h();
        int[] iArr = iVar3.f25164g;
        if (!h10) {
            h.m(iArr, d11);
            iArr = d11;
        }
        h.o(iVar2.f25164g, iArr, d10);
        h.a(iVar2.f25164g, iArr, d11);
        h.f(d11, d10, d11);
        h.l(bj.e.b(d11, d11, d11), d11);
        h.f(d12, iVar2.f25164g, d12);
        h.l(bj.n.M(5, d12, 2, 0), d12);
        h.l(bj.n.N(5, d13, 3, 0, d10), d10);
        i iVar4 = new i(d13);
        h.m(d11, iVar4.f25164g);
        int[] iArr2 = iVar4.f25164g;
        h.o(iArr2, d12, iArr2);
        int[] iArr3 = iVar4.f25164g;
        h.o(iArr3, d12, iArr3);
        i iVar5 = new i(d12);
        h.o(d12, iVar4.f25164g, iVar5.f25164g);
        int[] iArr4 = iVar5.f25164g;
        h.f(iArr4, d11, iArr4);
        int[] iArr5 = iVar5.f25164g;
        h.o(iArr5, d10, iArr5);
        i iVar6 = new i(d11);
        h.p(iVar.f25164g, iVar6.f25164g);
        if (!h10) {
            int[] iArr6 = iVar6.f25164g;
            h.f(iArr6, iVar3.f25164g, iArr6);
        }
        return new j(i10, iVar4, iVar5, new ti.f[]{iVar6});
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
        i iVar2 = (i) this.f22404b;
        i iVar3 = (i) this.f22405c;
        i iVar4 = (i) iVar.q();
        i iVar5 = (i) iVar.r();
        i iVar6 = (i) this.f22406d[0];
        i iVar7 = (i) iVar.s(0);
        int[] e10 = bj.e.e();
        int[] d10 = bj.e.d();
        int[] d11 = bj.e.d();
        int[] d12 = bj.e.d();
        boolean h10 = iVar6.h();
        if (h10) {
            iArr2 = iVar4.f25164g;
            iArr = iVar5.f25164g;
        } else {
            h.m(iVar6.f25164g, d11);
            h.f(d11, iVar4.f25164g, d10);
            h.f(d11, iVar6.f25164g, d11);
            h.f(d11, iVar5.f25164g, d11);
            iArr2 = d10;
            iArr = d11;
        }
        boolean h11 = iVar7.h();
        if (h11) {
            iArr4 = iVar2.f25164g;
            iArr3 = iVar3.f25164g;
        } else {
            h.m(iVar7.f25164g, d12);
            h.f(d12, iVar2.f25164g, e10);
            h.f(d12, iVar7.f25164g, d12);
            h.f(d12, iVar3.f25164g, d12);
            iArr4 = e10;
            iArr3 = d12;
        }
        int[] d13 = bj.e.d();
        h.o(iArr4, iArr2, d13);
        h.o(iArr3, iArr, d10);
        if (bj.e.k(d13)) {
            return bj.e.k(d10) ? J() : i10.u();
        }
        h.m(d13, d11);
        int[] d14 = bj.e.d();
        h.f(d11, d13, d14);
        h.f(d11, iArr4, d11);
        h.h(d14, d14);
        bj.e.l(iArr3, d14, e10);
        h.l(bj.e.b(d11, d11, d14), d14);
        i iVar8 = new i(d12);
        h.m(d10, iVar8.f25164g);
        int[] iArr5 = iVar8.f25164g;
        h.o(iArr5, d14, iArr5);
        i iVar9 = new i(d14);
        h.o(d11, iVar8.f25164g, iVar9.f25164g);
        h.g(iVar9.f25164g, d10, e10);
        h.k(e10, iVar9.f25164g);
        i iVar10 = new i(d13);
        if (!h10) {
            int[] iArr6 = iVar10.f25164g;
            h.f(iArr6, iVar6.f25164g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = iVar10.f25164g;
            h.f(iArr7, iVar7.f25164g, iArr7);
        }
        return new j(i10, iVar8, iVar9, new ti.f[]{iVar10});
    }

    @Override // ti.i
    protected ti.i d() {
        return new j(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new j(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
