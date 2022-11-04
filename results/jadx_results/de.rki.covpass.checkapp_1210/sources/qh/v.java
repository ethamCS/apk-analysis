package qh;
/* loaded from: classes3.dex */
public class v implements org.bouncycastle.crypto.i0 {

    /* renamed from: a */
    private u f20203a = new u();

    /* renamed from: b */
    private uh.f f20204b = new uh.f();

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        int macSize = i11 - this.f20204b.getMacSize();
        byte[] bArr2 = new byte[macSize];
        this.f20203a.a(bArr, i10, bArr2, 0);
        this.f20203a.a(bArr, i10 + 8, bArr2, 8);
        this.f20203a.a(bArr, i10 + 16, bArr2, 16);
        this.f20203a.a(bArr, i10 + 24, bArr2, 24);
        byte[] bArr3 = new byte[this.f20204b.getMacSize()];
        this.f20204b.update(bArr2, 0, macSize);
        this.f20204b.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[this.f20204b.getMacSize()];
        System.arraycopy(bArr, (i10 + i11) - 4, bArr4, 0, this.f20204b.getMacSize());
        if (ak.a.u(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        this.f20204b.update(bArr, i10, i11);
        byte[] bArr2 = new byte[this.f20204b.getMacSize() + i11];
        this.f20203a.a(bArr, i10, bArr2, 0);
        this.f20203a.a(bArr, i10 + 8, bArr2, 8);
        this.f20203a.a(bArr, i10 + 16, bArr2, 16);
        this.f20203a.a(bArr, i10 + 24, bArr2, 24);
        this.f20204b.doFinal(bArr2, i11);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.g1) {
            iVar = ((zh.g1) iVar).a();
        }
        zh.i1 i1Var = (zh.i1) iVar;
        this.f20203a.init(z10, i1Var.a());
        this.f20204b.init(new zh.f1(i1Var.a(), i1Var.b()));
    }
}
