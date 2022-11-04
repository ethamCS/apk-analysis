package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class D3 extends F3 implements j$.util.B, IntConsumer {

    /* renamed from: e */
    int f13441e;

    public D3(j$.util.B b10, long j10, long j11) {
        super(b10, j10, j11);
    }

    D3(j$.util.B b10, D3 d32) {
        super(b10, d32);
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        this.f13441e = i10;
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected final Spliterator o(Spliterator spliterator) {
        return new D3((j$.util.B) spliterator, this);
    }

    @Override // j$.util.stream.F3
    protected final void q(Object obj) {
        ((IntConsumer) obj).accept(this.f13441e);
    }

    @Override // j$.util.stream.F3
    protected final AbstractC0569j3 r() {
        return new C0559h3();
    }
}
