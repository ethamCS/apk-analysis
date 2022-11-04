package j$.util.stream;

import j$.util.C0512k;
import j$.util.function.AbstractC0501c;
/* loaded from: classes2.dex */
final class K1 implements Y1, AbstractC0588n2 {

    /* renamed from: a */
    private boolean f13481a;

    /* renamed from: b */
    private double f13482b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0501c f13483c;

    public K1(AbstractC0501c abstractC0501c) {
        this.f13483c = abstractC0501c;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        if (this.f13481a) {
            this.f13481a = false;
        } else {
            d10 = this.f13483c.g(this.f13482b, d10);
        }
        this.f13482b = d10;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.function.I
    public final Object get() {
        return this.f13481a ? C0512k.a() : C0512k.d(this.f13482b);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        K1 k12 = (K1) y12;
        if (!k12.f13481a) {
            c(k12.f13482b);
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13481a = true;
        this.f13482b = 0.0d;
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
