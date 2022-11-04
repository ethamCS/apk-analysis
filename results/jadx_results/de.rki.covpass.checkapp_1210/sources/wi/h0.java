package wi;

import ti.i;
/* loaded from: classes3.dex */
public class h0 extends i.c {
    public h0(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public h0(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
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
        g0 g0Var = (g0) this.f22405c;
        if (g0Var.i()) {
            return i10.u();
        }
        g0 g0Var2 = (g0) this.f22404b;
        g0 g0Var3 = (g0) this.f22406d[0];
        int[] i11 = bj.h.i();
        f0.m(g0Var.f25152g, i11);
        int[] i12 = bj.h.i();
        f0.m(i11, i12);
        int[] i13 = bj.h.i();
        f0.m(g0Var2.f25152g, i13);
        f0.l(bj.h.b(i13, i13, i13), i13);
        f0.f(i11, g0Var2.f25152g, i11);
        f0.l(bj.n.M(8, i11, 2, 0), i11);
        int[] i14 = bj.h.i();
        f0.l(bj.n.N(8, i12, 3, 0, i14), i14);
        g0 g0Var4 = new g0(i12);
        f0.m(i13, g0Var4.f25152g);
        int[] iArr = g0Var4.f25152g;
        f0.o(iArr, i11, iArr);
        int[] iArr2 = g0Var4.f25152g;
        f0.o(iArr2, i11, iArr2);
        g0 g0Var5 = new g0(i11);
        f0.o(i11, g0Var4.f25152g, g0Var5.f25152g);
        int[] iArr3 = g0Var5.f25152g;
        f0.f(iArr3, i13, iArr3);
        int[] iArr4 = g0Var5.f25152g;
        f0.o(iArr4, i14, iArr4);
        g0 g0Var6 = new g0(i13);
        f0.p(g0Var.f25152g, g0Var6.f25152g);
        if (!g0Var3.h()) {
            int[] iArr5 = g0Var6.f25152g;
            f0.f(iArr5, g0Var3.f25152g, iArr5);
        }
        return new h0(i10, g0Var4, g0Var5, new ti.f[]{g0Var6});
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
        g0 g0Var = (g0) this.f22404b;
        g0 g0Var2 = (g0) this.f22405c;
        g0 g0Var3 = (g0) iVar.q();
        g0 g0Var4 = (g0) iVar.r();
        g0 g0Var5 = (g0) this.f22406d[0];
        g0 g0Var6 = (g0) iVar.s(0);
        int[] k10 = bj.h.k();
        int[] i11 = bj.h.i();
        int[] i12 = bj.h.i();
        int[] i13 = bj.h.i();
        boolean h10 = g0Var5.h();
        if (h10) {
            iArr2 = g0Var3.f25152g;
            iArr = g0Var4.f25152g;
        } else {
            f0.m(g0Var5.f25152g, i12);
            f0.f(i12, g0Var3.f25152g, i11);
            f0.f(i12, g0Var5.f25152g, i12);
            f0.f(i12, g0Var4.f25152g, i12);
            iArr2 = i11;
            iArr = i12;
        }
        boolean h11 = g0Var6.h();
        if (h11) {
            iArr4 = g0Var.f25152g;
            iArr3 = g0Var2.f25152g;
        } else {
            f0.m(g0Var6.f25152g, i13);
            f0.f(i13, g0Var.f25152g, k10);
            f0.f(i13, g0Var6.f25152g, i13);
            f0.f(i13, g0Var2.f25152g, i13);
            iArr4 = k10;
            iArr3 = i13;
        }
        int[] i14 = bj.h.i();
        f0.o(iArr4, iArr2, i14);
        f0.o(iArr3, iArr, i11);
        if (bj.h.v(i14)) {
            return bj.h.v(i11) ? J() : i10.u();
        }
        f0.m(i14, i12);
        int[] i15 = bj.h.i();
        f0.f(i12, i14, i15);
        f0.f(i12, iArr4, i12);
        f0.h(i15, i15);
        bj.h.y(iArr3, i15, k10);
        f0.l(bj.h.b(i12, i12, i15), i15);
        g0 g0Var7 = new g0(i13);
        f0.m(i11, g0Var7.f25152g);
        int[] iArr5 = g0Var7.f25152g;
        f0.o(iArr5, i15, iArr5);
        g0 g0Var8 = new g0(i15);
        f0.o(i12, g0Var7.f25152g, g0Var8.f25152g);
        f0.g(g0Var8.f25152g, i11, k10);
        f0.k(k10, g0Var8.f25152g);
        g0 g0Var9 = new g0(i14);
        if (!h10) {
            int[] iArr6 = g0Var9.f25152g;
            f0.f(iArr6, g0Var5.f25152g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = g0Var9.f25152g;
            f0.f(iArr7, g0Var6.f25152g, iArr7);
        }
        return new h0(i10, g0Var7, g0Var8, new ti.f[]{g0Var9});
    }

    @Override // ti.i
    protected ti.i d() {
        return new h0(null, f(), g());
    }

    @Override // ti.i
    public ti.i z() {
        return u() ? this : new h0(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
