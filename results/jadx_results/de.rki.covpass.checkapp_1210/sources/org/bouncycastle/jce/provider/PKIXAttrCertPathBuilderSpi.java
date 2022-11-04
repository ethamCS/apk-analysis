package org.bouncycastle.jce.provider;

import ak.o;
import ak.p;
import ek.c;
import ek.d;
import ek.g;
import ek.h;
import ek.k;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.Certificate;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import ji.q;
import ji.r;
import ji.s;
import pi.a;
/* loaded from: classes3.dex */
public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.security.cert.CertPathBuilderResult build(ek.h r7, java.security.cert.X509Certificate r8, ji.r r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi.build(ek.h, java.security.cert.X509Certificate, ji.r, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    protected static Collection findCertificates(g gVar, List list) {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof o) {
                try {
                    hashSet.addAll(((o) obj).getMatches(gVar));
                } catch (p e10) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e10);
                }
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        r rVar;
        boolean z10 = certPathParameters instanceof PKIXBuilderParameters;
        if (!z10 && !(certPathParameters instanceof c) && !(certPathParameters instanceof r)) {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + r.class.getName() + ".");
        }
        List arrayList = new ArrayList();
        if (z10) {
            r.b bVar = new r.b((PKIXBuilderParameters) certPathParameters);
            if (certPathParameters instanceof d) {
                c cVar = (c) certPathParameters;
                bVar.d(cVar.l());
                bVar.f(cVar.m());
                arrayList = cVar.f();
            }
            rVar = bVar.e();
        } else {
            rVar = (r) certPathParameters;
        }
        ArrayList arrayList2 = new ArrayList();
        s a10 = rVar.a();
        q x10 = a10.x();
        if (!(x10 instanceof g)) {
            throw new CertPathBuilderException("TargetConstraints must be an instance of " + g.class.getName() + " for " + getClass().getName() + " class.");
        }
        try {
            Collection findCertificates = findCertificates((g) x10, arrayList);
            if (findCertificates.isEmpty()) {
                throw new CertPathBuilderException("No attribute certificate found matching targetConstraints.");
            }
            CertPathBuilderResult certPathBuilderResult = null;
            Iterator it = findCertificates.iterator();
            while (it.hasNext() && certPathBuilderResult == null) {
                h hVar = (h) it.next();
                k kVar = new k();
                Principal[] c10 = hVar.e().c();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i10 = 0; i10 < c10.length; i10++) {
                    try {
                        if (c10[i10] instanceof X500Principal) {
                            kVar.setSubject(((X500Principal) c10[i10]).getEncoded());
                        }
                        q<? extends Certificate> a11 = new q.b(kVar).a();
                        CertPathValidatorUtilities.findCertificates(linkedHashSet, a11, a10.o());
                        CertPathValidatorUtilities.findCertificates(linkedHashSet, a11, a10.p());
                    } catch (IOException e10) {
                        throw new a("cannot encode X500Principal.", e10);
                    } catch (AnnotatedException e11) {
                        throw new a("Public key certificate for attribute certificate cannot be searched.", e11);
                    }
                }
                if (linkedHashSet.isEmpty()) {
                    throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext() && certPathBuilderResult == null) {
                    certPathBuilderResult = build(hVar, (X509Certificate) it2.next(), rVar, arrayList2);
                }
            }
            if (certPathBuilderResult == null && this.certPathException != null) {
                throw new a("Possible certificate chain could not be validated.", this.certPathException);
            }
            if (certPathBuilderResult != null || this.certPathException != null) {
                return certPathBuilderResult;
            }
            throw new CertPathBuilderException("Unable to find certificate chain.");
        } catch (AnnotatedException e12) {
            throw new a("Error finding target attribute certificate.", e12);
        }
    }
}
