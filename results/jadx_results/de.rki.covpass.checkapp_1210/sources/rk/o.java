package rk;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class o implements k, d0 {
    public int U3;
    public boolean V3;

    /* renamed from: c */
    public double[] f21300c;

    /* renamed from: d */
    public int f21301d;

    /* renamed from: q */
    public int[] f21302q;

    /* renamed from: x */
    public int[] f21303x;

    /* renamed from: y */
    public int f21304y;

    public o(int i10, int i11) {
        this(i10, i11, 0);
    }

    public o(int i10, int i11, int i12) {
        this.f21300c = pk.d.f19279r;
        this.f21302q = pk.d.f19277p;
        this.V3 = false;
        if (i10 < 0 || i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Rows, columns, and arrayLength must be not be negative");
        }
        this.f21304y = i10;
        this.U3 = i11;
        this.f21301d = 0;
        this.f21303x = new int[i11 + 1];
        e(i12, false);
    }

    public o(o oVar) {
        this(oVar.f21304y, oVar.U3, oVar.f21301d);
        h(oVar);
    }

    @Override // rk.k
    public void F(int i10, int i11, double d10) {
        if (i10 < 0 || i10 >= this.f21304y || i11 < 0 || i11 >= this.U3) {
            throw new IllegalArgumentException("Outside of matrix bounds");
        }
        L(i10, i11, d10);
    }

    @Override // rk.k
    public void L(int i10, int i11, double d10) {
        int f10 = f(i10, i11);
        if (f10 >= 0) {
            this.f21300c[f10] = d10;
            return;
        }
        int[] iArr = this.f21303x;
        int i12 = iArr[i11];
        int i13 = i11 + 1;
        int i14 = iArr[i13];
        while (i12 < i14 && i10 >= this.f21302q[i12]) {
            i12++;
        }
        while (i13 <= this.U3) {
            int[] iArr2 = this.f21303x;
            iArr2[i13] = iArr2[i13] + 1;
            i13++;
        }
        int i15 = this.f21301d;
        if (i15 >= this.f21300c.length) {
            e((i15 * 2) + 1, true);
        }
        for (int i16 = this.f21301d; i16 > i12; i16--) {
            int[] iArr3 = this.f21302q;
            int i17 = i16 - 1;
            iArr3[i16] = iArr3[i17];
            double[] dArr = this.f21300c;
            dArr[i16] = dArr[i17];
        }
        this.f21302q[i12] = i10;
        this.f21300c[i12] = d10;
        this.f21301d++;
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        g(i10, i11, 0);
    }

    @Override // rk.c0
    public int Z() {
        return this.f21304y;
    }

    @Override // rk.d0
    public int a0() {
        return this.f21301d;
    }

    /* renamed from: b */
    public o a() {
        return new o(this);
    }

    /* renamed from: c */
    public o T(int i10, int i11) {
        return new o(i10, i11);
    }

    @Override // rk.k
    public double d(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f21304y || i11 < 0 || i11 >= this.U3) {
            throw new IllegalArgumentException("Outside of matrix bounds");
        }
        return l(i10, i11);
    }

    public void e(int i10, boolean z10) {
        if (i10 >= 0) {
            double[] dArr = this.f21300c;
            if (i10 <= dArr.length) {
                return;
            }
            double[] dArr2 = new double[i10];
            int[] iArr = new int[i10];
            if (z10) {
                System.arraycopy(dArr, 0, dArr2, 0, this.f21301d);
                System.arraycopy(this.f21302q, 0, iArr, 0, this.f21301d);
            }
            this.f21300c = dArr2;
            this.f21302q = iArr;
            return;
        }
        throw new IllegalArgumentException("Negative array length. Overflow?");
    }

    public int f(int i10, int i11) {
        int[] iArr = this.f21303x;
        int i12 = iArr[i11];
        int i13 = iArr[i11 + 1];
        if (this.V3) {
            return Arrays.binarySearch(this.f21302q, i12, i13, i10);
        }
        while (i12 < i13) {
            if (this.f21302q[i12] == i10) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public void g(int i10, int i11, int i12) {
        this.V3 = false;
        this.f21304y = i10;
        this.U3 = i11;
        e(i12, false);
        this.f21301d = 0;
        int i13 = i11 + 1;
        int[] iArr = this.f21303x;
        if (i13 > iArr.length) {
            this.f21303x = new int[i13];
        } else {
            Arrays.fill(iArr, 0, i13, 0);
        }
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.DSCC;
    }

    public void h(c0 c0Var) {
        o oVar = (o) c0Var;
        g(oVar.f21304y, oVar.U3, oVar.f21301d);
        int i10 = oVar.f21301d;
        this.f21301d = i10;
        System.arraycopy(oVar.f21300c, 0, this.f21300c, 0, i10);
        System.arraycopy(oVar.f21302q, 0, this.f21302q, 0, this.f21301d);
        System.arraycopy(oVar.f21303x, 0, this.f21303x, 0, this.U3 + 1);
        this.V3 = oVar.V3;
    }

    @Override // rk.k
    public double l(int i10, int i11) {
        int f10 = f(i10, i11);
        if (f10 >= 0) {
            return this.f21300c[f10];
        }
        return 0.0d;
    }

    @Override // rk.c0
    public int w() {
        return this.U3;
    }
}
