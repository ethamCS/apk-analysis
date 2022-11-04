package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class G3 extends H3 implements Spliterator, Consumer {

    /* renamed from: e */
    Object f13457e;

    public G3(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11);
    }

    G3(Spliterator spliterator, G3 g32) {
        super(spliterator, g32);
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (p() != 1 && this.f13462a.b(this)) {
            if (m(1L) == 1) {
                consumer.h(this.f13457e);
                this.f13457e = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0574k3 c0574k3 = null;
        while (true) {
            int p10 = p();
            if (p10 != 1) {
                if (p10 == 2) {
                    if (c0574k3 == null) {
                        c0574k3 = new C0574k3();
                    } else {
                        c0574k3.f13734a = 0;
                    }
                    long j10 = 0;
                    while (this.f13462a.b(c0574k3)) {
                        j10++;
                        if (j10 >= 128) {
                            break;
                        }
                    }
                    if (j10 == 0) {
                        return;
                    }
                    long m10 = m(j10);
                    for (int i10 = 0; i10 < m10; i10++) {
                        consumer.h(c0574k3.f13717b[i10]);
                    }
                } else {
                    this.f13462a.forEachRemaining(consumer);
                    return;
                }
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

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        this.f13457e = obj;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0516o.l(this, i10);
    }

    @Override // j$.util.stream.H3
    protected final Spliterator o(Spliterator spliterator) {
        return new G3(spliterator, this);
    }
}
