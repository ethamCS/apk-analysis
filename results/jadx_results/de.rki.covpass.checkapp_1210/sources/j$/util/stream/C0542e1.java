package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.e1 */
/* loaded from: classes2.dex */
final class C0542e1 extends AbstractC0562i1 implements J0 {
    @Override // j$.util.stream.AbstractC0562i1, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void f(Double[] dArr, int i10) {
        D0.S(this, dArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.Y(this, consumer);
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        double[] dArr;
        dArr = D0.f13437g;
        return dArr;
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        f((Double[]) objArr, i10);
    }

    @Override // j$.util.stream.AbstractC0562i1, j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.b0(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return j$.util.U.b();
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.b();
    }
}
