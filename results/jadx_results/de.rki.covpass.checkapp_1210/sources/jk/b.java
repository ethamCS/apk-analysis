package jk;
/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: a */
    int f14449a;

    @Override // jk.a
    public void a(int i10) {
        this.f14449a = i10;
    }

    @Override // jk.a
    public int b(double[] dArr) {
        int i10 = -1;
        double d10 = -1.0d;
        for (int i11 = 0; i11 < this.f14449a; i11++) {
            if (dArr[i11] > d10) {
                d10 = dArr[i11];
                i10 = i11;
            }
        }
        return i10;
    }
}
