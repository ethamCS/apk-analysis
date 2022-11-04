package j$.util;

import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class M extends AbstractC0516o implements z {
    @Override // j$.util.z, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.z, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0516o.h(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0516o.l(this, i10);
    }

    @Override // j$.util.z
    public final boolean j(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        return false;
    }

    @Override // j$.util.z
    public final void k(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
    }
}
