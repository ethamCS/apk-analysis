package c4;
/* loaded from: classes.dex */
public class h extends f<h> {
    public int[] V3;

    public h() {
        this.V3 = new int[0];
    }

    public h(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    protected Object A() {
        return this.V3;
    }

    @Override // c4.q
    public void B(Object obj) {
        this.V3 = (int[]) obj;
    }

    @Override // c4.f, c4.q
    public p M() {
        return p.S32;
    }

    @Override // c4.f
    public int d0(int i10, int i11) {
        return this.V3[i(i10, i11)];
    }

    /* renamed from: e0 */
    public h e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new h() : new h(i10, i11);
    }
}
