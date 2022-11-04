package org.bouncycastle.jce.provider;

import ek.c;
import ek.d;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import ji.p;
import ji.r;
import ji.s;
/* loaded from: classes3.dex */
public class PKIXCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;
    private final boolean isForCRLCheck;

    public PKIXCertPathBuilderSpi() {
        this(false);
    }

    public PKIXCertPathBuilderSpi(boolean z10) {
        this.isForCRLCheck = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.security.cert.CertPathBuilderResult build(java.security.cert.X509Certificate r6, ji.r r7, java.util.List r8) {
        /*
            r5 = this;
            boolean r0 = r8.contains(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r7.c()
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r7.d()
            r2 = -1
            if (r0 == r2) goto L27
            int r0 = r8.size()
            int r0 = r0 + (-1)
            int r2 = r7.d()
            if (r0 <= r2) goto L27
            return r1
        L27:
            r8.add(r6)
            org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory r0 = new org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory     // Catch: java.lang.Exception -> Lf7
            r0.<init>()     // Catch: java.lang.Exception -> Lf7
            org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi r2 = new org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi     // Catch: java.lang.Exception -> Lf7
            boolean r3 = r5.isForCRLCheck     // Catch: java.lang.Exception -> Lf7
            r2.<init>(r3)     // Catch: java.lang.Exception -> Lf7
            ji.s r3 = r7.a()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.util.Set r3 = r3.y()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            ji.s r4 = r7.a()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r4 = r4.w()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            boolean r3 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.isIssuerTrustAnchor(r6, r3, r4)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            if (r3 == 0) goto L7a
            java.security.cert.CertPath r0 = r0.engineGenerateCertPath(r8)     // Catch: java.lang.Exception -> L71
            java.security.cert.CertPathValidatorResult r7 = r2.engineValidate(r0, r7)     // Catch: java.lang.Exception -> L68
            java.security.cert.PKIXCertPathValidatorResult r7 = (java.security.cert.PKIXCertPathValidatorResult) r7     // Catch: java.lang.Exception -> L68
            java.security.cert.PKIXCertPathBuilderResult r2 = new java.security.cert.PKIXCertPathBuilderResult     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.security.cert.TrustAnchor r3 = r7.getTrustAnchor()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.security.cert.PolicyNode r4 = r7.getPolicyTree()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.security.PublicKey r7 = r7.getPublicKey()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            r2.<init>(r0, r3, r4, r7)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            return r2
        L68:
            r7 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r2 = "Certification path could not be validated."
            r0.<init>(r2, r7)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            throw r0     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
        L71:
            r7 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r2 = "Certification path could not be constructed from certificate list."
            r0.<init>(r2, r7)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            throw r0     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
        L7a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            r0.<init>()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            ji.s r2 = r7.a()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.util.List r2 = r2.p()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            r0.addAll(r2)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            gg.v r2 = hh.u.X3     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r2 = r2.H()     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            byte[] r2 = r6.getExtensionValue(r2)     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            ji.s r3 = r7.a()     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.util.Map r3 = r3.v()     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.util.List r2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getAdditionalStoresFromAltNames(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            r0.addAll(r2)     // Catch: java.security.cert.CertificateParsingException -> Le5 org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.util.HashSet r2 = new java.util.HashSet     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            r2.<init>()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            ji.s r3 = r7.a()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Ldc
            java.util.List r3 = r3.o()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Ldc
            java.util.Collection r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.findIssuerCerts(r6, r3, r0)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Ldc
            r2.addAll(r0)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Ldc
            boolean r0 = r2.isEmpty()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            if (r0 != 0) goto Ld4
            java.util.Iterator r0 = r2.iterator()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
        Lc1:
            boolean r2 = r0.hasNext()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            if (r2 == 0) goto Lf1
            if (r1 != 0) goto Lf1
            java.lang.Object r2 = r0.next()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.security.cert.CertPathBuilderResult r1 = r5.build(r2, r7, r8)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            goto Lc1
        Ld4:
            org.bouncycastle.jce.provider.AnnotatedException r7 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r0 = "No issuer certificate for certificate in certification path found."
            r7.<init>(r0)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            throw r7     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
        Ldc:
            r7 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r2 = "Cannot find issuer certificate for certificate in certification path."
            r0.<init>(r2, r7)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            throw r0     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
        Le5:
            r7 = move-exception
            org.bouncycastle.jce.provider.AnnotatedException r0 = new org.bouncycastle.jce.provider.AnnotatedException     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            java.lang.String r2 = "No additional X.509 stores can be added from certificate locations."
            r0.<init>(r2, r7)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
            throw r0     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> Lee
        Lee:
            r7 = move-exception
            r5.certPathException = r7
        Lf1:
            if (r1 != 0) goto Lf6
            r8.remove(r6)
        Lf6:
            return r1
        Lf7:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Exception creating support classes."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi.build(java.security.cert.X509Certificate, ji.r, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        r rVar;
        Exception exc;
        r.b bVar;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            s.b bVar2 = new s.b(pKIXBuilderParameters);
            if (certPathParameters instanceof d) {
                c cVar = (c) certPathParameters;
                for (p pVar : cVar.a()) {
                    bVar2.n(pVar);
                }
                bVar = new r.b(bVar2.o());
                bVar.d(cVar.l());
                bVar.f(cVar.m());
            } else {
                bVar = new r.b(pKIXBuilderParameters);
            }
            rVar = bVar.e();
        } else if (!(certPathParameters instanceof r)) {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + r.class.getName() + ".");
        } else {
            rVar = (r) certPathParameters;
        }
        ArrayList arrayList = new ArrayList();
        CertPathBuilderResult certPathBuilderResult = null;
        Iterator it = CertPathValidatorUtilities.findTargets(rVar).iterator();
        while (it.hasNext() && certPathBuilderResult == null) {
            certPathBuilderResult = build((X509Certificate) it.next(), rVar, arrayList);
        }
        if (certPathBuilderResult == null && (exc = this.certPathException) != null) {
            if (!(exc instanceof AnnotatedException)) {
                throw new CertPathBuilderException("Possible certificate chain could not be validated.", this.certPathException);
            }
            throw new CertPathBuilderException(this.certPathException.getMessage(), this.certPathException.getCause());
        } else if (certPathBuilderResult != null || this.certPathException != null) {
            return certPathBuilderResult;
        } else {
            throw new CertPathBuilderException("Unable to find certificate chain.");
        }
    }
}
