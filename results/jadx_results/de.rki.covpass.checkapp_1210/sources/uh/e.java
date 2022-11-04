package uh;

import org.bouncycastle.crypto.u;
import org.bouncycastle.crypto.y;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class e implements y {

    /* renamed from: a */
    private final vh.n f23696a;

    /* renamed from: b */
    private final int f23697b = 128;

    public e(vh.n nVar) {
        this.f23696a = nVar;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        try {
            return this.f23696a.doFinal(bArr, i10);
        } catch (u e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23696a.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23697b / 8;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            this.f23696a.init(true, new zh.a((b1) f1Var.b(), this.f23697b, f1Var.a()));
            return;
        }
        throw new IllegalArgumentException("GMAC requires ParametersWithIV");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23696a.m();
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23696a.j(b10);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        this.f23696a.a(bArr, i10, i11);
    }
}
