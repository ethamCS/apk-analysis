package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class z implements org.bouncycastle.crypto.h0 {

    /* renamed from: d */
    private byte[] f20247d;

    /* renamed from: e */
    private byte[] f20248e;

    /* renamed from: f */
    private boolean f20249f;

    /* renamed from: a */
    private int[] f20244a = new int[512];

    /* renamed from: b */
    private int[] f20245b = new int[512];

    /* renamed from: c */
    private int f20246c = 0;

    /* renamed from: g */
    private byte[] f20250g = new byte[4];

    /* renamed from: h */
    private int f20251h = 0;

    private static int a(int i10, int i11) {
        return k(i10 - i11);
    }

    private static int b(int i10) {
        return (i10 >>> 3) ^ (m(i10, 7) ^ m(i10, 18));
    }

    private static int c(int i10) {
        return (i10 >>> 10) ^ (m(i10, 17) ^ m(i10, 19));
    }

    private int d(int i10, int i11, int i12) {
        return (m(i10, 10) ^ m(i12, 23)) + m(i11, 8);
    }

    private int e(int i10, int i11, int i12) {
        return (l(i10, 10) ^ l(i12, 23)) + l(i11, 8);
    }

    private byte f() {
        if (this.f20251h == 0) {
            int n10 = n();
            byte[] bArr = this.f20250g;
            bArr[0] = (byte) (n10 & 255);
            int i10 = n10 >> 8;
            bArr[1] = (byte) (i10 & 255);
            int i11 = i10 >> 8;
            bArr[2] = (byte) (i11 & 255);
            bArr[3] = (byte) ((i11 >> 8) & 255);
        }
        byte[] bArr2 = this.f20250g;
        int i12 = this.f20251h;
        byte b10 = bArr2[i12];
        this.f20251h = 3 & (i12 + 1);
        return b10;
    }

    private int g(int i10) {
        int[] iArr = this.f20245b;
        return iArr[i10 & 255] + iArr[((i10 >> 16) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    }

    private int h(int i10) {
        int[] iArr = this.f20244a;
        return iArr[i10 & 255] + iArr[((i10 >> 16) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    }

    private void i() {
        if (this.f20247d.length == 16) {
            this.f20251h = 0;
            this.f20246c = 0;
            int[] iArr = new int[1280];
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = i10 >> 2;
                iArr[i11] = ((this.f20247d[i10] & 255) << ((i10 & 3) * 8)) | iArr[i11];
            }
            System.arraycopy(iArr, 0, iArr, 4, 4);
            int i12 = 0;
            while (true) {
                byte[] bArr = this.f20248e;
                if (i12 >= bArr.length || i12 >= 16) {
                    break;
                }
                int i13 = (i12 >> 2) + 8;
                iArr[i13] = ((bArr[i12] & 255) << ((i12 & 3) * 8)) | iArr[i13];
                i12++;
            }
            System.arraycopy(iArr, 8, iArr, 12, 4);
            for (int i14 = 16; i14 < 1280; i14++) {
                iArr[i14] = c(iArr[i14 - 2]) + iArr[i14 - 7] + b(iArr[i14 - 15]) + iArr[i14 - 16] + i14;
            }
            System.arraycopy(iArr, PSKKeyManager.MAX_KEY_LENGTH_BYTES, this.f20244a, 0, 512);
            System.arraycopy(iArr, 768, this.f20245b, 0, 512);
            for (int i15 = 0; i15 < 512; i15++) {
                this.f20244a[i15] = n();
            }
            for (int i16 = 0; i16 < 512; i16++) {
                this.f20245b[i16] = n();
            }
            this.f20246c = 0;
            return;
        }
        throw new IllegalArgumentException("The key must be 128 bits long");
    }

    private static int j(int i10) {
        return i10 & 1023;
    }

    private static int k(int i10) {
        return i10 & 511;
    }

    private static int l(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private static int m(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private int n() {
        int i10;
        int i11;
        int k10 = k(this.f20246c);
        if (this.f20246c < 512) {
            int[] iArr = this.f20244a;
            iArr[k10] = iArr[k10] + d(iArr[a(k10, 3)], this.f20244a[a(k10, 10)], this.f20244a[a(k10, 511)]);
            i10 = g(this.f20244a[a(k10, 12)]);
            i11 = this.f20244a[k10];
        } else {
            int[] iArr2 = this.f20245b;
            iArr2[k10] = iArr2[k10] + e(iArr2[a(k10, 3)], this.f20245b[a(k10, 10)], this.f20245b[a(k10, 511)]);
            i10 = h(this.f20245b[a(k10, 12)]);
            i11 = this.f20245b[k10];
        }
        int i12 = i11 ^ i10;
        this.f20246c = j(this.f20246c + 1);
        return i12;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            this.f20248e = f1Var.a();
            iVar2 = f1Var.b();
        } else {
            this.f20248e = new byte[0];
            iVar2 = iVar;
        }
        if (iVar2 instanceof zh.b1) {
            this.f20247d = ((zh.b1) iVar2).a();
            i();
            this.f20249f = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f20249f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + i11 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ f());
            }
            return i11;
        }
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        i();
    }
}
