package j$.util;
/* loaded from: classes2.dex */
public interface F extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    F trySplit();
}
