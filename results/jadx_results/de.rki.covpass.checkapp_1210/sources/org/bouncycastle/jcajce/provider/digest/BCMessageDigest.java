package org.bouncycastle.jcajce.provider.digest;

import java.security.DigestException;
import java.security.MessageDigest;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
public class BCMessageDigest extends MessageDigest {
    protected r digest;
    protected int digestSize;

    public BCMessageDigest(r rVar) {
        super(rVar.getAlgorithmName());
        this.digest = rVar;
        this.digestSize = rVar.getDigestSize();
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i10, int i11) {
        int i12 = this.digestSize;
        if (i11 >= i12) {
            if (bArr.length - i10 < i12) {
                throw new DigestException("insufficient space in the output buffer to store the digest");
            }
            this.digest.doFinal(bArr, i10);
            return this.digestSize;
        }
        throw new DigestException("partial digests not returned");
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b10) {
        this.digest.update(b10);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }
}
