package coil.extension;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ParametersDeprecated.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0087\b¨\u0006\t"}, d2 = {"count", "", "Lcoil/request/Parameters;", "get", "", "key", "", "isNotEmpty", "", "coil-base_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Parameters {
    @Deprecated(message = "Replace `coil.extension.count` with `coil.request.count`.")
    public static final int count(coil.request.Parameters count) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        return count.size();
    }

    @Deprecated(message = "Replace `coil.extension.isNotEmpty` with `coil.request.isNotEmpty`.")
    public static final boolean isNotEmpty(coil.request.Parameters isNotEmpty) {
        Intrinsics.checkNotNullParameter(isNotEmpty, "$this$isNotEmpty");
        return !isNotEmpty.isEmpty();
    }

    @Deprecated(message = "Replace `coil.extension.get` with `coil.request.get`.")
    public static final Object get(coil.request.Parameters get, String key) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        Intrinsics.checkNotNullParameter(key, "key");
        return get.value(key);
    }
}
