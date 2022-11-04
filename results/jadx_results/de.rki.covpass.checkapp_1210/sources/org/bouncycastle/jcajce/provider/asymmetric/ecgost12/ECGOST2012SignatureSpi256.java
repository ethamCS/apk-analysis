package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import di.g;
import hh.n0;
import hh.z0;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import nh.f;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import qi.a;
import qi.c;
import zg.q;
import zh.b;
import zh.b0;
import zh.g1;
/* loaded from: classes3.dex */
public class ECGOST2012SignatureSpi256 extends SignatureSpi implements q, z0 {
    private int size = 64;
    private int halfSize = 64 / 2;
    private r digest = new f();
    private n signer = new g();

    static b generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        if (privateKey instanceof a) {
            b0 b0Var = (b0) ECUtil.generatePrivateKeyParameter(privateKey);
            if (b0Var.b().e().bitLength() > 256) {
                throw new InvalidKeyException("key out of range for ECGOST-2012-256");
            }
            this.digest.reset();
            SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
            if (secureRandom != null) {
                this.signer.init(true, new g1(b0Var, secureRandom));
                return;
            } else {
                this.signer.init(true, b0Var);
                return;
            }
        }
        throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        b0 b0Var;
        if (publicKey instanceof c) {
            b0Var = (b0) generatePublicKeyParameter(publicKey);
        } else {
            try {
                b0Var = (b0) ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(n0.n(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (b0Var.b().e().bitLength() <= 256) {
            this.digest.reset();
            this.signer.init(false, b0Var);
            return;
        }
        throw new InvalidKeyException("key out of range for ECGOST-2012-256");
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
    protected byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.size];
            BigInteger[] a10 = this.signer.a(bArr);
            byte[] byteArray = a10[0].toByteArray();
            byte[] byteArray2 = a10[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.halfSize - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.halfSize - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.size - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.size - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
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
    protected boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            int i10 = this.halfSize;
            byte[] bArr3 = new byte[i10];
            byte[] bArr4 = new byte[i10];
            System.arraycopy(bArr, 0, bArr4, 0, i10);
            int i11 = this.halfSize;
            System.arraycopy(bArr, i11, bArr3, 0, i11);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.b(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
