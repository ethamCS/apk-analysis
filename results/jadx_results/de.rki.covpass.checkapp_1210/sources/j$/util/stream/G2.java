package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class G2 extends C2 {

    /* renamed from: c */
    private V2 f13456c;

    public G2(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.stream.AbstractC0593o2, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        this.f13456c.accept(i10);
    }

    @Override // j$.util.stream.AbstractC0573k2, j$.util.stream.AbstractC0603q2
    public final void t() {
        int[] iArr = (int[]) this.f13456c.i();
        Arrays.sort(iArr);
        this.f13716a.u(iArr.length);
        int i10 = 0;
        if (!this.f13428b) {
            int length = iArr.length;
            while (i10 < length) {
                this.f13716a.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length2 = iArr.length;
            while (i10 < length2) {
                int i11 = iArr[i10];
                if (this.f13716a.x()) {
                    break;
                }
                this.f13716a.accept(i11);
                i10++;
            }
        }
        this.f13716a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13456c = j10 > 0 ? new V2((int) j10) : new V2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
