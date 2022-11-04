package kotlinx.coroutines;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"T", BuildConfig.FLAVOR, "Lkotlinx/coroutines/x0;", BuildConfig.FLAVOR, "a", "(Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f {
    public static final <T> Object a(Collection<? extends x0<? extends T>> collection, xb.d<? super List<? extends T>> dVar) {
        List h10;
        if (collection.isEmpty()) {
            h10 = ub.u.h();
            return h10;
        }
        Object[] array = collection.toArray(new x0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new e((x0[]) array).b(dVar);
    }
}
