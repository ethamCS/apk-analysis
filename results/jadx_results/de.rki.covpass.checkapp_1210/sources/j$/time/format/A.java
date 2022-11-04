package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a */
    private final Map f13023a;

    /* renamed from: b */
    private final HashMap f13024b;

    public A(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f13023a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i10 = B.f13027c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = B.f13026b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((E) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = B.f13026b;
        Collections.sort(arrayList, comparator);
        this.f13024b = hashMap;
    }

    public final String a(long j10, E e10) {
        Map map = (Map) this.f13023a.get(e10);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }

    public final Iterator b(E e10) {
        List list = (List) this.f13024b.get(e10);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
