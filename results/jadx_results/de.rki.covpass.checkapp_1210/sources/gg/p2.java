package gg;
/* loaded from: classes3.dex */
public class p2 extends j0 {
    public p2(int i10, int i11, int i12, g gVar) {
        super(i10, i11, i12, gVar);
    }

    public p2(boolean z10, int i10, g gVar) {
        super(z10, i10, gVar);
    }

    @Override // gg.j0
    d0 U(a0 a0Var) {
        return new l2(a0Var);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        a0 z11 = this.f10840x.b().z();
        boolean S = S();
        if (z10) {
            int i10 = this.f10838d;
            if (S || z11.n()) {
                i10 |= 32;
            }
            yVar.t(true, i10, this.f10839q);
        }
        if (S) {
            yVar.k(z11.q(true));
        }
        z11.m(yVar.e(), S);
    }

    @Override // gg.a0
    public boolean n() {
        return S() || this.f10840x.b().z().n();
    }

    @Override // gg.a0
    public int q(boolean z10) {
        a0 z11 = this.f10840x.b().z();
        boolean S = S();
        int q10 = z11.q(S);
        if (S) {
            q10 += y.f(q10);
        }
        return q10 + (z10 ? y.h(this.f10839q) : 0);
    }

    @Override // gg.j0, gg.a0
    public a0 z() {
        return this;
    }
}
