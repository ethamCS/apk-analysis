package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
/* loaded from: classes3.dex */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        long j10;
        long j11;
        Throwable th2;
        IOException e10;
        long j12 = 0;
        try {
            try {
                j11 = NativeCrypto.asn1_write_init();
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                long asn1_write_sequence = NativeCrypto.asn1_write_sequence(j11);
                try {
                    OAEPParameters.writeHashAndMgfHash(asn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                    if (this.spec.getSaltLength() != 20) {
                        try {
                            j12 = NativeCrypto.asn1_write_tag(asn1_write_sequence, 2);
                            NativeCrypto.asn1_write_uint64(j12, this.spec.getSaltLength());
                            NativeCrypto.asn1_write_flush(asn1_write_sequence);
                            NativeCrypto.asn1_write_free(j12);
                        } catch (Throwable th4) {
                            NativeCrypto.asn1_write_flush(asn1_write_sequence);
                            NativeCrypto.asn1_write_free(j12);
                            throw th4;
                        }
                    }
                    byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j11);
                    NativeCrypto.asn1_write_free(asn1_write_sequence);
                    NativeCrypto.asn1_write_free(j11);
                    return asn1_write_finish;
                } catch (IOException e11) {
                    e10 = e11;
                    NativeCrypto.asn1_write_cleanup(j11);
                    throw e10;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th5) {
                th2 = th5;
                j10 = 0;
                NativeCrypto.asn1_write_free(j10);
                NativeCrypto.asn1_write_free(j11);
                throw th2;
            }
        } catch (IOException e13) {
            e10 = e13;
            j11 = 0;
        } catch (Throwable th6) {
            j10 = 0;
            th2 = th6;
            j11 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1") || str.equals("X.509")) {
            return engineGetEncoded();
        }
        throw new IOException("Unsupported format: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (cls == null || cls != PSSParameterSpec.class) {
            throw new InvalidParameterSpecException("Unsupported class: " + cls);
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            this.spec = (PSSParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        Throwable th2;
        long j10;
        long asn1_read_sequence;
        int i10;
        Throwable th3;
        long j11 = 0;
        try {
            j10 = NativeCrypto.asn1_read_init(bArr);
            try {
                asn1_read_sequence = NativeCrypto.asn1_read_sequence(j10);
                i10 = 20;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            j10 = 0;
        }
        try {
            String readHash = OAEPParameters.readHash(asn1_read_sequence);
            String readMgfHash = OAEPParameters.readMgfHash(asn1_read_sequence);
            if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                try {
                    long asn1_read_tagged = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                    try {
                        i10 = (int) NativeCrypto.asn1_read_uint64(asn1_read_tagged);
                        NativeCrypto.asn1_read_free(asn1_read_tagged);
                    } catch (Throwable th6) {
                        th3 = th6;
                        j11 = asn1_read_tagged;
                        NativeCrypto.asn1_read_free(j11);
                        throw th3;
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            int i11 = i10;
            if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 3)) {
                long asn1_read_tagged2 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                long asn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(asn1_read_tagged2);
                NativeCrypto.asn1_read_free(asn1_read_tagged2);
                if (asn1_read_uint64 != 1) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
            }
            if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(j10)) {
                throw new IOException("Error reading ASN.1 encoding");
            }
            this.spec = new PSSParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), i11, 1);
            NativeCrypto.asn1_read_free(asn1_read_sequence);
            NativeCrypto.asn1_read_free(j10);
        } catch (Throwable th8) {
            th2 = th8;
            j11 = asn1_read_sequence;
            NativeCrypto.asn1_read_free(j11);
            NativeCrypto.asn1_read_free(j10);
            throw th2;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1") || str.equals("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unsupported format: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }
}
