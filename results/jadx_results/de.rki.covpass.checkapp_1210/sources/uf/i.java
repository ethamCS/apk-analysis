package uf;

import hc.t;
import java.net.Proxy;
import kotlin.Metadata;
import of.u;
import of.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Luf/i;", BuildConfig.FLAVOR, "Lof/z;", "request", "Ljava/net/Proxy$Type;", "proxyType", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "a", "Lof/u;", "url", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a */
    public static final i f23624a = new i();

    private i() {
    }

    private final boolean b(z zVar, Proxy.Type type) {
        return !zVar.g() && type == Proxy.Type.HTTP;
    }

    public final String a(z zVar, Proxy.Type type) {
        t.e(zVar, "request");
        t.e(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zVar.h());
        sb2.append(' ');
        i iVar = f23624a;
        boolean b10 = iVar.b(zVar, type);
        u j10 = zVar.j();
        if (b10) {
            sb2.append(j10);
        } else {
            sb2.append(iVar.c(j10));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String c(u uVar) {
        t.e(uVar, "url");
        String d10 = uVar.d();
        String f10 = uVar.f();
        if (f10 != null) {
            return d10 + '?' + ((Object) f10);
        }
        return d10;
    }
}
