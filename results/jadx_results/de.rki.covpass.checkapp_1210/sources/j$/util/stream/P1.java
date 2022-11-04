package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
final class P1 extends Z1 implements Y1 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.I f13522b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f13523c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f13524d;

    public P1(j$.util.function.I i10, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.f13522b = i10;
        this.f13523c = biConsumer;
        this.f13524d = binaryOperator;
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
        this.f13523c.w(this.f13587a, obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        this.f13587a = this.f13524d.apply(this.f13587a, ((P1) y12).f13587a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13587a = this.f13522b.get();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
