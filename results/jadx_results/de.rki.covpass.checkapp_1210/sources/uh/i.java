package uh;

import org.bouncycastle.crypto.u;
import org.bouncycastle.crypto.y;
import vh.t;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class i implements y {

    /* renamed from: a */
    private final t f23723a;

    /* renamed from: b */
    private final int f23724b;

    public i(t tVar, int i10) {
        this.f23723a = tVar;
        this.f23724b = i10;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        try {
            return this.f23723a.doFinal(bArr, i10);
        } catch (u e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23723a.getUnderlyingCipher().getAlgorithmName() + "-KGMAC";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23724b / 8;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            this.f23723a.init(true, new zh.a((b1) f1Var.b(), this.f23724b, f1Var.a()));
            return;
        }
        throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23723a.g();
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23723a.f(b10);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        this.f23723a.a(bArr, i10, i11);
    }
}
