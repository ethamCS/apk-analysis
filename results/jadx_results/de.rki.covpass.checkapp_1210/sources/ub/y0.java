package ub;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¨\u0006\f"}, d2 = {"T", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "elements", "e", "([Ljava/lang/Object;)Ljava/util/Set;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "c", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "d", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/SetsKt")
/* loaded from: classes.dex */
public class y0 extends x0 {
    public static <T> Set<T> b() {
        return g0.f23371c;
    }

    public static <T> LinkedHashSet<T> c(T... tArr) {
        int d10;
        hc.t.e(tArr, "elements");
        d10 = p0.d(tArr.length);
        return (LinkedHashSet) m.b0(tArr, new LinkedHashSet(d10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Set<T> d(Set<? extends T> set) {
        Set<T> b10;
        Set<T> a10;
        hc.t.e(set, "<this>");
        int size = set.size();
        if (size == 0) {
            b10 = b();
            return b10;
        } else if (size != 1) {
            return set;
        } else {
            a10 = x0.a(set.iterator().next());
            return a10;
        }
    }

    public static <T> Set<T> e(T... tArr) {
        Set<T> b10;
        Set<T> u02;
        hc.t.e(tArr, "elements");
        if (tArr.length > 0) {
            u02 = m.u0(tArr);
            return u02;
        }
        b10 = b();
        return b10;
    }
}
