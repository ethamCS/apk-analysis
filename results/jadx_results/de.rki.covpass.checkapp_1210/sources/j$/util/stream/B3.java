package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes2.dex */
abstract class B3 {

    /* renamed from: a */
    final long f13421a;

    /* renamed from: b */
    final long f13422b;

    /* renamed from: c */
    Spliterator f13423c;

    /* renamed from: d */
    long f13424d;

    /* renamed from: e */
    long f13425e;

    public B3(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.f13423c = spliterator;
        this.f13421a = j10;
        this.f13422b = j11;
        this.f13424d = j12;
        this.f13425e = j13;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13);

    public final int characteristics() {
        return this.f13423c.characteristics();
    }

    public final long estimateSize() {
        long j10 = this.f13421a;
        long j11 = this.f13425e;
        if (j10 < j11) {
            return j11 - Math.max(j10, this.f13424d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j10 = this.f13421a;
        long j11 = this.f13425e;
        if (j10 < j11 && this.f13424d < j11) {
            while (true) {
                Spliterator trySplit = this.f13423c.trySplit();
                if (trySplit == null) {
                    return null;
                }
                long estimateSize = trySplit.estimateSize() + this.f13424d;
                long min = Math.min(estimateSize, this.f13422b);
                long j12 = this.f13421a;
                if (j12 >= min) {
                    this.f13424d = min;
                } else {
                    long j13 = this.f13422b;
                    if (min < j13) {
                        long j14 = this.f13424d;
                        if (j14 < j12 || estimateSize > j13) {
                            this.f13424d = min;
                            return a(trySplit, j12, j13, j14, min);
                        }
                        this.f13424d = min;
                        return trySplit;
                    }
                    this.f13423c = trySplit;
                    this.f13425e = min;
                }
            }
        } else {
            return null;
        }
    }
}
