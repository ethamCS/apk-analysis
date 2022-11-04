package nh;

import org.bouncycastle.crypto.j0;
/* loaded from: classes3.dex */
public class c0 extends l implements j0 {
    public c0() {
        this(128);
    }

    public c0(int i10) {
        super(l(i10));
    }

    public c0(c0 c0Var) {
        super(c0Var);
    }

    private static int l(int i10) {
        if (i10 == 128 || i10 == 256) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHAKE");
    }

    @Override // org.bouncycastle.crypto.j0
    public int c(byte[] bArr, int i10, int i11) {
        int m10 = m(bArr, i10, i11);
        reset();
        return m10;
    }

    @Override // nh.l, org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        return c(bArr, i10, getDigestSize());
    }

    @Override // nh.l, org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHAKE" + this.f17224e;
    }

    @Override // nh.l, org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17224e / 4;
    }

    public int m(byte[] bArr, int i10, int i11) {
        if (!this.f17225f) {
            g(15, 4);
        }
        k(bArr, i10, i11 * 8);
        return i11;
    }
}
