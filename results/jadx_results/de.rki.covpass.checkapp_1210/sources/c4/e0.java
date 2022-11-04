package c4;
/* loaded from: classes.dex */
public class e0 extends x<e0> {
    public e0() {
    }

    public e0(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: e0 */
    public e0 e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new e0() : new e0(i10, i11, this.V3);
    }

    public int f0(int i10, int i11, int i12) {
        if (t(i10, i11)) {
            if (i12 >= 0 && i12 < this.V3) {
                return this.W3[M(i10, i11, i12)] & 255;
            }
            throw new m("Invalid band requested.");
        }
        throw new m("Requested pixel is out of bounds.");
    }
}
