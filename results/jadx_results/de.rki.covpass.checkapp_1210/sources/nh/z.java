package nh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class z extends l {
    public z() {
        this((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public z(int i10) {
        super(l(i10));
    }

    public z(z zVar) {
        super(zVar);
    }

    private static int l(int i10) {
        if (i10 == 224 || i10 == 256 || i10 == 384 || i10 == 512) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHA-3");
    }

    @Override // nh.l, org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        g(2, 2);
        return super.doFinal(bArr, i10);
    }

    @Override // nh.l, org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHA3-" + this.f17224e;
    }
}
