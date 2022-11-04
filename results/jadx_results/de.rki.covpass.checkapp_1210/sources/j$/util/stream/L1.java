package j$.util.stream;

import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
final class L1 extends Z1 implements Y1, AbstractC0588n2 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.I f13489b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.D f13490c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f13491d;

    public L1(j$.util.function.I i10, j$.util.function.D d10, BinaryOperator binaryOperator) {
        this.f13489b = i10;
        this.f13490c = d10;
        this.f13491d = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        this.f13490c.b(this.f13587a, d10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        this.f13587a = this.f13491d.apply(this.f13587a, ((L1) y12).f13587a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13587a = this.f13489b.get();
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
