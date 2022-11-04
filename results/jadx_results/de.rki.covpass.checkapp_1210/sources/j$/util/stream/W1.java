package j$.util.stream;
/* loaded from: classes2.dex */
final class W1 implements Y1, AbstractC0598p2 {

    /* renamed from: a */
    private long f13571a;

    /* renamed from: b */
    final /* synthetic */ long f13572b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.v f13573c;

    public W1(long j10, j$.util.function.v vVar) {
        this.f13572b = j10;
        this.f13573c = vVar;
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
        this.f13571a = this.f13573c.f(this.f13571a, j10);
    }

    @Override // j$.util.function.I
    public final Object get() {
        return Long.valueOf(this.f13571a);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        d(((W1) y12).f13571a);
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
        this.f13571a = this.f13572b;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
