package c.b.b.w;
/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }
}
