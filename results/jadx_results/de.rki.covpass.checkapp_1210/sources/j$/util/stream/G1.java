package j$.util.stream;

import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
final class G1 extends Z1 implements Y1, AbstractC0598p2 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.I f13453b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.F f13454c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f13455d;

    public G1(j$.util.function.I i10, j$.util.function.F f10, BinaryOperator binaryOperator) {
        this.f13453b = i10;
        this.f13454c = f10;
        this.f13455d = binaryOperator;
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
        this.f13454c.j(this.f13587a, j10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        this.f13587a = this.f13455d.apply(this.f13587a, ((G1) y12).f13587a);
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
        this.f13587a = this.f13453b.get();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
