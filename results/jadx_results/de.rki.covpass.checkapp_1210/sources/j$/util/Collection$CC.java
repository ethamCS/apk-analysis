package j$.util;

import j$.util.function.Predicate;
import j$.util.stream.D0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Objects;
/* renamed from: j$.util.Collection$-CC */
/* loaded from: classes2.dex */
public final /* synthetic */ class Collection$CC<E> {
    public static Stream $default$parallelStream(Collection collection) {
        return D0.T0(Collection$EL.b(collection), true);
    }

    public static boolean $default$removeIf(Collection collection, Predicate predicate) {
        if (DesugarCollections.f13230a.isInstance(collection)) {
            return DesugarCollections.d(collection, predicate);
        }
        Objects.requireNonNull(predicate);
        boolean z10 = false;
        java.util.Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Stream $default$stream(Collection collection) {
        return D0.T0(Collection$EL.b(collection), false);
    }
}
