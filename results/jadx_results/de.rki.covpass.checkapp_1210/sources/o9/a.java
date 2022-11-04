package o9;

import com.fasterxml.jackson.databind.ObjectMapper;
import dgca.verifier.app.engine.DateTimeKt;
import hc.t;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.m;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u0012\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u000fH\u0007¨\u0006\u0015"}, d2 = {"Lo9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "j$/time/LocalDate", "e", "(Ljava/lang/Long;)Lj$/time/LocalDate;", "localDate", "d", "j$/time/ZonedDateTime", "c", "(Ljava/lang/Long;)Lj$/time/ZonedDateTime;", "zonedDateTime", "f", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "list", "a", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public final String a(List<String> list) {
        ObjectMapper objectMapper = new ObjectMapper();
        if (list == null) {
            list = u.h();
        }
        String writeValueAsString = objectMapper.writeValueAsString(list);
        t.d(writeValueAsString, "objectMapper.writeValueA…t ?: emptyList<String>())");
        return writeValueAsString;
    }

    public final List<String> b(String str) {
        List<String> i02;
        Object readValue = new ObjectMapper().readValue(str, String[].class);
        t.d(readValue, "objectMap.readValue(valu…rray<String>::class.java)");
        i02 = m.i0((Object[]) readValue);
        return i02;
    }

    public final ZonedDateTime c(Long l10) {
        ZonedDateTime zonedDateTime;
        String str;
        if (l10 != null) {
            Instant ofEpochMilli = Instant.ofEpochMilli(l10.longValue());
            t.d(ofEpochMilli, "ofEpochMilli(value)");
            zonedDateTime = ZonedDateTime.ofInstant(ofEpochMilli, DateTimeKt.getUTC_ZONE_ID());
            str = "{\n        val instant: I…stant, UTC_ZONE_ID)\n    }";
        } else {
            zonedDateTime = ZonedDateTime.now(DateTimeKt.getUTC_ZONE_ID());
            str = "{\n        ZonedDateTime.now(UTC_ZONE_ID)\n    }";
        }
        t.d(zonedDateTime, str);
        return zonedDateTime;
    }

    public final long d(LocalDate localDate) {
        ZonedDateTime zonedDateTime;
        if (localDate == null || (zonedDateTime = localDate.atStartOfDay(DateTimeKt.getUTC_ZONE_ID())) == null) {
            zonedDateTime = ZonedDateTime.now(DateTimeKt.getUTC_ZONE_ID());
        }
        return zonedDateTime.toInstant().toEpochMilli();
    }

    public final LocalDate e(Long l10) {
        ZonedDateTime zonedDateTime;
        if (l10 != null) {
            Instant ofEpochMilli = Instant.ofEpochMilli(l10.longValue());
            t.d(ofEpochMilli, "ofEpochMilli(value)");
            zonedDateTime = ZonedDateTime.ofInstant(ofEpochMilli, DateTimeKt.getUTC_ZONE_ID());
        } else {
            zonedDateTime = ZonedDateTime.now(DateTimeKt.getUTC_ZONE_ID());
        }
        LocalDate t10 = zonedDateTime.t();
        t.d(t10, "if (value != null) {\n   …E_ID)\n    }.toLocalDate()");
        return t10;
    }

    public final long f(ZonedDateTime zonedDateTime) {
        ZonedDateTime zonedDateTime2;
        if (zonedDateTime == null || (zonedDateTime2 = zonedDateTime.withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID())) == null) {
            zonedDateTime2 = ZonedDateTime.now(DateTimeKt.getUTC_ZONE_ID());
        }
        return zonedDateTime2.toInstant().toEpochMilli();
    }
}
