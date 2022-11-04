package org.bouncycastle.jce.provider;

import ak.a;
import fh.c;
import gg.a0;
import gg.d0;
import gg.g;
import gg.g0;
import gg.h;
import gg.q;
import gg.v;
import gg.x1;
import hh.b0;
import hh.f0;
import hh.j;
import hh.j0;
import hh.s;
import hh.t;
import hh.u;
import hh.w;
import hh.x;
import hh.y;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ji.n;
import ji.o;
import ji.q;
import ji.r;
import ji.s;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import pi.b;
/* loaded from: classes3.dex */
public class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = u.f12053i4.H();
    public static final String POLICY_MAPPINGS = u.f12054j4.H();
    public static final String INHIBIT_ANY_POLICY = u.f12059o4.H();
    public static final String ISSUING_DISTRIBUTION_POINT = u.f12049e4.H();
    public static final String FRESHEST_CRL = u.f12058n4.H();
    public static final String DELTA_CRL_INDICATOR = u.f12048d4.H();
    public static final String POLICY_CONSTRAINTS = u.f12056l4.H();
    public static final String BASIC_CONSTRAINTS = u.Y3.H();
    public static final String CRL_DISTRIBUTION_POINTS = u.f12052h4.H();
    public static final String SUBJECT_ALTERNATIVE_NAME = u.W3.H();
    public static final String NAME_CONSTRAINTS = u.f12051g4.H();
    public static final String AUTHORITY_KEY_IDENTIFIER = u.f12055k4.H();
    public static final String KEY_USAGE = u.U3.H();
    public static final String CRL_NUMBER = u.Z3.H();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    RFC3280CertPathUtilities() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void checkCRL(ji.o r21, hh.s r22, ji.s r23, java.util.Date r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.cert.X509Certificate r27, java.security.PublicKey r28, org.bouncycastle.jce.provider.CertStatus r29, org.bouncycastle.jce.provider.ReasonsMask r30, java.util.List r31, ni.c r32) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRL(ji.o, hh.s, ji.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List, ni.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRLs(ji.o r23, ji.s r24, java.util.Date r25, java.util.Date r26, java.security.cert.X509Certificate r27, java.security.cert.X509Certificate r28, java.security.PublicKey r29, java.util.List r30, ni.c r31) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(ji.o, ji.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, ni.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
        r7 = ((gg.d0) org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r7.hasMoreElements() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
        r9 = hh.j0.l(r7.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r9.m().H()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r5 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r9.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
        throw new pi.b("Policy qualifier info set could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
        if (r4.getCriticalExtensionOIDs() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
        r12 = r4.getCriticalExtensionOIDs().contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
        r9 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r9.getValidPolicy()) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
        r8 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r3, (java.util.Set) r13.get(r11), r9, r10, r11, r12);
        r9.addChild(r8);
        r21[r3].add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0160, code lost:
        throw new pi.b("Certificate policies extension could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r19, int r20, java.util.List[] r21, org.bouncycastle.jce.provider.PKIXPolicyNode r22, int r23) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.bouncycastle.jce.provider.PKIXPolicyNode, int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    public static void prepareNextCertA(CertPath certPath, int i10) {
        try {
            d0 F = d0.F(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), POLICY_MAPPINGS));
            if (F == null) {
                return;
            }
            for (int i11 = 0; i11 < F.size(); i11++) {
                try {
                    d0 F2 = d0.F(F.G(i11));
                    v K = v.K(F2.G(0));
                    v K2 = v.K(F2.G(1));
                    if (ANY_POLICY.equals(K.H())) {
                        throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i10);
                    }
                    if (ANY_POLICY.equals(K2.H())) {
                        throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i10);
                    }
                } catch (Exception e10) {
                    throw new b("Policy mappings extension contents could not be decoded.", e10, certPath, i10);
                }
            }
        } catch (AnnotatedException e11) {
            throw new b("Policy mappings extension could not be decoded.", e11, certPath, i10);
        }
    }

    public static void prepareNextCertG(CertPath certPath, int i10, PKIXNameConstraintValidator pKIXNameConstraintValidator) {
        try {
            d0 F = d0.F(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), NAME_CONSTRAINTS));
            f0 o10 = F != null ? f0.o(F) : null;
            if (o10 == null) {
                return;
            }
            y[] q10 = o10.q();
            if (q10 != null) {
                try {
                    pKIXNameConstraintValidator.intersectPermittedSubtree(q10);
                } catch (Exception e10) {
                    throw new b("Permitted subtrees cannot be build from name constraints extension.", e10, certPath, i10);
                }
            }
            y[] n10 = o10.n();
            if (n10 == null) {
                return;
            }
            for (int i11 = 0; i11 != n10.length; i11++) {
                try {
                    pKIXNameConstraintValidator.addExcludedSubtree(n10[i11]);
                } catch (Exception e11) {
                    throw new b("Excluded subtrees cannot be build from name constraints extension.", e11, certPath, i10);
                }
            }
        } catch (Exception e12) {
            throw new b("Name constraints extension could not be decoded.", e12, certPath, i10);
        }
    }

    public static int prepareNextCertH1(CertPath certPath, int i10, int i11) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10)) || i11 == 0) ? i11 : i11 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i10, int i11) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10)) || i11 == 0) ? i11 : i11 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i10, int i11) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10)) || i11 == 0) ? i11 : i11 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        r3 = gg.q.D(r1, false).M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r3 >= r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L44
            gg.a0 r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L44
            gg.d0 r0 = gg.d0.F(r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L43
            java.util.Enumeration r0 = r0.H()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3a
            gg.j0 r1 = gg.j0.N(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r2 = r1.Q()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r2 != 0) goto L1a
            r0 = 0
            gg.q r0 = gg.q.D(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r3 = r0.M()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r3 >= r5) goto L43
            return r3
        L3a:
            r5 = move-exception
            pi.b r0 = new pi.b
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        L43:
            return r5
        L44:
            r5 = move-exception
            pi.b r0 = new pi.b
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        r4 = gg.q.D(r1, false).M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 >= r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L45
            gg.a0 r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L45
            gg.d0 r0 = gg.d0.F(r0)     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L44
            java.util.Enumeration r0 = r0.H()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3b
            gg.j0 r1 = gg.j0.N(r1)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r2 = r1.Q()     // Catch: java.lang.IllegalArgumentException -> L3b
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            gg.q r0 = gg.q.D(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r4 = r0.M()     // Catch: java.lang.IllegalArgumentException -> L3b
            if (r4 >= r6) goto L44
            return r4
        L3b:
            r6 = move-exception
            pi.b r0 = new pi.b
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        L44:
            return r6
        L45:
            r6 = move-exception
            pi.b r0 = new pi.b
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    public static int prepareNextCertJ(CertPath certPath, int i10, int i11) {
        int M;
        try {
            q E = q.E(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), INHIBIT_ANY_POLICY));
            return (E == null || (M = E.M()) >= i11) ? i11 : M;
        } catch (Exception e10) {
            throw new b("Inhibit any-policy extension cannot be decoded.", e10, certPath, i10);
        }
    }

    public static void prepareNextCertK(CertPath certPath, int i10) {
        try {
            j l10 = j.l(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), BASIC_CONSTRAINTS));
            if (l10 == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i10);
            }
            if (!l10.n()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i10);
            }
        } catch (Exception e10) {
            throw new b("Basic constraints extension cannot be decoded.", e10, certPath, i10);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i10, int i11) {
        if (!CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i10))) {
            if (i11 <= 0) {
                throw new b("Max path length not greater than zero", null, certPath, i10);
            }
            return i11 - 1;
        }
        return i11;
    }

    public static int prepareNextCertM(CertPath certPath, int i10, int i11) {
        BigInteger m10;
        int intValue;
        try {
            j l10 = j.l(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), BASIC_CONSTRAINTS));
            return (l10 == null || (m10 = l10.m()) == null || (intValue = m10.intValue()) >= i11) ? i11 : intValue;
        } catch (Exception e10) {
            throw new b("Basic constraints extension cannot be decoded.", e10, certPath, i10);
        }
    }

    public static void prepareNextCertN(CertPath certPath, int i10) {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i10)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length > 5 && keyUsage[5]) {
                return;
            }
            throw new b("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i10);
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i10, Set set, List list) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e10) {
                throw new CertPathValidatorException(e10.getMessage(), e10.getCause(), certPath, i10);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new b("Certificate has unsupported critical extension: " + set, null, certPath, i10);
    }

    public static void processCRLB1(s sVar, Object obj, X509CRL x509crl) {
        a0 extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        int i10 = 0;
        boolean z10 = extensionValue != null && b0.o(extensionValue).r();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (sVar.m() != null) {
                w[] o10 = sVar.m().o();
                int i11 = 0;
                while (i10 < o10.length) {
                    if (o10[i10].q() == 4) {
                        try {
                            if (a.c(o10[i10].o().b().getEncoded(), encoded)) {
                                i11 = 1;
                            }
                        } catch (IOException e10) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e10);
                        }
                    }
                    i10++;
                }
                if (i11 != 0 && !z10) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (i11 == 0) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                i10 = i11;
            } else if (PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                i10 = 1;
            }
            if (i10 == 0) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e11) {
            throw new AnnotatedException("Exception encoding CRL issuer: " + e11.getMessage(), e11);
        }
    }

    public static void processCRLB2(s sVar, Object obj, X509CRL x509crl) {
        w[] wVarArr;
        try {
            b0 o10 = b0.o(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (o10 == null) {
                return;
            }
            if (o10.n() != null) {
                t n10 = b0.o(o10).n();
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                if (n10.q() == 0) {
                    for (w wVar : x.n(n10.o()).o()) {
                        arrayList.add(wVar);
                    }
                }
                if (n10.q() == 1) {
                    h hVar = new h();
                    try {
                        Enumeration H = d0.F(PrincipalUtils.getIssuerPrincipal(x509crl)).H();
                        while (H.hasMoreElements()) {
                            hVar.a((g) H.nextElement());
                        }
                        hVar.a(n10.o());
                        arrayList.add(new w(c.n(new x1(hVar))));
                    } catch (Exception e10) {
                        throw new AnnotatedException("Could not read CRL issuer.", e10);
                    }
                }
                if (sVar.n() != null) {
                    t n11 = sVar.n();
                    w[] wVarArr2 = null;
                    if (n11.q() == 0) {
                        wVarArr2 = x.n(n11.o()).o();
                    }
                    if (n11.q() == 1) {
                        if (sVar.m() != null) {
                            wVarArr = sVar.m().o();
                        } else {
                            wVarArr = new w[1];
                            try {
                                wVarArr[0] = new w(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                            } catch (Exception e11) {
                                throw new AnnotatedException("Could not read certificate issuer.", e11);
                            }
                        }
                        wVarArr2 = wVarArr;
                        for (int i10 = 0; i10 < wVarArr2.length; i10++) {
                            Enumeration H2 = d0.F(wVarArr2[i10].o().b()).H();
                            h hVar2 = new h();
                            while (H2.hasMoreElements()) {
                                hVar2.a((g) H2.nextElement());
                            }
                            hVar2.a(n11.o());
                            wVarArr2[i10] = new w(c.n(new x1(hVar2)));
                        }
                    }
                    if (wVarArr2 != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= wVarArr2.length) {
                                break;
                            } else if (arrayList.contains(wVarArr2[i11])) {
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!z10) {
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                } else if (sVar.m() == null) {
                    throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                } else {
                    w[] o11 = sVar.m().o();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= o11.length) {
                            break;
                        } else if (arrayList.contains(o11[i12])) {
                            z10 = true;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                }
            }
            try {
                j l10 = j.l(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                if (obj instanceof X509Certificate) {
                    if (o10.w() && l10 != null && l10.n()) {
                        throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                    }
                    if (o10.u() && (l10 == null || !l10.n())) {
                        throw new AnnotatedException("End CRL only contains CA certificates.");
                    }
                }
                if (o10.s()) {
                    throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                }
            } catch (Exception e12) {
                throw new AnnotatedException("Basic constraints extension could not be decoded.", e12);
            }
        } catch (Exception e13) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e13);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, ji.s sVar) {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException("delta CRL has unsupported critical extensions");
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            b0 o10 = b0.o(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (!sVar.H()) {
                return;
            }
            if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
            }
            try {
                b0 o11 = b0.o(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                boolean z10 = false;
                if (o10 != null ? o10.equals(o11) : o11 == null) {
                    z10 = true;
                }
                if (!z10) {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                }
                try {
                    String str2 = AUTHORITY_KEY_IDENTIFIER;
                    a0 extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                    try {
                        a0 extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                        if (extensionValue == null) {
                            throw new AnnotatedException("CRL authority key identifier is null.");
                        }
                        if (extensionValue2 == null) {
                            throw new AnnotatedException("Delta CRL authority key identifier is null.");
                        }
                        if (!extensionValue.s(extensionValue2)) {
                            throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                        }
                    } catch (AnnotatedException e10) {
                        throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e10);
                    }
                } catch (AnnotatedException e11) {
                    throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e11);
                }
            } catch (Exception e12) {
                throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e12);
            }
        } catch (Exception e13) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e13);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, s sVar) {
        try {
            b0 o10 = b0.o(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (o10 != null && o10.q() != null && sVar.q() != null) {
                return new ReasonsMask(sVar.q()).intersect(new ReasonsMask(o10.q()));
            }
            if ((o10 == null || o10.q() == null) && sVar.q() == null) {
                return ReasonsMask.allReasons;
            }
            return (sVar.q() == null ? ReasonsMask.allReasons : new ReasonsMask(sVar.q())).intersect(o10 == null ? ReasonsMask.allReasons : new ReasonsMask(o10.q()));
        } catch (Exception e10) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e10);
        }
    }

    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, ji.s sVar, List list, ni.c cVar) {
        int i10;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            ji.q<? extends Certificate> a10 = new q.b(x509CertSelector).a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, a10, sVar.p());
                CertPathValidatorUtilities.findCertificates(linkedHashSet, a10, sVar.o());
                linkedHashSet.add(x509Certificate);
                Iterator it = linkedHashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            s.b q10 = new s.b(sVar).q(new q.b(x509CertSelector2).a());
                            if (list.contains(x509Certificate2)) {
                                q10.p(false);
                            } else {
                                q10.p(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new r.b(q10.o()).e()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, cVar));
                        } catch (CertPathBuilderException e10) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e10);
                        } catch (CertPathValidatorException e11) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e11);
                        } catch (Exception e12) {
                            throw new AnnotatedException(e12.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i10)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i10));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (hashSet.isEmpty() && annotatedException != null) {
                    throw annotatedException;
                }
                return hashSet;
            } catch (AnnotatedException e13) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e13);
            }
        } catch (IOException e14) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e14);
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) {
        Iterator it = set.iterator();
        Exception e10 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e10);
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) {
        Iterator it = set.iterator();
        Exception e10 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        if (e10 == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e10);
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, ji.s sVar) {
        if (!sVar.H() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCertA(CertPath certPath, ji.s sVar, Date date, n nVar, int i10, PublicKey publicKey, boolean z10, c cVar, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i10);
        if (!z10) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, sVar.w());
            } catch (GeneralSecurityException e10) {
                throw new b("Could not validate certificate signature.", e10, certPath, i10);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, sVar.B(), certPath, i10);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (nVar != null) {
                    nVar.initialize(new o(sVar, validCertDateFromValidityModel, certPath, i10, x509Certificate, publicKey));
                    nVar.check(x509Certificate2);
                }
                c issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(cVar)) {
                    return;
                }
                throw new b("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + cVar + ") of signing certificate.", null, certPath, i10);
            } catch (CertificateExpiredException e11) {
                throw new b("Could not validate certificate: " + e11.getMessage(), e11, certPath, i10);
            } catch (CertificateNotYetValidException e12) {
                throw new b("Could not validate certificate: " + e12.getMessage(), e12, certPath, i10);
            }
        } catch (AnnotatedException e13) {
            throw new b("Could not validate time of certificate.", e13, certPath, i10);
        }
    }

    public static void processCertBC(CertPath certPath, int i10, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z10) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i10);
        int size = certificates.size();
        int i11 = size - i10;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i11 >= size && !z10)) {
            try {
                d0 F = d0.F(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(F);
                    pKIXNameConstraintValidator.checkExcludedDN(F);
                    try {
                        x n10 = x.n(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        fh.b[] q10 = c.n(F).q(gh.c.I);
                        for (int i12 = 0; i12 != q10.length; i12++) {
                            w wVar = new w(1, ((g0) q10[i12].m().n()).c());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(wVar);
                                pKIXNameConstraintValidator.checkExcluded(wVar);
                            } catch (PKIXNameConstraintValidatorException e10) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e10, certPath, i10);
                            }
                        }
                        if (n10 == null) {
                            return;
                        }
                        try {
                            w[] o10 = n10.o();
                            for (int i13 = 0; i13 < o10.length; i13++) {
                                try {
                                    pKIXNameConstraintValidator.checkPermitted(o10[i13]);
                                    pKIXNameConstraintValidator.checkExcluded(o10[i13]);
                                } catch (PKIXNameConstraintValidatorException e11) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e11, certPath, i10);
                                }
                            }
                        } catch (Exception e12) {
                            throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e12, certPath, i10);
                        }
                    } catch (Exception e13) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e13, certPath, i10);
                    }
                } catch (PKIXNameConstraintValidatorException e14) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e14, certPath, i10);
                }
            } catch (Exception e15) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e15, certPath, i10);
            }
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i10, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i11, boolean z10) {
        String str;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i10);
        int size = certificates.size();
        int i12 = size - i10;
        try {
            d0 F = d0.F(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (F == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration H = F.H();
            HashSet hashSet = new HashSet();
            while (H.hasMoreElements()) {
                j0 l10 = j0.l(H.nextElement());
                v m10 = l10.m();
                hashSet.add(m10.H());
                if (!ANY_POLICY.equals(m10.H())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(l10.n());
                        if (!CertPathValidatorUtilities.processCertD1i(i12, listArr, m10, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i12, listArr, m10, qualifierSet);
                        }
                    } catch (CertPathValidatorException e10) {
                        throw new b("Policy qualifier info set could not be build.", e10, certPath, i10);
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i11 > 0 || ((i12 < size || z10) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration H2 = F.H();
                while (true) {
                    if (!H2.hasMoreElements()) {
                        break;
                    }
                    j0 l11 = j0.l(H2.nextElement());
                    if (ANY_POLICY.equals(l11.m().H())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(l11.n());
                        List list = listArr[i12 - 1];
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i13);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    str = (String) obj2;
                                } else if (obj2 instanceof v) {
                                    str = ((v) obj2).H();
                                }
                                String str2 = str;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z11 = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i12, hashSet3, pKIXPolicyNode2, qualifierSet2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i12].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode;
            for (int i14 = i12 - 1; i14 >= 0; i14--) {
                List list2 = listArr[i14];
                for (int i15 = 0; i15 < list2.size(); i15++) {
                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i15);
                    if (pKIXPolicyNode5.hasChildren() || (pKIXPolicyNode4 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode4, listArr, pKIXPolicyNode5)) != null) {
                    }
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i12];
                for (int i16 = 0; i16 < list3.size(); i16++) {
                    ((PKIXPolicyNode) list3.get(i16)).setCritical(contains);
                }
            }
            return pKIXPolicyNode4;
        } catch (AnnotatedException e11) {
            throw new b("Could not read certificate policies extension from certificate.", e11, certPath, i10);
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i10, PKIXPolicyNode pKIXPolicyNode) {
        try {
            if (d0.F(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), CERTIFICATE_POLICIES)) != null) {
                return pKIXPolicyNode;
            }
            return null;
        } catch (AnnotatedException e10) {
            throw new b("Could not read certificate policies extension from certificate.", e10, certPath, i10);
        }
    }

    public static void processCertF(CertPath certPath, int i10, PKIXPolicyNode pKIXPolicyNode, int i11) {
        if (i11 > 0 || pKIXPolicyNode != null) {
            return;
        }
        throw new b("No valid policy tree found when one expected.", null, certPath, i10);
    }

    public static int wrapupCertA(int i10, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i10 == 0) ? i10 : i10 - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i10, int i11) {
        try {
            d0 F = d0.F(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i10), POLICY_CONSTRAINTS));
            if (F != null) {
                Enumeration H = F.H();
                while (H.hasMoreElements()) {
                    gg.j0 j0Var = (gg.j0) H.nextElement();
                    if (j0Var.Q() == 0) {
                        try {
                            if (gg.q.D(j0Var, false).M() == 0) {
                                return 0;
                            }
                        } catch (Exception e10) {
                            throw new b("Policy constraints requireExplicitPolicy field could not be decoded.", e10, certPath, i10);
                        }
                    }
                }
            }
            return i11;
        } catch (AnnotatedException e11) {
            throw new b("Policy constraints could not be decoded.", e11, certPath, i10);
        }
    }

    public static void wrapupCertF(CertPath certPath, int i10, List list, Set set) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e10) {
                throw new b(e10.getMessage(), e10, certPath, i10);
            } catch (Exception e11) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e11, certPath, i10);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new b("Certificate has unsupported critical extension: " + set, null, certPath, i10);
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, ji.s sVar, Set set, int i10, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (sVar.D()) {
                throw new b("Explicit policy requested but none available.", null, certPath, i10);
            }
            return null;
        }
        if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
            HashSet<PKIXPolicyNode> hashSet = new HashSet();
            for (List list : listArr) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i11);
                    if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                            if (!ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                                hashSet.add(pKIXPolicyNode3);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode4 : hashSet) {
                if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                }
            }
            if (pKIXPolicyNode != null) {
                for (int i12 = size - 1; i12 >= 0; i12--) {
                    List list2 = listArr[i12];
                    for (int i13 = 0; i13 < list2.size(); i13++) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i13);
                        if (!pKIXPolicyNode5.hasChildren()) {
                            pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode5);
                        }
                    }
                }
            }
        } else if (sVar.D()) {
            if (set2.isEmpty()) {
                throw new b("Explicit policy requested but none available.", null, certPath, i10);
            }
            HashSet<PKIXPolicyNode> hashSet2 = new HashSet();
            for (List list3 : listArr) {
                for (int i14 = 0; i14 < list3.size(); i14++) {
                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list3.get(i14);
                    if (ANY_POLICY.equals(pKIXPolicyNode6.getValidPolicy())) {
                        Iterator children2 = pKIXPolicyNode6.getChildren();
                        while (children2.hasNext()) {
                            hashSet2.add(children2.next());
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode7 : hashSet2) {
                set2.contains(pKIXPolicyNode7.getValidPolicy());
            }
            for (int i15 = size - 1; i15 >= 0; i15--) {
                List list4 = listArr[i15];
                for (int i16 = 0; i16 < list4.size(); i16++) {
                    PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) list4.get(i16);
                    if (!pKIXPolicyNode8.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode8);
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
