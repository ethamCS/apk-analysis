package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class T implements D {

    /* renamed from: a */
    private final long[] f13267a;

    /* renamed from: b */
    private int f13268b;

    /* renamed from: c */
    private final int f13269c;

    /* renamed from: d */
    private final int f13270d;

    public T(long[] jArr, int i10, int i11, int i12) {
        this.f13267a = jArr;
        this.f13268b = i10;
        this.f13269c = i11;
        this.f13270d = i12 | 64 | 16384;
    }

    @Override // j$.util.D, j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13270d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13269c - this.f13268b;
    }

    @Override // j$.util.D, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }

    @Override // j$.util.D
    /* renamed from: g */
    public final void forEachRemaining(j$.util.function.x xVar) {
        int i10;
        Objects.requireNonNull(xVar);
        long[] jArr = this.f13267a;
        int length = jArr.length;
        int i11 = this.f13269c;
        if (length < i11 || (i10 = this.f13268b) < 0) {
            return;
        }
        this.f13268b = i11;
        if (i10 >= i11) {
            return;
        }
        do {
            xVar.d(jArr[i10]);
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

    @Override // j$.util.D
    /* renamed from: i */
    public final boolean tryAdvance(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        int i10 = this.f13268b;
        if (i10 < 0 || i10 >= this.f13269c) {
            return false;
        }
        long[] jArr = this.f13267a;
        this.f13268b = i10 + 1;
        xVar.d(jArr[i10]);
        return true;
    }

    @Override // j$.util.D, j$.util.F, j$.util.Spliterator
    public final D trySplit() {
        int i10 = this.f13268b;
        int i11 = (this.f13269c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        long[] jArr = this.f13267a;
        this.f13268b = i11;
        return new T(jArr, i10, i11, this.f13270d);
    }
}
