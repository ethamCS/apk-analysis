package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
final class M1 extends Z1 implements Y1 {

    /* renamed from: b */
    final /* synthetic */ Object f13501b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f13502c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f13503d;

    public M1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f13501b = obj;
        this.f13502c = biFunction;
        this.f13503d = binaryOperator;
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
        this.f13587a = this.f13502c.apply(this.f13587a, obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        this.f13587a = this.f13503d.apply(this.f13587a, ((M1) y12).f13587a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13587a = this.f13501b;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
