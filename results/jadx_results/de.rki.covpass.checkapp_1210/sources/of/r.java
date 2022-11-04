package of;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016¨\u0006?"}, d2 = {"Lof/r;", BuildConfig.FLAVOR, "Lof/e;", "call", "Ltb/e0;", "f", "Lof/u;", "url", "p", BuildConfig.FLAVOR, "Ljava/net/Proxy;", "proxies", "o", BuildConfig.FLAVOR, "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", "m", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lof/s;", "handshake", "B", "Lof/y;", "protocol", "h", "Ljava/io/IOException;", "ioe", "i", "Lof/j;", "connection", "k", "l", "u", "Lof/z;", "request", "t", "r", BuildConfig.FLAVOR, "byteCount", "q", "s", "z", "Lof/b0;", "response", "y", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class r {
    public static final b Companion = new b(null);

    /* renamed from: a */
    public static final r f18288a = new a();

    @Metadata(bv = {}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"of/r$a", "Lof/r;", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends r {
        a() {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lof/r$b;", BuildConfig.FLAVOR, "Lof/r;", "NONE", "Lof/r;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lof/r$c;", BuildConfig.FLAVOR, "Lof/e;", "call", "Lof/r;", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public interface c {
        r a(e eVar);
    }

    public void A(e eVar, b0 b0Var) {
        hc.t.e(eVar, "call");
        hc.t.e(b0Var, "response");
    }

    public void B(e eVar, s sVar) {
        hc.t.e(eVar, "call");
    }

    public void C(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void a(e eVar, b0 b0Var) {
        hc.t.e(eVar, "call");
        hc.t.e(b0Var, "cachedResponse");
    }

    public void b(e eVar, b0 b0Var) {
        hc.t.e(eVar, "call");
        hc.t.e(b0Var, "response");
    }

    public void c(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void d(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void e(e eVar, IOException iOException) {
        hc.t.e(eVar, "call");
        hc.t.e(iOException, "ioe");
    }

    public void f(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void g(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, y yVar) {
        hc.t.e(eVar, "call");
        hc.t.e(inetSocketAddress, "inetSocketAddress");
        hc.t.e(proxy, "proxy");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, y yVar, IOException iOException) {
        hc.t.e(eVar, "call");
        hc.t.e(inetSocketAddress, "inetSocketAddress");
        hc.t.e(proxy, "proxy");
        hc.t.e(iOException, "ioe");
    }

    public void j(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        hc.t.e(eVar, "call");
        hc.t.e(inetSocketAddress, "inetSocketAddress");
        hc.t.e(proxy, "proxy");
    }

    public void k(e eVar, j jVar) {
        hc.t.e(eVar, "call");
        hc.t.e(jVar, "connection");
    }

    public void l(e eVar, j jVar) {
        hc.t.e(eVar, "call");
        hc.t.e(jVar, "connection");
    }

    public void m(e eVar, String str, List<InetAddress> list) {
        hc.t.e(eVar, "call");
        hc.t.e(str, "domainName");
        hc.t.e(list, "inetAddressList");
    }

    public void n(e eVar, String str) {
        hc.t.e(eVar, "call");
        hc.t.e(str, "domainName");
    }

    public void o(e eVar, u uVar, List<Proxy> list) {
        hc.t.e(eVar, "call");
        hc.t.e(uVar, "url");
        hc.t.e(list, "proxies");
    }

    public void p(e eVar, u uVar) {
        hc.t.e(eVar, "call");
        hc.t.e(uVar, "url");
    }

    public void q(e eVar, long j10) {
        hc.t.e(eVar, "call");
    }

    public void r(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void s(e eVar, IOException iOException) {
        hc.t.e(eVar, "call");
        hc.t.e(iOException, "ioe");
    }

    public void t(e eVar, z zVar) {
        hc.t.e(eVar, "call");
        hc.t.e(zVar, "request");
    }

    public void u(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void v(e eVar, long j10) {
        hc.t.e(eVar, "call");
    }

    public void w(e eVar) {
        hc.t.e(eVar, "call");
    }

    public void x(e eVar, IOException iOException) {
        hc.t.e(eVar, "call");
        hc.t.e(iOException, "ioe");
    }

    public void y(e eVar, b0 b0Var) {
        hc.t.e(eVar, "call");
        hc.t.e(b0Var, "response");
    }

    public void z(e eVar) {
        hc.t.e(eVar, "call");
    }
}
