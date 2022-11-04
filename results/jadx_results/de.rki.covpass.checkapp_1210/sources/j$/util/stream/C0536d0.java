package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.d0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0536d0 implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f13651a;

    /* renamed from: b */
    public final /* synthetic */ Object f13652b;

    public /* synthetic */ C0536d0(Object obj, int i10) {
        this.f13651a = i10;
        this.f13652b = obj;
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        switch (this.f13651a) {
            case 0:
                ((AbstractC0603q2) this.f13652b).accept(i10);
                return;
            default:
                ((C0541e0) this.f13652b).f13716a.accept(i10);
                return;
        }
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f13651a) {
            case 0:
                return Objects.requireNonNull(intConsumer);
            default:
                return Objects.requireNonNull(intConsumer);
        }
    }
}
