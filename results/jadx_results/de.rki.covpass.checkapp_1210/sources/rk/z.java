package rk;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class z implements v, d0 {
    public int U3;
    public boolean V3;

    /* renamed from: c */
    public float[] f21321c;

    /* renamed from: d */
    public int f21322d;

    /* renamed from: q */
    public int[] f21323q;

    /* renamed from: x */
    public int[] f21324x;

    /* renamed from: y */
    public int f21325y;

    public z(int i10, int i11) {
        this(i10, i11, 0);
    }

    public z(int i10, int i11, int i12) {
        this.f21321c = pk.d.f19278q;
        this.f21323q = pk.d.f19277p;
        this.V3 = false;
        if (i10 < 0 || i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Rows, columns, and arrayLength must be not be negative");
        }
        this.f21325y = i10;
        this.U3 = i11;
        this.f21322d = 0;
        this.f21324x = new int[i11 + 1];
        e(i12, false);
    }

    public z(z zVar) {
        this(zVar.f21325y, zVar.U3, zVar.f21322d);
        h(zVar);
    }

    @Override // rk.v
    public void K(int i10, int i11, float f10) {
        int f11 = f(i10, i11);
        if (f11 >= 0) {
            this.f21321c[f11] = f10;
            return;
        }
        int[] iArr = this.f21324x;
        int i12 = iArr[i11];
        int i13 = i11 + 1;
        int i14 = iArr[i13];
        while (i12 < i14 && i10 >= this.f21323q[i12]) {
            i12++;
        }
        while (i13 <= this.U3) {
            int[] iArr2 = this.f21324x;
            iArr2[i13] = iArr2[i13] + 1;
            i13++;
        }
        int i15 = this.f21322d;
        if (i15 >= this.f21321c.length) {
            e((i15 * 2) + 1, true);
        }
        for (int i16 = this.f21322d; i16 > i12; i16--) {
            int[] iArr3 = this.f21323q;
            int i17 = i16 - 1;
            iArr3[i16] = iArr3[i17];
            float[] fArr = this.f21321c;
            fArr[i16] = fArr[i17];
        }
        this.f21323q[i12] = i10;
        this.f21321c[i12] = f10;
        this.f21322d++;
    }

    @Override // rk.f0
    public void U(int i10, int i11) {
        g(i10, i11, 0);
    }

    @Override // rk.c0
    public int Z() {
        return this.f21325y;
    }

    @Override // rk.d0
    public int a0() {
        return this.f21322d;
    }

    /* renamed from: b */
    public z a() {
        return new z(this);
    }

    /* renamed from: c */
    public z T(int i10, int i11) {
        return new z(i10, i11);
    }

    @Override // rk.v
    public float d(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f21325y || i11 < 0 || i11 >= this.U3) {
            throw new IllegalArgumentException("Outside of matrix bounds");
        }
        return l(i10, i11);
    }

    public void e(int i10, boolean z10) {
        if (i10 >= 0) {
            float[] fArr = this.f21321c;
            if (i10 <= fArr.length) {
                return;
            }
            float[] fArr2 = new float[i10];
            int[] iArr = new int[i10];
            if (z10) {
                System.arraycopy(fArr, 0, fArr2, 0, this.f21322d);
                System.arraycopy(this.f21323q, 0, iArr, 0, this.f21322d);
            }
            this.f21321c = fArr2;
            this.f21323q = iArr;
            return;
        }
        throw new IllegalArgumentException("Negative array length. Overflow?");
    }

    public int f(int i10, int i11) {
        int[] iArr = this.f21324x;
        int i12 = iArr[i11];
        int i13 = iArr[i11 + 1];
        if (this.V3) {
            return Arrays.binarySearch(this.f21323q, i12, i13, i10);
        }
        while (i12 < i13) {
            if (this.f21323q[i12] == i10) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public void g(int i10, int i11, int i12) {
        this.V3 = false;
        this.f21325y = i10;
        this.U3 = i11;
        e(i12, false);
        this.f21322d = 0;
        int i13 = i11 + 1;
        int[] iArr = this.f21324x;
        if (i13 > iArr.length) {
            this.f21324x = new int[i13];
        } else {
            Arrays.fill(iArr, 0, i13, 0);
        }
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.FSCC;
    }

    public void h(c0 c0Var) {
        z zVar = (z) c0Var;
        g(zVar.f21325y, zVar.U3, zVar.f21322d);
        int i10 = zVar.f21322d;
        this.f21322d = i10;
        System.arraycopy(zVar.f21321c, 0, this.f21321c, 0, i10);
        System.arraycopy(zVar.f21323q, 0, this.f21323q, 0, this.f21322d);
        System.arraycopy(zVar.f21324x, 0, this.f21324x, 0, this.U3 + 1);
        this.V3 = zVar.V3;
    }

    @Override // rk.v
    public float l(int i10, int i11) {
        int f10 = f(i10, i11);
        if (f10 >= 0) {
            return this.f21321c[f10];
        }
        return 0.0f;
    }

    @Override // rk.c0
    public int w() {
        return this.U3;
    }
}
