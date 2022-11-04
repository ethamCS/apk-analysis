package l6;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: c */
    private final short f15843c;

    /* renamed from: d */
    private final short f15844d;

    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f15843c = (short) i10;
        this.f15844d = (short) i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.g
    public void c(o6.a aVar, byte[] bArr) {
        aVar.d(this.f15843c, this.f15844d);
    }

    public String toString() {
        short s10 = this.f15843c;
        short s11 = this.f15844d;
        int i10 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(i10 | (1 << this.f15844d)).substring(1) + '>';
    }
}
