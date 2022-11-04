package j$.util;

import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class Q implements B {

    /* renamed from: a */
    private final int[] f13257a;

    /* renamed from: b */
    private int f13258b;

    /* renamed from: c */
    private final int f13259c;

    /* renamed from: d */
    private final int f13260d;

    public Q(int[] iArr, int i10, int i11, int i12) {
        this.f13257a = iArr;
        this.f13258b = i10;
        this.f13259c = i11;
        this.f13260d = i12 | 64 | 16384;
    }

    @Override // j$.util.B, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13260d;
    }

    @Override // j$.util.B
    /* renamed from: e */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i10 = this.f13258b;
        if (i10 < 0 || i10 >= this.f13259c) {
            return false;
        }
        int[] iArr = this.f13257a;
        this.f13258b = i10 + 1;
        intConsumer.accept(iArr[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13259c - this.f13258b;
    }

    @Override // j$.util.B
    /* renamed from: f */
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i10;
        Objects.requireNonNull(intConsumer);
        int[] iArr = this.f13257a;
        int length = iArr.length;
        int i11 = this.f13259c;
        if (length < i11 || (i10 = this.f13258b) < 0) {
            return;
        }
        this.f13258b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            intConsumer.accept(iArr[i10]);
            i10++;
        } while (i10 < i11);
    }

    @Override // j$.util.B, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC0516o.l(this, 4)) {
            return null;
        }
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

    @Override // j$.util.B, j$.util.F, j$.util.Spliterator
    public final B trySplit() {
        int i10 = this.f13258b;
        int i11 = (this.f13259c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        int[] iArr = this.f13257a;
        this.f13258b = i11;
        return new Q(iArr, i10, i11, this.f13260d);
    }
}
