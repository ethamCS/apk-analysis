package hc;

import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", BuildConfig.FLAVOR, "array", BuildConfig.FLAVOR, "a", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    public static final <T> Iterator<T> a(T[] tArr) {
        t.e(tArr, "array");
        return new c(tArr);
    }
}
