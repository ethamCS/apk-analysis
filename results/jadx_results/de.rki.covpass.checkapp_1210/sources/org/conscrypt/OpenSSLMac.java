package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import org.conscrypt.EvpMdRef;
import org.conscrypt.NativeRef;
/* loaded from: classes3.dex */
public abstract class OpenSSLMac extends MacSpi {
    private NativeRef.HMAC_CTX ctx;
    private final long evp_md;
    private byte[] keyBytes;
    private final byte[] singleByte;
    private final int size;

    /* loaded from: classes3.dex */
    public static final class HmacMD5 extends OpenSSLMac {
        public HmacMD5() {
            super(EvpMdRef.MD5.EVP_MD, EvpMdRef.MD5.SIZE_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HmacSHA1 extends OpenSSLMac {
        public HmacSHA1() {
            super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HmacSHA224 extends OpenSSLMac {
        public HmacSHA224() {
            super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HmacSHA256 extends OpenSSLMac {
        public HmacSHA256() {
            super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HmacSHA384 extends OpenSSLMac {
        public HmacSHA384() {
            super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HmacSHA512 extends OpenSSLMac {
        public HmacSHA512() {
            super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
        }
    }

    private OpenSSLMac(long j10, int i10) {
        this.singleByte = new byte[1];
        this.evp_md = j10;
        this.size = i10;
    }

    private final void resetContext() {
        NativeRef.HMAC_CTX hmac_ctx = new NativeRef.HMAC_CTX(NativeCrypto.HMAC_CTX_new());
        byte[] bArr = this.keyBytes;
        if (bArr != null) {
            NativeCrypto.HMAC_Init_ex(hmac_ctx, bArr, this.evp_md);
        }
        this.ctx = hmac_ctx;
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] HMAC_Final = NativeCrypto.HMAC_Final(this.ctx);
        resetContext();
        return HMAC_Final;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.size;
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        if (key instanceof SecretKey) {
            if (algorithmParameterSpec != null) {
                throw new InvalidAlgorithmParameterException("unknown parameter type");
            }
            byte[] encoded = key.getEncoded();
            this.keyBytes = encoded;
            if (encoded == null) {
                throw new InvalidKeyException("key cannot be encoded");
            }
            resetContext();
            return;
        }
        throw new InvalidKeyException("key must be a SecretKey");
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        resetContext();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b10) {
        byte[] bArr = this.singleByte;
        bArr[0] = b10;
        engineUpdate(bArr, 0, 1);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        if (!byteBuffer.isDirect()) {
            super.engineUpdate(byteBuffer);
            return;
        }
        long directBufferAddress = NativeCrypto.getDirectBufferAddress(byteBuffer);
        if (directBufferAddress == 0) {
            super.engineUpdate(byteBuffer);
            return;
        }
        int position = byteBuffer.position();
        if (position < 0) {
            throw new RuntimeException("Negative position");
        }
        long j10 = directBufferAddress + position;
        int remaining = byteBuffer.remaining();
        if (remaining < 0) {
            throw new RuntimeException("Negative remaining amount");
        }
        NativeCrypto.HMAC_UpdateDirect(this.ctx, j10, remaining);
        byteBuffer.position(position + remaining);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        NativeCrypto.HMAC_Update(this.ctx, bArr, i10, i11);
    }
}
