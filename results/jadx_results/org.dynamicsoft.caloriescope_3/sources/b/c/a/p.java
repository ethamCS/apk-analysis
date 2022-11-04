package b.c.a;
/* loaded from: classes.dex */
public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: b */
    final int f1312b;

    p(int i) {
        this.f1312b = i;
    }

    public static boolean a(int i) {
        return (i & NO_CACHE.f1312b) == 0;
    }

    public static boolean b(int i) {
        return (i & NO_STORE.f1312b) == 0;
    }
}
