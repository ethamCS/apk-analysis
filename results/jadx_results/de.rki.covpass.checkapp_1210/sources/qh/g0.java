package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class g0 implements org.bouncycastle.crypto.h0 {

    /* renamed from: a */
    private byte[] f19998a = null;

    /* renamed from: b */
    private int f19999b = 0;

    /* renamed from: c */
    private int f20000c = 0;

    /* renamed from: d */
    private byte[] f20001d = null;

    private void a(byte[] bArr) {
        this.f20001d = bArr;
        this.f19999b = 0;
        this.f20000c = 0;
        if (this.f19998a == null) {
            this.f19998a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        }
        for (int i10 = 0; i10 < 256; i10++) {
            this.f19998a[i10] = (byte) i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.f19998a;
            i12 = ((bArr[i11] & 255) + bArr2[i13] + i12) & 255;
            byte b10 = bArr2[i13];
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b10;
            i11 = (i11 + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            byte[] a10 = ((zh.b1) iVar).a();
            this.f20001d = a10;
            a(a10);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = (this.f19999b + 1) & 255;
                this.f19999b = i14;
                byte[] bArr3 = this.f19998a;
                int i15 = (bArr3[i14] + this.f20000c) & 255;
                this.f20000c = i15;
                byte b10 = bArr3[i14];
                bArr3[i14] = bArr3[i15];
                bArr3[i15] = b10;
                bArr2[i13 + i12] = (byte) (bArr3[(bArr3[i14] + bArr3[i15]) & 255] ^ bArr[i13 + i10]);
            }
            return i11;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        a(this.f20001d);
    }
}
