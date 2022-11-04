package e.a.a.e;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import e.a.a.e.e.h;
import e.a.a.e.e.j;
import e.a.a.e.g.f;
import e.a.a.e.h.i;
import java.util.Calendar;
import java.util.List;
import me.carda.awesome_notifications.notifications.broadcastReceivers.ScheduledNotificationReceiver;
/* loaded from: classes.dex */
public class c extends AsyncTask<String, Void, Calendar> {
    public static String f = "NotificationScheduler";

    /* renamed from: a */
    private Context f739a;

    /* renamed from: b */
    private j f740b;

    /* renamed from: c */
    private h f741c;

    /* renamed from: d */
    private i f742d;

    /* renamed from: e */
    private Boolean f743e = Boolean.FALSE;

    private c(Context context, h hVar, j jVar, i iVar) {
        this.f739a = context;
        this.f740b = jVar;
        this.f741c = hVar;
        this.f742d = iVar;
    }

    private static void a(Context context) {
        if (context != null) {
            for (i iVar : f.d(context)) {
                b(context, iVar.f831b.f819a.intValue());
            }
        }
    }

    private static void b(Context context, int i) {
        if (context != null) {
            f(context).cancel(PendingIntent.getBroadcast(context, i, new Intent(context, ScheduledNotificationReceiver.class), 134217728));
        }
    }

    public static boolean c(Context context) {
        if (context != null) {
            a(context);
            f.a(context);
            f.c(context);
            return true;
        }
        return false;
    }

    public static void d(Context context, Integer num) {
        if (context != null) {
            b(context, num.intValue());
            f.b(context, num);
            f.c(context);
        }
    }

    private static AlarmManager f(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    public static void h(Context context) {
        List<i> d2 = f.d(context);
        if (d2 == null || d2.isEmpty()) {
            return;
        }
        for (i iVar : d2) {
            try {
                if (iVar.f832c.k().booleanValue()) {
                    j(context, iVar);
                } else {
                    f.b(context, iVar.f831b.f819a);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void i(Context context, j jVar, i iVar) {
        if (iVar != null) {
            h hVar = e.a.a.a.f;
            h hVar2 = h.AppKilled;
            if (hVar != hVar2) {
                hVar2 = e.a.a.a.H();
            }
            iVar.i(context);
            new c(context, hVar2, jVar, iVar).execute(new String[0]);
            return;
        }
        throw new e.a.a.e.f.a("Invalid notification content");
    }

    public static void j(Context context, i iVar) {
        i(context, iVar.f831b.y, iVar);
    }

    private i k(Context context, i iVar, Calendar calendar) {
        if (calendar != null) {
            String g = iVar.g();
            Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
            intent.putExtra("id", iVar.f831b.f819a);
            intent.putExtra("notificationJson", g);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, iVar.f831b.f819a.intValue(), intent, 134217728);
            AlarmManager f2 = f(context);
            boolean a2 = e.a.a.g.c.a(iVar.f832c.f829d);
            long timeInMillis = calendar.getTimeInMillis();
            if (a2) {
                androidx.core.app.a.b(f2, 0, timeInMillis, broadcast);
            } else {
                androidx.core.app.a.a(f2, 0, timeInMillis, broadcast);
            }
            return iVar;
        }
        return null;
    }

    /* renamed from: e */
    public Calendar doInBackground(String... strArr) {
        Boolean bool = Boolean.TRUE;
        try {
            i iVar = this.f742d;
            if (iVar != null) {
                e.a.a.e.h.f fVar = iVar.f831b;
                if (fVar.y == null) {
                    fVar.y = this.f740b;
                    this.f743e = bool;
                }
                e.a.a.e.h.h hVar = iVar.f832c;
                if (hVar == null) {
                    return null;
                }
                if (hVar.f827b == null) {
                    fVar.B = e.a.a.g.f.c();
                    this.f743e = bool;
                }
                i iVar2 = this.f742d;
                e.a.a.e.h.f fVar2 = iVar2.f831b;
                if (fVar2.z == null) {
                    fVar2.z = this.f741c;
                }
                Calendar j = iVar2.f832c.j(null);
                if (j != null) {
                    i k = k(this.f739a, this.f742d, j);
                    this.f742d = k;
                    if (k != null) {
                        this.f743e = bool;
                    }
                    return j;
                }
                d(this.f739a, this.f742d.f831b.f819a);
                d.a.b.a(f, "Date is not more valid. (" + e.a.a.g.f.c() + ")");
            }
        } catch (Exception e2) {
            this.f742d = null;
            e2.printStackTrace();
        }
        return null;
    }

    /* renamed from: g */
    public void onPostExecute(Calendar calendar) {
        if (this.f742d != null) {
            if (calendar == null || !this.f743e.booleanValue()) {
                f.e(this.f739a, this.f742d);
                b(this.f739a, this.f742d.f831b.f819a.intValue());
                d.a.b.a(f, "Scheduled removed");
                f.c(this.f739a);
                return;
            }
            f.f(this.f739a, this.f742d);
            e.a.a.b.b(this.f739a, new e.a.a.e.h.j.b(this.f742d.f831b));
            d.a.b.a(f, "Scheduled created");
            f.c(this.f739a);
        }
    }
}
