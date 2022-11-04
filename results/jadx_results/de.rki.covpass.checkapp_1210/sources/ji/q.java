package ji;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;
/* loaded from: classes3.dex */
public class q<T extends Certificate> implements ak.n<T> {

    /* renamed from: c */
    private final CertSelector f14418c;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final CertSelector f14419a;

        public b(CertSelector certSelector) {
            this.f14419a = (CertSelector) certSelector.clone();
        }

        public q<? extends Certificate> a() {
            return new q<>(this.f14419a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends X509CertSelector {

        /* renamed from: c */
        private final q f14420c;

        c(q qVar) {
            this.f14420c = qVar;
            if (qVar.f14418c instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) qVar.f14418c;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e10) {
                    throw new IllegalStateException("base selector invalid: " + e10.getMessage(), e10);
                }
            }
        }

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public boolean match(Certificate certificate) {
            q qVar = this.f14420c;
            return qVar == null ? certificate != null : qVar.z(certificate);
        }
    }

    private q(CertSelector certSelector) {
        this.f14418c = certSelector;
    }

    public static Collection<? extends Certificate> d(q qVar, CertStore certStore) {
        return certStore.getCertificates(new c(qVar));
    }

    public Certificate c() {
        CertSelector certSelector = this.f14418c;
        if (certSelector instanceof X509CertSelector) {
            return ((X509CertSelector) certSelector).getCertificate();
        }
        return null;
    }

    @Override // ak.n
    public Object clone() {
        return new q(this.f14418c);
    }

    /* renamed from: match */
    public boolean z(Certificate certificate) {
        return this.f14418c.match(certificate);
    }
}
