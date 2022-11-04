package nh;
/* loaded from: classes3.dex */
public class a implements org.bouncycastle.crypto.t {

    /* renamed from: m */
    private static final long[] f17061m = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* renamed from: n */
    private static final byte[][] f17062n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* renamed from: o */
    private static int f17063o = 12;

    /* renamed from: a */
    private int f17064a;

    /* renamed from: b */
    private int f17065b;

    /* renamed from: c */
    private byte[] f17066c;

    /* renamed from: d */
    private byte[] f17067d;

    /* renamed from: e */
    private byte[] f17068e;

    /* renamed from: f */
    private byte[] f17069f;

    /* renamed from: g */
    private int f17070g;

    /* renamed from: h */
    private long[] f17071h;

    /* renamed from: i */
    private long[] f17072i;

    /* renamed from: j */
    private long f17073j;

    /* renamed from: k */
    private long f17074k;

    /* renamed from: l */
    private long f17075l;

    public a() {
        this(512);
    }

    public a(int i10) {
        this.f17064a = 64;
        this.f17065b = 0;
        this.f17066c = null;
        this.f17067d = null;
        this.f17068e = null;
        this.f17069f = null;
        this.f17070g = 0;
        this.f17071h = new long[16];
        this.f17072i = null;
        this.f17073j = 0L;
        this.f17074k = 0L;
        this.f17075l = 0L;
        if (i10 < 8 || i10 > 512 || i10 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f17069f = new byte[128];
        this.f17065b = 0;
        this.f17064a = i10 / 8;
        d();
    }

    public a(a aVar) {
        this.f17064a = 64;
        this.f17065b = 0;
        this.f17066c = null;
        this.f17067d = null;
        this.f17068e = null;
        this.f17069f = null;
        this.f17070g = 0;
        this.f17071h = new long[16];
        this.f17072i = null;
        this.f17073j = 0L;
        this.f17074k = 0L;
        this.f17075l = 0L;
        this.f17070g = aVar.f17070g;
        this.f17069f = ak.a.h(aVar.f17069f);
        this.f17065b = aVar.f17065b;
        this.f17068e = ak.a.h(aVar.f17068e);
        this.f17064a = aVar.f17064a;
        this.f17072i = ak.a.l(aVar.f17072i);
        this.f17067d = ak.a.h(aVar.f17067d);
        this.f17066c = ak.a.h(aVar.f17066c);
        this.f17073j = aVar.f17073j;
        this.f17074k = aVar.f17074k;
        this.f17075l = aVar.f17075l;
    }

    private void a(long j10, long j11, int i10, int i11, int i12, int i13) {
        long[] jArr = this.f17071h;
        jArr[i10] = jArr[i10] + jArr[i11] + j10;
        jArr[i13] = ak.h.b(jArr[i13] ^ jArr[i10], 32);
        long[] jArr2 = this.f17071h;
        jArr2[i12] = jArr2[i12] + jArr2[i13];
        jArr2[i11] = ak.h.b(jArr2[i11] ^ jArr2[i12], 24);
        long[] jArr3 = this.f17071h;
        jArr3[i10] = jArr3[i10] + jArr3[i11] + j11;
        jArr3[i13] = ak.h.b(jArr3[i13] ^ jArr3[i10], 16);
        long[] jArr4 = this.f17071h;
        jArr4[i12] = jArr4[i12] + jArr4[i13];
        jArr4[i11] = ak.h.b(jArr4[i11] ^ jArr4[i12], 63);
    }

    private void b(byte[] bArr, int i10) {
        e();
        long[] jArr = new long[16];
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            jArr[i12] = ak.l.p(bArr, (i12 * 8) + i10);
        }
        for (int i13 = 0; i13 < f17063o; i13++) {
            byte[][] bArr2 = f17062n;
            a(jArr[bArr2[i13][0]], jArr[bArr2[i13][1]], 0, 4, 8, 12);
            a(jArr[bArr2[i13][2]], jArr[bArr2[i13][3]], 1, 5, 9, 13);
            a(jArr[bArr2[i13][4]], jArr[bArr2[i13][5]], 2, 6, 10, 14);
            a(jArr[bArr2[i13][6]], jArr[bArr2[i13][7]], 3, 7, 11, 15);
            a(jArr[bArr2[i13][8]], jArr[bArr2[i13][9]], 0, 5, 10, 15);
            a(jArr[bArr2[i13][10]], jArr[bArr2[i13][11]], 1, 6, 11, 12);
            a(jArr[bArr2[i13][12]], jArr[bArr2[i13][13]], 2, 7, 8, 13);
            a(jArr[bArr2[i13][14]], jArr[bArr2[i13][15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.f17072i;
            if (i11 < jArr2.length) {
                long j10 = jArr2[i11];
                long[] jArr3 = this.f17071h;
                jArr2[i11] = (j10 ^ jArr3[i11]) ^ jArr3[i11 + 8];
                i11++;
            } else {
                return;
            }
        }
    }

    private void d() {
        if (this.f17072i == null) {
            this.f17072i = r1;
            long[] jArr = f17061m;
            long[] jArr2 = {jArr[0] ^ ((this.f17064a | (this.f17065b << 8)) | 16842752), jArr[1], jArr[2], jArr[3], jArr[4], jArr[5]};
            byte[] bArr = this.f17066c;
            if (bArr != null) {
                jArr2[4] = jArr2[4] ^ ak.l.p(bArr, 0);
                long[] jArr3 = this.f17072i;
                jArr3[5] = jArr3[5] ^ ak.l.p(this.f17066c, 8);
            }
            long[] jArr4 = this.f17072i;
            jArr4[6] = jArr[6];
            jArr4[7] = jArr[7];
            byte[] bArr2 = this.f17067d;
            if (bArr2 == null) {
                return;
            }
            jArr4[6] = ak.l.p(bArr2, 0) ^ jArr4[6];
            long[] jArr5 = this.f17072i;
            jArr5[7] = jArr5[7] ^ ak.l.p(this.f17067d, 8);
        }
    }

    private void e() {
        long[] jArr = this.f17072i;
        System.arraycopy(jArr, 0, this.f17071h, 0, jArr.length);
        long[] jArr2 = f17061m;
        System.arraycopy(jArr2, 0, this.f17071h, this.f17072i.length, 4);
        long[] jArr3 = this.f17071h;
        jArr3[12] = this.f17073j ^ jArr2[4];
        jArr3[13] = this.f17074k ^ jArr2[5];
        jArr3[14] = this.f17075l ^ jArr2[6];
        jArr3[15] = jArr2[7];
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        long[] jArr;
        int i11;
        this.f17075l = -1L;
        long j10 = this.f17073j;
        int i12 = this.f17070g;
        long j11 = j10 + i12;
        this.f17073j = j11;
        if (i12 > 0 && j11 == 0) {
            this.f17074k++;
        }
        b(this.f17069f, 0);
        ak.a.y(this.f17069f, (byte) 0);
        ak.a.C(this.f17071h, 0L);
        int i13 = 0;
        while (true) {
            jArr = this.f17072i;
            if (i13 >= jArr.length || (i11 = i13 * 8) >= this.f17064a) {
                break;
            }
            byte[] y10 = ak.l.y(jArr[i13]);
            int i14 = this.f17064a;
            if (i11 < i14 - 8) {
                System.arraycopy(y10, 0, bArr, i11 + i10, 8);
            } else {
                System.arraycopy(y10, 0, bArr, i10 + i11, i14 - i11);
            }
            i13++;
        }
        ak.a.C(jArr, 0L);
        reset();
        return this.f17064a;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 128;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17064a;
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17070g = 0;
        this.f17075l = 0L;
        this.f17073j = 0L;
        this.f17074k = 0L;
        this.f17072i = null;
        ak.a.y(this.f17069f, (byte) 0);
        byte[] bArr = this.f17068e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f17069f, 0, bArr.length);
            this.f17070g = 128;
        }
        d();
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        int i10 = this.f17070g;
        if (128 - i10 != 0) {
            this.f17069f[i10] = b10;
            this.f17070g = i10 + 1;
            return;
        }
        long j10 = this.f17073j + 128;
        this.f17073j = j10;
        if (j10 == 0) {
            this.f17074k++;
        }
        b(this.f17069f, 0);
        ak.a.y(this.f17069f, (byte) 0);
        this.f17069f[0] = b10;
        this.f17070g = 1;
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null || i11 == 0) {
            return;
        }
        int i13 = this.f17070g;
        if (i13 != 0) {
            i12 = 128 - i13;
            if (i12 >= i11) {
                System.arraycopy(bArr, i10, this.f17069f, i13, i11);
                this.f17070g += i11;
            }
            System.arraycopy(bArr, i10, this.f17069f, i13, i12);
            long j10 = this.f17073j + 128;
            this.f17073j = j10;
            if (j10 == 0) {
                this.f17074k++;
            }
            b(this.f17069f, 0);
            this.f17070g = 0;
            ak.a.y(this.f17069f, (byte) 0);
        } else {
            i12 = 0;
        }
        int i14 = i11 + i10;
        int i15 = i14 - 128;
        int i16 = i10 + i12;
        while (i16 < i15) {
            long j11 = this.f17073j + 128;
            this.f17073j = j11;
            if (j11 == 0) {
                this.f17074k++;
            }
            b(bArr, i16);
            i16 += 128;
        }
        i11 = i14 - i16;
        System.arraycopy(bArr, i16, this.f17069f, 0, i11);
        this.f17070g += i11;
    }
}
