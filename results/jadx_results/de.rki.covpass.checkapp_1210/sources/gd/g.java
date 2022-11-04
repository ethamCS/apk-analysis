package gd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ub.p0;
import ub.q0;
import uc.k;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final g f10698a = new g();

    /* renamed from: b */
    private static final Map<wd.c, wd.f> f10699b;

    /* renamed from: c */
    private static final Map<wd.f, List<wd.f>> f10700c;

    /* renamed from: d */
    private static final Set<wd.c> f10701d;

    /* renamed from: e */
    private static final Set<wd.f> f10702e;

    static {
        wd.c d10;
        wd.c d11;
        wd.c c10;
        wd.c c11;
        wd.c d12;
        wd.c c12;
        wd.c c13;
        wd.c c14;
        Map<wd.c, wd.f> k10;
        int s10;
        int d13;
        int s11;
        Set<wd.f> J0;
        List O;
        wd.d dVar = k.a.f23501s;
        d10 = h.d(dVar, "name");
        d11 = h.d(dVar, "ordinal");
        c10 = h.c(k.a.U, "size");
        wd.c cVar = k.a.Y;
        c11 = h.c(cVar, "size");
        d12 = h.d(k.a.f23477g, "length");
        c12 = h.c(cVar, "keys");
        c13 = h.c(cVar, "values");
        c14 = h.c(cVar, "entries");
        k10 = q0.k(tb.x.a(d10, wd.f.j("name")), tb.x.a(d11, wd.f.j("ordinal")), tb.x.a(c10, wd.f.j("size")), tb.x.a(c11, wd.f.j("size")), tb.x.a(d12, wd.f.j("length")), tb.x.a(c12, wd.f.j("keySet")), tb.x.a(c13, wd.f.j("values")), tb.x.a(c14, wd.f.j("entrySet")));
        f10699b = k10;
        Set<Map.Entry<wd.c, wd.f>> entrySet = k10.entrySet();
        s10 = ub.v.s(entrySet, 10);
        ArrayList<tb.r> arrayList = new ArrayList(s10);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new tb.r(((wd.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (tb.r rVar : arrayList) {
            wd.f fVar = (wd.f) rVar.f();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((wd.f) rVar.e());
        }
        d13 = p0.d(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d13);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            O = ub.c0.O((Iterable) entry2.getValue());
            linkedHashMap2.put(key, O);
        }
        f10700c = linkedHashMap2;
        Set<wd.c> keySet = f10699b.keySet();
        f10701d = keySet;
        s11 = ub.v.s(keySet, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (wd.c cVar2 : keySet) {
            arrayList2.add(cVar2.g());
        }
        J0 = ub.c0.J0(arrayList2);
        f10702e = J0;
    }

    private g() {
    }

    public final Map<wd.c, wd.f> a() {
        return f10699b;
    }

    public final List<wd.f> b(wd.f fVar) {
        List<wd.f> h10;
        hc.t.e(fVar, "name1");
        List<wd.f> list = f10700c.get(fVar);
        if (list == null) {
            h10 = ub.u.h();
            return h10;
        }
        return list;
    }

    public final Set<wd.c> c() {
        return f10701d;
    }

    public final Set<wd.f> d() {
        return f10702e;
    }
}
