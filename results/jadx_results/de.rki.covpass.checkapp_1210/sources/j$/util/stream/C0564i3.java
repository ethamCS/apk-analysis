package j$.util.stream;
/* renamed from: j$.util.stream.i3 */
/* loaded from: classes2.dex */
final class C0564i3 extends AbstractC0569j3 implements j$.util.function.x {

    /* renamed from: c */
    final long[] f13706c = new long[128];

    @Override // j$.util.stream.AbstractC0569j3
    public final void b(Object obj, long j10) {
        j$.util.function.x xVar = (j$.util.function.x) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            xVar.d(this.f13706c[i10]);
        }
    }

    @Override // j$.util.function.x
    public final void d(long j10) {
        long[] jArr = this.f13706c;
        int i10 = this.f13709b;
        this.f13709b = i10 + 1;
        jArr[i10] = j10;
    }
}
