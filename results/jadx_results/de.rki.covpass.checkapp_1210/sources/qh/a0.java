package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class a0 implements org.bouncycastle.crypto.h0 {

    /* renamed from: d */
    private byte[] f19917d;

    /* renamed from: e */
    private byte[] f19918e;

    /* renamed from: f */
    private boolean f19919f;

    /* renamed from: a */
    private int[] f19914a = new int[1024];

    /* renamed from: b */
    private int[] f19915b = new int[1024];

    /* renamed from: c */
    private int f19916c = 0;

    /* renamed from: g */
    private byte[] f19920g = new byte[4];

    /* renamed from: h */
    private int f19921h = 0;

    private byte a() {
        if (this.f19921h == 0) {
            int d10 = d();
            byte[] bArr = this.f19920g;
            bArr[0] = (byte) (d10 & 255);
            int i10 = d10 >> 8;
            bArr[1] = (byte) (i10 & 255);
            int i11 = i10 >> 8;
            bArr[2] = (byte) (i11 & 255);
            bArr[3] = (byte) ((i11 >> 8) & 255);
        }
        byte[] bArr2 = this.f19920g;
        int i12 = this.f19921h;
        byte b10 = bArr2[i12];
        this.f19921h = 3 & (i12 + 1);
        return b10;
    }

    private void b() {
        byte[] bArr = this.f19917d;
        if (bArr.length == 32 || bArr.length == 16) {
            if (this.f19918e.length < 16) {
                throw new IllegalArgumentException("The IV must be at least 128 bits long");
            }
            if (bArr.length != 32) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                byte[] bArr3 = this.f19917d;
                System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
                this.f19917d = bArr2;
            }
            byte[] bArr4 = this.f19918e;
            if (bArr4.length < 32) {
                byte[] bArr5 = new byte[32];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                byte[] bArr6 = this.f19918e;
                System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
                this.f19918e = bArr5;
            }
            this.f19921h = 0;
            this.f19916c = 0;
            int[] iArr = new int[2560];
            for (int i10 = 0; i10 < 32; i10++) {
                int i11 = i10 >> 2;
                iArr[i11] = iArr[i11] | ((this.f19917d[i10] & 255) << ((i10 & 3) * 8));
            }
            for (int i12 = 0; i12 < 32; i12++) {
                int i13 = (i12 >> 2) + 8;
                iArr[i13] = iArr[i13] | ((this.f19918e[i12] & 255) << ((i12 & 3) * 8));
            }
            for (int i14 = 16; i14 < 2560; i14++) {
                int i15 = iArr[i14 - 2];
                int i16 = iArr[i14 - 15];
                iArr[i14] = ((i15 >>> 10) ^ (c(i15, 17) ^ c(i15, 19))) + iArr[i14 - 7] + ((i16 >>> 3) ^ (c(i16, 7) ^ c(i16, 18))) + iArr[i14 - 16] + i14;
            }
            System.arraycopy(iArr, 512, this.f19914a, 0, 1024);
            System.arraycopy(iArr, 1536, this.f19915b, 0, 1024);
            for (int i17 = 0; i17 < 4096; i17++) {
                d();
            }
            this.f19916c = 0;
            return;
        }
        throw new IllegalArgumentException("The key must be 128/256 bits long");
    }

    private static int c(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private int d() {
        int i10;
        int i11;
        int i12 = this.f19916c;
        int i13 = i12 & 1023;
        if (i12 < 1024) {
            int[] iArr = this.f19914a;
            int i14 = iArr[(i13 - 3) & 1023];
            int i15 = iArr[(i13 - 1023) & 1023];
            int i16 = iArr[i13];
            int c10 = iArr[(i13 - 10) & 1023] + (c(i15, 23) ^ c(i14, 10));
            int[] iArr2 = this.f19915b;
            iArr[i13] = i16 + c10 + iArr2[(i14 ^ i15) & 1023];
            int[] iArr3 = this.f19914a;
            int i17 = iArr3[(i13 - 12) & 1023];
            i10 = iArr2[i17 & 255] + iArr2[((i17 >> 8) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES] + iArr2[((i17 >> 16) & 255) + 512] + iArr2[((i17 >> 24) & 255) + 768];
            i11 = iArr3[i13];
        } else {
            int[] iArr4 = this.f19915b;
            int i18 = iArr4[(i13 - 3) & 1023];
            int i19 = iArr4[(i13 - 1023) & 1023];
            int i20 = iArr4[i13];
            int c11 = iArr4[(i13 - 10) & 1023] + (c(i19, 23) ^ c(i18, 10));
            int[] iArr5 = this.f19914a;
            iArr4[i13] = i20 + c11 + iArr5[(i18 ^ i19) & 1023];
            int[] iArr6 = this.f19915b;
            int i21 = iArr6[(i13 - 12) & 1023];
            i10 = iArr5[i21 & 255] + iArr5[((i21 >> 8) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES] + iArr5[((i21 >> 16) & 255) + 512] + iArr5[((i21 >> 24) & 255) + 768];
            i11 = iArr6[i13];
        }
        int i22 = i11 ^ i10;
        this.f19916c = (this.f19916c + 1) & 2047;
        return i22;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            this.f19918e = f1Var.a();
            iVar2 = f1Var.b();
        } else {
            this.f19918e = new byte[0];
            iVar2 = iVar;
        }
        if (iVar2 instanceof zh.b1) {
            this.f19917d = ((zh.b1) iVar2).a();
            b();
            this.f19919f = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f19919f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + i11 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ a());
            }
            return i11;
        }
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        b();
    }
}
