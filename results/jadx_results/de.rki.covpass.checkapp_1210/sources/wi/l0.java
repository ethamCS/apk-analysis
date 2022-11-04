package wi;

import ti.i;
/* loaded from: classes3.dex */
public class l0 extends i.c {
    public l0(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public l0(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        k0 k0Var = (k0) this.f22405c;
        if (k0Var.i()) {
            return i10.u();
        }
        k0 k0Var2 = (k0) this.f22404b;
        k0 k0Var3 = (k0) this.f22406d[0];
        int[] i11 = bj.h.i();
        int[] i12 = bj.h.i();
        int[] i13 = bj.h.i();
        j0.n(k0Var.f25190g, i13);
        int[] i14 = bj.h.i();
        j0.n(i13, i14);
        boolean h10 = k0Var3.h();
        int[] iArr = k0Var3.f25190g;
        if (!h10) {
            j0.n(iArr, i12);
            iArr = i12;
        }
        j0.q(k0Var2.f25190g, iArr, i11);
        j0.a(k0Var2.f25190g, iArr, i12);
        j0.g(i12, i11, i12);
        j0.m(bj.h.b(i12, i12, i12), i12);
        j0.g(i13, k0Var2.f25190g, i13);
        j0.m(bj.n.M(8, i13, 2, 0), i13);
        j0.m(bj.n.N(8, i14, 3, 0, i11), i11);
        k0 k0Var4 = new k0(i14);
        j0.n(i12, k0Var4.f25190g);
        int[] iArr2 = k0Var4.f25190g;
        j0.q(iArr2, i13, iArr2);
        int[] iArr3 = k0Var4.f25190g;
        j0.q(iArr3, i13, iArr3);
        k0 k0Var5 = new k0(i13);
        j0.q(i13, k0Var4.f25190g, k0Var5.f25190g);
        int[] iArr4 = k0Var5.f25190g;
        j0.g(iArr4, i12, iArr4);
        int[] iArr5 = k0Var5.f25190g;
        j0.q(iArr5, i11, iArr5);
        k0 k0Var6 = new k0(i12);
        j0.r(k0Var.f25190g, k0Var6.f25190g);
        if (!h10) {
            int[] iArr6 = k0Var6.f25190g;
            j0.g(iArr6, k0Var3.f25190g, iArr6);
        }
        return new l0(i10, k0Var4, k0Var5, new ti.f[]{k0Var6});
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
        k0 k0Var = (k0) this.f22404b;
        k0 k0Var2 = (k0) this.f22405c;
        k0 k0Var3 = (k0) iVar.q();
        k0 k0Var4 = (k0) iVar.r();
        k0 k0Var5 = (k0) this.f22406d[0];
        k0 k0Var6 = (k0) iVar.s(0);
        int[] k10 = bj.h.k();
        int[] i11 = bj.h.i();
        int[] i12 = bj.h.i();
        int[] i13 = bj.h.i();
        boolean h10 = k0Var5.h();
        if (h10) {
            iArr2 = k0Var3.f25190g;
            iArr = k0Var4.f25190g;
        } else {
            j0.n(k0Var5.f25190g, i12);
            j0.g(i12, k0Var3.f25190g, i11);
            j0.g(i12, k0Var5.f25190g, i12);
            j0.g(i12, k0Var4.f25190g, i12);
            iArr2 = i11;
            iArr = i12;
        }
        boolean h11 = k0Var6.h();
        if (h11) {
            iArr4 = k0Var.f25190g;
            iArr3 = k0Var2.f25190g;
        } else {
            j0.n(k0Var6.f25190g, i13);
            j0.g(i13, k0Var.f25190g, k10);
            j0.g(i13, k0Var6.f25190g, i13);
            j0.g(i13, k0Var2.f25190g, i13);
            iArr4 = k10;
            iArr3 = i13;
        }
        int[] i14 = bj.h.i();
        j0.q(iArr4, iArr2, i14);
        j0.q(iArr3, iArr, i11);
        if (bj.h.v(i14)) {
            return bj.h.v(i11) ? J() : i10.u();
        }
        j0.n(i14, i12);
        int[] i15 = bj.h.i();
        j0.g(i12, i14, i15);
        j0.g(i12, iArr4, i12);
        j0.i(i15, i15);
        bj.h.y(iArr3, i15, k10);
        j0.m(bj.h.b(i12, i12, i15), i15);
        k0 k0Var7 = new k0(i13);
        j0.n(i11, k0Var7.f25190g);
        int[] iArr5 = k0Var7.f25190g;
        j0.q(iArr5, i15, iArr5);
        k0 k0Var8 = new k0(i15);
        j0.q(i12, k0Var7.f25190g, k0Var8.f25190g);
        j0.h(k0Var8.f25190g, i11, k10);
        j0.l(k10, k0Var8.f25190g);
        k0 k0Var9 = new k0(i14);
        if (!h10) {
            int[] iArr6 = k0Var9.f25190g;
            j0.g(iArr6, k0Var5.f25190g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = k0Var9.f25190g;
            j0.g(iArr7, k0Var6.f25190g, iArr7);
        }
        return new l0(i10, k0Var7, k0Var8, new ti.f[]{k0Var9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new l0(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new l0(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
