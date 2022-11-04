package nh;
/* loaded from: classes3.dex */
public class g extends e {

    /* renamed from: m */
    private static final byte[] f17177m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public g() {
        super(f17177m);
    }

    public g(g gVar) {
        super(f17177m);
        b(gVar);
    }

    @Override // ak.i
    public ak.i a() {
        return new g(this);
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 64;
    }
}
