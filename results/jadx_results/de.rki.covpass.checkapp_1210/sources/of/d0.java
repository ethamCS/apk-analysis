package of;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lof/d0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "other", "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Lof/a;", "address", "Lof/a;", "a", "()Lof/a;", "Ljava/net/Proxy;", "proxy", "Ljava/net/Proxy;", "b", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "socketAddress", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "<init>", "(Lof/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a */
    private final a f18158a;

    /* renamed from: b */
    private final Proxy f18159b;

    /* renamed from: c */
    private final InetSocketAddress f18160c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        hc.t.e(aVar, "address");
        hc.t.e(proxy, "proxy");
        hc.t.e(inetSocketAddress, "socketAddress");
        this.f18158a = aVar;
        this.f18159b = proxy;
        this.f18160c = inetSocketAddress;
    }

    public final a a() {
        return this.f18158a;
    }

    public final Proxy b() {
        return this.f18159b;
    }

    public final boolean c() {
        return this.f18158a.k() != null && this.f18159b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f18160c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (hc.t.a(d0Var.f18158a, this.f18158a) && hc.t.a(d0Var.f18159b, this.f18159b) && hc.t.a(d0Var.f18160c, this.f18160c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f18158a.hashCode()) * 31) + this.f18159b.hashCode()) * 31) + this.f18160c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f18160c + '}';
    }
}
