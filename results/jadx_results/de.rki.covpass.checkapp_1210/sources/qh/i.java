package qh;
/* loaded from: classes3.dex */
public final class i extends h {

    /* renamed from: n */
    protected int[] f20033n = new int[48];

    /* renamed from: o */
    protected int[] f20034o = new int[48];

    /* renamed from: p */
    protected int[] f20035p = new int[192];

    /* renamed from: q */
    protected int[] f20036q = new int[192];

    /* renamed from: r */
    private int[] f20037r = new int[8];

    @Override // qh.h, org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // qh.h, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // qh.h
    protected int l(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[4];
        o(e(bArr, i10), e(bArr, i10 + 4), e(bArr, i10 + 8), e(bArr, i10 + 12), iArr);
        c(iArr[0], bArr2, i11);
        c(iArr[1], bArr2, i11 + 4);
        c(iArr[2], bArr2, i11 + 8);
        c(iArr[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // qh.h
    protected int m(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[4];
        p(e(bArr, i10), e(bArr, i10 + 4), e(bArr, i10 + 8), e(bArr, i10 + 12), iArr);
        c(iArr[0], bArr2, i11);
        c(iArr[1], bArr2, i11 + 4);
        c(iArr[2], bArr2, i11 + 8);
        c(iArr[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // qh.h
    protected void n(byte[] bArr) {
        int i10 = 1518500249;
        int i11 = 19;
        for (int i12 = 0; i12 < 24; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = (i12 * 8) + i13;
                this.f20036q[i14] = i10;
                i10 += 1859775393;
                this.f20035p[i14] = i11;
                i11 = (i11 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i15 = 0; i15 < 8; i15++) {
            this.f20037r[i15] = e(bArr2, i15 * 4);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            int i17 = i16 * 2;
            int i18 = i17 * 8;
            int[] iArr = this.f20037r;
            iArr[6] = iArr[6] ^ h(iArr[7], this.f20036q[i18], this.f20035p[i18]);
            int[] iArr2 = this.f20037r;
            int i19 = i18 + 1;
            iArr2[5] = iArr2[5] ^ i(iArr2[6], this.f20036q[i19], this.f20035p[i19]);
            int[] iArr3 = this.f20037r;
            int i20 = i18 + 2;
            iArr3[4] = iArr3[4] ^ j(iArr3[5], this.f20036q[i20], this.f20035p[i20]);
            int[] iArr4 = this.f20037r;
            int i21 = i18 + 3;
            iArr4[3] = h(iArr4[4], this.f20036q[i21], this.f20035p[i21]) ^ iArr4[3];
            int[] iArr5 = this.f20037r;
            int i22 = i18 + 4;
            iArr5[2] = i(iArr5[3], this.f20036q[i22], this.f20035p[i22]) ^ iArr5[2];
            int[] iArr6 = this.f20037r;
            int i23 = i18 + 5;
            iArr6[1] = j(iArr6[2], this.f20036q[i23], this.f20035p[i23]) ^ iArr6[1];
            int[] iArr7 = this.f20037r;
            int i24 = i18 + 6;
            iArr7[0] = iArr7[0] ^ h(iArr7[1], this.f20036q[i24], this.f20035p[i24]);
            int[] iArr8 = this.f20037r;
            int i25 = i18 + 7;
            iArr8[7] = i(iArr8[0], this.f20036q[i25], this.f20035p[i25]) ^ iArr8[7];
            int i26 = (i17 + 1) * 8;
            int[] iArr9 = this.f20037r;
            iArr9[6] = iArr9[6] ^ h(iArr9[7], this.f20036q[i26], this.f20035p[i26]);
            int[] iArr10 = this.f20037r;
            int i27 = i26 + 1;
            iArr10[5] = iArr10[5] ^ i(iArr10[6], this.f20036q[i27], this.f20035p[i27]);
            int[] iArr11 = this.f20037r;
            int i28 = i26 + 2;
            iArr11[4] = iArr11[4] ^ j(iArr11[5], this.f20036q[i28], this.f20035p[i28]);
            int[] iArr12 = this.f20037r;
            int i29 = i26 + 3;
            iArr12[3] = h(iArr12[4], this.f20036q[i29], this.f20035p[i29]) ^ iArr12[3];
            int[] iArr13 = this.f20037r;
            int i30 = i26 + 4;
            iArr13[2] = i(iArr13[3], this.f20036q[i30], this.f20035p[i30]) ^ iArr13[2];
            int[] iArr14 = this.f20037r;
            int i31 = i26 + 5;
            iArr14[1] = j(iArr14[2], this.f20036q[i31], this.f20035p[i31]) ^ iArr14[1];
            int[] iArr15 = this.f20037r;
            int i32 = i26 + 6;
            iArr15[0] = iArr15[0] ^ h(iArr15[1], this.f20036q[i32], this.f20035p[i32]);
            int[] iArr16 = this.f20037r;
            int i33 = i26 + 7;
            iArr16[7] = i(iArr16[0], this.f20036q[i33], this.f20035p[i33]) ^ iArr16[7];
            int[] iArr17 = this.f20033n;
            int i34 = i16 * 4;
            int[] iArr18 = this.f20037r;
            iArr17[i34] = iArr18[0] & 31;
            int i35 = i34 + 1;
            iArr17[i35] = iArr18[2] & 31;
            int i36 = i34 + 2;
            iArr17[i36] = iArr18[4] & 31;
            int i37 = i34 + 3;
            iArr17[i37] = iArr18[6] & 31;
            int[] iArr19 = this.f20034o;
            iArr19[i34] = iArr18[7];
            iArr19[i35] = iArr18[5];
            iArr19[i36] = iArr18[3];
            iArr19[i37] = iArr18[1];
        }
    }

    protected final void o(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 0;
        while (true) {
            if (i15 < 6) {
                int i16 = (11 - i15) * 4;
                i12 ^= h(i13, this.f20034o[i16], this.f20033n[i16]);
                int i17 = i16 + 1;
                i11 ^= i(i12, this.f20034o[i17], this.f20033n[i17]);
                int i18 = i16 + 2;
                i10 ^= j(i11, this.f20034o[i18], this.f20033n[i18]);
                int i19 = i16 + 3;
                i13 ^= h(i10, this.f20034o[i19], this.f20033n[i19]);
                i15++;
            }
        }
        for (i14 = 6; i14 < 12; i14++) {
            int i20 = (11 - i14) * 4;
            int i21 = i20 + 3;
            i13 ^= h(i10, this.f20034o[i21], this.f20033n[i21]);
            int i22 = i20 + 2;
            i10 ^= j(i11, this.f20034o[i22], this.f20033n[i22]);
            int i23 = i20 + 1;
            i11 ^= i(i12, this.f20034o[i23], this.f20033n[i23]);
            i12 ^= h(i13, this.f20034o[i20], this.f20033n[i20]);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
    }

    protected final void p(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 0;
        while (true) {
            if (i15 < 6) {
                int i16 = i15 * 4;
                i12 ^= h(i13, this.f20034o[i16], this.f20033n[i16]);
                int i17 = i16 + 1;
                i11 ^= i(i12, this.f20034o[i17], this.f20033n[i17]);
                int i18 = i16 + 2;
                i10 ^= j(i11, this.f20034o[i18], this.f20033n[i18]);
                int i19 = i16 + 3;
                i13 ^= h(i10, this.f20034o[i19], this.f20033n[i19]);
                i15++;
            }
        }
        for (i14 = 6; i14 < 12; i14++) {
            int i20 = i14 * 4;
            int i21 = i20 + 3;
            i13 ^= h(i10, this.f20034o[i21], this.f20033n[i21]);
            int i22 = i20 + 2;
            i10 ^= j(i11, this.f20034o[i22], this.f20033n[i22]);
            int i23 = i20 + 1;
            i11 ^= i(i12, this.f20034o[i23], this.f20033n[i23]);
            i12 ^= h(i13, this.f20034o[i20], this.f20033n[i20]);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
    }

    @Override // qh.h, org.bouncycastle.crypto.e
    public void reset() {
    }
}
