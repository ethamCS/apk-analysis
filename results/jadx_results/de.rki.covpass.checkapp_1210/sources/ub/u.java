package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\f2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\t\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u001aG\u0010\u0016\u001a\u00020\u0013\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\r\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\b\u0010\u001c\u001a\u00020\u0019H\u0001\u001a\b\u0010\u001d\u001a\u00020\u0019H\u0001\"\u0019\u0010!\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"!\u0010$\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "([Ljava/lang/Object;)Ljava/util/Collection;", BuildConfig.FLAVOR, "h", "elements", "k", "([Ljava/lang/Object;)Ljava/util/List;", BuildConfig.FLAVOR, "n", BuildConfig.FLAVOR, "element", "l", "(Ljava/lang/Object;)Ljava/util/List;", "m", "o", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "fromIndex", "toIndex", "f", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "Ltb/e0;", "p", "(III)V", "r", "q", "Lnc/g;", "i", "(Ljava/util/Collection;)Lnc/g;", "indices", "j", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class u extends t {
    public static final <T> Collection<T> e(T[] tArr) {
        hc.t.e(tArr, "<this>");
        return new g(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int f(List<? extends T> list, T t10, int i10, int i11) {
        int a10;
        hc.t.e(list, "<this>");
        p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            a10 = wb.b.a(list.get(i13), t10);
            if (a10 < 0) {
                i10 = i13 + 1;
            } else if (a10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int g(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return f(list, comparable, i10, i11);
    }

    public static <T> List<T> h() {
        return e0.f23367c;
    }

    public static nc.g i(Collection<?> collection) {
        hc.t.e(collection, "<this>");
        return new nc.g(0, collection.size() - 1);
    }

    public static <T> int j(List<? extends T> list) {
        hc.t.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> k(T... tArr) {
        List<T> h10;
        List<T> d10;
        hc.t.e(tArr, "elements");
        if (tArr.length > 0) {
            d10 = l.d(tArr);
            return d10;
        }
        h10 = h();
        return h10;
    }

    public static <T> List<T> l(T t10) {
        List<T> h10;
        List<T> d10;
        if (t10 != null) {
            d10 = t.d(t10);
            return d10;
        }
        h10 = h();
        return h10;
    }

    public static <T> List<T> m(T... tArr) {
        List<T> x10;
        hc.t.e(tArr, "elements");
        x10 = m.x(tArr);
        return x10;
    }

    public static <T> List<T> n(T... tArr) {
        hc.t.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new g(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> o(List<? extends T> list) {
        List<T> h10;
        List<T> d10;
        hc.t.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            h10 = h();
            return h10;
        } else if (size != 1) {
            return list;
        } else {
            d10 = t.d(list.get(0));
            return d10;
        }
    }

    private static final void p(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 <= i10) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
