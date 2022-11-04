package nh;
/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: m */
    private static final byte[] f17156m = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public f() {
        super(f17156m);
    }

    public f(f fVar) {
        super(f17156m);
        b(fVar);
    }

    @Override // ak.i
    public ak.i a() {
        return new f(this);
    }

    @Override // nh.e, org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i10, 32);
        return 32;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 32;
    }
}
