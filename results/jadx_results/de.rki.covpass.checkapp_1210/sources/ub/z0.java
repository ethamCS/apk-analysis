package ub;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¨\u0006\n"}, d2 = {"T", BuildConfig.FLAVOR, "element", "g", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", BuildConfig.FLAVOR, "elements", "f", "i", "h", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/SetsKt")
/* loaded from: classes.dex */
public class z0 extends y0 {
    public static <T> Set<T> f(Set<? extends T> set, Iterable<? extends T> iterable) {
        Set<T> J0;
        hc.t.e(set, "<this>");
        hc.t.e(iterable, "elements");
        Collection<?> a10 = o.a(iterable, set);
        if (a10.isEmpty()) {
            J0 = c0.J0(set);
            return J0;
        } else if (!(a10 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(a10);
            return linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (T t10 : set) {
                if (!a10.contains(t10)) {
                    linkedHashSet2.add(t10);
                }
            }
            return linkedHashSet2;
        }
    }

    public static <T> Set<T> g(Set<? extends T> set, T t10) {
        int d10;
        hc.t.e(set, "<this>");
        d10 = p0.d(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(d10);
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && hc.t.a(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> h(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i10;
        int d10;
        hc.t.e(set, "<this>");
        hc.t.e(iterable, "elements");
        Integer t10 = v.t(iterable);
        if (t10 != null) {
            i10 = set.size() + t10.intValue();
        } else {
            i10 = set.size() * 2;
        }
        d10 = p0.d(i10);
        LinkedHashSet linkedHashSet = new LinkedHashSet(d10);
        linkedHashSet.addAll(set);
        z.x(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <T> Set<T> i(Set<? extends T> set, T t10) {
        int d10;
        hc.t.e(set, "<this>");
        d10 = p0.d(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(d10);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
