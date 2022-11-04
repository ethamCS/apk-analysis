package z8;

import android.annotation.SuppressLint;
import hc.t;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.m;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J9\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0015¨\u0006\u0019"}, d2 = {"Lz8/b;", "Ljavax/net/ssl/X509TrustManager;", BuildConfig.FLAVOR, "Ljava/security/cert/X509Certificate;", "chain", "Ltb/e0;", "b", "([Ljava/security/cert/X509Certificate;)V", "cert", "a", "c", "d", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", BuildConfig.FLAVOR, "authType", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "host", BuildConfig.FLAVOR, "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "delegate", "<init>", "(Ljavax/net/ssl/X509TrustManager;)V", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"CustomX509TrustManager"})
/* loaded from: classes.dex */
public final class b implements X509TrustManager {
    private static final a Companion = new a(null);
    @Deprecated

    /* renamed from: c */
    private static final List<String> f26509c;

    /* renamed from: a */
    private final X509TrustManager f26510a;

    /* renamed from: b */
    private final Method f26511b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lz8/b$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "MIN_EC_FIELD_SIZE_BITS", "I", "MIN_RSA_MODULUS_LEN_BITS", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "signatureWhitelist", "Ljava/util/List;", "<init>", "()V", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<String> k10;
        k10 = u.k("1.2.840.113549.1.1.11", "1.2.840.113549.1.1.12", "1.2.840.113549.1.1.13", "1.2.840.10045.4.3.2", "1.2.840.10045.4.3.3", "1.2.840.10045.4.3.4");
        f26509c = k10;
    }

    public b(X509TrustManager x509TrustManager) {
        Method method;
        t.e(x509TrustManager, "delegate");
        this.f26510a = x509TrustManager;
        try {
            method = x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.f26511b = method;
    }

    private final void a(X509Certificate x509Certificate) {
        c(x509Certificate);
        d(x509Certificate);
    }

    private final void b(X509Certificate[] x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            a(x509Certificate);
        }
    }

    private final void c(X509Certificate x509Certificate) {
        PublicKey publicKey = x509Certificate.getPublicKey();
        if (publicKey instanceof RSAPublicKey) {
            if (((RSAPublicKey) publicKey).getModulus().bitLength() < 2048) {
                throw new CertificateException("RSA modulus is < 2048 bits");
            }
        } else if (publicKey instanceof ECPublicKey) {
            if (((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize() < 256) {
                throw new CertificateException("EC key field size is < 256 bits");
            }
        } else {
            String name = publicKey.getClass().getName();
            throw new CertificateException("Rejecting unknown key class " + name);
        }
    }

    private final void d(X509Certificate x509Certificate) {
        if (f26509c.contains(x509Certificate.getSigAlgOID())) {
            return;
        }
        String sigAlgOID = x509Certificate.getSigAlgOID();
        throw new CertificateException("Signature uses an insecure hash function: " + sigAlgOID);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        t.e(x509CertificateArr, "chain");
        this.f26510a.checkClientTrusted(x509CertificateArr, str);
        b(x509CertificateArr);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        List<X509Certificate> list;
        t.e(x509CertificateArr, "chain");
        Method method = this.f26511b;
        if (method != null) {
            Object invoke = method.invoke(this.f26510a, x509CertificateArr, str, str2);
            list = invoke instanceof List ? (List) invoke : null;
        } else {
            this.f26510a.checkServerTrusted(x509CertificateArr, str);
            list = m.i0(x509CertificateArr);
        }
        b(x509CertificateArr);
        return list;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        t.e(x509CertificateArr, "chain");
        this.f26510a.checkServerTrusted(x509CertificateArr, str);
        b(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f26510a.getAcceptedIssuers();
        t.d(acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }
}
