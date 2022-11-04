package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import c2.g;
import c2.h;
import u1.k;
import v1.i;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final String f5333a = k.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h L = iVar.p().L();
        g c10 = L.c(str);
        if (c10 != null) {
            b(context, str, c10.f6142b);
            k.c().a(f5333a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            L.d(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, str), 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        k.c().a(f5333a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j10) {
        int i10;
        WorkDatabase p10 = iVar.p();
        h L = p10.L();
        g c10 = L.c(str);
        if (c10 != null) {
            b(context, str, c10.f6142b);
            i10 = c10.f6142b;
        } else {
            i10 = new d2.c(p10).b();
            L.b(new g(str, i10));
        }
        d(context, str, i10, j10);
    }

    private static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
