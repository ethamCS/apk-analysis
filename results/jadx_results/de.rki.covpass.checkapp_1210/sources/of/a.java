package of;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import of.u;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:09\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?09\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0007¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048G¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020:098G¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?098G¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>¨\u0006F"}, d2 = {"Lof/a;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "that", "d", "(Lof/a;)Z", BuildConfig.FLAVOR, "toString", "Lof/q;", "dns", "Lof/q;", "c", "()Lof/q;", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "e", "()Ljavax/net/ssl/HostnameVerifier;", "Lof/g;", "certificatePinner", "Lof/g;", "a", "()Lof/g;", "Lof/b;", "proxyAuthenticator", "Lof/b;", "h", "()Lof/b;", "Ljava/net/Proxy;", "proxy", "Ljava/net/Proxy;", "g", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "proxySelector", "Ljava/net/ProxySelector;", "i", "()Ljava/net/ProxySelector;", "Lof/u;", "url", "Lof/u;", "l", "()Lof/u;", BuildConfig.FLAVOR, "Lof/y;", "protocols", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lof/l;", "connectionSpecs", "b", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILof/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lof/g;Lof/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private final q f18063a;

    /* renamed from: b */
    private final SocketFactory f18064b;

    /* renamed from: c */
    private final SSLSocketFactory f18065c;

    /* renamed from: d */
    private final HostnameVerifier f18066d;

    /* renamed from: e */
    private final g f18067e;

    /* renamed from: f */
    private final b f18068f;

    /* renamed from: g */
    private final Proxy f18069g;

    /* renamed from: h */
    private final ProxySelector f18070h;

    /* renamed from: i */
    private final u f18071i;

    /* renamed from: j */
    private final List<y> f18072j;

    /* renamed from: k */
    private final List<l> f18073k;

    public a(String str, int i10, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends y> list, List<l> list2, ProxySelector proxySelector) {
        hc.t.e(str, "uriHost");
        hc.t.e(qVar, "dns");
        hc.t.e(socketFactory, "socketFactory");
        hc.t.e(bVar, "proxyAuthenticator");
        hc.t.e(list, "protocols");
        hc.t.e(list2, "connectionSpecs");
        hc.t.e(proxySelector, "proxySelector");
        this.f18063a = qVar;
        this.f18064b = socketFactory;
        this.f18065c = sSLSocketFactory;
        this.f18066d = hostnameVerifier;
        this.f18067e = gVar;
        this.f18068f = bVar;
        this.f18069g = proxy;
        this.f18070h = proxySelector;
        this.f18071i = new u.a().v(sSLSocketFactory != null ? "https" : "http").l(str).r(i10).a();
        this.f18072j = pf.d.U(list);
        this.f18073k = pf.d.U(list2);
    }

    public final g a() {
        return this.f18067e;
    }

    public final List<l> b() {
        return this.f18073k;
    }

    public final q c() {
        return this.f18063a;
    }

    public final boolean d(a aVar) {
        hc.t.e(aVar, "that");
        return hc.t.a(this.f18063a, aVar.f18063a) && hc.t.a(this.f18068f, aVar.f18068f) && hc.t.a(this.f18072j, aVar.f18072j) && hc.t.a(this.f18073k, aVar.f18073k) && hc.t.a(this.f18070h, aVar.f18070h) && hc.t.a(this.f18069g, aVar.f18069g) && hc.t.a(this.f18065c, aVar.f18065c) && hc.t.a(this.f18066d, aVar.f18066d) && hc.t.a(this.f18067e, aVar.f18067e) && this.f18071i.l() == aVar.f18071i.l();
    }

    public final HostnameVerifier e() {
        return this.f18066d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (hc.t.a(this.f18071i, aVar.f18071i) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<y> f() {
        return this.f18072j;
    }

    public final Proxy g() {
        return this.f18069g;
    }

    public final b h() {
        return this.f18068f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f18071i.hashCode()) * 31) + this.f18063a.hashCode()) * 31) + this.f18068f.hashCode()) * 31) + this.f18072j.hashCode()) * 31) + this.f18073k.hashCode()) * 31) + this.f18070h.hashCode()) * 31) + Objects.hashCode(this.f18069g)) * 31) + Objects.hashCode(this.f18065c)) * 31) + Objects.hashCode(this.f18066d)) * 31) + Objects.hashCode(this.f18067e);
    }

    public final ProxySelector i() {
        return this.f18070h;
    }

    public final SocketFactory j() {
        return this.f18064b;
    }

    public final SSLSocketFactory k() {
        return this.f18065c;
    }

    public final u l() {
        return this.f18071i;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f18071i.h());
        sb2.append(':');
        sb2.append(this.f18071i.l());
        sb2.append(", ");
        Object obj = this.f18069g;
        if (obj != null) {
            str = "proxy=";
        } else {
            obj = this.f18070h;
            str = "proxySelector=";
        }
        sb2.append(hc.t.l(str, obj));
        sb2.append('}');
        return sb2.toString();
    }
}
