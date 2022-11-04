package qh;
/* loaded from: classes3.dex */
public class d0 implements org.bouncycastle.crypto.e {

    /* renamed from: d */
    private static final byte[] f19965d = {Byte.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44};

    /* renamed from: a */
    private final int[] f19966a = new int[4];

    /* renamed from: b */
    private boolean f19967b = false;

    /* renamed from: c */
    private boolean f19968c;

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int a10 = ak.l.a(bArr, i10);
        int a11 = ak.l.a(bArr, i10 + 4);
        int a12 = ak.l.a(bArr, i10 + 8);
        int a13 = ak.l.a(bArr, i10 + 12);
        int[] iArr = this.f19966a;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = 16;
        while (true) {
            int i17 = a10 ^ a12;
            int c10 = i17 ^ (ak.g.c(i17, 8) ^ ak.g.c(i17, 24));
            int i18 = a11 ^ i13;
            int i19 = a13 ^ i15;
            int i20 = i18 ^ i19;
            int c11 = (ak.g.c(i20, 24) ^ ak.g.c(i20, 8)) ^ i20;
            int i21 = i18 ^ c10;
            int i22 = (a12 ^ i14) ^ c11;
            int i23 = i19 ^ c10;
            int i24 = ((a10 ^ i12) ^ c11) ^ (f19965d[i16] & 255);
            i16--;
            if (i16 < 0) {
                ak.l.f(i24, bArr2, i11);
                ak.l.f(i21, bArr2, i11 + 4);
                ak.l.f(i22, bArr2, i11 + 8);
                ak.l.f(i23, bArr2, i11 + 12);
                return 16;
            }
            int c12 = ak.g.c(i21, 1);
            int c13 = ak.g.c(i22, 5);
            int c14 = ak.g.c(i23, 2);
            int i25 = c12 ^ (c14 | c13);
            int i26 = ~i25;
            int i27 = i24 ^ (c13 & i26);
            int i28 = (c13 ^ (i26 ^ c14)) ^ i27;
            int i29 = i25 ^ (i27 | i28);
            a11 = ak.g.c(i29, 31);
            a12 = ak.g.c(i28, 27);
            int c15 = ak.g.c(i27, 30);
            a10 = c14 ^ (i28 & i29);
            a13 = c15;
        }
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int a10 = ak.l.a(bArr, i10);
        int a11 = ak.l.a(bArr, i10 + 4);
        int a12 = ak.l.a(bArr, i10 + 8);
        int a13 = ak.l.a(bArr, i10 + 12);
        int[] iArr = this.f19966a;
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        while (true) {
            int i17 = a10 ^ (f19965d[i12] & 255);
            int i18 = i17 ^ a12;
            int c10 = i18 ^ (ak.g.c(i18, 8) ^ ak.g.c(i18, 24));
            int i19 = a11 ^ i14;
            int i20 = a13 ^ i16;
            int i21 = i19 ^ i20;
            int c11 = i21 ^ (ak.g.c(i21, 24) ^ ak.g.c(i21, 8));
            int i22 = (i17 ^ i13) ^ c11;
            int i23 = i19 ^ c10;
            int i24 = (a12 ^ i15) ^ c11;
            int i25 = i20 ^ c10;
            i12++;
            if (i12 > 16) {
                ak.l.f(i22, bArr2, i11);
                ak.l.f(i23, bArr2, i11 + 4);
                ak.l.f(i24, bArr2, i11 + 8);
                ak.l.f(i25, bArr2, i11 + 12);
                return 16;
            }
            int c12 = ak.g.c(i23, 1);
            int c13 = ak.g.c(i24, 5);
            int c14 = ak.g.c(i25, 2);
            int i26 = c12 ^ (c14 | c13);
            int i27 = ~i26;
            int i28 = i22 ^ (c13 & i27);
            int i29 = (c13 ^ (i27 ^ c14)) ^ i28;
            int i30 = i26 ^ (i28 | i29);
            a11 = ak.g.c(i30, 31);
            a12 = ak.g.c(i29, 27);
            int c15 = ak.g.c(i28, 30);
            a10 = c14 ^ (i29 & i30);
            a13 = c15;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f19967b) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 > bArr.length - 16) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i11 > bArr2.length - 16) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            return this.f19968c ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + iVar.getClass().getName());
        }
        byte[] a10 = ((zh.b1) iVar).a();
        if (a10.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        ak.l.b(a10, 0, this.f19966a, 0, 4);
        if (!z10) {
            int[] iArr = this.f19966a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            int i14 = i10 ^ i12;
            int c10 = i14 ^ (ak.g.c(i14, 8) ^ ak.g.c(i14, 24));
            int i15 = i11 ^ i13;
            int c11 = (ak.g.c(i15, 8) ^ ak.g.c(i15, 24)) ^ i15;
            int i16 = i11 ^ c10;
            int i17 = i13 ^ c10;
            int[] iArr2 = this.f19966a;
            iArr2[0] = i10 ^ c11;
            iArr2[1] = i16;
            iArr2[2] = i12 ^ c11;
            iArr2[3] = i17;
        }
        this.f19968c = z10;
        this.f19967b = true;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
