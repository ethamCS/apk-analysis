package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class d1 implements org.bouncycastle.crypto.h0 {

    /* renamed from: a */
    protected byte f19969a = 0;

    /* renamed from: b */
    protected byte[] f19970b = null;

    /* renamed from: c */
    protected byte f19971c = 0;

    /* renamed from: d */
    protected byte[] f19972d;

    /* renamed from: e */
    protected byte[] f19973e;

    protected void a(byte[] bArr, byte[] bArr2) {
        this.f19971c = (byte) 0;
        this.f19970b = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f19970b[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f19970b;
            int i12 = i11 & 255;
            byte b10 = bArr3[(this.f19971c + bArr3[i12] + bArr[i11 % bArr.length]) & 255];
            this.f19971c = b10;
            byte b11 = bArr3[i12];
            bArr3[i12] = bArr3[b10 & 255];
            bArr3[b10 & 255] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f19970b;
            int i14 = i13 & 255;
            byte b12 = bArr4[(this.f19971c + bArr4[i14] + bArr2[i13 % bArr2.length]) & 255];
            this.f19971c = b12;
            byte b13 = bArr4[i14];
            bArr4[i14] = bArr4[b12 & 255];
            bArr4[b12 & 255] = b13;
        }
        this.f19969a = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            if (!(f1Var.b() instanceof zh.b1)) {
                throw new IllegalArgumentException("VMPC init parameters must include a key");
            }
            zh.b1 b1Var = (zh.b1) f1Var.b();
            byte[] a10 = f1Var.a();
            this.f19972d = a10;
            if (a10 == null || a10.length < 1 || a10.length > 768) {
                throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
            }
            byte[] a11 = b1Var.a();
            this.f19973e = a11;
            a(a11, this.f19972d);
            return;
        }
        throw new IllegalArgumentException("VMPC init parameters must include an IV");
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                byte[] bArr3 = this.f19970b;
                byte b10 = this.f19971c;
                byte b11 = this.f19969a;
                byte b12 = bArr3[(b10 + bArr3[b11 & 255]) & 255];
                this.f19971c = b12;
                byte b13 = bArr3[(bArr3[bArr3[b12 & 255] & 255] + 1) & 255];
                byte b14 = bArr3[b11 & 255];
                bArr3[b11 & 255] = bArr3[b12 & 255];
                bArr3[b12 & 255] = b14;
                this.f19969a = (byte) ((b11 + 1) & 255);
                bArr2[i13 + i12] = (byte) (bArr[i13 + i10] ^ b13);
            }
            return i11;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        a(this.f19973e, this.f19972d);
    }
}
