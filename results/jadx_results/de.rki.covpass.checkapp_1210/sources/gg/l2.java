package gg;
/* loaded from: classes3.dex */
public class l2 extends d0 {

    /* renamed from: q */
    private int f10853q = -1;

    public l2() {
    }

    public l2(g gVar) {
        super(gVar);
    }

    public l2(h hVar) {
        super(hVar);
    }

    public l2(g[] gVarArr) {
        super(gVarArr);
    }

    public l2(g[] gVarArr, boolean z10) {
        super(gVarArr, z10);
    }

    private int O() {
        if (this.f10853q < 0) {
            int length = this.f10795c.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f10795c[i11].b().z().q(true);
            }
            this.f10853q = i10;
        }
        return this.f10853q;
    }

    @Override // gg.d0
    public c J() {
        return new g2(v0.J(C()), false);
    }

    @Override // gg.d0
    public k K() {
        return new i2(this);
    }

    @Override // gg.d0
    public w L() {
        return new t1(y0.G(D()));
    }

    @Override // gg.d0
    public e0 M() {
        return new n2(false, N());
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.s(z10, 48);
        k2 e10 = yVar.e();
        int length = this.f10795c.length;
        int i10 = 0;
        if (this.f10853q >= 0 || length > 16) {
            yVar.k(O());
            while (i10 < length) {
                e10.w(this.f10795c[i10].b(), true);
                i10++;
            }
            return;
        }
        a0[] a0VarArr = new a0[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            a0 z11 = this.f10795c[i12].b().z();
            a0VarArr[i12] = z11;
            i11 += z11.q(true);
        }
        this.f10853q = i11;
        yVar.k(i11);
        while (i10 < length) {
            e10.w(a0VarArr[i10], true);
            i10++;
        }
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, O());
    }

    @Override // gg.d0, gg.a0
    public a0 z() {
        return this;
    }
}
