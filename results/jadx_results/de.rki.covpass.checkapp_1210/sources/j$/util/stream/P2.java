package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c */
    private long[] f13525c;

    /* renamed from: d */
    private int f13526d;

    public P2(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.stream.AbstractC0598p2, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        long[] jArr = this.f13525c;
        int i10 = this.f13526d;
        this.f13526d = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // j$.util.stream.AbstractC0578l2, j$.util.stream.AbstractC0603q2
    public final void t() {
        int i10 = 0;
        Arrays.sort(this.f13525c, 0, this.f13526d);
        this.f13733a.u(this.f13526d);
        if (!this.f13440b) {
            while (i10 < this.f13526d) {
                this.f13733a.d(this.f13525c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f13526d && !this.f13733a.x()) {
                this.f13733a.d(this.f13525c[i10]);
                i10++;
            }
        }
        this.f13733a.t();
        this.f13525c = null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13525c = new long[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
