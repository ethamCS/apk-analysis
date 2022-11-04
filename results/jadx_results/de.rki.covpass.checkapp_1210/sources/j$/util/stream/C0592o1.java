package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.o1 */
/* loaded from: classes2.dex */
final class C0592o1 extends AbstractC0602q1 implements j$.util.B {
    public C0592o1(L0 l02) {
        super(l02);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }
}
