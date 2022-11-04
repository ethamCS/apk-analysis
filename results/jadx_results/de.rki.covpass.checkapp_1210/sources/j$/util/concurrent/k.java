package j$.util.concurrent;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class k extends q implements Spliterator {

    /* renamed from: i */
    public final /* synthetic */ int f13309i;

    /* renamed from: j */
    long f13310j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m[] mVarArr, int i10, int i11, int i12, long j10, int i13) {
        super(mVarArr, i10, i11, i12);
        this.f13309i = i13;
        this.f13310j = j10;
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        switch (this.f13309i) {
            case 0:
                Objects.requireNonNull(consumer);
                m a10 = a();
                if (a10 == null) {
                    return false;
                }
                consumer.h(a10.f13315b);
                return true;
            default:
                Objects.requireNonNull(consumer);
                m a11 = a();
                if (a11 == null) {
                    return false;
                }
                consumer.h(a11.f13316c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f13309i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f13309i) {
            case 0:
                return this.f13310j;
            default:
                return this.f13310j;
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f13309i) {
            case 0:
                Objects.requireNonNull(consumer);
                while (true) {
                    m a10 = a();
                    if (a10 == null) {
                        return;
                    }
                    consumer.h(a10.f13315b);
                }
            default:
                Objects.requireNonNull(consumer);
                while (true) {
                    m a11 = a();
                    if (a11 == null) {
                        return;
                    }
                    consumer.h(a11.f13316c);
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f13309i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f13309i) {
            case 0:
                return AbstractC0516o.h(this);
            default:
                return AbstractC0516o.h(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f13309i) {
            case 0:
                return AbstractC0516o.l(this, i10);
            default:
                return AbstractC0516o.l(this, i10);
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f13309i) {
            case 0:
                int i10 = this.f13327f;
                int i11 = this.f13328g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                m[] mVarArr = this.f13322a;
                int i13 = this.f13329h;
                this.f13328g = i12;
                long j10 = this.f13310j >>> 1;
                this.f13310j = j10;
                return new k(mVarArr, i13, i12, i11, j10, 0);
            default:
                int i14 = this.f13327f;
                int i15 = this.f13328g;
                int i16 = (i14 + i15) >>> 1;
                if (i16 <= i14) {
                    return null;
                }
                m[] mVarArr2 = this.f13322a;
                int i17 = this.f13329h;
                this.f13328g = i16;
                long j11 = this.f13310j >>> 1;
                this.f13310j = j11;
                return new k(mVarArr2, i17, i16, i15, j11, 1);
        }
    }
}
