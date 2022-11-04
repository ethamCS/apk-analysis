package j$.util.stream;

import java.util.Arrays;
/* renamed from: j$.util.stream.j1 */
/* loaded from: classes2.dex */
public final class C0567j1 extends S0 implements H0 {
    public C0567j1(long j10, j$.util.function.q qVar) {
        super(j10, qVar);
    }

    @Override // j$.util.stream.H0
    /* renamed from: a */
    public final P0 mo22a() {
        if (this.f13546b >= this.f13545a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13546b), Integer.valueOf(this.f13545a.length)));
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
        int i10 = this.f13546b;
        Object[] objArr = this.f13545a;
        if (i10 < objArr.length) {
            this.f13546b = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f13545a.length)));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void t() {
        if (this.f13546b >= this.f13545a.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13546b), Integer.valueOf(this.f13545a.length)));
    }

    @Override // j$.util.stream.S0
    public final String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(this.f13545a.length - this.f13546b), Arrays.toString(this.f13545a));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 == this.f13545a.length) {
            this.f13546b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f13545a.length)));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
