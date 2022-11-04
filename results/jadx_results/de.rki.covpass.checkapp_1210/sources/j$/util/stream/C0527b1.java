package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.Arrays;
/* renamed from: j$.util.stream.b1 */
/* loaded from: classes2.dex */
public class C0527b1 implements J0 {

    /* renamed from: a */
    final double[] f13628a;

    /* renamed from: b */
    int f13629b;

    public C0527b1(long j10) {
        if (j10 < 2147483639) {
            this.f13628a = new double[(int) j10];
            this.f13629b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C0527b1(double[] dArr) {
        this.f13628a = dArr;
        this.f13629b = dArr.length;
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    public final O0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final long count() {
        return this.f13629b;
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void f(Double[] dArr, int i10) {
        D0.S(this, dArr, i10);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ void forEach(Consumer consumer) {
        D0.Y(this, consumer);
    }

    @Override // j$.util.stream.O0
    public final void g(Object obj, int i10) {
        System.arraycopy(this.f13628a, 0, (double[]) obj, i10, this.f13629b);
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        double[] dArr = this.f13628a;
        int length = dArr.length;
        int i10 = this.f13629b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.O0
    public final void j(Object obj) {
        AbstractC0503e abstractC0503e = (AbstractC0503e) obj;
        for (int i10 = 0; i10 < this.f13629b; i10++) {
            abstractC0503e.c(this.f13628a[i10]);
        }
    }

    @Override // j$.util.stream.P0
    public final /* bridge */ /* synthetic */ void m(Object[] objArr, int i10) {
        f((Double[]) objArr, i10);
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
        return D0.b0(this, j10, j11);
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    /* renamed from: spliterator */
    public final j$.util.F mo21spliterator() {
        return j$.util.U.j(this.f13628a, 0, this.f13629b);
    }

    public String toString() {
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(this.f13628a.length - this.f13629b), Arrays.toString(this.f13628a));
    }

    @Override // j$.util.stream.O0, j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.j(this.f13628a, 0, this.f13629b);
    }
}
