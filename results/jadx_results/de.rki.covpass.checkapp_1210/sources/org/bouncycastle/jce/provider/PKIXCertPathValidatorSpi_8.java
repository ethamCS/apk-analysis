package org.bouncycastle.jce.provider;

import ek.d;
import hh.b;
import hh.p0;
import hh.u;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ji.n;
import ji.r;
import ji.s;
import ni.a;
import ni.c;
/* loaded from: classes3.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final c helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }

    public PKIXCertPathValidatorSpi_8(boolean z10) {
        this.helper = new a();
        this.isForCRLCheck = z10;
    }

    static void checkCertificate(X509Certificate x509Certificate) {
        if (x509Certificate instanceof ki.a) {
            RuntimeException runtimeException = null;
            try {
                if (((ki.a) x509Certificate).getTBSCertificateNative() != null) {
                    return;
                }
            } catch (RuntimeException e10) {
                runtimeException = e10;
            }
            throw new AnnotatedException("unable to process TBSCertificate", runtimeException);
        }
        try {
            p0.n(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e11) {
            throw new AnnotatedException(e11.getMessage());
        } catch (CertificateEncodingException e12) {
            throw new AnnotatedException("unable to process TBSCertificate", e12);
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        s sVar;
        List<? extends Certificate> list;
        int i10;
        AnnotatedException e10;
        PublicKey publicKey;
        fh.c cVar;
        HashSet hashSet;
        ArrayList arrayList;
        int i11;
        int i12;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            s.b bVar = new s.b((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof d) {
                d dVar = (d) certPathParameters;
                bVar.s(dVar.i());
                bVar.t(dVar.h());
            }
            sVar = bVar.o();
        } else if (certPathParameters instanceof r) {
            sVar = ((r) certPathParameters).a();
        } else if (!(certPathParameters instanceof s)) {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
        } else {
            sVar = (s) certPathParameters;
        }
        if (sVar.y() != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            int size = certificates.size();
            if (certificates.isEmpty()) {
                throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
            }
            Date validityDate = CertPathValidatorUtilities.getValidityDate(sVar, new Date());
            Set q10 = sVar.q();
            try {
                TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), sVar.y(), sVar.w());
                if (findTrustAnchor == null) {
                    i10 = 1;
                    list = certificates;
                    try {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                    } catch (AnnotatedException e11) {
                        e10 = e11;
                        throw new CertPathValidatorException(e10.getMessage(), e10.getUnderlyingException(), certPath, list.size() - i10);
                    }
                }
                checkCertificate(findTrustAnchor.getTrustedCert());
                s o10 = new s.b(sVar).r(findTrustAnchor).o();
                ArrayList arrayList2 = new ArrayList();
                n nVar = null;
                for (PKIXCertPathChecker pKIXCertPathChecker : o10.m()) {
                    pKIXCertPathChecker.init(false);
                    if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                        arrayList2.add(pKIXCertPathChecker);
                    } else if (nVar != null) {
                        throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                    } else {
                        nVar = pKIXCertPathChecker instanceof n ? (n) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                    }
                }
                if (o10.F() && nVar == null) {
                    nVar = new ProvRevocationChecker(this.helper);
                }
                n nVar2 = nVar;
                int i13 = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    arrayListArr[i14] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
                arrayListArr[0].add(new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false));
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                int i15 = o10.D() ? 0 : i13;
                int i16 = o10.C() ? 0 : i13;
                if (o10.E()) {
                    i13 = 0;
                }
                X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
                try {
                    if (trustedCert != null) {
                        cVar = PrincipalUtils.getSubjectPrincipal(trustedCert);
                        publicKey = trustedCert.getPublicKey();
                    } else {
                        cVar = PrincipalUtils.getCA(findTrustAnchor);
                        publicKey = findTrustAnchor.getCAPublicKey();
                    }
                    try {
                        b algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                        algorithmIdentifier.l();
                        algorithmIdentifier.o();
                        if (o10.x() != null && !o10.x().z((X509Certificate) certificates.get(0))) {
                            throw new pi.b("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                        int i17 = 1;
                        int size2 = certificates.size() - 1;
                        int i18 = size;
                        X509Certificate x509Certificate = null;
                        int i19 = i16;
                        ?? r52 = i13;
                        int i20 = i15;
                        PKIXPolicyNode pKIXPolicyNode = r52;
                        int i21 = r52;
                        while (size2 >= 0) {
                            int i22 = size - size2;
                            int i23 = size;
                            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                            int i24 = size2 == certificates.size() + (-1) ? i17 : 0;
                            try {
                                checkCertificate(x509Certificate2);
                                int i25 = size2;
                                List<? extends Certificate> list2 = certificates;
                                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                Date date = validityDate;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                s sVar2 = o10;
                                int i26 = i20;
                                ArrayList arrayList3 = arrayList2;
                                ?? r82 = i24;
                                TrustAnchor trustAnchor = findTrustAnchor;
                                int i27 = i17;
                                RFC3280CertPathUtilities.processCertA(certPath, o10, validityDate, nVar2, i25, publicKey, r82, cVar, trustedCert);
                                RFC3280CertPathUtilities.processCertBC(certPath, i25, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, i25, RFC3280CertPathUtilities.processCertD(certPath, i25, hashSet4, pKIXPolicyNode, arrayListArr2, i19, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath, i25, processCertE, i26);
                                if (i22 != i23) {
                                    if (x509Certificate2 == null || x509Certificate2.getVersion() != i27) {
                                        RFC3280CertPathUtilities.prepareNextCertA(certPath, i25);
                                        arrayListArr = arrayListArr2;
                                        PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i25, arrayListArr, processCertE, i27);
                                        RFC3280CertPathUtilities.prepareNextCertG(certPath, i25, pKIXNameConstraintValidator2);
                                        int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i25, i26);
                                        int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i25, i27);
                                        int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i25, i19);
                                        i26 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i25, prepareNextCertH1);
                                        i12 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i25, prepareNextCertH2);
                                        i11 = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i25, prepareNextCertH3);
                                        RFC3280CertPathUtilities.prepareNextCertK(certPath, i25);
                                        i18 = RFC3280CertPathUtilities.prepareNextCertM(certPath, i25, RFC3280CertPathUtilities.prepareNextCertL(certPath, i25, i18));
                                        RFC3280CertPathUtilities.prepareNextCertN(certPath, i25);
                                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                            hashSet2 = new HashSet(criticalExtensionOIDs);
                                            hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                            hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                            hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                            hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                            hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                            hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                        } else {
                                            hashSet2 = new HashSet();
                                        }
                                        arrayList = arrayList3;
                                        RFC3280CertPathUtilities.prepareNextCertO(certPath, i25, hashSet2, arrayList);
                                        fh.c subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                        try {
                                            PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i25, this.helper);
                                            b algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                            algorithmIdentifier2.l();
                                            algorithmIdentifier2.o();
                                            pKIXPolicyNode = prepareCertB;
                                            cVar = subjectPrincipal;
                                            publicKey = nextWorkingKey;
                                            trustedCert = x509Certificate2;
                                            i20 = i26;
                                            i19 = i11;
                                            arrayList2 = arrayList;
                                            i17 = i27;
                                            findTrustAnchor = trustAnchor;
                                            validityDate = date;
                                            i21 = i12;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            x509Certificate = x509Certificate2;
                                            certificates = list2;
                                            size = i23;
                                            size2 = i25 - 1;
                                            o10 = sVar2;
                                        } catch (CertPathValidatorException e12) {
                                            throw new CertPathValidatorException("Next working key could not be retrieved.", e12, certPath, i25);
                                        }
                                    } else if (i22 != i27 || !x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i25);
                                    }
                                }
                                i11 = i19;
                                arrayListArr = arrayListArr2;
                                arrayList = arrayList3;
                                i12 = i27;
                                pKIXPolicyNode = processCertE;
                                i18 = i18;
                                i20 = i26;
                                i19 = i11;
                                arrayList2 = arrayList;
                                i17 = i27;
                                findTrustAnchor = trustAnchor;
                                validityDate = date;
                                i21 = i12;
                                pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                x509Certificate = x509Certificate2;
                                certificates = list2;
                                size = i23;
                                size2 = i25 - 1;
                                o10 = sVar2;
                            } catch (AnnotatedException e13) {
                                throw new CertPathValidatorException(e13.getMessage(), e13.getUnderlyingException(), certPath, size2);
                            }
                        }
                        s sVar3 = o10;
                        ArrayList arrayList4 = arrayList2;
                        TrustAnchor trustAnchor2 = findTrustAnchor;
                        X509Certificate x509Certificate3 = x509Certificate;
                        int i28 = size2;
                        int i29 = i28 + 1;
                        int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i29, RFC3280CertPathUtilities.wrapupCertA(i20, x509Certificate3));
                        Set<String> criticalExtensionOIDs2 = x509Certificate3.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                            hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                            hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                            hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                            hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                            hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                            hashSet.remove(u.f12057m4.H());
                        } else {
                            hashSet = new HashSet();
                        }
                        RFC3280CertPathUtilities.wrapupCertF(certPath, i29, arrayList4, hashSet);
                        PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, sVar3, q10, i29, arrayListArr, pKIXPolicyNode, hashSet4);
                        if (wrapupCertB <= 0 && wrapupCertG == null) {
                            throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i28);
                        }
                        return new PKIXCertPathValidatorResult(trustAnchor2, wrapupCertG, x509Certificate3.getPublicKey());
                    } catch (CertPathValidatorException e14) {
                        throw new pi.b("Algorithm identifier of public key of trust anchor could not be read.", e14, certPath, -1);
                    }
                } catch (RuntimeException e15) {
                    throw new pi.b("Subject of trust anchor could not be (re)encoded.", e15, certPath, -1);
                }
            } catch (AnnotatedException e16) {
                e10 = e16;
                i10 = 1;
                list = certificates;
            }
        } else {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
