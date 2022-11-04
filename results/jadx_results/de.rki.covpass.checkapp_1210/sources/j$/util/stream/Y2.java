package j$.util.stream;

import j$.util.AbstractC0516o;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class Y2 implements j$.util.F {

    /* renamed from: a */
    int f13580a;

    /* renamed from: b */
    final int f13581b;

    /* renamed from: c */
    int f13582c;

    /* renamed from: d */
    final int f13583d;

    /* renamed from: e */
    Object f13584e;

    /* renamed from: f */
    final /* synthetic */ Z2 f13585f;

    public Y2(Z2 z22, int i10, int i11, int i12, int i13) {
        this.f13585f = z22;
        this.f13580a = i10;
        this.f13581b = i11;
        this.f13582c = i12;
        this.f13583d = i13;
        Object[] objArr = z22.f13589f;
        this.f13584e = objArr == null ? z22.f13588e : objArr[i10];
    }

    abstract void a(Object obj, int i10, Object obj2);

    abstract j$.util.F c(Object obj, int i10, int i11);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    abstract j$.util.F d(int i10, int i11, int i12, int i13);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f13580a;
        int i11 = this.f13581b;
        if (i10 == i11) {
            return this.f13583d - this.f13582c;
        }
        long[] jArr = this.f13585f.f13678d;
        return ((jArr[i11] + this.f13583d) - jArr[i10]) - this.f13582c;
    }

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public final void k(Object obj) {
        int i10;
        Objects.requireNonNull(obj);
        int i11 = this.f13580a;
        int i12 = this.f13581b;
        if (i11 < i12 || (i11 == i12 && this.f13582c < this.f13583d)) {
            int i13 = this.f13582c;
            while (true) {
                i10 = this.f13581b;
                if (i11 >= i10) {
                    break;
                }
                Z2 z22 = this.f13585f;
                Object obj2 = z22.f13589f[i11];
                z22.w(obj2, i13, z22.z(obj2), obj);
                i13 = 0;
                i11++;
            }
            this.f13585f.w(this.f13580a == i10 ? this.f13584e : this.f13585f.f13589f[i10], i13, this.f13583d, obj);
            this.f13580a = this.f13581b;
            this.f13582c = this.f13583d;
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
        Objects.requireNonNull(obj);
        int i10 = this.f13580a;
        int i11 = this.f13581b;
        if (i10 < i11 || (i10 == i11 && this.f13582c < this.f13583d)) {
            Object obj2 = this.f13584e;
            int i12 = this.f13582c;
            this.f13582c = i12 + 1;
            a(obj2, i12, obj);
            if (this.f13582c == this.f13585f.z(this.f13584e)) {
                this.f13582c = 0;
                int i13 = this.f13580a + 1;
                this.f13580a = i13;
                Object[] objArr = this.f13585f.f13589f;
                if (objArr != null && i13 <= this.f13581b) {
                    this.f13584e = objArr[i13];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final j$.util.F trySplit() {
        int i10 = this.f13580a;
        int i11 = this.f13581b;
        if (i10 < i11) {
            int i12 = this.f13582c;
            Z2 z22 = this.f13585f;
            j$.util.F d10 = d(i10, i11 - 1, i12, z22.z(z22.f13589f[i11 - 1]));
            int i13 = this.f13581b;
            this.f13580a = i13;
            this.f13582c = 0;
            this.f13584e = this.f13585f.f13589f[i13];
            return d10;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f13583d;
            int i15 = this.f13582c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            j$.util.F c10 = c(this.f13584e, i15, i16);
            this.f13582c += i16;
            return c10;
        }
    }
}
