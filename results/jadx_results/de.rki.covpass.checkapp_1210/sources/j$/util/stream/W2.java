package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W2 extends Y2 implements j$.util.D {

    /* renamed from: g */
    final /* synthetic */ X2 f13574g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(X2 x22, int i10, int i11, int i12, int i13) {
        super(x22, i10, i11, i12, i13);
        this.f13574g = x22;
    }

    @Override // j$.util.stream.Y2
    final void a(Object obj, int i10, Object obj2) {
        ((j$.util.function.x) obj2).d(((long[]) obj)[i10]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.stream.Y2
    final j$.util.F c(Object obj, int i10, int i11) {
        return j$.util.U.l((long[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.Y2
    final j$.util.F d(int i10, int i11, int i12, int i13) {
        return new W2(this.f13574g, i10, i11, i12, i13);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }
}
