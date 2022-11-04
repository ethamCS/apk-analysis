package e.a.a.f;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import e.a.a.e.b;
import e.a.a.e.h.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends Service {

    /* renamed from: a */
    private final b f834a = new b();

    /* renamed from: e.a.a.f.a$a */
    /* loaded from: classes.dex */
    public static class C0044a implements Serializable {

        /* renamed from: a */
        public final HashMap<String, Object> f835a;

        /* renamed from: b */
        public final int f836b;

        /* renamed from: c */
        public final boolean f837c;

        /* renamed from: d */
        public final int f838d;

        public C0044a(Map<String, Object> map, int i, boolean z, int i2) {
            if (map instanceof HashMap) {
                this.f835a = (HashMap) map;
            } else {
                this.f835a = new HashMap<>(map);
            }
            this.f836b = i;
            this.f837c = z;
            this.f838d = i2;
        }

        public String toString() {
            return "StartParameter{notificationData=" + this.f835a + ", startMode=" + this.f836b + ", hasForegroundServiceType=" + this.f837c + ", foregroundServiceType=" + this.f838d + '}';
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C0044a c0044a = (C0044a) intent.getSerializableExtra("me.carda.awesome_notifications.services.ForegroundService$StartParameter");
        i b2 = new i().b(c0044a.f835a);
        int intValue = b2.f831b.f819a.intValue();
        try {
            Notification e2 = this.f834a.e(this, b2);
            if (!c0044a.f837c || Build.VERSION.SDK_INT < 29) {
                startForeground(intValue, e2);
            } else {
                startForeground(intValue, e2, c0044a.f838d);
            }
            return c0044a.f836b;
        } catch (e.a.a.e.f.a e3) {
            throw new RuntimeException(e3);
        }
    }
}
