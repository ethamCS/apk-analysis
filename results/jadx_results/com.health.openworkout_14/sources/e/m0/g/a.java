package e.m0.g;

import e.a0;
import e.e0;
import e.g0;
import e.i0;
import e.m0.g.c;
import e.m0.i.f;
import e.m0.i.h;
import e.y;
import f.e;
import f.l;
import f.s;
import f.t;
import f.u;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class a implements a0 {
    @Nullable

    /* renamed from: a */
    final d f4070a;

    /* renamed from: e.m0.g.a$a */
    /* loaded from: classes.dex */
    public class C0113a implements t {

        /* renamed from: b */
        boolean f4071b;

        /* renamed from: c */
        final /* synthetic */ e f4072c;

        /* renamed from: d */
        final /* synthetic */ b f4073d;

        /* renamed from: e */
        final /* synthetic */ f.d f4074e;

        C0113a(a aVar, e eVar, b bVar, f.d dVar) {
            this.f4072c = eVar;
            this.f4073d = bVar;
            this.f4074e = dVar;
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f4071b && !e.m0.e.n(this, 100, TimeUnit.MILLISECONDS)) {
                this.f4071b = true;
                this.f4073d.a();
            }
            this.f4072c.close();
        }

        @Override // f.t
        public u d() {
            return this.f4072c.d();
        }

        @Override // f.t
        public long q(f.c cVar, long j) {
            try {
                long q = this.f4072c.q(cVar, j);
                if (q != -1) {
                    cVar.i0(this.f4074e.b(), cVar.v0() - q, q);
                    this.f4074e.n();
                    return q;
                }
                if (!this.f4071b) {
                    this.f4071b = true;
                    this.f4074e.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.f4071b) {
                    this.f4071b = true;
                    this.f4073d.a();
                }
                throw e2;
            }
        }
    }

    public a(@Nullable d dVar) {
        this.f4070a = dVar;
    }

    private i0 b(b bVar, i0 i0Var) {
        s b2;
        if (bVar == null || (b2 = bVar.b()) == null) {
            return i0Var;
        }
        C0113a c0113a = new C0113a(this, i0Var.a().h0(), bVar, l.a(b2));
        String N = i0Var.N("Content-Type");
        long I = i0Var.a().I();
        i0.a j0 = i0Var.j0();
        j0.b(new h(N, I, l.b(c0113a)));
        return j0.c();
    }

    private static y c(y yVar, y yVar2) {
        y.a aVar = new y.a();
        int h2 = yVar.h();
        for (int i = 0; i < h2; i++) {
            String e2 = yVar.e(i);
            String i2 = yVar.i(i);
            if ((!"Warning".equalsIgnoreCase(e2) || !i2.startsWith("1")) && (d(e2) || !e(e2) || yVar2.c(e2) == null)) {
                e.m0.c.f4060a.b(aVar, e2, i2);
            }
        }
        int h3 = yVar2.h();
        for (int i3 = 0; i3 < h3; i3++) {
            String e3 = yVar2.e(i3);
            if (!d(e3) && e(e3)) {
                e.m0.c.f4060a.b(aVar, e3, yVar2.i(i3));
            }
        }
        return aVar.e();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static i0 f(i0 i0Var) {
        if (i0Var == null || i0Var.a() == null) {
            return i0Var;
        }
        i0.a j0 = i0Var.j0();
        j0.b(null);
        return j0.c();
    }

    @Override // e.a0
    public i0 a(a0.a aVar) {
        d dVar = this.f4070a;
        i0 b2 = dVar != null ? dVar.b(aVar.a()) : null;
        c c2 = new c.a(System.currentTimeMillis(), aVar.a(), b2).c();
        g0 g0Var = c2.f4075a;
        i0 i0Var = c2.f4076b;
        d dVar2 = this.f4070a;
        if (dVar2 != null) {
            dVar2.d(c2);
        }
        if (b2 != null && i0Var == null) {
            e.m0.e.e(b2.a());
        }
        if (g0Var == null && i0Var == null) {
            i0.a aVar2 = new i0.a();
            aVar2.q(aVar.a());
            aVar2.o(e0.HTTP_1_1);
            aVar2.g(504);
            aVar2.l("Unsatisfiable Request (only-if-cached)");
            aVar2.b(e.m0.e.f4065d);
            aVar2.r(-1L);
            aVar2.p(System.currentTimeMillis());
            return aVar2.c();
        } else if (g0Var == null) {
            i0.a j0 = i0Var.j0();
            j0.d(f(i0Var));
            return j0.c();
        } else {
            try {
                i0 c3 = aVar.c(g0Var);
                if (c3 == null && b2 != null) {
                }
                if (i0Var != null) {
                    if (c3.k() == 304) {
                        i0.a j02 = i0Var.j0();
                        j02.j(c(i0Var.g0(), c3.g0()));
                        j02.r(c3.n0());
                        j02.p(c3.l0());
                        j02.d(f(i0Var));
                        j02.m(f(c3));
                        i0 c4 = j02.c();
                        c3.a().close();
                        this.f4070a.c();
                        this.f4070a.a(i0Var, c4);
                        return c4;
                    }
                    e.m0.e.e(i0Var.a());
                }
                i0.a j03 = c3.j0();
                j03.d(f(i0Var));
                j03.m(f(c3));
                i0 c5 = j03.c();
                if (this.f4070a != null) {
                    if (e.m0.i.e.c(c5) && c.a(c5, g0Var)) {
                        return b(this.f4070a.f(c5), c5);
                    }
                    if (f.a(g0Var.f())) {
                        try {
                            this.f4070a.e(g0Var);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c5;
            } finally {
                if (b2 != null) {
                    e.m0.e.e(b2.a());
                }
            }
        }
    }
}
