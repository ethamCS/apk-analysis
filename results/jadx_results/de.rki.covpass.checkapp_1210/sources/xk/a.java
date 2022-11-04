package xk;

import fl.f;
import pk.d;
import rk.n;
/* loaded from: classes3.dex */
public class a extends b implements f<n> {

    /* renamed from: i */
    protected int[] f25683i;

    /* renamed from: j */
    protected double[] f25684j;

    /* renamed from: k */
    protected double f25685k = d.f19262a;

    /* renamed from: l */
    protected int f25686l;

    /* renamed from: m */
    double f25687m;

    @Override // xk.b
    public void n(int i10, int i11) {
        super.n(i10, i11);
        int[] iArr = this.f25683i;
        if (iArr == null || iArr.length < i11) {
            this.f25683i = new int[i11];
            this.f25684j = new double[i11];
        }
    }

    /* renamed from: p */
    public boolean d(n nVar) {
        n(nVar.f21297d, nVar.f21298q);
        this.f25687m = tk.b.b(nVar);
        l(nVar);
        t();
        int i10 = 0;
        while (i10 < this.f25692e) {
            if (i10 > 0) {
                v(i10);
            }
            u(i10);
            if (!s(i10)) {
                return true;
            }
            o(i10);
            i10++;
            this.f25686l = i10;
        }
        return true;
    }

    /* renamed from: q */
    public n a(n nVar) {
        if (nVar == null) {
            int i10 = this.f25690c;
            nVar = new n(i10, i10);
        } else {
            int i11 = nVar.f21297d;
            int i12 = this.f25690c;
            if (i11 != i12) {
                throw new IllegalArgumentException("Number of rows must be " + this.f25690c);
            } else if (nVar.f21298q != i12) {
                throw new IllegalArgumentException("Number of columns must be " + this.f25690c);
            } else {
                nVar.k();
            }
        }
        for (int i13 = 0; i13 < this.f25690c; i13++) {
            nVar.F(this.f25683i[i13], i13, 1.0d);
        }
        return nVar;
    }

    /* renamed from: r */
    public n k(n nVar, boolean z10) {
        n nVar2;
        if (z10) {
            nVar2 = uk.a.b(nVar, this.f25691d, this.f25692e);
        } else {
            int i10 = this.f25691d;
            nVar2 = uk.a.b(nVar, i10, i10);
        }
        for (int i11 = this.f25686l - 1; i11 >= 0; i11--) {
            double[] dArr = this.f25688a[i11];
            double d10 = dArr[i11];
            dArr[i11] = 1.0d;
            c.h(nVar2, dArr, this.f25693f[i11], i11, i11, this.f25691d, this.f25689b);
            dArr[i11] = d10;
        }
        return nVar2;
    }

    protected boolean s(int i10) {
        double[] dArr = this.f25688a[i10];
        double f10 = c.f(dArr, i10, this.f25691d - i10);
        if (f10 <= this.f25685k * this.f25687m) {
            return false;
        }
        double a10 = c.a(i10, this.f25691d, dArr, f10);
        this.f25695h = a10;
        double d10 = dArr[i10] + a10;
        c.c(i10 + 1, this.f25691d, dArr, d10);
        double d11 = this.f25695h;
        double d12 = d10 / d11;
        this.f25694g = d12;
        double d13 = d11 * f10;
        this.f25695h = d13;
        dArr[i10] = -d13;
        this.f25693f[i10] = d12;
        return true;
    }

    protected void t() {
        for (int i10 = 0; i10 < this.f25690c; i10++) {
            this.f25683i[i10] = i10;
            double[] dArr = this.f25688a[i10];
            double d10 = 0.0d;
            for (int i11 = 0; i11 < this.f25691d; i11++) {
                double d11 = dArr[i11];
                d10 += d11 * d11;
            }
            this.f25684j[i10] = d10;
        }
    }

    protected void u(int i10) {
        double d10 = this.f25684j[i10];
        int i11 = i10;
        for (int i12 = i10 + 1; i12 < this.f25690c; i12++) {
            double d11 = this.f25684j[i12];
            if (d11 > d10) {
                i11 = i12;
                d10 = d11;
            }
        }
        double[][] dArr = this.f25688a;
        double[] dArr2 = dArr[i10];
        dArr[i10] = dArr[i11];
        dArr[i11] = dArr2;
        double[] dArr3 = this.f25684j;
        double d12 = dArr3[i10];
        dArr3[i10] = dArr3[i11];
        dArr3[i11] = d12;
        int[] iArr = this.f25683i;
        int i13 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i13;
    }

    protected void v(int i10) {
        boolean z10;
        int i11 = i10;
        while (true) {
            if (i11 >= this.f25690c) {
                z10 = false;
                break;
            }
            double d10 = this.f25688a[i11][i10 - 1];
            double[] dArr = this.f25684j;
            double d11 = dArr[i11] - (d10 * d10);
            dArr[i11] = d11;
            if (d11 < 0.0d) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            for (int i12 = i10; i12 < this.f25690c; i12++) {
                double[] dArr2 = this.f25688a[i12];
                double d12 = 0.0d;
                for (int i13 = i10; i13 < this.f25691d; i13++) {
                    double d13 = dArr2[i13];
                    d12 += d13 * d13;
                }
                this.f25684j[i12] = d12;
            }
        }
    }
}
