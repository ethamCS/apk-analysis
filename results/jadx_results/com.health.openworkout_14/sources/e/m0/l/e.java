package e.m0.l;

import e.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c */
    final Method f4359c;

    /* renamed from: d */
    final Method f4360d;

    e(Method method, Method method2) {
        this.f4359c = method;
        this.f4360d = method2;
    }

    public static e r() {
        try {
            return new e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // e.m0.l.f
    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b2 = f.b(list);
            this.f4359c.invoke(sSLParameters, b2.toArray(new String[b2.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set SSL parameters", e2);
        }
    }

    @Override // e.m0.l.f
    @Nullable
    public String l(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f4360d.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (!str.equals("")) {
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
