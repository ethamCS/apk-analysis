package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
abstract class H3 {

    /* renamed from: a */
    protected final Spliterator f13462a;

    /* renamed from: b */
    protected final boolean f13463b;

    /* renamed from: c */
    private final long f13464c;

    /* renamed from: d */
    private final AtomicLong f13465d;

    public H3(Spliterator spliterator, long j10, long j11) {
        this.f13462a = spliterator;
        long j12 = 0;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        this.f13463b = i10 < 0;
        this.f13464c = i10 >= 0 ? j11 : j12;
        this.f13465d = new AtomicLong(i10 >= 0 ? j10 + j11 : j10);
    }

    public H3(Spliterator spliterator, H3 h32) {
        this.f13462a = spliterator;
        this.f13463b = h32.f13463b;
        this.f13465d = h32.f13465d;
        this.f13464c = h32.f13464c;
    }

    public final int characteristics() {
        return this.f13462a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f13462a.estimateSize();
    }

    public final long m(long j10) {
        long j11;
        long min;
        do {
            j11 = this.f13465d.get();
            if (j11 != 0) {
                min = Math.min(j11, j10);
                if (min <= 0) {
                    break;
                }
            } else if (!this.f13463b) {
                return 0L;
            } else {
                return j10;
            }
        } while (!this.f13465d.compareAndSet(j11, j11 - min));
        if (this.f13463b) {
            return Math.max(j10 - min, 0L);
        }
        long j12 = this.f13464c;
        return j11 > j12 ? Math.max(min - (j11 - j12), 0L) : min;
    }

    protected abstract Spliterator o(Spliterator spliterator);

    public final int p() {
        if (this.f13465d.get() > 0) {
            return 2;
        }
        return this.f13463b ? 3 : 1;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f13465d.get() == 0 || (trySplit = this.f13462a.trySplit()) == null) {
            return null;
        }
        return o(trySplit);
    }
}
