package vh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class y extends g0 {

    /* renamed from: b */
    private final org.bouncycastle.crypto.e f24368b;

    /* renamed from: c */
    private final int f24369c;

    /* renamed from: d */
    private byte[] f24370d;

    /* renamed from: e */
    private byte[] f24371e;

    /* renamed from: f */
    private byte[] f24372f;

    /* renamed from: g */
    private int f24373g = 0;

    public y(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f24368b = eVar;
        int b10 = eVar.b();
        this.f24369c = b10;
        this.f24370d = new byte[b10];
        this.f24371e = new byte[b10];
        this.f24372f = new byte[b10];
    }

    private void e() {
        byte b10;
        int length = this.f24371e.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.f24371e;
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
        byte[] bArr2 = this.f24370d;
        if (length >= bArr2.length || bArr2.length >= this.f24369c) {
            return;
        }
        throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f24373g != 0) {
            processBytes(bArr, i10, this.f24369c, bArr2, i11);
        } else {
            int i12 = this.f24369c;
            if (i10 + i12 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too small");
            }
            if (i12 + i11 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            this.f24368b.a(this.f24371e, 0, this.f24372f, 0);
            for (int i13 = 0; i13 < this.f24369c; i13++) {
                bArr2[i11 + i13] = (byte) (bArr[i10 + i13] ^ this.f24372f[i13]);
            }
            e();
        }
        return this.f24369c;
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24368b.b();
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        int i10 = this.f24373g;
        if (i10 == 0) {
            this.f24368b.a(this.f24371e, 0, this.f24372f, 0);
            byte[] bArr = this.f24372f;
            int i11 = this.f24373g;
            this.f24373g = i11 + 1;
            return (byte) (b10 ^ bArr[i11]);
        }
        byte[] bArr2 = this.f24372f;
        int i12 = i10 + 1;
        this.f24373g = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == this.f24371e.length) {
            this.f24373g = 0;
            e();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24368b.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] h10 = ak.a.h(f1Var.a());
            this.f24370d = h10;
            int i10 = this.f24369c;
            if (i10 < h10.length) {
                throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.f24369c + " bytes.");
            }
            int i11 = 8;
            if (8 > i10 / 2) {
                i11 = i10 / 2;
            }
            if (i10 - h10.length <= i11) {
                if (f1Var.b() != null) {
                    this.f24368b.init(true, f1Var.b());
                }
                reset();
                return;
            }
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.f24369c - i11) + " bytes.");
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // org.bouncycastle.crypto.g0, org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte b10;
        if (i10 + i11 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f24373g;
                if (i14 == 0) {
                    this.f24368b.a(this.f24371e, 0, this.f24372f, 0);
                    byte b11 = bArr[i10 + i13];
                    byte[] bArr3 = this.f24372f;
                    int i15 = this.f24373g;
                    this.f24373g = i15 + 1;
                    b10 = (byte) (b11 ^ bArr3[i15]);
                } else {
                    byte b12 = bArr[i10 + i13];
                    byte[] bArr4 = this.f24372f;
                    int i16 = i14 + 1;
                    this.f24373g = i16;
                    b10 = (byte) (bArr4[i14] ^ b12);
                    if (i16 == this.f24371e.length) {
                        this.f24373g = 0;
                        e();
                    }
                }
                bArr2[i12 + i13] = b10;
            }
            return i11;
        }
        throw new org.bouncycastle.crypto.o("input buffer too small");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        ak.a.y(this.f24371e, (byte) 0);
        byte[] bArr = this.f24370d;
        System.arraycopy(bArr, 0, this.f24371e, 0, bArr.length);
        this.f24368b.reset();
        this.f24373g = 0;
    }
}
