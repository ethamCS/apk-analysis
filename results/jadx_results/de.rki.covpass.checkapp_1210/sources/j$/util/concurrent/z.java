package j$.util.concurrent;

import j$.util.AbstractC0516o;
import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class z implements j$.util.z {

    /* renamed from: a */
    long f13343a;

    /* renamed from: b */
    final long f13344b;

    /* renamed from: c */
    final double f13345c;

    /* renamed from: d */
    final double f13346d;

    public z(long j10, long j11, double d10, double d11) {
        this.f13343a = j10;
        this.f13344b = j11;
        this.f13345c = d10;
        this.f13346d = d11;
    }

    /* renamed from: a */
    public final z trySplit() {
        long j10 = this.f13343a;
        long j11 = (this.f13344b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f13343a = j11;
        return new z(j10, j11, this.f13345c, this.f13346d);
    }

    @Override // j$.util.z, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13344b - this.f13343a;
    }

    @Override // j$.util.z, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
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

    @Override // j$.util.z
    /* renamed from: j */
    public final boolean tryAdvance(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        long j10 = this.f13343a;
        if (j10 < this.f13344b) {
            abstractC0503e.c(ThreadLocalRandom.current().c(this.f13345c, this.f13346d));
            this.f13343a = j10 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.z
    /* renamed from: k */
    public final void forEachRemaining(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        long j10 = this.f13343a;
        long j11 = this.f13344b;
        if (j10 < j11) {
            this.f13343a = j11;
            double d10 = this.f13345c;
            double d11 = this.f13346d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                abstractC0503e.c(current.c(d10, d11));
                j10++;
            } while (j10 < j11);
        }
    }
}
