package ok;
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    public double[] f18607a;

    /* renamed from: b */
    public int f18608b;

    public f() {
        this(10);
    }

    public f(int i10) {
        this.f18607a = new double[i10];
        this.f18608b = 0;
    }

    public void a(double d10) {
        c(d10);
    }

    public double b(int i10) {
        if (i10 < 0 || i10 >= this.f18608b) {
            throw new IndexOutOfBoundsException("index = " + i10 + "  size = " + this.f18608b);
        }
        return this.f18607a[i10];
    }

    public void c(double d10) {
        double[] dArr;
        int i10 = this.f18608b;
        if (i10 == this.f18607a.length) {
            try {
                dArr = new double[(i10 * 2) + 5];
            } catch (OutOfMemoryError unused) {
                System.gc();
                dArr = new double[(this.f18608b * 3) / 2];
            }
            System.arraycopy(this.f18607a, 0, dArr, 0, this.f18608b);
            this.f18607a = dArr;
        }
        double[] dArr2 = this.f18607a;
        int i11 = this.f18608b;
        this.f18608b = i11 + 1;
        dArr2[i11] = d10;
    }

    public void d() {
        this.f18608b = 0;
    }
}
