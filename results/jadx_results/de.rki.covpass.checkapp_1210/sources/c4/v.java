package c4;
/* loaded from: classes.dex */
public class v extends r<v> {
    public double[] W3;

    public v() {
        this.W3 = new double[0];
    }

    public v(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // c4.r
    protected Object A() {
        return this.W3;
    }

    @Override // c4.r
    protected void B(Object obj) {
        this.W3 = (double[]) obj;
    }

    @Override // c4.r
    protected Class V() {
        return Double.TYPE;
    }

    @Override // c4.r
    public String d0(int i10) {
        return String.format("%5f", Double.valueOf(this.W3[i10]));
    }

    /* renamed from: e0 */
    public v e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new v() : new v(i10, i11, this.V3);
    }
}
