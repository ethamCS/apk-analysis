package e;

import e.i0;
import e.j;
import e.v;
import e.y;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class d0 implements Cloneable, j.a {
    static final List<e0> D = e.m0.e.s(e0.HTTP_2, e0.HTTP_1_1);
    static final List<p> E = e.m0.e.s(p.f4369g, p.f4370h);
    final int A;
    final int B;
    final int C;

    /* renamed from: b */
    final s f3935b;
    @Nullable

    /* renamed from: c */
    final Proxy f3936c;

    /* renamed from: d */
    final List<e0> f3937d;

    /* renamed from: e */
    final List<p> f3938e;

    /* renamed from: f */
    final List<a0> f3939f;

    /* renamed from: g */
    final List<a0> f3940g;

    /* renamed from: h */
    final v.b f3941h;
    final ProxySelector i;
    final r j;
    @Nullable
    final h k;
    @Nullable
    final e.m0.g.d l;
    final SocketFactory m;
    final SSLSocketFactory n;
    final e.m0.n.c o;
    final HostnameVerifier p;
    final l q;
    final g r;
    final g s;
    final o t;
    final u u;
    final boolean v;
    final boolean w;
    final boolean x;
    final int y;
    final int z;

    /* loaded from: classes.dex */
    class a extends e.m0.c {
        a() {
        }

        @Override // e.m0.c
        public void a(y.a aVar, String str) {
            aVar.c(str);
        }

        @Override // e.m0.c
        public void b(y.a aVar, String str, String str2) {
            aVar.d(str, str2);
        }

        @Override // e.m0.c
        public void c(p pVar, SSLSocket sSLSocket, boolean z) {
            pVar.a(sSLSocket, z);
        }

        @Override // e.m0.c
        public int d(i0.a aVar) {
            return aVar.f4017c;
        }

        @Override // e.m0.c
        public boolean e(e eVar, e eVar2) {
            return eVar.d(eVar2);
        }

        @Override // e.m0.c
        @Nullable
        public e.m0.h.d f(i0 i0Var) {
            return i0Var.n;
        }

        @Override // e.m0.c
        public void g(i0.a aVar, e.m0.h.d dVar) {
            aVar.k(dVar);
        }

        @Override // e.m0.c
        public e.m0.h.g h(o oVar) {
            return oVar.f4366a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        int A;
        int B;
        @Nullable

        /* renamed from: b */
        Proxy f3943b;

        /* renamed from: h */
        ProxySelector f3949h;
        r i;
        @Nullable
        h j;
        @Nullable
        e.m0.g.d k;
        SocketFactory l;
        @Nullable
        SSLSocketFactory m;
        @Nullable
        e.m0.n.c n;
        HostnameVerifier o;
        l p;
        g q;
        g r;
        o s;
        u t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        /* renamed from: e */
        final List<a0> f3946e = new ArrayList();

        /* renamed from: f */
        final List<a0> f3947f = new ArrayList();

        /* renamed from: a */
        s f3942a = new s();

        /* renamed from: c */
        List<e0> f3944c = d0.D;

        /* renamed from: d */
        List<p> f3945d = d0.E;

        /* renamed from: g */
        v.b f3948g = v.k(v.f4396a);

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f3949h = proxySelector;
            if (proxySelector == null) {
                this.f3949h = new e.m0.m.a();
            }
            this.i = r.f4387a;
            this.l = SocketFactory.getDefault();
            this.o = e.m0.n.d.f4365a;
            this.p = l.f4034c;
            g gVar = g.f3973a;
            this.q = gVar;
            this.r = gVar;
            this.s = new o();
            this.t = u.f4395a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }
    }

    static {
        e.m0.c.f4060a = new a();
    }

    public d0() {
        this(new b());
    }

    d0(b bVar) {
        boolean z;
        e.m0.n.c cVar;
        this.f3935b = bVar.f3942a;
        this.f3936c = bVar.f3943b;
        this.f3937d = bVar.f3944c;
        List<p> list = bVar.f3945d;
        this.f3938e = list;
        this.f3939f = e.m0.e.r(bVar.f3946e);
        this.f3940g = e.m0.e.r(bVar.f3947f);
        this.f3941h = bVar.f3948g;
        this.i = bVar.f3949h;
        this.j = bVar.i;
        h hVar = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        loop0: while (true) {
            z = false;
            for (p pVar : list) {
                z = (z || pVar.d()) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.m;
        if (sSLSocketFactory != null || !z) {
            this.n = sSLSocketFactory;
            cVar = bVar.n;
        } else {
            X509TrustManager B = e.m0.e.B();
            this.n = u(B);
            cVar = e.m0.n.c.b(B);
        }
        this.o = cVar;
        if (this.n != null) {
            e.m0.l.f.j().f(this.n);
        }
        this.p = bVar.o;
        this.q = bVar.p.f(this.o);
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A;
        this.C = bVar.B;
        if (this.f3939f.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f3939f);
        } else if (this.f3940g.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f3940g);
        }
    }

    private static SSLSocketFactory u(X509TrustManager x509TrustManager) {
        try {
            SSLContext k = e.m0.l.f.j().k();
            k.init(null, new TrustManager[]{x509TrustManager}, null);
            return k.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public int A() {
        return this.A;
    }

    public boolean B() {
        return this.x;
    }

    public SocketFactory C() {
        return this.m;
    }

    public SSLSocketFactory D() {
        return this.n;
    }

    public int E() {
        return this.B;
    }

    @Override // e.j.a
    public j b(g0 g0Var) {
        return f0.f(this, g0Var, false);
    }

    public g d() {
        return this.s;
    }

    public int e() {
        return this.y;
    }

    public l f() {
        return this.q;
    }

    public int g() {
        return this.z;
    }

    public o h() {
        return this.t;
    }

    public List<p> i() {
        return this.f3938e;
    }

    public r j() {
        return this.j;
    }

    public s l() {
        return this.f3935b;
    }

    public u m() {
        return this.u;
    }

    public v.b n() {
        return this.f3941h;
    }

    public boolean o() {
        return this.w;
    }

    public boolean p() {
        return this.v;
    }

    public HostnameVerifier q() {
        return this.p;
    }

    public List<a0> r() {
        return this.f3939f;
    }

    @Nullable
    public e.m0.g.d s() {
        h hVar = this.k;
        return hVar != null ? hVar.f3985b : this.l;
    }

    public List<a0> t() {
        return this.f3940g;
    }

    public int v() {
        return this.C;
    }

    public List<e0> w() {
        return this.f3937d;
    }

    @Nullable
    public Proxy x() {
        return this.f3936c;
    }

    public g y() {
        return this.r;
    }

    public ProxySelector z() {
        return this.i;
    }
}
