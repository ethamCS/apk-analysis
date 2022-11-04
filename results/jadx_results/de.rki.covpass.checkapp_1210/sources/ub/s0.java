package ub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\u001a6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001a6\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\t"}, d2 = {"K", "V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ltb/r;", "w", "Laf/h;", BuildConfig.FLAVOR, "v", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/MapsKt")
/* loaded from: classes.dex */
public class s0 extends r0 {
    public static <K, V> af.h<Map.Entry<K, V>> v(Map<? extends K, ? extends V> map) {
        af.h<Map.Entry<K, V>> M;
        hc.t.e(map, "<this>");
        M = c0.M(map.entrySet());
        return M;
    }

    public static <K, V> List<tb.r<K, V>> w(Map<? extends K, ? extends V> map) {
        List<tb.r<K, V>> d10;
        List<tb.r<K, V>> h10;
        List<tb.r<K, V>> h11;
        hc.t.e(map, "<this>");
        if (map.size() == 0) {
            h11 = u.h();
            return h11;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            h10 = u.h();
            return h10;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            d10 = t.d(new tb.r(next.getKey(), next.getValue()));
            return d10;
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new tb.r(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new tb.r(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
