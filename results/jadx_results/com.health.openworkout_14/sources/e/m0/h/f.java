package e.m0.h;

import e.a0;
import e.d0;
import e.e0;
import e.g0;
import e.i0;
import e.k0;
import e.m0.k.f;
import e.n;
import e.p;
import e.v;
import e.x;
import e.z;
import f.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class f extends f.j implements n {

    /* renamed from: b */
    public final g f4114b;

    /* renamed from: c */
    private final k0 f4115c;

    /* renamed from: d */
    private Socket f4116d;

    /* renamed from: e */
    private Socket f4117e;

    /* renamed from: f */
    private x f4118f;

    /* renamed from: g */
    private e0 f4119g;

    /* renamed from: h */
    private e.m0.k.f f4120h;
    private f.e i;
    private f.d j;
    boolean k;
    int l;
    int m;
    private int n;
    private int o = 1;
    final List<Reference<k>> p = new ArrayList();
    long q = Long.MAX_VALUE;

    public f(g gVar, k0 k0Var) {
        this.f4114b = gVar;
        this.f4115c = k0Var;
    }

    private void e(int i, int i2, e.j jVar, v vVar) {
        Proxy b2 = this.f4115c.b();
        this.f4116d = (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) ? this.f4115c.a().j().createSocket() : new Socket(b2);
        vVar.f(jVar, this.f4115c.d(), b2);
        this.f4116d.setSoTimeout(i2);
        try {
            e.m0.l.f.j().h(this.f4116d, this.f4115c.d(), i);
            try {
                this.i = l.b(l.h(this.f4116d));
                this.j = l.a(l.e(this.f4116d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4115c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private void f(c cVar) {
        Throwable th;
        AssertionError e2;
        SSLSocket sSLSocket;
        e.e a2 = this.f4115c.a();
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            try {
                sSLSocket = (SSLSocket) a2.k().createSocket(this.f4116d, a2.l().m(), a2.l().y(), true);
            } catch (AssertionError e3) {
                e2 = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            p a3 = cVar.a(sSLSocket);
            if (a3.f()) {
                e.m0.l.f.j().g(sSLSocket, a2.l().m(), a2.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            x b2 = x.b(session);
            if (a2.e().verify(a2.l().m(), session)) {
                a2.a().a(a2.l().m(), b2.d());
                if (a3.f()) {
                    str = e.m0.l.f.j().l(sSLSocket);
                }
                this.f4117e = sSLSocket;
                this.i = l.b(l.h(sSLSocket));
                this.j = l.a(l.e(this.f4117e));
                this.f4118f = b2;
                this.f4119g = str != null ? e0.a(str) : e0.HTTP_1_1;
                if (sSLSocket == null) {
                    return;
                }
                e.m0.l.f.j().a(sSLSocket);
                return;
            }
            List<Certificate> d2 = b2.d();
            if (d2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + a2.l().m() + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) d2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + a2.l().m() + " not verified:\n    certificate: " + e.l.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + e.m0.n.d.a(x509Certificate));
        } catch (AssertionError e4) {
            e2 = e4;
            if (!e.m0.e.y(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                e.m0.l.f.j().a(sSLSocket2);
            }
            e.m0.e.f(sSLSocket2);
            throw th;
        }
    }

    private void g(int i, int i2, int i3, e.j jVar, v vVar) {
        g0 i4 = i();
        z i5 = i4.i();
        for (int i6 = 0; i6 < 21; i6++) {
            e(i, i2, jVar, vVar);
            i4 = h(i2, i3, i4, i5);
            if (i4 == null) {
                return;
            }
            e.m0.e.f(this.f4116d);
            this.f4116d = null;
            this.j = null;
            this.i = null;
            vVar.d(jVar, this.f4115c.d(), this.f4115c.b(), null);
        }
    }

    private g0 h(int i, int i2, g0 g0Var, z zVar) {
        String str = "CONNECT " + e.m0.e.q(zVar, true) + " HTTP/1.1";
        while (true) {
            f.e eVar = this.i;
            e.m0.j.a aVar = new e.m0.j.a(null, null, eVar, this.j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.d().g(i, timeUnit);
            this.j.d().g(i2, timeUnit);
            aVar.B(g0Var.d(), str);
            aVar.a();
            i0.a g2 = aVar.g(false);
            g2.q(g0Var);
            i0 c2 = g2.c();
            aVar.A(c2);
            int k = c2.k();
            if (k == 200) {
                if (this.i.R().S() && this.j.b().S()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (k != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c2.k());
            } else {
                g0 a2 = this.f4115c.a().h().a(this.f4115c, c2);
                if (a2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(c2.N("Connection"))) {
                    return a2;
                }
                g0Var = a2;
            }
        }
    }

    private g0 i() {
        g0.a aVar = new g0.a();
        aVar.g(this.f4115c.a().l());
        aVar.d("CONNECT", null);
        aVar.b("Host", e.m0.e.q(this.f4115c.a().l(), true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", e.m0.f.a());
        g0 a2 = aVar.a();
        i0.a aVar2 = new i0.a();
        aVar2.q(a2);
        aVar2.o(e0.HTTP_1_1);
        aVar2.g(407);
        aVar2.l("Preemptive Authenticate");
        aVar2.b(e.m0.e.f4065d);
        aVar2.r(-1L);
        aVar2.p(-1L);
        aVar2.i("Proxy-Authenticate", "OkHttp-Preemptive");
        g0 a3 = this.f4115c.a().h().a(this.f4115c, aVar2.c());
        return a3 != null ? a3 : a2;
    }

    private void j(c cVar, int i, e.j jVar, v vVar) {
        if (this.f4115c.a().k() != null) {
            vVar.x(jVar);
            f(cVar);
            vVar.w(jVar, this.f4118f);
            if (this.f4119g != e0.HTTP_2) {
                return;
            }
            t(i);
            return;
        }
        List<e0> f2 = this.f4115c.a().f();
        e0 e0Var = e0.H2_PRIOR_KNOWLEDGE;
        if (!f2.contains(e0Var)) {
            this.f4117e = this.f4116d;
            this.f4119g = e0.HTTP_1_1;
            return;
        }
        this.f4117e = this.f4116d;
        this.f4119g = e0Var;
        t(i);
    }

    private boolean r(List<k0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k0 k0Var = list.get(i);
            if (k0Var.b().type() == Proxy.Type.DIRECT && this.f4115c.b().type() == Proxy.Type.DIRECT && this.f4115c.d().equals(k0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private void t(int i) {
        this.f4117e.setSoTimeout(0);
        f.h hVar = new f.h(true);
        hVar.d(this.f4117e, this.f4115c.a().l().m(), this.i, this.j);
        hVar.b(this);
        hVar.c(i);
        e.m0.k.f a2 = hVar.a();
        this.f4120h = a2;
        a2.B0();
    }

    @Override // e.m0.k.f.j
    public void a(e.m0.k.f fVar) {
        synchronized (this.f4114b) {
            this.o = fVar.p0();
        }
    }

    @Override // e.m0.k.f.j
    public void b(e.m0.k.i iVar) {
        iVar.d(e.m0.k.b.REFUSED_STREAM, null);
    }

    public void c() {
        e.m0.e.f(this.f4116d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[Catch: IOException -> 0x00f9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f9, blocks: (B:17:0x0088, B:19:0x0090), top: B:60:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142 A[EDGE_INSN: B:70:0x0142->B:55:0x0142 ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r17, int r18, int r19, int r20, boolean r21, e.j r22, e.v r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.h.f.d(int, int, int, int, boolean, e.j, e.v):void");
    }

    public x k() {
        return this.f4118f;
    }

    public boolean l(e.e eVar, @Nullable List<k0> list) {
        if (this.p.size() >= this.o || this.k || !e.m0.c.f4060a.e(this.f4115c.a(), eVar)) {
            return false;
        }
        if (eVar.l().m().equals(q().a().l().m())) {
            return true;
        }
        if (this.f4120h == null || list == null || !r(list) || eVar.e() != e.m0.n.d.f4365a || !u(eVar.l())) {
            return false;
        }
        try {
            eVar.a().a(eVar.l().m(), k().d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean m(boolean z) {
        if (this.f4117e.isClosed() || this.f4117e.isInputShutdown() || this.f4117e.isOutputShutdown()) {
            return false;
        }
        e.m0.k.f fVar = this.f4120h;
        if (fVar != null) {
            return fVar.o0(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f4117e.getSoTimeout();
                try {
                    this.f4117e.setSoTimeout(1);
                    return !this.i.S();
                } finally {
                    this.f4117e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        return this.f4120h != null;
    }

    public e.m0.i.c o(d0 d0Var, a0.a aVar) {
        if (this.f4120h != null) {
            return new e.m0.k.g(d0Var, this, aVar, this.f4120h);
        }
        this.f4117e.setSoTimeout(aVar.e());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.i.d().g(aVar.e(), timeUnit);
        this.j.d().g(aVar.b(), timeUnit);
        return new e.m0.j.a(d0Var, this, this.i, this.j);
    }

    public void p() {
        synchronized (this.f4114b) {
            this.k = true;
        }
    }

    public k0 q() {
        return this.f4115c;
    }

    public Socket s() {
        return this.f4117e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f4115c.a().l().m());
        sb.append(":");
        sb.append(this.f4115c.a().l().y());
        sb.append(", proxy=");
        sb.append(this.f4115c.b());
        sb.append(" hostAddress=");
        sb.append(this.f4115c.d());
        sb.append(" cipherSuite=");
        x xVar = this.f4118f;
        sb.append(xVar != null ? xVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f4119g);
        sb.append('}');
        return sb.toString();
    }

    public boolean u(z zVar) {
        if (zVar.y() != this.f4115c.a().l().y()) {
            return false;
        }
        if (zVar.m().equals(this.f4115c.a().l().m())) {
            return true;
        }
        return this.f4118f != null && e.m0.n.d.f4365a.c(zVar.m(), (X509Certificate) this.f4118f.d().get(0));
    }

    public void v(@Nullable IOException iOException) {
        int i;
        synchronized (this.f4114b) {
            if (iOException instanceof e.m0.k.n) {
                e.m0.k.b bVar = ((e.m0.k.n) iOException).f4337b;
                if (bVar == e.m0.k.b.REFUSED_STREAM) {
                    int i2 = this.n + 1;
                    this.n = i2;
                    if (i2 > 1) {
                        this.k = true;
                        i = this.l;
                        this.l = i + 1;
                    }
                } else if (bVar != e.m0.k.b.CANCEL) {
                    this.k = true;
                    i = this.l;
                    this.l = i + 1;
                }
            } else if (!n() || (iOException instanceof e.m0.k.a)) {
                this.k = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        this.f4114b.b(this.f4115c, iOException);
                    }
                    i = this.l;
                    this.l = i + 1;
                }
            }
        }
    }
}
