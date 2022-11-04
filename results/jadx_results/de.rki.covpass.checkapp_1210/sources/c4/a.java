package c4;
/* loaded from: classes.dex */
public class a extends c<a> {
    public float[] V3;

    public a() {
        this.V3 = new float[0];
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    protected Object A() {
        return this.V3;
    }

    @Override // c4.q
    public void B(Object obj) {
        this.V3 = (float[]) obj;
    }

    public void K(int i10, int i11, float f10) {
        this.V3[i(i10, i11)] = f10;
    }

    @Override // c4.c, c4.q
    public p M() {
        return p.F32;
    }

    /* renamed from: c0 */
    public a e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new a() : new a(i10, i11);
    }

    public float d(int i10, int i11) {
        if (t(i10, i11)) {
            return l(i10, i11);
        }
        throw new m("Requested pixel is out of bounds: " + i10 + " " + i11);
    }

    public void d0(int i10, int i11, float f10) {
        if (t(i10, i11)) {
            K(i10, i11, f10);
            return;
        }
        throw new m("Requested pixel is out of bounds: " + i10 + " " + i11);
    }

    public float l(int i10, int i11) {
        return this.V3[i(i10, i11)];
    }
}
