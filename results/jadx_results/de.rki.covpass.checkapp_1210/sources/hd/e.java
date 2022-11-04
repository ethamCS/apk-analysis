package hd;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.Map;
import ne.m;
import tb.x;
import ub.p0;
import uc.k;
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: h */
    static final /* synthetic */ oc.k<Object>[] f11808h = {k0.g(new e0(k0.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final ne.i f11809g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<Map<wd.f, ? extends ce.v>> {

        /* renamed from: c */
        public static final a f11810c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Map<wd.f, ce.v> invoke() {
            Map<wd.f, ce.v> e10;
            e10 = p0.e(x.a(c.f11799a.b(), new ce.v("Deprecated in Java")));
            return e10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nd.a aVar, jd.g gVar) {
        super(gVar, aVar, k.a.f23513y);
        t.e(gVar, "c");
        this.f11809g = gVar.e().d(a.f11810c);
    }

    @Override // hd.b, yc.c
    public Map<wd.f, ce.g<?>> b() {
        return (Map) m.a(this.f11809g, this, f11808h[0]);
    }
}
