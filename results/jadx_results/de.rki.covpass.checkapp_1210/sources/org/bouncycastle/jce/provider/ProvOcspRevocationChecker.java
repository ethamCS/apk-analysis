package org.bouncycastle.jce.provider;

import ak.m;
import fh.e;
import gg.d0;
import gg.g;
import gg.g0;
import gg.r1;
import gg.t1;
import gg.v;
import gg.w;
import hh.c0;
import hh.h;
import hh.n0;
import hh.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ji.n;
import ji.o;
import lg.a;
import ni.c;
import ni.d;
import xg.i;
import yg.b;
import zg.q;
import zg.x;
/* loaded from: classes3.dex */
public class ProvOcspRevocationChecker implements n {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final c helper;
    private boolean isEnabledOCSP;
    private String ocspURL;
    private o parameters;
    private final ProvRevocationChecker parent;

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

    public ProvOcspRevocationChecker(ProvRevocationChecker provRevocationChecker, c cVar) {
        this.parent = provRevocationChecker;
        this.helper = cVar;
    }

    private static byte[] calcKeyHash(MessageDigest messageDigest, PublicKey publicKey) {
        return messageDigest.digest(n0.n(publicKey.getEncoded()).o().D());
    }

    private xg.b createCertID(hh.b bVar, hh.n nVar, gg.q qVar) {
        try {
            MessageDigest c10 = this.helper.c(d.a(bVar.l()));
            return new xg.b(bVar, new t1(c10.digest(nVar.w().k("DER"))), new t1(c10.digest(nVar.z().o().D())), qVar);
        } catch (Exception e10) {
            throw new CertPathValidatorException("problem creating ID: " + e10, e10);
        }
    }

    private xg.b createCertID(xg.b bVar, hh.n nVar, gg.q qVar) {
        return createCertID(bVar.l(), nVar, qVar);
    }

    private hh.n extractCert() {
        try {
            return hh.n.n(this.parameters.d().getEncoded());
        } catch (Exception e10) {
            throw new CertPathValidatorException("cannot process signing cert: " + e10.getMessage(), e10, this.parameters.a(), this.parameters.b());
        }
    }

    private static String getDigestName(v vVar) {
        String a10 = d.a(vVar);
        int indexOf = a10.indexOf(45);
        if (indexOf <= 0 || a10.startsWith("SHA3")) {
            return a10;
        }
        return a10.substring(0, indexOf) + a10.substring(indexOf + 1);
    }

    static URI getOcspResponderURI(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(u.f12060p4.H());
        if (extensionValue == null) {
            return null;
        }
        hh.a[] m10 = h.n(w.E(extensionValue).F()).m();
        for (int i10 = 0; i10 != m10.length; i10++) {
            hh.a aVar = m10[i10];
            if (hh.a.f11912x.s(aVar.m())) {
                hh.w l10 = aVar.l();
                if (l10.q() == 6) {
                    try {
                        return new URI(((g0) l10.o()).c());
                    } catch (URISyntaxException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String getSignatureName(hh.b bVar) {
        g o10 = bVar.o();
        if (o10 == null || r1.f10880d.r(o10) || !bVar.l().s(q.f26812i1)) {
            Map map = oids;
            boolean containsKey = map.containsKey(bVar.l());
            v l10 = bVar.l();
            return containsKey ? (String) map.get(l10) : l10.H();
        }
        x m10 = x.m(o10);
        return getDigestName(m10.l().l()) + "WITHRSAANDMGF1";
    }

    private static X509Certificate getSignerCert(xg.a aVar, X509Certificate x509Certificate, X509Certificate x509Certificate2, c cVar) {
        i m10 = aVar.q().m();
        byte[] m11 = m10.m();
        if (m11 != null) {
            MessageDigest c10 = cVar.c("SHA1");
            if (x509Certificate2 != null && ak.a.c(m11, calcKeyHash(c10, x509Certificate2.getPublicKey()))) {
                return x509Certificate2;
            }
            if (x509Certificate != null && ak.a.c(m11, calcKeyHash(c10, x509Certificate.getPublicKey()))) {
                return x509Certificate;
            }
            return null;
        }
        e eVar = gh.b.R;
        fh.c l10 = fh.c.l(eVar, m10.n());
        if (x509Certificate2 != null && l10.equals(fh.c.l(eVar, x509Certificate2.getSubjectX500Principal().getEncoded()))) {
            return x509Certificate2;
        }
        if (x509Certificate != null && l10.equals(fh.c.l(eVar, x509Certificate.getSubjectX500Principal().getEncoded()))) {
            return x509Certificate;
        }
        return null;
    }

    private static boolean responderMatches(i iVar, X509Certificate x509Certificate, c cVar) {
        byte[] m10 = iVar.m();
        if (m10 != null) {
            return ak.a.c(m10, calcKeyHash(cVar.c("SHA1"), x509Certificate.getPublicKey()));
        }
        e eVar = gh.b.R;
        return fh.c.l(eVar, iVar.n()).equals(fh.c.l(eVar, x509Certificate.getSubjectX500Principal().getEncoded()));
    }

    public static boolean validatedOcspResponse(xg.a aVar, o oVar, byte[] bArr, X509Certificate x509Certificate, c cVar) {
        try {
            d0 l10 = aVar.l();
            Signature createSignature = cVar.createSignature(getSignatureName(aVar.o()));
            X509Certificate signerCert = getSignerCert(aVar, oVar.d(), x509Certificate, cVar);
            if (signerCert == null && l10 == null) {
                throw new CertPathValidatorException("OCSP responder certificate not found");
            }
            if (signerCert != null) {
                createSignature.initVerify(signerCert.getPublicKey());
            } else {
                X509Certificate x509Certificate2 = (X509Certificate) cVar.d("X.509").generateCertificate(new ByteArrayInputStream(l10.G(0).b().getEncoded()));
                x509Certificate2.verify(oVar.d().getPublicKey());
                x509Certificate2.checkValidity(oVar.e());
                if (!responderMatches(aVar.q().m(), x509Certificate2, cVar)) {
                    throw new CertPathValidatorException("responder certificate does not match responderID", null, oVar.a(), oVar.b());
                }
                List<String> extendedKeyUsage = x509Certificate2.getExtendedKeyUsage();
                if (extendedKeyUsage == null || !extendedKeyUsage.contains(c0.f11927a4.l())) {
                    throw new CertPathValidatorException("responder certificate not valid for signing OCSP responses", null, oVar.a(), oVar.b());
                }
                createSignature.initVerify(x509Certificate2);
            }
            createSignature.update(aVar.q().k("DER"));
            if (!createSignature.verify(aVar.n().D())) {
                return false;
            }
            if (bArr != null && !ak.a.c(bArr, aVar.q().n().l(xg.d.f25620c).n().F())) {
                throw new CertPathValidatorException("nonce mismatch in OCSP response", null, oVar.a(), oVar.b());
            }
            return true;
        } catch (IOException e10) {
            throw new CertPathValidatorException("OCSP response failure: " + e10.getMessage(), e10, oVar.a(), oVar.b());
        } catch (CertPathValidatorException e11) {
            throw e11;
        } catch (GeneralSecurityException e12) {
            throw new CertPathValidatorException("OCSP response failure: " + e12.getMessage(), e12, oVar.a(), oVar.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a0, code lost:
        if (r0.l().equals(r1.l().l()) != false) goto L64;
     */
    @Override // ji.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void check(java.security.cert.Certificate r12) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.ProvOcspRevocationChecker.check(java.security.cert.Certificate):void");
    }

    public List<CertPathValidatorException> getSoftFailExceptions() {
        return null;
    }

    public Set<String> getSupportedExtensions() {
        return null;
    }

    public void init(boolean z10) {
        if (!z10) {
            this.parameters = null;
            this.isEnabledOCSP = m.c("ocsp.enable");
            this.ocspURL = m.b("ocsp.responderURL");
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    @Override // ji.n
    public void initialize(o oVar) {
        this.parameters = oVar;
        this.isEnabledOCSP = m.c("ocsp.enable");
        this.ocspURL = m.b("ocsp.responderURL");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }
}
