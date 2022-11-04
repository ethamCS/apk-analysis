package e.a.a.e.g;

import android.content.Context;
import e.a.a.e.h.i;
import java.util.List;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private static final g<i> f799a = new g<>("ScheduleManager", i.class);

    public static void a(Context context) {
        List<i> e2 = f799a.e(context, "schedules");
        if (e2 != null) {
            for (i iVar : e2) {
                e.a.a.e.c.d(context, iVar.f831b.f819a);
            }
        }
    }

    public static void b(Context context, Integer num) {
        i d2 = f799a.d(context, "schedules", num.toString());
        if (d2 != null) {
            e(context, d2);
        }
    }

    public static void c(Context context) {
        f799a.a(context);
    }

    public static List<i> d(Context context) {
        return f799a.e(context, "schedules");
    }

    public static Boolean e(Context context, i iVar) {
        return f799a.g(context, "schedules", iVar.f831b.f819a.toString());
    }

    public static void f(Context context, i iVar) {
        f799a.h(context, "schedules", iVar.f831b.f819a.toString(), iVar);
    }
}
