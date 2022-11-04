package rk;
/* loaded from: classes3.dex */
public class a0 implements v, d0 {

    /* renamed from: c */
    public b0 f21260c = new b0();

    /* renamed from: d */
    public r f21261d = new r();

    /* renamed from: q */
    public int f21262q;

    /* renamed from: x */
    public int f21263x;

    /* renamed from: y */
    public int f21264y;

    public a0() {
    }

    public a0(int i10, int i11, int i12) {
        this.f21260c.b(i12 * 2);
        this.f21261d.b(i12);
        this.f21263x = i10;
        this.f21264y = i11;
    }

    public a0(a0 a0Var) {
        e(a0Var);
    }

    @Override // rk.v
    public void K(int i10, int i11, float f10) {
        int c10 = c(i10, i11);
        if (c10 < 0) {
            b(i10, i11, f10);
        } else {
            this.f21261d.f21310a[c10] = f10;
        }
    }

    @Override // rk.c0
    public <T extends c0> T T(int i10, int i11) {
        return new a0(i10, i11, 1);
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        this.f21263x = i10;
        this.f21264y = i11;
        this.f21262q = 0;
    }

    @Override // rk.c0
    public int Z() {
        return this.f21263x;
    }

    @Override // rk.c0
    public <T extends c0> T a() {
        return new a0(this);
    }

    @Override // rk.d0
    public int a0() {
        return this.f21262q;
    }

    public void b(int i10, int i11, float f10) {
        int i12 = this.f21262q;
        r rVar = this.f21261d;
        if (i12 == rVar.f21310a.length) {
            int i13 = i12 + 10;
            rVar.a(i13);
            this.f21260c.a(i13 * 2);
        }
        float[] fArr = this.f21261d.f21310a;
        int i14 = this.f21262q;
        fArr[i14] = f10;
        int[] iArr = this.f21260c.f21265a;
        iArr[i14 * 2] = i10;
        iArr[(i14 * 2) + 1] = i11;
        this.f21262q = i14 + 1;
    }

    public int c(int i10, int i11) {
        int i12 = this.f21262q * 2;
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int[] iArr = this.f21260c.f21265a;
            int i14 = iArr[i13];
            int i15 = iArr[i13 + 1];
            if (i14 == i10 && i15 == i11) {
                return i13 / 2;
            }
        }
        return -1;
    }

    @Override // rk.v
    public float d(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f21263x || i11 < 0 || i11 >= this.f21264y) {
            throw new IllegalArgumentException("Outside of matrix bounds");
        }
        return l(i10, i11);
    }

    public void e(c0 c0Var) {
        a0 a0Var = (a0) c0Var;
        U(a0Var.f21263x, a0Var.f21264y);
        this.f21260c.c(a0Var.f21260c);
        this.f21261d.c(a0Var.f21261d);
        this.f21262q = a0Var.f21262q;
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.FTRIPLET;
    }

    @Override // rk.v
    public float l(int i10, int i11) {
        int c10 = c(i10, i11);
        if (c10 < 0) {
            return 0.0f;
        }
        return this.f21261d.f21310a[c10];
    }

    @Override // rk.c0
    public int w() {
        return this.f21264y;
    }
}
