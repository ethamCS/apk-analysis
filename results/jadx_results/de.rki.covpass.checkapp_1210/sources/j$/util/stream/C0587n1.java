package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.n1 */
/* loaded from: classes2.dex */
final class C0587n1 extends AbstractC0602q1 implements j$.util.z {
    public C0587n1(J0 j02) {
        super(j02);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
    }
}
