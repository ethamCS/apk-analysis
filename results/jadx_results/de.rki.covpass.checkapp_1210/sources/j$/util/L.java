package j$.util;

import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class L implements z {

    /* renamed from: a */
    private final double[] f13253a;

    /* renamed from: b */
    private int f13254b;

    /* renamed from: c */
    private final int f13255c;

    /* renamed from: d */
    private final int f13256d;

    public L(double[] dArr, int i10, int i11, int i12) {
        this.f13253a = dArr;
        this.f13254b = i10;
        this.f13255c = i11;
        this.f13256d = i12 | 64 | 16384;
    }

    @Override // j$.util.z, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13256d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13255c - this.f13254b;
    }

    @Override // j$.util.z, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
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

    @Override // j$.util.z
    /* renamed from: j */
    public final boolean tryAdvance(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        int i10 = this.f13254b;
        if (i10 < 0 || i10 >= this.f13255c) {
            return false;
        }
        double[] dArr = this.f13253a;
        this.f13254b = i10 + 1;
        abstractC0503e.c(dArr[i10]);
        return true;
    }

    @Override // j$.util.z
    /* renamed from: k */
    public final void forEachRemaining(AbstractC0503e abstractC0503e) {
        int i10;
        Objects.requireNonNull(abstractC0503e);
        double[] dArr = this.f13253a;
        int length = dArr.length;
        int i11 = this.f13255c;
        if (length < i11 || (i10 = this.f13254b) < 0) {
            return;
        }
        this.f13254b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            abstractC0503e.c(dArr[i10]);
            i10++;
        } while (i10 < i11);
    }

    @Override // j$.util.z, j$.util.F, j$.util.Spliterator
    public final z trySplit() {
        int i10 = this.f13254b;
        int i11 = (this.f13255c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        double[] dArr = this.f13253a;
        this.f13254b = i11;
        return new L(dArr, i10, i11, this.f13256d);
    }
}
