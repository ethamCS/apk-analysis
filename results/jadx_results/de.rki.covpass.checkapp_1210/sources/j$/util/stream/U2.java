package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U2 extends Y2 implements j$.util.B {

    /* renamed from: g */
    final /* synthetic */ V2 f13563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(V2 v22, int i10, int i11, int i12, int i13) {
        super(v22, i10, i11, i12, i13);
        this.f13563g = v22;
    }

    @Override // j$.util.stream.Y2
    final void a(Object obj, int i10, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i10]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.stream.Y2
    final j$.util.F c(Object obj, int i10, int i11) {
        return j$.util.U.k((int[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.Y2
    final j$.util.F d(int i10, int i11, int i12, int i13) {
        return new U2(this.f13563g, i10, i11, i12, i13);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }
}
