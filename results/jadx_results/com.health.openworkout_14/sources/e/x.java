package e;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    private final l0 f4403a;

    /* renamed from: b */
    private final m f4404b;

    /* renamed from: c */
    private final List<Certificate> f4405c;

    /* renamed from: d */
    private final List<Certificate> f4406d;

    private x(l0 l0Var, m mVar, List<Certificate> list, List<Certificate> list2) {
        this.f4403a = l0Var;
        this.f4404b = mVar;
        this.f4405c = list;
        this.f4406d = list2;
    }

    public static x b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
            m a2 = m.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            l0 a3 = l0.a(protocol);
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            List s = certificateArr != null ? e.m0.e.s(certificateArr) : Collections.emptyList();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new x(a3, a2, s, localCertificates != null ? e.m0.e.s(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    private List<String> c(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public m a() {
        return this.f4404b;
    }

    public List<Certificate> d() {
        return this.f4405c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f4403a.equals(xVar.f4403a) && this.f4404b.equals(xVar.f4404b) && this.f4405c.equals(xVar.f4405c) && this.f4406d.equals(xVar.f4406d);
    }

    public int hashCode() {
        return ((((((527 + this.f4403a.hashCode()) * 31) + this.f4404b.hashCode()) * 31) + this.f4405c.hashCode()) * 31) + this.f4406d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f4403a + " cipherSuite=" + this.f4404b + " peerCertificates=" + c(this.f4405c) + " localCertificates=" + c(this.f4406d) + '}';
    }
}
