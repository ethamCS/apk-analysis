package ub;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "element", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/SetsKt")
/* loaded from: classes.dex */
public class x0 {
    public static <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        hc.t.d(singleton, "singleton(element)");
        return singleton;
    }
}
