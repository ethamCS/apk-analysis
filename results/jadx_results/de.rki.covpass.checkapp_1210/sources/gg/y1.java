package gg;
/* loaded from: classes3.dex */
public class y1 extends e0 {

    /* renamed from: x */
    private int f10922x = -1;

    public y1() {
    }

    public y1(g gVar) {
        super(gVar);
    }

    public y1(h hVar) {
        super(hVar, true);
    }

    public y1(boolean z10, g[] gVarArr) {
        super(L(z10), gVarArr);
    }

    public y1(g[] gVarArr) {
        super(gVarArr, true);
    }

    private static boolean L(boolean z10) {
        if (z10) {
            return z10;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int M() {
        if (this.f10922x < 0) {
            int length = this.f10804c.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f10804c[i11].b().w().q(true);
            }
            this.f10922x = i10;
        }
        return this.f10922x;
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.s(z10, 49);
        v1 d10 = yVar.d();
        int length = this.f10804c.length;
        int i10 = 0;
        if (this.f10922x >= 0 || length > 16) {
            yVar.k(M());
            while (i10 < length) {
                this.f10804c[i10].b().w().m(d10, true);
                i10++;
            }
            return;
        }
        a0[] a0VarArr = new a0[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            a0 w9 = this.f10804c[i12].b().w();
            a0VarArr[i12] = w9;
            i11 += w9.q(true);
        }
        this.f10922x = i11;
        yVar.k(i11);
        while (i10 < length) {
            a0VarArr[i10].m(d10, true);
            i10++;
        }
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, M());
    }

    @Override // gg.e0, gg.a0
    public a0 w() {
        return this.f10805d ? this : super.w();
    }

    @Override // gg.e0, gg.a0
    public a0 z() {
        return this;
    }
}
