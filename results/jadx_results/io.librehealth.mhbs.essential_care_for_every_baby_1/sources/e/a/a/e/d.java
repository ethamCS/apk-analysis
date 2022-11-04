package e.a.a.e;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import e.a.a.e.e.g;
import e.a.a.e.e.h;
import e.a.a.e.e.j;
import e.a.a.e.g.e;
import e.a.a.e.h.f;
import e.a.a.e.h.i;
import e.a.a.g.m;
import java.util.Random;
/* loaded from: classes.dex */
public class d extends AsyncTask<String, Void, e.a.a.e.h.j.b> {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private Context f744a;

    /* renamed from: b */
    private j f745b;

    /* renamed from: c */
    private h f746c;

    /* renamed from: d */
    private i f747d;

    /* renamed from: e */
    private Boolean f748e;
    private Boolean f;
    private b g = new b();

    private d(Context context, h hVar, j jVar, i iVar) {
        Boolean bool = Boolean.FALSE;
        this.f748e = bool;
        this.f = bool;
        this.f744a = context;
        this.f745b = jVar;
        this.f746c = hVar;
        this.f747d = iVar;
    }

    private i a(i iVar) {
        i j = this.f747d.j();
        j.f831b.f819a = Integer.valueOf(new Random().nextInt(648) + 2147483000);
        f fVar = j.f831b;
        fVar.x = g.Default;
        fVar.k = null;
        fVar.m = null;
        j.f830a = true;
        return j;
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            f(context).d();
            return true;
        }
        ((NotificationManager) context.getSystemService("notification")).cancelAll();
        return true;
    }

    public static void c(Context context, Integer num) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                androidx.core.app.h f = f(context);
                d(context, f, num.intValue());
                f.c(num.toString(), num.intValue());
                f.b(num.intValue());
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.cancel(num.toString(), num.intValue());
            notificationManager.cancel(num.intValue());
        }
    }

    private static void d(Context context, androidx.core.app.h hVar, int i) {
        StatusBarNotification[] activeNotifications = ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        if (activeNotifications != null) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == i) {
                    String groupKey = statusBarNotification.getGroupKey();
                    if (m.c(groupKey).booleanValue()) {
                        return;
                    }
                    Integer num = 0;
                    Integer num2 = 0;
                    for (StatusBarNotification statusBarNotification2 : activeNotifications) {
                        if (statusBarNotification2.getGroupKey().equals(groupKey)) {
                            num2 = Integer.valueOf(num2.intValue() + 1);
                            if (statusBarNotification2.getId() != i) {
                                num = Integer.valueOf(statusBarNotification2.getId());
                            }
                        }
                    }
                    if (num2.intValue() > 2) {
                        return;
                    }
                    hVar.c(num.toString(), num.intValue());
                    hVar.b(num.intValue());
                    return;
                }
            }
        }
    }

    private static androidx.core.app.h f(Context context) {
        return androidx.core.app.h.e(context);
    }

    public static void h(Context context, j jVar, i iVar) {
        if (iVar != null) {
            h hVar = e.a.a.a.f;
            h hVar2 = h.AppKilled;
            if (hVar != hVar2) {
                hVar2 = e.a.a.a.H();
            }
            iVar.i(context);
            new d(context, hVar2, jVar, iVar).execute(new String[0]);
            return;
        }
        throw new e.a.a.e.f.a("Notification cannot be empty or null");
    }

    public static void i(Context context, i iVar) {
        h(context, iVar.f831b.y, iVar);
    }

    public static void j(Context context, e.a.a.e.h.j.a aVar) {
        if (aVar != null) {
            aVar.G = e.a.a.a.H();
            aVar.I = e.a.a.g.f.c();
            e.a.a.e.g.d.d(context, aVar);
            e.a.a.e.g.d.a(context);
            try {
                e.a.a.b.c(context, aVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public e.a.a.e.h.j.b doInBackground(String... strArr) {
        e.a.a.e.h.j.b bVar;
        Boolean bool = Boolean.TRUE;
        try {
            i iVar = this.f747d;
            if (iVar != null) {
                f fVar = iVar.f831b;
                if (fVar.y == null) {
                    fVar.y = this.f745b;
                    this.f748e = bool;
                }
                if (fVar.z == null) {
                    fVar.z = this.f746c;
                }
                if (m.c(fVar.f821c).booleanValue() && m.c(this.f747d.f831b.f822d).booleanValue()) {
                    bVar = new e.a.a.e.h.j.b(this.f747d.f831b);
                    return bVar;
                }
                f fVar2 = this.f747d.f831b;
                if (fVar2.A == null) {
                    fVar2.A = this.f746c;
                }
                fVar2.C = e.a.a.g.f.c();
                i k = k(this.f744a, this.f747d);
                this.f747d = k;
                if (k == null) {
                    return null;
                }
                this.f = bool;
                bVar = new e.a.a.e.h.j.b(k.f831b);
                h hVar = bVar.A;
                if (hVar == null) {
                    hVar = this.f746c;
                }
                bVar.A = hVar;
                return bVar;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f747d = null;
        return null;
    }

    /* renamed from: g */
    public void onPostExecute(e.a.a.e.h.j.b bVar) {
        if (this.f747d != null) {
            if (this.f748e.booleanValue()) {
                e.a.a.e.g.b.d(this.f744a, bVar);
                e.a.a.b.b(this.f744a, bVar);
                e.a.a.e.g.b.a(this.f744a);
            }
            if (!this.f.booleanValue()) {
                return;
            }
            e.d(this.f744a, bVar);
            e.a.a.b.d(this.f744a, bVar);
            e.a(this.f744a);
        }
    }

    public i k(Context context, i iVar) {
        try {
            h H = e.a.a.a.H();
            if (H == h.AppKilled || ((H == h.Foreground && iVar.f831b.p.booleanValue()) || (H == h.Background && iVar.f831b.q.booleanValue()))) {
                Notification e2 = this.g.e(context, iVar);
                if (Build.VERSION.SDK_INT >= 23) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (iVar.f830a) {
                        i a2 = a(iVar);
                        notificationManager.notify(a2.f831b.f819a.intValue(), this.g.e(context, a2));
                    }
                    notificationManager.notify(iVar.f831b.f819a.intValue(), e2);
                } else {
                    f(context).h(iVar.f831b.f819a.toString(), iVar.f831b.f819a.intValue(), e2);
                }
            }
            return iVar;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
