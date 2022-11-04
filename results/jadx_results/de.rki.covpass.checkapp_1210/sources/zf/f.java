package zf;

import bf.x;
import hc.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.y;
import org.conscrypt.BuildConfig;
import zf.j;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lzf/f;", "Lzf/k;", BuildConfig.FLAVOR, "c", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lof/y;", "protocols", "Ltb/e0;", "d", "b", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class f implements k {
    public static final a Companion;

    /* renamed from: f */
    private static final j.a f26733f;

    /* renamed from: a */
    private final Class<? super SSLSocket> f26734a;

    /* renamed from: b */
    private final Method f26735b;

    /* renamed from: c */
    private final Method f26736c;

    /* renamed from: d */
    private final Method f26737d;

    /* renamed from: e */
    private final Method f26738e;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lzf/f$a;", BuildConfig.FLAVOR, "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lzf/f;", "b", BuildConfig.FLAVOR, "packageName", "Lzf/j$a;", "c", "playProviderFactory", "Lzf/j$a;", "d", "()Lzf/j$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"zf/f$a$a", "Lzf/j$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "a", "Lzf/k;", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: zf.f$a$a */
        /* loaded from: classes3.dex */
        public static final class C0481a implements j.a {

            /* renamed from: a */
            final /* synthetic */ String f26739a;

            C0481a(String str) {
                this.f26739a = str;
            }

            @Override // zf.j.a
            public boolean a(SSLSocket sSLSocket) {
                boolean I;
                t.e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                t.d(name, "sslSocket.javaClass.name");
                I = x.I(name, t.l(this.f26739a, "."), false, 2, null);
                return I;
            }

            @Override // zf.j.a
            public k b(SSLSocket sSLSocket) {
                t.e(sSLSocket, "sslSocket");
                return f.Companion.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !t.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(t.l("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            t.b(cls2);
            return new f(cls2);
        }

        public final j.a c(String str) {
            t.e(str, "packageName");
            return new C0481a(str);
        }

        public final j.a d() {
            return f.f26733f;
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        f26733f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) {
        t.e(cls, "sslSocketClass");
        this.f26734a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        t.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f26735b = declaredMethod;
        this.f26736c = cls.getMethod("setHostname", String.class);
        this.f26737d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f26738e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // zf.k
    public boolean a(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        return this.f26734a.isInstance(sSLSocket);
    }

    @Override // zf.k
    public String b(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f26737d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, bf.d.f5986b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && t.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // zf.k
    public boolean c() {
        return yf.b.Companion.b();
    }

    @Override // zf.k
    public void d(SSLSocket sSLSocket, String str, List<? extends y> list) {
        t.e(sSLSocket, "sslSocket");
        t.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f26735b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f26736c.invoke(sSLSocket, str);
                }
                this.f26738e.invoke(sSLSocket, yf.h.Companion.c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
