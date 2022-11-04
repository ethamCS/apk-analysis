package j$.util.stream;

import j$.util.C0514m;
/* loaded from: classes2.dex */
final class X1 implements Y1, AbstractC0598p2 {

    /* renamed from: a */
    private boolean f13576a;

    /* renamed from: b */
    private long f13577b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.v f13578c;

    public X1(j$.util.function.v vVar) {
        this.f13578c = vVar;
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
    public final void d(long j10) {
        if (this.f13576a) {
            this.f13576a = false;
        } else {
            j10 = this.f13578c.f(this.f13577b, j10);
        }
        this.f13577b = j10;
    }

    @Override // j$.util.function.I
    public final Object get() {
        return this.f13576a ? C0514m.a() : C0514m.d(this.f13577b);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        X1 x12 = (X1) y12;
        if (!x12.f13576a) {
            d(x12.f13577b);
        }
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13576a = true;
        this.f13577b = 0L;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
