package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Objects;
/* loaded from: classes2.dex */
public class S implements Spliterator {

    /* renamed from: a */
    private final Collection f13261a;

    /* renamed from: b */
    private java.util.Iterator f13262b;

    /* renamed from: c */
    private final int f13263c;

    /* renamed from: d */
    private long f13264d;

    /* renamed from: e */
    private int f13265e;

    public S(Collection collection, int i10) {
        this.f13261a = collection;
        this.f13262b = null;
        this.f13263c = (i10 & 4096) == 0 ? i10 | 64 | 16384 : i10;
    }

    public S(java.util.Iterator it) {
        this.f13261a = null;
        this.f13262b = it;
        this.f13264d = Long.MAX_VALUE;
        this.f13263c = 0;
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f13262b == null) {
            this.f13262b = this.f13261a.iterator();
            this.f13264d = this.f13261a.size();
        }
        if (this.f13262b.hasNext()) {
            consumer.h(this.f13262b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13263c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f13262b == null) {
            this.f13262b = this.f13261a.iterator();
            long size = this.f13261a.size();
            this.f13264d = size;
            return size;
        }
        return this.f13264d;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.Iterator it = this.f13262b;
        if (it == null) {
            it = this.f13261a.iterator();
            this.f13262b = it;
            this.f13264d = this.f13261a.size();
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
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
        long j10;
        java.util.Iterator it = this.f13262b;
        if (it == null) {
            it = this.f13261a.iterator();
            this.f13262b = it;
            j10 = this.f13261a.size();
            this.f13264d = j10;
        } else {
            j10 = this.f13264d;
        }
        if (j10 <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f13265e + 1024;
        if (i10 > j10) {
            i10 = (int) j10;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f13265e = i11;
        long j11 = this.f13264d;
        if (j11 != Long.MAX_VALUE) {
            this.f13264d = j11 - i11;
        }
        return new K(objArr, 0, i11, this.f13263c);
    }
}
