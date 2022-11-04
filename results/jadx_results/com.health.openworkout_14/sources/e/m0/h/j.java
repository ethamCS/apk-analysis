package e.m0.h;

import e.k0;
import e.v;
import e.z;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final e.e f4131a;

    /* renamed from: b */
    private final h f4132b;

    /* renamed from: c */
    private final e.j f4133c;

    /* renamed from: d */
    private final v f4134d;

    /* renamed from: f */
    private int f4136f;

    /* renamed from: e */
    private List<Proxy> f4135e = Collections.emptyList();

    /* renamed from: g */
    private List<InetSocketAddress> f4137g = Collections.emptyList();

    /* renamed from: h */
    private final List<k0> f4138h = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<k0> f4139a;

        /* renamed from: b */
        private int f4140b = 0;

        a(List<k0> list) {
            this.f4139a = list;
        }

        public List<k0> a() {
            return new ArrayList(this.f4139a);
        }

        public boolean b() {
            return this.f4140b < this.f4139a.size();
        }

        public k0 c() {
            if (b()) {
                List<k0> list = this.f4139a;
                int i = this.f4140b;
                this.f4140b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public j(e.e eVar, h hVar, e.j jVar, v vVar) {
        this.f4131a = eVar;
        this.f4132b = hVar;
        this.f4133c = jVar;
        this.f4134d = vVar;
        g(eVar.l(), eVar.g());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean c() {
        return this.f4136f < this.f4135e.size();
    }

    private Proxy e() {
        if (c()) {
            List<Proxy> list = this.f4135e;
            int i = this.f4136f;
            this.f4136f = i + 1;
            Proxy proxy = list.get(i);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f4131a.l().m() + "; exhausted proxy configurations: " + this.f4135e);
    }

    private void f(Proxy proxy) {
        String str;
        int i;
        this.f4137g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f4131a.l().m();
            i = this.f4131a.l().y();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            str = a(inetSocketAddress);
            i = inetSocketAddress.getPort();
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f4137g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f4134d.j(this.f4133c, str);
            List<InetAddress> a2 = this.f4131a.c().a(str);
            if (a2.isEmpty()) {
                throw new UnknownHostException(this.f4131a.c() + " returned no addresses for " + str);
            }
            this.f4134d.i(this.f4133c, str, a2);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f4137g.add(new InetSocketAddress(a2.get(i2), i));
            }
        }
    }

    private void g(z zVar, Proxy proxy) {
        List<Proxy> s;
        if (proxy != null) {
            s = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f4131a.i().select(zVar.E());
            s = (select == null || select.isEmpty()) ? e.m0.e.s(Proxy.NO_PROXY) : e.m0.e.r(select);
        }
        this.f4135e = s;
        this.f4136f = 0;
    }

    public boolean b() {
        return c() || !this.f4138h.isEmpty();
    }

    public a d() {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e2 = e();
                int size = this.f4137g.size();
                for (int i = 0; i < size; i++) {
                    k0 k0Var = new k0(this.f4131a, e2, this.f4137g.get(i));
                    if (this.f4132b.c(k0Var)) {
                        this.f4138h.add(k0Var);
                    } else {
                        arrayList.add(k0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f4138h);
                this.f4138h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
