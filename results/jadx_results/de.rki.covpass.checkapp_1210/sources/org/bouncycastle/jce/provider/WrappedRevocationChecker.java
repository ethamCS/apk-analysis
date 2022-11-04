package org.bouncycastle.jce.provider;

import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import ji.n;
import ji.o;
/* loaded from: classes3.dex */
class WrappedRevocationChecker implements n {
    private final PKIXCertPathChecker checker;

    public WrappedRevocationChecker(PKIXCertPathChecker pKIXCertPathChecker) {
        this.checker = pKIXCertPathChecker;
    }

    @Override // ji.n
    public void check(Certificate certificate) {
        this.checker.check(certificate);
    }

    @Override // ji.n
    public void initialize(o oVar) {
        this.checker.init(false);
    }

    public void setParameter(String str, Object obj) {
    }
}
