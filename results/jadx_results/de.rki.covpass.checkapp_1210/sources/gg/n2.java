package gg;
/* loaded from: classes3.dex */
public class n2 extends e0 {

    /* renamed from: x */
    private int f10865x = -1;

    public n2() {
    }

    public n2(h hVar) {
        super(hVar, false);
    }

    public n2(boolean z10, g[] gVarArr) {
        super(z10, gVarArr);
    }

    private int L() {
        if (this.f10865x < 0) {
            int length = this.f10804c.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f10804c[i11].b().z().q(true);
            }
            this.f10865x = i10;
        }
        return this.f10865x;
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.s(z10, 49);
        k2 e10 = yVar.e();
        int length = this.f10804c.length;
        int i10 = 0;
        if (this.f10865x >= 0 || length > 16) {
            yVar.k(L());
            while (i10 < length) {
                e10.w(this.f10804c[i10].b(), true);
                i10++;
            }
            return;
        }
        a0[] a0VarArr = new a0[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            a0 z11 = this.f10804c[i12].b().z();
            a0VarArr[i12] = z11;
            i11 += z11.q(true);
        }
        this.f10865x = i11;
        yVar.k(i11);
        while (i10 < length) {
            e10.w(a0VarArr[i10], true);
            i10++;
        }
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, L());
    }

    @Override // gg.e0, gg.a0
    public a0 z() {
        return this;
    }
}
