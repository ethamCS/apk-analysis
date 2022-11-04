package ub;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u001a&\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a/\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001f\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a!\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "elements", BuildConfig.FLAVOR, "x", BuildConfig.FLAVOR, "y", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "z", "D", BuildConfig.FLAVOR, "A", "(Ljava/util/List;)Ljava/lang/Object;", "B", "C", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class z extends y {
    public static <T> T A(List<T> list) {
        hc.t.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T B(List<T> list) {
        int j10;
        hc.t.e(list, "<this>");
        if (!list.isEmpty()) {
            j10 = u.j(list);
            return list.remove(j10);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T C(List<T> list) {
        int j10;
        hc.t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        j10 = u.j(list);
        return list.remove(j10);
    }

    public static final <T> boolean D(Collection<? super T> collection, Iterable<? extends T> iterable) {
        hc.t.e(collection, "<this>");
        hc.t.e(iterable, "elements");
        return hc.q0.a(collection).retainAll(o.a(iterable, collection));
    }

    public static <T> boolean x(Collection<? super T> collection, Iterable<? extends T> iterable) {
        hc.t.e(collection, "<this>");
        hc.t.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean y(Collection<? super T> collection, T[] tArr) {
        List d10;
        hc.t.e(collection, "<this>");
        hc.t.e(tArr, "elements");
        d10 = l.d(tArr);
        return collection.addAll(d10);
    }

    public static final <T> boolean z(Collection<? super T> collection, Iterable<? extends T> iterable) {
        hc.t.e(collection, "<this>");
        hc.t.e(iterable, "elements");
        return hc.q0.a(collection).removeAll(o.a(iterable, collection));
    }
}
