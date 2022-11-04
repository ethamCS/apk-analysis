package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.D0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* renamed from: j$.util.Collection$-EL */
/* loaded from: classes2.dex */
public final /* synthetic */ class Collection$EL {
    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof AbstractC0491a) {
            ((AbstractC0491a) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.h(obj);
        }
    }

    public static Spliterator b(Collection collection) {
        if (collection instanceof AbstractC0491a) {
            return ((AbstractC0491a) collection).mo23spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            Objects.requireNonNull(linkedHashSet);
            return new S(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C0643x(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            Objects.requireNonNull(set);
            return new S(set, 1);
        } else if (collection instanceof java.util.List) {
            return Objects.requireNonNull((java.util.List) collection);
        } else {
            Objects.requireNonNull(collection);
            return new S(collection, 0);
        }
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof AbstractC0491a ? ((AbstractC0491a) collection).removeIf(predicate) : Collection$CC.$default$removeIf(collection, predicate);
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        Stream T0;
        if (collection instanceof AbstractC0491a) {
            return ((AbstractC0491a) collection).stream();
        }
        T0 = D0.T0(b(collection), false);
        return T0;
    }
}
