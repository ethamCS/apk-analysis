package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: c */
    private int[] f13519c;

    /* renamed from: d */
    private int f13520d;

    public O2(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.stream.AbstractC0593o2, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        int[] iArr = this.f13519c;
        int i11 = this.f13520d;
        this.f13520d = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.stream.AbstractC0573k2, j$.util.stream.AbstractC0603q2
    public final void t() {
        int i10 = 0;
        Arrays.sort(this.f13519c, 0, this.f13520d);
        this.f13716a.u(this.f13520d);
        if (!this.f13428b) {
            while (i10 < this.f13520d) {
                this.f13716a.accept(this.f13519c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f13520d && !this.f13716a.x()) {
                this.f13716a.accept(this.f13519c[i10]);
                i10++;
            }
        }
        this.f13716a.t();
        this.f13519c = null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13519c = new int[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
