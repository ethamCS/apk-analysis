package j$.util.stream;

import j$.util.AbstractC0516o;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class z3 extends B3 implements j$.util.F {
    public z3(j$.util.F f10, long j10, long j11) {
        super(f10, j10, j11, 0L, Math.min(f10.estimateSize(), j11));
    }

    protected abstract Object c();

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public final void k(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f13421a;
        long j11 = this.f13425e;
        if (j10 >= j11) {
            return;
        }
        long j12 = this.f13424d;
        if (j12 >= j11) {
            return;
        }
        if (j12 >= j10 && ((j$.util.F) this.f13423c).estimateSize() + j12 <= this.f13422b) {
            ((j$.util.F) this.f13423c).forEachRemaining(obj);
            this.f13424d = this.f13425e;
            return;
        }
        while (this.f13421a > this.f13424d) {
            ((j$.util.F) this.f13423c).tryAdvance(c());
            this.f13424d++;
        }
        while (this.f13424d < this.f13425e) {
            ((j$.util.F) this.f13423c).tryAdvance(obj);
            this.f13424d++;
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

    @Override // j$.util.F
    /* renamed from: tryAdvance */
    public final boolean j(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
        if (this.f13421a >= this.f13425e) {
            return false;
        }
        while (true) {
            long j11 = this.f13421a;
            j10 = this.f13424d;
            if (j11 <= j10) {
                break;
            }
            ((j$.util.F) this.f13423c).tryAdvance(c());
            this.f13424d++;
        }
        if (j10 >= this.f13425e) {
            return false;
        }
        this.f13424d = j10 + 1;
        return ((j$.util.F) this.f13423c).tryAdvance(obj);
    }

    public z3(j$.util.F f10, long j10, long j11, long j12, long j13, D0 d02) {
        super(f10, j10, j11, j12, j13);
    }
}
