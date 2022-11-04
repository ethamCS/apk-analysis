package nh;
/* loaded from: classes3.dex */
public class l implements org.bouncycastle.crypto.t {

    /* renamed from: g */
    private static long[] f17219g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* renamed from: a */
    protected long[] f17220a;

    /* renamed from: b */
    protected byte[] f17221b;

    /* renamed from: c */
    protected int f17222c;

    /* renamed from: d */
    protected int f17223d;

    /* renamed from: e */
    protected int f17224e;

    /* renamed from: f */
    protected boolean f17225f;

    public l() {
        this(288);
    }

    public l(int i10) {
        this.f17220a = new long[25];
        this.f17221b = new byte[192];
        h(i10);
    }

    public l(l lVar) {
        long[] jArr = new long[25];
        this.f17220a = jArr;
        this.f17221b = new byte[192];
        long[] jArr2 = lVar.f17220a;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = lVar.f17221b;
        System.arraycopy(bArr, 0, this.f17221b, 0, bArr.length);
        this.f17222c = lVar.f17222c;
        this.f17223d = lVar.f17223d;
        this.f17224e = lVar.f17224e;
        this.f17225f = lVar.f17225f;
    }

    private void a(byte[] bArr, int i10) {
        int i11 = this.f17222c >>> 6;
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.f17220a;
            jArr[i12] = jArr[i12] ^ ak.l.p(bArr, i10);
            i10 += 8;
        }
        d();
    }

    private void b() {
        d();
        ak.l.w(this.f17220a, 0, this.f17222c >>> 6, this.f17221b, 0);
        this.f17223d = this.f17222c;
    }

    private void d() {
        long[] jArr = this.f17220a;
        int i10 = 0;
        long j10 = jArr[0];
        char c10 = 1;
        long j11 = jArr[1];
        long j12 = jArr[2];
        char c11 = 3;
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        long j20 = jArr[10];
        long j21 = jArr[11];
        long j22 = jArr[12];
        long j23 = jArr[13];
        long j24 = jArr[14];
        long j25 = jArr[15];
        long j26 = jArr[16];
        long j27 = jArr[17];
        long j28 = jArr[18];
        long j29 = jArr[19];
        long j30 = jArr[20];
        long j31 = jArr[21];
        long j32 = jArr[22];
        long j33 = jArr[23];
        int i11 = 24;
        long j34 = jArr[24];
        while (i10 < i11) {
            long j35 = (((j10 ^ j15) ^ j20) ^ j25) ^ j30;
            long j36 = (((j11 ^ j16) ^ j21) ^ j26) ^ j31;
            long j37 = (((j12 ^ j17) ^ j22) ^ j27) ^ j32;
            long j38 = (((j13 ^ j18) ^ j23) ^ j28) ^ j33;
            long j39 = (((j14 ^ j19) ^ j24) ^ j29) ^ j34;
            long j40 = ((j36 << c10) | (j36 >>> (-1))) ^ j39;
            long j41 = ((j37 << c10) | (j37 >>> (-1))) ^ j35;
            long j42 = ((j38 << c10) | (j38 >>> (-1))) ^ j36;
            long j43 = ((j39 << c10) | (j39 >>> (-1))) ^ j37;
            long j44 = ((j35 << c10) | (j35 >>> (-1))) ^ j38;
            long j45 = j10 ^ j40;
            long j46 = j15 ^ j40;
            long j47 = j20 ^ j40;
            long j48 = j25 ^ j40;
            long j49 = j30 ^ j40;
            long j50 = j11 ^ j41;
            long j51 = j16 ^ j41;
            long j52 = j21 ^ j41;
            long j53 = j26 ^ j41;
            long j54 = j31 ^ j41;
            long j55 = j12 ^ j42;
            long j56 = j17 ^ j42;
            long j57 = j22 ^ j42;
            long j58 = j27 ^ j42;
            long j59 = j32 ^ j42;
            long j60 = j13 ^ j43;
            long j61 = j18 ^ j43;
            long j62 = j23 ^ j43;
            long j63 = j28 ^ j43;
            long j64 = j33 ^ j43;
            long j65 = j14 ^ j44;
            long j66 = j19 ^ j44;
            long j67 = j24 ^ j44;
            long j68 = j29 ^ j44;
            long j69 = j34 ^ j44;
            long j70 = (j50 << c10) | (j50 >>> 63);
            long j71 = (j51 << 44) | (j51 >>> 20);
            long j72 = (j66 << 20) | (j66 >>> 44);
            long j73 = (j59 << 61) | (j59 >>> c11);
            long j74 = (j67 << 39) | (j67 >>> 25);
            long j75 = (j49 << 18) | (j49 >>> 46);
            long j76 = (j55 << 62) | (j55 >>> 2);
            long j77 = (j57 << 43) | (j57 >>> 21);
            long j78 = (j62 << 25) | (j62 >>> 39);
            long j79 = (j68 << 8) | (j68 >>> 56);
            long j80 = (j64 << 56) | (j64 >>> 8);
            long j81 = (j48 << 41) | (j48 >>> 23);
            long j82 = (j65 << 27) | (j65 >>> 37);
            long j83 = (j69 << 14) | (j69 >>> 50);
            long j84 = (j54 << 2) | (j54 >>> 62);
            long j85 = (j61 << 55) | (j61 >>> 9);
            long j86 = (j53 << 45) | (j53 >>> 19);
            long j87 = (j46 << 36) | (j46 >>> 28);
            long j88 = (j60 << 28) | (j60 >>> 36);
            long j89 = (j63 << 21) | (j63 >>> 43);
            long j90 = (j58 << 15) | (j58 >>> 49);
            long j91 = (j52 << 10) | (j52 >>> 54);
            long j92 = (j56 << 6) | (j56 >>> 58);
            long j93 = (j47 << 3) | (j47 >>> 61);
            long j94 = ((~j71) & j77) ^ j45;
            long j95 = ((~j77) & j89) ^ j71;
            j12 = j77 ^ ((~j89) & j83);
            j13 = j89 ^ ((~j83) & j45);
            long j96 = j83 ^ ((~j45) & j71);
            long j97 = j88 ^ ((~j72) & j93);
            long j98 = ((~j93) & j86) ^ j72;
            long j99 = ((~j86) & j73) ^ j93;
            long j100 = j86 ^ ((~j73) & j88);
            long j101 = ((~j88) & j72) ^ j73;
            j20 = j70 ^ ((~j92) & j78);
            long j102 = ((~j78) & j79) ^ j92;
            long j103 = ((~j79) & j75) ^ j78;
            long j104 = j79 ^ ((~j75) & j70);
            long j105 = ((~j70) & j92) ^ j75;
            long j106 = j82 ^ ((~j87) & j91);
            long j107 = ((~j91) & j90) ^ j87;
            long j108 = j91 ^ ((~j90) & j80);
            long j109 = ((~j80) & j82) ^ j90;
            long j110 = ((~j82) & j87) ^ j80;
            long j111 = ((~j74) & j81) ^ j85;
            j30 = j76 ^ ((~j85) & j74);
            long j112 = j94 ^ f17219g[i10];
            i10++;
            j16 = j98;
            j22 = j103;
            j21 = j102;
            j23 = j104;
            j31 = j111;
            c11 = 3;
            j33 = ((~j84) & j76) ^ j81;
            j32 = j74 ^ ((~j81) & j84);
            j19 = j101;
            jArr = jArr;
            j29 = j110;
            j24 = j105;
            j17 = j99;
            j18 = j100;
            j27 = j108;
            j25 = j106;
            j14 = j96;
            j15 = j97;
            i11 = 24;
            j28 = j109;
            j26 = j107;
            c10 = 1;
            j11 = j95;
            j34 = ((~j76) & j85) ^ j84;
            j10 = j112;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j10;
        jArr2[1] = j11;
        jArr2[2] = j12;
        jArr2[3] = j13;
        jArr2[4] = j14;
        jArr2[5] = j15;
        jArr2[6] = j16;
        jArr2[7] = j17;
        jArr2[8] = j18;
        jArr2[9] = j19;
        jArr2[10] = j20;
        jArr2[11] = j21;
        jArr2[12] = j22;
        jArr2[13] = j23;
        jArr2[14] = j24;
        jArr2[15] = j25;
        jArr2[16] = j26;
        jArr2[17] = j27;
        jArr2[18] = j28;
        jArr2[19] = j29;
        jArr2[20] = j30;
        jArr2[21] = j31;
        jArr2[22] = j32;
        jArr2[23] = j33;
        jArr2[24] = j34;
    }

    private void h(int i10) {
        if (i10 == 128 || i10 == 224 || i10 == 256 || i10 == 288 || i10 == 384 || i10 == 512) {
            i(1600 - (i10 << 1));
            return;
        }
        throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
    }

    private void i(int i10) {
        if (i10 <= 0 || i10 >= 1600 || i10 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f17222c = i10;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f17220a;
            if (i11 >= jArr.length) {
                ak.a.y(this.f17221b, (byte) 0);
                this.f17223d = 0;
                this.f17225f = false;
                this.f17224e = (1600 - i10) / 2;
                return;
            }
            jArr[i11] = 0;
            i11++;
        }
    }

    private void j() {
        byte[] bArr = this.f17221b;
        int i10 = this.f17223d;
        int i11 = i10 >>> 3;
        bArr[i11] = (byte) (bArr[i11] | ((byte) (1 << (i10 & 7))));
        int i12 = i10 + 1;
        this.f17223d = i12;
        if (i12 == this.f17222c) {
            a(bArr, 0);
        } else {
            int i13 = i12 >>> 6;
            int i14 = i12 & 63;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                long[] jArr = this.f17220a;
                jArr[i16] = jArr[i16] ^ ak.l.p(this.f17221b, i15);
                i15 += 8;
            }
            if (i14 > 0) {
                long[] jArr2 = this.f17220a;
                jArr2[i13] = (((1 << i14) - 1) & ak.l.p(this.f17221b, i15)) ^ jArr2[i13];
            }
        }
        long[] jArr3 = this.f17220a;
        int i17 = (this.f17222c - 1) >>> 6;
        jArr3[i17] = jArr3[i17] ^ Long.MIN_VALUE;
        this.f17223d = 0;
        this.f17225f = true;
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        k(bArr, i10, this.f17224e);
        reset();
        return getDigestSize();
    }

    protected void e(byte b10) {
        int i10 = this.f17223d;
        if (i10 % 8 == 0) {
            if (this.f17225f) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            byte[] bArr = this.f17221b;
            bArr[i10 >>> 3] = b10;
            int i11 = i10 + 8;
            this.f17223d = i11;
            if (i11 != this.f17222c) {
                return;
            }
            a(bArr, 0);
            this.f17223d = 0;
            return;
        }
        throw new IllegalStateException("attempt to absorb with odd length queue");
    }

    protected void f(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = this.f17223d;
        if (i15 % 8 == 0) {
            if (this.f17225f) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            int i16 = i15 >>> 3;
            int i17 = this.f17222c >>> 3;
            int i18 = i17 - i16;
            if (i11 < i18) {
                System.arraycopy(bArr, i10, this.f17221b, i16, i11);
                i14 = this.f17223d + (i11 << 3);
            } else {
                if (i16 > 0) {
                    System.arraycopy(bArr, i10, this.f17221b, i16, i18);
                    i12 = i18 + 0;
                    a(this.f17221b, 0);
                } else {
                    i12 = 0;
                }
                while (true) {
                    i13 = i11 - i12;
                    if (i13 < i17) {
                        break;
                    }
                    a(bArr, i10 + i12);
                    i12 += i17;
                }
                System.arraycopy(bArr, i10 + i12, this.f17221b, 0, i13);
                i14 = i13 << 3;
            }
            this.f17223d = i14;
            return;
        }
        throw new IllegalStateException("attempt to absorb with odd length queue");
    }

    public void g(int i10, int i11) {
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i12 = this.f17223d;
        if (i12 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f17225f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.f17221b[i12 >>> 3] = (byte) (i10 & ((1 << i11) - 1));
        this.f17223d = i12 + i11;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "Keccak-" + this.f17224e;
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return this.f17222c / 8;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17224e / 8;
    }

    public void k(byte[] bArr, int i10, long j10) {
        if (!this.f17225f) {
            j();
        }
        long j11 = 0;
        if (j10 % 8 == 0) {
            while (j11 < j10) {
                if (this.f17223d == 0) {
                    b();
                }
                int min = (int) Math.min(this.f17223d, j10 - j11);
                System.arraycopy(this.f17221b, (this.f17222c - this.f17223d) / 8, bArr, ((int) (j11 / 8)) + i10, min / 8);
                this.f17223d -= min;
                j11 += min;
            }
            return;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        h(this.f17224e);
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        e(b10);
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        f(bArr, i10, i11);
    }
}
