package a;
/* loaded from: classes.dex */
public enum l {
    Algorithm(1),
    CONTENT_TYPE(3),
    KID(4),
    IV(5),
    CriticalHeaders(2),
    CounterSignature(7),
    PARTIAL_IV(6),
    CounterSignature0(9),
    ECDH_EPK(-1),
    ECDH_SPK(-2),
    ECDH_SKID(-3),
    HKDF_Salt(-20),
    HKDF_Context_PartyU_ID(-21),
    HKDF_Context_PartyU_nonce(-22),
    HKDF_Context_PartyU_Other(-23),
    HKDF_Context_PartyV_ID(-24),
    HKDF_Context_PartyV_nonce(-25),
    HKDF_Context_PartyV_Other(-26),
    HKDF_SuppPub_Other(-999),
    HKDF_SuppPriv_Other(-998);
    

    /* renamed from: c */
    private t7.o f82c;

    l(int i10) {
        this.f82c = t7.o.O(i10);
    }

    public t7.o b() {
        return this.f82c;
    }
}
