package a;
/* loaded from: classes.dex */
public enum r {
    Unknown(0),
    Encrypt0(16),
    Encrypt(96),
    Sign1(18),
    Sign(98),
    MAC(97),
    MAC0(17);
    

    /* renamed from: c */
    public final int f129c;

    r(int i10) {
        this.f129c = i10;
    }

    public static r b(int i10) {
        r[] values;
        for (r rVar : values()) {
            if (i10 == rVar.f129c) {
                return rVar;
            }
        }
        throw new f("Not a message tag number");
    }
}
