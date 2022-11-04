package yf;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import hc.t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.y;
import org.conscrypt.BuildConfig;
import ub.u;
import zf.i;
import zf.j;
import zf.k;
import zf.l;
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006%"}, d2 = {"Lyf/b;", "Lyf/h;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", BuildConfig.FLAVOR, "connectTimeout", "Ltb/e0;", "f", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lof/y;", "protocols", "e", "h", "closer", BuildConfig.FLAVOR, "i", "message", "stackTrace", "m", BuildConfig.FLAVOR, "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbg/c;", "c", "Lbg/e;", "d", "<init>", "()V", "a", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b extends h {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static final boolean f26261e;

    /* renamed from: c */
    private final List<k> f26262c;

    /* renamed from: d */
    private final zf.h f26263d;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lyf/b$a;", BuildConfig.FLAVOR, "Lyf/h;", "a", BuildConfig.FLAVOR, "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f26261e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¨\u0006\u0013"}, d2 = {"Lyf/b$b;", "Lbg/e;", "Ljava/security/cert/X509Certificate;", "cert", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: yf.b$b */
    /* loaded from: classes3.dex */
    public static final class C0463b implements bg.e {

        /* renamed from: a */
        private final X509TrustManager f26264a;

        /* renamed from: b */
        private final Method f26265b;

        public C0463b(X509TrustManager x509TrustManager, Method method) {
            t.e(x509TrustManager, "trustManager");
            t.e(method, "findByIssuerAndSignatureMethod");
            this.f26264a = x509TrustManager;
            this.f26265b = method;
        }

        @Override // bg.e
        public X509Certificate a(X509Certificate x509Certificate) {
            t.e(x509Certificate, "cert");
            try {
                Object invoke = this.f26265b.invoke(this.f26264a, x509Certificate);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
                }
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0463b)) {
                return false;
            }
            C0463b c0463b = (C0463b) obj;
            return t.a(this.f26264a, c0463b.f26264a) && t.a(this.f26265b, c0463b.f26265b);
        }

        public int hashCode() {
            return (this.f26264a.hashCode() * 31) + this.f26265b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f26264a + ", findByIssuerAndSignatureMethod=" + this.f26265b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.Companion.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f26261e = z10;
    }

    public b() {
        List m10;
        m10 = u.m(l.a.b(l.Companion, null, 1, null), new j(zf.f.Companion.d()), new j(i.Companion.a()), new j(zf.g.Companion.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (((k) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f26262c = arrayList;
        this.f26263d = zf.h.Companion.a();
    }

    @Override // yf.h
    public bg.c c(X509TrustManager x509TrustManager) {
        t.e(x509TrustManager, "trustManager");
        zf.b a10 = zf.b.Companion.a(x509TrustManager);
        return a10 == null ? super.c(x509TrustManager) : a10;
    }

    @Override // yf.h
    public bg.e d(X509TrustManager x509TrustManager) {
        t.e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            t.d(declaredMethod, "method");
            return new C0463b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // yf.h
    public void e(SSLSocket sSLSocket, String str, List<y> list) {
        Object obj;
        t.e(sSLSocket, "sslSocket");
        t.e(list, "protocols");
        Iterator<T> it = this.f26262c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return;
        }
        kVar.d(sSLSocket, str, list);
    }

    @Override // yf.h
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        t.e(socket, "socket");
        t.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // yf.h
    public String h(SSLSocket sSLSocket) {
        Object obj;
        t.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f26262c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return null;
        }
        return kVar.b(sSLSocket);
    }

    @Override // yf.h
    public Object i(String str) {
        t.e(str, "closer");
        return this.f26263d.a(str);
    }

    @Override // yf.h
    public boolean j(String str) {
        t.e(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // yf.h
    public void m(String str, Object obj) {
        t.e(str, "message");
        if (!this.f26263d.b(obj)) {
            h.l(this, str, 5, null, 4, null);
        }
    }
}
