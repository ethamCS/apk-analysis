package e.m0.l;

import android.os.Build;
import android.util.Log;
import e.e0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: c */
    private final Class<?> f4338c;

    /* renamed from: d */
    private final Method f4339d;

    /* renamed from: e */
    private final Method f4340e;

    /* renamed from: f */
    private final Method f4341f;

    /* renamed from: g */
    private final Method f4342g;

    /* renamed from: h */
    private final C0116b f4343h = C0116b.b();

    /* loaded from: classes.dex */
    static final class a extends e.m0.n.c {

        /* renamed from: a */
        private final Object f4344a;

        /* renamed from: b */
        private final Method f4345b;

        a(Object obj, Method method) {
            this.f4344a = obj;
            this.f4345b = method;
        }

        @Override // e.m0.n.c
        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.f4345b.invoke(this.f4344a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.m0.l.b$b */
    /* loaded from: classes.dex */
    public static final class C0116b {

        /* renamed from: a */
        private final Method f4346a;

        /* renamed from: b */
        private final Method f4347b;

        /* renamed from: c */
        private final Method f4348c;

        C0116b(Method method, Method method2, Method method3) {
            this.f4346a = method;
            this.f4347b = method2;
            this.f4348c = method3;
        }

        static C0116b b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C0116b(method3, method, method2);
        }

        Object a(String str) {
            Method method = this.f4346a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f4347b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean c(Object obj) {
            if (obj != null) {
                try {
                    this.f4348c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static final class c implements e.m0.n.e {

        /* renamed from: a */
        private final X509TrustManager f4349a;

        /* renamed from: b */
        private final Method f4350b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.f4350b = method;
            this.f4349a = x509TrustManager;
        }

        @Override // e.m0.n.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f4350b.invoke(this.f4349a, x509Certificate);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4349a.equals(cVar.f4349a) && this.f4350b.equals(cVar.f4350b);
        }

        public int hashCode() {
            return this.f4349a.hashCode() + (this.f4350b.hashCode() * 31);
        }
    }

    public b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f4338c = cls2;
        this.f4339d = method;
        this.f4340e = method2;
        this.f4341f = method3;
        this.f4342g = method4;
    }

    private boolean r(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.n(str);
        }
    }

    private boolean s(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return r(str, cls, obj);
        }
    }

    @Nullable
    public static f t() {
        int i = Build.VERSION.SDK_INT;
        if (u() == 0) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (i >= 21) {
                try {
                    return new b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new IllegalStateException("Expected Android API level 21+ but was " + i);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int u() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // e.m0.l.f
    public e.m0.n.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // e.m0.l.f
    public e.m0.n.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // e.m0.l.f
    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        if (!this.f4338c.isInstance(sSLSocket)) {
            return;
        }
        if (str != null) {
            try {
                this.f4339d.invoke(sSLSocket, Boolean.TRUE);
                this.f4340e.invoke(sSLSocket, str);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
        this.f4342g.invoke(sSLSocket, f.e(list));
    }

    @Override // e.m0.l.f
    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (!e.m0.e.y(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // e.m0.l.f
    public SSLContext k() {
        boolean z = true;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 16 || i >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // e.m0.l.f
    @Nullable
    public String l(SSLSocket sSLSocket) {
        if (!this.f4338c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f4341f.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // e.m0.l.f
    @Nullable
    public Object m(String str) {
        return this.f4343h.a(str);
    }

    @Override // e.m0.l.f
    public boolean n(String str) {
        Throwable e2;
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return s(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.n(str);
        } catch (IllegalAccessException e3) {
            e2 = e3;
            throw new AssertionError("unable to determine cleartext support", e2);
        } catch (IllegalArgumentException e4) {
            e2 = e4;
            throw new AssertionError("unable to determine cleartext support", e2);
        } catch (InvocationTargetException e5) {
            e2 = e5;
            throw new AssertionError("unable to determine cleartext support", e2);
        }
    }

    @Override // e.m0.l.f
    public void p(int i, String str, @Nullable Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // e.m0.l.f
    public void q(String str, Object obj) {
        if (!this.f4343h.c(obj)) {
            p(5, str, null);
        }
    }
}
