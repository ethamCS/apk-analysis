package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public interface P0 {
    P0 b(int i10);

    long count();

    void forEach(Consumer consumer);

    void m(Object[] objArr, int i10);

    int p();

    Object[] q(j$.util.function.q qVar);

    P0 r(long j10, long j11, j$.util.function.q qVar);

    /* renamed from: spliterator */
    Spliterator mo21spliterator();
}
