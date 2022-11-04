package j$.util.stream;

import j$.util.C0510i;
import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
final class N1 implements Y1 {

    /* renamed from: a */
    private boolean f13510a;

    /* renamed from: b */
    private Object f13511b;

    /* renamed from: c */
    final /* synthetic */ BinaryOperator f13512c;

    public N1(BinaryOperator binaryOperator) {
        this.f13512c = binaryOperator;
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

    @Override // j$.util.function.I
    public final Object get() {
        return this.f13510a ? C0510i.a() : C0510i.d(this.f13511b);
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        if (this.f13510a) {
            this.f13510a = false;
        } else {
            obj = this.f13512c.apply(this.f13511b, obj);
        }
        this.f13511b = obj;
    }

    @Override // j$.util.stream.Y1
    public final void l(Y1 y12) {
        N1 n12 = (N1) y12;
        if (!n12.f13510a) {
            h(n12.f13511b);
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13510a = true;
        this.f13511b = null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
