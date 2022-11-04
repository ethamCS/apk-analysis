package pd;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qd.a;
import ub.x0;
import ub.y0;
import xc.l0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b */
    private static final Set<a.EnumC0322a> f19101b;

    /* renamed from: c */
    private static final Set<a.EnumC0322a> f19102c;

    /* renamed from: a */
    public ke.k f19106a;
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final vd.e f19103d = new vd.e(1, 1, 2);

    /* renamed from: e */
    private static final vd.e f19104e = new vd.e(1, 1, 11);

    /* renamed from: f */
    private static final vd.e f19105f = new vd.e(1, 1, 13);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vd.e a() {
            return g.f19105f;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<Collection<? extends wd.f>> {

        /* renamed from: c */
        public static final b f19107c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Collection<wd.f> invoke() {
            List h10;
            h10 = ub.u.h();
            return h10;
        }
    }

    static {
        Set<a.EnumC0322a> a10;
        Set<a.EnumC0322a> e10;
        a10 = x0.a(a.EnumC0322a.CLASS);
        f19101b = a10;
        e10 = y0.e(a.EnumC0322a.FILE_FACADE, a.EnumC0322a.MULTIFILE_CLASS_PART);
        f19102c = e10;
    }

    private final me.e c(q qVar) {
        if (!d().g().b()) {
            if (qVar.a().j()) {
                return me.e.FIR_UNSTABLE;
            }
            if (qVar.a().k()) {
                return me.e.IR_UNSTABLE;
            }
        }
        return me.e.STABLE;
    }

    private final ke.t<vd.e> e(q qVar) {
        if (f() || qVar.a().d().h()) {
            return null;
        }
        return new ke.t<>(qVar.a().d(), vd.e.f24007g, qVar.b(), qVar.i());
    }

    private final boolean f() {
        return d().g().e();
    }

    private final boolean g(q qVar) {
        return !d().g().c() && qVar.a().i() && hc.t.a(qVar.a().d(), f19104e);
    }

    private final boolean h(q qVar) {
        return (d().g().f() && (qVar.a().i() || hc.t.a(qVar.a().d(), f19103d))) || g(qVar);
    }

    private final String[] j(q qVar, Set<? extends a.EnumC0322a> set) {
        qd.a a10 = qVar.a();
        String[] a11 = a10.a();
        if (a11 == null) {
            a11 = a10.b();
        }
        if (a11 == null || !set.contains(a10.c())) {
            return null;
        }
        return a11;
    }

    public final he.h b(l0 l0Var, q qVar) {
        tb.r<vd.f, rd.l> rVar;
        hc.t.e(l0Var, "descriptor");
        hc.t.e(qVar, "kotlinClass");
        String[] j10 = j(qVar, f19102c);
        if (j10 == null) {
            return null;
        }
        String[] g10 = qVar.a().g();
        try {
        } catch (Throwable th2) {
            if (f() || qVar.a().d().h()) {
                throw th2;
            }
            rVar = null;
        }
        if (g10 == null) {
            return null;
        }
        try {
            rVar = vd.i.m(j10, g10);
            if (rVar == null) {
                return null;
            }
            vd.f b10 = rVar.b();
            rd.l c10 = rVar.c();
            k kVar = new k(qVar, c10, b10, e(qVar), h(qVar), c(qVar));
            return new me.i(l0Var, c10, b10, qVar.a().d(), kVar, d(), "scope for " + kVar + " in " + l0Var, b.f19107c);
        } catch (yd.k e10) {
            throw new IllegalStateException("Could not read data from " + qVar.b(), e10);
        }
    }

    public final ke.k d() {
        ke.k kVar = this.f19106a;
        if (kVar != null) {
            return kVar;
        }
        hc.t.s("components");
        return null;
    }

    public final ke.g i(q qVar) {
        String[] g10;
        tb.r<vd.f, rd.c> rVar;
        hc.t.e(qVar, "kotlinClass");
        String[] j10 = j(qVar, f19101b);
        if (j10 == null || (g10 = qVar.a().g()) == null) {
            return null;
        }
        try {
            try {
                rVar = vd.i.i(j10, g10);
            } catch (yd.k e10) {
                throw new IllegalStateException("Could not read data from " + qVar.b(), e10);
            }
        } catch (Throwable th2) {
            if (f() || qVar.a().d().h()) {
                throw th2;
            }
            rVar = null;
        }
        if (rVar != null) {
            return new ke.g(rVar.b(), rVar.c(), qVar.a().d(), new s(qVar, e(qVar), h(qVar), c(qVar)));
        }
        return null;
    }

    public final xc.e k(q qVar) {
        hc.t.e(qVar, "kotlinClass");
        ke.g i10 = i(qVar);
        if (i10 == null) {
            return null;
        }
        return d().f().d(qVar.i(), i10);
    }

    public final void l(ke.k kVar) {
        hc.t.e(kVar, "<set-?>");
        this.f19106a = kVar;
    }

    public final void m(e eVar) {
        hc.t.e(eVar, "components");
        l(eVar.a());
    }
}
