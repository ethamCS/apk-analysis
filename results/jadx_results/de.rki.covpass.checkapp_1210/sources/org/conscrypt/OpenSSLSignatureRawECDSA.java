package org.conscrypt;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
/* loaded from: classes3.dex */
public class OpenSSLSignatureRawECDSA extends SignatureSpi {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 408) {
            return openSSLKey;
        }
        throw new InvalidKeyException("Non-EC key used to initialize EC signature.");
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        this.key = verifyKey(OpenSSLKey.fromPrivateKey(privateKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        this.key = verifyKey(OpenSSLKey.fromPublicKey(publicKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey != null) {
            int ECDSA_size = NativeCrypto.ECDSA_size(openSSLKey.getNativeRef());
            byte[] bArr = new byte[ECDSA_size];
            try {
                try {
                    int ECDSA_sign = NativeCrypto.ECDSA_sign(this.buffer.toByteArray(), bArr, this.key.getNativeRef());
                    if (ECDSA_sign < 0) {
                        throw new SignatureException("Could not compute signature.");
                    }
                    if (ECDSA_sign != ECDSA_size) {
                        byte[] bArr2 = new byte[ECDSA_sign];
                        System.arraycopy(bArr, 0, bArr2, 0, ECDSA_sign);
                        bArr = bArr2;
                    }
                    return bArr;
                } catch (Exception e10) {
                    throw new SignatureException(e10);
                }
            } finally {
                this.buffer.reset();
            }
        }
        throw new SignatureException("No key provided");
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b10) {
        this.buffer.write(b10);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.buffer.write(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        if (this.key != null) {
            try {
                try {
                    int ECDSA_verify = NativeCrypto.ECDSA_verify(this.buffer.toByteArray(), bArr, this.key.getNativeRef());
                    if (ECDSA_verify == -1) {
                        throw new SignatureException("Could not verify signature.");
                    }
                    boolean z10 = true;
                    if (ECDSA_verify != 1) {
                        z10 = false;
                    }
                    return z10;
                } catch (Exception e10) {
                    throw new SignatureException(e10);
                }
            } finally {
                this.buffer.reset();
            }
        }
        throw new SignatureException("No key provided");
    }
}
