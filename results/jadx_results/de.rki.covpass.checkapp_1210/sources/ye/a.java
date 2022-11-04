package ye;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ub.c0;
import ub.u;
/* loaded from: classes3.dex */
public final class a {
    public static final <T> void a(Collection<T> collection, T t10) {
        t.e(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        List<T> h10;
        Object V;
        List<T> d10;
        t.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            h10 = u.h();
            return h10;
        } else if (size != 1) {
            arrayList.trimToSize();
            return arrayList;
        } else {
            V = c0.V(arrayList);
            d10 = ub.t.d(V);
            return d10;
        }
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        t.e(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (K k10 : iterable) {
            linkedHashMap.put(k10, Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i10) {
        return new HashMap<>(b(i10));
    }

    public static final <E> HashSet<E> f(int i10) {
        return new HashSet<>(b(i10));
    }

    public static final <E> LinkedHashSet<E> g(int i10) {
        return new LinkedHashSet<>(b(i10));
    }
}
