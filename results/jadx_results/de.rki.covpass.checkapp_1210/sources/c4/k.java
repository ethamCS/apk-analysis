package c4;
/* loaded from: classes.dex */
public class k extends d<k> {
    public k() {
    }

    public k(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.d, c4.f, c4.q
    public p M() {
        return p.U16;
    }

    @Override // c4.f
    public int d0(int i10, int i11) {
        return this.V3[i(i10, i11)] & 65535;
    }

    /* renamed from: f0 */
    public k e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new k() : new k(i10, i11);
    }
}
