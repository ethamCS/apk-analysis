package j$.util;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.g */
/* loaded from: classes2.dex */
public final class C0508g implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        this.count++;
        this.sum += i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    public final void b(C0508g c0508g) {
        this.count += c0508g.count;
        this.sum += c0508g.sum;
        this.min = Math.min(this.min, c0508g.min);
        this.max = Math.max(this.max, c0508g.max);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0508g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
