package e;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c */
    public static final l f4034c = new a().a();

    /* renamed from: a */
    private final Set<b> f4035a;
    @Nullable

    /* renamed from: b */
    private final e.m0.n.c f4036b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<b> f4037a = new ArrayList();

        public l a() {
            return new l(new LinkedHashSet(this.f4037a), null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final String f4038a;

        /* renamed from: b */
        final String f4039b;

        /* renamed from: c */
        final String f4040c;

        /* renamed from: d */
        final f.f f4041d;

        boolean a(String str) {
            if (this.f4038a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == this.f4039b.length()) {
                    String str2 = this.f4039b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        return true;
                    }
                }
                return false;
            }
            return str.equals(this.f4039b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f4038a.equals(bVar.f4038a) && this.f4040c.equals(bVar.f4040c) && this.f4041d.equals(bVar.f4041d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f4038a.hashCode()) * 31) + this.f4040c.hashCode()) * 31) + this.f4041d.hashCode();
        }

        public String toString() {
            return this.f4040c + this.f4041d.a();
        }
    }

    l(Set<b> set, @Nullable e.m0.n.c cVar) {
        this.f4035a = set;
        this.f4036b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + e((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static f.f d(X509Certificate x509Certificate) {
        return f.f.m(x509Certificate.getPublicKey().getEncoded()).p();
    }

    static f.f e(X509Certificate x509Certificate) {
        return f.f.m(x509Certificate.getPublicKey().getEncoded()).q();
    }

    public void a(String str, List<Certificate> list) {
        List<b> b2 = b(str);
        if (b2.isEmpty()) {
            return;
        }
        e.m0.n.c cVar = this.f4036b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = b2.size();
            f.f fVar = null;
            f.f fVar2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = b2.get(i2);
                if (bVar.f4040c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = e(x509Certificate);
                    }
                    if (bVar.f4041d.equals(fVar)) {
                        return;
                    }
                } else if (!bVar.f4040c.equals("sha1/")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + bVar.f4040c);
                } else {
                    if (fVar2 == null) {
                        fVar2 = d(x509Certificate);
                    }
                    if (bVar.f4041d.equals(fVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = b2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            sb.append("\n    ");
            sb.append(b2.get(i4));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f4035a) {
            if (bVar.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (Objects.equals(this.f4036b, lVar.f4036b) && this.f4035a.equals(lVar.f4035a)) {
                return true;
            }
        }
        return false;
    }

    public l f(@Nullable e.m0.n.c cVar) {
        return Objects.equals(this.f4036b, cVar) ? this : new l(this.f4035a, cVar);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f4036b) * 31) + this.f4035a.hashCode();
    }
}
