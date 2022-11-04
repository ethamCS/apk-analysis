package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.AbstractC0503e;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class D extends G {
    public D(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    @Override // j$.util.stream.G, j$.util.stream.I
    public final void H(AbstractC0503e abstractC0503e) {
        j$.util.z m12;
        if (!isParallel()) {
            m12 = G.m1(j1());
            m12.k(abstractC0503e);
            return;
        }
        Objects.requireNonNull(abstractC0503e);
        X0(new V(abstractC0503e, true));
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.G, j$.util.stream.I
    public final void h(AbstractC0503e abstractC0503e) {
        j$.util.z m12;
        if (isParallel()) {
            super.h(abstractC0503e);
            return;
        }
        m12 = G.m1(j1());
        m12.k(abstractC0503e);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ I parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ I sequential() {
        sequential();
        return this;
    }
}
