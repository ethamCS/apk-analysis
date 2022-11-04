package uh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.y;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class l implements y {

    /* renamed from: a */
    private final org.bouncycastle.crypto.e f23734a;

    /* renamed from: b */
    private final byte[] f23735b;

    /* renamed from: c */
    private int f23736c;

    /* renamed from: d */
    private int f23737d;

    /* renamed from: e */
    private int f23738e;

    /* renamed from: f */
    private int f23739f;

    /* renamed from: g */
    private int f23740g;

    /* renamed from: h */
    private int f23741h;

    /* renamed from: i */
    private int f23742i;

    /* renamed from: j */
    private int f23743j;

    /* renamed from: k */
    private int f23744k;

    /* renamed from: l */
    private int f23745l;

    /* renamed from: m */
    private int f23746m;

    /* renamed from: n */
    private int f23747n;

    /* renamed from: o */
    private int f23748o;

    /* renamed from: p */
    private final byte[] f23749p;

    /* renamed from: q */
    private int f23750q;

    /* renamed from: r */
    private int f23751r;

    /* renamed from: s */
    private int f23752s;

    /* renamed from: t */
    private int f23753t;

    /* renamed from: u */
    private int f23754u;

    /* renamed from: v */
    private int f23755v;

    public l() {
        this.f23735b = new byte[1];
        this.f23749p = new byte[16];
        this.f23750q = 0;
        this.f23734a = null;
    }

    public l(org.bouncycastle.crypto.e eVar) {
        this.f23735b = new byte[1];
        this.f23749p = new byte[16];
        this.f23750q = 0;
        if (eVar.b() == 16) {
            this.f23734a = eVar;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }

    private static final long a(int i10, int i11) {
        return (i10 & 4294967295L) * i11;
    }

    private void b() {
        int i10 = this.f23750q;
        if (i10 < 16) {
            this.f23749p[i10] = 1;
            for (int i11 = i10 + 1; i11 < 16; i11++) {
                this.f23749p[i11] = 0;
            }
        }
        long l10 = ak.l.l(this.f23749p, 0) & 4294967295L;
        long l11 = ak.l.l(this.f23749p, 4) & 4294967295L;
        long l12 = ak.l.l(this.f23749p, 8) & 4294967295L;
        long l13 = 4294967295L & ak.l.l(this.f23749p, 12);
        int i12 = (int) (this.f23751r + (l10 & 67108863));
        this.f23751r = i12;
        this.f23752s = (int) (this.f23752s + ((((l11 << 32) | l10) >>> 26) & 67108863));
        this.f23753t = (int) (this.f23753t + (((l11 | (l12 << 32)) >>> 20) & 67108863));
        this.f23754u = (int) (this.f23754u + ((((l13 << 32) | l12) >>> 14) & 67108863));
        int i13 = (int) (this.f23755v + (l13 >>> 8));
        this.f23755v = i13;
        if (this.f23750q == 16) {
            this.f23755v = i13 + 16777216;
        }
        long a10 = a(i12, this.f23736c) + a(this.f23752s, this.f23744k) + a(this.f23753t, this.f23743j) + a(this.f23754u, this.f23742i) + a(this.f23755v, this.f23741h);
        long a11 = a(this.f23751r, this.f23737d) + a(this.f23752s, this.f23736c) + a(this.f23753t, this.f23744k) + a(this.f23754u, this.f23743j) + a(this.f23755v, this.f23742i);
        long a12 = a(this.f23751r, this.f23738e) + a(this.f23752s, this.f23737d) + a(this.f23753t, this.f23736c) + a(this.f23754u, this.f23744k) + a(this.f23755v, this.f23743j);
        long a13 = a(this.f23751r, this.f23739f) + a(this.f23752s, this.f23738e) + a(this.f23753t, this.f23737d) + a(this.f23754u, this.f23736c) + a(this.f23755v, this.f23744k);
        long a14 = a(this.f23751r, this.f23740g) + a(this.f23752s, this.f23739f) + a(this.f23753t, this.f23738e) + a(this.f23754u, this.f23737d) + a(this.f23755v, this.f23736c);
        long j10 = a11 + (a10 >>> 26);
        long j11 = a12 + (j10 >>> 26);
        this.f23753t = ((int) j11) & 67108863;
        long j12 = a13 + (j11 >>> 26);
        this.f23754u = ((int) j12) & 67108863;
        long j13 = a14 + (j12 >>> 26);
        this.f23755v = ((int) j13) & 67108863;
        int i14 = (((int) a10) & 67108863) + (((int) (j13 >>> 26)) * 5);
        this.f23752s = (((int) j10) & 67108863) + (i14 >>> 26);
        this.f23751r = i14 & 67108863;
    }

    private void c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i10 = 16;
            if (this.f23734a != null && (bArr2 == null || bArr2.length != 16)) {
                throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
            }
            int l10 = ak.l.l(bArr, 0);
            int l11 = ak.l.l(bArr, 4);
            int l12 = ak.l.l(bArr, 8);
            int l13 = ak.l.l(bArr, 12);
            this.f23736c = 67108863 & l10;
            int i11 = ((l10 >>> 26) | (l11 << 6)) & 67108611;
            this.f23737d = i11;
            int i12 = ((l11 >>> 20) | (l12 << 12)) & 67092735;
            this.f23738e = i12;
            int i13 = ((l12 >>> 14) | (l13 << 18)) & 66076671;
            this.f23739f = i13;
            int i14 = (l13 >>> 8) & 1048575;
            this.f23740g = i14;
            this.f23741h = i11 * 5;
            this.f23742i = i12 * 5;
            this.f23743j = i13 * 5;
            this.f23744k = i14 * 5;
            org.bouncycastle.crypto.e eVar = this.f23734a;
            if (eVar != null) {
                byte[] bArr3 = new byte[16];
                eVar.init(true, new b1(bArr, 16, 16));
                this.f23734a.a(bArr2, 0, bArr3, 0);
                i10 = 0;
                bArr = bArr3;
            }
            this.f23745l = ak.l.l(bArr, i10 + 0);
            this.f23746m = ak.l.l(bArr, i10 + 4);
            this.f23747n = ak.l.l(bArr, i10 + 8);
            this.f23748o = ak.l.l(bArr, i10 + 12);
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 + 16 <= bArr.length) {
            if (this.f23750q > 0) {
                b();
            }
            int i16 = this.f23752s;
            int i17 = this.f23751r;
            int i18 = i16 + (i17 >>> 26);
            int i19 = this.f23753t + (i18 >>> 26);
            int i20 = this.f23754u + (i19 >>> 26);
            int i21 = i19 & 67108863;
            int i22 = this.f23755v + (i20 >>> 26);
            int i23 = i20 & 67108863;
            int i24 = (i17 & 67108863) + ((i22 >>> 26) * 5);
            int i25 = i22 & 67108863;
            int i26 = (i18 & 67108863) + (i24 >>> 26);
            int i27 = i24 & 67108863;
            int i28 = i27 + 5;
            int i29 = (i28 >>> 26) + i26;
            int i30 = (i29 >>> 26) + i21;
            int i31 = (i30 >>> 26) + i23;
            int i32 = 67108863 & i31;
            int i33 = ((i31 >>> 26) + i25) - 67108864;
            int i34 = (i33 >>> 31) - 1;
            int i35 = ~i34;
            this.f23751r = (i27 & i35) | (i28 & 67108863 & i34);
            this.f23752s = (i26 & i35) | (i29 & 67108863 & i34);
            this.f23753t = (i21 & i35) | (i30 & 67108863 & i34);
            this.f23754u = (i32 & i34) | (i23 & i35);
            this.f23755v = (i25 & i35) | (i33 & i34);
            long j10 = ((i11 | (i12 << 26)) & 4294967295L) + (this.f23745l & 4294967295L);
            ak.l.i((int) j10, bArr, i10);
            long j11 = (((i12 >>> 6) | (i13 << 20)) & 4294967295L) + (this.f23746m & 4294967295L) + (j10 >>> 32);
            ak.l.i((int) j11, bArr, i10 + 4);
            long j12 = (((i13 >>> 12) | (i14 << 14)) & 4294967295L) + (this.f23747n & 4294967295L) + (j11 >>> 32);
            ak.l.i((int) j12, bArr, i10 + 8);
            ak.l.i((int) ((((i14 >>> 18) | (i15 << 8)) & 4294967295L) + (4294967295L & this.f23748o) + (j12 >>> 32)), bArr, i10 + 12);
            reset();
            return 16;
        }
        throw new a0("Output buffer is too short.");
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        if (this.f23734a == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.f23734a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        if (this.f23734a == null) {
            bArr = null;
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        } else {
            f1 f1Var = (f1) iVar;
            bArr = f1Var.a();
            iVar = f1Var.b();
        }
        if (iVar instanceof b1) {
            c(((b1) iVar).a(), bArr);
            reset();
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23750q = 0;
        this.f23755v = 0;
        this.f23754u = 0;
        this.f23753t = 0;
        this.f23752s = 0;
        this.f23751r = 0;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        byte[] bArr = this.f23735b;
        bArr[0] = b10;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i11 > i12) {
            if (this.f23750q == 16) {
                b();
                this.f23750q = 0;
            }
            int min = Math.min(i11 - i12, 16 - this.f23750q);
            System.arraycopy(bArr, i12 + i10, this.f23749p, this.f23750q, min);
            i12 += min;
            this.f23750q += min;
        }
    }
}
