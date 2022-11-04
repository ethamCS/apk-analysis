package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer;
/* renamed from: j$.util.stream.m1 */
/* loaded from: classes2.dex */
public final class C0582m1 extends V2 implements L0, F0 {
    @Override // j$.util.stream.V2
    public final j$.util.B G() {
        return super.mo23spliterator();
    }

    @Override // j$.util.stream.F0, j$.util.stream.H0
    /* renamed from: a */
    public final L0 mo22a() {
        return this;
    }

    @Override // j$.util.stream.F0, j$.util.stream.H0
    /* renamed from: a */
    public final P0 mo22a() {
        return this;
    }

    @Override // j$.util.stream.V2, j$.util.function.IntConsumer
    public final void accept(int i10) {
        super.accept(i10);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public final O0 b(int i10) {
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

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final void g(Object obj, int i10) {
        super.g((int[]) obj, i10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final Object i() {
        return (int[]) super.i();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final void j(Object obj) {
        super.j((IntConsumer) obj);
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
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ Object[] q(j$.util.function.q qVar) {
        return D0.R(this, qVar);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.c0(this, j10, j11);
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    /* renamed from: spliterator */
    public final j$.util.F mo23spliterator() {
        return super.mo23spliterator();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        clear();
        C(j10);
    }

    @Override // j$.util.stream.AbstractC0593o2
    public final /* synthetic */ void v(Integer num) {
        D0.L(this, num);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    /* renamed from: spliterator */
    public final Spliterator mo23spliterator() {
        return super.mo23spliterator();
    }
}
