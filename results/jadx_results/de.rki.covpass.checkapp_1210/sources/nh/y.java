package nh;
/* loaded from: classes3.dex */
public class y extends m {
    public y() {
    }

    public y(y yVar) {
        super(yVar);
    }

    @Override // ak.i
    public ak.i a() {
        return new y(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        super.k((y) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        l();
        ak.l.s(this.f17231e, bArr, i10);
        ak.l.s(this.f17232f, bArr, i10 + 8);
        ak.l.s(this.f17233g, bArr, i10 + 16);
        ak.l.s(this.f17234h, bArr, i10 + 24);
        ak.l.s(this.f17235i, bArr, i10 + 32);
        ak.l.s(this.f17236j, bArr, i10 + 40);
        reset();
        return 48;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 48;
    }

    @Override // nh.m, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17231e = -3766243637369397544L;
        this.f17232f = 7105036623409894663L;
        this.f17233g = -7973340178411365097L;
        this.f17234h = 1526699215303891257L;
        this.f17235i = 7436329637833083697L;
        this.f17236j = -8163818279084223215L;
        this.f17237k = -2662702644619276377L;
        this.f17238l = 5167115440072839076L;
    }
}
