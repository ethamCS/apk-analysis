package xk;

import fl.d;
import java.lang.reflect.Array;
import rk.n;
/* loaded from: classes3.dex */
public class b implements d<n> {

    /* renamed from: a */
    protected double[][] f25688a;

    /* renamed from: b */
    protected double[] f25689b;

    /* renamed from: c */
    protected int f25690c;

    /* renamed from: d */
    protected int f25691d;

    /* renamed from: e */
    protected int f25692e;

    /* renamed from: f */
    protected double[] f25693f;

    /* renamed from: g */
    protected double f25694g;

    /* renamed from: h */
    protected double f25695h;

    public void l(n nVar) {
        for (int i10 = 0; i10 < this.f25690c; i10++) {
            double[] dArr = this.f25688a[i10];
            for (int i11 = 0; i11 < this.f25691d; i11++) {
                dArr[i11] = nVar.f21296c[(nVar.f21298q * i11) + i10];
            }
        }
    }

    /* renamed from: m */
    public n e(n nVar, boolean z10) {
        n a10 = uk.a.a(nVar, z10 ? this.f25692e : this.f25691d, this.f25690c);
        for (int i10 = 0; i10 < this.f25690c; i10++) {
            double[] dArr = this.f25688a[i10];
            int min = Math.min(i10, this.f25691d - 1);
            for (int i11 = 0; i11 <= min; i11++) {
                a10.F(i11, i10, dArr[i11]);
            }
        }
        return a10;
    }

    public void n(int i10, int i11) {
        this.f25690c = i11;
        this.f25691d = i10;
        this.f25692e = Math.min(i11, i10);
        int max = Math.max(i11, i10);
        double[][] dArr = this.f25688a;
        if (dArr == null || dArr.length < i11 || dArr[0].length < i10) {
            this.f25688a = (double[][]) Array.newInstance(double.class, i11, i10);
            this.f25689b = new double[max];
            this.f25693f = new double[this.f25692e];
        }
        if (this.f25689b.length < max) {
            this.f25689b = new double[max];
        }
        int length = this.f25693f.length;
        int i12 = this.f25692e;
        if (length < i12) {
            this.f25693f = new double[i12];
        }
    }

    public void o(int i10) {
        double[] dArr = this.f25688a[i10];
        int i11 = i10 + 1;
        for (int i12 = i11; i12 < this.f25690c; i12++) {
            double[] dArr2 = this.f25688a[i12];
            double d10 = dArr2[i10];
            for (int i13 = i11; i13 < this.f25691d; i13++) {
                d10 += dArr[i13] * dArr2[i13];
            }
            double d11 = d10 * this.f25694g;
            dArr2[i10] = dArr2[i10] - d11;
            for (int i14 = i11; i14 < this.f25691d; i14++) {
                dArr2[i14] = dArr2[i14] - (dArr[i14] * d11);
            }
        }
    }
}
