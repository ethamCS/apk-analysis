package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.h3 */
/* loaded from: classes2.dex */
final class C0559h3 extends AbstractC0569j3 implements IntConsumer {

    /* renamed from: c */
    final int[] f13703c = new int[128];

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        int[] iArr = this.f13703c;
        int i11 = this.f13709b;
        this.f13709b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.stream.AbstractC0569j3
    public final void b(Object obj, long j10) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            intConsumer.accept(this.f13703c[i10]);
        }
    }
}
