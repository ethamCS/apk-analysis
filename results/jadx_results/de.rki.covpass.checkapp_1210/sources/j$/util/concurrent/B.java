package j$.util.concurrent;

import j$.util.AbstractC0516o;
import j$.util.D;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class B implements D {

    /* renamed from: a */
    long f13291a;

    /* renamed from: b */
    final long f13292b;

    /* renamed from: c */
    final long f13293c;

    /* renamed from: d */
    final long f13294d;

    public B(long j10, long j11, long j12, long j13) {
        this.f13291a = j10;
        this.f13292b = j11;
        this.f13293c = j12;
        this.f13294d = j13;
    }

    /* renamed from: a */
    public final B trySplit() {
        long j10 = this.f13291a;
        long j11 = (this.f13292b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f13291a = j11;
        return new B(j10, j11, this.f13293c, this.f13294d);
    }

    @Override // j$.util.D, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13292b - this.f13291a;
    }

    @Override // j$.util.D, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }

    @Override // j$.util.D
    /* renamed from: g */
    public final void forEachRemaining(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        long j10 = this.f13291a;
        long j11 = this.f13292b;
        if (j10 < j11) {
            this.f13291a = j11;
            long j12 = this.f13293c;
            long j13 = this.f13294d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                xVar.d(current.e(j12, j13));
                j10++;
            } while (j10 < j11);
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

    @Override // j$.util.D
    /* renamed from: i */
    public final boolean tryAdvance(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        long j10 = this.f13291a;
        if (j10 < this.f13292b) {
            xVar.d(ThreadLocalRandom.current().e(this.f13293c, this.f13294d));
            this.f13291a = j10 + 1;
            return true;
        }
        return false;
    }
}
