package qh;
/* loaded from: classes3.dex */
public class b0 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int[] f19935a = null;

    private int d(byte[] bArr, int i10) {
        return ((bArr[i10] << 8) & 65280) + (bArr[i10 + 1] & 255);
    }

    private int[] e(byte[] bArr) {
        int i10;
        int[] iArr = new int[52];
        int i11 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i11 < 8) {
                iArr[i11] = d(bArr, i11 * 2);
                i11++;
            }
        }
        for (i10 = 8; i10 < 52; i10++) {
            int i12 = i10 & 7;
            if (i12 < 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 6] >> 7)) & 65535;
            } else if (i12 == 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            } else {
                iArr[i10] = (((iArr[i10 - 15] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] f(boolean z10, byte[] bArr) {
        return z10 ? e(bArr) : h(e(bArr));
    }

    private void g(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int d10 = d(bArr, i10);
        int d11 = d(bArr, i10 + 2);
        int d12 = d(bArr, i10 + 4);
        int d13 = d(bArr, i10 + 6);
        int i12 = 0;
        int i13 = d12;
        int i14 = d11;
        int i15 = d10;
        int i16 = 0;
        while (i12 < 8) {
            int i17 = i16 + 1;
            int i18 = i(i15, iArr[i16]);
            int i19 = i17 + 1;
            int i20 = (i14 + iArr[i17]) & 65535;
            int i21 = i19 + 1;
            int i22 = (i13 + iArr[i19]) & 65535;
            int i23 = i21 + 1;
            int i24 = i(d13, iArr[i21]);
            int i25 = i23 + 1;
            int i26 = i(i22 ^ i18, iArr[i23]);
            int i27 = i(((i20 ^ i24) + i26) & 65535, iArr[i25]);
            int i28 = (i26 + i27) & 65535;
            d13 = i24 ^ i28;
            i13 = i28 ^ i20;
            i12++;
            i14 = i22 ^ i27;
            i15 = i18 ^ i27;
            i16 = i25 + 1;
        }
        int i29 = i16 + 1;
        k(i(i15, iArr[i16]), bArr2, i11);
        int i30 = i29 + 1;
        k(i13 + iArr[i29], bArr2, i11 + 2);
        k(i14 + iArr[i30], bArr2, i11 + 4);
        k(i(d13, iArr[i30 + 1]), bArr2, i11 + 6);
    }

    private int[] h(int[] iArr) {
        int[] iArr2 = new int[52];
        int j10 = j(iArr[0]);
        int i10 = 1;
        int c10 = c(iArr[1]);
        int c11 = c(iArr[2]);
        iArr2[51] = j(iArr[3]);
        iArr2[50] = c11;
        iArr2[49] = c10;
        int i11 = 48;
        iArr2[48] = j10;
        int i12 = 4;
        while (i10 < 8) {
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            int i15 = i13 + 1;
            int i16 = i11 - 1;
            iArr2[i16] = iArr[i13];
            int i17 = i16 - 1;
            iArr2[i17] = i14;
            int i18 = i15 + 1;
            int j11 = j(iArr[i15]);
            int i19 = i18 + 1;
            int c12 = c(iArr[i18]);
            int i20 = i19 + 1;
            int c13 = c(iArr[i19]);
            int i21 = i17 - 1;
            iArr2[i21] = j(iArr[i20]);
            int i22 = i21 - 1;
            iArr2[i22] = c12;
            int i23 = i22 - 1;
            iArr2[i23] = c13;
            i11 = i23 - 1;
            iArr2[i11] = j11;
            i10++;
            i12 = i20 + 1;
        }
        int i24 = i12 + 1;
        int i25 = iArr[i12];
        int i26 = i24 + 1;
        int i27 = i11 - 1;
        iArr2[i27] = iArr[i24];
        int i28 = i27 - 1;
        iArr2[i28] = i25;
        int i29 = i26 + 1;
        int j12 = j(iArr[i26]);
        int i30 = i29 + 1;
        int c14 = c(iArr[i29]);
        int i31 = i30 + 1;
        int c15 = c(iArr[i30]);
        int i32 = i28 - 1;
        iArr2[i32] = j(iArr[i31]);
        int i33 = i32 - 1;
        iArr2[i33] = c15;
        int i34 = i33 - 1;
        iArr2[i34] = c14;
        iArr2[i34 - 1] = j12;
        return iArr2;
    }

    private int i(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = 65537 - i11;
        } else if (i11 == 0) {
            i12 = 65537 - i10;
        } else {
            int i13 = i10 * i11;
            int i14 = i13 & 65535;
            int i15 = i13 >>> 16;
            i12 = (i14 - i15) + (i14 < i15 ? 1 : 0);
        }
        return i12 & 65535;
    }

    private int j(int i10) {
        if (i10 < 2) {
            return i10;
        }
        int i11 = 65537 / i10;
        int i12 = 65537 % i10;
        int i13 = 1;
        while (i12 != 1) {
            int i14 = i10 / i12;
            i10 %= i12;
            i13 = (i13 + (i14 * i11)) & 65535;
            if (i10 == 1) {
                return i13;
            }
            int i15 = i12 / i10;
            i12 %= i10;
            i11 = (i11 + (i15 * i13)) & 65535;
        }
        return (1 - i11) & 65535;
    }

    private void k(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.f19935a;
        if (iArr != null) {
            if (i10 + 8 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 8 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            g(iArr, bArr, i10, bArr2, i11);
            return 8;
        }
        throw new IllegalStateException("IDEA engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    int c(int i10) {
        return (0 - i10) & 65535;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f19935a = f(z10, ((zh.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
