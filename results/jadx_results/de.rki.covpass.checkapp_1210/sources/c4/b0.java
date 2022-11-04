package c4;
/* loaded from: classes.dex */
public class b0 extends r<b0> {
    public long[] W3;

    public b0() {
        this.W3 = new long[0];
    }

    public b0(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // c4.r
    protected Object A() {
        return this.W3;
    }

    @Override // c4.r
    protected void B(Object obj) {
        this.W3 = (long[]) obj;
    }

    @Override // c4.r
    protected Class V() {
        return Long.TYPE;
    }

    @Override // c4.r
    public String d0(int i10) {
        return String.format("%016x", Long.valueOf(this.W3[i10]));
    }

    /* renamed from: e0 */
    public b0 e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new b0() : new b0(i10, i11, this.V3);
    }
}
