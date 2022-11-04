package a;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public enum d {
    AES_GCM_128(1, 128, 128),
    AES_GCM_192(2, 192, 128),
    AES_GCM_256(3, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128),
    HMAC_SHA_256_64(4, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 64),
    HMAC_SHA_256(5, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    HMAC_SHA_384(6, 384, 384),
    HMAC_SHA_512(7, 512, 512),
    AES_CCM_16_64_128(10, 128, 64),
    AES_CCM_16_64_256(11, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 64),
    AES_CCM_64_64_128(12, 128, 64),
    AES_CCM_64_64_256(13, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 64),
    AES_CBC_MAC_128_64(14, 128, 64),
    AES_CBC_MAC_256_64(15, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 64),
    AES_CBC_MAC_128_128(25, 128, 128),
    AES_CBC_MAC_256_128(26, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128),
    AES_CCM_16_128_128(30, 128, 128),
    AES_CCM_16_128_256(31, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128),
    AES_CCM_64_128_128(32, 128, 128),
    AES_CCM_64_128_256(33, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128),
    AES_KW_128(-3, 128, 64),
    AES_KW_192(-4, 192, 64),
    AES_KW_256(-5, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 64),
    Direct(-6, 0, 0),
    ECDSA_256(-7, 0, 0),
    HKDF_HMAC_SHA_256(-10, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0),
    HKDF_HMAC_SHA_512(-11, 512, 0),
    HKDF_HMAC_AES_128(-12, 128, 0),
    HKDF_HMAC_AES_256(-13, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0),
    ECDSA_384(-35, 0, 0),
    ECDSA_512(-36, 0, 0),
    EDDSA(-8, 0, 0),
    ECDH_ES_HKDF_256(-25, 0, 0),
    ECDH_ES_HKDF_512(-26, 0, 0),
    ECDH_SS_HKDF_256(-27, 0, 0),
    ECDH_SS_HKDF_512(-28, 0, 0),
    ECDH_ES_HKDF_256_AES_KW_128(-29, 0, 0),
    ECDH_ES_HKDF_256_AES_KW_192(-30, 0, 0),
    ECDH_ES_HKDF_256_AES_KW_256(-31, 0, 0),
    ECDH_SS_HKDF_256_AES_KW_128(-32, 0, 0),
    ECDH_SS_HKDF_256_AES_KW_192(-33, 0, 0),
    ECDH_SS_HKDF_256_AES_KW_256(-34, 0, 0),
    RSA_PSS_256(-37, 0, 0),
    RSA_PSS_384(-38, 0, 0),
    RSA_PSS_512(-39, 0, 0);
    

    /* renamed from: c */
    private final t7.o f45c;

    /* renamed from: d */
    private final int f46d;

    /* renamed from: q */
    private final int f47q;

    d(int i10, int i11, int i12) {
        this.f45c = t7.o.O(i10);
        this.f46d = i11;
        this.f47q = i12;
    }

    public static d b(t7.o oVar) {
        d[] values;
        if (oVar != null) {
            for (d dVar : values()) {
                if (oVar.i1(dVar.f45c)) {
                    return dVar;
                }
            }
            throw new f("Unknown Algorithm Specified");
        }
        throw new f("No Algorithm Specified");
    }
}
