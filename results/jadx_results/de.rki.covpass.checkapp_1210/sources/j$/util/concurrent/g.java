package j$.util.concurrent;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class g extends q implements Spliterator {

    /* renamed from: i */
    final ConcurrentHashMap f13305i;

    /* renamed from: j */
    long f13306j;

    public g(m[] mVarArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, i12);
        this.f13305i = concurrentHashMap;
        this.f13306j = j10;
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m a10 = a();
        if (a10 == null) {
            return false;
        }
        consumer.h(new l(a10.f13315b, a10.f13316c, this.f13305i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13306j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (true) {
            m a10 = a();
            if (a10 != null) {
                consumer.h(new l(a10.f13315b, a10.f13316c, this.f13305i));
            } else {
                return;
            }
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f13327f;
        int i11 = this.f13328g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        m[] mVarArr = this.f13322a;
        int i13 = this.f13329h;
        this.f13328g = i12;
        long j10 = this.f13306j >>> 1;
        this.f13306j = j10;
        return new g(mVarArr, i13, i12, i11, j10, this.f13305i);
    }
}
