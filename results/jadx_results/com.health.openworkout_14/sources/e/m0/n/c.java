package e.m0.n;

import e.m0.l.f;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public abstract class c {
    public static c b(X509TrustManager x509TrustManager) {
        return f.j().c(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
