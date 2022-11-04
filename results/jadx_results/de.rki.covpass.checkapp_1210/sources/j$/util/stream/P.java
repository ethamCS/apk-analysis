package j$.util.stream;

import j$.util.C0513l;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class P extends T implements AbstractC0593o2 {
    @Override // j$.util.stream.T, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        y(Integer.valueOf(i10));
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.function.I
    public final Object get() {
        if (this.f13552a) {
            return C0513l.d(((Integer) this.f13553b).intValue());
        }
        return null;
    }
}
