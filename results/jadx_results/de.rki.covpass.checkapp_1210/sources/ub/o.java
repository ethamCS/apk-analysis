package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¨\u0006\u0007"}, d2 = {"T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "source", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o {
    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        HashSet D0;
        List F0;
        hc.t.e(iterable, "<this>");
        hc.t.e(iterable2, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
                    Collection<T> collection = (Collection) iterable;
                    if (!b(collection)) {
                        return collection;
                    }
                }
            } else if (!r.f23387b) {
                F0 = c0.F0(iterable);
                return F0;
            }
            D0 = c0.D0(iterable);
            return D0;
        }
        return (Collection) iterable;
    }

    private static final <T> boolean b(Collection<? extends T> collection) {
        return r.f23387b && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
