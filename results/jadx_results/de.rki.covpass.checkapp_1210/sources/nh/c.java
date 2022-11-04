package nh;
/* loaded from: classes3.dex */
public class c implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: k */
    private static final byte[] f17105k = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, -68, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};

    /* renamed from: l */
    private static final byte[] f17106l = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, -68, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, -64, 41, -41};

    /* renamed from: m */
    private static final byte[] f17107m = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, Byte.MIN_VALUE, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, -68, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* renamed from: n */
    private static final byte[] f17108n = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, -68, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};

    /* renamed from: a */
    private int f17109a;

    /* renamed from: b */
    private int f17110b;

    /* renamed from: c */
    private int f17111c;

    /* renamed from: d */
    private int f17112d;

    /* renamed from: e */
    private long[] f17113e;

    /* renamed from: f */
    private long[] f17114f;

    /* renamed from: g */
    private long[] f17115g;

    /* renamed from: h */
    private long f17116h;

    /* renamed from: i */
    private int f17117i;

    /* renamed from: j */
    private byte[] f17118j;

    public c(int i10) {
        int i11;
        if (i10 == 256 || i10 == 384 || i10 == 512) {
            this.f17109a = i10 >>> 3;
            if (i10 > 256) {
                this.f17111c = 16;
                i11 = 14;
            } else {
                this.f17111c = 8;
                i11 = 10;
            }
            this.f17112d = i11;
            int i12 = this.f17111c;
            int i13 = i12 << 3;
            this.f17110b = i13;
            long[] jArr = new long[i12];
            this.f17113e = jArr;
            jArr[0] = i13;
            this.f17114f = new long[i12];
            this.f17115g = new long[i12];
            this.f17118j = new byte[i13];
            return;
        }
        throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
    }

    public c(c cVar) {
        f(cVar);
    }

    private void d(long[] jArr) {
        for (int i10 = 0; i10 < this.f17112d; i10++) {
            long j10 = i10;
            for (int i11 = 0; i11 < this.f17111c; i11++) {
                jArr[i11] = jArr[i11] ^ j10;
                j10 += 16;
            }
            k(jArr);
            l(jArr);
            h(jArr);
        }
    }

    private void e(long[] jArr) {
        for (int i10 = 0; i10 < this.f17112d; i10++) {
            long j10 = ((((this.f17111c - 1) << 4) ^ i10) << 56) | 67818912035696883L;
            for (int i11 = 0; i11 < this.f17111c; i11++) {
                jArr[i11] = jArr[i11] + j10;
                j10 -= 1152921504606846976L;
            }
            k(jArr);
            l(jArr);
            h(jArr);
        }
    }

    private void f(c cVar) {
        this.f17109a = cVar.f17109a;
        this.f17110b = cVar.f17110b;
        this.f17112d = cVar.f17112d;
        int i10 = this.f17111c;
        if (i10 <= 0 || i10 != cVar.f17111c) {
            this.f17111c = cVar.f17111c;
            this.f17113e = ak.a.l(cVar.f17113e);
            int i11 = this.f17111c;
            this.f17114f = new long[i11];
            this.f17115g = new long[i11];
            this.f17118j = ak.a.h(cVar.f17118j);
        } else {
            System.arraycopy(cVar.f17113e, 0, this.f17113e, 0, i10);
            System.arraycopy(cVar.f17118j, 0, this.f17118j, 0, this.f17110b);
        }
        this.f17116h = cVar.f17116h;
        this.f17117i = cVar.f17117i;
    }

    private static long g(long j10) {
        long j11 = ((9187201950435737471L & j10) << 1) ^ (((j10 & (-9187201950435737472L)) >>> 7) * 29);
        long j12 = j(8, j10) ^ j10;
        long j13 = (j12 ^ j(16, j12)) ^ j(48, j10);
        long j14 = (j10 ^ j13) ^ j11;
        long j15 = (((-9187201950435737472L) & j14) >>> 6) * 29;
        return ((j(32, (((j14 & 4629771061636907072L) >>> 6) * 29) ^ (j15 ^ ((4557430888798830399L & j14) << 2))) ^ j13) ^ j(40, j11)) ^ j(48, j11);
    }

    private void h(long[] jArr) {
        for (int i10 = 0; i10 < this.f17111c; i10++) {
            jArr[i10] = g(jArr[i10]);
        }
    }

    private void i(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.f17111c; i11++) {
            long p10 = ak.l.p(bArr, i10);
            i10 += 8;
            this.f17114f[i11] = this.f17113e[i11] ^ p10;
            this.f17115g[i11] = p10;
        }
        d(this.f17114f);
        e(this.f17115g);
        for (int i12 = 0; i12 < this.f17111c; i12++) {
            long[] jArr = this.f17113e;
            jArr[i12] = jArr[i12] ^ (this.f17114f[i12] ^ this.f17115g[i12]);
        }
    }

    private static long j(int i10, long j10) {
        return (j10 << (-i10)) | (j10 >>> i10);
    }

    private void k(long[] jArr) {
        int i10 = this.f17111c;
        if (i10 == 8) {
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = (j10 ^ j14) & (-4294967296L);
            long j19 = j10 ^ j18;
            long j20 = j14 ^ j18;
            long j21 = (j11 ^ j15) & 72057594021150720L;
            long j22 = j11 ^ j21;
            long j23 = j15 ^ j21;
            long j24 = (j12 ^ j16) & 281474976645120L;
            long j25 = j12 ^ j24;
            long j26 = j16 ^ j24;
            long j27 = (j13 ^ j17) & 1099511627520L;
            long j28 = j13 ^ j27;
            long j29 = j17 ^ j27;
            long j30 = (j19 ^ j25) & (-281470681808896L);
            long j31 = j19 ^ j30;
            long j32 = j25 ^ j30;
            long j33 = (j22 ^ j28) & 72056494543077120L;
            long j34 = j22 ^ j33;
            long j35 = j28 ^ j33;
            long j36 = (j20 ^ j26) & (-281470681808896L);
            long j37 = j20 ^ j36;
            long j38 = j26 ^ j36;
            long j39 = (j23 ^ j29) & 72056494543077120L;
            long j40 = j23 ^ j39;
            long j41 = j29 ^ j39;
            long j42 = (j31 ^ j34) & (-71777214294589696L);
            long j43 = j31 ^ j42;
            long j44 = j34 ^ j42;
            long j45 = (j32 ^ j35) & (-71777214294589696L);
            long j46 = j32 ^ j45;
            long j47 = j35 ^ j45;
            long j48 = (j37 ^ j40) & (-71777214294589696L);
            long j49 = (j38 ^ j41) & (-71777214294589696L);
            jArr[0] = j43;
            jArr[1] = j44;
            jArr[2] = j46;
            jArr[3] = j47;
            jArr[4] = j37 ^ j48;
            jArr[5] = j40 ^ j48;
            jArr[6] = j38 ^ j49;
            jArr[7] = j41 ^ j49;
        } else if (i10 != 16) {
            throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        } else {
            long j50 = jArr[0];
            long j51 = jArr[1];
            long j52 = jArr[2];
            long j53 = jArr[3];
            long j54 = jArr[4];
            long j55 = jArr[5];
            long j56 = jArr[6];
            long j57 = jArr[7];
            long j58 = jArr[8];
            long j59 = jArr[9];
            long j60 = jArr[10];
            long j61 = jArr[11];
            long j62 = jArr[12];
            long j63 = jArr[13];
            long j64 = jArr[14];
            long j65 = jArr[15];
            long j66 = (j50 ^ j58) & (-72057594037927936L);
            long j67 = j50 ^ j66;
            long j68 = j58 ^ j66;
            long j69 = (j51 ^ j59) & (-72057594037927936L);
            long j70 = j51 ^ j69;
            long j71 = j59 ^ j69;
            long j72 = (j52 ^ j60) & (-281474976710656L);
            long j73 = j52 ^ j72;
            long j74 = j60 ^ j72;
            long j75 = (j53 ^ j61) & (-1099511627776L);
            long j76 = j53 ^ j75;
            long j77 = j61 ^ j75;
            long j78 = (j54 ^ j62) & (-4294967296L);
            long j79 = j54 ^ j78;
            long j80 = j62 ^ j78;
            long j81 = (j55 ^ j63) & 72057594021150720L;
            long j82 = j55 ^ j81;
            long j83 = j63 ^ j81;
            long j84 = (j56 ^ j64) & 72057594037862400L;
            long j85 = j56 ^ j84;
            long j86 = j64 ^ j84;
            long j87 = (j57 ^ j65) & 72057594037927680L;
            long j88 = j57 ^ j87;
            long j89 = j65 ^ j87;
            long j90 = (j67 ^ j79) & 72057589742960640L;
            long j91 = j67 ^ j90;
            long j92 = j79 ^ j90;
            long j93 = (j70 ^ j82) & (-16777216);
            long j94 = j70 ^ j93;
            long j95 = j82 ^ j93;
            long j96 = (j73 ^ j85) & (-71776119061282816L);
            long j97 = j73 ^ j96;
            long j98 = j85 ^ j96;
            long j99 = (j76 ^ j88) & (-72056494526300416L);
            long j100 = j76 ^ j99;
            long j101 = j88 ^ j99;
            long j102 = (j68 ^ j80) & 72057589742960640L;
            long j103 = j68 ^ j102;
            long j104 = j80 ^ j102;
            long j105 = (j71 ^ j83) & (-16777216);
            long j106 = j71 ^ j105;
            long j107 = j83 ^ j105;
            long j108 = (j74 ^ j86) & (-71776119061282816L);
            long j109 = j74 ^ j108;
            long j110 = j86 ^ j108;
            long j111 = (j77 ^ j89) & (-72056494526300416L);
            long j112 = j77 ^ j111;
            long j113 = j89 ^ j111;
            long j114 = (j91 ^ j97) & (-281470681808896L);
            long j115 = j91 ^ j114;
            long j116 = j97 ^ j114;
            long j117 = (j94 ^ j100) & 72056494543077120L;
            long j118 = j94 ^ j117;
            long j119 = j100 ^ j117;
            long j120 = (j92 ^ j98) & (-281470681808896L);
            long j121 = j92 ^ j120;
            long j122 = j98 ^ j120;
            long j123 = (j95 ^ j101) & 72056494543077120L;
            long j124 = j95 ^ j123;
            long j125 = j101 ^ j123;
            long j126 = (j103 ^ j109) & (-281470681808896L);
            long j127 = j103 ^ j126;
            long j128 = j109 ^ j126;
            long j129 = (j106 ^ j112) & 72056494543077120L;
            long j130 = j106 ^ j129;
            long j131 = j112 ^ j129;
            long j132 = (j104 ^ j110) & (-281470681808896L);
            long j133 = j104 ^ j132;
            long j134 = j110 ^ j132;
            long j135 = (j107 ^ j113) & 72056494543077120L;
            long j136 = j107 ^ j135;
            long j137 = j113 ^ j135;
            long j138 = (j115 ^ j118) & (-71777214294589696L);
            long j139 = j115 ^ j138;
            long j140 = j118 ^ j138;
            long j141 = (j116 ^ j119) & (-71777214294589696L);
            long j142 = j116 ^ j141;
            long j143 = j119 ^ j141;
            long j144 = (j121 ^ j124) & (-71777214294589696L);
            long j145 = j121 ^ j144;
            long j146 = j124 ^ j144;
            long j147 = (j122 ^ j125) & (-71777214294589696L);
            long j148 = j122 ^ j147;
            long j149 = j125 ^ j147;
            long j150 = (j127 ^ j130) & (-71777214294589696L);
            long j151 = j127 ^ j150;
            long j152 = j130 ^ j150;
            long j153 = (j128 ^ j131) & (-71777214294589696L);
            long j154 = j128 ^ j153;
            long j155 = j131 ^ j153;
            long j156 = (j133 ^ j136) & (-71777214294589696L);
            long j157 = (j134 ^ j137) & (-71777214294589696L);
            jArr[0] = j139;
            jArr[1] = j140;
            jArr[2] = j142;
            jArr[3] = j143;
            jArr[4] = j145;
            jArr[5] = j146;
            jArr[6] = j148;
            jArr[7] = j149;
            jArr[8] = j151;
            jArr[9] = j152;
            jArr[10] = j154;
            jArr[11] = j155;
            jArr[12] = j133 ^ j156;
            jArr[13] = j136 ^ j156;
            jArr[14] = j134 ^ j157;
            jArr[15] = j137 ^ j157;
        }
    }

    private void l(long[] jArr) {
        for (int i10 = 0; i10 < this.f17111c; i10++) {
            long j10 = jArr[i10];
            int i11 = (int) j10;
            int i12 = (int) (j10 >>> 32);
            byte[] bArr = f17105k;
            byte b10 = bArr[i11 & 255];
            byte[] bArr2 = f17106l;
            byte b11 = bArr2[(i11 >>> 8) & 255];
            byte[] bArr3 = f17107m;
            byte b12 = bArr3[(i11 >>> 16) & 255];
            byte[] bArr4 = f17108n;
            int i13 = (bArr4[i11 >>> 24] << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i12 & 255];
            byte b14 = bArr2[(i12 >>> 8) & 255];
            byte b15 = bArr3[(i12 >>> 16) & 255];
            jArr[i10] = (i13 & 4294967295L) | (((bArr4[i12 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16))) << 32);
        }
    }

    @Override // ak.i
    public ak.i a() {
        return new c(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        f((c) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13 = this.f17117i;
        byte[] bArr2 = this.f17118j;
        int i14 = i13 + 1;
        this.f17117i = i14;
        bArr2[i13] = Byte.MIN_VALUE;
        int i15 = this.f17110b - 12;
        int i16 = 0;
        if (i14 > i15) {
            while (true) {
                int i17 = this.f17117i;
                if (i17 >= this.f17110b) {
                    break;
                }
                byte[] bArr3 = this.f17118j;
                this.f17117i = i17 + 1;
                bArr3[i17] = 0;
            }
            this.f17117i = 0;
            i(this.f17118j, 0);
        }
        while (true) {
            i11 = this.f17117i;
            if (i11 >= i15) {
                break;
            }
            byte[] bArr4 = this.f17118j;
            this.f17117i = i11 + 1;
            bArr4[i11] = 0;
        }
        long j10 = (((this.f17116h & 4294967295L) * this.f17110b) + i13) << 3;
        ak.l.i((int) j10, this.f17118j, i11);
        int i18 = this.f17117i + 4;
        this.f17117i = i18;
        ak.l.v((j10 >>> 32) + (((this.f17116h >>> 32) * this.f17110b) << 3), this.f17118j, i18);
        i(this.f17118j, 0);
        System.arraycopy(this.f17113e, 0, this.f17114f, 0, this.f17111c);
        d(this.f17114f);
        while (true) {
            i12 = this.f17111c;
            if (i16 >= i12) {
                break;
            }
            long[] jArr = this.f17113e;
            jArr[i16] = jArr[i16] ^ this.f17114f[i16];
            i16++;
        }
        for (int i19 = i12 - (this.f17109a >>> 3); i19 < this.f17111c; i19++) {
            ak.l.v(this.f17113e[i19], bArr, i10);
            i10 += 8;
        }
        reset();
        return this.f17109a;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return this.f17110b;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17109a;
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        ak.a.C(this.f17113e, 0L);
        this.f17113e[0] = this.f17110b;
        this.f17116h = 0L;
        this.f17117i = 0;
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        byte[] bArr = this.f17118j;
        int i10 = this.f17117i;
        int i11 = i10 + 1;
        this.f17117i = i11;
        bArr[i10] = b10;
        if (i11 == this.f17110b) {
            i(bArr, 0);
            this.f17117i = 0;
            this.f17116h++;
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f17117i != 0 && i11 > 0) {
            update(bArr[i10]);
            i11--;
            i10++;
        }
        if (i11 > 0) {
            while (i11 >= this.f17110b) {
                i(bArr, i10);
                int i12 = this.f17110b;
                i10 += i12;
                i11 -= i12;
                this.f17116h++;
            }
            while (i11 > 0) {
                update(bArr[i10]);
                i11--;
                i10++;
            }
        }
    }
}
