package gd;

import java.util.List;
import java.util.Map;
import java.util.Set;
import ub.p0;
import ub.q0;
import ub.y0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final wd.c f10674a = new wd.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final wd.c f10675b = new wd.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final wd.c f10676c = new wd.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final wd.c f10677d = new wd.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<b> f10678e;

    /* renamed from: f */
    private static final Map<wd.c, q> f10679f;

    /* renamed from: g */
    private static final Map<wd.c, q> f10680g;

    /* renamed from: h */
    private static final Set<wd.c> f10681h;

    static {
        List<b> k10;
        Map<wd.c, q> e10;
        List d10;
        List d11;
        Map k11;
        Map<wd.c, q> n10;
        Set<wd.c> e11;
        b bVar = b.VALUE_PARAMETER;
        k10 = ub.u.k(b.FIELD, b.METHOD_RETURN_TYPE, bVar, b.TYPE_PARAMETER_BOUNDS, b.TYPE_USE);
        f10678e = k10;
        wd.c i10 = b0.i();
        od.h hVar = od.h.NOT_NULL;
        e10 = p0.e(tb.x.a(i10, new q(new od.i(hVar, false, 2, null), k10, false)));
        f10679f = e10;
        wd.c cVar = new wd.c("javax.annotation.ParametersAreNullableByDefault");
        od.i iVar = new od.i(od.h.NULLABLE, false, 2, null);
        d10 = ub.t.d(bVar);
        wd.c cVar2 = new wd.c("javax.annotation.ParametersAreNonnullByDefault");
        od.i iVar2 = new od.i(hVar, false, 2, null);
        d11 = ub.t.d(bVar);
        k11 = q0.k(tb.x.a(cVar, new q(iVar, d10, false, 4, null)), tb.x.a(cVar2, new q(iVar2, d11, false, 4, null)));
        n10 = q0.n(k11, e10);
        f10680g = n10;
        e11 = y0.e(b0.f(), b0.e());
        f10681h = e11;
    }

    public static final Map<wd.c, q> a() {
        return f10680g;
    }

    public static final Set<wd.c> b() {
        return f10681h;
    }

    public static final Map<wd.c, q> c() {
        return f10679f;
    }

    public static final wd.c d() {
        return f10677d;
    }

    public static final wd.c e() {
        return f10676c;
    }

    public static final wd.c f() {
        return f10675b;
    }

    public static final wd.c g() {
        return f10674a;
    }
}
