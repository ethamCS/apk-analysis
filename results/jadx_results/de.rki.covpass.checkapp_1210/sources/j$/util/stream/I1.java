package j$.util.stream;

import j$.util.function.AbstractC0501c;
/* loaded from: classes2.dex */
final class I1 implements Y1, AbstractC0588n2 {

    /* renamed from: a */
    private double f13467a;

    /* renamed from: b */
    final /* synthetic */ double f13468b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0501c f13469c;

    public I1(double d10, AbstractC0501c abstractC0501c) {
        this.f13468b = d10;
        this.f13469c = abstractC0501c;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        this.f13467a = this.f13469c.g(this.f13467a, d10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.function.I
    public final Object get() {
        return Double.valueOf(this.f13467a);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        c(((I1) y12).f13467a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13467a = this.f13468b;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        D0.J(this, d10);
    }
}
