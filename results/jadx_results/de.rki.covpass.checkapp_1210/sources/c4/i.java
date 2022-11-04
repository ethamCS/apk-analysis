package c4;
/* loaded from: classes.dex */
public class i extends q<i> {
    public long[] V3;

    public i() {
        this.V3 = new long[0];
    }

    public i(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    protected Object A() {
        return this.V3;
    }

    @Override // c4.q
    public void B(Object obj) {
        this.V3 = (long[]) obj;
    }

    @Override // c4.q
    public p M() {
        return p.S64;
    }

    /* renamed from: c0 */
    public i e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new i() : new i(i10, i11);
    }

    public long d0(int i10, int i11) {
        return this.V3[i(i10, i11)];
    }
}
