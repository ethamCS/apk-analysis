package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.y1 */
/* loaded from: classes2.dex */
public final class C0633y1 extends A1 implements AbstractC0598p2 {

    /* renamed from: h */
    private final long[] f13834h;

    public C0633y1(Spliterator spliterator, D0 d02, long[] jArr) {
        super(spliterator, d02, jArr.length);
        this.f13834h = jArr;
    }

    C0633y1(C0633y1 c0633y1, Spliterator spliterator, long j10, long j11) {
        super(c0633y1, spliterator, j10, j11, c0633y1.f13834h.length);
        this.f13834h = c0633y1.f13834h;
    }

    @Override // j$.util.stream.A1
    final A1 b(Spliterator spliterator, long j10, long j11) {
        return new C0633y1(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.A1, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        int i10 = this.f13407f;
        if (i10 < this.f13408g) {
            long[] jArr = this.f13834h;
            this.f13407f = i10 + 1;
            jArr[i10] = j10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f13407f));
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }
}
