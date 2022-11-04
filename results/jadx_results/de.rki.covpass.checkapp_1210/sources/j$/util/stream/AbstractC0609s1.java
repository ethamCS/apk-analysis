package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
/* renamed from: j$.util.stream.s1 */
/* loaded from: classes2.dex */
abstract class AbstractC0609s1 implements Spliterator {

    /* renamed from: a */
    P0 f13781a;

    /* renamed from: b */
    int f13782b;

    /* renamed from: c */
    Spliterator f13783c;

    /* renamed from: d */
    Spliterator f13784d;

    /* renamed from: e */
    ArrayDeque f13785e;

    public AbstractC0609s1(P0 p02) {
        this.f13781a = p02;
    }

    public final P0 a(Deque deque) {
        while (true) {
            P0 p02 = (P0) deque.pollFirst();
            if (p02 != null) {
                if (p02.p() != 0) {
                    for (int p10 = p02.p() - 1; p10 >= 0; p10--) {
                        deque.addFirst(p02.b(p10));
                    }
                } else if (p02.count() > 0) {
                    return p02;
                }
            } else {
                return null;
            }
        }
    }

    public final Deque c() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int p10 = this.f13781a.p();
        while (true) {
            p10--;
            if (p10 >= this.f13782b) {
                arrayDeque.addFirst(this.f13781a.b(p10));
            } else {
                return arrayDeque;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    public final boolean d() {
        if (this.f13781a == null) {
            return false;
        }
        if (this.f13784d != null) {
            return true;
        }
        Spliterator spliterator = this.f13783c;
        if (spliterator == null) {
            Deque c10 = c();
            this.f13785e = (ArrayDeque) c10;
            P0 a10 = a(c10);
            if (a10 == null) {
                this.f13781a = null;
                return false;
            }
            spliterator = a10.mo21spliterator();
        }
        this.f13784d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j10 = 0;
        if (this.f13781a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f13783c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f13782b; i10 < this.f13781a.p(); i10++) {
            j10 += this.f13781a.b(i10).count();
        }
        return j10;
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
        P0 p02 = this.f13781a;
        if (p02 == null || this.f13784d != null) {
            return null;
        }
        Spliterator spliterator = this.f13783c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f13782b < p02.p() - 1) {
            P0 p03 = this.f13781a;
            int i10 = this.f13782b;
            this.f13782b = i10 + 1;
            return p03.b(i10).mo21spliterator();
        }
        P0 b10 = this.f13781a.b(this.f13782b);
        this.f13781a = b10;
        if (b10.p() == 0) {
            Spliterator mo21spliterator = this.f13781a.mo21spliterator();
            this.f13783c = mo21spliterator;
            return mo21spliterator.trySplit();
        }
        P0 p04 = this.f13781a;
        this.f13782b = 0 + 1;
        return p04.b(0).mo21spliterator();
    }
}
