package fb;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0003"}, d2 = {"T", BuildConfig.FLAVOR, "a", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k {
    public static final <T> Set<T> a(Set<? extends T> set) {
        hc.t.e(set, "<this>");
        Set<T> unmodifiableSet = Collections.unmodifiableSet(set);
        hc.t.d(unmodifiableSet, "unmodifiableSet(this)");
        return unmodifiableSet;
    }
}
