package gg;
/* loaded from: classes3.dex */
public class a2 extends j0 {
    public a2(int i10, int i11, int i12, g gVar) {
        super(i10, i11, i12, gVar);
    }

    public a2(int i10, g gVar) {
        super(true, i10, gVar);
    }

    public a2(boolean z10, int i10, g gVar) {
        super(z10, i10, gVar);
    }

    @Override // gg.j0
    d0 U(a0 a0Var) {
        return new x1(a0Var);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        a0 w9 = this.f10840x.b().w();
        boolean S = S();
        if (z10) {
            int i10 = this.f10838d;
            if (S || w9.n()) {
                i10 |= 32;
            }
            yVar.t(true, i10, this.f10839q);
        }
        if (S) {
            yVar.k(w9.q(true));
        }
        w9.m(yVar.d(), S);
    }

    @Override // gg.a0
    public boolean n() {
        return S() || this.f10840x.b().w().n();
    }

    @Override // gg.a0
    public int q(boolean z10) {
        a0 w9 = this.f10840x.b().w();
        boolean S = S();
        int q10 = w9.q(S);
        if (S) {
            q10 += y.f(q10);
        }
        return q10 + (z10 ? y.h(this.f10839q) : 0);
    }

    @Override // gg.j0, gg.a0
    public a0 w() {
        return this;
    }

    @Override // gg.j0, gg.a0
    public a0 z() {
        return this;
    }
}
