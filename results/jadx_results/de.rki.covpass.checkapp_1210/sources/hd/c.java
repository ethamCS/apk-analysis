package hd;

import gd.a0;
import hc.t;
import java.util.Map;
import tb.x;
import ub.q0;
import uc.k;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f11799a = new c();

    /* renamed from: b */
    private static final wd.f f11800b;

    /* renamed from: c */
    private static final wd.f f11801c;

    /* renamed from: d */
    private static final wd.f f11802d;

    /* renamed from: e */
    private static final Map<wd.c, wd.c> f11803e;

    static {
        Map<wd.c, wd.c> k10;
        wd.f j10 = wd.f.j("message");
        t.d(j10, "identifier(\"message\")");
        f11800b = j10;
        wd.f j11 = wd.f.j("allowedTargets");
        t.d(j11, "identifier(\"allowedTargets\")");
        f11801c = j11;
        wd.f j12 = wd.f.j("value");
        t.d(j12, "identifier(\"value\")");
        f11802d = j12;
        k10 = q0.k(x.a(k.a.H, a0.f10635d), x.a(k.a.L, a0.f10637f), x.a(k.a.P, a0.f10640i));
        f11803e = k10;
    }

    private c() {
    }

    public static /* synthetic */ yc.c f(c cVar, nd.a aVar, jd.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return cVar.e(aVar, gVar, z10);
    }

    public final yc.c a(wd.c cVar, nd.d dVar, jd.g gVar) {
        nd.a h10;
        t.e(cVar, "kotlinName");
        t.e(dVar, "annotationOwner");
        t.e(gVar, "c");
        if (t.a(cVar, k.a.f23513y)) {
            wd.c cVar2 = a0.f10639h;
            t.d(cVar2, "DEPRECATED_ANNOTATION");
            nd.a h11 = dVar.h(cVar2);
            if (h11 != null || dVar.v()) {
                return new e(h11, gVar);
            }
        }
        wd.c cVar3 = f11803e.get(cVar);
        if (cVar3 == null || (h10 = dVar.h(cVar3)) == null) {
            return null;
        }
        return f(f11799a, h10, gVar, false, 4, null);
    }

    public final wd.f b() {
        return f11800b;
    }

    public final wd.f c() {
        return f11802d;
    }

    public final wd.f d() {
        return f11801c;
    }

    public final yc.c e(nd.a aVar, jd.g gVar, boolean z10) {
        t.e(aVar, "annotation");
        t.e(gVar, "c");
        wd.b i10 = aVar.i();
        if (t.a(i10, wd.b.m(a0.f10635d))) {
            return new i(aVar, gVar);
        }
        if (t.a(i10, wd.b.m(a0.f10637f))) {
            return new h(aVar, gVar);
        }
        if (t.a(i10, wd.b.m(a0.f10640i))) {
            return new b(gVar, aVar, k.a.P);
        }
        if (!t.a(i10, wd.b.m(a0.f10639h))) {
            return new kd.e(gVar, aVar, z10);
        }
        return null;
    }
}
