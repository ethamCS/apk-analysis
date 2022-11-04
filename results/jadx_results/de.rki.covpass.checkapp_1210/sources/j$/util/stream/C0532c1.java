package j$.util.stream;

import java.util.Arrays;
/* renamed from: j$.util.stream.c1 */
/* loaded from: classes2.dex */
public final class C0532c1 extends C0527b1 implements E0 {
    public C0532c1(long j10) {
        super(j10);
    }

    @Override // j$.util.stream.E0, j$.util.stream.H0
    /* renamed from: a */
    public final J0 mo22a() {
        if (this.f13629b >= this.f13628a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13629b), Integer.valueOf(this.f13628a.length)));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        int i10 = this.f13629b;
        double[] dArr = this.f13628a;
        if (i10 < dArr.length) {
            this.f13629b = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f13628a.length)));
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

    @Override // j$.util.stream.AbstractC0603q2
    public final void t() {
        if (this.f13629b >= this.f13628a.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13629b), Integer.valueOf(this.f13628a.length)));
    }

    @Override // j$.util.stream.C0527b1
    public final String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f13628a.length - this.f13629b), Arrays.toString(this.f13628a));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 == this.f13628a.length) {
            this.f13629b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f13628a.length)));
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
