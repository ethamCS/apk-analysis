package nh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public final class h0 implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: j */
    private static final int[] f17193j = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, e.j.L0, 149, 216, 251, 238, e.j.K0, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, e.j.M0, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, 211, 231, androidx.constraintlayout.widget.i.E2, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};

    /* renamed from: k */
    private static final long[] f17194k = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: l */
    private static final long[] f17195l = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: m */
    private static final long[] f17196m = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: n */
    private static final long[] f17197n = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: o */
    private static final long[] f17198o = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: p */
    private static final long[] f17199p = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: q */
    private static final long[] f17200q = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: r */
    private static final long[] f17201r = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: s */
    private static final short[] f17202s;

    /* renamed from: a */
    private final long[] f17203a;

    /* renamed from: b */
    private byte[] f17204b;

    /* renamed from: c */
    private int f17205c;

    /* renamed from: d */
    private short[] f17206d;

    /* renamed from: e */
    private long[] f17207e;

    /* renamed from: f */
    private long[] f17208f;

    /* renamed from: g */
    private long[] f17209g;

    /* renamed from: h */
    private long[] f17210h;

    /* renamed from: i */
    private long[] f17211i;

    static {
        short[] sArr = new short[32];
        f17202s = sArr;
        sArr[31] = 8;
    }

    public h0() {
        this.f17203a = new long[11];
        this.f17204b = new byte[64];
        this.f17205c = 0;
        this.f17206d = new short[32];
        this.f17207e = new long[8];
        this.f17208f = new long[8];
        this.f17209g = new long[8];
        this.f17210h = new long[8];
        this.f17211i = new long[8];
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = f17193j[i10];
            int i12 = i(i11 << 1);
            int i13 = i(i12 << 1);
            int i14 = i13 ^ i11;
            int i15 = i(i13 << 1);
            int i16 = i15 ^ i11;
            f17194k[i10] = j(i11, i11, i13, i11, i15, i14, i12, i16);
            f17195l[i10] = j(i16, i11, i11, i13, i11, i15, i14, i12);
            f17196m[i10] = j(i12, i16, i11, i11, i13, i11, i15, i14);
            f17197n[i10] = j(i14, i12, i16, i11, i11, i13, i11, i15);
            f17198o[i10] = j(i15, i14, i12, i16, i11, i11, i13, i11);
            f17199p[i10] = j(i11, i15, i14, i12, i16, i11, i11, i13);
            f17200q[i10] = j(i13, i11, i15, i14, i12, i16, i11, i11);
            f17201r[i10] = j(i11, i13, i11, i15, i14, i12, i16, i11);
        }
        this.f17203a[0] = 0;
        for (int i17 = 1; i17 <= 10; i17++) {
            int i18 = (i17 - 1) * 8;
            this.f17203a[i17] = (((((((f17194k[i18] & (-72057594037927936L)) ^ (f17195l[i18 + 1] & 71776119061217280L)) ^ (f17196m[i18 + 2] & 280375465082880L)) ^ (f17197n[i18 + 3] & 1095216660480L)) ^ (f17198o[i18 + 4] & 4278190080L)) ^ (f17199p[i18 + 5] & 16711680)) ^ (f17200q[i18 + 6] & 65280)) ^ (f17201r[i18 + 7] & 255);
        }
    }

    public h0(h0 h0Var) {
        this.f17203a = new long[11];
        this.f17204b = new byte[64];
        this.f17205c = 0;
        this.f17206d = new short[32];
        this.f17207e = new long[8];
        this.f17208f = new long[8];
        this.f17209g = new long[8];
        this.f17210h = new long[8];
        this.f17211i = new long[8];
        b(h0Var);
    }

    private long d(byte[] bArr, int i10) {
        return (bArr[i10 + 7] & 255) | ((bArr[i10 + 0] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    private void e(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i10 + i11] = (byte) ((j10 >> (56 - (i11 * 8))) & 255);
        }
    }

    private byte[] f() {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = (byte) (this.f17206d[i10] & 255);
        }
        return bArr;
    }

    private void g() {
        byte[] f10 = f();
        byte[] bArr = this.f17204b;
        int i10 = this.f17205c;
        int i11 = i10 + 1;
        this.f17205c = i11;
        bArr[i10] = (byte) (bArr[i10] | 128);
        if (i11 == bArr.length) {
            l(bArr, 0);
        }
        if (this.f17205c > 32) {
            while (this.f17205c != 0) {
                update((byte) 0);
            }
        }
        while (this.f17205c <= 32) {
            update((byte) 0);
        }
        System.arraycopy(f10, 0, this.f17204b, 32, f10.length);
        l(this.f17204b, 0);
    }

    private void h() {
        int i10 = 0;
        for (int length = this.f17206d.length - 1; length >= 0; length--) {
            short[] sArr = this.f17206d;
            int i11 = (sArr[length] & 255) + f17202s[length] + i10;
            i10 = i11 >>> 8;
            sArr[length] = (short) (i11 & 255);
        }
    }

    private int i(int i10) {
        return ((long) i10) >= 256 ? i10 ^ 285 : i10;
    }

    private long j(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return (((((((i11 << 48) ^ (i10 << 56)) ^ (i12 << 40)) ^ (i13 << 32)) ^ (i14 << 24)) ^ (i15 << 16)) ^ (i16 << 8)) ^ i17;
    }

    private void l(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.f17211i.length; i11++) {
            this.f17210h[i11] = d(this.f17204b, i11 * 8);
        }
        k();
        this.f17205c = 0;
        ak.a.y(this.f17204b, (byte) 0);
    }

    @Override // ak.i
    public ak.i a() {
        return new h0(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        h0 h0Var = (h0) iVar;
        long[] jArr = h0Var.f17203a;
        long[] jArr2 = this.f17203a;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = h0Var.f17204b;
        byte[] bArr2 = this.f17204b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f17205c = h0Var.f17205c;
        short[] sArr = h0Var.f17206d;
        short[] sArr2 = this.f17206d;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = h0Var.f17207e;
        long[] jArr4 = this.f17207e;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = h0Var.f17208f;
        long[] jArr6 = this.f17208f;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = h0Var.f17209g;
        long[] jArr8 = this.f17209g;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = h0Var.f17210h;
        long[] jArr10 = this.f17210h;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = h0Var.f17211i;
        long[] jArr12 = this.f17211i;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        g();
        for (int i11 = 0; i11 < 8; i11++) {
            e(this.f17207e[i11], bArr, (i11 * 8) + i10);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 64;
    }

    protected void k() {
        long[] jArr;
        for (int i10 = 0; i10 < 8; i10++) {
            long[] jArr2 = this.f17211i;
            long j10 = this.f17210h[i10];
            long[] jArr3 = this.f17208f;
            long j11 = this.f17207e[i10];
            jArr3[i10] = j11;
            jArr2[i10] = j10 ^ j11;
        }
        int i11 = 1;
        while (i11 <= 10) {
            int i12 = 0;
            while (i12 < 8) {
                long[] jArr4 = this.f17209g;
                jArr4[i12] = 0;
                long j12 = jArr4[i12];
                long[] jArr5 = f17194k;
                long[] jArr6 = this.f17208f;
                jArr4[i12] = jArr5[((int) (jArr6[(i12 + 0) & 7] >>> 56)) & 255] ^ j12;
                jArr4[i12] = jArr4[i12] ^ f17195l[((int) (jArr6[(i12 - 1) & 7] >>> 48)) & 255];
                jArr4[i12] = jArr4[i12] ^ f17196m[((int) (jArr6[(i12 - 2) & 7] >>> 40)) & 255];
                jArr4[i12] = jArr4[i12] ^ f17197n[((int) (jArr6[(i12 - 3) & 7] >>> 32)) & 255];
                jArr4[i12] = jArr4[i12] ^ f17198o[((int) (jArr6[(i12 - 4) & 7] >>> 24)) & 255];
                jArr4[i12] = jArr4[i12] ^ f17199p[((int) (jArr6[(i12 - 5) & 7] >>> 16)) & 255];
                jArr4[i12] = jArr4[i12] ^ f17200q[((int) (jArr6[(i12 - 6) & 7] >>> 8)) & 255];
                jArr4[i12] = jArr4[i12] ^ f17201r[((int) jArr6[(i12 - 7) & 7]) & 255];
                i12++;
                i11 = i11;
            }
            int i13 = i11;
            long[] jArr7 = this.f17209g;
            long[] jArr8 = this.f17208f;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this.f17208f;
            jArr9[0] = jArr9[0] ^ this.f17203a[i13];
            int i14 = 0;
            while (true) {
                jArr = this.f17209g;
                if (i14 < 8) {
                    jArr[i14] = this.f17208f[i14];
                    long j13 = jArr[i14];
                    long[] jArr10 = f17194k;
                    long[] jArr11 = this.f17211i;
                    jArr[i14] = j13 ^ jArr10[((int) (jArr11[(i14 + 0) & 7] >>> 56)) & 255];
                    jArr[i14] = jArr[i14] ^ f17195l[((int) (jArr11[(i14 - 1) & 7] >>> 48)) & 255];
                    jArr[i14] = jArr[i14] ^ f17196m[((int) (jArr11[(i14 - 2) & 7] >>> 40)) & 255];
                    jArr[i14] = jArr[i14] ^ f17197n[((int) (jArr11[(i14 - 3) & 7] >>> 32)) & 255];
                    jArr[i14] = jArr[i14] ^ f17198o[((int) (jArr11[(i14 - 4) & 7] >>> 24)) & 255];
                    jArr[i14] = jArr[i14] ^ f17199p[((int) (jArr11[(i14 - 5) & 7] >>> 16)) & 255];
                    jArr[i14] = jArr[i14] ^ f17200q[((int) (jArr11[(i14 - 6) & 7] >>> 8)) & 255];
                    jArr[i14] = jArr[i14] ^ f17201r[((int) jArr11[(i14 - 7) & 7]) & 255];
                    i14++;
                }
            }
            long[] jArr12 = this.f17211i;
            System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i11 = i13 + 1;
        }
        for (int i15 = 0; i15 < 8; i15++) {
            long[] jArr13 = this.f17207e;
            jArr13[i15] = jArr13[i15] ^ (this.f17211i[i15] ^ this.f17210h[i15]);
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17205c = 0;
        ak.a.D(this.f17206d, (short) 0);
        ak.a.y(this.f17204b, (byte) 0);
        ak.a.C(this.f17207e, 0L);
        ak.a.C(this.f17208f, 0L);
        ak.a.C(this.f17209g, 0L);
        ak.a.C(this.f17210h, 0L);
        ak.a.C(this.f17211i, 0L);
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        byte[] bArr = this.f17204b;
        int i10 = this.f17205c;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.f17205c = i11;
        if (i11 == bArr.length) {
            l(bArr, 0);
        }
        h();
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
