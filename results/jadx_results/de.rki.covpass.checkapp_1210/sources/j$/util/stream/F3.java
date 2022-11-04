package j$.util.stream;

import j$.util.AbstractC0516o;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class F3 extends H3 implements j$.util.F {
    public F3(j$.util.F f10, long j10, long j11) {
        super(f10, j10, j11);
    }

    public F3(j$.util.F f10, F3 f32) {
        super(f10, f32);
    }

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public final void k(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC0569j3 abstractC0569j3 = null;
        while (true) {
            int p10 = p();
            if (p10 != 1) {
                if (p10 != 2) {
                    ((j$.util.F) this.f13462a).forEachRemaining(obj);
                    return;
                }
                if (abstractC0569j3 == null) {
                    abstractC0569j3 = r();
                } else {
                    abstractC0569j3.f13709b = 0;
                }
                long j10 = 0;
                while (((j$.util.F) this.f13462a).tryAdvance(abstractC0569j3)) {
                    j10++;
                    if (j10 >= 128) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                }
                abstractC0569j3.b(obj, m(j10));
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

    protected abstract void q(Object obj);

    protected abstract AbstractC0569j3 r();

    @Override // j$.util.F
    /* renamed from: tryAdvance */
    public final boolean j(Object obj) {
        Objects.requireNonNull(obj);
        while (p() != 1 && ((j$.util.F) this.f13462a).tryAdvance(this)) {
            if (m(1L) == 1) {
                q(obj);
                return true;
            }
        }
        return false;
    }
}
