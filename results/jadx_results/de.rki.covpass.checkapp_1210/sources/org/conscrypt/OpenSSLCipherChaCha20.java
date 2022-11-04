package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import org.conscrypt.OpenSSLCipher;
/* loaded from: classes3.dex */
public class OpenSSLCipherChaCha20 extends OpenSSLCipher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BLOCK_SIZE_BYTES = 64;
    private static final int NONCE_SIZE_BYTES = 12;
    private int currentBlockConsumedBytes = 0;
    private int blockCounter = 0;

    private void reset() {
        this.blockCounter = 0;
        this.currentBlockConsumedBytes = 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i10) {
        if (i10 == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i10 + " bytes (must be 32)");
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode == OpenSSLCipher.Mode.NONE) {
            return;
        }
        throw new NoSuchAlgorithmException("Mode must be NONE");
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding == OpenSSLCipher.Padding.NOPADDING) {
            return;
        }
        throw new NoSuchPaddingException("Must be NoPadding");
    }

    @Override // org.conscrypt.OpenSSLCipher
    int doFinalInternal(byte[] bArr, int i10, int i11) {
        reset();
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
            if (ivParameterSpec.getIV().length != 12) {
                throw new InvalidAlgorithmParameterException("IV must be 12 bytes long");
            }
            this.iv = ivParameterSpec.getIV();
        } else if (!isEncrypting()) {
            throw new InvalidAlgorithmParameterException("IV must be specified when decrypting");
        } else {
            byte[] bArr2 = new byte[12];
            this.iv = bArr2;
            if (secureRandom != null) {
                secureRandom.nextBytes(bArr2);
            } else {
                NativeCrypto.RAND_bytes(bArr2);
            }
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForFinal(int i10) {
        return i10;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForUpdate(int i10) {
        return i10;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int updateInternal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (i11 <= bArr2.length - i12) {
            int i17 = this.currentBlockConsumedBytes;
            if (i17 > 0) {
                int min = Math.min(64 - i17, i11);
                byte[] bArr3 = new byte[64];
                byte[] bArr4 = new byte[64];
                System.arraycopy(bArr, i10, bArr3, this.currentBlockConsumedBytes, min);
                NativeCrypto.chacha20_encrypt_decrypt(bArr3, 0, bArr4, 0, 64, this.encodedKey, this.iv, this.blockCounter);
                System.arraycopy(bArr4, this.currentBlockConsumedBytes, bArr2, i12, min);
                int i18 = this.currentBlockConsumedBytes + min;
                this.currentBlockConsumedBytes = i18;
                if (i18 < 64) {
                    return min;
                }
                this.currentBlockConsumedBytes = 0;
                int i19 = i10 + min;
                int i20 = i12 + min;
                int i21 = i11 - min;
                this.blockCounter++;
                i14 = i20;
                i15 = i19;
                i16 = i21;
            } else {
                i15 = i10;
                i16 = i11;
                i14 = i12;
            }
            NativeCrypto.chacha20_encrypt_decrypt(bArr, i15, bArr2, i14, i16, this.encodedKey, this.iv, this.blockCounter);
            this.currentBlockConsumedBytes = i16 % 64;
            this.blockCounter += i16 / 64;
            return i11;
        }
        throw new ShortBufferWithoutStackTraceException("Insufficient output space");
    }
}
