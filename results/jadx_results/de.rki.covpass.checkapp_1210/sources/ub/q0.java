package ub;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0010\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aa\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00102\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00102\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0014\u001a4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0014\u001aQ\u0010\u0019\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0017*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0010*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00142\u0006\u0010\u0018\u001a\u00028\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aS\u0010\u001b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0017*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0010*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u0006\u0010\u0018\u001a\u00028\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a2\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aI\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010\u001f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002\u001aA\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0087\u0002\u001a0\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¨\u0006$"}, d2 = {"K", "V", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "Ltb/r;", "pairs", "k", "([Ltb/r;)Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "([Ltb/r;)Ljava/util/HashMap;", "key", "i", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Ltb/e0;", "p", "(Ljava/util/Map;[Ltb/r;)V", BuildConfig.FLAVOR, "o", "q", "M", "destination", "r", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "t", "([Ltb/r;Ljava/util/Map;)Ljava/util/Map;", "s", "u", "map", "n", "keys", "l", "m", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/MapsKt")
/* loaded from: classes.dex */
public class q0 extends p0 {
    public static <K, V> Map<K, V> h() {
        f0 f0Var = f0.f23368c;
        hc.t.c(f0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return f0Var;
    }

    public static <K, V> V i(Map<K, ? extends V> map, K k10) {
        hc.t.e(map, "<this>");
        return (V) o0.a(map, k10);
    }

    public static <K, V> HashMap<K, V> j(tb.r<? extends K, ? extends V>... rVarArr) {
        int d10;
        hc.t.e(rVarArr, "pairs");
        d10 = p0.d(rVarArr.length);
        HashMap<K, V> hashMap = new HashMap<>(d10);
        p(hashMap, rVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> k(tb.r<? extends K, ? extends V>... rVarArr) {
        Map<K, V> h10;
        int d10;
        hc.t.e(rVarArr, "pairs");
        if (rVarArr.length > 0) {
            d10 = p0.d(rVarArr.length);
            return t(rVarArr, new LinkedHashMap(d10));
        }
        h10 = h();
        return h10;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map, Iterable<? extends K> iterable) {
        Map u10;
        hc.t.e(map, "<this>");
        hc.t.e(iterable, "keys");
        u10 = u(map);
        z.z(u10.keySet(), iterable);
        return m(u10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> m(Map<K, ? extends V> map) {
        Map<K, V> h10;
        hc.t.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : p0.f(map);
        }
        h10 = h();
        return h10;
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        hc.t.e(map, "<this>");
        hc.t.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, Iterable<? extends tb.r<? extends K, ? extends V>> iterable) {
        hc.t.e(map, "<this>");
        hc.t.e(iterable, "pairs");
        for (tb.r<? extends K, ? extends V> rVar : iterable) {
            map.put((K) rVar.b(), (V) rVar.c());
        }
    }

    public static final <K, V> void p(Map<? super K, ? super V> map, tb.r<? extends K, ? extends V>[] rVarArr) {
        hc.t.e(map, "<this>");
        hc.t.e(rVarArr, "pairs");
        for (tb.r<? extends K, ? extends V> rVar : rVarArr) {
            map.put((K) rVar.b(), (V) rVar.c());
        }
    }

    public static <K, V> Map<K, V> q(Iterable<? extends tb.r<? extends K, ? extends V>> iterable) {
        Map<K, V> h10;
        Map<K, V> e10;
        int d10;
        hc.t.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                h10 = h();
                return h10;
            } else if (size != 1) {
                d10 = p0.d(collection.size());
                return r(iterable, new LinkedHashMap(d10));
            } else {
                e10 = p0.e(iterable instanceof List ? (tb.r<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
                return e10;
            }
        }
        return m(r(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M r(Iterable<? extends tb.r<? extends K, ? extends V>> iterable, M m10) {
        hc.t.e(iterable, "<this>");
        hc.t.e(m10, "destination");
        o(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> s(Map<? extends K, ? extends V> map) {
        Map<K, V> h10;
        Map<K, V> u10;
        hc.t.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            h10 = h();
            return h10;
        } else if (size == 1) {
            return p0.f(map);
        } else {
            u10 = u(map);
            return u10;
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M t(tb.r<? extends K, ? extends V>[] rVarArr, M m10) {
        hc.t.e(rVarArr, "<this>");
        hc.t.e(m10, "destination");
        p(m10, rVarArr);
        return m10;
    }

    public static <K, V> Map<K, V> u(Map<? extends K, ? extends V> map) {
        hc.t.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
