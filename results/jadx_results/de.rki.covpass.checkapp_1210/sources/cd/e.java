package cd;

import hc.t;
/* loaded from: classes.dex */
public final class e {
    public static final Class<?> a(ClassLoader classLoader, String str) {
        t.e(classLoader, "<this>");
        t.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
