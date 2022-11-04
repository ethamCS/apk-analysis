package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
/* loaded from: classes3.dex */
public class OAEPParameters extends AlgorithmParametersSpi {
    private static final String MGF1_OID = "1.2.840.113549.1.1.8";
    private static final Map<String, String> NAME_TO_OID = new HashMap();
    private static final Map<String, String> OID_TO_NAME;
    private static final String PSPECIFIED_OID = "1.2.840.113549.1.1.9";
    private OAEPParameterSpec spec = OAEPParameterSpec.DEFAULT;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HashMap hashMap = new HashMap();
        OID_TO_NAME = hashMap;
        hashMap.put("1.3.14.3.2.26", "SHA-1");
        hashMap.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        hashMap.put("2.16.840.1.101.3.4.2.1", "SHA-256");
        hashMap.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        hashMap.put("2.16.840.1.101.3.4.2.3", "SHA-512");
        for (Map.Entry entry : hashMap.entrySet()) {
            NAME_TO_OID.put(entry.getValue(), entry.getKey());
        }
    }

    private static String getHashName(long j10) {
        long j11;
        Throwable th2;
        try {
            j11 = NativeCrypto.asn1_read_sequence(j10);
            try {
                String asn1_read_oid = NativeCrypto.asn1_read_oid(j11);
                if (!NativeCrypto.asn1_read_is_empty(j11)) {
                    NativeCrypto.asn1_read_null(j11);
                }
                if (NativeCrypto.asn1_read_is_empty(j11)) {
                    Map<String, String> map = OID_TO_NAME;
                    if (map.containsKey(asn1_read_oid)) {
                        String str = map.get(asn1_read_oid);
                        NativeCrypto.asn1_read_free(j11);
                        return str;
                    }
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th3) {
                th2 = th3;
                NativeCrypto.asn1_read_free(j11);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            j11 = 0;
        }
    }

    public static String readHash(long j10) {
        if (NativeCrypto.asn1_read_next_tag_is(j10, 0)) {
            long j11 = 0;
            try {
                j11 = NativeCrypto.asn1_read_tagged(j10);
                return getHashName(j11);
            } finally {
                NativeCrypto.asn1_read_free(j11);
            }
        }
        return "SHA-1";
    }

    public static String readMgfHash(long j10) {
        long j11;
        Throwable th2;
        if (NativeCrypto.asn1_read_next_tag_is(j10, 1)) {
            try {
                j11 = NativeCrypto.asn1_read_tagged(j10);
                try {
                    long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j11);
                    if (!NativeCrypto.asn1_read_oid(asn1_read_sequence).equals(MGF1_OID)) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                    String hashName = getHashName(asn1_read_sequence);
                    if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence)) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                    NativeCrypto.asn1_read_free(asn1_read_sequence);
                    NativeCrypto.asn1_read_free(j11);
                    return hashName;
                } catch (Throwable th3) {
                    th2 = th3;
                    NativeCrypto.asn1_read_free(0L);
                    NativeCrypto.asn1_read_free(j11);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                j11 = 0;
            }
        } else {
            return "SHA-1";
        }
    }

    private static long writeAlgorithmIdentifier(long j10, String str) {
        IOException e10;
        long j11;
        try {
            j11 = NativeCrypto.asn1_write_sequence(j10);
        } catch (IOException e11) {
            e10 = e11;
            j11 = 0;
        }
        try {
            NativeCrypto.asn1_write_oid(j11, str);
            return j11;
        } catch (IOException e12) {
            e10 = e12;
            NativeCrypto.asn1_write_free(j11);
            throw e10;
        }
    }

    public static void writeHashAndMgfHash(long j10, String str, MGF1ParameterSpec mGF1ParameterSpec) {
        Throwable th2;
        long j11;
        long j12;
        Throwable th3;
        long j13;
        long j14 = 0;
        if (!str.equals("SHA-1")) {
            try {
                j13 = NativeCrypto.asn1_write_tag(j10, 0);
                try {
                    long writeAlgorithmIdentifier = writeAlgorithmIdentifier(j13, NAME_TO_OID.get(str));
                    try {
                        NativeCrypto.asn1_write_null(writeAlgorithmIdentifier);
                        NativeCrypto.asn1_write_flush(j10);
                        NativeCrypto.asn1_write_free(writeAlgorithmIdentifier);
                        NativeCrypto.asn1_write_free(j13);
                    } catch (Throwable th4) {
                        th3 = th4;
                        j14 = writeAlgorithmIdentifier;
                        NativeCrypto.asn1_write_flush(j10);
                        NativeCrypto.asn1_write_free(j14);
                        NativeCrypto.asn1_write_free(j13);
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th3 = th5;
                }
            } catch (Throwable th6) {
                th3 = th6;
                j13 = 0;
            }
        }
        if (!mGF1ParameterSpec.getDigestAlgorithm().equals("SHA-1")) {
            try {
                j12 = NativeCrypto.asn1_write_tag(j10, 1);
                try {
                    j11 = writeAlgorithmIdentifier(j12, MGF1_OID);
                } catch (Throwable th7) {
                    th2 = th7;
                    j11 = 0;
                }
            } catch (Throwable th8) {
                th2 = th8;
                j12 = 0;
                j11 = 0;
            }
            try {
                j14 = writeAlgorithmIdentifier(j11, NAME_TO_OID.get(mGF1ParameterSpec.getDigestAlgorithm()));
                NativeCrypto.asn1_write_null(j14);
                NativeCrypto.asn1_write_flush(j10);
                NativeCrypto.asn1_write_free(j14);
                NativeCrypto.asn1_write_free(j11);
                NativeCrypto.asn1_write_free(j12);
            } catch (Throwable th9) {
                th2 = th9;
                NativeCrypto.asn1_write_flush(j10);
                NativeCrypto.asn1_write_free(j14);
                NativeCrypto.asn1_write_free(j11);
                NativeCrypto.asn1_write_free(j12);
                throw th2;
            }
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        long j10;
        long j11;
        Throwable th2;
        IOException e10;
        long j12;
        Throwable th3;
        long j13 = 0;
        try {
            try {
                j11 = NativeCrypto.asn1_write_init();
            } catch (Throwable th4) {
                th2 = th4;
            }
            try {
                long asn1_write_sequence = NativeCrypto.asn1_write_sequence(j11);
                try {
                    writeHashAndMgfHash(asn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                    PSource.PSpecified pSpecified = (PSource.PSpecified) this.spec.getPSource();
                    if (pSpecified.getValue().length != 0) {
                        try {
                            j12 = NativeCrypto.asn1_write_tag(asn1_write_sequence, 2);
                            try {
                                j13 = writeAlgorithmIdentifier(j12, PSPECIFIED_OID);
                                NativeCrypto.asn1_write_octetstring(j13, pSpecified.getValue());
                                NativeCrypto.asn1_write_flush(asn1_write_sequence);
                                NativeCrypto.asn1_write_free(j13);
                                NativeCrypto.asn1_write_free(j12);
                            } catch (Throwable th5) {
                                th3 = th5;
                                NativeCrypto.asn1_write_flush(asn1_write_sequence);
                                NativeCrypto.asn1_write_free(j13);
                                NativeCrypto.asn1_write_free(j12);
                                throw th3;
                            }
                        } catch (Throwable th6) {
                            th3 = th6;
                            j12 = 0;
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
            } catch (Throwable th7) {
                th2 = th7;
                j10 = 0;
                NativeCrypto.asn1_write_free(j10);
                NativeCrypto.asn1_write_free(j11);
                throw th2;
            }
        } catch (IOException e13) {
            e10 = e13;
            j11 = 0;
        } catch (Throwable th8) {
            j10 = 0;
            th2 = th8;
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
        if (cls == null || cls != OAEPParameterSpec.class) {
            throw new InvalidParameterSpecException("Unsupported class: " + cls);
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            this.spec = (OAEPParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("Only OAEPParameterSpec is supported");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        Throwable th2;
        long j10;
        Throwable th3;
        long j11;
        long j12 = 0;
        try {
            j10 = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j10);
                try {
                    PSource.PSpecified pSpecified = PSource.PSpecified.DEFAULT;
                    String readHash = readHash(asn1_read_sequence);
                    String readMgfHash = readMgfHash(asn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                        try {
                            j11 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                            try {
                                long asn1_read_sequence2 = NativeCrypto.asn1_read_sequence(j11);
                                if (!NativeCrypto.asn1_read_oid(asn1_read_sequence2).equals(PSPECIFIED_OID)) {
                                    throw new IOException("Error reading ASN.1 encoding");
                                }
                                pSpecified = new PSource.PSpecified(NativeCrypto.asn1_read_octetstring(asn1_read_sequence2));
                                if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence2)) {
                                    throw new IOException("Error reading ASN.1 encoding");
                                }
                                NativeCrypto.asn1_read_free(asn1_read_sequence2);
                                NativeCrypto.asn1_read_free(j11);
                            } catch (Throwable th4) {
                                th3 = th4;
                                NativeCrypto.asn1_read_free(0L);
                                NativeCrypto.asn1_read_free(j11);
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            j11 = 0;
                        }
                    }
                    if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(j10)) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                    this.spec = new OAEPParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), pSpecified);
                    NativeCrypto.asn1_read_free(asn1_read_sequence);
                    NativeCrypto.asn1_read_free(j10);
                } catch (Throwable th6) {
                    th2 = th6;
                    j12 = asn1_read_sequence;
                    NativeCrypto.asn1_read_free(j12);
                    NativeCrypto.asn1_read_free(j10);
                    throw th2;
                }
            } catch (Throwable th7) {
                th2 = th7;
            }
        } catch (Throwable th8) {
            th2 = th8;
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
        return "Conscrypt OAEP AlgorithmParameters";
    }
}
