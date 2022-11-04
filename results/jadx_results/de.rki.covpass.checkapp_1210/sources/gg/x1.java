package gg;
/* loaded from: classes3.dex */
public class x1 extends d0 {

    /* renamed from: q */
    private int f10916q = -1;

    public x1() {
    }

    public x1(g gVar) {
        super(gVar);
    }

    public x1(h hVar) {
        super(hVar);
    }

    public x1(g[] gVarArr) {
        super(gVarArr);
    }

    public x1(g[] gVarArr, boolean z10) {
        super(gVarArr, z10);
    }

    public static x1 O(d0 d0Var) {
        return (x1) d0Var.w();
    }

    private int P() {
        if (this.f10916q < 0) {
            int length = this.f10795c.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f10795c[i11].b().w().q(true);
            }
            this.f10916q = i10;
        }
        return this.f10916q;
    }

    @Override // gg.d0
    public c J() {
        return new k1(v0.J(C()), false);
    }

    @Override // gg.d0
    public k K() {
        return new l1(this);
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
        v1 d10 = yVar.d();
        int length = this.f10795c.length;
        int i10 = 0;
        if (this.f10916q >= 0 || length > 16) {
            yVar.k(P());
            while (i10 < length) {
                this.f10795c[i10].b().w().m(d10, true);
                i10++;
            }
            return;
        }
        a0[] a0VarArr = new a0[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            a0 w9 = this.f10795c[i12].b().w();
            a0VarArr[i12] = w9;
            i11 += w9.q(true);
        }
        this.f10916q = i11;
        yVar.k(i11);
        while (i10 < length) {
            a0VarArr[i10].m(d10, true);
            i10++;
        }
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, P());
    }

    @Override // gg.d0, gg.a0
    public a0 w() {
        return this;
    }

    @Override // gg.d0, gg.a0
    public a0 z() {
        return this;
    }
}
