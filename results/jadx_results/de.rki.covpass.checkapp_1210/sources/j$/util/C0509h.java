package j$.util;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.h */
/* loaded from: classes2.dex */
public final class C0509h implements j$.util.function.x, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        d(i10);
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    public final void b(C0509h c0509h) {
        this.count += c0509h.count;
        this.sum += c0509h.sum;
        this.min = Math.min(this.min, c0509h.min);
        this.max = Math.max(this.max, c0509h.max);
    }

    @Override // j$.util.function.x
    public final void d(long j10) {
        this.count++;
        this.sum += j10;
        this.min = Math.min(this.min, j10);
        this.max = Math.max(this.max, j10);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0509h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
