package pi;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
/* loaded from: classes3.dex */
public class b extends CertPathValidatorException {

    /* renamed from: c */
    private Throwable f19237c;

    public b(String str) {
        super(str);
    }

    public b(String str, Throwable th2) {
        super(str);
        this.f19237c = th2;
    }

    public b(String str, Throwable th2, CertPath certPath, int i10) {
        super(str, th2, certPath, i10);
        this.f19237c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f19237c;
    }
}
