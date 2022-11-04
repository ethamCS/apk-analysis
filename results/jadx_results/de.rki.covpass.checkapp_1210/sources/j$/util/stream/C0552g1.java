package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.g1 */
/* loaded from: classes2.dex */
final class C0552g1 extends AbstractC0562i1 implements N0 {
    @Override // j$.util.stream.AbstractC0562i1, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.a0(this, consumer);
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        long[] jArr;
        jArr = D0.f13436f;
        return jArr;
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        o((Long[]) objArr, i10);
    }

    @Override // j$.util.stream.N0
    public final /* synthetic */ void o(Long[] lArr, int i10) {
        D0.W(this, lArr, i10);
    }

    @Override // j$.util.stream.AbstractC0562i1, j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.d0(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return j$.util.U.d();
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.d();
    }
}
