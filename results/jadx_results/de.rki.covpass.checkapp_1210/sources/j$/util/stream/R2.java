package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class R2 implements Spliterator {

    /* renamed from: a */
    int f13539a;

    /* renamed from: b */
    final int f13540b;

    /* renamed from: c */
    int f13541c;

    /* renamed from: d */
    final int f13542d;

    /* renamed from: e */
    Object[] f13543e;

    /* renamed from: f */
    final /* synthetic */ C0524a3 f13544f;

    public R2(C0524a3 c0524a3, int i10, int i11, int i12, int i13) {
        this.f13544f = c0524a3;
        this.f13539a = i10;
        this.f13540b = i11;
        this.f13541c = i12;
        this.f13542d = i13;
        Object[][] objArr = c0524a3.f13621f;
        this.f13543e = objArr == null ? c0524a3.f13620e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f13539a;
        int i11 = this.f13540b;
        if (i10 < i11 || (i10 == i11 && this.f13541c < this.f13542d)) {
            Object[] objArr = this.f13543e;
            int i12 = this.f13541c;
            this.f13541c = i12 + 1;
            consumer.h(objArr[i12]);
            if (this.f13541c == this.f13543e.length) {
                this.f13541c = 0;
                int i13 = this.f13539a + 1;
                this.f13539a = i13;
                Object[][] objArr2 = this.f13544f.f13621f;
                if (objArr2 != null && i13 <= this.f13540b) {
                    this.f13543e = objArr2[i13];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f13539a;
        int i11 = this.f13540b;
        if (i10 == i11) {
            return this.f13542d - this.f13541c;
        }
        long[] jArr = this.f13544f.f13678d;
        return ((jArr[i11] + this.f13542d) - jArr[i10]) - this.f13541c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        Objects.requireNonNull(consumer);
        int i11 = this.f13539a;
        int i12 = this.f13540b;
        if (i11 < i12 || (i11 == i12 && this.f13541c < this.f13542d)) {
            int i13 = this.f13541c;
            while (true) {
                i10 = this.f13540b;
                if (i11 >= i10) {
                    break;
                }
                Object[] objArr = this.f13544f.f13621f[i11];
                while (i13 < objArr.length) {
                    consumer.h(objArr[i13]);
                    i13++;
                }
                i13 = 0;
                i11++;
            }
            Object[] objArr2 = this.f13539a == i10 ? this.f13543e : this.f13544f.f13621f[i10];
            int i14 = this.f13542d;
            while (i13 < i14) {
                consumer.h(objArr2[i13]);
                i13++;
            }
            this.f13539a = this.f13540b;
            this.f13541c = this.f13542d;
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
        int i10 = this.f13539a;
        int i11 = this.f13540b;
        if (i10 < i11) {
            C0524a3 c0524a3 = this.f13544f;
            int i12 = i11 - 1;
            R2 r22 = new R2(c0524a3, i10, i12, this.f13541c, c0524a3.f13621f[i12].length);
            int i13 = this.f13540b;
            this.f13539a = i13;
            this.f13541c = 0;
            this.f13543e = this.f13544f.f13621f[i13];
            return r22;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f13542d;
            int i15 = this.f13541c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            Spliterator m10 = j$.util.U.m(this.f13543e, i15, i15 + i16);
            this.f13541c += i16;
            return m10;
        }
    }
}
