package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class Y0 extends Z0 implements N0 {
    public Y0(N0 n02, N0 n03) {
        super(n02, n03);
    }

    @Override // j$.util.stream.O0
    public final Object e(int i10) {
        return new long[i10];
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.a0(this, consumer);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        o((Long[]) objArr, i10);
    }

    @Override // j$.util.stream.N0
    public final /* synthetic */ void o(Long[] lArr, int i10) {
        D0.W(this, lArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.d0(this, j10, j11);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return new C0597p1(this);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return new C0597p1(this);
    }
}
