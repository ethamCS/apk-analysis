package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
/* renamed from: j$.util.stream.h */
/* loaded from: classes2.dex */
public interface AbstractC0555h extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    /* renamed from: iterator */
    Iterator mo17iterator();

    AbstractC0555h onClose(Runnable runnable);

    AbstractC0555h parallel();

    AbstractC0555h sequential();

    Spliterator spliterator();

    AbstractC0555h unordered();
}
