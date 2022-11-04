package h7;
/* loaded from: classes.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final f[] U3;

    /* renamed from: c */
    private final int f11393c;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        U3 = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i10) {
        this.f11393c = i10;
    }

    public static f b(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = U3;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int g() {
        return this.f11393c;
    }
}
