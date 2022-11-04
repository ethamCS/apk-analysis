package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.h0 */
/* loaded from: classes2.dex */
public final class C0556h0 extends AbstractC0571k0 {
    public C0556h0(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    @Override // j$.util.stream.AbstractC0571k0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        j$.util.B m12;
        if (isParallel()) {
            super.forEach(intConsumer);
            return;
        }
        m12 = AbstractC0571k0.m1(j1());
        m12.f(intConsumer);
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0571k0, j$.util.stream.IntStream
    public final void o(IntConsumer intConsumer) {
        j$.util.B m12;
        if (!isParallel()) {
            m12 = AbstractC0571k0.m1(j1());
            m12.f(intConsumer);
            return;
        }
        Objects.requireNonNull(intConsumer);
        X0(new W(intConsumer, true));
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
