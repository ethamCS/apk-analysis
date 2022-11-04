package nh;
/* loaded from: classes3.dex */
public class b0 extends m {

    /* renamed from: p */
    private int f17096p;

    /* renamed from: q */
    private long f17097q;

    /* renamed from: r */
    private long f17098r;

    /* renamed from: s */
    private long f17099s;

    /* renamed from: t */
    private long f17100t;

    /* renamed from: u */
    private long f17101u;

    /* renamed from: v */
    private long f17102v;

    /* renamed from: w */
    private long f17103w;

    /* renamed from: x */
    private long f17104x;

    public b0(int i10) {
        if (i10 < 512) {
            if (i10 % 8 != 0) {
                throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
            }
            if (i10 == 384) {
                throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
            }
            int i11 = i10 / 8;
            this.f17096p = i11;
            r(i11 * 8);
            reset();
            return;
        }
        throw new IllegalArgumentException("bitLength cannot be >= 512");
    }

    public b0(b0 b0Var) {
        super(b0Var);
        this.f17096p = b0Var.f17096p;
        b(b0Var);
    }

    private static void p(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(4, i12);
        while (true) {
            min--;
            if (min >= 0) {
                bArr[i11 + min] = (byte) (i10 >>> ((3 - min) * 8));
            } else {
                return;
            }
        }
    }

    private static void q(long j10, byte[] bArr, int i10, int i11) {
        if (i11 > 0) {
            p((int) (j10 >>> 32), bArr, i10, i11);
            if (i11 <= 4) {
                return;
            }
            p((int) (j10 & 4294967295L), bArr, i10 + 4, i11 - 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x007f, code lost:
        if (r4 > 10) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r(int r4) {
        /*
            r3 = this;
            r0 = -3482333909917012819(0xcfac43c256196cad, double:-6.392239886847908E75)
            r3.f17231e = r0
            r0 = 2216346199247487646(0x1ec20b20216f029e, double:1.604250256667292E-160)
            r3.f17232f = r0
            r0 = -7364697282686394994(0x99cb56d75b315d8e, double:-2.0106609494103695E-184)
            r3.f17233g = r0
            r0 = 65953792586715988(0xea509ffab89354, double:2.9978976005667514E-304)
            r3.f17234h = r0
            r0 = -816286391624063116(0xf4abf7da08432774, double:-1.0252515228978657E254)
            r3.f17235i = r0
            r0 = 4512832404995164602(0x3ea0cd298e9bc9ba, double:5.007211971427005E-7)
            r3.f17236j = r0
            r0 = -5033199132376557362(0xba267c0e5ee418ce, double:-1.418977391716189E-28)
            r3.f17237k = r0
            r0 = -124578254951840548(0xfe4568bcb6db84dc, double:-1.7921927020935902E300)
            r3.f17238l = r0
            r0 = 83
            r3.update(r0)
            r0 = 72
            r3.update(r0)
            r0 = 65
            r3.update(r0)
            r0 = 45
            r3.update(r0)
            r0 = 53
            r3.update(r0)
            r0 = 49
            r3.update(r0)
            r0 = 50
            r3.update(r0)
            r0 = 47
            r3.update(r0)
            r0 = 100
            r1 = 10
            if (r4 <= r0) goto L7f
            int r2 = r4 / 100
            int r2 = r2 + 48
            byte r2 = (byte) r2
            r3.update(r2)
            int r4 = r4 % r0
        L6f:
            int r0 = r4 / 10
            int r0 = r0 + 48
            byte r0 = (byte) r0
            r3.update(r0)
            int r4 = r4 % r1
        L78:
            int r4 = r4 + 48
            byte r4 = (byte) r4
            r3.update(r4)
            goto L82
        L7f:
            if (r4 <= r1) goto L78
            goto L6f
        L82:
            r3.l()
            long r0 = r3.f17231e
            r3.f17097q = r0
            long r0 = r3.f17232f
            r3.f17098r = r0
            long r0 = r3.f17233g
            r3.f17099s = r0
            long r0 = r3.f17234h
            r3.f17100t = r0
            long r0 = r3.f17235i
            r3.f17101u = r0
            long r0 = r3.f17236j
            r3.f17102v = r0
            long r0 = r3.f17237k
            r3.f17103w = r0
            long r0 = r3.f17238l
            r3.f17104x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.b0.r(int):void");
    }

    @Override // ak.i
    public ak.i a() {
        return new b0(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        b0 b0Var = (b0) iVar;
        if (this.f17096p == b0Var.f17096p) {
            super.k(b0Var);
            this.f17097q = b0Var.f17097q;
            this.f17098r = b0Var.f17098r;
            this.f17099s = b0Var.f17099s;
            this.f17100t = b0Var.f17100t;
            this.f17101u = b0Var.f17101u;
            this.f17102v = b0Var.f17102v;
            this.f17103w = b0Var.f17103w;
            this.f17104x = b0Var.f17104x;
            return;
        }
        throw new ak.j("digestLength inappropriate in other");
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        l();
        q(this.f17231e, bArr, i10, this.f17096p);
        q(this.f17232f, bArr, i10 + 8, this.f17096p - 8);
        q(this.f17233g, bArr, i10 + 16, this.f17096p - 16);
        q(this.f17234h, bArr, i10 + 24, this.f17096p - 24);
        q(this.f17235i, bArr, i10 + 32, this.f17096p - 32);
        q(this.f17236j, bArr, i10 + 40, this.f17096p - 40);
        q(this.f17237k, bArr, i10 + 48, this.f17096p - 48);
        q(this.f17238l, bArr, i10 + 56, this.f17096p - 56);
        reset();
        return this.f17096p;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.f17096p * 8);
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17096p;
    }

    @Override // nh.m, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17231e = this.f17097q;
        this.f17232f = this.f17098r;
        this.f17233g = this.f17099s;
        this.f17234h = this.f17100t;
        this.f17235i = this.f17101u;
        this.f17236j = this.f17102v;
        this.f17237k = this.f17103w;
        this.f17238l = this.f17104x;
    }
}
