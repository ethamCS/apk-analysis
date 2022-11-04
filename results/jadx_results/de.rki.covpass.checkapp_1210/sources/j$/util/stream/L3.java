package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class L3 implements j$.util.B {

    /* renamed from: a */
    private int f13494a;

    /* renamed from: b */
    private final int f13495b;

    /* renamed from: c */
    private int f13496c = 0;

    public L3(int i10, int i11) {
        this.f13494a = i10;
        this.f13495b = i11;
    }

    private L3(int i10, int i11, int i12) {
        this.f13494a = i10;
        this.f13495b = i11;
    }

    @Override // j$.util.B, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.B
    /* renamed from: e */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i10 = this.f13494a;
        if (i10 < this.f13495b) {
            this.f13494a = i10 + 1;
        } else if (this.f13496c <= 0) {
            return false;
        } else {
            this.f13496c = 0;
        }
        intConsumer.accept(i10);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (this.f13495b - this.f13494a) + this.f13496c;
    }

    @Override // j$.util.B
    /* renamed from: f */
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i10 = this.f13494a;
        int i11 = this.f13495b;
        int i12 = this.f13496c;
        this.f13494a = i11;
        this.f13496c = 0;
        while (i10 < i11) {
            intConsumer.accept(i10);
            i10++;
        }
        if (i12 > 0) {
            intConsumer.accept(i10);
        }
    }

    @Override // j$.util.B, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0516o.h(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0516o.l(this, i10);
    }

    @Override // j$.util.B, j$.util.F, j$.util.Spliterator
    public final j$.util.B trySplit() {
        long estimateSize = estimateSize();
        if (estimateSize <= 1) {
            return null;
        }
        int i10 = this.f13494a;
        int i11 = ((int) (estimateSize / (estimateSize < 16777216 ? 2 : 8))) + i10;
        this.f13494a = i11;
        return new L3(i10, i11, 0);
    }
}
