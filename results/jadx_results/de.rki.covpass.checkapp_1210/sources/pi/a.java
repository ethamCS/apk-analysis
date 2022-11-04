package pi;

import java.security.cert.CertPathBuilderException;
/* loaded from: classes3.dex */
public class a extends CertPathBuilderException {

    /* renamed from: c */
    private Throwable f19236c;

    public a(String str, Throwable th2) {
        super(str);
        this.f19236c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f19236c;
    }
}
