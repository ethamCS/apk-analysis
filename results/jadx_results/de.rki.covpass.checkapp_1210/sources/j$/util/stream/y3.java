package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class y3 extends z3 implements j$.util.D {
    public y3(j$.util.D d10, long j10, long j11) {
        super(d10, j10, j11);
    }

    y3(j$.util.D d10, long j10, long j11, long j12, long j13) {
        super(d10, j10, j11, j12, j13, null);
    }

    @Override // j$.util.stream.B3
    protected final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new y3((j$.util.D) spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.stream.z3
    protected final /* bridge */ /* synthetic */ Object c() {
        return x3.f13829a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }
}
