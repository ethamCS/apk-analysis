package of;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B;\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u0012\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00170 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u00020\u0007*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00178GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001b¨\u0006$"}, d2 = {"Lof/s;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/security/cert/Certificate;", "b", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lof/e0;", "tlsVersion", "Lof/e0;", "e", "()Lof/e0;", "Lof/i;", "cipherSuite", "Lof/i;", "a", "()Lof/i;", BuildConfig.FLAVOR, "localCertificates", "Ljava/util/List;", "c", "()Ljava/util/List;", "peerCertificates$delegate", "Lkotlin/Lazy;", "d", "peerCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lof/e0;Lof/i;Ljava/util/List;Lgc/a;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final e0 f18289a;

    /* renamed from: b */
    private final i f18290b;

    /* renamed from: c */
    private final List<Certificate> f18291c;

    /* renamed from: d */
    private final Lazy f18292d;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lof/s$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", BuildConfig.FLAVOR, "c", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lof/s;", "a", "(Ljavax/net/ssl/SSLSession;)Lof/s;", "Lof/e0;", "tlsVersion", "Lof/i;", "cipherSuite", "peerCertificates", "localCertificates", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: of.s$a$a */
        /* loaded from: classes3.dex */
        public static final class C0290a extends hc.v implements gc.a<List<? extends Certificate>> {

            /* renamed from: c */
            final /* synthetic */ List<Certificate> f18293c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0290a(List<? extends Certificate> list) {
                super(0);
                this.f18293c = list;
            }

            @Override // gc.a
            public final List<? extends Certificate> invoke() {
                return this.f18293c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends hc.v implements gc.a<List<? extends Certificate>> {

            /* renamed from: c */
            final /* synthetic */ List<Certificate> f18294c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(List<? extends Certificate> list) {
                super(0);
                this.f18294c = list;
            }

            @Override // gc.a
            public final List<? extends Certificate> invoke() {
                return this.f18294c;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            List<Certificate> h10;
            if (certificateArr != null) {
                return pf.d.w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            h10 = ub.u.h();
            return h10;
        }

        @fc.c
        public final s a(SSLSession sSLSession) {
            List<Certificate> list;
            hc.t.e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (hc.t.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : hc.t.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException(hc.t.l("cipherSuite == ", cipherSuite));
                }
                i b10 = i.Companion.b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                if (hc.t.a("NONE", protocol)) {
                    throw new IOException("tlsVersion == NONE");
                }
                e0 a10 = e0.Companion.a(protocol);
                try {
                    list = c(sSLSession.getPeerCertificates());
                } catch (SSLPeerUnverifiedException unused) {
                    list = ub.u.h();
                }
                return new s(a10, b10, c(sSLSession.getLocalCertificates()), new b(list));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        @fc.c
        public final s b(e0 e0Var, i iVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
            hc.t.e(e0Var, "tlsVersion");
            hc.t.e(iVar, "cipherSuite");
            hc.t.e(list, "peerCertificates");
            hc.t.e(list2, "localCertificates");
            return new s(e0Var, iVar, pf.d.U(list2), new C0290a(pf.d.U(list)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<List<? extends Certificate>> {

        /* renamed from: c */
        final /* synthetic */ gc.a<List<Certificate>> f18295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(gc.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f18295c = aVar;
        }

        @Override // gc.a
        public final List<? extends Certificate> invoke() {
            List<? extends Certificate> h10;
            try {
                return this.f18295c.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                h10 = ub.u.h();
                return h10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(e0 e0Var, i iVar, List<? extends Certificate> list, gc.a<? extends List<? extends Certificate>> aVar) {
        Lazy a10;
        hc.t.e(e0Var, "tlsVersion");
        hc.t.e(iVar, "cipherSuite");
        hc.t.e(list, "localCertificates");
        hc.t.e(aVar, "peerCertificatesFn");
        this.f18289a = e0Var;
        this.f18290b = iVar;
        this.f18291c = list;
        a10 = tb.m.a(new b(aVar));
        this.f18292d = a10;
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        hc.t.d(type, "type");
        return type;
    }

    public final i a() {
        return this.f18290b;
    }

    public final List<Certificate> c() {
        return this.f18291c;
    }

    public final List<Certificate> d() {
        return (List) this.f18292d.getValue();
    }

    public final e0 e() {
        return this.f18289a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f18289a == this.f18289a && hc.t.a(sVar.f18290b, this.f18290b) && hc.t.a(sVar.d(), d()) && hc.t.a(sVar.f18291c, this.f18291c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f18289a.hashCode()) * 31) + this.f18290b.hashCode()) * 31) + d().hashCode()) * 31) + this.f18291c.hashCode();
    }

    public String toString() {
        int s10;
        int s11;
        List<Certificate> d10 = d();
        s10 = ub.v.s(d10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Certificate certificate : d10) {
            arrayList.add(b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f18289a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f18290b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f18291c;
        s11 = ub.v.s(list, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (Certificate certificate2 : list) {
            arrayList2.add(b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
