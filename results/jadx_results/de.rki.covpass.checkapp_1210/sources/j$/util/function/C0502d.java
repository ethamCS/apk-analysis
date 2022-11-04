package j$.util.function;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.function.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0502d implements AbstractC0503e {

    /* renamed from: a */
    final /* synthetic */ DoubleConsumer f13372a;

    private /* synthetic */ C0502d(DoubleConsumer doubleConsumer) {
        this.f13372a = doubleConsumer;
    }

    public static /* synthetic */ AbstractC0503e b(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return new C0502d(doubleConsumer);
    }

    @Override // j$.util.function.AbstractC0503e
    public final /* synthetic */ void c(double d10) {
        this.f13372a.accept(d10);
    }
}
