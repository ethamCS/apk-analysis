package e.a.a.e.g;

import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private static final g<e.a.a.e.h.j.b> f798a = new g<>("DisplayedManager", e.a.a.e.h.j.b.class);

    public static void a(Context context) {
        f798a.a(context);
    }

    public static List<e.a.a.e.h.j.b> b(Context context) {
        return f798a.e(context, "displayed");
    }

    public static Boolean c(Context context, Integer num) {
        return f798a.g(context, "displayed", num.toString());
    }

    public static void d(Context context, e.a.a.e.h.j.b bVar) {
        f798a.h(context, "displayed", bVar.f819a.toString(), bVar);
    }
}
