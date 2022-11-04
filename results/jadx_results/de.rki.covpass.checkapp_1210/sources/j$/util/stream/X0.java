package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class X0 extends Z0 implements L0 {
    public X0(L0 l02, L0 l03) {
        super(l02, l03);
    }

    @Override // j$.util.stream.O0
    public final Object e(int i10) {
        return new int[i10];
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.Z(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void k(Integer[] numArr, int i10) {
        D0.U(this, numArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        k((Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.c0(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return new C0592o1(this);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return new C0592o1(this);
    }
}
