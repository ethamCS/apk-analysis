package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class F2 extends B2 {

    /* renamed from: c */
    private T2 f13451c;

    public F2(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.stream.AbstractC0588n2, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        this.f13451c.c(d10);
    }

    @Override // j$.util.stream.AbstractC0568j2, j$.util.stream.AbstractC0603q2
    public final void t() {
        double[] dArr = (double[]) this.f13451c.i();
        Arrays.sort(dArr);
        this.f13708a.u(dArr.length);
        int i10 = 0;
        if (!this.f13420b) {
            int length = dArr.length;
            while (i10 < length) {
                this.f13708a.c(dArr[i10]);
                i10++;
            }
        } else {
            int length2 = dArr.length;
            while (i10 < length2) {
                double d10 = dArr[i10];
                if (this.f13708a.x()) {
                    break;
                }
                this.f13708a.c(d10);
                i10++;
            }
        }
        this.f13708a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13451c = j10 > 0 ? new T2((int) j10) : new T2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
