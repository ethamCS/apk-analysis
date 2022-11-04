package e.a.a;

import android.content.Context;
import android.content.Intent;
import e.a.a.e.g.d;
import java.io.Serializable;
import java.util.Map;
/* loaded from: classes.dex */
public class b {
    public static Boolean a(Context context, e.a.a.e.h.j.a aVar) {
        Boolean bool = Boolean.FALSE;
        Intent intent = new Intent("broadcast.awesome_notifications.KEEP_ON_TOP");
        intent.putExtra("notification", (Serializable) aVar.h());
        try {
            bool = Boolean.valueOf(b.d.a.a.b(context).d(intent));
            bool.booleanValue();
            return bool;
        } catch (Exception e2) {
            e2.printStackTrace();
            return bool;
        }
    }

    public static Boolean b(Context context, e.a.a.e.h.j.b bVar) {
        Boolean bool = Boolean.FALSE;
        Map<String, Object> h = bVar.h();
        Intent intent = new Intent("broadcast.awesome_notifications.CREATED_NOTIFICATION");
        intent.putExtra("notification", (Serializable) h);
        try {
            bool = Boolean.valueOf(b.d.a.a.b(context).d(intent));
            bool.booleanValue();
            return bool;
        } catch (Exception e2) {
            e2.printStackTrace();
            return bool;
        }
    }

    public static Boolean c(Context context, e.a.a.e.h.j.a aVar) {
        Boolean bool = Boolean.FALSE;
        d.d(context, aVar);
        Map<String, Object> h = aVar.h();
        Intent intent = new Intent("broadcast.awesome_notifications.DISMISSED_NOTIFICATION");
        intent.putExtra("notification", (Serializable) h);
        try {
            bool = Boolean.valueOf(b.d.a.a.b(context).d(intent));
            bool.booleanValue();
            return bool;
        } catch (Exception e2) {
            e2.printStackTrace();
            return bool;
        }
    }

    public static Boolean d(Context context, e.a.a.e.h.j.b bVar) {
        Boolean bool = Boolean.FALSE;
        Map<String, Object> h = bVar.h();
        Intent intent = new Intent("broadcast.awesome_notifications.DISPLAYED_NOTIFICATION");
        intent.putExtra("notification", (Serializable) h);
        try {
            bool = Boolean.valueOf(b.d.a.a.b(context).d(intent));
            bool.booleanValue();
            return bool;
        } catch (Exception e2) {
            e2.printStackTrace();
            return bool;
        }
    }
}
