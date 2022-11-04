package bg;

import bf.x;
import bf.y;
import eg.c0;
import hc.t;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u001a"}, d2 = {"Lbg/d;", "Ljavax/net/ssl/HostnameVerifier;", BuildConfig.FLAVOR, "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", BuildConfig.FLAVOR, "h", "hostname", "g", "b", "d", "pattern", "f", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "c", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "e", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a */
    public static final d f6031a = new d();

    private d() {
    }

    private final String b(String str) {
        if (d(str)) {
            Locale locale = Locale.US;
            t.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            t.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
        List<String> h10;
        Object obj;
        List<String> h11;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                h11 = u.h();
                return h11;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && t.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            h10 = u.h();
            return h10;
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) c0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        boolean I;
        boolean u10;
        boolean I2;
        boolean u11;
        boolean u12;
        boolean u13;
        boolean N;
        boolean I3;
        int Z;
        boolean u14;
        int f02;
        if (!(str == null || str.length() == 0)) {
            I = x.I(str, ".", false, 2, null);
            if (!I) {
                u10 = x.u(str, "..", false, 2, null);
                if (!u10) {
                    if (!(str2 == null || str2.length() == 0)) {
                        I2 = x.I(str2, ".", false, 2, null);
                        if (!I2) {
                            u11 = x.u(str2, "..", false, 2, null);
                            if (!u11) {
                                u12 = x.u(str, ".", false, 2, null);
                                if (!u12) {
                                    str = t.l(str, ".");
                                }
                                String str3 = str;
                                u13 = x.u(str2, ".", false, 2, null);
                                if (!u13) {
                                    str2 = t.l(str2, ".");
                                }
                                String b10 = b(str2);
                                N = y.N(b10, "*", false, 2, null);
                                if (!N) {
                                    return t.a(str3, b10);
                                }
                                I3 = x.I(b10, "*.", false, 2, null);
                                if (I3) {
                                    Z = y.Z(b10, '*', 1, false, 4, null);
                                    if (Z != -1 || str3.length() < b10.length() || t.a("*.", b10)) {
                                        return false;
                                    }
                                    String substring = b10.substring(1);
                                    t.d(substring, "this as java.lang.String).substring(startIndex)");
                                    u14 = x.u(str3, substring, false, 2, null);
                                    if (!u14) {
                                        return false;
                                    }
                                    int length = str3.length() - substring.length();
                                    if (length > 0) {
                                        f02 = y.f0(str3, '.', length - 1, false, 4, null);
                                        if (f02 != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        List<String> c10 = c(x509Certificate, 2);
        if (!(c10 instanceof Collection) || !c10.isEmpty()) {
            for (String str2 : c10) {
                if (f6031a.f(b10, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = pf.a.e(str);
        List<String> c10 = c(x509Certificate, 7);
        if (!(c10 instanceof Collection) || !c10.isEmpty()) {
            for (String str2 : c10) {
                if (t.a(e10, pf.a.e(str2))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        List<String> o02;
        t.e(x509Certificate, "certificate");
        o02 = ub.c0.o0(c(x509Certificate, 7), c(x509Certificate, 2));
        return o02;
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        t.e(str, "host");
        t.e(x509Certificate, "certificate");
        return pf.d.i(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        t.e(str, "host");
        t.e(sSLSession, "session");
        if (d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return e(str, (X509Certificate) certificate);
    }
}
