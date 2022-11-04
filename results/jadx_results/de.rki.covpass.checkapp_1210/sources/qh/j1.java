package qh;
/* loaded from: classes3.dex */
public class j1 extends h1 {

    /* renamed from: l */
    private static final byte[] f20054l = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: m */
    private static final byte[] f20055m = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: n */
    private static final byte[] f20056n = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: o */
    private static final byte[] f20057o = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: k */
    private byte[] f20058k;

    public j1() {
        this.f20058k = f20054l;
    }

    public j1(int i10) {
        if (i10 == 32) {
            this.f20058k = f20055m;
        } else if (i10 == 64) {
            this.f20058k = f20056n;
        } else if (i10 == 128) {
            this.f20058k = f20057o;
        } else {
            throw new IllegalArgumentException("Unsupported length: " + i10);
        }
    }

    public j1(j1 j1Var) {
        super(j1Var);
    }

    private static int u(byte b10, byte b11, byte b12, byte b13) {
        return ((b10 & 255) << 23) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    @Override // qh.h1, ak.i
    public ak.i a() {
        return new j1(this);
    }

    @Override // qh.h1, ak.i
    public void b(ak.i iVar) {
        super.b(iVar);
        this.f20058k = ((j1) iVar).f20058k;
    }

    @Override // qh.h1, org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // qh.h1
    protected int o() {
        return 625;
    }

    @Override // qh.h1
    protected void t(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("A key of 32 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 25) {
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        }
        iArr[0] = u(bArr[0], this.f20058k[0], bArr[21], bArr[16]);
        iArr[1] = u(bArr[1], this.f20058k[1], bArr[22], bArr[17]);
        iArr[2] = u(bArr[2], this.f20058k[2], bArr[23], bArr[18]);
        iArr[3] = u(bArr[3], this.f20058k[3], bArr[24], bArr[19]);
        iArr[4] = u(bArr[4], this.f20058k[4], bArr[25], bArr[20]);
        iArr[5] = u(bArr2[0], (byte) (this.f20058k[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = u(bArr2[1], (byte) (this.f20058k[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = u(bArr2[10], (byte) (this.f20058k[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = u(bArr[8], (byte) (this.f20058k[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = u(bArr[9], (byte) ((bArr2[21] & 63) | this.f20058k[9]), bArr2[12], bArr2[4]);
        iArr[10] = u(bArr2[5], (byte) (this.f20058k[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = u(bArr[11], (byte) (this.f20058k[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = u(bArr[12], (byte) (this.f20058k[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = u(bArr[13], this.f20058k[13], bArr2[15], bArr2[8]);
        iArr[14] = u(bArr[14], (byte) (this.f20058k[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = u(bArr[15], (byte) (this.f20058k[15] | (bArr[31] & 15)), bArr[30], bArr[29]);
    }
}
