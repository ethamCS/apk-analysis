package j$.util;

import j$.time.ZoneId;
import java.util.Objects;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class DesugarTimeZone {
    public static ZoneId a(TimeZone timeZone) {
        String id2 = timeZone.getID();
        java.util.Map map = ZoneId.f13005a;
        Objects.requireNonNull(id2, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id2);
        if (str != null) {
            id2 = str;
        }
        return ZoneId.of(id2);
    }

    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }
}
