package org.bouncycastle.jce.provider;

import ak.m;
import ak.p;
import ek.h;
import fh.c;
import gg.a0;
import gg.d0;
import gg.g;
import gg.g0;
import gg.t1;
import gg.v;
import gg.w;
import gg.y;
import gh.e;
import hh.b;
import hh.i;
import hh.j0;
import hh.k;
import hh.n0;
import hh.t;
import hh.u;
import hh.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ji.l;
import ji.m;
import ji.o;
import ji.q;
import ji.r;
import ji.s;
import pi.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String CERTIFICATE_POLICIES = u.f12053i4.H();
    protected static final String BASIC_CONSTRAINTS = u.Y3.H();
    protected static final String POLICY_MAPPINGS = u.f12054j4.H();
    protected static final String SUBJECT_ALTERNATIVE_NAME = u.W3.H();
    protected static final String NAME_CONSTRAINTS = u.f12051g4.H();
    protected static final String KEY_USAGE = u.U3.H();
    protected static final String INHIBIT_ANY_POLICY = u.f12059o4.H();
    protected static final String ISSUING_DISTRIBUTION_POINT = u.f12049e4.H();
    protected static final String DELTA_CRL_INDICATOR = u.f12048d4.H();
    protected static final String POLICY_CONSTRAINTS = u.f12056l4.H();
    protected static final String FRESHEST_CRL = u.f12058n4.H();
    protected static final String CRL_DISTRIBUTION_POINTS = u.f12052h4.H();
    protected static final String AUTHORITY_KEY_IDENTIFIER = u.f12055k4.H();
    protected static final String CRL_NUMBER = u.Z3.H();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    CertPathValidatorUtilities() {
    }

    static void checkCRLsNotEmpty(o oVar, Set set, Object obj) {
        if (set.isEmpty()) {
            if (obj instanceof h) {
                throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + ((h) obj).e().c()[0] + "\"", null, oVar.a(), oVar.b());
            }
            throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + e.V.e(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj)) + "\"", null, oVar.a(), oVar.b());
        }
    }

    public static void findCertificates(LinkedHashSet linkedHashSet, q qVar, List list) {
        for (Object obj : list) {
            if (obj instanceof ak.o) {
                try {
                    linkedHashSet.addAll(((ak.o) obj).getMatches(qVar));
                } catch (p e10) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e10);
                }
            } else {
                try {
                    linkedHashSet.addAll(q.d(qVar, (CertStore) obj));
                } catch (CertStoreException e11) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e11);
                }
            }
        }
    }

    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<ji.p> list2) {
        byte[] m10;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(AUTHORITY_KEY_IDENTIFIER);
                if (extensionValue != null && (m10 = i.l(w.E(extensionValue).F()).m()) != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new t1(m10).getEncoded());
                }
            } catch (Exception unused) {
            }
            q<? extends Certificate> a10 = new q.b(x509CertSelector).a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                findCertificates(linkedHashSet, a10, list);
                findCertificates(linkedHashSet, a10, list2);
                return linkedHashSet;
            } catch (AnnotatedException e10) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e10);
            }
        } catch (Exception e11) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e11);
        }
    }

    public static Collection findTargets(r rVar) {
        s a10 = rVar.a();
        q x10 = a10.x();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            findCertificates(linkedHashSet, x10, a10.p());
            findCertificates(linkedHashSet, x10, a10.o());
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            Certificate c10 = x10.c();
            if (c10 == null) {
                throw new CertPathBuilderException("No certificate found matching targetConstraints.");
            }
            return Collections.singleton(c10);
        } catch (AnnotatedException e10) {
            throw new a("Error finding target certificate.", e10);
        }
    }

    protected static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) {
        return findTrustAnchor(x509Certificate, set, null);
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set, String str) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e10 = null;
        c cVar = null;
        PublicKey publicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (trustAnchor.getCA() != null && trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                    if (cVar == null) {
                        cVar = c.n(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (cVar.equals(c.n(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                try {
                    verifyX509Certificate(x509Certificate, publicKey, str);
                } catch (Exception e11) {
                    e10 = e11;
                    trustAnchor = null;
                    publicKey = null;
                }
            }
        }
        if (trustAnchor != null || e10 == null) {
            return trustAnchor;
        }
        throw new AnnotatedException("TrustAnchor found but certificate validation failed.", e10);
    }

    public static List<ji.p> getAdditionalStoresFromAltNames(byte[] bArr, Map<hh.w, ji.p> map) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        hh.w[] o10 = x.n(w.E(bArr).F()).o();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != o10.length; i10++) {
            ji.p pVar = map.get(o10[i10]);
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }

    public static List<l> getAdditionalStoresFromCRLDistributionPoint(k kVar, Map<hh.w, l> map, Date date, ni.c cVar) {
        if (kVar == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            hh.s[] l10 = kVar.l();
            ArrayList arrayList = new ArrayList();
            for (hh.s sVar : l10) {
                t n10 = sVar.n();
                if (n10 != null && n10.q() == 0) {
                    for (hh.w wVar : x.n(n10.o()).o()) {
                        l lVar = map.get(wVar);
                        if (lVar != null) {
                            arrayList.add(lVar);
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && m.c("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    CertificateFactory d10 = cVar.d("X.509");
                    for (int i10 = 0; i10 < l10.length; i10++) {
                        t n11 = l10[i10].n();
                        if (n11 != null && n11.q() == 0) {
                            hh.w[] o10 = x.n(n11.o()).o();
                            int i11 = 0;
                            while (true) {
                                if (i11 < o10.length) {
                                    hh.w wVar2 = o10[i10];
                                    if (wVar2.q() == 6) {
                                        try {
                                            l crl = CrlCache.getCrl(d10, date, new URI(((g0) wVar2.o()).c()));
                                            if (crl != null) {
                                                arrayList.add(crl);
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    throw new AnnotatedException("cannot create certificate factory: " + e10.getMessage(), e10);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            throw new AnnotatedException("Distribution points could not be read.", e11);
        }
    }

    public static b getAlgorithmIdentifier(PublicKey publicKey) {
        try {
            return n0.n(publicKey.getEncoded()).l();
        } catch (Exception e10) {
            throw new pi.b("Subject public key cannot be decoded.", e10);
        }
    }

    protected static void getCRLIssuersFromDistributionPoint(hh.s sVar, Collection collection, X509CRLSelector x509CRLSelector) {
        ArrayList<c> arrayList = new ArrayList();
        if (sVar.m() != null) {
            hh.w[] o10 = sVar.m().o();
            for (int i10 = 0; i10 < o10.length; i10++) {
                if (o10[i10].q() == 4) {
                    try {
                        arrayList.add(c.n(o10[i10].o().b().getEncoded()));
                    } catch (IOException e10) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e10);
                    }
                }
            }
        } else if (sVar.n() == null) {
            throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
        } else {
            for (Object obj : collection) {
                arrayList.add(obj);
            }
        }
        for (c cVar : arrayList) {
            try {
                x509CRLSelector.addIssuerName(cVar.getEncoded());
            } catch (IOException e11) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e11);
            }
        }
    }

    public static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) {
        X509CRLEntry x509CRLEntry;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                x509CRLEntry = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (x509CRLEntry == null) {
                    return;
                }
                X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : PrincipalUtils.getX500Name(certificateIssuer))) {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (x509CRLEntry = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            gg.i iVar = null;
            if (x509CRLEntry.hasExtensions()) {
                if (x509CRLEntry.hasUnsupportedCriticalExtension()) {
                    throw new AnnotatedException("CRL entry has unsupported critical extensions.");
                }
                try {
                    iVar = gg.i.E(getExtensionValue(x509CRLEntry, u.f12045a4.H()));
                } catch (Exception e10) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e10);
                }
            }
            int G = iVar == null ? 0 : iVar.G();
            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime() && G != 0 && G != 1 && G != 2 && G != 10) {
                return;
            }
            certStatus.setCertStatus(G);
            certStatus.setRevocationDate(x509CRLEntry.getRevocationDate());
        } catch (CRLException e11) {
            throw new AnnotatedException("Failed check for indirect CRL.", e11);
        }
    }

    public static Set getCompleteCRLs(o oVar, hh.s sVar, Object obj, s sVar2, Date date) {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(sVar, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            Set findCRLs = PKIXCRLUtil.findCRLs(new m.b(x509CRLSelector).h(true).g(), date, sVar2.o(), sVar2.l());
            checkCRLsNotEmpty(oVar, findCRLs, obj);
            return findCRLs;
        } catch (AnnotatedException e10) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e10);
        }
    }

    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<l> list2, ni.c cVar) {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                a0 extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger bigInteger = null;
                BigInteger F = extensionValue != null ? gg.q.E(extensionValue).F() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    if (F != null) {
                        bigInteger = F.add(BigInteger.valueOf(1L));
                    }
                    x509CRLSelector.setMinCRLNumber(bigInteger);
                    m.b bVar = new m.b(x509CRLSelector);
                    bVar.i(extensionValue2);
                    bVar.j(true);
                    bVar.k(F);
                    ji.m<? extends CRL> g10 = bVar.g();
                    Set<X509CRL> findCRLs = PKIXCRLUtil.findCRLs(g10, date, list, list2);
                    if (findCRLs.isEmpty() && ak.m.c("org.bouncycastle.x509.enableCRLDP")) {
                        try {
                            CertificateFactory d10 = cVar.d("X.509");
                            hh.s[] l10 = k.m(extensionValue2).l();
                            for (int i10 = 0; i10 < l10.length; i10++) {
                                t n10 = l10[i10].n();
                                if (n10 != null && n10.q() == 0) {
                                    hh.w[] o10 = x.n(n10.o()).o();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < o10.length) {
                                            hh.w wVar = o10[i10];
                                            if (wVar.q() == 6) {
                                                try {
                                                    l crl = CrlCache.getCrl(d10, date, new URI(((g0) wVar.o()).c()));
                                                    if (crl != null) {
                                                        findCRLs = PKIXCRLUtil.findCRLs(g10, date, Collections.EMPTY_LIST, Collections.singletonList(crl));
                                                    }
                                                } catch (Exception unused) {
                                                    continue;
                                                }
                                            }
                                            i11++;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            throw new AnnotatedException("cannot create certificate factory: " + e10.getMessage(), e10);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : findCRLs) {
                        if (isDeltaCRL(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e11) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e11);
                }
            } catch (Exception e12) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e12);
            }
        } catch (IOException e13) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e13);
        }
    }

    public static a0 getExtensionValue(X509Extension x509Extension, String str) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    public static PublicKey getNextWorkingKey(List list, int i10, ni.c cVar) {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i10)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i10++;
            if (i10 >= list.size()) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            PublicKey publicKey2 = ((X509Certificate) list.get(i10)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            dSAPublicKey = (DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return cVar.h("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    private static a0 getObject(String str, byte[] bArr) {
        try {
            return a0.u(w.E(bArr).F());
        } catch (Exception e10) {
            throw new AnnotatedException("exception processing extension " + str, e10);
        }
    }

    public static final Set getQualifierSet(d0 d0Var) {
        HashSet hashSet = new HashSet();
        if (d0Var == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        y a10 = y.a(byteArrayOutputStream);
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            try {
                a10.u((g) H.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e10) {
                throw new pi.b("Policy qualifier info cannot be decoded.", e10);
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        return ((X509Certificate) obj).getSerialNumber();
    }

    public static Date getValidCertDateFromValidityModel(Date date, int i10, CertPath certPath, int i11) {
        if (1 != i10 || i11 <= 0) {
            return date;
        }
        int i12 = i11 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i12);
        if (i12 == 0) {
            gg.m mVar = null;
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i12)).getExtensionValue(ii.a.f12707e.H());
                if (extensionValue != null) {
                    mVar = gg.m.J(a0.u(extensionValue));
                }
                if (mVar != null) {
                    try {
                        return mVar.G();
                    } catch (ParseException e10) {
                        throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e10);
                    }
                }
            } catch (IOException unused) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return x509Certificate.getNotBefore();
    }

    public static Date getValidityDate(s sVar, Date date) {
        Date A = sVar.A();
        return A == null ? date : A;
    }

    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
    }

    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) {
        try {
            return findTrustAnchor(x509Certificate, set, str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    protected static void prepareNextCertB1(int i10, List[] listArr, String str, Map map, X509Certificate x509Certificate) {
        boolean z10;
        boolean z11;
        Iterator it = listArr[i10].iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) it.next();
            if (pKIXPolicyNode.getValidPolicy().equals(str)) {
                z11 = true;
                pKIXPolicyNode.expectedPolicies = (Set) map.get(str);
                break;
            }
        }
        if (!z11) {
            for (PKIXPolicyNode pKIXPolicyNode2 : listArr[i10]) {
                if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                    Set set = null;
                    try {
                        Enumeration H = d0.F(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).H();
                        while (true) {
                            if (!H.hasMoreElements()) {
                                break;
                            }
                            try {
                                j0 l10 = j0.l(H.nextElement());
                                if ("2.5.29.32.0".equals(l10.m().H())) {
                                    try {
                                        set = getQualifierSet(l10.n());
                                        break;
                                    } catch (CertPathValidatorException e10) {
                                        throw new pi.b("Policy qualifier info set could not be built.", e10);
                                    }
                                }
                            } catch (Exception e11) {
                                throw new AnnotatedException("Policy information cannot be decoded.", e11);
                            }
                        }
                        Set set2 = set;
                        if (x509Certificate.getCriticalExtensionOIDs() != null) {
                            z10 = x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES);
                        }
                        boolean z12 = z10;
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                        if (!"2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                            return;
                        }
                        PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i10, (Set) map.get(str), pKIXPolicyNode3, set2, str, z12);
                        pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                        listArr[i10].add(pKIXPolicyNode4);
                        return;
                    } catch (Exception e12) {
                        throw new AnnotatedException("Certificate policies cannot be decoded.", e12);
                    }
                }
            }
        }
    }

    protected static PKIXPolicyNode prepareNextCertB2(int i10, List[] listArr, String str, PKIXPolicyNode pKIXPolicyNode) {
        Iterator it = listArr[i10].iterator();
        while (it.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) it.next();
            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                ((PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                it.remove();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    List list = listArr[i11];
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list.get(i12);
                        if (pKIXPolicyNode3.hasChildren() || (pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3)) != null) {
                        }
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    public static boolean processCertD1i(int i10, List[] listArr, v vVar, Set set) {
        List list = listArr[i10 - 1];
        for (int i11 = 0; i11 < list.size(); i11++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i11);
            if (pKIXPolicyNode.getExpectedPolicies().contains(vVar.H())) {
                HashSet hashSet = new HashSet();
                hashSet.add(vVar.H());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i10, hashSet, pKIXPolicyNode, set, vVar.H(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i10].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    public static void processCertD1ii(int i10, List[] listArr, v vVar, Set set) {
        List list = listArr[i10 - 1];
        for (int i11 = 0; i11 < list.size(); i11++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i11);
            if ("2.5.29.32.0".equals(pKIXPolicyNode.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(vVar.H());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i10, hashSet, pKIXPolicyNode, set, vVar.H(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i10].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (int i10 = 0; i10 < listArr.length; i10++) {
            listArr[i10] = new ArrayList();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }
}
