package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class S0 implements P0 {

    /* renamed from: a */
    final Object[] f13545a;

    /* renamed from: b */
    int f13546b;

    public S0(long j10, j$.util.function.q qVar) {
        if (j10 < 2147483639) {
            this.f13545a = (Object[]) qVar.o((int) j10);
            this.f13546b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public S0(Object[] objArr) {
        this.f13545a = objArr;
        this.f13546b = objArr.length;
    }

    @Override // j$.util.stream.P0
    public final P0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final long count() {
        return this.f13546b;
    }

    @Override // j$.util.stream.P0
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f13546b; i10++) {
            consumer.h(this.f13545a[i10]);
        }
    }

    @Override // j$.util.stream.P0
    public final void m(Object[] objArr, int i10) {
        System.arraycopy(this.f13545a, 0, objArr, i10, this.f13546b);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public final Object[] q(j$.util.function.q qVar) {
        Object[] objArr = this.f13545a;
        if (objArr.length == this.f13546b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.e0(this, j10, j11, qVar);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return j$.util.U.m(this.f13545a, 0, this.f13546b);
    }

    public String toString() {
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(this.f13545a.length - this.f13546b), Arrays.toString(this.f13545a));
    }
}
