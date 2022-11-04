package gd;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ub.q0;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final m f10735a;

    /* renamed from: b */
    private static final Map<wd.b, wd.b> f10736b;

    /* renamed from: c */
    private static final Map<wd.c, wd.c> f10737c;

    static {
        Map<wd.c, wd.c> q10;
        m mVar = new m();
        f10735a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f10736b = linkedHashMap;
        wd.i iVar = wd.i.f24825a;
        mVar.c(iVar.j(), mVar.a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.c(iVar.l(), mVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.c(iVar.k(), mVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        wd.b m10 = wd.b.m(new wd.c("java.util.function.Function"));
        hc.t.d(m10, "topLevel(FqName(\"java.util.function.Function\"))");
        mVar.c(m10, mVar.a("java.util.function.UnaryOperator"));
        wd.b m11 = wd.b.m(new wd.c("java.util.function.BiFunction"));
        hc.t.d(m11, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        mVar.c(m11, mVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(tb.x.a(((wd.b) entry.getKey()).b(), ((wd.b) entry.getValue()).b()));
        }
        q10 = q0.q(arrayList);
        f10737c = q10;
    }

    private m() {
    }

    private final List<wd.b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(wd.b.m(new wd.c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(wd.b bVar, List<wd.b> list) {
        Map<wd.b, wd.b> map = f10736b;
        for (Object obj : list) {
            wd.b bVar2 = (wd.b) obj;
            map.put(obj, bVar);
        }
    }

    public final wd.c b(wd.c cVar) {
        hc.t.e(cVar, "classFqName");
        return f10737c.get(cVar);
    }
}
