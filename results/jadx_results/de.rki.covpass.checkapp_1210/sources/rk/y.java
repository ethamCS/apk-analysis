package rk;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class y extends t {
    public y() {
    }

    public y(int i10, int i11) {
        pk.d.j(i10, i11);
        this.f21317c = new float[i10 * i11];
        this.f21318d = i10;
        this.f21319q = i11;
    }

    public y(y yVar) {
        this(yVar.f21318d, yVar.f21319q);
        System.arraycopy(yVar.f21317c, 0, this.f21317c, 0, yVar.c());
    }

    @Override // rk.v
    public void K(int i10, int i11, float f10) {
        this.f21317c[(i10 * this.f21319q) + i11] = f10;
    }

    @Override // rk.v
    public float d(int i10, int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f21319q) || i10 < 0 || i10 >= this.f21318d) {
            throw new IllegalArgumentException("Specified element is out of bounds: " + i10 + " " + i11);
        }
        return this.f21317c[(i10 * i12) + i11];
    }

    @Override // rk.w
    public void e(int i10, int i11, boolean z10) {
        pk.d.j(i10, i11);
        float[] fArr = this.f21317c;
        int i12 = i10 * i11;
        if (fArr.length < i12) {
            float[] fArr2 = new float[i12];
            if (z10) {
                System.arraycopy(fArr, 0, fArr2, 0, c());
            }
            this.f21317c = fArr2;
        }
        this.f21318d = i10;
        this.f21319q = i11;
    }

    /* renamed from: g */
    public y a() {
        return new y(this);
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.FDRM;
    }

    /* renamed from: h */
    public y T(int i10, int i11) {
        return new y(i10, i11);
    }

    public void i() {
        Arrays.fill(this.f21317c, 0, c(), 0.0f);
    }

    @Override // rk.v
    public float l(int i10, int i11) {
        return this.f21317c[(i10 * this.f21319q) + i11];
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        gl.e.g(new PrintStream(byteArrayOutputStream), this);
        return byteArrayOutputStream.toString();
    }
}
