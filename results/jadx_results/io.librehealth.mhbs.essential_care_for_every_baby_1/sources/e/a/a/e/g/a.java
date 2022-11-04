package e.a.a.e.g;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import e.a.a.g.l;
import e.a.a.g.m;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final g<e.a.a.e.h.e> f793a = new g<>("ChannelManager", e.a.a.e.h.e.class);

    /* renamed from: e.a.a.e.g.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0043a {

        /* renamed from: a */
        static final /* synthetic */ int[] f794a;

        static {
            int[] iArr = new int[e.a.a.e.e.b.values().length];
            f794a = iArr;
            try {
                iArr[e.a.a.e.e.b.Ringtone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f794a[e.a.a.e.e.b.Alarm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f794a[e.a.a.e.e.b.Notification.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(Context context) {
        f793a.a(context);
    }

    public static e.a.a.e.h.e b(Context context, String str) {
        return f793a.d(context, "channels", str);
    }

    private static void c(Context context, String str) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                notificationManager.deleteNotificationChannel(str);
            } catch (Exception unused) {
            }
        }
    }

    public static Boolean d(Context context, String str) {
        e.a.a.e.h.e b2 = b(context, str);
        if (b2 == null) {
            return Boolean.TRUE;
        }
        c(context, b2.f814a);
        c(context, b2.l());
        return f793a.g(context, "channels", str);
    }

    public static Uri e(Context context, e.a.a.e.e.b bVar, String str) {
        if (m.c(str).booleanValue()) {
            int i = C0043a.f794a[bVar.ordinal()];
            int i2 = 2;
            if (i == 1) {
                i2 = 1;
            } else if (i == 2) {
                i2 = 4;
            }
            return RingtoneManager.getDefaultUri(i2);
        }
        int e2 = e.a.a.g.a.e(context, str);
        if (e2 <= 0) {
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/" + e2);
    }

    public static void f(Context context, e.a.a.e.h.e eVar, Boolean bool) {
        e.a.a.e.h.e b2 = b(context, eVar.f814a);
        if (Build.VERSION.SDK_INT >= 26 && b2 != null && !b2.l().equals(eVar.l()) && bool.booleanValue()) {
            c(context, b2.f814a);
            c(context, b2.l());
        }
        g(context, eVar);
        g<e.a.a.e.h.e> gVar = f793a;
        gVar.h(context, "channels", eVar.f814a, eVar);
        gVar.a(context);
    }

    public static void g(Context context, e.a.a.e.h.e eVar) {
        Integer num;
        int j;
        String str = eVar.s;
        if (str != null) {
            if (l.b(str) == e.a.a.e.e.e.Resource && (j = e.a.a.g.b.j(context, eVar.s)) > 0) {
                eVar.r = Integer.valueOf(j);
            } else {
                eVar.s = null;
            }
        }
        try {
            eVar.i(context);
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(eVar.l(), eVar.f815b, eVar.f818e.ordinal());
            notificationChannel.setDescription(eVar.f816c);
            if (eVar.f.booleanValue()) {
                notificationChannel.setSound(e(context, eVar.h, eVar.g), new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
            } else {
                notificationChannel.setSound(null, null);
            }
            notificationChannel.enableVibration(e.a.a.g.c.a(eVar.i));
            long[] jArr = eVar.j;
            if (jArr != null && jArr.length > 0) {
                notificationChannel.setVibrationPattern(jArr);
            }
            boolean a2 = e.a.a.g.c.a(eVar.k);
            notificationChannel.enableLights(a2);
            if (a2 && (num = eVar.l) != null) {
                notificationChannel.setLightColor(num.intValue());
            }
            notificationChannel.setShowBadge(e.a.a.g.c.a(eVar.f817d));
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (e.a.a.e.f.a e2) {
            e2.printStackTrace();
        }
    }
}
