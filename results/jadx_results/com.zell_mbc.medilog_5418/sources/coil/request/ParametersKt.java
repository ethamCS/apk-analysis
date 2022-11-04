package coil.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ParametersExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0086\b¨\u0006\t"}, d2 = {"count", "", "Lcoil/request/Parameters;", "get", "", "key", "", "isNotEmpty", "", "coil-base_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ParametersKt {
    public static final int count(Parameters count) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        return count.size();
    }

    public static final boolean isNotEmpty(Parameters isNotEmpty) {
        Intrinsics.checkNotNullParameter(isNotEmpty, "$this$isNotEmpty");
        return !isNotEmpty.isEmpty();
    }

    public static final Object get(Parameters get, String key) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        Intrinsics.checkNotNullParameter(key, "key");
        return get.value(key);
    }
}
