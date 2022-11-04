package vh;

import zh.f1;
/* loaded from: classes3.dex */
public class c implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private byte[] f24150a;

    /* renamed from: b */
    private byte[] f24151b;

    /* renamed from: c */
    private byte[] f24152c;

    /* renamed from: d */
    private int f24153d;

    /* renamed from: e */
    private org.bouncycastle.crypto.e f24154e;

    /* renamed from: f */
    private boolean f24155f;

    public c(org.bouncycastle.crypto.e eVar) {
        this.f24154e = eVar;
        int b10 = eVar.b();
        this.f24153d = b10;
        this.f24150a = new byte[b10];
        this.f24151b = new byte[b10];
        this.f24152c = new byte[b10];
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f24153d;
        if (i10 + i12 <= bArr.length) {
            System.arraycopy(bArr, i10, this.f24152c, 0, i12);
            int a10 = this.f24154e.a(bArr, i10, bArr2, i11);
            for (int i13 = 0; i13 < this.f24153d; i13++) {
                int i14 = i11 + i13;
                bArr2[i14] = (byte) (bArr2[i14] ^ this.f24151b[i13]);
            }
            byte[] bArr3 = this.f24151b;
            this.f24151b = this.f24152c;
            this.f24152c = bArr3;
            return a10;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f24153d + i10 <= bArr.length) {
            for (int i12 = 0; i12 < this.f24153d; i12++) {
                byte[] bArr3 = this.f24151b;
                bArr3[i12] = (byte) (bArr3[i12] ^ bArr[i10 + i12]);
            }
            int a10 = this.f24154e.a(this.f24151b, 0, bArr2, i11);
            byte[] bArr4 = this.f24151b;
            System.arraycopy(bArr2, i11, bArr4, 0, bArr4.length);
            return a10;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f24155f ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24154e.b();
    }

    public org.bouncycastle.crypto.e e() {
        return this.f24154e;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24154e.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        boolean z11 = this.f24155f;
        this.f24155f = z10;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            if (a10.length != this.f24153d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(a10, 0, this.f24150a, 0, a10.length);
            reset();
            if (f1Var.b() == null) {
                if (z11 != z10) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            eVar = this.f24154e;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                if (z11 != z10) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            eVar = this.f24154e;
        }
        eVar.init(z10, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f24150a;
        System.arraycopy(bArr, 0, this.f24151b, 0, bArr.length);
        ak.a.y(this.f24152c, (byte) 0);
        this.f24154e.reset();
    }
}
