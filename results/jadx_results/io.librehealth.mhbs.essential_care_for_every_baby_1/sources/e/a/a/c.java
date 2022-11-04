package e.a.a;

import e.a.a.e.e.d;
import e.a.a.e.e.f;
import e.a.a.e.e.g;
import e.a.a.e.e.i;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public interface c {

    /* renamed from: a */
    public static final Map<String, Object> f726a = new a();

    /* loaded from: classes.dex */
    static class a extends HashMap<String, Object> {
        a() {
            Boolean bool = Boolean.TRUE;
            put("FIREBASE_ENABLED", bool);
            put("repeats", bool);
            put("id", 0);
            put("importance", f.Default);
            put("notificationLayout", g.Default);
            put("groupSort", d.Desc);
            put("groupAlertBehavior", e.a.a.e.e.c.All);
            put("defaultPrivacy", i.Private);
            put("channelKey", "miscellaneous");
            put("channelDescription", "Notifications");
            put("channelName", "Notifications");
            Boolean bool2 = Boolean.FALSE;
            put("channelShowBadge", bool2);
            put("displayOnForeground", bool);
            put("displayOnBackground", bool);
            put("hideLargeIconOnExpand", bool2);
            put("enabled", bool);
            put("showWen", bool);
            put("buttonType", e.a.a.e.e.a.Default);
            put("payload", null);
            put("enableVibration", bool);
            put("defaultColor", -16777216);
            put("ledColor", -1);
            put("enableLights", bool);
            put("ledOffMs", 700);
            put("ledOnMs", 300);
            put("playSound", bool);
            put("autoCancel", bool);
            put("defaultRingtoneType", e.a.a.e.e.b.Notification);
            put("ticker", "ticker");
            put("allowWhileIdle", bool2);
            put("onlyAlertOnce", bool2);
        }
    }
}
