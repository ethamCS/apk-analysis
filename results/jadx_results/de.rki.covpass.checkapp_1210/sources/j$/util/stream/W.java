package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class W extends Z implements AbstractC0593o2 {

    /* renamed from: b */
    final IntConsumer f13570b;

    public W(IntConsumer intConsumer, boolean z10) {
        super(z10);
        this.f13570b = intConsumer;
    }

    @Override // j$.util.stream.Z, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        this.f13570b.accept(i10);
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.AbstractC0593o2
    public final /* synthetic */ void v(Integer num) {
        D0.L(this, num);
    }
}
