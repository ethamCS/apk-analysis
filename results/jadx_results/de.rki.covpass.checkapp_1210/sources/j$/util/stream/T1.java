package j$.util.stream;

import j$.util.C0513l;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class T1 implements Y1, AbstractC0593o2 {

    /* renamed from: a */
    private boolean f13555a;

    /* renamed from: b */
    private int f13556b;

    /* renamed from: c */
    final /* synthetic */ j$.util.function.m f13557c;

    public T1(j$.util.function.m mVar) {
        this.f13557c = mVar;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        if (this.f13555a) {
            this.f13555a = false;
        } else {
            i10 = this.f13557c.e(this.f13556b, i10);
        }
        this.f13556b = i10;
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
        return this.f13555a ? C0513l.a() : C0513l.d(this.f13556b);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        T1 t12 = (T1) y12;
        if (!t12.f13555a) {
            accept(t12.f13556b);
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13555a = true;
        this.f13556b = 0;
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
