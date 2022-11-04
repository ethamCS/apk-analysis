package c4;
/* loaded from: classes.dex */
public class u extends r<u> {
    public float[] W3;

    public u() {
        this.W3 = new float[0];
    }

    public u(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // c4.r
    protected Object A() {
        return this.W3;
    }

    @Override // c4.r
    protected void B(Object obj) {
        this.W3 = (float[]) obj;
    }

    @Override // c4.r
    protected Class V() {
        return Float.TYPE;
    }

    @Override // c4.r
    public String d0(int i10) {
        return String.format("%5f", Float.valueOf(this.W3[i10]));
    }

    /* renamed from: e0 */
    public u e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new u() : new u(i10, i11, this.V3);
    }

    public float f0(int i10, int i11, int i12) {
        if (t(i10, i11)) {
            if (i12 >= 0 && i12 < this.V3) {
                return this.W3[M(i10, i11, i12)];
            }
            throw new m("Invalid band requested.");
        }
        throw new m("Requested pixel is out of bounds.");
    }
}
