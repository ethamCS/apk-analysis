package j$.util;

import j$.lang.Iterable;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
/* renamed from: j$.util.a */
/* loaded from: classes2.dex */
public interface AbstractC0491a extends Iterable {
    @Override // j$.lang.Iterable
    void forEach(Consumer consumer);

    boolean removeIf(Predicate predicate);

    @Override // java.lang.Iterable, j$.util.List, j$.util.AbstractC0491a, j$.lang.Iterable
    /* renamed from: spliterator */
    Spliterator mo23spliterator();

    Stream stream();
}
