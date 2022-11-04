package rf;

import bf.x;
import eg.a0;
import eg.n;
import eg.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.c0;
import of.r;
import of.t;
import of.v;
import of.z;
import org.conscrypt.BuildConfig;
import rf.c;
import uf.f;
import uf.h;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lrf/a;", "Lof/v;", "Lrf/b;", "cacheRequest", "Lof/b0;", "response", "b", "Lof/v$a;", "chain", "a", "Lof/c;", "cache", "<init>", "(Lof/c;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a implements v {
    public static final C0346a Companion = new C0346a(null);

    /* renamed from: a */
    private final of.c f21129a;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lrf/a$a;", BuildConfig.FLAVOR, "Lof/b0;", "response", "f", "Lof/t;", "cachedHeaders", "networkHeaders", "c", BuildConfig.FLAVOR, "fieldName", BuildConfig.FLAVOR, "e", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: rf.a$a */
    /* loaded from: classes3.dex */
    public static final class C0346a {
        private C0346a() {
        }

        public /* synthetic */ C0346a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t c(t tVar, t tVar2) {
            boolean v10;
            boolean I;
            t.a aVar = new t.a();
            int size = tVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String b10 = tVar.b(i11);
                String i13 = tVar.i(i11);
                v10 = x.v("Warning", b10, true);
                if (v10) {
                    I = x.I(i13, "1", false, 2, null);
                    if (I) {
                        i11 = i12;
                    }
                }
                if (d(b10) || !e(b10) || tVar2.a(b10) == null) {
                    aVar.c(b10, i13);
                }
                i11 = i12;
            }
            int size2 = tVar2.size();
            while (i10 < size2) {
                int i14 = i10 + 1;
                String b11 = tVar2.b(i10);
                if (!d(b11) && e(b11)) {
                    aVar.c(b11, tVar2.i(i10));
                }
                i10 = i14;
            }
            return aVar.d();
        }

        private final boolean d(String str) {
            boolean v10;
            boolean v11;
            boolean v12;
            v10 = x.v("Content-Length", str, true);
            if (!v10) {
                v11 = x.v("Content-Encoding", str, true);
                if (v11) {
                    return true;
                }
                v12 = x.v("Content-Type", str, true);
                return v12;
            }
            return true;
        }

        private final boolean e(String str) {
            boolean v10;
            boolean v11;
            boolean v12;
            boolean v13;
            boolean v14;
            boolean v15;
            boolean v16;
            boolean v17;
            v10 = x.v("Connection", str, true);
            if (!v10) {
                v11 = x.v("Keep-Alive", str, true);
                if (!v11) {
                    v12 = x.v("Proxy-Authenticate", str, true);
                    if (!v12) {
                        v13 = x.v("Proxy-Authorization", str, true);
                        if (!v13) {
                            v14 = x.v("TE", str, true);
                            if (!v14) {
                                v15 = x.v("Trailers", str, true);
                                if (!v15) {
                                    v16 = x.v("Transfer-Encoding", str, true);
                                    if (!v16) {
                                        v17 = x.v("Upgrade", str, true);
                                        if (!v17) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final b0 f(b0 b0Var) {
            return (b0Var == null ? null : b0Var.b()) != null ? b0Var.B().b(null).c() : b0Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"rf/a$b", "Leg/a0;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Leg/b0;", "m", "Ltb/e0;", "close", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b implements a0 {

        /* renamed from: c */
        private boolean f21130c;

        /* renamed from: d */
        final /* synthetic */ eg.e f21131d;

        /* renamed from: q */
        final /* synthetic */ rf.b f21132q;

        /* renamed from: x */
        final /* synthetic */ eg.d f21133x;

        b(eg.e eVar, rf.b bVar, eg.d dVar) {
            this.f21131d = eVar;
            this.f21132q = bVar;
            this.f21133x = dVar;
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f21130c && !pf.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f21130c = true;
                this.f21132q.b();
            }
            this.f21131d.close();
        }

        @Override // eg.a0
        public long g1(eg.c cVar, long j10) {
            hc.t.e(cVar, "sink");
            try {
                long g12 = this.f21131d.g1(cVar, j10);
                if (g12 != -1) {
                    cVar.j(this.f21133x.c(), cVar.e1() - g12, g12);
                    this.f21133x.t0();
                    return g12;
                }
                if (!this.f21130c) {
                    this.f21130c = true;
                    this.f21133x.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (!this.f21130c) {
                    this.f21130c = true;
                    this.f21132q.b();
                }
                throw e10;
            }
        }

        @Override // eg.a0
        public eg.b0 m() {
            return this.f21131d.m();
        }
    }

    public a(of.c cVar) {
        this.f21129a = cVar;
    }

    private final b0 b(rf.b bVar, b0 b0Var) {
        if (bVar == null) {
            return b0Var;
        }
        y a10 = bVar.a();
        c0 b10 = b0Var.b();
        hc.t.b(b10);
        b bVar2 = new b(b10.f(), bVar, n.c(a10));
        return b0Var.B().b(new h(b0.r(b0Var, "Content-Type", null, 2, null), b0Var.b().b(), n.d(bVar2))).c();
    }

    @Override // of.v
    public b0 a(v.a aVar) {
        c0 b10;
        c0 b11;
        hc.t.e(aVar, "chain");
        of.e call = aVar.call();
        of.c cVar = this.f21129a;
        r rVar = null;
        b0 e10 = cVar == null ? null : cVar.e(aVar.b());
        c b12 = new c.b(System.currentTimeMillis(), aVar.b(), e10).b();
        z b13 = b12.b();
        b0 a10 = b12.a();
        of.c cVar2 = this.f21129a;
        if (cVar2 != null) {
            cVar2.s(b12);
        }
        tf.e eVar = call instanceof tf.e ? (tf.e) call : null;
        if (eVar != null) {
            rVar = eVar.m();
        }
        if (rVar == null) {
            rVar = r.f18288a;
        }
        if (e10 != null && a10 == null && (b11 = e10.b()) != null) {
            pf.d.m(b11);
        }
        if (b13 == null && a10 == null) {
            b0 c10 = new b0.a().s(aVar.b()).q(of.y.HTTP_1_1).g(504).n("Unsatisfiable Request (only-if-cached)").b(pf.d.f19190c).t(-1L).r(System.currentTimeMillis()).c();
            rVar.A(call, c10);
            return c10;
        } else if (b13 == null) {
            hc.t.b(a10);
            b0 c11 = a10.B().d(Companion.f(a10)).c();
            rVar.b(call, c11);
            return c11;
        } else {
            if (a10 != null) {
                rVar.a(call, a10);
            } else if (this.f21129a != null) {
                rVar.c(call);
            }
            try {
                b0 a11 = aVar.a(b13);
                if (a11 == null && e10 != null && b10 != null) {
                }
                if (a10 != null) {
                    boolean z10 = false;
                    if (a11 != null && a11.i() == 304) {
                        z10 = true;
                    }
                    if (z10) {
                        b0.a B = a10.B();
                        C0346a c0346a = Companion;
                        b0 c12 = B.l(c0346a.c(a10.s(), a11.s())).t(a11.e0()).r(a11.V()).d(c0346a.f(a10)).o(c0346a.f(a11)).c();
                        c0 b14 = a11.b();
                        hc.t.b(b14);
                        b14.close();
                        of.c cVar3 = this.f21129a;
                        hc.t.b(cVar3);
                        cVar3.r();
                        this.f21129a.u(a10, c12);
                        rVar.b(call, c12);
                        return c12;
                    }
                    c0 b15 = a10.b();
                    if (b15 != null) {
                        pf.d.m(b15);
                    }
                }
                hc.t.b(a11);
                b0.a B2 = a11.B();
                C0346a c0346a2 = Companion;
                b0 c13 = B2.d(c0346a2.f(a10)).o(c0346a2.f(a11)).c();
                if (this.f21129a != null) {
                    if (uf.e.b(c13) && c.Companion.a(c13, b13)) {
                        b0 b16 = b(this.f21129a.i(c13), c13);
                        if (a10 != null) {
                            rVar.c(call);
                        }
                        return b16;
                    } else if (f.f23611a.a(b13.h())) {
                        try {
                            this.f21129a.j(b13);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c13;
            } finally {
                if (e10 != null && (b10 = e10.b()) != null) {
                    pf.d.m(b10);
                }
            }
        }
    }
}
