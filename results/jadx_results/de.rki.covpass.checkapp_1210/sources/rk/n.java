package rk;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class n extends i {
    public n() {
    }

    public n(int i10) {
        this.f21296c = new double[i10];
    }

    public n(int i10, int i11) {
        pk.d.j(i10, i11);
        this.f21296c = new double[i10 * i11];
        this.f21297d = i10;
        this.f21298q = i11;
    }

    public n(n nVar) {
        this(nVar.f21297d, nVar.f21298q);
        System.arraycopy(nVar.f21296c, 0, this.f21296c, 0, nVar.c());
    }

    @Override // rk.k
    public void F(int i10, int i11, double d10) {
        int i12;
        if (i11 >= 0 && i11 < (i12 = this.f21298q) && i10 >= 0 && i10 < this.f21297d) {
            this.f21296c[(i10 * i12) + i11] = d10;
            return;
        }
        throw new IllegalArgumentException("Specified element is out of bounds: (" + i10 + " , " + i11 + ")");
    }

    @Override // rk.k
    public void L(int i10, int i11, double d10) {
        this.f21296c[(i10 * this.f21298q) + i11] = d10;
    }

    @Override // rk.k
    public double d(int i10, int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f21298q) || i10 < 0 || i10 >= this.f21297d) {
            throw new IllegalArgumentException("Specified element is out of bounds: " + i10 + " " + i11);
        }
        return this.f21296c[(i10 * i12) + i11];
    }

    @Override // rk.l
    public void e(int i10, int i11, boolean z10) {
        pk.d.j(i10, i11);
        double[] dArr = this.f21296c;
        int i12 = i10 * i11;
        if (dArr.length < i12) {
            double[] dArr2 = new double[i12];
            if (z10) {
                System.arraycopy(dArr, 0, dArr2, 0, c());
            }
            this.f21296c = dArr2;
        }
        this.f21297d = i10;
        this.f21298q = i11;
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.DDRM;
    }

    /* renamed from: h */
    public n a() {
        return new n(this);
    }

    /* renamed from: i */
    public n T(int i10, int i11) {
        return new n(i10, i11);
    }

    public int j(int i10, int i11) {
        return (i10 * this.f21298q) + i11;
    }

    public void k() {
        Arrays.fill(this.f21296c, 0, c(), 0.0d);
    }

    @Override // rk.k
    public double l(int i10, int i11) {
        return this.f21296c[(i10 * this.f21298q) + i11];
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        gl.e.c(new PrintStream(byteArrayOutputStream), this);
        return byteArrayOutputStream.toString();
    }
}
