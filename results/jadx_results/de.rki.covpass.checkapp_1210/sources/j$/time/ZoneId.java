package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a */
    public static final Map f13005a;

    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f13005a = Collections.unmodifiableMap(hashMap);
    }

    public ZoneId() {
        if (getClass() == ZoneOffset.class || getClass() == y.class) {
            return;
        }
        throw new AssertionError("Invalid subclass");
    }

    public static ZoneId o(TemporalAccessor temporalAccessor) {
        int i10 = j$.time.temporal.k.f13171a;
        ZoneId zoneId = (ZoneId) temporalAccessor.k(j$.time.temporal.q.f13176a);
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneId of(String str) {
        int i10;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i10 = 3;
        } else if (!str.startsWith("UT")) {
            return y.r(str);
        } else {
            i10 = 2;
        }
        return q(str, i10);
    }

    public static ZoneId ofOffset(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.s() != 0) {
                str = str.concat(zoneOffset.p());
            }
            return new y(str, ZoneRules.j(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static ZoneId q(String str, int i10) {
        String substring = str.substring(0, i10);
        if (str.length() == i10) {
            return ofOffset(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return y.r(str);
        }
        try {
            ZoneOffset of2 = ZoneOffset.of(str.substring(i10));
            return of2 == ZoneOffset.UTC ? ofOffset(substring, of2) : ofOffset(substring, of2);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: " + str, e10);
        }
    }

    public static ZoneId systemDefault() {
        return DesugarTimeZone.a(TimeZone.getDefault());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneId)) {
            return false;
        }
        return p().equals(((ZoneId) obj).p());
    }

    public abstract ZoneRules getRules();

    public int hashCode() {
        return p().hashCode();
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.i()) {
                return rules.d(Instant.EPOCH);
            }
        } catch (j$.time.zone.c unused) {
        }
        return this;
    }

    public abstract String p();

    public String toString() {
        return p();
    }
}
