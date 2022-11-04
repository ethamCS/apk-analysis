package org.bouncycastle.jce.provider;

import ek.e;
import ek.h;
import ek.k;
import hh.s0;
import hh.u;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ji.q;
import ji.r;
import ji.s;
import pi.b;
/* loaded from: classes3.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = u.f12067w4.H();
    private static final String NO_REV_AVAIL = u.f12066v4.H();
    private static final String CRL_DISTRIBUTION_POINTS = u.f12052h4.H();
    private static final String AUTHORITY_INFO_ACCESS = u.f12060p4.H();

    RFC3281CertPathUtilities() {
    }

    public static void additionalChecks(h hVar, Set set, Set set2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hVar.c(str) != null) {
                throw new CertPathValidatorException("Attribute certificate contains prohibited attribute: " + str + ".");
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (hVar.c(str2) == null) {
                throw new CertPathValidatorException("Attribute certificate does not contain necessary attribute: " + str2 + ".");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void checkCRL(hh.s r22, ek.h r23, ji.s r24, java.util.Date r25, java.util.Date r26, java.security.cert.X509Certificate r27, org.bouncycastle.jce.provider.CertStatus r28, org.bouncycastle.jce.provider.ReasonsMask r29, java.util.List r30, ni.c r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRL(hh.s, ek.h, ji.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List, ni.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRLs(ek.h r20, ji.s r21, java.util.Date r22, java.util.Date r23, java.security.cert.X509Certificate r24, java.util.List r25, ni.c r26) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(ek.h, ji.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.util.List, ni.c):void");
    }

    public static CertPath processAttrCert1(h hVar, s sVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (hVar.b().e() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(hVar.b().i());
            Principal[] e10 = hVar.b().e();
            for (int i10 = 0; i10 < e10.length; i10++) {
                try {
                    if (e10[i10] instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) e10[i10]).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new q.b(x509CertSelector).a(), sVar.o());
                } catch (IOException e11) {
                    throw new b("Unable to encode X500 principal.", e11);
                } catch (AnnotatedException e12) {
                    throw new b("Public key certificate for attribute certificate cannot be searched.", e12);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (hVar.b().d() != null) {
            k kVar = new k();
            Principal[] d10 = hVar.b().d();
            for (int i11 = 0; i11 < d10.length; i11++) {
                try {
                    if (d10[i11] instanceof X500Principal) {
                        kVar.setIssuer(((X500Principal) d10[i11]).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new q.b(kVar).a(), sVar.o());
                } catch (IOException e13) {
                    throw new b("Unable to encode X500 principal.", e13);
                } catch (AnnotatedException e14) {
                    throw new b("Public key certificate for attribute certificate cannot be searched.", e14);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        s.b bVar = new s.b(sVar);
        Iterator it = linkedHashSet.iterator();
        b bVar2 = null;
        CertPathBuilderResult certPathBuilderResult = null;
        while (it.hasNext()) {
            k kVar2 = new k();
            kVar2.setCertificate((X509Certificate) it.next());
            bVar.q(new q.b(kVar2).a());
            try {
                try {
                    certPathBuilderResult = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new r.b(bVar.o()).e());
                } catch (InvalidAlgorithmParameterException e15) {
                    throw new RuntimeException(e15.getMessage());
                } catch (CertPathBuilderException e16) {
                    bVar2 = new b("Certification path for public key certificate of attribute certificate could not be build.", e16);
                }
            } catch (NoSuchAlgorithmException e17) {
                throw new b("Support class could not be created.", e17);
            } catch (NoSuchProviderException e18) {
                throw new b("Support class could not be created.", e18);
            }
        }
        if (bVar2 == null) {
            return certPathBuilderResult.getCertPath();
        }
        throw bVar2;
    }

    public static CertPathValidatorResult processAttrCert2(CertPath certPath, s sVar) {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, sVar);
            } catch (InvalidAlgorithmParameterException e10) {
                throw new RuntimeException(e10.getMessage());
            } catch (CertPathValidatorException e11) {
                throw new b("Certification path for issuer certificate of attribute certificate could not be validated.", e11);
            }
        } catch (NoSuchAlgorithmException e12) {
            throw new b("Support class could not be created.", e12);
        } catch (NoSuchProviderException e13) {
            throw new b("Support class could not be created.", e13);
        }
    }

    public static void processAttrCert3(X509Certificate x509Certificate, s sVar) {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage == null || ((keyUsage.length > 0 && keyUsage[0]) || (keyUsage.length > 1 && keyUsage[1]))) {
            if (x509Certificate.getBasicConstraints() != -1) {
                throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
            }
            return;
        }
        throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
    }

    public static void processAttrCert4(X509Certificate x509Certificate, Set set) {
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z10 = true;
            }
        }
        if (z10) {
            return;
        }
        throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
    }

    public static void processAttrCert5(h hVar, Date date) {
        try {
            hVar.checkValidity(date);
        } catch (CertificateExpiredException e10) {
            throw new b("Attribute certificate is not valid.", e10);
        } catch (CertificateNotYetValidException e11) {
            throw new b("Attribute certificate is not valid.", e11);
        }
    }

    public static void processAttrCert7(h hVar, CertPath certPath, CertPath certPath2, s sVar, Set set) {
        Set<String> criticalExtensionOIDs = hVar.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                s0.l(CertPathValidatorUtilities.getExtensionValue(hVar, str));
            } catch (IllegalArgumentException e10) {
                throw new b("Target information extension could not be read.", e10);
            } catch (AnnotatedException e11) {
                throw new b("Target information extension could not be read.", e11);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(hVar, certPath, certPath2, criticalExtensionOIDs);
        }
        if (criticalExtensionOIDs.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
    }
}
