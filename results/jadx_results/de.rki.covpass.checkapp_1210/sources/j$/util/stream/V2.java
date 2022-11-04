package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
public class V2 extends Z2 implements IntConsumer {
    public V2() {
    }

    public V2(int i10) {
        super(i10);
    }

    @Override // j$.util.stream.Z2
    protected final Object[] E() {
        return new int[8];
    }

    /* renamed from: G */
    public j$.util.B mo23spliterator() {
        return new U2(this, 0, this.f13677c, 0, this.f13676b);
    }

    @Override // j$.util.function.IntConsumer
    public void accept(int i10) {
        F();
        int i11 = this.f13676b;
        this.f13676b = i11 + 1;
        ((int[]) this.f13588e)[i11] = i10;
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object e(int i10) {
        return new int[i10];
    }

    @Override // j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            j((IntConsumer) consumer);
        } else if (!P3.f13527a) {
            mo23spliterator().forEachRemaining(consumer);
        } else {
            P3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator iterator() {
        return j$.util.U.g(mo23spliterator());
    }

    public final String toString() {
        int[] iArr = (int[]) i();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f13677c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f13677c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.Z2
    public final void w(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i10 < i11) {
            intConsumer.accept(iArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.Z2
    public final int z(Object obj) {
        return ((int[]) obj).length;
    }
}
