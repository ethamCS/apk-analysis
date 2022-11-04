package ke;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ub.p0;
import xc.a1;
/* loaded from: classes3.dex */
public final class y implements h {

    /* renamed from: a */
    private final td.c f15133a;

    /* renamed from: b */
    private final td.a f15134b;

    /* renamed from: c */
    private final gc.l<wd.b, a1> f15135c;

    /* renamed from: d */
    private final Map<wd.b, rd.c> f15136d;

    /* JADX WARN: Multi-variable type inference failed */
    public y(rd.m mVar, td.c cVar, td.a aVar, gc.l<? super wd.b, ? extends a1> lVar) {
        int s10;
        int d10;
        int b10;
        hc.t.e(mVar, "proto");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(aVar, "metadataVersion");
        hc.t.e(lVar, "classSource");
        this.f15133a = cVar;
        this.f15134b = aVar;
        this.f15135c = lVar;
        List<rd.c> l02 = mVar.l0();
        hc.t.d(l02, "proto.class_List");
        s10 = ub.v.s(l02, 10);
        d10 = p0.d(s10);
        b10 = nc.m.b(d10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (Object obj : l02) {
            linkedHashMap.put(x.a(this.f15133a, ((rd.c) obj).g1()), obj);
        }
        this.f15136d = linkedHashMap;
    }

    @Override // ke.h
    public g a(wd.b bVar) {
        hc.t.e(bVar, "classId");
        rd.c cVar = this.f15136d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new g(this.f15133a, cVar, this.f15134b, this.f15135c.invoke(bVar));
    }

    public final Collection<wd.b> b() {
        return this.f15136d.keySet();
    }
}
