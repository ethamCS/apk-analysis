package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class X2 extends Z2 implements j$.util.function.x {
    public X2() {
    }

    public X2(int i10) {
        super(i10);
    }

    @Override // j$.util.stream.Z2
    protected final Object[] E() {
        return new long[8];
    }

    /* renamed from: G */
    public j$.util.D mo23spliterator() {
        return new W2(this, 0, this.f13677c, 0, this.f13676b);
    }

    @Override // j$.util.function.x
    public void d(long j10) {
        F();
        int i10 = this.f13676b;
        this.f13676b = i10 + 1;
        ((long[]) this.f13588e)[i10] = j10;
    }

    @Override // j$.util.stream.Z2
    public final Object e(int i10) {
        return new long[i10];
    }

    @Override // j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.x) {
            j((j$.util.function.x) consumer);
        } else if (!P3.f13527a) {
            mo23spliterator().forEachRemaining(consumer);
        } else {
            P3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator iterator() {
        return j$.util.U.h(mo23spliterator());
    }

    public final String toString() {
        long[] jArr = (long[]) i();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f13677c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f13677c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.Z2
    public final void w(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        j$.util.function.x xVar = (j$.util.function.x) obj2;
        while (i10 < i11) {
            xVar.d(jArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.Z2
    public final int z(Object obj) {
        return ((long[]) obj).length;
    }
}
