package c4;
/* loaded from: classes.dex */
public class b extends c<b> {
    public double[] V3;

    public b() {
        this.V3 = new double[0];
    }

    public b(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    protected Object A() {
        return this.V3;
    }

    @Override // c4.q
    public void B(Object obj) {
        this.V3 = (double[]) obj;
    }

    @Override // c4.c, c4.q
    public p M() {
        return p.F64;
    }

    /* renamed from: c0 */
    public b e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new b() : new b(i10, i11);
    }

    public double d(int i10, int i11) {
        if (t(i10, i11)) {
            return l(i10, i11);
        }
        throw new m("Requested pixel is out of bounds: " + i10 + " " + i11);
    }

    public double l(int i10, int i11) {
        return this.V3[i(i10, i11)];
    }
}
