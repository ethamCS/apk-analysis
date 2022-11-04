package j$.util;

import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f13395a;

    public /* synthetic */ r(Consumer consumer) {
        this.f13395a = consumer;
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        this.f13395a.h(Integer.valueOf(i10));
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }
}
