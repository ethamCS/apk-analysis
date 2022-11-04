package j$.util.stream;

import j$.util.function.BinaryOperator;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class U1 extends Z1 implements Y1, AbstractC0593o2 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.I f13560b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.E f13561c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f13562d;

    public U1(j$.util.function.I i10, j$.util.function.E e10, BinaryOperator binaryOperator) {
        this.f13560b = i10;
        this.f13561c = e10;
        this.f13562d = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        this.f13561c.i(this.f13587a, i10);
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
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
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        this.f13587a = this.f13562d.apply(this.f13587a, ((U1) y12).f13587a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13587a = this.f13560b.get();
    }

    @Override // j$.util.stream.AbstractC0593o2
    public final /* synthetic */ void v(Integer num) {
        D0.L(this, num);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
