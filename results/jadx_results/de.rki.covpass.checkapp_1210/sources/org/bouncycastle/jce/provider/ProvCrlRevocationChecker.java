package org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;
import ji.n;
import ji.o;
import ni.c;
/* loaded from: classes3.dex */
public class ProvCrlRevocationChecker implements n {
    private Date currentDate = null;
    private final c helper;
    private o params;

    public ProvCrlRevocationChecker(c cVar) {
        this.helper = cVar;
    }

    @Override // ji.n
    public void check(Certificate certificate) {
        try {
            o oVar = this.params;
            RFC3280CertPathUtilities.checkCRLs(oVar, oVar.c(), this.currentDate, this.params.e(), (X509Certificate) certificate, this.params.d(), this.params.f(), this.params.a().getCertificates(), this.helper);
        } catch (AnnotatedException e10) {
            throw new CertPathValidatorException(e10.getMessage(), e10.getCause() != null ? e10.getCause() : e10, this.params.a(), this.params.b());
        }
    }

    public void init(boolean z10) {
        if (!z10) {
            this.params = null;
            this.currentDate = new Date();
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    @Override // ji.n
    public void initialize(o oVar) {
        this.params = oVar;
        this.currentDate = new Date();
    }

    public void setParameter(String str, Object obj) {
    }
}
