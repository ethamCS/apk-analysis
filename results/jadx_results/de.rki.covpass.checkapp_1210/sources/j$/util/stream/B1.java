package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class B1 extends C0524a3 implements P0, H0 {
    @Override // j$.util.stream.H0
    /* renamed from: a */
    public final P0 mo22a() {
        return this;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.P0
    public final P0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.stream.C0524a3, j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // j$.util.stream.C0524a3, j$.util.function.Consumer
    public final void h(Object obj) {
        super.h(obj);
    }

    @Override // j$.util.stream.C0524a3, j$.util.stream.P0
    public final void m(Object[] objArr, int i10) {
        super.m(objArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public final Object[] q(j$.util.function.q qVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) qVar.o((int) count);
            m(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.e0(this, j10, j11, qVar);
    }

    @Override // j$.util.stream.C0524a3, java.lang.Iterable, j$.lang.Iterable
    /* renamed from: spliterator */
    public final Spliterator mo23spliterator() {
        return super.mo23spliterator();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        clear();
        z(j10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
