package gg;
/* loaded from: classes3.dex */
public class e1 extends j0 {
    public e1(int i10, int i11, int i12, g gVar) {
        super(i10, i11, i12, gVar);
    }

    public e1(int i10, g gVar) {
        super(true, i10, gVar);
    }

    public e1(boolean z10, int i10, g gVar) {
        super(z10, i10, gVar);
    }

    @Override // gg.j0
    d0 U(a0 a0Var) {
        return new a1(a0Var);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        a0 b10 = this.f10840x.b();
        boolean S = S();
        if (z10) {
            int i10 = this.f10838d;
            if (S || b10.n()) {
                i10 |= 32;
            }
            yVar.t(true, i10, this.f10839q);
        }
        if (!S) {
            b10.m(yVar, false);
            return;
        }
        yVar.i(128);
        b10.m(yVar, true);
        yVar.i(0);
        yVar.i(0);
    }

    @Override // gg.a0
    public boolean n() {
        return S() || this.f10840x.b().n();
    }

    @Override // gg.a0
    public int q(boolean z10) {
        a0 b10 = this.f10840x.b();
        boolean S = S();
        int q10 = b10.q(S);
        if (S) {
            q10 += 3;
        }
        return q10 + (z10 ? y.h(this.f10839q) : 0);
    }
}
