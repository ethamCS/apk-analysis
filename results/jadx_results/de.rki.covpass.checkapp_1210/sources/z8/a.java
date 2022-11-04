package z8;

import hc.t;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import of.g;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0018\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a \u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002\"$\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz8/d;", BuildConfig.FLAVOR, "Ljava/security/cert/X509Certificate;", "certs", "Ltb/e0;", "d", BuildConfig.FLAVOR, "pattern", "c", "cert", "b", "<set-?>", "httpConfig", "Lz8/d;", "a", "()Lz8/d;", "covpass-http_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static d f26508a = new c();

    public static final d a() {
        return f26508a;
    }

    public static final void b(d dVar, String str, X509Certificate x509Certificate) {
        t.e(dVar, "<this>");
        t.e(str, "pattern");
        t.e(x509Certificate, "cert");
        dVar.a(str, g.Companion.a(x509Certificate));
    }

    public static final void c(d dVar, String str, List<? extends X509Certificate> list) {
        t.e(dVar, "<this>");
        t.e(str, "pattern");
        t.e(list, "certs");
        for (X509Certificate x509Certificate : list) {
            b(dVar, str, x509Certificate);
        }
    }

    public static final void d(d dVar, List<? extends X509Certificate> list) {
        t.e(dVar, "<this>");
        t.e(list, "certs");
        for (X509Certificate x509Certificate : list) {
            for (String str : b9.b.a(x509Certificate)) {
                b(dVar, str, x509Certificate);
            }
        }
    }
}
