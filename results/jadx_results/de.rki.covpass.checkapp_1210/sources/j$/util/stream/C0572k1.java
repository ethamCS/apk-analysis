package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Arrays;
/* renamed from: j$.util.stream.k1 */
/* loaded from: classes2.dex */
public class C0572k1 implements L0 {

    /* renamed from: a */
    final int[] f13714a;

    /* renamed from: b */
    int f13715b;

    public C0572k1(long j10) {
        if (j10 < 2147483639) {
            this.f13714a = new int[(int) j10];
            this.f13715b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C0572k1(int[] iArr) {
        this.f13714a = iArr;
        this.f13715b = iArr.length;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final long count() {
        return this.f13715b;
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.Z(this, consumer);
    }

    @Override // j$.util.stream.O0
    public final void g(Object obj, int i10) {
        System.arraycopy(this.f13714a, 0, (int[]) obj, i10, this.f13715b);
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        int[] iArr = this.f13714a;
        int length = iArr.length;
        int i10 = this.f13715b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // j$.util.stream.O0
    public final void j(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < this.f13715b; i10++) {
            intConsumer.accept(this.f13714a[i10]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void k(Integer[] numArr, int i10) {
        D0.U(this, numArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        k((Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ Object[] q(j$.util.function.q qVar) {
        return D0.R(this, qVar);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.c0(this, j10, j11);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return j$.util.U.k(this.f13714a, 0, this.f13715b);
    }

    public String toString() {
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(this.f13714a.length - this.f13715b), Arrays.toString(this.f13714a));
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.k(this.f13714a, 0, this.f13715b);
    }
}
