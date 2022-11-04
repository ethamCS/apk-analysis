package hd;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.Map;
import ne.m;
import uc.k;
/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: h */
    static final /* synthetic */ oc.k<Object>[] f11816h = {k0.g(new e0(k0.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final ne.i f11817g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<Map<wd.f, ? extends ce.g<? extends Object>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            i.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<wd.f, ce.g<java.lang.Object>> invoke() {
            /*
                r3 = this;
                hd.i r0 = hd.i.this
                nd.b r0 = r0.c()
                boolean r1 = r0 instanceof nd.e
                r2 = 0
                if (r1 == 0) goto L1e
                hd.d r0 = hd.d.f11804a
                hd.i r1 = hd.i.this
                nd.b r1 = r1.c()
                nd.e r1 = (nd.e) r1
                java.util.List r1 = r1.c()
            L19:
                ce.g r0 = r0.c(r1)
                goto L30
            L1e:
                boolean r0 = r0 instanceof nd.m
                if (r0 == 0) goto L2f
                hd.d r0 = hd.d.f11804a
                hd.i r1 = hd.i.this
                nd.b r1 = r1.c()
                java.util.List r1 = ub.s.d(r1)
                goto L19
            L2f:
                r0 = r2
            L30:
                if (r0 == 0) goto L40
                hd.c r1 = hd.c.f11799a
                wd.f r1 = r1.d()
                tb.r r0 = tb.x.a(r1, r0)
                java.util.Map r2 = ub.n0.e(r0)
            L40:
                if (r2 != 0) goto L46
                java.util.Map r2 = ub.n0.h()
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hd.i.a.invoke():java.util.Map");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nd.a aVar, jd.g gVar) {
        super(gVar, aVar, k.a.H);
        t.e(aVar, "annotation");
        t.e(gVar, "c");
        this.f11817g = gVar.e().d(new a());
    }

    @Override // hd.b, yc.c
    public Map<wd.f, ce.g<Object>> b() {
        return (Map) m.a(this.f11817g, this, f11816h[0]);
    }
}
