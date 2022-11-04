package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.v1 */
/* loaded from: classes2.dex */
public final class C0621v1 extends X2 implements N0, G0 {
    @Override // j$.util.stream.X2
    public final j$.util.D G() {
        return super.mo23spliterator();
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: a */
    public final N0 mo22a() {
        return this;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
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

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    @Override // j$.util.stream.X2, j$.util.function.x
    public final void d(long j10) {
        super.d(j10);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final void g(Object obj, int i10) {
        super.g((long[]) obj, i10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final Object i() {
        return (long[]) super.i();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.O0
    public final void j(Object obj) {
        super.j((j$.util.function.x) obj);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        o((Long[]) objArr, i10);
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }

    @Override // j$.util.stream.N0
    public final /* synthetic */ void o(Long[] lArr, int i10) {
        D0.W(this, lArr, i10);
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
        return D0.d0(this, j10, j11);
    }

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
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

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    /* renamed from: spliterator */
    public final Spliterator mo23spliterator() {
        return super.mo23spliterator();
    }
}
