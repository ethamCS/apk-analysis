package rk;
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a */
    public int[] f21265a;

    /* renamed from: b */
    public int f21266b;

    public b0() {
        this(0);
    }

    public b0(int i10) {
        this.f21265a = new int[i10];
        this.f21266b = i10;
    }

    public void a(int i10) {
        int[] iArr = this.f21265a;
        int[] iArr2 = new int[iArr.length + i10];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f21265a = iArr2;
    }

    public void b(int i10) {
        if (this.f21265a.length < i10) {
            this.f21265a = new int[i10];
        }
        this.f21266b = i10;
    }

    public void c(b0 b0Var) {
        b(b0Var.f21266b);
        System.arraycopy(b0Var.f21265a, 0, this.f21265a, 0, b0Var.f21266b);
    }
}
