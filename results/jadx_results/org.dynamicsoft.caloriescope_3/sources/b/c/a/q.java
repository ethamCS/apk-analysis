package b.c.a;
/* loaded from: classes.dex */
public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: b */
    final int f1314b;

    q(int i) {
        this.f1314b = i;
    }

    public static boolean a(int i) {
        return (i & OFFLINE.f1314b) != 0;
    }

    public static boolean b(int i) {
        return (i & NO_CACHE.f1314b) == 0;
    }

    public static boolean c(int i) {
        return (i & NO_STORE.f1314b) == 0;
    }
}
