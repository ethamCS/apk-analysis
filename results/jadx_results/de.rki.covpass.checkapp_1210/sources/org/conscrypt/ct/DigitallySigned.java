package org.conscrypt.ct;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class DigitallySigned {
    private final HashAlgorithm hashAlgorithm;
    private final byte[] signature;
    private final SignatureAlgorithm signatureAlgorithm;

    /* loaded from: classes3.dex */
    public enum HashAlgorithm {
        NONE,
        MD5,
        SHA1,
        SHA224,
        SHA256,
        SHA384,
        SHA512;
        
        private static HashAlgorithm[] values = values();

        public static HashAlgorithm valueOf(int i10) {
            try {
                return values[i10];
            } catch (IndexOutOfBoundsException e10) {
                throw new IllegalArgumentException("Invalid hash algorithm " + i10, e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum SignatureAlgorithm {
        ANONYMOUS,
        RSA,
        DSA,
        ECDSA;
        
        private static SignatureAlgorithm[] values = values();

        public static SignatureAlgorithm valueOf(int i10) {
            try {
                return values[i10];
            } catch (IndexOutOfBoundsException e10) {
                throw new IllegalArgumentException("Invalid signature algorithm " + i10, e10);
            }
        }
    }

    public DigitallySigned(int i10, int i11, byte[] bArr) {
        this(HashAlgorithm.valueOf(i10), SignatureAlgorithm.valueOf(i11), bArr);
    }

    public DigitallySigned(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this.hashAlgorithm = hashAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
        this.signature = bArr;
    }

    public static DigitallySigned decode(InputStream inputStream) {
        try {
            return new DigitallySigned(Serialization.readNumber(inputStream, 1), Serialization.readNumber(inputStream, 1), Serialization.readVariableBytes(inputStream, 2));
        } catch (IllegalArgumentException e10) {
            throw new SerializationException(e10);
        }
    }

    public static DigitallySigned decode(byte[] bArr) {
        return decode(new ByteArrayInputStream(bArr));
    }

    public String getAlgorithm() {
        return String.format("%swith%s", this.hashAlgorithm, this.signatureAlgorithm);
    }

    public HashAlgorithm getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public SignatureAlgorithm getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }
}
