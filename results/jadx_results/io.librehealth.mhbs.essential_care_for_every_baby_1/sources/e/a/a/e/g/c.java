package e.a.a.e.g;

import android.content.Context;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private static final g<e.a.a.e.h.a> f796a = new g<>("DefaultsManager", e.a.a.e.h.a.class);

    public static void a(Context context) {
        f796a.a(context);
    }

    public static String b(Context context) {
        e.a.a.e.h.a d2 = f796a.d(context, "defaults", "Defaults");
        if (d2 != null) {
            return d2.f806a;
        }
        return null;
    }

    public static void c(Context context, e.a.a.e.h.a aVar) {
        f796a.h(context, "defaults", "Defaults", aVar);
    }
}
