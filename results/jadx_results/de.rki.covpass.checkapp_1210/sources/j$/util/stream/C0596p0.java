package j$.util.stream;

import j$.util.Spliterator;
import java.util.Objects;
/* renamed from: j$.util.stream.p0 */
/* loaded from: classes2.dex */
public final class C0596p0 extends AbstractC0608s0 {
    public C0596p0(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    @Override // j$.util.stream.AbstractC0608s0, j$.util.stream.AbstractC0616u0
    public final void A(j$.util.function.x xVar) {
        j$.util.D m12;
        if (!isParallel()) {
            m12 = AbstractC0608s0.m1(j1());
            m12.g(xVar);
            return;
        }
        Objects.requireNonNull(xVar);
        X0(new X(xVar, true));
    }

    @Override // j$.util.stream.AbstractC0608s0, j$.util.stream.AbstractC0616u0
    public final void d(j$.util.function.x xVar) {
        j$.util.D m12;
        if (isParallel()) {
            super.d(xVar);
            return;
        }
        m12 = AbstractC0608s0.m1(j1());
        m12.g(xVar);
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ AbstractC0616u0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ AbstractC0616u0 sequential() {
        sequential();
        return this;
    }
}
