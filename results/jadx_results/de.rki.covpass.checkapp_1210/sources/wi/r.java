package wi;

import ti.i;
/* loaded from: classes3.dex */
public class r extends i.c {
    public r(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public r(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        q qVar = (q) this.f22405c;
        if (qVar.i()) {
            return i10.u();
        }
        q qVar2 = (q) this.f22404b;
        q qVar3 = (q) this.f22406d[0];
        int[] h10 = bj.f.h();
        p.m(qVar.f25239g, h10);
        int[] h11 = bj.f.h();
        p.m(h10, h11);
        int[] h12 = bj.f.h();
        p.m(qVar2.f25239g, h12);
        p.l(bj.f.b(h12, h12, h12), h12);
        p.f(h10, qVar2.f25239g, h10);
        p.l(bj.n.M(6, h10, 2, 0), h10);
        int[] h13 = bj.f.h();
        p.l(bj.n.N(6, h11, 3, 0, h13), h13);
        q qVar4 = new q(h11);
        p.m(h12, qVar4.f25239g);
        int[] iArr = qVar4.f25239g;
        p.o(iArr, h10, iArr);
        int[] iArr2 = qVar4.f25239g;
        p.o(iArr2, h10, iArr2);
        q qVar5 = new q(h10);
        p.o(h10, qVar4.f25239g, qVar5.f25239g);
        int[] iArr3 = qVar5.f25239g;
        p.f(iArr3, h12, iArr3);
        int[] iArr4 = qVar5.f25239g;
        p.o(iArr4, h13, iArr4);
        q qVar6 = new q(h12);
        p.p(qVar.f25239g, qVar6.f25239g);
        if (!qVar3.h()) {
            int[] iArr5 = qVar6.f25239g;
            p.f(iArr5, qVar3.f25239g, iArr5);
        }
        return new r(i10, qVar4, qVar5, new ti.f[]{qVar6});
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
        q qVar = (q) this.f22404b;
        q qVar2 = (q) this.f22405c;
        q qVar3 = (q) iVar.q();
        q qVar4 = (q) iVar.r();
        q qVar5 = (q) this.f22406d[0];
        q qVar6 = (q) iVar.s(0);
        int[] j10 = bj.f.j();
        int[] h10 = bj.f.h();
        int[] h11 = bj.f.h();
        int[] h12 = bj.f.h();
        boolean h13 = qVar5.h();
        if (h13) {
            iArr2 = qVar3.f25239g;
            iArr = qVar4.f25239g;
        } else {
            p.m(qVar5.f25239g, h11);
            p.f(h11, qVar3.f25239g, h10);
            p.f(h11, qVar5.f25239g, h11);
            p.f(h11, qVar4.f25239g, h11);
            iArr2 = h10;
            iArr = h11;
        }
        boolean h14 = qVar6.h();
        if (h14) {
            iArr4 = qVar.f25239g;
            iArr3 = qVar2.f25239g;
        } else {
            p.m(qVar6.f25239g, h12);
            p.f(h12, qVar.f25239g, j10);
            p.f(h12, qVar6.f25239g, h12);
            p.f(h12, qVar2.f25239g, h12);
            iArr4 = j10;
            iArr3 = h12;
        }
        int[] h15 = bj.f.h();
        p.o(iArr4, iArr2, h15);
        p.o(iArr3, iArr, h10);
        if (bj.f.u(h15)) {
            return bj.f.u(h10) ? J() : i10.u();
        }
        p.m(h15, h11);
        int[] h16 = bj.f.h();
        p.f(h11, h15, h16);
        p.f(h11, iArr4, h11);
        p.h(h16, h16);
        bj.f.x(iArr3, h16, j10);
        p.l(bj.f.b(h11, h11, h16), h16);
        q qVar7 = new q(h12);
        p.m(h10, qVar7.f25239g);
        int[] iArr5 = qVar7.f25239g;
        p.o(iArr5, h16, iArr5);
        q qVar8 = new q(h16);
        p.o(h11, qVar7.f25239g, qVar8.f25239g);
        p.g(qVar8.f25239g, h10, j10);
        p.k(j10, qVar8.f25239g);
        q qVar9 = new q(h15);
        if (!h13) {
            int[] iArr6 = qVar9.f25239g;
            p.f(iArr6, qVar5.f25239g, iArr6);
        }
        if (!h14) {
            int[] iArr7 = qVar9.f25239g;
            p.f(iArr7, qVar6.f25239g, iArr7);
        }
        return new r(i10, qVar7, qVar8, new ti.f[]{qVar9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new r(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new r(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
