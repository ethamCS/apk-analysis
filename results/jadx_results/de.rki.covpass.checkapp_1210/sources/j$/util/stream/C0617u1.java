package j$.util.stream;

import java.util.Arrays;
/* renamed from: j$.util.stream.u1 */
/* loaded from: classes2.dex */
public final class C0617u1 extends C0613t1 implements G0 {
    public C0617u1(long j10) {
        super(j10);
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    /* renamed from: a */
    public final N0 mo22a() {
        if (this.f13794b >= this.f13793a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13794b), Integer.valueOf(this.f13793a.length)));
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
        int i10 = this.f13794b;
        long[] jArr = this.f13793a;
        if (i10 < jArr.length) {
            this.f13794b = i10 + 1;
            jArr[i10] = j10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f13793a.length)));
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void t() {
        if (this.f13794b >= this.f13793a.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13794b), Integer.valueOf(this.f13793a.length)));
    }

    @Override // j$.util.stream.C0613t1
    public final String toString() {
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f13793a.length - this.f13794b), Arrays.toString(this.f13793a));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 == this.f13793a.length) {
            this.f13794b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f13793a.length)));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
