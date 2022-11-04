package tf;

import hc.t;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.d0;
import of.r;
import org.conscrypt.BuildConfig;
import ub.u;
import ub.z;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\f\tB'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002¨\u0006\u0019"}, d2 = {"Ltf/j;", BuildConfig.FLAVOR, "Lof/u;", "url", "Ljava/net/Proxy;", "proxy", "Ltb/e0;", "f", BuildConfig.FLAVOR, "b", "d", "e", "a", "Ltf/j$b;", "c", "Lof/a;", "address", "Ltf/h;", "routeDatabase", "Lof/e;", "call", "Lof/r;", "eventListener", "<init>", "(Lof/a;Ltf/h;Lof/e;Lof/r;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final of.a f22308a;

    /* renamed from: b */
    private final h f22309b;

    /* renamed from: c */
    private final of.e f22310c;

    /* renamed from: d */
    private final r f22311d;

    /* renamed from: e */
    private List<? extends Proxy> f22312e;

    /* renamed from: f */
    private int f22313f;

    /* renamed from: g */
    private List<? extends InetSocketAddress> f22314g;

    /* renamed from: h */
    private final List<d0> f22315h = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Ltf/j$a;", BuildConfig.FLAVOR, "Ljava/net/InetSocketAddress;", BuildConfig.FLAVOR, "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            String hostAddress;
            String str;
            t.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            t.d(hostAddress, str);
            return hostAddress;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Ltf/j$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Lof/d0;", "c", BuildConfig.FLAVOR, "routes", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final List<d0> f22316a;

        /* renamed from: b */
        private int f22317b;

        public b(List<d0> list) {
            t.e(list, "routes");
            this.f22316a = list;
        }

        public final List<d0> a() {
            return this.f22316a;
        }

        public final boolean b() {
            return this.f22317b < this.f22316a.size();
        }

        public final d0 c() {
            if (b()) {
                List<d0> list = this.f22316a;
                int i10 = this.f22317b;
                this.f22317b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public j(of.a aVar, h hVar, of.e eVar, r rVar) {
        List<? extends Proxy> h10;
        List<? extends InetSocketAddress> h11;
        t.e(aVar, "address");
        t.e(hVar, "routeDatabase");
        t.e(eVar, "call");
        t.e(rVar, "eventListener");
        this.f22308a = aVar;
        this.f22309b = hVar;
        this.f22310c = eVar;
        this.f22311d = rVar;
        h10 = u.h();
        this.f22312e = h10;
        h11 = u.h();
        this.f22314g = h11;
        f(aVar.l(), aVar.g());
    }

    private final boolean b() {
        return this.f22313f < this.f22312e.size();
    }

    private final Proxy d() {
        if (b()) {
            List<? extends Proxy> list = this.f22312e;
            int i10 = this.f22313f;
            this.f22313f = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f22308a.l().h() + "; exhausted proxy configurations: " + this.f22312e);
    }

    private final void e(Proxy proxy) {
        String str;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f22314g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f22308a.l().h();
            i10 = this.f22308a.l().l();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(t.l("Proxy.address() is not an InetSocketAddress: ", address.getClass()).toString());
            }
            a aVar = Companion;
            t.d(address, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            str = aVar.a(inetSocketAddress);
            i10 = inetSocketAddress.getPort();
        }
        boolean z10 = false;
        if (1 <= i10 && i10 < 65536) {
            z10 = true;
        }
        if (!z10) {
            throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
        } else if (proxy.type() != Proxy.Type.SOCKS) {
            this.f22311d.n(this.f22310c, str);
            List<InetAddress> a10 = this.f22308a.c().a(str);
            if (!a10.isEmpty()) {
                this.f22311d.m(this.f22310c, str, a10);
                for (InetAddress inetAddress : a10) {
                    arrayList.add(new InetSocketAddress(inetAddress, i10));
                }
                return;
            }
            throw new UnknownHostException(this.f22308a.c() + " returned no addresses for " + str);
        } else {
            arrayList.add(InetSocketAddress.createUnresolved(str, i10));
        }
    }

    private final void f(of.u uVar, Proxy proxy) {
        this.f22311d.p(this.f22310c, uVar);
        List<Proxy> g10 = g(proxy, uVar, this);
        this.f22312e = g10;
        this.f22313f = 0;
        this.f22311d.o(this.f22310c, uVar, g10);
    }

    private static final List<Proxy> g(Proxy proxy, of.u uVar, j jVar) {
        List<Proxy> d10;
        if (proxy != null) {
            d10 = ub.t.d(proxy);
            return d10;
        }
        URI q10 = uVar.q();
        if (q10.getHost() == null) {
            return pf.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> select = jVar.f22308a.i().select(q10);
        if (select == null || select.isEmpty()) {
            return pf.d.w(Proxy.NO_PROXY);
        }
        t.d(select, "proxiesOrNull");
        return pf.d.U(select);
    }

    public final boolean a() {
        return b() || (this.f22315h.isEmpty() ^ true);
    }

    public final b c() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy d10 = d();
                for (InetSocketAddress inetSocketAddress : this.f22314g) {
                    d0 d0Var = new d0(this.f22308a, d10, inetSocketAddress);
                    if (this.f22309b.c(d0Var)) {
                        this.f22315h.add(d0Var);
                    } else {
                        arrayList.add(d0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                z.x(arrayList, this.f22315h);
                this.f22315h.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
