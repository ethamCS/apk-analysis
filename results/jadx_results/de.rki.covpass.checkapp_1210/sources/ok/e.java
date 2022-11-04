package ok;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a */
    public float[] f18605a;

    /* renamed from: b */
    public int f18606b;

    public e() {
        this(10);
    }

    public e(int i10) {
        this.f18605a = new float[i10];
        this.f18606b = 0;
    }

    public void a(float f10) {
        c(f10);
    }

    public void b(float f10) {
        Arrays.fill(this.f18605a, 0, this.f18606b, f10);
    }

    public void c(float f10) {
        float[] fArr;
        int i10 = this.f18606b;
        if (i10 == this.f18605a.length) {
            try {
                fArr = new float[(i10 * 2) + 5];
            } catch (OutOfMemoryError unused) {
                System.gc();
                fArr = new float[(this.f18606b * 3) / 2];
            }
            System.arraycopy(this.f18605a, 0, fArr, 0, this.f18606b);
            this.f18605a = fArr;
        }
        float[] fArr2 = this.f18605a;
        int i11 = this.f18606b;
        this.f18606b = i11 + 1;
        fArr2[i11] = f10;
    }

    public void d(int i10) {
        float[] fArr = this.f18605a;
        if (fArr.length >= i10) {
            return;
        }
        int i11 = this.f18606b;
        if (i11 == 0) {
            this.f18605a = null;
            this.f18605a = new float[i10];
            return;
        }
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, i11);
        this.f18605a = fArr2;
    }

    public void e() {
        this.f18606b = 0;
    }

    public void f(int i10) {
        d(i10);
        this.f18606b = i10;
    }
}
