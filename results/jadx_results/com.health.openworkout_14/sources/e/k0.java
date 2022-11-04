package e;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    final e f4031a;

    /* renamed from: b */
    final Proxy f4032b;

    /* renamed from: c */
    final InetSocketAddress f4033c;

    public k0(e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(eVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f4031a = eVar;
        this.f4032b = proxy;
        this.f4033c = inetSocketAddress;
    }

    public e a() {
        return this.f4031a;
    }

    public Proxy b() {
        return this.f4032b;
    }

    public boolean c() {
        return this.f4031a.i != null && this.f4032b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f4033c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (k0Var.f4031a.equals(this.f4031a) && k0Var.f4032b.equals(this.f4032b) && k0Var.f4033c.equals(this.f4033c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f4031a.hashCode()) * 31) + this.f4032b.hashCode()) * 31) + this.f4033c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f4033c + "}";
    }
}
