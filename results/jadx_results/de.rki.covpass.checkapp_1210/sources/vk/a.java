package vk;

import rk.n;
import xk.c;
/* loaded from: classes3.dex */
public class a implements fl.b<n> {

    /* renamed from: a */
    private n f24389a;

    /* renamed from: b */
    private int f24390b;

    /* renamed from: c */
    private int f24391c;

    /* renamed from: d */
    private int f24392d;

    /* renamed from: e */
    private double[] f24393e;

    /* renamed from: f */
    private double[] f24394f;

    /* renamed from: g */
    protected double[] f24395g;

    /* renamed from: h */
    protected double[] f24396h;

    public a() {
        this(1);
    }

    public a(int i10) {
        this.f24389a = new n(i10);
        this.f24393e = new double[i10];
        this.f24394f = new double[i10];
        this.f24395g = new double[i10];
        this.f24396h = new double[i10];
    }

    private boolean l() {
        for (int i10 = 0; i10 < this.f24392d; i10++) {
            m(i10);
            n(i10);
        }
        return true;
    }

    public static n r(n nVar, boolean z10, boolean z11, int i10, int i11, int i12) {
        if (!z11) {
            if (nVar == null) {
                return new n(i10, i10);
            }
            nVar.e(i10, i10, false);
            return nVar;
        } else if (z10) {
            if (nVar == null) {
                return new n(i12, i10);
            }
            nVar.e(i12, i10, false);
            return nVar;
        } else if (nVar == null) {
            return new n(i10, i12);
        } else {
            nVar.e(i10, i12, false);
            return nVar;
        }
    }

    public static n s(n nVar, boolean z10, boolean z11, int i10, int i11, int i12) {
        if (i11 > i10) {
            i12++;
        }
        if (!z11) {
            if (nVar == null) {
                return new n(i11, i11);
            }
            nVar.e(i11, i11, false);
            return nVar;
        } else if (z10) {
            if (nVar == null) {
                return new n(i12, i11);
            }
            nVar.e(i12, i11, false);
            return nVar;
        } else if (nVar == null) {
            return new n(i11, i12);
        } else {
            nVar.e(i11, i12, false);
            return nVar;
        }
    }

    @Override // fl.b
    public void j(double[] dArr, double[] dArr2) {
        dArr[0] = this.f24389a.b(0);
        for (int i10 = 1; i10 < this.f24391c; i10++) {
            dArr[i10] = this.f24389a.l(i10, i10);
            int i11 = i10 - 1;
            dArr2[i11] = this.f24389a.l(i11, i10);
        }
    }

    protected void m(int i10) {
        int i11;
        double[] dArr = this.f24389a.f21296c;
        double d10 = 0.0d;
        int i12 = i10;
        while (true) {
            i11 = this.f24390b;
            if (i12 >= i11) {
                break;
            }
            double[] dArr2 = this.f24396h;
            double d11 = dArr[(this.f24391c * i12) + i10];
            dArr2[i12] = d11;
            double abs = Math.abs(d11);
            if (abs > d10) {
                d10 = abs;
            }
            i12++;
        }
        if (d10 <= 0.0d) {
            this.f24393e[i10] = 0.0d;
            return;
        }
        double a10 = c.a(i10, i11, this.f24396h, d10);
        double[] dArr3 = this.f24396h;
        double d12 = dArr3[i10] + a10;
        int i13 = i10 + 1;
        c.d(i13, this.f24390b, this.f24391c, dArr3, dArr, i10, d12);
        this.f24396h[i10] = 1.0d;
        double d13 = d12 / a10;
        this.f24393e[i10] = d13;
        v(this.f24389a, d13, i13, i10, this.f24390b);
        dArr[(this.f24391c * i10) + i10] = (-a10) * d10;
    }

    protected void n(int i10) {
        double[] dArr = this.f24389a.f21296c;
        int i11 = this.f24391c;
        int i12 = i10 * i11;
        int i13 = i12 + i10 + 1;
        double f10 = c.f(dArr, i13, (i11 - i10) - 1);
        if (f10 <= 0.0d) {
            this.f24394f[i10] = 0.0d;
            return;
        }
        int i14 = i10 + 1;
        double b10 = c.b(i14, this.f24391c, dArr, i12, f10);
        double d10 = dArr[i13] + b10;
        c.e(i10 + 2, this.f24391c, this.f24396h, dArr, i12, d10);
        this.f24396h[i14] = 1.0d;
        double d11 = d10 / b10;
        this.f24394f[i10] = d11;
        u(this.f24389a, d11, i14, i14, this.f24391c);
        dArr[i13] = (-b10) * f10;
    }

    /* renamed from: o */
    public boolean d(n nVar) {
        t(nVar);
        return l();
    }

    /* renamed from: p */
    public n c(n nVar, boolean z10, boolean z11) {
        int i10;
        n r10 = r(nVar, z10, z11, this.f24390b, this.f24391c, this.f24392d);
        tk.b.k(r10);
        for (int i11 = 0; i11 < this.f24390b; i11++) {
            this.f24396h[i11] = 0.0d;
        }
        for (int i12 = this.f24392d - 1; i12 >= 0; i12--) {
            this.f24396h[i12] = 1.0d;
            int i13 = i12 + 1;
            while (true) {
                i10 = this.f24390b;
                if (i13 >= i10) {
                    break;
                }
                this.f24396h[i13] = this.f24389a.d(i13, i12);
                i13++;
            }
            double[] dArr = this.f24393e;
            if (z10) {
                u(r10, dArr[i12], i12, i12, i10);
            } else {
                v(r10, dArr[i12], i12, i12, i10);
            }
        }
        return r10;
    }

    /* renamed from: q */
    public n g(n nVar, boolean z10, boolean z11) {
        int i10;
        n s10 = s(nVar, z10, z11, this.f24390b, this.f24391c, this.f24392d);
        tk.b.k(s10);
        for (int i11 = this.f24392d - 1; i11 >= 0; i11--) {
            int i12 = i11 + 1;
            this.f24396h[i12] = 1.0d;
            int i13 = i11 + 2;
            while (true) {
                i10 = this.f24391c;
                if (i13 >= i10) {
                    break;
                }
                this.f24396h[i13] = this.f24389a.d(i11, i13);
                i13++;
            }
            double[] dArr = this.f24394f;
            if (z10) {
                u(s10, dArr[i11], i12, i12, i10);
            } else {
                v(s10, dArr[i11], i12, i12, i10);
            }
        }
        return s10;
    }

    protected void t(n nVar) {
        this.f24389a = nVar;
        int i10 = nVar.f21297d;
        this.f24390b = i10;
        int i11 = nVar.f21298q;
        this.f24391c = i11;
        this.f24392d = Math.min(i10, i11);
        int max = Math.max(this.f24390b, this.f24391c) + 1;
        if (this.f24395g.length < max) {
            this.f24395g = new double[max];
            this.f24396h = new double[max];
        }
        int length = this.f24393e.length;
        int i12 = this.f24390b;
        if (length < i12) {
            this.f24393e = new double[i12];
        }
        int length2 = this.f24394f.length;
        int i13 = this.f24391c;
        if (length2 < i13) {
            this.f24394f = new double[i13];
        }
    }

    protected void u(n nVar, double d10, int i10, int i11, int i12) {
        c.g(nVar, this.f24396h, d10, i10, i11, i12);
    }

    protected void v(n nVar, double d10, int i10, int i11, int i12) {
        c.h(nVar, this.f24396h, d10, i10, i11, i12, this.f24395g);
    }
}
