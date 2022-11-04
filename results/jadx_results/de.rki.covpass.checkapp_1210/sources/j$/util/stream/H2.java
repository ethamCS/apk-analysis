package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class H2 extends D2 {

    /* renamed from: c */
    private X2 f13461c;

    public H2(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.stream.AbstractC0598p2, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        this.f13461c.d(j10);
    }

    @Override // j$.util.stream.AbstractC0578l2, j$.util.stream.AbstractC0603q2
    public final void t() {
        long[] jArr = (long[]) this.f13461c.i();
        Arrays.sort(jArr);
        this.f13733a.u(jArr.length);
        int i10 = 0;
        if (!this.f13440b) {
            int length = jArr.length;
            while (i10 < length) {
                this.f13733a.d(jArr[i10]);
                i10++;
            }
        } else {
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                if (this.f13733a.x()) {
                    break;
                }
                this.f13733a.d(j10);
                i10++;
            }
        }
        this.f13733a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13461c = j10 > 0 ? new X2((int) j10) : new X2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
