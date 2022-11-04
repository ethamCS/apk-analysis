package gg;
/* loaded from: classes3.dex */
public class a1 extends d0 {
    public a1() {
    }

    public a1(g gVar) {
        super(gVar);
    }

    public a1(h hVar) {
        super(hVar);
    }

    public a1(g[] gVarArr) {
        super(gVarArr);
    }

    @Override // gg.d0
    public c J() {
        return new v0(C());
    }

    @Override // gg.d0
    public k K() {
        return ((d0) z()).K();
    }

    @Override // gg.d0
    public w L() {
        return new y0(D());
    }

    @Override // gg.d0
    public e0 M() {
        return new c1(false, N());
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.r(z10, 48, this.f10795c);
    }

    @Override // gg.a0
    public int q(boolean z10) {
        int i10 = z10 ? 4 : 3;
        int length = this.f10795c.length;
        for (int i11 = 0; i11 < length; i11++) {
            i10 += this.f10795c[i11].b().q(true);
        }
        return i10;
    }
}
