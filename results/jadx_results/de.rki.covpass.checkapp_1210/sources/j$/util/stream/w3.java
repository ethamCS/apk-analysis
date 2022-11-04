package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class w3 extends z3 implements j$.util.B {
    public w3(j$.util.B b10, long j10, long j11) {
        super(b10, j10, j11);
    }

    w3(j$.util.B b10, long j10, long j11, long j12, long j13) {
        super(b10, j10, j11, j12, j13, null);
    }

    @Override // j$.util.stream.B3
    protected final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new w3((j$.util.B) spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.stream.z3
    protected final /* bridge */ /* synthetic */ Object c() {
        return v3.f13812a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }
}
