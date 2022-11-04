package yf;

import hc.t;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.y;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0016\u000bB7\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, d2 = {"Lyf/e;", "Lyf/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lof/y;", "protocols", "Ltb/e0;", "e", "b", "h", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e extends h {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private final Method f26271c;

    /* renamed from: d */
    private final Method f26272d;

    /* renamed from: e */
    private final Method f26273e;

    /* renamed from: f */
    private final Class<?> f26274f;

    /* renamed from: g */
    private final Class<?> f26275g;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lyf/e$a;", "Ljava/lang/reflect/InvocationHandler;", BuildConfig.FLAVOR, "proxy", "Ljava/lang/reflect/Method;", "method", BuildConfig.FLAVOR, "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "unsupported", "Z", "b", "()Z", "setUnsupported", "(Z)V", BuildConfig.FLAVOR, "selected", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "protocols", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    private static final class a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f26276a;

        /* renamed from: b */
        private boolean f26277b;

        /* renamed from: c */
        private String f26278c;

        public a(List<String> list) {
            t.e(list, "protocols");
            this.f26276a = list;
        }

        public final String a() {
            return this.f26278c;
        }

        public final boolean b() {
            return this.f26277b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            t.e(obj, "proxy");
            t.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (!t.a(name, "supports") || !t.a(Boolean.TYPE, returnType)) {
                if (t.a(name, "unsupported") && t.a(Void.TYPE, returnType)) {
                    this.f26277b = true;
                    return null;
                }
                if (t.a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f26276a;
                    }
                }
                if ((!t.a(name, "selectProtocol") && !t.a(name, "select")) || !t.a(String.class, returnType) || objArr.length != 1 || !(objArr[0] instanceof List)) {
                    if ((!t.a(name, "protocolSelected") && !t.a(name, "selected")) || objArr.length != 1) {
                        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                    }
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    this.f26278c = (String) obj2;
                    return null;
                }
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj3;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        Object obj4 = list.get(i10);
                        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj4;
                        if (this.f26276a.contains(str)) {
                            this.f26278c = str;
                            return str;
                        } else if (i10 == size) {
                            break;
                        } else {
                            i10 = i11;
                        }
                    }
                }
                String str2 = this.f26276a.get(0);
                this.f26278c = str2;
                return str2;
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lyf/e$b;", BuildConfig.FLAVOR, "Lyf/h;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                t.d(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(t.l("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> cls3 = Class.forName(t.l("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> cls4 = Class.forName(t.l("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                t.d(method, "putMethod");
                t.d(method2, "getMethod");
                t.d(method3, "removeMethod");
                t.d(cls3, "clientProviderClass");
                t.d(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        t.e(method, "putMethod");
        t.e(method2, "getMethod");
        t.e(method3, "removeMethod");
        t.e(cls, "clientProviderClass");
        t.e(cls2, "serverProviderClass");
        this.f26271c = method;
        this.f26272d = method2;
        this.f26273e = method3;
        this.f26274f = cls;
        this.f26275g = cls2;
    }

    @Override // yf.h
    public void b(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        try {
            this.f26273e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // yf.h
    public void e(SSLSocket sSLSocket, String str, List<? extends y> list) {
        t.e(sSLSocket, "sslSocket");
        t.e(list, "protocols");
        try {
            this.f26271c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f26274f, this.f26275g}, new a(h.Companion.b(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // yf.h
    public String h(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f26272d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            } else if (!aVar.b()) {
                return aVar.a();
            } else {
                return null;
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
