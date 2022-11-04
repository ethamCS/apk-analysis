package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class u3 extends z3 implements j$.util.z {
    public u3(j$.util.z zVar, long j10, long j11) {
        super(zVar, j10, j11);
    }

    u3(j$.util.z zVar, long j10, long j11, long j12, long j13) {
        super(zVar, j10, j11, j12, j13, null);
    }

    @Override // j$.util.stream.B3
    protected final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new u3((j$.util.z) spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.stream.z3
    protected final /* bridge */ /* synthetic */ Object c() {
        return t3.f13798a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
    }
}
