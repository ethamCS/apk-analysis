package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class A3 extends B3 implements Spliterator {
    public A3(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11, 0L, Math.min(spliterator.estimateSize(), j11));
    }

    private A3(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        super(spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.B3
    protected final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new A3(spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
        if (this.f13421a >= this.f13425e) {
            return false;
        }
        while (true) {
            long j11 = this.f13421a;
            j10 = this.f13424d;
            if (j11 <= j10) {
                break;
            }
            this.f13423c.b(C0580m.f13744j);
            this.f13424d++;
        }
        if (j10 >= this.f13425e) {
            return false;
        }
        this.f13424d = j10 + 1;
        return this.f13423c.b(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f13421a;
        long j11 = this.f13425e;
        if (j10 >= j11) {
            return;
        }
        long j12 = this.f13424d;
        if (j12 >= j11) {
            return;
        }
        if (j12 >= j10 && this.f13423c.estimateSize() + j12 <= this.f13422b) {
            this.f13423c.forEachRemaining(consumer);
            this.f13424d = this.f13425e;
            return;
        }
        while (this.f13421a > this.f13424d) {
            this.f13423c.b(C0575l.f13731n);
            this.f13424d++;
        }
        while (this.f13424d < this.f13425e) {
            this.f13423c.b(consumer);
            this.f13424d++;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0516o.h(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0516o.l(this, i10);
    }
}
