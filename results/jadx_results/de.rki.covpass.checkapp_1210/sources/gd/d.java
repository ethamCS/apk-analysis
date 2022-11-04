package gd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class d extends a<yc.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar) {
        super(wVar);
        hc.t.e(wVar, "javaTypeEnhancementState");
    }

    private final List<String> y(ce.g<?> gVar) {
        List<String> h10;
        List<String> d10;
        if (!(gVar instanceof ce.b)) {
            if (gVar instanceof ce.j) {
                d10 = ub.t.d(((ce.j) gVar).c().g());
                return d10;
            } else {
                h10 = ub.u.h();
                return h10;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ce.g<?> gVar2 : ((ce.b) gVar).b()) {
            ub.z.x(arrayList, y(gVar2));
        }
        return arrayList;
    }

    /* renamed from: u */
    public Iterable<String> b(yc.c cVar, boolean z10) {
        hc.t.e(cVar, "<this>");
        Map<wd.f, ce.g<?>> b10 = cVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<wd.f, ce.g<?>> entry : b10.entrySet()) {
            ub.z.x(arrayList, (!z10 || hc.t.a(entry.getKey(), a0.f10634c)) ? y(entry.getValue()) : ub.u.h());
        }
        return arrayList;
    }

    /* renamed from: v */
    public wd.c i(yc.c cVar) {
        hc.t.e(cVar, "<this>");
        return cVar.d();
    }

    /* renamed from: w */
    public Object j(yc.c cVar) {
        hc.t.e(cVar, "<this>");
        xc.e e10 = ee.a.e(cVar);
        hc.t.b(e10);
        return e10;
    }

    /* renamed from: x */
    public Iterable<yc.c> k(yc.c cVar) {
        List h10;
        yc.g j10;
        hc.t.e(cVar, "<this>");
        xc.e e10 = ee.a.e(cVar);
        if (e10 == null || (j10 = e10.j()) == null) {
            h10 = ub.u.h();
            return h10;
        }
        return j10;
    }
}
