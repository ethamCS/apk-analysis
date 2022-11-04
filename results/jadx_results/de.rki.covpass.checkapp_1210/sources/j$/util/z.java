package j$.util;

import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public interface z extends F {
    @Override // j$.util.Spliterator
    boolean b(Consumer consumer);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    boolean j(AbstractC0503e abstractC0503e);

    void k(AbstractC0503e abstractC0503e);

    @Override // j$.util.F, j$.util.Spliterator
    z trySplit();
}
