package d9;

import java.security.cert.X509Certificate;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Ld9/v;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "kid", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/security/cert/X509Certificate;", "certificate", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/security/cert/X509Certificate;", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/security/cert/X509Certificate;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    private final String f8460a;

    /* renamed from: b */
    private final String f8461b;

    /* renamed from: c */
    private final X509Certificate f8462c;

    public v(String str, String str2, X509Certificate x509Certificate) {
        hc.t.e(str, "country");
        hc.t.e(str2, "kid");
        hc.t.e(x509Certificate, "certificate");
        this.f8460a = str;
        this.f8461b = str2;
        this.f8462c = x509Certificate;
    }

    public final X509Certificate a() {
        return this.f8462c;
    }

    public final String b() {
        return this.f8461b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return hc.t.a(this.f8460a, vVar.f8460a) && hc.t.a(this.f8461b, vVar.f8461b) && hc.t.a(this.f8462c, vVar.f8462c);
    }

    public int hashCode() {
        return (((this.f8460a.hashCode() * 31) + this.f8461b.hashCode()) * 31) + this.f8462c.hashCode();
    }

    public String toString() {
        String str = this.f8460a;
        String str2 = this.f8461b;
        X509Certificate x509Certificate = this.f8462c;
        return "TrustedCert(country=" + str + ", kid=" + str2 + ", certificate=" + x509Certificate + ")";
    }
}
