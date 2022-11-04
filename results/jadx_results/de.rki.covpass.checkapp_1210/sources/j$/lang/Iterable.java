package j$.lang;

import j$.util.DesugarCollections;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
public interface Iterable<T> {

    /* renamed from: j$.lang.Iterable$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T> {
        public static void $default$forEach(java.lang.Iterable iterable, Consumer consumer) {
            if (DesugarCollections.f13230a.isInstance(iterable)) {
                DesugarCollections.c(iterable, consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                consumer.h(it.next());
            }
        }
    }

    void forEach(Consumer<? super T> consumer);

    Iterator<T> iterator();

    /* renamed from: spliterator */
    Spliterator<T> mo23spliterator();
}
