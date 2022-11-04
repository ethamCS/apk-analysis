package j$.util.concurrent;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class A implements j$.util.B {

    /* renamed from: a */
    long f13287a;

    /* renamed from: b */
    final long f13288b;

    /* renamed from: c */
    final int f13289c;

    /* renamed from: d */
    final int f13290d;

    public A(long j10, long j11, int i10, int i11) {
        this.f13287a = j10;
        this.f13288b = j11;
        this.f13289c = i10;
        this.f13290d = i11;
    }

    /* renamed from: a */
    public final A trySplit() {
        long j10 = this.f13287a;
        long j11 = (this.f13288b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f13287a = j11;
        return new A(j10, j11, this.f13289c, this.f13290d);
    }

    @Override // j$.util.B, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.B
    /* renamed from: e */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        long j10 = this.f13287a;
        if (j10 < this.f13288b) {
            intConsumer.accept(ThreadLocalRandom.current().d(this.f13289c, this.f13290d));
            this.f13287a = j10 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13288b - this.f13287a;
    }

    @Override // j$.util.B
    /* renamed from: f */
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        long j10 = this.f13287a;
        long j11 = this.f13288b;
        if (j10 < j11) {
            this.f13287a = j11;
            int i10 = this.f13289c;
            int i11 = this.f13290d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(i10, i11));
                j10++;
            } while (j10 < j11);
        }
    }

    @Override // j$.util.B, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
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
