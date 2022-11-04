package uh;
/* loaded from: classes3.dex */
public class m extends n {
    public m() {
    }

    public m(int i10, int i11) {
        super(i10, i11);
    }

    @Override // uh.n
    public long b() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // uh.n, org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        this.f23764i = ((this.f23764i >>> ((7 - this.f23765j) << 3)) >>> 8) | ((((this.f23766k << 3) + i11) & 255) << 56);
        c();
        this.f23762g ^= 238;
        a(this.f23757b);
        long j10 = this.f23760e;
        long j11 = this.f23761f;
        long j12 = ((j10 ^ j11) ^ this.f23762g) ^ this.f23763h;
        this.f23761f = j11 ^ 221;
        a(this.f23757b);
        reset();
        ak.l.v(j12, bArr, i10);
        ak.l.v(((this.f23760e ^ this.f23761f) ^ this.f23762g) ^ this.f23763h, bArr, i10 + 8);
        return 16;
    }

    @Override // uh.n, org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "SipHash128-" + this.f23756a + "-" + this.f23757b;
    }

    @Override // uh.n, org.bouncycastle.crypto.y
    public int getMacSize() {
        return 16;
    }

    @Override // uh.n, org.bouncycastle.crypto.y
    public void reset() {
        super.reset();
        this.f23761f ^= 238;
    }
}
