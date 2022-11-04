package nj;

import ak.l;
import fj.j;
import fj.n;
import gg.v;
import gg.w;
import hh.n0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import oj.r;
import oj.t;
import oj.x;
import oj.z;
import zg.q;
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a */
    private static Map f17328a;

    /* loaded from: classes3.dex */
    private static class b extends g {
        private b() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            byte[] F = w.E(n0Var.q()).F();
            if (l.a(F, 0) == 1) {
                return gj.i.b(ak.a.w(F, 4, F.length));
            }
            if (F.length == 64) {
                F = ak.a.w(F, 4, F.length);
            }
            return gj.d.b(F);
        }
    }

    /* renamed from: nj.c$c */
    /* loaded from: classes3.dex */
    private static class C0268c extends g {
        private C0268c() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            fj.b n10 = fj.b.n(n0Var.q());
            return new hj.c(n10.o(), n10.q(), n10.m(), nj.e.c(n10.l().l()));
        }
    }

    /* loaded from: classes3.dex */
    private static class d extends g {
        private d() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            return new ij.b(n0Var.o().D());
        }
    }

    /* loaded from: classes3.dex */
    private static class e extends g {
        private e() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            return new jj.b(nj.e.e(n0Var.l()), n0Var.o().G());
        }
    }

    /* loaded from: classes3.dex */
    private static class f extends g {
        private f() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            return new mj.c(n0Var.o().D(), nj.e.g(fj.h.l(n0Var.l().o())));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class g {
        private g() {
        }

        abstract zh.b a(n0 n0Var, Object obj);
    }

    /* loaded from: classes3.dex */
    private static class h extends g {
        private h() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            z.b f10;
            fj.i m10 = fj.i.m(n0Var.l().o());
            if (m10 != null) {
                v l10 = m10.n().l();
                n l11 = n.l(n0Var.q());
                f10 = new z.b(new x(m10.l(), nj.e.b(l10))).g(l11.m()).h(l11.n());
            } else {
                byte[] F = w.E(n0Var.q()).F();
                f10 = new z.b(x.k(l.a(F, 0))).f(F);
            }
            return f10.e();
        }
    }

    /* loaded from: classes3.dex */
    private static class i extends g {
        private i() {
            super();
        }

        @Override // nj.c.g
        zh.b a(n0 n0Var, Object obj) {
            t.b f10;
            j m10 = j.m(n0Var.l().o());
            if (m10 != null) {
                v l10 = m10.o().l();
                n l11 = n.l(n0Var.q());
                f10 = new t.b(new r(m10.l(), m10.n(), nj.e.b(l10))).g(l11.m()).h(l11.n());
            } else {
                byte[] F = w.E(n0Var.q()).F();
                f10 = new t.b(r.i(l.a(F, 0))).f(F);
            }
            return f10.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17328a = hashMap;
        hashMap.put(fj.e.X, new e());
        f17328a.put(fj.e.Y, new e());
        f17328a.put(fj.e.f10270r, new f());
        f17328a.put(fj.e.f10274v, new d());
        f17328a.put(fj.e.f10275w, new h());
        f17328a.put(fj.e.F, new i());
        f17328a.put(qg.a.f19903a, new h());
        f17328a.put(qg.a.f19904b, new i());
        f17328a.put(q.G2, new b());
        f17328a.put(fj.e.f10266n, new C0268c());
    }

    public static zh.b a(n0 n0Var) {
        return b(n0Var, null);
    }

    public static zh.b b(n0 n0Var, Object obj) {
        hh.b l10 = n0Var.l();
        g gVar = (g) f17328a.get(l10.l());
        if (gVar != null) {
            return gVar.a(n0Var, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + l10.l());
    }
}
