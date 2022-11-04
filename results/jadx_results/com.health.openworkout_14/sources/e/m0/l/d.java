package e.m0.l;

import e.e0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class d extends f {

    /* renamed from: c */
    private final Method f4351c;

    /* renamed from: d */
    private final Method f4352d;

    /* renamed from: e */
    private final Method f4353e;

    /* renamed from: f */
    private final Class<?> f4354f;

    /* renamed from: g */
    private final Class<?> f4355g;

    /* loaded from: classes.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f4356a;

        /* renamed from: b */
        boolean f4357b;

        /* renamed from: c */
        String f4358c;

        a(List<String> list) {
            this.f4356a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.m0.e.f4063b;
            }
            if (!name.equals("supports") || Boolean.TYPE != returnType) {
                if (name.equals("unsupported") && Void.TYPE == returnType) {
                    this.f4357b = true;
                    return null;
                } else if (name.equals("protocols") && objArr.length == 0) {
                    return this.f4356a;
                } else {
                    if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                            return method.invoke(this, objArr);
                        }
                        this.f4358c = (String) objArr[0];
                        return null;
                    }
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f4356a.contains(str)) {
                            this.f4358c = str;
                            return str;
                        }
                    }
                    String str2 = this.f4356a.get(0);
                    this.f4358c = str2;
                    return str2;
                }
            }
            return Boolean.TRUE;
        }
    }

    d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f4351c = method;
        this.f4352d = method2;
        this.f4353e = method3;
        this.f4354f = cls;
        this.f4355g = cls2;
    }

    public static f r() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            return new d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // e.m0.l.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f4353e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // e.m0.l.f
    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        try {
            this.f4351c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f4354f, this.f4355g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // e.m0.l.f
    @Nullable
    public String l(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f4352d.invoke(null, sSLSocket));
            boolean z = aVar.f4357b;
            if (!z && aVar.f4358c == null) {
                f.j().p(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (!z) {
                return aVar.f4358c;
            } else {
                return null;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
