package qh;
/* loaded from: classes3.dex */
public class l extends u0 {
    @Override // qh.u0
    protected void a() {
        int[] iArr = this.f20196c;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 != 0) {
            return;
        }
        throw new IllegalStateException("attempt to increase counter past 2^32.");
    }

    @Override // qh.u0
    protected void b(byte[] bArr) {
        m.j(this.f20194a, this.f20196c, this.f20197d);
        ak.l.j(this.f20197d, bArr, 0);
    }

    @Override // qh.u0
    protected int c() {
        return 12;
    }

    @Override // qh.u0
    protected void f() {
        this.f20196c[12] = 0;
    }

    @Override // qh.u0, org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // qh.u0
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 256 bit key");
            }
            e(bArr.length, this.f20196c, 0);
            ak.l.n(bArr, 0, this.f20196c, 4, 8);
        }
        ak.l.n(bArr2, 0, this.f20196c, 13, 3);
    }
}
