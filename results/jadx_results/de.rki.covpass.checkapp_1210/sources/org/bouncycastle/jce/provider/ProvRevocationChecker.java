package org.bouncycastle.jce.provider;

import gg.v;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ji.n;
import ji.o;
import lg.a;
import ni.c;
import yg.b;
import zg.q;
/* loaded from: classes3.dex */
public class ProvRevocationChecker extends PKIXRevocationChecker implements n {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final ProvCrlRevocationChecker crlChecker;
    private final c helper;
    private final ProvOcspRevocationChecker ocspChecker;
    private o parameters;

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        hashMap.put(new v("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(q.f26824m1, "SHA224WITHRSA");
        hashMap.put(q.f26815j1, "SHA256WITHRSA");
        hashMap.put(q.f26818k1, "SHA384WITHRSA");
        hashMap.put(q.f26821l1, "SHA512WITHRSA");
        hashMap.put(a.f16030n, "GOST3411WITHGOST3410");
        hashMap.put(a.f16031o, "GOST3411WITHECGOST3410");
        hashMap.put(ah.a.f528i, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(ah.a.f529j, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(fi.a.f10213d, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(fi.a.f10214e, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(fi.a.f10215f, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(fi.a.f10216g, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(fi.a.f10217h, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(fi.a.f10218i, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(hi.a.f12212s, "SHA1WITHCVC-ECDSA");
        hashMap.put(hi.a.f12213t, "SHA224WITHCVC-ECDSA");
        hashMap.put(hi.a.f12214u, "SHA256WITHCVC-ECDSA");
        hashMap.put(hi.a.f12215v, "SHA384WITHCVC-ECDSA");
        hashMap.put(hi.a.f12216w, "SHA512WITHCVC-ECDSA");
        hashMap.put(qg.a.f19903a, "XMSS");
        hashMap.put(qg.a.f19904b, "XMSSMT");
        hashMap.put(new v("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new v("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new v("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(ih.o.O, "SHA1WITHECDSA");
        hashMap.put(ih.o.S, "SHA224WITHECDSA");
        hashMap.put(ih.o.T, "SHA256WITHECDSA");
        hashMap.put(ih.o.U, "SHA384WITHECDSA");
        hashMap.put(ih.o.V, "SHA512WITHECDSA");
        hashMap.put(b.f26296k, "SHA1WITHRSA");
        hashMap.put(b.f26295j, "SHA1WITHDSA");
        hashMap.put(ug.b.X, "SHA224WITHDSA");
        hashMap.put(ug.b.Y, "SHA256WITHDSA");
    }

    public ProvRevocationChecker(c cVar) {
        this.helper = cVar;
        this.crlChecker = new ProvCrlRevocationChecker(cVar);
        this.ocspChecker = new ProvOcspRevocationChecker(this, cVar);
    }

    private boolean hasOption(PKIXRevocationChecker.Option option) {
        return getOptions().contains(option);
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection<String> collection) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!hasOption(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (hasOption(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.crlChecker.check(certificate);
                    return;
                } catch (RecoverableCertPathValidatorException e10) {
                    if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        throw e10;
                    }
                    this.ocspChecker.check(certificate);
                    return;
                }
            }
            try {
                this.ocspChecker.check(certificate);
            } catch (RecoverableCertPathValidatorException e11) {
                if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    throw e11;
                }
                this.crlChecker.check(certificate);
            }
        }
    }

    @Override // java.security.cert.PKIXRevocationChecker
    public List<CertPathValidatorException> getSoftFailExceptions() {
        return this.ocspChecker.getSoftFailExceptions();
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set<String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z10) {
        this.parameters = null;
        this.crlChecker.init(z10);
        this.ocspChecker.init(z10);
    }

    @Override // ji.n
    public void initialize(o oVar) {
        this.parameters = oVar;
        this.crlChecker.initialize(oVar);
        this.ocspChecker.initialize(oVar);
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }
}
