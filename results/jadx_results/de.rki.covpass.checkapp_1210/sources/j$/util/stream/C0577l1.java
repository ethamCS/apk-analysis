package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Arrays;
import java.util.Objects;
/* renamed from: j$.util.stream.l1 */
/* loaded from: classes2.dex */
public final class C0577l1 extends C0572k1 implements F0 {
    public C0577l1(long j10) {
        super(j10);
    }

    @Override // j$.util.stream.F0, j$.util.stream.H0
    /* renamed from: a */
    public final L0 mo22a() {
        if (this.f13715b >= this.f13714a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13715b), Integer.valueOf(this.f13714a.length)));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        int i11 = this.f13715b;
        int[] iArr = this.f13714a;
        if (i11 < iArr.length) {
            this.f13715b = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f13714a.length)));
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

    @Override // j$.util.stream.AbstractC0603q2
    public final void t() {
        if (this.f13715b >= this.f13714a.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13715b), Integer.valueOf(this.f13714a.length)));
    }

    @Override // j$.util.stream.C0572k1
    public final String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f13714a.length - this.f13715b), Arrays.toString(this.f13714a));
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 == this.f13714a.length) {
            this.f13715b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f13714a.length)));
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
