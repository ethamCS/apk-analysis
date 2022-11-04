package c.b.a.a;

import java.util.logging.Logger;
/* loaded from: classes.dex */
final class h {

    /* loaded from: classes.dex */
    public static final class b implements g {
        private b() {
        }
    }

    static {
        Logger.getLogger(h.class.getName());
        b();
    }

    private h() {
    }

    public static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static g b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
