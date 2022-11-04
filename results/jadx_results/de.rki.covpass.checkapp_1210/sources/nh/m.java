package nh;
/* loaded from: classes3.dex */
public abstract class m implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: o */
    static final long[] f17226o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a */
    private byte[] f17227a;

    /* renamed from: b */
    private int f17228b;

    /* renamed from: c */
    private long f17229c;

    /* renamed from: d */
    private long f17230d;

    /* renamed from: e */
    protected long f17231e;

    /* renamed from: f */
    protected long f17232f;

    /* renamed from: g */
    protected long f17233g;

    /* renamed from: h */
    protected long f17234h;

    /* renamed from: i */
    protected long f17235i;

    /* renamed from: j */
    protected long f17236j;

    /* renamed from: k */
    protected long f17237k;

    /* renamed from: l */
    protected long f17238l;

    /* renamed from: m */
    private long[] f17239m;

    /* renamed from: n */
    private int f17240n;

    public m() {
        this.f17227a = new byte[8];
        this.f17239m = new long[80];
        this.f17228b = 0;
        reset();
    }

    public m(m mVar) {
        this.f17227a = new byte[8];
        this.f17239m = new long[80];
        k(mVar);
    }

    private long d(long j10, long j11, long j12) {
        return ((~j10) & j12) ^ (j11 & j10);
    }

    private long e(long j10, long j11, long j12) {
        return ((j10 & j12) ^ (j10 & j11)) ^ (j11 & j12);
    }

    private long f(long j10) {
        return (j10 >>> 7) ^ (((j10 << 63) | (j10 >>> 1)) ^ ((j10 << 56) | (j10 >>> 8)));
    }

    private long g(long j10) {
        return (j10 >>> 6) ^ (((j10 << 45) | (j10 >>> 19)) ^ ((j10 << 3) | (j10 >>> 61)));
    }

    private long h(long j10) {
        return ((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)));
    }

    private long i(long j10) {
        return ((j10 >>> 41) | (j10 << 23)) ^ (((j10 << 50) | (j10 >>> 14)) ^ ((j10 << 46) | (j10 >>> 18)));
    }

    private void j() {
        long j10 = this.f17229c;
        if (j10 > 2305843009213693951L) {
            this.f17230d += j10 >>> 61;
            this.f17229c = j10 & 2305843009213693951L;
        }
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 128;
    }

    public void k(m mVar) {
        byte[] bArr = mVar.f17227a;
        System.arraycopy(bArr, 0, this.f17227a, 0, bArr.length);
        this.f17228b = mVar.f17228b;
        this.f17229c = mVar.f17229c;
        this.f17230d = mVar.f17230d;
        this.f17231e = mVar.f17231e;
        this.f17232f = mVar.f17232f;
        this.f17233g = mVar.f17233g;
        this.f17234h = mVar.f17234h;
        this.f17235i = mVar.f17235i;
        this.f17236j = mVar.f17236j;
        this.f17237k = mVar.f17237k;
        this.f17238l = mVar.f17238l;
        long[] jArr = mVar.f17239m;
        System.arraycopy(jArr, 0, this.f17239m, 0, jArr.length);
        this.f17240n = mVar.f17240n;
    }

    public void l() {
        j();
        long j10 = this.f17229c << 3;
        long j11 = this.f17230d;
        byte b10 = Byte.MIN_VALUE;
        while (true) {
            update(b10);
            if (this.f17228b == 0) {
                n(j10, j11);
                m();
                return;
            }
            b10 = 0;
        }
    }

    protected void m() {
        j();
        for (int i10 = 16; i10 <= 79; i10++) {
            long[] jArr = this.f17239m;
            long g10 = g(jArr[i10 - 2]);
            long[] jArr2 = this.f17239m;
            jArr[i10] = g10 + jArr2[i10 - 7] + f(jArr2[i10 - 15]) + this.f17239m[i10 - 16];
        }
        long j10 = this.f17231e;
        long j11 = this.f17232f;
        long j12 = this.f17233g;
        long j13 = this.f17234h;
        long j14 = this.f17235i;
        long j15 = this.f17236j;
        long j16 = this.f17237k;
        long j17 = j15;
        long j18 = j13;
        int i11 = 0;
        long j19 = j11;
        long j20 = j12;
        long j21 = j14;
        int i12 = 0;
        long j22 = this.f17238l;
        long j23 = j10;
        long j24 = j16;
        while (i12 < 10) {
            long j25 = j21;
            long[] jArr3 = f17226o;
            int i13 = i11 + 1;
            long i14 = j22 + i(j21) + d(j21, j17, j24) + jArr3[i11] + this.f17239m[i11];
            long j26 = j18 + i14;
            long h10 = i14 + h(j23) + e(j23, j19, j20);
            int i15 = i13 + 1;
            long i16 = j24 + i(j26) + d(j26, j25, j17) + jArr3[i13] + this.f17239m[i13];
            long j27 = j20 + i16;
            long h11 = i16 + h(h10) + e(h10, j23, j19);
            int i17 = i15 + 1;
            long i18 = j17 + i(j27) + d(j27, j26, j25) + jArr3[i15] + this.f17239m[i15];
            long j28 = j19 + i18;
            long h12 = i18 + h(h11) + e(h11, h10, j23);
            int i19 = i17 + 1;
            long i20 = j25 + i(j28) + d(j28, j27, j26) + jArr3[i17] + this.f17239m[i17];
            long j29 = j23 + i20;
            long h13 = i20 + h(h12) + e(h12, h11, h10);
            int i21 = i19 + 1;
            long i22 = j26 + i(j29) + d(j29, j28, j27) + jArr3[i19] + this.f17239m[i19];
            long j30 = h10 + i22;
            long h14 = i22 + h(h13) + e(h13, h12, h11);
            int i23 = i21 + 1;
            long i24 = j27 + i(j30) + d(j30, j29, j28) + jArr3[i21] + this.f17239m[i21];
            long j31 = h11 + i24;
            long h15 = i24 + h(h14) + e(h14, h13, h12);
            j24 = j31;
            int i25 = i23 + 1;
            long i26 = j28 + i(j31) + d(j31, j30, j29) + jArr3[i23] + this.f17239m[i23];
            long j32 = h12 + i26;
            j17 = j32;
            j19 = i26 + h(h15) + e(h15, h14, h13);
            long i27 = j29 + i(j32) + d(j32, j24, j30) + jArr3[i25] + this.f17239m[i25];
            long h16 = i27 + h(j19) + e(j19, h15, h14);
            i12++;
            j21 = h13 + i27;
            j20 = h15;
            j22 = j30;
            j18 = h14;
            i11 = i25 + 1;
            j23 = h16;
        }
        this.f17231e += j23;
        this.f17232f += j19;
        this.f17233g += j20;
        this.f17234h += j18;
        this.f17235i += j21;
        this.f17236j += j17;
        this.f17237k += j24;
        this.f17238l += j22;
        this.f17240n = 0;
        for (int i28 = 0; i28 < 16; i28++) {
            this.f17239m[i28] = 0;
        }
    }

    protected void n(long j10, long j11) {
        if (this.f17240n > 14) {
            m();
        }
        long[] jArr = this.f17239m;
        jArr[14] = j11;
        jArr[15] = j10;
    }

    protected void o(byte[] bArr, int i10) {
        this.f17239m[this.f17240n] = ak.l.c(bArr, i10);
        int i11 = this.f17240n + 1;
        this.f17240n = i11;
        if (i11 == 16) {
            m();
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17229c = 0L;
        this.f17230d = 0L;
        int i10 = 0;
        this.f17228b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f17227a;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.f17240n = 0;
        while (true) {
            long[] jArr = this.f17239m;
            if (i10 != jArr.length) {
                jArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        byte[] bArr = this.f17227a;
        int i10 = this.f17228b;
        int i11 = i10 + 1;
        this.f17228b = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            o(bArr, 0);
            this.f17228b = 0;
        }
        this.f17229c++;
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f17228b != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > this.f17227a.length) {
            o(bArr, i10);
            byte[] bArr2 = this.f17227a;
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.f17229c += bArr2.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
