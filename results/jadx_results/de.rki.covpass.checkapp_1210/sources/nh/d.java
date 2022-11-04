package nh;

import java.lang.reflect.Array;
import zh.b1;
import zh.h1;
/* loaded from: classes3.dex */
public class d implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: s */
    private static final byte[] f17119s = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* renamed from: a */
    private byte[] f17120a;

    /* renamed from: b */
    private byte[] f17121b;

    /* renamed from: c */
    private byte[] f17122c;

    /* renamed from: d */
    private byte[] f17123d;

    /* renamed from: e */
    private byte[][] f17124e;

    /* renamed from: f */
    private byte[] f17125f;

    /* renamed from: g */
    private int f17126g;

    /* renamed from: h */
    private long f17127h;

    /* renamed from: i */
    private org.bouncycastle.crypto.e f17128i;

    /* renamed from: j */
    private byte[] f17129j;

    /* renamed from: k */
    private byte[] f17130k;

    /* renamed from: l */
    byte[] f17131l;

    /* renamed from: m */
    short[] f17132m;

    /* renamed from: n */
    short[] f17133n;

    /* renamed from: o */
    byte[] f17134o;

    /* renamed from: p */
    byte[] f17135p;

    /* renamed from: q */
    byte[] f17136q;

    /* renamed from: r */
    byte[] f17137r;

    public d() {
        this.f17120a = new byte[32];
        this.f17121b = new byte[32];
        this.f17122c = new byte[32];
        this.f17123d = new byte[32];
        this.f17124e = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.f17125f = new byte[32];
        this.f17128i = new qh.u();
        this.f17130k = new byte[32];
        this.f17131l = new byte[8];
        this.f17132m = new short[16];
        this.f17133n = new short[16];
        this.f17134o = new byte[32];
        this.f17135p = new byte[32];
        this.f17136q = new byte[32];
        this.f17137r = new byte[32];
        byte[] h10 = qh.u.h("D-A");
        this.f17129j = h10;
        this.f17128i.init(true, new h1(null, h10));
        reset();
    }

    public d(d dVar) {
        this.f17120a = new byte[32];
        this.f17121b = new byte[32];
        this.f17122c = new byte[32];
        this.f17123d = new byte[32];
        this.f17124e = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.f17125f = new byte[32];
        this.f17128i = new qh.u();
        this.f17130k = new byte[32];
        this.f17131l = new byte[8];
        this.f17132m = new short[16];
        this.f17133n = new short[16];
        this.f17134o = new byte[32];
        this.f17135p = new byte[32];
        this.f17136q = new byte[32];
        this.f17137r = new byte[32];
        b(dVar);
    }

    public d(byte[] bArr) {
        this.f17120a = new byte[32];
        this.f17121b = new byte[32];
        this.f17122c = new byte[32];
        this.f17123d = new byte[32];
        this.f17124e = (byte[][]) Array.newInstance(byte.class, 4, 32);
        this.f17125f = new byte[32];
        this.f17128i = new qh.u();
        this.f17130k = new byte[32];
        this.f17131l = new byte[8];
        this.f17132m = new short[16];
        this.f17133n = new short[16];
        this.f17134o = new byte[32];
        this.f17135p = new byte[32];
        this.f17136q = new byte[32];
        this.f17137r = new byte[32];
        byte[] h10 = ak.a.h(bArr);
        this.f17129j = h10;
        this.f17128i.init(true, new h1(null, h10));
        reset();
    }

    private byte[] d(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f17131l[i10] = (byte) (bArr[i10] ^ bArr[i10 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f17131l, 0, bArr, 24, 8);
        return bArr;
    }

    private void e(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        this.f17128i.init(true, new b1(bArr));
        this.f17128i.a(bArr3, i11, bArr2, i10);
    }

    private byte[] f(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            byte[] bArr2 = this.f17130k;
            int i11 = i10 * 4;
            bArr2[i11] = bArr[i10];
            bArr2[i11 + 1] = bArr[i10 + 8];
            bArr2[i11 + 2] = bArr[i10 + 16];
            bArr2[i11 + 3] = bArr[i10 + 24];
        }
        return this.f17130k;
    }

    private void g(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            sArr[i10] = (short) ((bArr[i11] & 255) | ((bArr[i11 + 1] << 8) & 65280));
        }
    }

    private void h(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            bArr[i11 + 1] = (byte) (sArr[i10] >> 8);
            bArr[i11] = (byte) sArr[i10];
        }
    }

    private void i() {
        ak.l.v(this.f17127h * 8, this.f17121b, 0);
        while (this.f17126g != 0) {
            update((byte) 0);
        }
        k(this.f17121b, 0);
        k(this.f17123d, 0);
    }

    private void j(byte[] bArr) {
        g(bArr, this.f17132m);
        short[] sArr = this.f17133n;
        short[] sArr2 = this.f17132m;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        h(this.f17133n, bArr);
    }

    private void l(byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f17123d;
            if (i10 != bArr2.length) {
                int i12 = (bArr2[i10] & 255) + (bArr[i10] & 255) + i11;
                bArr2[i10] = (byte) i12;
                i11 = i12 >>> 8;
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // ak.i
    public ak.i a() {
        return new d(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        d dVar = (d) iVar;
        byte[] bArr = dVar.f17129j;
        this.f17129j = bArr;
        this.f17128i.init(true, new h1(null, bArr));
        reset();
        byte[] bArr2 = dVar.f17120a;
        System.arraycopy(bArr2, 0, this.f17120a, 0, bArr2.length);
        byte[] bArr3 = dVar.f17121b;
        System.arraycopy(bArr3, 0, this.f17121b, 0, bArr3.length);
        byte[] bArr4 = dVar.f17122c;
        System.arraycopy(bArr4, 0, this.f17122c, 0, bArr4.length);
        byte[] bArr5 = dVar.f17123d;
        System.arraycopy(bArr5, 0, this.f17123d, 0, bArr5.length);
        byte[][] bArr6 = dVar.f17124e;
        System.arraycopy(bArr6[1], 0, this.f17124e[1], 0, bArr6[1].length);
        byte[][] bArr7 = dVar.f17124e;
        System.arraycopy(bArr7[2], 0, this.f17124e[2], 0, bArr7[2].length);
        byte[][] bArr8 = dVar.f17124e;
        System.arraycopy(bArr8[3], 0, this.f17124e[3], 0, bArr8[3].length);
        byte[] bArr9 = dVar.f17125f;
        System.arraycopy(bArr9, 0, this.f17125f, 0, bArr9.length);
        this.f17126g = dVar.f17126g;
        this.f17127h = dVar.f17127h;
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        i();
        byte[] bArr2 = this.f17120a;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 32;
    }

    protected void k(byte[] bArr, int i10) {
        System.arraycopy(bArr, i10, this.f17122c, 0, 32);
        System.arraycopy(this.f17120a, 0, this.f17135p, 0, 32);
        System.arraycopy(this.f17122c, 0, this.f17136q, 0, 32);
        for (int i11 = 0; i11 < 32; i11++) {
            this.f17137r[i11] = (byte) (this.f17135p[i11] ^ this.f17136q[i11]);
        }
        e(f(this.f17137r), this.f17134o, 0, this.f17120a, 0);
        for (int i12 = 1; i12 < 4; i12++) {
            byte[] d10 = d(this.f17135p);
            for (int i13 = 0; i13 < 32; i13++) {
                this.f17135p[i13] = (byte) (d10[i13] ^ this.f17124e[i12][i13]);
            }
            this.f17136q = d(d(this.f17136q));
            for (int i14 = 0; i14 < 32; i14++) {
                this.f17137r[i14] = (byte) (this.f17135p[i14] ^ this.f17136q[i14]);
            }
            int i15 = i12 * 8;
            e(f(this.f17137r), this.f17134o, i15, this.f17120a, i15);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            j(this.f17134o);
        }
        for (int i17 = 0; i17 < 32; i17++) {
            byte[] bArr2 = this.f17134o;
            bArr2[i17] = (byte) (bArr2[i17] ^ this.f17122c[i17]);
        }
        j(this.f17134o);
        for (int i18 = 0; i18 < 32; i18++) {
            byte[] bArr3 = this.f17134o;
            bArr3[i18] = (byte) (this.f17120a[i18] ^ bArr3[i18]);
        }
        for (int i19 = 0; i19 < 61; i19++) {
            j(this.f17134o);
        }
        byte[] bArr4 = this.f17134o;
        byte[] bArr5 = this.f17120a;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17127h = 0L;
        this.f17126g = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f17120a;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f17121b;
            if (i11 >= bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f17122c;
            if (i12 >= bArr3.length) {
                break;
            }
            bArr3[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[][] bArr4 = this.f17124e;
            if (i13 >= bArr4[1].length) {
                break;
            }
            bArr4[1][i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[][] bArr5 = this.f17124e;
            if (i14 >= bArr5[3].length) {
                break;
            }
            bArr5[3][i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr6 = this.f17123d;
            if (i15 >= bArr6.length) {
                break;
            }
            bArr6[i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr7 = this.f17125f;
            if (i16 >= bArr7.length) {
                byte[] bArr8 = f17119s;
                System.arraycopy(bArr8, 0, this.f17124e[2], 0, bArr8.length);
                return;
            }
            bArr7[i16] = 0;
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        byte[] bArr = this.f17125f;
        int i10 = this.f17126g;
        int i11 = i10 + 1;
        this.f17126g = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            l(bArr);
            k(this.f17125f, 0);
            this.f17126g = 0;
        }
        this.f17127h++;
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f17126g != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (true) {
            byte[] bArr2 = this.f17125f;
            if (i11 > bArr2.length) {
                System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
                l(this.f17125f);
                k(this.f17125f, 0);
                byte[] bArr3 = this.f17125f;
                i10 += bArr3.length;
                i11 -= bArr3.length;
                this.f17127h += bArr3.length;
            }
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
