package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class K implements Spliterator {

    /* renamed from: a */
    private final Object[] f13249a;

    /* renamed from: b */
    private int f13250b;

    /* renamed from: c */
    private final int f13251c;

    /* renamed from: d */
    private final int f13252d;

    public K(Object[] objArr, int i10, int i11, int i12) {
        this.f13249a = objArr;
        this.f13250b = i10;
        this.f13251c = i11;
        this.f13252d = i12 | 64 | 16384;
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f13250b;
        if (i10 < 0 || i10 >= this.f13251c) {
            return false;
        }
        Object[] objArr = this.f13249a;
        this.f13250b = i10 + 1;
        consumer.h(objArr[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13252d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13251c - this.f13250b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        Objects.requireNonNull(consumer);
        Object[] objArr = this.f13249a;
        int length = objArr.length;
        int i11 = this.f13251c;
        if (length < i11 || (i10 = this.f13250b) < 0) {
            return;
        }
        this.f13250b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            consumer.h(objArr[i10]);
            i10++;
        } while (i10 < i11);
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f13250b;
        int i11 = (this.f13251c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        Object[] objArr = this.f13249a;
        this.f13250b = i11;
        return new K(objArr, i10, i11, this.f13252d);
    }
}
