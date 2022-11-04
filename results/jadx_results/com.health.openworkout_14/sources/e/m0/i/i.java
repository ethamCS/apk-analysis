package e.m0.i;

import e.g0;
import e.z;
import java.net.Proxy;
/* loaded from: classes.dex */
public final class i {
    public static String a(g0 g0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(g0Var.f());
        sb.append(' ');
        boolean b2 = b(g0Var, type);
        z i = g0Var.i();
        if (b2) {
            sb.append(i);
        } else {
            sb.append(c(i));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(g0 g0Var, Proxy.Type type) {
        return !g0Var.e() && type == Proxy.Type.HTTP;
    }

    public static String c(z zVar) {
        String h2 = zVar.h();
        String j = zVar.j();
        if (j != null) {
            return h2 + '?' + j;
        }
        return h2;
    }
}
