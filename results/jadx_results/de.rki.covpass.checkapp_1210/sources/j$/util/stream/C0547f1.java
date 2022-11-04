package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.f1 */
/* loaded from: classes2.dex */
final class C0547f1 extends AbstractC0562i1 implements L0 {
    @Override // j$.util.stream.AbstractC0562i1, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.Z(this, consumer);
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        int[] iArr;
        iArr = D0.f13435e;
        return iArr;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void k(Integer[] numArr, int i10) {
        D0.U(this, numArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        k((Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.AbstractC0562i1, j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.c0(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return j$.util.U.c();
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.c();
    }
}
