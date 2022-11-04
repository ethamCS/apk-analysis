package nh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class b implements org.bouncycastle.crypto.t {

    /* renamed from: s */
    private static final int[] f17076s = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* renamed from: t */
    private static final byte[][] f17077t = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};

    /* renamed from: a */
    private int f17078a;

    /* renamed from: b */
    private int f17079b;

    /* renamed from: c */
    private byte[] f17080c;

    /* renamed from: d */
    private byte[] f17081d;

    /* renamed from: e */
    private byte[] f17082e;

    /* renamed from: f */
    private int f17083f;

    /* renamed from: g */
    private int f17084g;

    /* renamed from: h */
    private int f17085h;

    /* renamed from: i */
    private long f17086i;

    /* renamed from: j */
    private int f17087j;

    /* renamed from: k */
    private int f17088k;

    /* renamed from: l */
    private byte[] f17089l;

    /* renamed from: m */
    private int f17090m;

    /* renamed from: n */
    private int[] f17091n;

    /* renamed from: o */
    private int[] f17092o;

    /* renamed from: p */
    private int f17093p;

    /* renamed from: q */
    private int f17094q;

    /* renamed from: r */
    private int f17095r;

    public b() {
        this((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public b(int i10) {
        this.f17078a = 32;
        this.f17079b = 0;
        this.f17080c = null;
        this.f17081d = null;
        this.f17082e = null;
        this.f17083f = 1;
        this.f17084g = 1;
        this.f17085h = 0;
        this.f17086i = 0L;
        this.f17087j = 0;
        this.f17088k = 0;
        this.f17089l = null;
        this.f17090m = 0;
        this.f17091n = new int[16];
        this.f17092o = null;
        this.f17093p = 0;
        this.f17094q = 0;
        this.f17095r = 0;
        if (i10 < 8 || i10 > 256 || i10 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.f17078a = i10 / 8;
        d(null, null, null);
    }

    public b(b bVar) {
        this.f17078a = 32;
        this.f17079b = 0;
        this.f17080c = null;
        this.f17081d = null;
        this.f17082e = null;
        this.f17083f = 1;
        this.f17084g = 1;
        this.f17085h = 0;
        this.f17086i = 0L;
        this.f17087j = 0;
        this.f17088k = 0;
        this.f17089l = null;
        this.f17090m = 0;
        this.f17091n = new int[16];
        this.f17092o = null;
        this.f17093p = 0;
        this.f17094q = 0;
        this.f17095r = 0;
        this.f17090m = bVar.f17090m;
        this.f17089l = ak.a.h(bVar.f17089l);
        this.f17079b = bVar.f17079b;
        this.f17082e = ak.a.h(bVar.f17082e);
        this.f17078a = bVar.f17078a;
        this.f17091n = ak.a.k(this.f17091n);
        this.f17092o = ak.a.k(bVar.f17092o);
        this.f17093p = bVar.f17093p;
        this.f17094q = bVar.f17094q;
        this.f17095r = bVar.f17095r;
        this.f17080c = ak.a.h(bVar.f17080c);
        this.f17081d = ak.a.h(bVar.f17081d);
        this.f17083f = bVar.f17083f;
        this.f17084g = bVar.f17084g;
        this.f17085h = bVar.f17085h;
        this.f17086i = bVar.f17086i;
        this.f17087j = bVar.f17087j;
        this.f17088k = bVar.f17088k;
    }

    private void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        int[] iArr = this.f17091n;
        iArr[i12] = iArr[i12] + iArr[i13] + i10;
        iArr[i15] = f(iArr[i15] ^ iArr[i12], 16);
        int[] iArr2 = this.f17091n;
        iArr2[i14] = iArr2[i14] + iArr2[i15];
        iArr2[i13] = f(iArr2[i13] ^ iArr2[i14], 12);
        int[] iArr3 = this.f17091n;
        iArr3[i12] = iArr3[i12] + iArr3[i13] + i11;
        iArr3[i15] = f(iArr3[i15] ^ iArr3[i12], 8);
        int[] iArr4 = this.f17091n;
        iArr4[i14] = iArr4[i14] + iArr4[i15];
        iArr4[i13] = f(iArr4[i13] ^ iArr4[i14], 7);
    }

    private void b(byte[] bArr, int i10) {
        e();
        int[] iArr = new int[16];
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            iArr[i12] = ak.l.l(bArr, (i12 * 4) + i10);
        }
        for (int i13 = 0; i13 < 10; i13++) {
            byte[][] bArr2 = f17077t;
            a(iArr[bArr2[i13][0]], iArr[bArr2[i13][1]], 0, 4, 8, 12);
            a(iArr[bArr2[i13][2]], iArr[bArr2[i13][3]], 1, 5, 9, 13);
            a(iArr[bArr2[i13][4]], iArr[bArr2[i13][5]], 2, 6, 10, 14);
            a(iArr[bArr2[i13][6]], iArr[bArr2[i13][7]], 3, 7, 11, 15);
            a(iArr[bArr2[i13][8]], iArr[bArr2[i13][9]], 0, 5, 10, 15);
            a(iArr[bArr2[i13][10]], iArr[bArr2[i13][11]], 1, 6, 11, 12);
            a(iArr[bArr2[i13][12]], iArr[bArr2[i13][13]], 2, 7, 8, 13);
            a(iArr[bArr2[i13][14]], iArr[bArr2[i13][15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.f17092o;
            if (i11 < iArr2.length) {
                int i14 = iArr2[i11];
                int[] iArr3 = this.f17091n;
                iArr2[i11] = (i14 ^ iArr3[i11]) ^ iArr3[i11 + 8];
                i11++;
            } else {
                return;
            }
        }
    }

    private void d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f17089l = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[bArr3.length];
            this.f17082e = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.f17079b = bArr3.length;
            System.arraycopy(bArr3, 0, this.f17089l, 0, bArr3.length);
            this.f17090m = 64;
        }
        if (this.f17092o == null) {
            this.f17092o = r0;
            int[] iArr = f17076s;
            long j10 = this.f17086i;
            int[] iArr2 = {iArr[0] ^ ((this.f17078a | (this.f17079b << 8)) | ((this.f17083f << 16) | (this.f17084g << 24))), iArr[1] ^ this.f17085h, ((int) j10) ^ iArr[2], ((((int) (j10 >> 32)) | (this.f17087j << 16)) | (this.f17088k << 24)) ^ iArr[3], iArr[4], iArr[5]};
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.f17080c = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr3 = this.f17092o;
                iArr3[4] = iArr3[4] ^ ak.l.l(bArr, 0);
                int[] iArr4 = this.f17092o;
                iArr4[5] = ak.l.l(bArr, 4) ^ iArr4[5];
            }
            int[] iArr5 = this.f17092o;
            iArr5[6] = iArr[6];
            iArr5[7] = iArr[7];
            if (bArr2 == null) {
                return;
            }
            if (bArr2.length != 8) {
                throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
            }
            byte[] bArr6 = new byte[8];
            this.f17081d = bArr6;
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
            int[] iArr6 = this.f17092o;
            iArr6[6] = iArr6[6] ^ ak.l.l(bArr2, 0);
            int[] iArr7 = this.f17092o;
            iArr7[7] = ak.l.l(bArr2, 4) ^ iArr7[7];
        }
    }

    private void e() {
        int[] iArr = this.f17092o;
        System.arraycopy(iArr, 0, this.f17091n, 0, iArr.length);
        int[] iArr2 = f17076s;
        System.arraycopy(iArr2, 0, this.f17091n, this.f17092o.length, 4);
        int[] iArr3 = this.f17091n;
        iArr3[12] = this.f17093p ^ iArr2[4];
        iArr3[13] = this.f17094q ^ iArr2[5];
        iArr3[14] = this.f17095r ^ iArr2[6];
        iArr3[15] = iArr2[7];
    }

    private int f(int i10, int i11) {
        return (i10 << (32 - i11)) | (i10 >>> i11);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        int[] iArr;
        int i11;
        this.f17095r = -1;
        int i12 = this.f17093p;
        int i13 = this.f17090m;
        int i14 = i12 + i13;
        this.f17093p = i14;
        if (i14 < 0 && i13 > (-i14)) {
            this.f17094q++;
        }
        b(this.f17089l, 0);
        ak.a.y(this.f17089l, (byte) 0);
        ak.a.B(this.f17091n, 0);
        int i15 = 0;
        while (true) {
            iArr = this.f17092o;
            if (i15 >= iArr.length || (i11 = i15 * 4) >= this.f17078a) {
                break;
            }
            byte[] k10 = ak.l.k(iArr[i15]);
            int i16 = this.f17078a;
            if (i11 < i16 - 4) {
                System.arraycopy(k10, 0, bArr, i11 + i10, 4);
            } else {
                System.arraycopy(k10, 0, bArr, i10 + i11, i16 - i11);
            }
            i15++;
        }
        ak.a.B(iArr, 0);
        reset();
        return this.f17078a;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17078a;
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17090m = 0;
        this.f17095r = 0;
        this.f17093p = 0;
        this.f17094q = 0;
        this.f17092o = null;
        ak.a.y(this.f17089l, (byte) 0);
        byte[] bArr = this.f17082e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f17089l, 0, bArr.length);
            this.f17090m = 64;
        }
        d(this.f17080c, this.f17081d, this.f17082e);
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        int i10 = this.f17090m;
        if (64 - i10 != 0) {
            this.f17089l[i10] = b10;
            this.f17090m = i10 + 1;
            return;
        }
        int i11 = this.f17093p + 64;
        this.f17093p = i11;
        if (i11 == 0) {
            this.f17094q++;
        }
        b(this.f17089l, 0);
        ak.a.y(this.f17089l, (byte) 0);
        this.f17089l[0] = b10;
        this.f17090m = 1;
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null || i11 == 0) {
            return;
        }
        int i13 = this.f17090m;
        if (i13 != 0) {
            i12 = 64 - i13;
            if (i12 >= i11) {
                System.arraycopy(bArr, i10, this.f17089l, i13, i11);
                this.f17090m += i11;
            }
            System.arraycopy(bArr, i10, this.f17089l, i13, i12);
            int i14 = this.f17093p + 64;
            this.f17093p = i14;
            if (i14 == 0) {
                this.f17094q++;
            }
            b(this.f17089l, 0);
            this.f17090m = 0;
            ak.a.y(this.f17089l, (byte) 0);
        } else {
            i12 = 0;
        }
        int i15 = i11 + i10;
        int i16 = i15 - 64;
        int i17 = i10 + i12;
        while (i17 < i16) {
            int i18 = this.f17093p + 64;
            this.f17093p = i18;
            if (i18 == 0) {
                this.f17094q++;
            }
            b(bArr, i17);
            i17 += 64;
        }
        i11 = i15 - i17;
        System.arraycopy(bArr, i17, this.f17089l, 0, i11);
        this.f17090m += i11;
    }
}
