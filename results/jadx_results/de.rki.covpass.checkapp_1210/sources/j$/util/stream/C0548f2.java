package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.f2 */
/* loaded from: classes2.dex */
public final class C0548f2 extends AbstractC0563i2 {
    public C0548f2(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    @Override // j$.util.stream.AbstractC0563i2, j$.util.stream.Stream
    public final void e(Consumer consumer) {
        if (!isParallel()) {
            j1().forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        X0(new Y(consumer, true));
    }

    @Override // j$.util.stream.AbstractC0563i2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            j1().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        throw new UnsupportedOperationException();
    }
}
