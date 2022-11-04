package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class N2 extends B2 {

    /* renamed from: c */
    private double[] f13513c;

    /* renamed from: d */
    private int f13514d;

    public N2(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.stream.AbstractC0588n2, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        double[] dArr = this.f13513c;
        int i10 = this.f13514d;
        this.f13514d = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // j$.util.stream.AbstractC0568j2, j$.util.stream.AbstractC0603q2
    public final void t() {
        int i10 = 0;
        Arrays.sort(this.f13513c, 0, this.f13514d);
        this.f13708a.u(this.f13514d);
        if (!this.f13420b) {
            while (i10 < this.f13514d) {
                this.f13708a.c(this.f13513c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f13514d && !this.f13708a.x()) {
                this.f13708a.c(this.f13513c[i10]);
                i10++;
            }
        }
        this.f13708a.t();
        this.f13513c = null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13513c = new double[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
