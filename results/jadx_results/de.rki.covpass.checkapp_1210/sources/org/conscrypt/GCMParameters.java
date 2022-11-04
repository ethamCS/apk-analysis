package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
/* loaded from: classes3.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;
    private byte[] iv;
    private int tLen;

    public GCMParameters() {
    }

    public GCMParameters(int i10, byte[] bArr) {
        this.tLen = i10;
        this.iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        IOException e10;
        long j10;
        long j11;
        int i10;
        long j12 = 0;
        try {
            j11 = NativeCrypto.asn1_write_init();
            try {
                j12 = NativeCrypto.asn1_write_sequence(j11);
                NativeCrypto.asn1_write_octetstring(j12, this.iv);
                if (this.tLen != 96) {
                    NativeCrypto.asn1_write_uint64(j12, i10 / 8);
                }
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j11);
                NativeCrypto.asn1_write_free(j12);
                NativeCrypto.asn1_write_free(j11);
                return asn1_write_finish;
            } catch (IOException e11) {
                e10 = e11;
                long j13 = j12;
                j12 = j11;
                j10 = j13;
                try {
                    NativeCrypto.asn1_write_cleanup(j12);
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    long j14 = j12;
                    j12 = j10;
                    j11 = j14;
                    NativeCrypto.asn1_write_free(j12);
                    NativeCrypto.asn1_write_free(j11);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_write_free(j12);
                NativeCrypto.asn1_write_free(j11);
                throw th;
            }
        } catch (IOException e12) {
            e10 = e12;
            j10 = 0;
        } catch (Throwable th4) {
            th = th4;
            j11 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        throw new IOException("Unsupported format: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (cls == null || !cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            throw new InvalidParameterSpecException("Unsupported class: " + cls);
        }
        return cls.cast(Platform.toGCMParameterSpec(this.tLen, this.iv));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (fromGCMParameterSpec != null) {
            this.tLen = fromGCMParameterSpec.tLen;
            this.iv = fromGCMParameterSpec.iv;
            return;
        }
        throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        Throwable th2;
        long j10;
        try {
            j10 = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j10);
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(asn1_read_sequence);
                int i10 = 96;
                if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence)) {
                    i10 = ((int) NativeCrypto.asn1_read_uint64(asn1_read_sequence)) * 8;
                }
                if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(j10)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                this.iv = asn1_read_octetstring;
                this.tLen = i10;
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j10);
            } catch (Throwable th3) {
                th2 = th3;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(j10);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            j10 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unsupported format: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    public byte[] getIV() {
        return this.iv;
    }

    public int getTLen() {
        return this.tLen;
    }
}
