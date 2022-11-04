package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Arrays;
/* renamed from: j$.util.stream.t1 */
/* loaded from: classes2.dex */
public class C0613t1 implements N0 {

    /* renamed from: a */
    final long[] f13793a;

    /* renamed from: b */
    int f13794b;

    public C0613t1(long j10) {
        if (j10 < 2147483639) {
            this.f13793a = new long[(int) j10];
            this.f13794b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C0613t1(long[] jArr) {
        this.f13793a = jArr;
        this.f13794b = jArr.length;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final long count() {
        return this.f13794b;
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.a0(this, consumer);
    }

    @Override // j$.util.stream.O0
    public final void g(Object obj, int i10) {
        System.arraycopy(this.f13793a, 0, (long[]) obj, i10, this.f13794b);
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        long[] jArr = this.f13793a;
        int length = jArr.length;
        int i10 = this.f13794b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // j$.util.stream.O0
    public final void j(Object obj) {
        j$.util.function.x xVar = (j$.util.function.x) obj;
        for (int i10 = 0; i10 < this.f13794b; i10++) {
            xVar.d(this.f13793a[i10]);
        }
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        o((Long[]) objArr, i10);
    }

    @Override // j$.util.stream.N0
    public final /* synthetic */ void o(Long[] lArr, int i10) {
        D0.W(this, lArr, i10);
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
        return D0.d0(this, j10, j11);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return j$.util.U.l(this.f13793a, 0, this.f13794b);
    }

    public String toString() {
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(this.f13793a.length - this.f13794b), Arrays.toString(this.f13793a));
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.l(this.f13793a, 0, this.f13794b);
    }
}
