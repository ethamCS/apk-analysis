package j$.util.stream;

import j$.lang.Iterable;
import j$.time.AbstractC0484a;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a3 */
/* loaded from: classes2.dex */
public class C0524a3 extends AbstractC0540e implements Consumer, Iterable, Iterable {

    /* renamed from: e */
    protected Object[] f13620e = new Object[1 << 4];

    /* renamed from: f */
    protected Object[][] f13621f;

    @Override // j$.util.stream.AbstractC0540e
    public final void clear() {
        Object[][] objArr = this.f13621f;
        if (objArr != null) {
            this.f13620e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f13620e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f13621f = null;
            this.f13678d = null;
        } else {
            for (int i11 = 0; i11 < this.f13676b; i11++) {
                this.f13620e[i11] = null;
            }
        }
        this.f13676b = 0;
        this.f13677c = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f13677c; i10++) {
            for (Object obj : this.f13621f[i10]) {
                consumer.h(obj);
            }
        }
        for (int i11 = 0; i11 < this.f13676b; i11++) {
            consumer.h(this.f13620e[i11]);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public void h(Object obj) {
        int i10 = this.f13676b;
        Object[] objArr = this.f13620e;
        if (i10 == objArr.length) {
            if (this.f13621f == null) {
                Object[][] objArr2 = new Object[8];
                this.f13621f = objArr2;
                this.f13678d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.f13677c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f13621f;
            if (i12 >= objArr3.length || objArr3[i11 + 1] == null) {
                z(w() + 1);
            }
            this.f13676b = 0;
            int i13 = this.f13677c + 1;
            this.f13677c = i13;
            this.f13620e = this.f13621f[i13];
        }
        Object[] objArr4 = this.f13620e;
        int i14 = this.f13676b;
        this.f13676b = i14 + 1;
        objArr4[i14] = obj;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator iterator() {
        return j$.util.U.i(mo23spliterator());
    }

    public void m(Object[] objArr, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > objArr.length || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f13677c == 0) {
            System.arraycopy(this.f13620e, 0, objArr, i10, this.f13676b);
            return;
        }
        for (int i11 = 0; i11 < this.f13677c; i11++) {
            Object[][] objArr2 = this.f13621f;
            System.arraycopy(objArr2[i11], 0, objArr, i10, objArr2[i11].length);
            i10 += this.f13621f[i11].length;
        }
        int i12 = this.f13676b;
        if (i12 <= 0) {
            return;
        }
        System.arraycopy(this.f13620e, 0, objArr, i10, i12);
    }

    /* renamed from: spliterator */
    public Spliterator mo23spliterator() {
        return new R2(this, 0, this.f13677c, 0, this.f13676b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C0525b(arrayList, 8));
        StringBuilder b10 = AbstractC0484a.b("SpinedBuffer:");
        b10.append(arrayList.toString());
        return b10.toString();
    }

    protected final long w() {
        int i10 = this.f13677c;
        if (i10 == 0) {
            return this.f13620e.length;
        }
        return this.f13621f[i10].length + this.f13678d[i10];
    }

    public final void z(long j10) {
        Object[][] objArr;
        int i10;
        long w9 = w();
        if (j10 > w9) {
            if (this.f13621f == null) {
                Object[][] objArr2 = new Object[8];
                this.f13621f = objArr2;
                this.f13678d = new long[8];
                objArr2[0] = this.f13620e;
            }
            int i11 = this.f13677c;
            while (true) {
                i11++;
                if (j10 <= w9) {
                    return;
                }
                Object[][] objArr3 = this.f13621f;
                if (i11 >= objArr3.length) {
                    int length = objArr3.length * 2;
                    this.f13621f = (Object[][]) Arrays.copyOf(objArr3, length);
                    this.f13678d = Arrays.copyOf(this.f13678d, length);
                }
                int s10 = s(i11);
                this.f13621f[i11] = new Object[s10];
                long[] jArr = this.f13678d;
                jArr[i11] = jArr[i11 - 1] + objArr[i10].length;
                w9 += s10;
            }
        }
    }
}
