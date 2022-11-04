package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S2 extends Y2 implements j$.util.z {

    /* renamed from: g */
    final /* synthetic */ T2 f13550g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t22, int i10, int i11, int i12, int i13) {
        super(t22, i10, i11, i12, i13);
        this.f13550g = t22;
    }

    @Override // j$.util.stream.Y2
    final void a(Object obj, int i10, Object obj2) {
        ((AbstractC0503e) obj2).c(((double[]) obj)[i10]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.stream.Y2
    final j$.util.F c(Object obj, int i10, int i11) {
        return j$.util.U.j((double[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.Y2
    final j$.util.F d(int i10, int i11, int i12, int i13) {
        return new S2(this.f13550g, i10, i11, i12, i13);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
    }
}
