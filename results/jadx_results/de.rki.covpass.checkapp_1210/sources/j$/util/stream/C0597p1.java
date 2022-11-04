package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.p1 */
/* loaded from: classes2.dex */
final class C0597p1 extends AbstractC0602q1 implements j$.util.D {
    public C0597p1(N0 n02) {
        super(n02);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }
}
