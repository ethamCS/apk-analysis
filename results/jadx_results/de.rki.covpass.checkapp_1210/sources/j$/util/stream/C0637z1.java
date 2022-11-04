package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.z1 */
/* loaded from: classes2.dex */
public final class C0637z1 extends A1 {

    /* renamed from: h */
    private final Object[] f13842h;

    public C0637z1(Spliterator spliterator, D0 d02, Object[] objArr) {
        super(spliterator, d02, objArr.length);
        this.f13842h = objArr;
    }

    C0637z1(C0637z1 c0637z1, Spliterator spliterator, long j10, long j11) {
        super(c0637z1, spliterator, j10, j11, c0637z1.f13842h.length);
        this.f13842h = c0637z1.f13842h;
    }

    @Override // j$.util.stream.A1
    final A1 b(Spliterator spliterator, long j10, long j11) {
        return new C0637z1(this, spliterator, j10, j11);
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        int i10 = this.f13407f;
        if (i10 < this.f13408g) {
            Object[] objArr = this.f13842h;
            this.f13407f = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f13407f));
    }
}
