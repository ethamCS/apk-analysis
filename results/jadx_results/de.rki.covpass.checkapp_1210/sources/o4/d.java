package o4;

import java.util.List;
/* loaded from: classes.dex */
public class d {
    private static <T> List<r4.a<T>> a(p4.c cVar, float f10, e4.h hVar, n0<T> n0Var) {
        return u.a(cVar, hVar, f10, n0Var, false);
    }

    private static <T> List<r4.a<T>> b(p4.c cVar, e4.h hVar, n0<T> n0Var) {
        return u.a(cVar, hVar, 1.0f, n0Var, false);
    }

    public static k4.a c(p4.c cVar, e4.h hVar) {
        return new k4.a(b(cVar, hVar, g.f17494a));
    }

    public static k4.j d(p4.c cVar, e4.h hVar) {
        return new k4.j(b(cVar, hVar, i.f17499a));
    }

    public static k4.b e(p4.c cVar, e4.h hVar) {
        return f(cVar, hVar, true);
    }

    public static k4.b f(p4.c cVar, e4.h hVar, boolean z10) {
        return new k4.b(a(cVar, z10 ? q4.h.e() : 1.0f, hVar, l.f17516a));
    }

    public static k4.c g(p4.c cVar, e4.h hVar, int i10) {
        return new k4.c(b(cVar, hVar, new o(i10)));
    }

    public static k4.d h(p4.c cVar, e4.h hVar) {
        return new k4.d(b(cVar, hVar, r.f17529a));
    }

    public static k4.f i(p4.c cVar, e4.h hVar) {
        return new k4.f(u.a(cVar, hVar, q4.h.e(), b0.f17484a, true));
    }

    public static k4.g j(p4.c cVar, e4.h hVar) {
        return new k4.g(b(cVar, hVar, g0.f17495a));
    }

    public static k4.h k(p4.c cVar, e4.h hVar) {
        return new k4.h(a(cVar, q4.h.e(), hVar, h0.f17497a));
    }
}
