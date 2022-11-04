package e;

import e.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    final z f3950a;

    /* renamed from: b */
    final u f3951b;

    /* renamed from: c */
    final SocketFactory f3952c;

    /* renamed from: d */
    final g f3953d;

    /* renamed from: e */
    final List<e0> f3954e;

    /* renamed from: f */
    final List<p> f3955f;

    /* renamed from: g */
    final ProxySelector f3956g;
    @Nullable

    /* renamed from: h */
    final Proxy f3957h;
    @Nullable
    final SSLSocketFactory i;
    @Nullable
    final HostnameVerifier j;
    @Nullable
    final l k;

    public e(String str, int i, u uVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable l lVar, g gVar, @Nullable Proxy proxy, List<e0> list, List<p> list2, ProxySelector proxySelector) {
        z.a aVar = new z.a();
        aVar.s(sSLSocketFactory != null ? "https" : "http");
        aVar.g(str);
        aVar.n(i);
        this.f3950a = aVar.c();
        Objects.requireNonNull(uVar, "dns == null");
        this.f3951b = uVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f3952c = socketFactory;
        Objects.requireNonNull(gVar, "proxyAuthenticator == null");
        this.f3953d = gVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f3954e = e.m0.e.r(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f3955f = e.m0.e.r(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f3956g = proxySelector;
        this.f3957h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = lVar;
    }

    @Nullable
    public l a() {
        return this.k;
    }

    public List<p> b() {
        return this.f3955f;
    }

    public u c() {
        return this.f3951b;
    }

    public boolean d(e eVar) {
        return this.f3951b.equals(eVar.f3951b) && this.f3953d.equals(eVar.f3953d) && this.f3954e.equals(eVar.f3954e) && this.f3955f.equals(eVar.f3955f) && this.f3956g.equals(eVar.f3956g) && Objects.equals(this.f3957h, eVar.f3957h) && Objects.equals(this.i, eVar.i) && Objects.equals(this.j, eVar.j) && Objects.equals(this.k, eVar.k) && l().y() == eVar.l().y();
    }

    @Nullable
    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f3950a.equals(eVar.f3950a) && d(eVar)) {
                return true;
            }
        }
        return false;
    }

    public List<e0> f() {
        return this.f3954e;
    }

    @Nullable
    public Proxy g() {
        return this.f3957h;
    }

    public g h() {
        return this.f3953d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f3950a.hashCode()) * 31) + this.f3951b.hashCode()) * 31) + this.f3953d.hashCode()) * 31) + this.f3954e.hashCode()) * 31) + this.f3955f.hashCode()) * 31) + this.f3956g.hashCode()) * 31) + Objects.hashCode(this.f3957h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    public ProxySelector i() {
        return this.f3956g;
    }

    public SocketFactory j() {
        return this.f3952c;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.i;
    }

    public z l() {
        return this.f3950a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f3950a.m());
        sb.append(":");
        sb.append(this.f3950a.y());
        if (this.f3957h != null) {
            sb.append(", proxy=");
            obj = this.f3957h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f3956g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
