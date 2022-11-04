package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.w1 */
/* loaded from: classes2.dex */
public final class C0625w1 extends A1 implements AbstractC0588n2 {

    /* renamed from: h */
    private final double[] f13817h;

    public C0625w1(Spliterator spliterator, D0 d02, double[] dArr) {
        super(spliterator, d02, dArr.length);
        this.f13817h = dArr;
    }

    C0625w1(C0625w1 c0625w1, Spliterator spliterator, long j10, long j11) {
        super(c0625w1, spliterator, j10, j11, c0625w1.f13817h.length);
        this.f13817h = c0625w1.f13817h;
    }

    @Override // j$.util.stream.A1
    final A1 b(Spliterator spliterator, long j10, long j11) {
        return new C0625w1(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.A1, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        int i10 = this.f13407f;
        if (i10 < this.f13408g) {
            double[] dArr = this.f13817h;
            this.f13407f = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f13407f));
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        D0.J(this, d10);
    }
}
