package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class W0 extends Z0 implements J0 {
    public W0(J0 j02, J0 j03) {
        super(j02, j03);
    }

    @Override // j$.util.stream.O0
    public final Object e(int i10) {
        return new double[i10];
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void f(Double[] dArr, int i10) {
        D0.S(this, dArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.Y(this, consumer);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        f((Double[]) objArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.b0(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return new C0587n1(this);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return new C0587n1(this);
    }
}
