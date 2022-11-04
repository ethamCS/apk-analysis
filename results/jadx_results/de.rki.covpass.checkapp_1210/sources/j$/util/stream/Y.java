package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class Y extends Z {

    /* renamed from: b */
    final Consumer f13579b;

    public Y(Consumer consumer, boolean z10) {
        super(z10);
        this.f13579b = consumer;
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        this.f13579b.h(obj);
    }
}
