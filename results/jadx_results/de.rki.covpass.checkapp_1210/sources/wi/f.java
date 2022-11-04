package wi;

import ti.i;
/* loaded from: classes3.dex */
public class f extends i.c {
    public f(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public f(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        m mVar = (m) this.f22405c;
        if (mVar.i()) {
            return i10.u();
        }
        m mVar2 = (m) this.f22404b;
        m mVar3 = (m) this.f22406d[0];
        int[] d10 = bj.e.d();
        l.m(mVar.f25201g, d10);
        int[] d11 = bj.e.d();
        l.m(d10, d11);
        int[] d12 = bj.e.d();
        l.m(mVar2.f25201g, d12);
        l.l(bj.e.b(d12, d12, d12), d12);
        l.f(d10, mVar2.f25201g, d10);
        l.l(bj.n.M(5, d10, 2, 0), d10);
        int[] d13 = bj.e.d();
        l.l(bj.n.N(5, d11, 3, 0, d13), d13);
        m mVar4 = new m(d11);
        l.m(d12, mVar4.f25201g);
        int[] iArr = mVar4.f25201g;
        l.o(iArr, d10, iArr);
        int[] iArr2 = mVar4.f25201g;
        l.o(iArr2, d10, iArr2);
        m mVar5 = new m(d10);
        l.o(d10, mVar4.f25201g, mVar5.f25201g);
        int[] iArr3 = mVar5.f25201g;
        l.f(iArr3, d12, iArr3);
        int[] iArr4 = mVar5.f25201g;
        l.o(iArr4, d13, iArr4);
        m mVar6 = new m(d12);
        l.p(mVar.f25201g, mVar6.f25201g);
        if (!mVar3.h()) {
            int[] iArr5 = mVar6.f25201g;
            l.f(iArr5, mVar3.f25201g, iArr5);
        }
        return new f(i10, mVar4, mVar5, new ti.f[]{mVar6});
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
        m mVar = (m) this.f22404b;
        m mVar2 = (m) this.f22405c;
        m mVar3 = (m) iVar.q();
        m mVar4 = (m) iVar.r();
        m mVar5 = (m) this.f22406d[0];
        m mVar6 = (m) iVar.s(0);
        int[] e10 = bj.e.e();
        int[] d10 = bj.e.d();
        int[] d11 = bj.e.d();
        int[] d12 = bj.e.d();
        boolean h10 = mVar5.h();
        if (h10) {
            iArr2 = mVar3.f25201g;
            iArr = mVar4.f25201g;
        } else {
            l.m(mVar5.f25201g, d11);
            l.f(d11, mVar3.f25201g, d10);
            l.f(d11, mVar5.f25201g, d11);
            l.f(d11, mVar4.f25201g, d11);
            iArr2 = d10;
            iArr = d11;
        }
        boolean h11 = mVar6.h();
        if (h11) {
            iArr4 = mVar.f25201g;
            iArr3 = mVar2.f25201g;
        } else {
            l.m(mVar6.f25201g, d12);
            l.f(d12, mVar.f25201g, e10);
            l.f(d12, mVar6.f25201g, d12);
            l.f(d12, mVar2.f25201g, d12);
            iArr4 = e10;
            iArr3 = d12;
        }
        int[] d13 = bj.e.d();
        l.o(iArr4, iArr2, d13);
        l.o(iArr3, iArr, d10);
        if (bj.e.k(d13)) {
            return bj.e.k(d10) ? J() : i10.u();
        }
        l.m(d13, d11);
        int[] d14 = bj.e.d();
        l.f(d11, d13, d14);
        l.f(d11, iArr4, d11);
        l.h(d14, d14);
        bj.e.l(iArr3, d14, e10);
        l.l(bj.e.b(d11, d11, d14), d14);
        m mVar7 = new m(d12);
        l.m(d10, mVar7.f25201g);
        int[] iArr5 = mVar7.f25201g;
        l.o(iArr5, d14, iArr5);
        m mVar8 = new m(d14);
        l.o(d11, mVar7.f25201g, mVar8.f25201g);
        l.g(mVar8.f25201g, d10, e10);
        l.k(e10, mVar8.f25201g);
        m mVar9 = new m(d13);
        if (!h10) {
            int[] iArr6 = mVar9.f25201g;
            l.f(iArr6, mVar5.f25201g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = mVar9.f25201g;
            l.f(iArr7, mVar6.f25201g, iArr7);
        }
        return new f(i10, mVar7, mVar8, new ti.f[]{mVar9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new f(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new f(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
