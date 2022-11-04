package gg;
/* loaded from: classes3.dex */
public class c1 extends e0 {
    public c1() {
    }

    public c1(h hVar) {
        super(hVar, false);
    }

    public c1(boolean z10, g[] gVarArr) {
        super(z10, gVarArr);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.r(z10, 49, this.f10804c);
    }

    @Override // gg.a0
    public int q(boolean z10) {
        int i10 = z10 ? 4 : 3;
        int length = this.f10804c.length;
        for (int i11 = 0; i11 < length; i11++) {
            i10 += this.f10804c[i11].b().q(true);
        }
        return i10;
    }
}
