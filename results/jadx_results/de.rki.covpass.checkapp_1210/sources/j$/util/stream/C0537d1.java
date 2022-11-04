package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.AbstractC0503e;
/* renamed from: j$.util.stream.d1 */
/* loaded from: classes2.dex */
public final class C0537d1 extends T2 implements J0, E0 {
    @Override // j$.util.stream.T2
    public final j$.util.z G() {
        return super.mo23spliterator();
    }

    @Override // j$.util.stream.E0, j$.util.stream.H0
    /* renamed from: a */
    public final J0 mo22a() {
        return this;
    }

    @Override // j$.util.stream.E0, j$.util.stream.H0
    /* renamed from: a */
    public final P0 mo22a() {
        return this;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T2, j$.util.function.AbstractC0503e
    public final void c(double d10) {
        super.c(d10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void f(Double[] dArr, int i10) {
        D0.S(this, dArr, i10);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final void g(Object obj, int i10) {
        super.g((double[]) obj, i10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final Object i() {
        return (double[]) super.i();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final void j(Object obj) {
        super.j((AbstractC0503e) obj);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        f((Double[]) objArr, i10);
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
        return D0.b0(this, j10, j11);
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
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

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        D0.J(this, d10);
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    /* renamed from: spliterator */
    public final Spliterator mo23spliterator() {
        return super.mo23spliterator();
    }
}
