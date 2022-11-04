package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.x1 */
/* loaded from: classes2.dex */
public final class C0629x1 extends A1 implements AbstractC0593o2 {

    /* renamed from: h */
    private final int[] f13825h;

    public C0629x1(Spliterator spliterator, D0 d02, int[] iArr) {
        super(spliterator, d02, iArr.length);
        this.f13825h = iArr;
    }

    C0629x1(C0629x1 c0629x1, Spliterator spliterator, long j10, long j11) {
        super(c0629x1, spliterator, j10, j11, c0629x1.f13825h.length);
        this.f13825h = c0629x1.f13825h;
    }

    @Override // j$.util.stream.A1, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        int i11 = this.f13407f;
        if (i11 < this.f13408g) {
            int[] iArr = this.f13825h;
            this.f13407f = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f13407f));
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.stream.A1
    final A1 b(Spliterator spliterator, long j10, long j11) {
        return new C0629x1(this, spliterator, j10, j11);
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
