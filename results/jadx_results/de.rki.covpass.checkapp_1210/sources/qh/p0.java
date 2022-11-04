package qh;

import java.lang.reflect.Array;
/* loaded from: classes3.dex */
public class p0 implements org.bouncycastle.crypto.e {

    /* renamed from: m */
    private static final byte[] f20098m = {0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, -32, 14, 52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, 33, 15, -31, 36, 18, -16, -126, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 61, -70, 43, 121, 10, 21, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, -53, 95, -80, -100, -87, 81, -96, Byte.MAX_VALUE, 12, -10, 111, 23, -60, 73, -20, -40, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, -68, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, 13, 99, -116, Byte.MIN_VALUE, -64, -9, 112, 7};

    /* renamed from: n */
    private static final byte[] f20099n = {0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1};

    /* renamed from: o */
    private static final byte[] f20100o = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: p */
    private static final byte[] f20101p = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};

    /* renamed from: q */
    private static final int[] f20102q = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, e.j.L0, 250, 239, 197, 145};

    /* renamed from: r */
    static byte[][] f20103r = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};

    /* renamed from: s */
    static byte[][] f20104s = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};

    /* renamed from: a */
    private int f20105a;

    /* renamed from: b */
    private long f20106b;

    /* renamed from: c */
    private int f20107c;

    /* renamed from: d */
    private int f20108d;

    /* renamed from: e */
    private long[][] f20109e;

    /* renamed from: f */
    private long f20110f;

    /* renamed from: g */
    private long f20111g;

    /* renamed from: h */
    private long f20112h;

    /* renamed from: i */
    private long f20113i;

    /* renamed from: j */
    private boolean f20114j;

    /* renamed from: k */
    private byte[] f20115k;

    /* renamed from: l */
    private byte[] f20116l;

    public p0() {
        this(128);
    }

    public p0(int i10) {
        if (i10 == 128) {
            this.f20105a = 32;
            this.f20106b = 4294967295L;
            this.f20115k = f20103r[0];
            this.f20116l = f20104s[0];
        } else if (i10 == 160) {
            this.f20105a = 40;
            this.f20106b = 1099511627775L;
            this.f20115k = f20103r[1];
            this.f20116l = f20104s[1];
        } else if (i10 == 192) {
            this.f20105a = 48;
            this.f20106b = 281474976710655L;
            this.f20115k = f20103r[2];
            this.f20116l = f20104s[2];
        } else if (i10 == 224) {
            this.f20105a = 56;
            this.f20106b = 72057594037927935L;
            this.f20115k = f20103r[3];
            this.f20116l = f20104s[3];
        } else if (i10 != 256) {
            throw new IllegalArgumentException("unknown blocksize to Rijndael");
        } else {
            this.f20105a = 64;
            this.f20106b = -1L;
            this.f20115k = f20103r[4];
            this.f20116l = f20104s[4];
        }
        this.f20108d = i10;
    }

    private void c() {
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        for (int i10 = 0; i10 < this.f20105a; i10 += 8) {
            int i11 = (int) ((this.f20110f >> i10) & 255);
            int i12 = (int) ((this.f20111g >> i10) & 255);
            int i13 = (int) ((this.f20112h >> i10) & 255);
            long j14 = j12;
            int i14 = (int) ((this.f20113i >> i10) & 255);
            int i15 = -1;
            int i16 = i11 != 0 ? f20098m[i11 & 255] & 255 : -1;
            int i17 = i12 != 0 ? f20098m[i12 & 255] & 255 : -1;
            int i18 = i13 != 0 ? f20098m[i13 & 255] & 255 : -1;
            if (i14 != 0) {
                i15 = f20098m[i14 & 255] & 255;
            }
            j10 |= ((((q(i16) ^ o(i17)) ^ p(i18)) ^ n(i15)) & 255) << i10;
            j13 |= ((((q(i17) ^ o(i18)) ^ p(i15)) ^ n(i16)) & 255) << i10;
            j11 |= ((((q(i18) ^ o(i15)) ^ p(i16)) ^ n(i17)) & 255) << i10;
            j12 = (((((q(i15) ^ o(i16)) ^ p(i17)) ^ n(i18)) & 255) << i10) | j14;
        }
        this.f20110f = j10;
        this.f20111g = j13;
        this.f20112h = j11;
        this.f20113i = j12;
    }

    private void d(long[] jArr) {
        this.f20110f ^= jArr[0];
        this.f20111g ^= jArr[1];
        this.f20112h ^= jArr[2];
        this.f20113i ^= jArr[3];
    }

    private void e() {
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        for (int i10 = 0; i10 < this.f20105a; i10 += 8) {
            int i11 = (int) ((this.f20110f >> i10) & 255);
            int i12 = (int) ((this.f20111g >> i10) & 255);
            int i13 = (int) ((this.f20112h >> i10) & 255);
            long j14 = j12;
            int i14 = (int) ((this.f20113i >> i10) & 255);
            j10 |= ((((l(i11) ^ m(i12)) ^ i13) ^ i14) & 255) << i10;
            j13 |= ((((l(i12) ^ m(i13)) ^ i14) ^ i11) & 255) << i10;
            j11 |= ((((l(i13) ^ m(i14)) ^ i11) ^ i12) & 255) << i10;
            j12 = (((((l(i14) ^ m(i11)) ^ i12) ^ i13) & 255) << i10) | j14;
        }
        this.f20110f = j10;
        this.f20111g = j13;
        this.f20112h = j11;
        this.f20113i = j12;
    }

    private void f(byte[] bArr) {
        this.f20111g = s(this.f20111g, bArr[1]);
        this.f20112h = s(this.f20112h, bArr[2]);
        this.f20113i = s(this.f20113i, bArr[3]);
    }

    private void g(byte[] bArr) {
        this.f20110f = h(this.f20110f, bArr);
        this.f20111g = h(this.f20111g, bArr);
        this.f20112h = h(this.f20112h, bArr);
        this.f20113i = h(this.f20113i, bArr);
    }

    private long h(long j10, byte[] bArr) {
        long j11 = 0;
        for (int i10 = 0; i10 < this.f20105a; i10 += 8) {
            j11 |= (bArr[(int) ((j10 >> i10) & 255)] & 255) << i10;
        }
        return j11;
    }

    private void i(long[][] jArr) {
        d(jArr[this.f20107c]);
        g(f20101p);
        f(this.f20116l);
        for (int i10 = this.f20107c - 1; i10 > 0; i10--) {
            d(jArr[i10]);
            c();
            g(f20101p);
            f(this.f20116l);
        }
        d(jArr[0]);
    }

    private void j(long[][] jArr) {
        d(jArr[0]);
        for (int i10 = 1; i10 < this.f20107c; i10++) {
            g(f20100o);
            f(this.f20115k);
            e();
            d(jArr[i10]);
        }
        g(f20100o);
        f(this.f20115k);
        d(jArr[this.f20107c]);
    }

    private long[][] k(byte[] bArr) {
        int i10;
        int i11;
        int i12 = 8;
        int length = bArr.length * 8;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance(long.class, 15, 4);
        int i13 = 4;
        if (length == 128) {
            i10 = 4;
        } else if (length == 160) {
            i10 = 5;
        } else if (length == 192) {
            i10 = 6;
        } else if (length == 224) {
            i10 = 7;
        } else if (length != 256) {
            throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
        } else {
            i10 = 8;
        }
        this.f20107c = length >= this.f20108d ? i10 + 6 : (this.f20105a / 8) + 6;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < bArr.length) {
            bArr2[i15 % 4][i15 / 4] = bArr[i16];
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i10 && i18 < (this.f20107c + 1) * (this.f20105a / 8)) {
            int i19 = 0;
            while (i19 < i13) {
                int i20 = this.f20105a;
                long[] jArr2 = jArr[i18 / (i20 / 8)];
                jArr2[i19] = ((bArr2[i19][i17] & 255) << ((i18 * 8) % i20)) | jArr2[i19];
                i19++;
                i13 = 4;
            }
            i17++;
            i18++;
            i13 = 4;
        }
        int i21 = 0;
        while (i18 < (this.f20107c + 1) * (this.f20105a / i12)) {
            int i22 = i14;
            while (i22 < 4) {
                byte[] bArr3 = bArr2[i22];
                i22++;
                bArr3[i14] = (byte) (bArr3[i14] ^ f20100o[bArr2[i22 % 4][i10 - 1] & 255]);
            }
            byte[] bArr4 = bArr2[i14];
            int i23 = i21 + 1;
            bArr4[i14] = (byte) (f20102q[i21] ^ bArr4[i14]);
            int i24 = 1;
            if (i10 <= 6) {
                while (i24 < i10) {
                    for (int i25 = i14; i25 < 4; i25++) {
                        byte[] bArr5 = bArr2[i25];
                        bArr5[i24] = (byte) (bArr5[i24] ^ bArr2[i25][i24 - 1]);
                    }
                    i24++;
                }
            } else {
                while (true) {
                    i11 = 4;
                    if (i24 >= 4) {
                        break;
                    }
                    int i26 = i14;
                    while (i26 < i11) {
                        byte[] bArr6 = bArr2[i26];
                        bArr6[i24] = (byte) (bArr6[i24] ^ bArr2[i26][i24 - 1]);
                        i26++;
                        i11 = 4;
                    }
                    i24++;
                }
                for (int i27 = i14; i27 < 4; i27++) {
                    byte[] bArr7 = bArr2[i27];
                    bArr7[4] = (byte) (bArr7[4] ^ f20100o[bArr2[i27][3] & 255]);
                }
                int i28 = 5;
                while (i28 < i10) {
                    int i29 = i14;
                    while (i29 < i11) {
                        byte[] bArr8 = bArr2[i29];
                        bArr8[i28] = (byte) (bArr8[i28] ^ bArr2[i29][i28 - 1]);
                        i29++;
                        i11 = 4;
                    }
                    i28++;
                    i11 = 4;
                }
            }
            int i30 = i14;
            while (i30 < i10 && i18 < (this.f20107c + 1) * (this.f20105a / i12)) {
                for (int i31 = i14; i31 < 4; i31++) {
                    int i32 = this.f20105a;
                    long[] jArr3 = jArr[i18 / (i32 / 8)];
                    jArr3[i31] = ((bArr2[i31][i30] & 255) << ((i18 * 8) % i32)) | jArr3[i31];
                }
                i30++;
                i18++;
                i14 = 0;
                i12 = 8;
            }
            i21 = i23;
            i14 = 0;
            i12 = 8;
        }
        return jArr;
    }

    private byte l(int i10) {
        if (i10 != 0) {
            return f20099n[(f20098m[i10] & 255) + 25];
        }
        return (byte) 0;
    }

    private byte m(int i10) {
        if (i10 != 0) {
            return f20099n[(f20098m[i10] & 255) + 1];
        }
        return (byte) 0;
    }

    private byte n(int i10) {
        if (i10 >= 0) {
            return f20099n[i10 + 199];
        }
        return (byte) 0;
    }

    private byte o(int i10) {
        if (i10 >= 0) {
            return f20099n[i10 + 104];
        }
        return (byte) 0;
    }

    private byte p(int i10) {
        if (i10 >= 0) {
            return f20099n[i10 + 238];
        }
        return (byte) 0;
    }

    private byte q(int i10) {
        if (i10 >= 0) {
            return f20099n[i10 + 223];
        }
        return (byte) 0;
    }

    private void r(byte[] bArr, int i10) {
        for (int i11 = 0; i11 != this.f20105a; i11 += 8) {
            int i12 = i10 + 1;
            bArr[i10] = (byte) (this.f20110f >> i11);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (this.f20111g >> i11);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (this.f20112h >> i11);
            i10 = i14 + 1;
            bArr[i14] = (byte) (this.f20113i >> i11);
        }
    }

    private long s(long j10, int i10) {
        return ((j10 << (this.f20105a - i10)) | (j10 >>> i10)) & this.f20106b;
    }

    private void t(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f20110f = bArr[i10] & 255;
        this.f20111g = bArr[i11] & 255;
        this.f20112h = bArr[i12] & 255;
        int i17 = i10 + 1 + 1 + 1 + 1;
        this.f20113i = bArr[i13] & 255;
        for (int i18 = 8; i18 != this.f20105a; i18 += 8) {
            this.f20110f |= (bArr[i17] & 255) << i18;
            this.f20111g |= (bArr[i14] & 255) << i18;
            this.f20112h |= (bArr[i15] & 255) << i18;
            i17 = i17 + 1 + 1 + 1 + 1;
            this.f20113i |= (bArr[i16] & 255) << i18;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f20109e != null) {
            int i12 = this.f20105a;
            if ((i12 / 2) + i10 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if ((i12 / 2) + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            boolean z10 = this.f20114j;
            t(bArr, i10);
            long[][] jArr = this.f20109e;
            if (z10) {
                j(jArr);
            } else {
                i(jArr);
            }
            r(bArr2, i11);
            return this.f20105a / 2;
        }
        throw new IllegalStateException("Rijndael engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f20105a / 2;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20109e = k(((zh.b1) iVar).a());
            this.f20114j = z10;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
