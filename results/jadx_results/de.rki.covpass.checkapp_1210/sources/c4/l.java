package c4;
/* loaded from: classes.dex */
public class l extends e<l> {
    public l() {
    }

    public l(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.e, c4.f, c4.q
    public p M() {
        return p.U8;
    }

    @Override // c4.f
    public int d0(int i10, int i11) {
        return this.V3[i(i10, i11)] & 255;
    }

    /* renamed from: f0 */
    public l e(int i10, int i11) {
        return (i10 == -1 || i11 == -1) ? new l() : new l(i10, i11);
    }
}
