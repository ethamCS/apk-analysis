package e.m0.n;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f4364a = new LinkedHashMap();

    public b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f4364a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f4364a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // e.m0.n.e
    public X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f4364a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && ((b) obj).f4364a.equals(this.f4364a);
    }

    public int hashCode() {
        return this.f4364a.hashCode();
    }
}
