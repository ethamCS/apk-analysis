package nh;
/* loaded from: classes3.dex */
public class a0 extends m {
    public a0() {
    }

    public a0(a0 a0Var) {
        super(a0Var);
    }

    @Override // ak.i
    public ak.i a() {
        return new a0(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        k((a0) iVar);
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
        ak.l.s(this.f17237k, bArr, i10 + 48);
        ak.l.s(this.f17238l, bArr, i10 + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 64;
    }

    @Override // nh.m, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17231e = 7640891576956012808L;
        this.f17232f = -4942790177534073029L;
        this.f17233g = 4354685564936845355L;
        this.f17234h = -6534734903238641935L;
        this.f17235i = 5840696475078001361L;
        this.f17236j = -7276294671716946913L;
        this.f17237k = 2270897969802886507L;
        this.f17238l = 6620516959819538809L;
    }
}
