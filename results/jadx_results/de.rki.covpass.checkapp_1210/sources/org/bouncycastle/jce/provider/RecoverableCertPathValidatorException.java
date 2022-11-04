package org.bouncycastle.jce.provider;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
/* loaded from: classes3.dex */
class RecoverableCertPathValidatorException extends CertPathValidatorException {
    public RecoverableCertPathValidatorException(String str, Throwable th2, CertPath certPath, int i10) {
        super(str, th2, certPath, i10);
    }
}
