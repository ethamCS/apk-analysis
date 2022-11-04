package j$.util.stream;

import j$.util.function.BiConsumer;
/* loaded from: classes2.dex */
final class Q1 extends Z1 implements Y1 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.I f13529b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f13530c;

    /* renamed from: d */
    final /* synthetic */ BiConsumer f13531d;

    public Q1(j$.util.function.I i10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f13529b = i10;
        this.f13530c = biConsumer;
        this.f13531d = biConsumer2;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
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

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        this.f13530c.w(this.f13587a, obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        this.f13531d.w(this.f13587a, ((Q1) y12).f13587a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13587a = this.f13529b.get();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
