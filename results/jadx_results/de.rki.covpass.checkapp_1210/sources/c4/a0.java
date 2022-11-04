package c4;
/* loaded from: classes.dex */
public class a0 extends y<a0> {
    public int[] W3;

    public a0() {
        this.W3 = new int[0];
    }

    public a0(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // c4.r
    protected Object A() {
        return this.W3;
    }

    @Override // c4.r
    protected void B(Object obj) {
        this.W3 = (int[]) obj;
    }

    @Override // c4.r
    protected Class V() {
        return Integer.TYPE;
    }

    @Override // c4.r
    public String d0(int i10) {
        return String.format("%08x", Integer.valueOf(this.W3[i10]));
    }

    /* renamed from: e0 */
    public a0 e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new a0() : new a0(i10, i11, this.V3);
    }
}
