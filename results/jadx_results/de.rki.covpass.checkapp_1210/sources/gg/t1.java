package gg;
/* loaded from: classes3.dex */
public class t1 extends w {
    public t1(g gVar) {
        super(gVar.b().k("DER"));
    }

    public t1(byte[] bArr) {
        super(bArr);
    }

    public static void G(y yVar, boolean z10, byte[] bArr, int i10, int i11) {
        yVar.p(z10, 4, bArr, i10, i11);
    }

    public static int H(boolean z10, int i10) {
        return y.g(z10, i10);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 4, this.f10910c);
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, this.f10910c.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.w, gg.a0
    public a0 w() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.w, gg.a0
    public a0 z() {
        return this;
    }
}
