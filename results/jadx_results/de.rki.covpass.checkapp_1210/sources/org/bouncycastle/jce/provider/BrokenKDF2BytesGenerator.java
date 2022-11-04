package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.p;
import org.bouncycastle.crypto.q;
import org.bouncycastle.crypto.r;
import zh.a1;
/* loaded from: classes3.dex */
public class BrokenKDF2BytesGenerator implements p {
    private r digest;
    private byte[] iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(r rVar) {
        this.digest = rVar;
    }

    @Override // org.bouncycastle.crypto.p
    public int generateBytes(byte[] bArr, int i10, int i11) {
        if (bArr.length - i11 >= i10) {
            long j10 = i11 * 8;
            if (j10 > this.digest.getDigestSize() * 8 * 2147483648L) {
                throw new IllegalArgumentException("Output length too large");
            }
            int digestSize = (int) (j10 / this.digest.getDigestSize());
            int digestSize2 = this.digest.getDigestSize();
            byte[] bArr2 = new byte[digestSize2];
            for (int i12 = 1; i12 <= digestSize; i12++) {
                r rVar = this.digest;
                byte[] bArr3 = this.shared;
                rVar.update(bArr3, 0, bArr3.length);
                this.digest.update((byte) (i12 & 255));
                this.digest.update((byte) ((i12 >> 8) & 255));
                this.digest.update((byte) ((i12 >> 16) & 255));
                this.digest.update((byte) ((i12 >> 24) & 255));
                r rVar2 = this.digest;
                byte[] bArr4 = this.iv;
                rVar2.update(bArr4, 0, bArr4.length);
                this.digest.doFinal(bArr2, 0);
                int i13 = i11 - i10;
                if (i13 > digestSize2) {
                    System.arraycopy(bArr2, 0, bArr, i10, digestSize2);
                    i10 += digestSize2;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i10, i13);
                }
            }
            this.digest.reset();
            return i11;
        }
        throw new a0("output buffer too small");
    }

    public r getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.p
    public void init(q qVar) {
        if (qVar instanceof a1) {
            a1 a1Var = (a1) qVar;
            this.shared = a1Var.b();
            this.iv = a1Var.a();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
