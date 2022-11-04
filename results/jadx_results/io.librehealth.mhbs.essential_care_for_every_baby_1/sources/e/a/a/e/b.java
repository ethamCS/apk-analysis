package e.a.a.e;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.service.notification.StatusBarNotification;
import androidx.core.app.e;
import androidx.core.app.i;
import e.a.a.e.e.g;
import e.a.a.e.h.e;
import e.a.a.e.h.f;
import e.a.a.e.h.i;
import e.a.a.g.h;
import e.a.a.g.j;
import e.a.a.g.m;
import java.util.ArrayList;
import java.util.Arrays;
import me.carda.awesome_notifications.notifications.broadcastReceivers.DismissedNotificationReceiver;
import me.carda.awesome_notifications.notifications.broadcastReceivers.KeepOnTopActionReceiver;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f738a;

        static {
            int[] iArr = new int[g.values().length];
            f738a = iArr;
            try {
                iArr[g.BigPicture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f738a[g.BigText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f738a[g.Inbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f738a[g.Messaging.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f738a[g.MediaPlayer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f738a[g.ProgressBar.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f738a[g.Default.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void A(e eVar, e.C0015e c0015e) {
        if (e.a.a.g.c.a(eVar.k)) {
            c0015e.w(h.c(eVar.l, -1).intValue(), h.c(eVar.m, 300).intValue(), h.c(eVar.n, 700).intValue());
        }
    }

    private void B(i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        Boolean valueOf = Boolean.valueOf(e.a.a.g.c.a(iVar.f831b.l));
        Boolean valueOf2 = Boolean.valueOf(e.a.a.g.c.a(eVar.u));
        boolean z = true;
        if (valueOf.booleanValue()) {
            c0015e.y(true);
        } else if (!valueOf2.booleanValue()) {
        } else {
            if (!e.a.a.g.c.b(iVar.f831b.l, Boolean.TRUE) || !valueOf2.booleanValue()) {
                z = false;
            }
            c0015e.y(Boolean.valueOf(z).booleanValue());
        }
    }

    private Boolean C(Context context, f fVar, e.C0015e c0015e) {
        androidx.media.m.a aVar = new androidx.media.m.a();
        aVar.s(1, 2, 3);
        aVar.t(true);
        aVar.r(e.a.a.a.g.b());
        c0015e.G(aVar);
        if (!m.c(fVar.f823e).booleanValue()) {
            c0015e.H(fVar.f823e);
        }
        c0015e.C(false);
        return Boolean.TRUE;
    }

    private Boolean D(Context context, f fVar, e.C0015e c0015e) {
        return Boolean.TRUE;
    }

    private void E(i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        c0015e.z(Boolean.valueOf(e.a.a.g.c.a(Boolean.valueOf(iVar.f831b.x == g.ProgressBar ? true : eVar.v.booleanValue()))).booleanValue());
    }

    private void F(i iVar, e.C0015e c0015e) {
        boolean z = false;
        int max = Math.max(0, Math.min(100, h.c(iVar.f831b.t, 0).intValue()));
        if (iVar.f831b.t == null) {
            z = true;
        }
        c0015e.B(100, max, z);
    }

    private void G(i iVar, e.C0015e c0015e) {
        c0015e.C(e.a.a.g.c.b(iVar.f831b.f, Boolean.TRUE));
    }

    private void H(Context context, i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        int j;
        String str;
        if (!m.c(iVar.f831b.j).booleanValue()) {
            str = iVar.f831b.j;
        } else if (m.c(eVar.s).booleanValue()) {
            String b2 = e.a.a.e.g.c.b(context);
            if (m.c(b2).booleanValue()) {
                Integer num = eVar.r;
                if (num != null) {
                    j = num.intValue();
                } else {
                    j = context.getResources().getIdentifier("ic_launcher", "mipmap", context.getPackageName());
                    if (j <= 0) {
                        return;
                    }
                }
            } else {
                j = e.a.a.g.b.j(context, b2);
                if (j <= 0) {
                    return;
                }
            }
            c0015e.D(j);
        } else {
            str = eVar.s;
        }
        j = e.a.a.g.b.j(context, str);
        c0015e.D(j);
    }

    private void I(Context context, i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        c0015e.F(e.a.a.g.c.a(eVar.f) ? e.a.a.e.g.a.e(context, eVar.h, eVar.g) : null);
    }

    private void J(i iVar, e.C0015e c0015e) {
        c0015e.I(m.b(m.b(m.b(iVar.f831b.u, null), iVar.f831b.f823e), iVar.f831b.f822d));
    }

    private void K(i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        String str = iVar.f831b.f821c;
        if (str != null) {
            c0015e.p(e.a.a.g.g.b(str));
        }
    }

    private void L(e.a.a.e.h.e eVar, e.C0015e c0015e) {
        if (!e.a.a.g.c.a(eVar.i)) {
            c0015e.J(new long[]{0});
            return;
        }
        long[] jArr = eVar.j;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        c0015e.J(jArr);
    }

    private void M(Context context, i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        if (Build.VERSION.SDK_INT >= 21) {
            c0015e.K(h.c(h.c(iVar.f831b.v, Integer.valueOf(eVar.w.ordinal())), e.a.a.e.e.i.Public).intValue() - 1);
        }
    }

    public static e.a.a.e.h.j.a a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        boolean z = false;
        Boolean valueOf = Boolean.valueOf("SELECT_NOTIFICATION".equals(action) || "DISMISSED_NOTIFICATION".equals(action));
        Boolean valueOf2 = Boolean.valueOf(action.startsWith("ACTION_NOTIFICATION"));
        if (!valueOf.booleanValue() && !valueOf2.booleanValue()) {
            return null;
        }
        Integer valueOf3 = Integer.valueOf(intent.getIntExtra("id", -1));
        i a2 = new i().a(intent.getStringExtra("notificationJson"));
        if (a2 == null) {
            return null;
        }
        e.a.a.e.h.j.a aVar = new e.a.a.e.h.j.a(a2.f831b);
        aVar.F = e.a.a.a.f;
        if (valueOf2.booleanValue()) {
            aVar.D = intent.getStringExtra("key");
            if (intent.getStringExtra("buttonType").equals(e.a.a.e.e.a.InputField.toString())) {
                aVar.E = h(intent, intent.getStringExtra("key"));
            }
        }
        if (valueOf3.intValue() >= 0) {
            z = true;
        }
        if (intent.getBooleanExtra("autoCancel", z)) {
            if (!m.c(aVar.E).booleanValue() && Build.VERSION.SDK_INT >= 28) {
                try {
                    d.i(context, a2);
                    context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    Thread.sleep(200L);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            d.c(context, valueOf3);
        }
        if (m.c(aVar.C).booleanValue()) {
            aVar.C = e.a.a.g.f.c();
        }
        aVar.H = e.a.a.g.f.c();
        if (valueOf2.booleanValue() && intent.getStringExtra("buttonType").equals(e.a.a.e.e.a.DisabledAction.toString())) {
            return null;
        }
        return aVar;
    }

    private Integer f(i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        Integer c2 = h.c(iVar.f831b.s, null);
        if (c2 != null) {
            c0015e.m(true);
            return c2;
        }
        return j(iVar, eVar);
    }

    public static String g(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("count_key");
        if (str == null) {
            str = "_total";
        }
        sb.append(str);
        return sb.toString();
    }

    private static String h(Intent intent, String str) {
        Bundle k = androidx.core.app.i.k(intent);
        if (k != null) {
            return k.getCharSequence(str).toString();
        }
        return null;
    }

    public static int i(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(g(context, str), 0);
    }

    private Integer j(i iVar, e.a.a.e.h.e eVar) {
        return h.c(h.c(iVar.f831b.r, eVar.t), -16777216);
    }

    private e.C0015e k(Context context, i iVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        e.a.a.e.h.e b2 = e.a.a.e.g.a.b(context, iVar.f831b.f820b);
        if (b2 == null) {
            throw new e.a.a.e.f.a("Channel '" + iVar.f831b.f820b + "' does not exist or is disabled");
        }
        e.C0015e c0015e = new e.C0015e(context, iVar.f831b.f820b);
        u(context, iVar, b2, c0015e);
        M(context, iVar, b2, c0015e);
        G(iVar, c0015e);
        y(context, iVar, c0015e);
        d(context, iVar, c0015e);
        K(iVar, b2, c0015e);
        s(iVar, c0015e);
        o(iVar, c0015e);
        J(iVar, c0015e);
        E(iVar, b2, c0015e);
        B(iVar, b2, c0015e);
        v(b2, c0015e);
        I(context, iVar, b2, c0015e);
        L(b2, c0015e);
        A(b2, c0015e);
        H(context, iVar, b2, c0015e);
        x(context, iVar, c0015e);
        z(context, iVar, b2, c0015e);
        p(context, b2, c0015e);
        if (Build.VERSION.SDK_INT >= 26) {
            c0015e.k(b2.l());
        }
        c0015e.n(pendingIntent);
        c0015e.q(pendingIntent2);
        return c0015e;
    }

    public static int m(Context context, e.a.a.e.h.e eVar) {
        int i = i(context, null) + 1;
        t(context, null, i);
        return i;
    }

    public static void n(Context context, String str) {
        t(context, str, 0);
    }

    private void o(i iVar, e.C0015e c0015e) {
        c0015e.j(e.a.a.g.c.b(iVar.f831b.o, Boolean.TRUE));
    }

    private void p(Context context, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        if (e.a.a.g.c.a(eVar.f817d)) {
            m(context, eVar);
            c0015e.x(1);
        }
    }

    private Boolean q(Context context, f fVar, e.C0015e c0015e) {
        Bitmap bitmap = null;
        Bitmap h = !m.c(fVar.k).booleanValue() ? e.a.a.g.b.h(context, fVar.k) : null;
        Bitmap h2 = !m.c(fVar.m).booleanValue() ? e.a.a.g.b.h(context, fVar.m) : null;
        if (h2 == null) {
            return Boolean.FALSE;
        }
        e.b bVar = new e.b();
        bVar.m(h2);
        if (!fVar.n.booleanValue()) {
            bitmap = h;
        }
        bVar.l(bitmap);
        if (!m.c(fVar.f821c).booleanValue()) {
            bVar.n(e.a.a.g.g.b(fVar.f821c));
        }
        if (!m.c(fVar.f822d).booleanValue()) {
            bVar.o(e.a.a.g.g.b(fVar.f822d));
        }
        c0015e.G(bVar);
        return Boolean.TRUE;
    }

    private Boolean r(Context context, f fVar, e.C0015e c0015e) {
        e.c cVar = new e.c();
        if (m.c(fVar.f822d).booleanValue()) {
            return Boolean.FALSE;
        }
        cVar.l(e.a.a.g.g.b(fVar.f822d));
        if (!m.c(fVar.f823e).booleanValue()) {
            cVar.n(e.a.a.g.g.b(fVar.f823e));
        }
        if (!m.c(fVar.f821c).booleanValue()) {
            cVar.m(e.a.a.g.g.b(fVar.f821c));
        }
        c0015e.G(cVar);
        return Boolean.TRUE;
    }

    private void s(i iVar, e.C0015e c0015e) {
        c0015e.o(e.a.a.g.g.b(iVar.f831b.f822d));
    }

    public static void t(Context context, String str, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        try {
            edit.putInt(g(context, str), i);
            c.a.a.a.a(context, i);
        } catch (c.a.a.b unused) {
        }
        edit.apply();
    }

    private void u(Context context, i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        if (!m.c(eVar.o).booleanValue()) {
            c0015e.s(eVar.o);
            if (iVar.f830a) {
                c0015e.u(true);
            } else {
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 23) {
                    for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
                        if (statusBarNotification.getGroupKey().contains("g:" + eVar.o)) {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    iVar.f830a = true;
                }
            }
            String num = iVar.f831b.f819a.toString();
            c0015e.E(Long.toString(eVar.p == e.a.a.e.e.d.Asc ? System.currentTimeMillis() : Long.MAX_VALUE - System.currentTimeMillis()) + num);
            c0015e.t(eVar.q.ordinal());
        }
    }

    private void v(e.a.a.e.h.e eVar, e.C0015e c0015e) {
        c0015e.A(Math.min(Math.max(h.b(eVar.f818e).intValue() - 2, -2), 2));
    }

    private Boolean w(Context context, f fVar, e.C0015e c0015e) {
        Boolean bool = Boolean.FALSE;
        e.f fVar2 = new e.f();
        if (m.c(fVar.f822d).booleanValue()) {
            return bool;
        }
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(fVar.f822d.split("\\r?\\n")));
        if (j.a(arrayList).booleanValue()) {
            return bool;
        }
        fVar2.n(m.c(fVar.f823e).booleanValue() ? "+ " + arrayList.size() + " more" : e.a.a.g.g.b(fVar.f822d));
        if (!m.c(fVar.f821c).booleanValue()) {
            fVar2.m(e.a.a.g.g.b(fVar.f821c));
        }
        String str = fVar.f823e;
        if (str != null) {
            fVar2.n(e.a.a.g.g.b(str));
        }
        for (String str2 : arrayList) {
            fVar2.l(e.a.a.g.g.b(str2));
        }
        c0015e.G(fVar2);
        return Boolean.TRUE;
    }

    private void x(Context context, i iVar, e.C0015e c0015e) {
        Bitmap h;
        if (m.c(iVar.f831b.k).booleanValue() || (h = e.a.a.g.b.h(context, iVar.f831b.k)) == null) {
            return;
        }
        c0015e.v(h);
    }

    private void y(Context context, i iVar, e.C0015e c0015e) {
        switch (a.f738a[iVar.f831b.x.ordinal()]) {
            case 1:
                if (q(context, iVar.f831b, c0015e).booleanValue()) {
                }
                return;
            case 2:
                if (!r(context, iVar.f831b, c0015e).booleanValue()) {
                    return;
                }
                return;
            case 3:
                if (!w(context, iVar.f831b, c0015e).booleanValue()) {
                    return;
                }
                return;
            case 4:
                if (!D(context, iVar.f831b, c0015e).booleanValue()) {
                    return;
                }
                return;
            case 5:
                if (!C(context, iVar.f831b, c0015e).booleanValue()) {
                    return;
                }
                return;
            case 6:
                F(iVar, c0015e);
                return;
            default:
                return;
        }
    }

    private void z(Context context, i iVar, e.a.a.e.h.e eVar, e.C0015e c0015e) {
        c0015e.l((iVar.f831b.s == null ? j(iVar, eVar) : f(iVar, eVar, c0015e)).intValue());
    }

    public Intent b(Context context, String str, i iVar) {
        return c(context, str, iVar, l(context));
    }

    public Intent c(Context context, String str, i iVar, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        intent.putExtra("id", iVar.f831b.f819a);
        intent.putExtra("notificationJson", iVar.g());
        intent.putExtra("autoCancel", iVar.f831b.o);
        return intent;
    }

    public void d(Context context, i iVar, e.C0015e c0015e) {
        if (j.a(iVar.f833d).booleanValue()) {
            return;
        }
        for (e.a.a.e.h.c cVar : iVar.f833d) {
            String str = "ACTION_NOTIFICATION_" + cVar.f808a;
            e.a.a.e.e.a aVar = cVar.f;
            e.a.a.e.e.a aVar2 = e.a.a.e.e.a.DisabledAction;
            Intent c2 = c(context, str, iVar, aVar == aVar2 ? e.a.a.a.class : aVar == e.a.a.e.e.a.KeepOnTop ? KeepOnTopActionReceiver.class : l(context));
            c2.putExtra("autoCancel", cVar.f812e);
            c2.putExtra("enabled", cVar.f811d);
            c2.putExtra("buttonType", cVar.f.toString());
            c2.putExtra("key", cVar.f808a);
            PendingIntent pendingIntent = null;
            int i = 0;
            if (cVar.f811d.booleanValue()) {
                e.a.a.e.e.a aVar3 = cVar.f;
                if (aVar3 == e.a.a.e.e.a.KeepOnTop) {
                    pendingIntent = PendingIntent.getBroadcast(context, iVar.f831b.f819a.intValue(), c2, 134217728);
                } else if (aVar3 == aVar2) {
                    pendingIntent = PendingIntent.getActivity(context, iVar.f831b.f819a.intValue(), c2, 0);
                } else {
                    if (Build.VERSION.SDK_INT < 24 && aVar3 == e.a.a.e.e.a.InputField) {
                        c2.setAction("android.intent.action.MAIN");
                        c2.addFlags(268435456);
                    }
                    pendingIntent = PendingIntent.getActivity(context, iVar.f831b.f819a.intValue(), c2, 134217728);
                }
            }
            if (!m.c(cVar.f809b).booleanValue()) {
                i = e.a.a.g.b.j(context, cVar.f809b);
            }
            if (cVar.f == e.a.a.e.e.a.InputField) {
                i.a aVar4 = new i.a(cVar.f808a);
                aVar4.b(cVar.f810c);
                androidx.core.app.i a2 = aVar4.a();
                e.a.C0014a c0014a = new e.a.C0014a(i, cVar.f810c, pendingIntent);
                c0014a.a(a2);
                c0015e.b(c0014a.b());
            } else {
                c0015e.a(i, cVar.f810c, pendingIntent);
            }
        }
    }

    public Notification e(Context context, e.a.a.e.h.i iVar) {
        return k(context, iVar, PendingIntent.getActivity(context, iVar.f831b.f819a.intValue(), b(context, "SELECT_NOTIFICATION", iVar), 134217728), PendingIntent.getBroadcast(context, iVar.f831b.f819a.intValue(), c(context, "DISMISSED_NOTIFICATION", iVar, DismissedNotificationReceiver.class), 268435456)).c();
    }

    public Class l(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        try {
            return Class.forName(launchIntentForPackage == null ? e.a.a.a.I() : launchIntentForPackage.getComponent().getClassName());
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
