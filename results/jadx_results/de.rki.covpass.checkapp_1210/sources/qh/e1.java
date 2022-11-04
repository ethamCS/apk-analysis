package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class e1 extends d1 {
    @Override // qh.d1
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
        for (int i15 = 0; i15 < 768; i15++) {
            byte[] bArr5 = this.f19970b;
            int i16 = i15 & 255;
            byte b14 = bArr5[(this.f19971c + bArr5[i16] + bArr[i15 % bArr.length]) & 255];
            this.f19971c = b14;
            byte b15 = bArr5[i16];
            bArr5[i16] = bArr5[b14 & 255];
            bArr5[b14 & 255] = b15;
        }
        this.f19969a = (byte) 0;
    }

    @Override // qh.d1, org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }
}
