package rk;
/* loaded from: classes3.dex */
public class p implements k, d0 {

    /* renamed from: c */
    public b0 f21305c = new b0();

    /* renamed from: d */
    public g f21306d = new g();

    /* renamed from: q */
    public int f21307q;

    /* renamed from: x */
    public int f21308x;

    /* renamed from: y */
    public int f21309y;

    public p() {
    }

    public p(int i10, int i11, int i12) {
        this.f21305c.b(i12 * 2);
        this.f21306d.b(i12);
        this.f21308x = i10;
        this.f21309y = i11;
    }

    public p(p pVar) {
        e(pVar);
    }

    @Override // rk.k
    public void F(int i10, int i11, double d10) {
        if (i10 < 0 || i10 >= this.f21308x || i11 < 0 || i11 >= this.f21309y) {
            throw new IllegalArgumentException("Outside of matrix bounds");
        }
        L(i10, i11, d10);
    }

    @Override // rk.k
    public void L(int i10, int i11, double d10) {
        int c10 = c(i10, i11);
        if (c10 < 0) {
            b(i10, i11, d10);
        } else {
            this.f21306d.f21286a[c10] = d10;
        }
    }

    @Override // rk.c0
    public <T extends c0> T T(int i10, int i11) {
        return new p(i10, i11, 1);
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        this.f21308x = i10;
        this.f21309y = i11;
        this.f21307q = 0;
    }

    @Override // rk.c0
    public int Z() {
        return this.f21308x;
    }

    @Override // rk.c0
    public <T extends c0> T a() {
        return new p(this);
    }

    @Override // rk.d0
    public int a0() {
        return this.f21307q;
    }

    public void b(int i10, int i11, double d10) {
        int i12 = this.f21307q;
        g gVar = this.f21306d;
        if (i12 == gVar.f21286a.length) {
            int i13 = i12 + 10;
            gVar.a(i13);
            this.f21305c.a(i13 * 2);
        }
        double[] dArr = this.f21306d.f21286a;
        int i14 = this.f21307q;
        dArr[i14] = d10;
        int[] iArr = this.f21305c.f21265a;
        iArr[i14 * 2] = i10;
        iArr[(i14 * 2) + 1] = i11;
        this.f21307q = i14 + 1;
    }

    public int c(int i10, int i11) {
        int i12 = this.f21307q * 2;
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int[] iArr = this.f21305c.f21265a;
            int i14 = iArr[i13];
            int i15 = iArr[i13 + 1];
            if (i14 == i10 && i15 == i11) {
                return i13 / 2;
            }
        }
        return -1;
    }

    @Override // rk.k
    public double d(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f21308x || i11 < 0 || i11 >= this.f21309y) {
            throw new IllegalArgumentException("Outside of matrix bounds");
        }
        return l(i10, i11);
    }

    public void e(c0 c0Var) {
        p pVar = (p) c0Var;
        U(pVar.f21308x, pVar.f21309y);
        this.f21305c.c(pVar.f21305c);
        this.f21306d.c(pVar.f21306d);
        this.f21307q = pVar.f21307q;
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.DTRIPLET;
    }

    @Override // rk.k
    public double l(int i10, int i11) {
        int c10 = c(i10, i11);
        if (c10 < 0) {
            return 0.0d;
        }
        return this.f21306d.f21286a[c10];
    }

    @Override // rk.c0
    public int w() {
        return this.f21309y;
    }
}
