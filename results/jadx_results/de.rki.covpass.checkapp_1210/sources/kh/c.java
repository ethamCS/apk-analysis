package kh;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import jh.e;
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a */
    private kh.a f15278a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends CertificateException {

        /* renamed from: c */
        private Throwable f15279c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th2) {
            super(str);
            c.this = r1;
            this.f15279c = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f15279c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends CertificateParsingException {

        /* renamed from: c */
        private Throwable f15281c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Throwable th2) {
            super(str);
            c.this = r1;
            this.f15281c = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f15281c;
        }
    }

    public c() {
        this.f15278a = new kh.b();
        this.f15278a = new kh.b();
    }

    public X509Certificate a(e eVar) {
        try {
            return (X509Certificate) this.f15278a.b("X.509").generateCertificate(new ByteArrayInputStream(eVar.getEncoded()));
        } catch (IOException e10) {
            throw new b("exception parsing certificate: " + e10.getMessage(), e10);
        } catch (NoSuchProviderException e11) {
            throw new a("cannot find required provider:" + e11.getMessage(), e11);
        }
    }
}
