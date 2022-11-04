package z3;
/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: c */
    public int[] f26449c;

    protected d() {
    }

    public d(int i10, int i11) {
        super(i10, i11);
        this.f26449c = new int[i10];
    }

    public int d() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f26449c;
            if (i10 < iArr.length) {
                i11 += iArr[i10];
                i10++;
            } else {
                return i11;
            }
        }
    }

    public int e(int i10) {
        return this.f26449c[i10];
    }
}
