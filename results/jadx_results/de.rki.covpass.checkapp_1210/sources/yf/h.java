package yf;

import hc.t;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.x;
import of.y;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.BuildConfig;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016¨\u0006/"}, d2 = {"Lyf/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "g", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", BuildConfig.FLAVOR, "Lof/y;", "protocols", "Ltb/e0;", "e", "b", "h", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", BuildConfig.FLAVOR, "connectTimeout", "f", "message", "level", BuildConfig.FLAVOR, "t", "k", BuildConfig.FLAVOR, "j", "closer", "i", "stackTrace", "m", "trustManager", "Lbg/c;", "c", "Lbg/e;", "d", "Ljavax/net/ssl/SSLSocketFactory;", "o", "toString", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class h {
    public static final a Companion;

    /* renamed from: a */
    private static volatile h f26282a;

    /* renamed from: b */
    private static final Logger f26283b = Logger.getLogger(x.class.getName());

    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lyf/h$a;", BuildConfig.FLAVOR, "Lyf/h;", "f", "d", "e", "g", BuildConfig.FLAVOR, "Lof/y;", "protocols", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", BuildConfig.FLAVOR, "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lyf/h;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h d() {
            zf.c.f26729a.b();
            h a10 = yf.a.Companion.a();
            if (a10 == null) {
                h a11 = b.Companion.a();
                t.b(a11);
                return a11;
            }
            return a10;
        }

        private final h e() {
            g a10;
            c a11;
            d b10;
            if (!j() || (b10 = d.Companion.b()) == null) {
                if (i() && (a11 = c.Companion.a()) != null) {
                    return a11;
                }
                if (k() && (a10 = g.Companion.a()) != null) {
                    return a10;
                }
                f a12 = f.Companion.a();
                if (a12 != null) {
                    return a12;
                }
                h a13 = e.Companion.a();
                return a13 != null ? a13 : new h();
            }
            return b10;
        }

        public final h f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return t.a(BouncyCastleProvider.PROVIDER_NAME, Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return t.a("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return t.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends y> list) {
            int s10;
            t.e(list, "protocols");
            ArrayList<y> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((y) obj) != y.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            s10 = v.s(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            for (y yVar : arrayList) {
                arrayList2.add(yVar.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends y> list) {
            t.e(list, "protocols");
            eg.c cVar = new eg.c();
            for (String str : b(list)) {
                cVar.i0(str.length());
                cVar.Q0(str);
            }
            return cVar.u0();
        }

        @fc.c
        public final h g() {
            return h.f26282a;
        }

        public final boolean h() {
            return t.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        f26282a = aVar.f();
    }

    public static /* synthetic */ void l(h hVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            hVar.k(str, i10, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
    }

    public bg.c c(X509TrustManager x509TrustManager) {
        t.e(x509TrustManager, "trustManager");
        return new bg.a(d(x509TrustManager));
    }

    public bg.e d(X509TrustManager x509TrustManager) {
        t.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        t.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new bg.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<y> list) {
        t.e(sSLSocket, "sslSocket");
        t.e(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        t.e(socket, "socket");
        t.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        t.e(str, "closer");
        if (f26283b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        t.e(str, "hostname");
        return true;
    }

    public void k(String str, int i10, Throwable th2) {
        t.e(str, "message");
        f26283b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void m(String str, Object obj) {
        t.e(str, "message");
        if (obj == null) {
            str = t.l(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        t.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        t.e(x509TrustManager, "trustManager");
        try {
            SSLContext n10 = n();
            n10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = n10.getSocketFactory();
            t.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(t.l("No System TLS: ", e10), e10);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        t.b(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        t.d(arrays, "toString(this)");
        throw new IllegalStateException(t.l("Unexpected default trust managers: ", arrays).toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        t.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
