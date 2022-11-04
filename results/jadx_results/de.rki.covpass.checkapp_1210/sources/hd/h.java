package hd;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.Map;
import ne.m;
import tb.x;
import ub.p0;
import ub.q0;
import uc.k;
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: h */
    static final /* synthetic */ oc.k<Object>[] f11813h = {k0.g(new e0(k0.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final ne.i f11814g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<Map<wd.f, ? extends ce.g<?>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            h.this = r1;
        }

        /* renamed from: b */
        public final Map<wd.f, ce.g<?>> invoke() {
            Map<wd.f, ce.g<?>> h10;
            ce.g<?> a10 = d.f11804a.a(h.this.c());
            Map<wd.f, ce.g<?>> e10 = a10 != null ? p0.e(x.a(c.f11799a.c(), a10)) : null;
            if (e10 == null) {
                h10 = q0.h();
                return h10;
            }
            return e10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nd.a aVar, jd.g gVar) {
        super(gVar, aVar, k.a.L);
        t.e(aVar, "annotation");
        t.e(gVar, "c");
        this.f11814g = gVar.e().d(new a());
    }

    @Override // hd.b, yc.c
    public Map<wd.f, ce.g<?>> b() {
        return (Map) m.a(this.f11814g, this, f11813h[0]);
    }
}
