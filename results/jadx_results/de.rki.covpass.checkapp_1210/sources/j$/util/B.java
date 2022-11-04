package j$.util;

import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
/* loaded from: classes2.dex */
public interface B extends F {
    @Override // j$.util.Spliterator
    boolean b(Consumer consumer);

    boolean e(IntConsumer intConsumer);

    void f(IntConsumer intConsumer);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    @Override // j$.util.F, j$.util.Spliterator
    B trySplit();
}
