package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class E3 extends F3 implements j$.util.D, j$.util.function.x {

    /* renamed from: e */
    long f13446e;

    public E3(j$.util.D d10, long j10, long j11) {
        super(d10, j10, j11);
    }

    E3(j$.util.D d10, E3 e32) {
        super(d10, e32);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.function.x
    public final void d(long j10) {
        this.f13446e = j10;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected final Spliterator o(Spliterator spliterator) {
        return new E3((j$.util.D) spliterator, this);
    }

    @Override // j$.util.stream.F3
    protected final void q(Object obj) {
        ((j$.util.function.x) obj).d(this.f13446e);
    }

    @Override // j$.util.stream.F3
    protected final AbstractC0569j3 r() {
        return new C0564i3();
    }
}
