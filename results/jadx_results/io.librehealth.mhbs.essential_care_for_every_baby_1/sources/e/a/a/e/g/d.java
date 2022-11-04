package e.a.a.e.g;

import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private static final g<e.a.a.e.h.j.a> f797a = new g<>("DismissedManager", e.a.a.e.h.j.a.class);

    public static void a(Context context) {
        f797a.a(context);
    }

    public static List<e.a.a.e.h.j.a> b(Context context) {
        return f797a.e(context, "dismissed");
    }

    public static Boolean c(Context context, Integer num) {
        return f797a.g(context, "dismissed", num.toString());
    }

    public static void d(Context context, e.a.a.e.h.j.a aVar) {
        f797a.h(context, "dismissed", aVar.f819a.toString(), aVar);
    }
}
