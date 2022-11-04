package rk;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    public double[] f21286a;

    /* renamed from: b */
    public int f21287b;

    public g() {
        this(0);
    }

    public g(int i10) {
        this.f21286a = new double[i10];
        this.f21287b = i10;
    }

    public void a(int i10) {
        double[] dArr = this.f21286a;
        double[] dArr2 = new double[dArr.length + i10];
        System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
        this.f21286a = dArr2;
    }

    public g b(int i10) {
        if (this.f21286a.length < i10) {
            this.f21286a = new double[i10];
        }
        this.f21287b = i10;
        return this;
    }

    public void c(g gVar) {
        b(gVar.f21287b);
        System.arraycopy(gVar.f21286a, 0, this.f21286a, 0, gVar.f21287b);
    }
}
