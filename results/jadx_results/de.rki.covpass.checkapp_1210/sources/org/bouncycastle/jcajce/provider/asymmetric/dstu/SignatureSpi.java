package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import di.d;
import gg.a0;
import gg.t1;
import gg.w;
import hh.z0;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import zg.q;
/* loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi implements q, z0 {
    private r digest;
    private n signer = new d();

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    @Override // java.security.SignatureSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void engineInitSign(java.security.PrivateKey r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey
            if (r0 == 0) goto L18
            zh.b r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            nh.d r0 = new nh.d
            byte[] r1 = dh.d.m()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>(r1)
        L15:
            r4.digest = r0
            goto L2f
        L18:
            boolean r0 = r5 instanceof qi.a
            if (r0 == 0) goto L2e
            zh.b r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            nh.d r0 = new nh.d
            byte[] r1 = dh.d.m()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>(r1)
            goto L15
        L2e:
            r5 = 0
        L2f:
            java.security.SecureRandom r0 = r4.appRandom
            r1 = 1
            if (r0 == 0) goto L3f
            org.bouncycastle.crypto.n r2 = r4.signer
            zh.g1 r3 = new zh.g1
            r3.<init>(r5, r0)
            r2.init(r1, r3)
            goto L44
        L3f:
            org.bouncycastle.crypto.n r0 = r4.signer
            r0.init(r1, r5)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi.engineInitSign(java.security.PrivateKey):void");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        i iVar;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            iVar = bCDSTU4145PublicKey.engineGetKeyParameters();
            this.digest = new nh.d(expandSbox(bCDSTU4145PublicKey.getSbox()));
        } else {
            iVar = ECUtil.generatePublicKeyParameter(publicKey);
            this.digest = new nh.d(expandSbox(dh.d.m()));
        }
        this.signer.init(false, iVar);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] a10 = this.signer.a(bArr);
            byte[] byteArray = a10[0].toByteArray();
            byte[] byteArray2 = a10[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new t1(bArr2).getEncoded();
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b10) {
        this.digest.update(b10);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] F = ((w) a0.u(bArr)).F();
            byte[] bArr3 = new byte[F.length / 2];
            byte[] bArr4 = new byte[F.length / 2];
            System.arraycopy(F, 0, bArr4, 0, F.length / 2);
            System.arraycopy(F, F.length / 2, bArr3, 0, F.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.b(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    byte[] expandSbox(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            bArr2[i11] = (byte) ((bArr[i10] >> 4) & 15);
            bArr2[i11 + 1] = (byte) (bArr[i10] & 15);
        }
        return bArr2;
    }
}
