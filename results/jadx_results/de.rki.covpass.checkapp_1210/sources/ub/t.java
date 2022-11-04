package ub;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001\u001a3\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\n\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "element", BuildConfig.FLAVOR, "d", "(Ljava/lang/Object;)Ljava/util/List;", "E", BuildConfig.FLAVOR, "c", "builder", "a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "isVarargs", BuildConfig.FLAVOR, "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class t {
    public static <E> List<E> a(List<E> list) {
        hc.t.e(list, "builder");
        return ((vb.b) list).s();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        hc.t.e(tArr, "<this>");
        if (!z10 || !hc.t.a(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            hc.t.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return tArr;
    }

    public static <E> List<E> c() {
        return new vb.b();
    }

    public static <T> List<T> d(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        hc.t.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
