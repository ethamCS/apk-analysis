package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class S1 implements Y1, AbstractC0593o2 {

    /* renamed from: a */
    private int f13547a;

    /* renamed from: b */
    final /* synthetic */ int f13548b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.m f13549c;

    public S1(int i10, j$.util.function.m mVar) {
        this.f13548b = i10;
        this.f13549c = mVar;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        this.f13547a = this.f13549c.e(this.f13547a, i10);
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

    @Override // j$.util.function.I
    public final Object get() {
        return Integer.valueOf(this.f13547a);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        accept(((S1) y12).f13547a);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13547a = this.f13548b;
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
