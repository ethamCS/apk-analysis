package gd;

import gd.v;
import java.util.Map;
import ub.q0;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    private static final wd.c f10749a;

    /* renamed from: b */
    private static final wd.c f10750b;

    /* renamed from: c */
    private static final c0<v> f10751c;

    /* renamed from: d */
    private static final v f10752d;

    static {
        Map k10;
        wd.c cVar = new wd.c("org.jspecify.nullness");
        f10749a = cVar;
        wd.c cVar2 = new wd.c("org.checkerframework.checker.nullness.compatqual");
        f10750b = cVar2;
        wd.c cVar3 = new wd.c("org.jetbrains.annotations");
        v.a aVar = v.Companion;
        wd.c cVar4 = new wd.c("androidx.annotation.RecentlyNullable");
        f0 f0Var = f0.WARN;
        tb.j jVar = new tb.j(1, 8);
        f0 f0Var2 = f0.STRICT;
        k10 = q0.k(tb.x.a(cVar3, aVar.a()), tb.x.a(new wd.c("androidx.annotation"), aVar.a()), tb.x.a(new wd.c("android.support.annotation"), aVar.a()), tb.x.a(new wd.c("android.annotation"), aVar.a()), tb.x.a(new wd.c("com.android.annotations"), aVar.a()), tb.x.a(new wd.c("org.eclipse.jdt.annotation"), aVar.a()), tb.x.a(new wd.c("org.checkerframework.checker.nullness.qual"), aVar.a()), tb.x.a(cVar2, aVar.a()), tb.x.a(new wd.c("javax.annotation"), aVar.a()), tb.x.a(new wd.c("edu.umd.cs.findbugs.annotations"), aVar.a()), tb.x.a(new wd.c("io.reactivex.annotations"), aVar.a()), tb.x.a(cVar4, new v(f0Var, null, null, 4, null)), tb.x.a(new wd.c("androidx.annotation.RecentlyNonNull"), new v(f0Var, null, null, 4, null)), tb.x.a(new wd.c("lombok"), aVar.a()), tb.x.a(cVar, new v(f0Var, jVar, f0Var2)), tb.x.a(new wd.c("io.reactivex.rxjava3.annotations"), new v(f0Var, new tb.j(1, 8), f0Var2)));
        f10751c = new d0(k10);
        f10752d = new v(f0Var, null, null, 4, null);
    }

    public static final y a(tb.j jVar) {
        hc.t.e(jVar, "configuredKotlinVersion");
        v vVar = f10752d;
        f0 c10 = (vVar.d() == null || vVar.d().compareTo(jVar) > 0) ? vVar.c() : vVar.b();
        return new y(c10, c(c10), null, 4, null);
    }

    public static /* synthetic */ y b(tb.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = tb.j.f22156y;
        }
        return a(jVar);
    }

    public static final f0 c(f0 f0Var) {
        hc.t.e(f0Var, "globalReportLevel");
        if (f0Var == f0.WARN) {
            return null;
        }
        return f0Var;
    }

    public static final f0 d(wd.c cVar) {
        hc.t.e(cVar, "annotationFqName");
        return g(cVar, c0.Companion.a(), null, 4, null);
    }

    public static final wd.c e() {
        return f10749a;
    }

    public static final f0 f(wd.c cVar, c0<? extends f0> c0Var, tb.j jVar) {
        hc.t.e(cVar, "annotation");
        hc.t.e(c0Var, "configuredReportLevels");
        hc.t.e(jVar, "configuredKotlinVersion");
        f0 a10 = c0Var.a(cVar);
        if (a10 != null) {
            return a10;
        }
        v a11 = f10751c.a(cVar);
        return a11 == null ? f0.IGNORE : (a11.d() == null || a11.d().compareTo(jVar) > 0) ? a11.c() : a11.b();
    }

    public static /* synthetic */ f0 g(wd.c cVar, c0 c0Var, tb.j jVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            jVar = new tb.j(1, 7, 0);
        }
        return f(cVar, c0Var, jVar);
    }
}
