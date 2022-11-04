package j$.util.stream;

import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class T2 extends Z2 implements AbstractC0503e {
    public T2() {
    }

    public T2(int i10) {
        super(i10);
    }

    @Override // j$.util.stream.Z2
    protected final Object[] E() {
        return new double[8];
    }

    /* renamed from: G */
    public j$.util.z mo23spliterator() {
        return new S2(this, 0, this.f13677c, 0, this.f13676b);
    }

    @Override // j$.util.function.AbstractC0503e
    public void c(double d10) {
        F();
        int i10 = this.f13676b;
        this.f13676b = i10 + 1;
        ((double[]) this.f13588e)[i10] = d10;
    }

    @Override // j$.util.stream.Z2
    public final Object e(int i10) {
        return new double[i10];
    }

    @Override // j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof AbstractC0503e) {
            j((AbstractC0503e) consumer);
        } else if (!P3.f13527a) {
            mo23spliterator().forEachRemaining(consumer);
        } else {
            P3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator iterator() {
        return j$.util.U.f(mo23spliterator());
    }

    public final String toString() {
        double[] dArr = (double[]) i();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f13677c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f13677c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.Z2
    public final void w(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        AbstractC0503e abstractC0503e = (AbstractC0503e) obj2;
        while (i10 < i11) {
            abstractC0503e.c(dArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.Z2
    public final int z(Object obj) {
        return ((double[]) obj).length;
    }
}
