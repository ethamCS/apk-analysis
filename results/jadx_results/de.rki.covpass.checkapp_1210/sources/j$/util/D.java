package j$.util;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public interface D extends F {
    @Override // j$.util.Spliterator
    boolean b(Consumer consumer);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    void g(j$.util.function.x xVar);

    boolean i(j$.util.function.x xVar);

    @Override // j$.util.F, j$.util.Spliterator
    D trySplit();
}
