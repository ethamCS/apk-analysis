package ek;

import java.security.cert.X509Certificate;
import org.bouncycastle.jce.provider.X509CertificateObject;
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a */
    private final ni.c f9714a = new ni.a();

    /* renamed from: b */
    private X509Certificate f9715b;

    /* renamed from: c */
    private X509Certificate f9716c;

    public l(hh.p pVar) {
        if (pVar.l() != null) {
            this.f9715b = new X509CertificateObject(pVar.l());
        }
        if (pVar.n() != null) {
            this.f9716c = new X509CertificateObject(pVar.n());
        }
    }

    public X509Certificate a() {
        return this.f9715b;
    }

    public X509Certificate b() {
        return this.f9716c;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            X509Certificate x509Certificate = this.f9715b;
            boolean equals = x509Certificate != null ? x509Certificate.equals(lVar.f9715b) : lVar.f9715b == null;
            X509Certificate x509Certificate2 = this.f9716c;
            X509Certificate x509Certificate3 = lVar.f9716c;
            return equals && (x509Certificate2 != null ? x509Certificate2.equals(x509Certificate3) : x509Certificate3 == null);
        }
        return false;
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.f9715b;
        int i10 = -1;
        if (x509Certificate != null) {
            i10 = (-1) ^ x509Certificate.hashCode();
        }
        X509Certificate x509Certificate2 = this.f9716c;
        return x509Certificate2 != null ? (i10 * 17) ^ x509Certificate2.hashCode() : i10;
    }
}
