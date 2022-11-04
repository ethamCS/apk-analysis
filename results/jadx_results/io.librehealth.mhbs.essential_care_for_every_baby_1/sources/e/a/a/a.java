package e.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import d.a.c.a.i;
import d.a.c.a.l;
import e.a.a.e.e.h;
import e.a.a.e.g.d;
import e.a.a.e.h.e;
import e.a.a.e.h.g;
import e.a.a.f.a;
import e.a.a.g.f;
import e.a.a.g.j;
import e.a.a.g.k;
import e.a.a.g.m;
import io.flutter.embedding.engine.h.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends BroadcastReceiver implements io.flutter.embedding.engine.h.a, i.c, l, io.flutter.embedding.engine.h.c.a, Application.ActivityLifecycleCallbacks {

    /* renamed from: e */
    private static String f722e;
    public static MediaSessionCompat g;

    /* renamed from: a */
    private Activity f723a;

    /* renamed from: b */
    private i f724b;

    /* renamed from: c */
    private Context f725c;

    /* renamed from: d */
    public static Boolean f721d = Boolean.FALSE;
    public static h f = h.AppKilled;

    private void A(d.a.c.a.h hVar, i.d dVar) {
        e.a.a.e.b.n(this.f725c, (String) hVar.b());
        dVar.b(null);
    }

    private void B(d.a.c.a.h hVar, i.d dVar) {
        Map map = (Map) k.a(hVar.b(), Map.class).d();
        Integer num = (Integer) map.get("channelShowBadge");
        String str = (String) map.get("channelKey");
        if (num == null || num.intValue() < 0) {
            throw new e.a.a.e.f.a("Invalid Badge");
        }
        e.a.a.e.b.t(this.f725c, str, num.intValue());
        dVar.b(Boolean.TRUE);
    }

    private void C(d.a.c.a.h hVar, i.d dVar) {
        Map<String, Object> map = (Map) k.a(hVar.b(), Map.class).d();
        e eVar = new e();
        eVar.k(map);
        e.a.a.e.g.a.f(this.f725c, eVar, Boolean.valueOf(e.a.a.g.c.a((Boolean) map.get("forceUpdate"))));
        dVar.b(Boolean.TRUE);
        e.a.a.e.g.a.a(this.f725c);
    }

    private void D(d.a.c.a.h hVar, i.d dVar) {
        Map map = (Map) hVar.a("notificationData");
        Integer num = (Integer) hVar.a("startType");
        Boolean bool = (Boolean) hVar.a("hasForegroundServiceType");
        Integer num2 = (Integer) hVar.a("foregroundServiceType");
        if (map == null || num == null || bool == null || num2 == null) {
            throw new IllegalArgumentException("An argument passed to startForeground was null!");
        }
        a.C0044a c0044a = new a.C0044a(map, num.intValue(), bool.booleanValue(), num2.intValue());
        Intent intent = new Intent(this.f725c, e.a.a.f.a.class);
        intent.putExtra("me.carda.awesome_notifications.services.ForegroundService$StartParameter", c0044a);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f725c.startForegroundService(intent);
        } else {
            this.f725c.startService(intent);
        }
        dVar.b(null);
    }

    private void E(d.a.c.a.h hVar, i.d dVar) {
        this.f725c.stopService(new Intent(this.f725c, e.a.a.f.a.class));
        dVar.b(null);
    }

    private void F(d.a.c.a.h hVar, i.d dVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            k(hVar, dVar);
            return;
        }
        Intent intent = new Intent();
        intent.setAction(i >= 26 ? "android.settings.APP_NOTIFICATION_SETTINGS" : "android.settings.APPLICATION_SETTINGS");
        intent.putExtra("app_package", this.f725c.getPackageName());
        intent.putExtra("app_uid", this.f725c.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", this.f725c.getPackageName());
        intent.setFlags(268435456);
        this.f725c.startActivity(intent);
        dVar.b(Boolean.TRUE);
    }

    private boolean G() {
        return false;
    }

    public static h H() {
        e.b a2 = n.k().a().a();
        f = a2 == e.b.RESUMED ? h.Foreground : a2 == e.b.CREATED ? h.Background : h.AppKilled;
        return f;
    }

    public static String I() {
        return f722e;
    }

    public static Boolean J(Context context, String str) {
        e.a.a.e.h.e b2;
        Boolean bool = Boolean.FALSE;
        if (!m.c(str).booleanValue() && (b2 = e.a.a.e.g.a.b(context, str)) != null) {
            if (Build.VERSION.SDK_INT < 26) {
                return Boolean.TRUE;
            }
            NotificationChannel g2 = androidx.core.app.h.e(context).g(b2.l());
            return Boolean.valueOf((g2 == null || g2.getImportance() == 0) ? false : true);
        }
        return bool;
    }

    public static Boolean K(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            androidx.core.app.h e2 = androidx.core.app.h.e(context);
            return Boolean.valueOf(e2 != null && e2.a());
        }
        return Boolean.TRUE;
    }

    private void L(Intent intent) {
        try {
            this.f724b.c("receivedAction", intent.getSerializableExtra("notification"));
            if (!f721d.booleanValue()) {
                return;
            }
            d.a.b.a("AwesomeNotificationsPlugin", "Notification action received");
        } catch (Exception e2) {
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
            }
            e2.printStackTrace();
        }
    }

    private void M(Intent intent) {
        try {
            this.f724b.c("mediaButton", intent.getSerializableExtra("notification"));
            if (!f721d.booleanValue()) {
                return;
            }
            d.a.b.a("AwesomeNotificationsPlugin", "Notification action received");
        } catch (Exception e2) {
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
            }
            e2.printStackTrace();
        }
    }

    private void N(Intent intent) {
        try {
            Serializable serializableExtra = intent.getSerializableExtra("notification");
            Map<String, Object> map = serializableExtra instanceof Map ? (Map) serializableExtra : null;
            if (map == null) {
                return;
            }
            e.a.a.e.h.j.b k = new e.a.a.e.h.j.b().k(map);
            k.i(this.f725c);
            e.a.a.e.g.b.c(this.f725c, k.f819a);
            e.a.a.e.g.b.a(this.f725c);
            this.f724b.c("notificationCreated", map);
            if (!f721d.booleanValue()) {
                return;
            }
            d.a.b.a("AwesomeNotificationsPlugin", "Notification created");
        } catch (Exception e2) {
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
            }
            e2.printStackTrace();
        }
    }

    private void O(Intent intent) {
        try {
            Serializable serializableExtra = intent.getSerializableExtra("notification");
            Map<String, Object> map = serializableExtra instanceof Map ? (Map) serializableExtra : null;
            if (map == null) {
                return;
            }
            e.a.a.e.h.j.a aVar = new e.a.a.e.h.j.a();
            aVar.p(map);
            aVar.i(this.f725c);
            d.c(this.f725c, aVar.f819a);
            e.a.a.e.g.e.a(this.f725c);
            this.f724b.c("notificationDismissed", map);
            if (!f721d.booleanValue()) {
                return;
            }
            d.a.b.a("AwesomeNotificationsPlugin", "Notification dismissed");
        } catch (Exception e2) {
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
            }
            e2.printStackTrace();
        }
    }

    private void P(Intent intent) {
        try {
            Serializable serializableExtra = intent.getSerializableExtra("notification");
            Map<String, Object> map = serializableExtra instanceof Map ? (Map) serializableExtra : null;
            if (map == null) {
                return;
            }
            e.a.a.e.h.j.b k = new e.a.a.e.h.j.b().k(map);
            k.i(this.f725c);
            e.a.a.e.g.e.c(this.f725c, k.f819a);
            e.a.a.e.g.e.a(this.f725c);
            this.f724b.c("notificationDisplayed", map);
            if (!f721d.booleanValue()) {
                return;
            }
            d.a.b.a("AwesomeNotificationsPlugin", "Notification displayed");
        } catch (Exception e2) {
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
            }
            e2.printStackTrace();
        }
    }

    private Boolean Q(Intent intent) {
        return R(intent, H());
    }

    private Boolean R(Intent intent, h hVar) {
        e.a.a.e.h.j.a a2 = e.a.a.e.b.a(this.f725c, intent);
        if (a2 != null) {
            a2.H = f.c();
            a2.F = hVar;
            this.f724b.c("receivedAction", a2.h());
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", "Notification action received");
            }
        }
        return Boolean.TRUE;
    }

    private void S(Context context) {
        List<e.a.a.e.h.j.b> b2 = e.a.a.e.g.b.b(context);
        if (b2 != null) {
            for (e.a.a.e.h.j.b bVar : b2) {
                try {
                    bVar.i(this.f725c);
                    this.f724b.c("notificationCreated", bVar.h());
                    e.a.a.e.g.b.c(context, bVar.f819a);
                    e.a.a.e.g.b.a(context);
                } catch (e.a.a.e.f.a e2) {
                    if (f721d.booleanValue()) {
                        d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
                    }
                    e2.printStackTrace();
                }
            }
        }
    }

    private void T(Context context) {
        List<e.a.a.e.h.j.a> b2 = d.b(context);
        if (b2 != null) {
            for (e.a.a.e.h.j.a aVar : b2) {
                try {
                    aVar.i(this.f725c);
                    this.f724b.c("notificationDismissed", aVar.h());
                    d.c(context, aVar.f819a);
                    d.a(context);
                } catch (e.a.a.e.f.a e2) {
                    if (f721d.booleanValue()) {
                        d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
                    }
                    e2.printStackTrace();
                }
            }
        }
    }

    private void U(Context context) {
        List<e.a.a.e.h.j.b> b2 = e.a.a.e.g.e.b(context);
        if (b2 != null) {
            for (e.a.a.e.h.j.b bVar : b2) {
                try {
                    bVar.i(this.f725c);
                    this.f724b.c("notificationDisplayed", bVar.h());
                    e.a.a.e.g.e.c(context, bVar.f819a);
                    e.a.a.e.g.e.a(context);
                } catch (e.a.a.e.f.a e2) {
                    if (f721d.booleanValue()) {
                        d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
                    }
                    e2.printStackTrace();
                }
            }
        }
    }

    private void V(Context context, List<Object> list) {
        if (j.a(list).booleanValue()) {
            return;
        }
        ArrayList<e.a.a.e.h.e> arrayList = new ArrayList();
        Boolean bool = Boolean.FALSE;
        for (Object obj : list) {
            if (obj instanceof Map) {
                Map<String, Object> map = (Map) obj;
                e.a.a.e.h.e eVar = new e.a.a.e.h.e();
                eVar.k(map);
                Boolean valueOf = Boolean.valueOf(e.a.a.g.c.a((Boolean) map.get("forceUpdate")));
                arrayList.add(eVar);
                bool = valueOf;
            }
        }
        for (e.a.a.e.h.e eVar2 : arrayList) {
            e.a.a.e.g.a.f(context, eVar2, bool);
        }
        e.a.a.e.g.a.a(context);
    }

    private boolean W(Context context, String str, List<Object> list) {
        X(context, str);
        V(context, list);
        S(context);
        U(context);
        T(context);
        j();
        return true;
    }

    private void X(Context context, String str) {
        if (e.a.a.g.l.b(str) != e.a.a.e.e.e.Resource) {
            str = null;
        }
        e.a.a.e.g.c.c(context, new e.a.a.e.h.a(str));
        e.a.a.e.g.c.a(context);
    }

    private void i(Context context, i iVar) {
        this.f725c = context;
        this.f724b = iVar;
        iVar.e(this);
        G();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("token");
        intentFilter.addAction("broadcast.awesome_notifications.CREATED_NOTIFICATION");
        intentFilter.addAction("broadcast.awesome_notifications.DISPLAYED_NOTIFICATION");
        intentFilter.addAction("broadcast.awesome_notifications.DISMISSED_NOTIFICATION");
        intentFilter.addAction("broadcast.awesome_notifications.KEEP_ON_TOP");
        intentFilter.addAction("broadcast.awesome_notifications.MEDIA_BUTTON");
        b.d.a.a.b(this.f725c).c(this, intentFilter);
        g = new MediaSessionCompat(this.f725c, "PUSH_MEDIA");
        H();
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Awesome Notifications attached for Android " + Build.VERSION.SDK_INT);
        }
        e.a.a.e.c.h(context);
    }

    private void j() {
        Intent intent;
        String action;
        Activity activity = this.f723a;
        if (activity == null || (intent = activity.getIntent()) == null || (action = intent.getAction()) == null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf("SELECT_NOTIFICATION".equals(action));
        Boolean valueOf2 = Boolean.valueOf(action.startsWith("ACTION_NOTIFICATION"));
        if (!valueOf.booleanValue() && !valueOf2.booleanValue()) {
            return;
        }
        R(intent, h.AppKilled);
    }

    private void k(d.a.c.a.h hVar, i.d dVar) {
        dVar.b(K(this.f725c));
    }

    private void l(d.a.c.a.h hVar, i.d dVar) {
        e.a.a.e.c.c(this.f725c);
        e.a.a.e.d.b(this.f725c);
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "All notifications was cancelled");
        }
        dVar.b(Boolean.TRUE);
    }

    private void m(d.a.c.a.h hVar, i.d dVar) {
        e.a.a.e.c.c(this.f725c);
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "All notifications scheduled was cancelled");
        }
        dVar.b(Boolean.TRUE);
    }

    private void n(d.a.c.a.h hVar, i.d dVar) {
        Integer num = (Integer) hVar.b();
        if (num == null || num.intValue() < 0) {
            throw new e.a.a.e.f.a("Invalid notification id");
        }
        e.a.a.e.c.d(this.f725c, num);
        e.a.a.e.d.c(this.f725c, num);
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification id " + num + " cancelled");
        }
        dVar.b(Boolean.TRUE);
    }

    private void o(d.a.c.a.h hVar, i.d dVar) {
        Integer num = (Integer) hVar.b();
        if (num == null || num.intValue() < 0) {
            throw new e.a.a.e.f.a("Invalid notification id");
        }
        e.a.a.e.c.d(this.f725c, num);
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Schedule id " + num + " cancelled");
        }
        dVar.b(Boolean.TRUE);
    }

    private void p(d.a.c.a.h hVar, i.d dVar) {
        e.a.a.e.h.i b2 = new e.a.a.e.h.i().b((Map) hVar.b());
        if (b2 != null) {
            if (!K(this.f725c).booleanValue()) {
                throw new e.a.a.e.f.a("Notifications are disabled");
            }
            if (J(this.f725c, b2.f831b.f820b).booleanValue()) {
                if (b2.f832c == null) {
                    e.a.a.e.d.h(this.f725c, e.a.a.e.e.j.Local, b2);
                } else {
                    e.a.a.e.c.i(this.f725c, e.a.a.e.e.j.Schedule, b2);
                }
                dVar.b(Boolean.TRUE);
                return;
            }
            throw new e.a.a.e.f.a("The notification channel '" + b2.f831b.f820b + "' do not exist or is disabled");
        }
        throw new e.a.a.e.f.a("Invalid parameters");
    }

    private void q(d.a.c.a.h hVar, i.d dVar) {
        e.a.a.e.d.b(this.f725c);
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "All notifications was dismissed");
        }
        dVar.b(Boolean.TRUE);
    }

    private void r(d.a.c.a.h hVar, i.d dVar) {
        Integer num = (Integer) hVar.b();
        if (num == null || num.intValue() < 0) {
            throw new e.a.a.e.f.a("Invalid notification id");
        }
        e.a.a.e.d.c(this.f725c, num);
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification id " + num + " dismissed");
        }
        dVar.b(Boolean.TRUE);
    }

    private void s(d.a.c.a.h hVar, i.d dVar) {
        String str = (String) hVar.b();
        if (!m.c(str).booleanValue()) {
            dVar.b(Integer.valueOf(e.a.a.e.b.i(this.f725c, str)));
            return;
        }
        throw new e.a.a.e.f.a("Empty channel key");
    }

    private void t(d.a.c.a.h hVar, i.d dVar) {
        new e.a.a.e.a(this.f725c, dVar, (String) hVar.b()).execute(new Void[0]);
    }

    private void u(d.a.c.a.h hVar, i.d dVar) {
        dVar.b(f.f841b.getID());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(d.a.c.a.h hVar, i.d dVar) {
        e.a.a.e.h.d dVar2;
        Map map = (Map) k.a(hVar.b(), Map.class).d();
        Map<String, Object> map2 = (Map) map.get("schedule");
        String str = (String) map.get("fixedDate");
        if (map2.containsKey("interval")) {
            g gVar = new g();
            gVar.m(map2);
            dVar2 = gVar;
        } else {
            e.a.a.e.h.d dVar3 = new e.a.a.e.h.d();
            dVar3.m(map2);
            dVar2 = dVar3;
        }
        String str2 = null;
        Calendar j = dVar2.j(!m.c(str).booleanValue() ? f.e(str, dVar2.f826a) : null);
        if (j != null) {
            str2 = f.a(j.getTime(), dVar2.f826a);
        }
        dVar.b(str2);
    }

    private void w(d.a.c.a.h hVar, i.d dVar) {
        dVar.b(f.f840a.getID());
    }

    private void x(d.a.c.a.h hVar, i.d dVar) {
        Map map = (Map) hVar.b();
        Boolean bool = (Boolean) map.get("debug");
        f721d = bool;
        f721d = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        W(this.f725c, (String) map.get("defaultIcon"), (List) map.get("initializeChannels"));
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Awesome Notifications service initialized");
        }
        dVar.b(Boolean.TRUE);
    }

    private void y(d.a.c.a.h hVar, i.d dVar) {
        List<e.a.a.e.h.i> d2 = e.a.a.e.g.f.d(this.f725c);
        ArrayList arrayList = new ArrayList();
        if (d2 != null) {
            for (e.a.a.e.h.i iVar : d2) {
                arrayList.add(iVar.h());
            }
        }
        dVar.b(arrayList);
    }

    private void z(d.a.c.a.h hVar, i.d dVar) {
        Boolean bool;
        String str = (String) hVar.b();
        if (!m.c(str).booleanValue()) {
            if (e.a.a.e.g.a.d(this.f725c, str).booleanValue()) {
                if (f721d.booleanValue()) {
                    d.a.b.a("AwesomeNotificationsPlugin", "Channel removed");
                }
                bool = Boolean.TRUE;
            } else {
                if (f721d.booleanValue()) {
                    d.a.b.a("AwesomeNotificationsPlugin", "Channel '" + str + "' not found");
                }
                bool = Boolean.FALSE;
            }
            dVar.b(bool);
            e.a.a.e.g.a.a(this.f725c);
            return;
        }
        throw new e.a.a.e.f.a("Empty channel key");
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void a() {
        H();
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification Lifecycle: (onDetachedFromActivity)" + f.toString());
        }
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void b(io.flutter.embedding.engine.h.c.c cVar) {
        this.f723a = cVar.b();
        cVar.a(this);
        H();
        this.f723a.getApplication().registerActivityLifecycleCallbacks(this);
        f722e = this.f723a.getIntent().getComponent().getClassName();
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification Lifecycle: (onAttachedToActivity)" + f.toString());
        }
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void c(io.flutter.embedding.engine.h.c.c cVar) {
        H();
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification Lifecycle: (onReattachedToActivityForConfigChanges)" + f.toString());
        }
    }

    @Override // d.a.c.a.l
    public boolean d(Intent intent) {
        return Q(intent).booleanValue();
    }

    @Override // io.flutter.embedding.engine.h.a
    public void e(a.b bVar) {
        this.f724b.e(null);
        H();
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification Lifecycle: (onDetachedFromEngine)" + f.toString());
        }
    }

    @Override // io.flutter.embedding.engine.h.c.a
    public void f() {
        H();
        if (f721d.booleanValue()) {
            d.a.b.a("AwesomeNotificationsPlugin", "Notification Lifecycle: (onDetachedFromActivityForConfigChanges)" + f.toString());
        }
    }

    @Override // d.a.c.a.i.c
    public void g(d.a.c.a.h hVar, i.d dVar) {
        H();
        try {
            String str = hVar.f695a;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2042497058:
                    if (str.equals("getDrawableData")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1965356877:
                    if (str.equals("isNotificationAllowed")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1703770220:
                    if (str.equals("resetBadge")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case -1178233329:
                    if (str.equals("createNewNotification")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -805784615:
                    if (str.equals("listAllSchedules")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -793150793:
                    if (str.equals("getNextDate")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -510652267:
                    if (str.equals("dismissNotification")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case -500377545:
                    if (str.equals("getLocalTimeZoneIdentifier")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -410224827:
                    if (str.equals("startForeground")) {
                        c2 = 20;
                        break;
                    }
                    break;
                case -248532251:
                    if (str.equals("stopForeground")) {
                        c2 = 21;
                        break;
                    }
                    break;
                case 277436886:
                    if (str.equals("setNotificationChannel")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 459085428:
                    if (str.equals("removeNotificationChannel")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 476295833:
                    if (str.equals("requestNotifications")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 710681733:
                    if (str.equals("cancelNotification")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 757156642:
                    if (str.equals("getBadgeCount")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1048987573:
                    if (str.equals("cancelAllSchedules")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 1228036977:
                    if (str.equals("dismissAllNotifications")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 1438018736:
                    if (str.equals("getUtcTimeZoneIdentifier")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 1531287854:
                    if (str.equals("setBadgeCount")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 1665796913:
                    if (str.equals("cancelSchedule")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 1693644641:
                    if (str.equals("cancelAllNotifications")) {
                        c2 = 19;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    x(hVar, dVar);
                    return;
                case 1:
                    t(hVar, dVar);
                    return;
                case 2:
                    k(hVar, dVar);
                    return;
                case 3:
                    F(hVar, dVar);
                    return;
                case 4:
                    p(hVar, dVar);
                    return;
                case 5:
                    y(hVar, dVar);
                    return;
                case 6:
                    v(hVar, dVar);
                    return;
                case 7:
                    u(hVar, dVar);
                    return;
                case '\b':
                    w(hVar, dVar);
                    return;
                case '\t':
                    C(hVar, dVar);
                    return;
                case '\n':
                    z(hVar, dVar);
                    return;
                case 11:
                    s(hVar, dVar);
                    return;
                case '\f':
                    B(hVar, dVar);
                    return;
                case '\r':
                    A(hVar, dVar);
                    return;
                case 14:
                    r(hVar, dVar);
                    return;
                case 15:
                    n(hVar, dVar);
                    return;
                case 16:
                    o(hVar, dVar);
                    return;
                case 17:
                    q(hVar, dVar);
                    return;
                case 18:
                    m(hVar, dVar);
                    return;
                case 19:
                    l(hVar, dVar);
                    return;
                case 20:
                    D(hVar, dVar);
                    return;
                case 21:
                    E(hVar, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
        } catch (Exception e2) {
            if (f721d.booleanValue()) {
                d.a.b.a("AwesomeNotificationsPlugin", e2.getMessage());
            }
            dVar.a(hVar.f695a, e2.getMessage(), e2);
            e2.printStackTrace();
        }
    }

    @Override // io.flutter.embedding.engine.h.a
    public void h(a.b bVar) {
        i(bVar.a(), new i(bVar.b(), "awesome_notifications"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        H();
        String action = intent.getAction();
        action.hashCode();
        char c2 = 65535;
        switch (action.hashCode()) {
            case -1122260740:
                if (action.equals("broadcast.awesome_notifications.MEDIA_BUTTON")) {
                    c2 = 0;
                    break;
                }
                break;
            case 168712976:
                if (action.equals("broadcast.awesome_notifications.DISMISSED_NOTIFICATION")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1335089664:
                if (action.equals("broadcast.awesome_notifications.KEEP_ON_TOP")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1581039064:
                if (action.equals("broadcast.awesome_notifications.DISPLAYED_NOTIFICATION")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1645069041:
                if (action.equals("broadcast.awesome_notifications.CREATED_NOTIFICATION")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                M(intent);
                return;
            case 1:
                O(intent);
                return;
            case 2:
                L(intent);
                return;
            case 3:
                P(intent);
                return;
            case 4:
                N(intent);
                return;
            default:
                if (!f721d.booleanValue()) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Received unknown action: ");
                if (m.c(action).booleanValue()) {
                    action = "empty";
                }
                sb.append(action);
                d.a.b.a("AwesomeNotificationsPlugin", sb.toString());
                return;
        }
    }
}
