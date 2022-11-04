package j$.util.stream;

import j$.util.function.AbstractC0503e;
/* renamed from: j$.util.stream.g3 */
/* loaded from: classes2.dex */
final class C0554g3 extends AbstractC0569j3 implements AbstractC0503e {

    /* renamed from: c */
    final double[] f13702c = new double[128];

    @Override // j$.util.stream.AbstractC0569j3
    public final void b(Object obj, long j10) {
        AbstractC0503e abstractC0503e = (AbstractC0503e) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            abstractC0503e.c(this.f13702c[i10]);
        }
    }

    @Override // j$.util.function.AbstractC0503e
    public final void c(double d10) {
        double[] dArr = this.f13702c;
        int i10 = this.f13709b;
        this.f13709b = i10 + 1;
        dArr[i10] = d10;
    }
}
