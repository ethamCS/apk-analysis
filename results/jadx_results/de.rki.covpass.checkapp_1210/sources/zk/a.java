package zk;

import java.util.Random;
import pk.d;
import rk.n;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b */
    protected n f27102b;

    /* renamed from: c */
    protected n f27103c;

    /* renamed from: d */
    protected int f27104d;

    /* renamed from: e */
    protected double f27105e;

    /* renamed from: f */
    protected int f27106f;

    /* renamed from: h */
    protected int f27108h;

    /* renamed from: i */
    protected int f27109i;

    /* renamed from: j */
    protected double[] f27110j;

    /* renamed from: k */
    protected double[] f27111k;

    /* renamed from: l */
    double f27112l;

    /* renamed from: m */
    protected int f27113m;

    /* renamed from: n */
    protected int f27114n;

    /* renamed from: o */
    int f27115o;

    /* renamed from: p */
    protected int[] f27116p;

    /* renamed from: q */
    protected int f27117q;

    /* renamed from: t */
    boolean f27120t;

    /* renamed from: u */
    private double[] f27121u;

    /* renamed from: w */
    private boolean f27123w;

    /* renamed from: x */
    double f27124x;

    /* renamed from: y */
    double f27125y;

    /* renamed from: a */
    protected Random f27101a = new Random(3434270);

    /* renamed from: g */
    protected wk.a f27107g = new wk.a();

    /* renamed from: r */
    private int f27118r = 15;

    /* renamed from: s */
    private int f27119s = 15 * 100;

    /* renamed from: v */
    private boolean f27122v = false;

    private double c() {
        double[] dArr = this.f27110j;
        int i10 = this.f27113m;
        return Math.max(Math.abs(dArr[i10]), Math.abs(this.f27111k[i10]));
    }

    private void p() {
        if (!this.f27123w) {
            double c10 = c();
            q(c10, z(c10), false);
        } else if (this.f27115o > 6) {
            this.f27123w = false;
        } else {
            q(c(), 0.0d, false);
        }
    }

    private void r() {
        double c10 = c();
        if (this.f27115o > 10) {
            this.f27120t = false;
            return;
        }
        double d10 = this.f27121u[this.f27114n] / c10;
        q(c10, d10 * d10, false);
    }

    private void t(int i10) {
        if (n(i10)) {
            return;
        }
        x(i10);
        int i11 = (this.f27106f - 2) - i10;
        for (int i12 = 0; i12 < i11 && this.f27112l != 0.0d; i12++) {
            y(i10, i12 + 2);
        }
    }

    private void x(int i10) {
        double d10 = this.f27111k[i10];
        int i11 = i10 + 1;
        double d11 = this.f27110j[i11];
        d(d11, -d10);
        double[] dArr = this.f27111k;
        dArr[i10] = 0.0d;
        double[] dArr2 = this.f27110j;
        double d12 = this.f27124x;
        double d13 = this.f27125y;
        dArr2[i11] = (d11 * d12) - (d10 * d13);
        if (i10 + 2 < this.f27106f) {
            double d14 = dArr[i11];
            dArr[i11] = d14 * d12;
            this.f27112l = d14 * d13;
        } else {
            this.f27112l = 0.0d;
        }
        n nVar = this.f27102b;
        if (nVar != null) {
            F(nVar, i10, i11, d12, d13);
        }
    }

    private void y(int i10, int i11) {
        double d10 = this.f27112l;
        int i12 = i10 + i11;
        double d11 = this.f27110j[i12];
        d(d11, -d10);
        double[] dArr = this.f27110j;
        double d12 = this.f27124x;
        double d13 = this.f27125y;
        dArr[i12] = (d11 * d12) - (d10 * d13);
        if (i12 < this.f27106f - 1) {
            double[] dArr2 = this.f27111k;
            double d14 = dArr2[i12];
            dArr2[i12] = d14 * d12;
            this.f27112l = d14 * d13;
        }
        n nVar = this.f27102b;
        if (nVar != null) {
            F(nVar, i10, i12, d12, d13);
        }
    }

    public void A(boolean z10) {
        this.f27122v = z10;
    }

    public void B(int i10, int i11, double[] dArr, double[] dArr2) {
        l(i10, i11);
        this.f27110j = dArr;
        this.f27111k = dArr2;
        this.f27105e = Math.abs(dArr[0]);
        for (int i12 = 1; i12 < this.f27106f; i12++) {
            double abs = Math.abs(dArr[i12]);
            double abs2 = Math.abs(dArr2[i12 - 1]);
            if (abs > this.f27105e) {
                this.f27105e = Math.abs(abs);
            }
            if (abs2 > this.f27105e) {
                this.f27105e = Math.abs(abs2);
            }
        }
    }

    public void C(int i10, int i11) {
        this.f27113m = i10;
        this.f27114n = i11;
    }

    public void D(n nVar) {
        this.f27102b = nVar;
    }

    public void E(n nVar) {
        this.f27103c = nVar;
    }

    protected void F(n nVar, int i10, int i11, double d10, double d11) {
        int i12 = nVar.f21298q;
        int i13 = i10 * i12;
        int i14 = i11 * i12;
        int i15 = i12 + i13;
        while (i13 != i15) {
            double b10 = nVar.b(i13);
            double b11 = nVar.b(i14);
            nVar.f(i13, (d10 * b10) + (d11 * b11));
            nVar.f(i14, ((-d11) * b10) + (d10 * b11));
            i13++;
            i14++;
        }
    }

    public boolean a() {
        if (this.f27105e == 0.0d) {
            return true;
        }
        while (true) {
            int i10 = this.f27114n;
            if (i10 < 0) {
                break;
            }
            int i11 = this.f27115o;
            if (i11 > this.f27119s) {
                return false;
            }
            int i12 = this.f27113m;
            if (i12 == i10) {
                w();
                if (!o()) {
                    break;
                }
            } else if (this.f27122v && i10 - i12 == 1) {
                w();
                f(this.f27113m);
                int i13 = this.f27114n;
                C(i13, i13);
            } else if (i11 >= this.f27109i) {
                g();
            } else if (!b()) {
                if (this.f27120t) {
                    r();
                } else {
                    p();
                }
            }
        }
        return true;
    }

    protected boolean b() {
        int i10 = this.f27114n - 1;
        while (true) {
            if (i10 < this.f27113m) {
                i10 = this.f27114n - 1;
                while (i10 >= this.f27113m) {
                    if (m(i10)) {
                        t(i10);
                        w();
                        int[] iArr = this.f27116p;
                        int i11 = this.f27117q;
                        this.f27117q = i11 + 1;
                        iArr[i11] = i10;
                    } else {
                        i10--;
                    }
                }
                return false;
            } else if (n(i10)) {
                w();
                int[] iArr2 = this.f27116p;
                int i12 = this.f27117q;
                this.f27117q = i12 + 1;
                iArr2[i12] = i10;
                break;
            } else {
                i10--;
            }
        }
        this.f27113m = i10 + 1;
        return true;
    }

    protected void d(double d10, double d11) {
        if (Math.abs(d10) < Math.abs(d11)) {
            double d12 = d10 / d11;
            double sqrt = Math.sqrt((d12 * d12) + 1.0d);
            this.f27125y = 1.0d / sqrt;
            this.f27124x = d12 / sqrt;
            return;
        }
        double d13 = d11 / d10;
        double sqrt2 = Math.sqrt((d13 * d13) + 1.0d);
        this.f27124x = 1.0d / sqrt2;
        this.f27125y = d13 / sqrt2;
    }

    protected void e(int i10, double d10, double d11, boolean z10) {
        double[] dArr = this.f27110j;
        double d12 = dArr[i10];
        double d13 = this.f27111k[i10];
        int i11 = i10 + 1;
        double d14 = dArr[i11];
        if (z10) {
            this.f27124x = Math.cos(d10);
            this.f27125y = Math.sin(d10);
        } else {
            double d15 = d12 / d11;
            double d16 = (d15 * d15) - d10;
            double d17 = (d13 / d11) * d15;
            double sqrt = Math.sqrt((d16 * d16) + (d17 * d17));
            this.f27124x = d16 / sqrt;
            this.f27125y = d17 / sqrt;
        }
        double[] dArr2 = this.f27110j;
        double d18 = this.f27124x;
        double d19 = this.f27125y;
        dArr2[i10] = (d12 * d18) + (d13 * d19);
        this.f27111k[i10] = (d13 * d18) - (d12 * d19);
        dArr2[i11] = d14 * d18;
        this.f27112l = d14 * d19;
        n nVar = this.f27103c;
        if (nVar != null) {
            F(nVar, i10, i11, d18, d19);
        }
    }

    protected void f(int i10) {
        double[] dArr = this.f27110j;
        double d10 = dArr[i10];
        double d11 = this.f27111k[i10];
        int i11 = i10 + 1;
        double d12 = dArr[i11];
        double abs = Math.abs(d10);
        double abs2 = Math.abs(d11);
        double abs3 = Math.abs(d12);
        if (abs <= abs2) {
            abs = abs2;
        }
        if (abs3 <= abs) {
            abs3 = abs;
        }
        if (abs3 == 0.0d) {
            return;
        }
        double d13 = d10 / abs3;
        double d14 = d11 / abs3;
        double d15 = d12 / abs3;
        this.f27107g.a(d13 * d13, d13 * d14, (d14 * d14) + (d15 * d15));
        this.f27111k[i10] = 0.0d;
        this.f27110j[i10] = Math.sqrt(this.f27107g.f25318a.f21284a) * abs3;
        this.f27110j[i11] = Math.signum(this.f27107g.f25319b.f21284a) * abs3 * Math.sqrt(Math.abs(this.f27107g.f25319b.f21284a));
    }

    public void g() {
        int i10 = this.f27108h + 1;
        this.f27108h = i10;
        double d10 = i10 * 0.05d;
        if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        q(0.0d, d.f19264c * 2.0d * (this.f27101a.nextDouble() - 0.5d) * d10, true);
        this.f27109i = this.f27115o + this.f27118r;
    }

    public int h() {
        return this.f27106f;
    }

    public double i(int i10) {
        return this.f27110j[i10];
    }

    public double[] j() {
        return this.f27110j;
    }

    public void k() {
        this.f27115o++;
        this.f27104d++;
    }

    public void l(int i10, int i11) {
        if (i11 <= i10) {
            this.f27106f = i11;
            int[] iArr = this.f27116p;
            if (iArr == null || iArr.length < i11) {
                this.f27116p = new int[i11];
            }
            this.f27113m = 0;
            this.f27114n = i11 - 1;
            this.f27115o = 0;
            this.f27104d = 0;
            this.f27117q = 0;
            this.f27108h = 0;
            this.f27109i = this.f27118r;
            return;
        }
        throw new RuntimeException("Must be a square or tall matrix");
    }

    public boolean m(int i10) {
        return Math.abs(this.f27110j[i10]) <= (Math.abs(this.f27110j[i10 + 1]) + Math.abs(this.f27111k[i10])) * d.f19262a;
    }

    public boolean n(int i10) {
        return Math.abs(this.f27111k[i10]) <= (Math.abs(this.f27110j[i10]) + Math.abs(this.f27110j[i10 + 1])) * d.f19262a;
    }

    public boolean o() {
        int i10 = this.f27117q;
        if (i10 == 0) {
            return false;
        }
        int[] iArr = this.f27116p;
        int i11 = i10 - 1;
        this.f27117q = i11;
        this.f27114n = iArr[i11];
        if (i11 > 0) {
            this.f27113m = iArr[i11 - 1] + 1;
        } else {
            this.f27113m = 0;
        }
        return true;
    }

    public void q(double d10, double d11, boolean z10) {
        e(this.f27113m, d11, d10, z10);
        for (int i10 = this.f27113m; i10 < this.f27114n - 1 && this.f27112l != 0.0d; i10++) {
            u(i10, true);
            if (this.f27112l == 0.0d) {
                break;
            }
            v(i10);
        }
        if (this.f27112l != 0.0d) {
            u(this.f27114n - 1, false);
        }
        k();
    }

    public boolean s() {
        this.f27120t = false;
        this.f27123w = true;
        return a();
    }

    protected void u(int i10, boolean z10) {
        double[] dArr = this.f27110j;
        double d10 = dArr[i10];
        double d11 = this.f27111k[i10];
        int i11 = i10 + 1;
        double d12 = dArr[i11];
        d(d10, this.f27112l);
        double[] dArr2 = this.f27110j;
        double d13 = this.f27124x;
        double d14 = this.f27125y;
        dArr2[i10] = (d10 * d13) + (this.f27112l * d14);
        double[] dArr3 = this.f27111k;
        dArr3[i10] = (d13 * d11) + (d14 * d12);
        dArr2[i11] = (d12 * d13) - (d11 * d14);
        if (z10) {
            double d15 = dArr3[i11];
            this.f27112l = d14 * d15;
            dArr3[i11] = d15 * d13;
        }
        n nVar = this.f27102b;
        if (nVar != null) {
            F(nVar, i10, i11, d13, d14);
        }
    }

    protected void v(int i10) {
        double[] dArr = this.f27111k;
        double d10 = dArr[i10];
        int i11 = i10 + 1;
        double d11 = this.f27110j[i11];
        double d12 = dArr[i11];
        d(d10, this.f27112l);
        double[] dArr2 = this.f27111k;
        double d13 = this.f27124x;
        double d14 = this.f27112l;
        double d15 = this.f27125y;
        dArr2[i10] = (d10 * d13) + (d14 * d15);
        double[] dArr3 = this.f27110j;
        dArr3[i11] = (d11 * d13) + (d12 * d15);
        dArr2[i11] = ((-d11) * d15) + (d12 * d13);
        int i12 = i10 + 2;
        double d16 = dArr3[i12];
        dArr3[i12] = d16 * d13;
        this.f27112l = d16 * d15;
        n nVar = this.f27103c;
        if (nVar != null) {
            F(nVar, i11, i12, d13, d15);
        }
    }

    public void w() {
        this.f27115o = 0;
        this.f27109i = this.f27118r;
        this.f27108h = 0;
    }

    public double z(double d10) {
        double d11;
        int i10 = this.f27114n;
        if (i10 - this.f27113m > 1) {
            double[] dArr = this.f27110j;
            double d12 = dArr[i10 - 1] / d10;
            double[] dArr2 = this.f27111k;
            double d13 = dArr2[i10 - 2] / d10;
            double d14 = dArr[i10] / d10;
            double d15 = dArr2[i10 - 1] / d10;
            d11 = (d15 * d15) + (d14 * d14);
            this.f27107g.a((d13 * d13) + (d12 * d12), d15 * d12, d11);
        } else {
            double[] dArr3 = this.f27110j;
            double d16 = dArr3[i10 - 1] / d10;
            double d17 = this.f27111k[i10 - 1] / d10;
            double d18 = dArr3[i10] / d10;
            double d19 = (d18 * d18) + (d17 * d17);
            this.f27107g.a(d16 * d16, d16 * d17, d19);
            d11 = d19;
        }
        return (Math.abs(this.f27107g.f25318a.f21284a - d11) < Math.abs(this.f27107g.f25319b.f21284a - d11) ? this.f27107g.f25318a : this.f27107g.f25319b).f21284a;
    }
}
