package d.a.b.w;

import java.util.Objects;
/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}
