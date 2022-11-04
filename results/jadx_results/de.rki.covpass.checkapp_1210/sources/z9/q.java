package z9;

import hc.t;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004\u001a\f\u0010\u0007\u001a\u00020\u0005*\u0004\u0018\u00010\u0004\u001a\f\u0010\b\u001a\u00020\u0005*\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0004¨\u0006\u000e"}, d2 = {"j$/time/ZonedDateTime", BuildConfig.FLAVOR, "c", "e", "j$/time/Instant", BuildConfig.FLAVOR, "b", "f", "g", BuildConfig.FLAVOR, "defaultEpochMilli", "h", "a", "d", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class q {
    public static final int a(Instant instant) {
        t.e(instant, "<this>");
        return (int) Duration.between(instant, Instant.now()).toDays();
    }

    public static final String b(Instant instant) {
        DateTimeFormatter ofLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        if (instant != null) {
            String format = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()).format(ofLocalizedDate);
            t.d(format, "{\n        ZonedDateTime.…).format(formatter)\n    }");
            return format;
        }
        return BuildConfig.FLAVOR;
    }

    public static final int c(ZonedDateTime zonedDateTime) {
        t.e(zonedDateTime, "<this>");
        return (int) Duration.between(zonedDateTime, ZonedDateTime.now()).toHours();
    }

    public static final int d(Instant instant) {
        t.e(instant, "<this>");
        return ((int) Duration.between(instant, Instant.now()).toDays()) / 30;
    }

    public static final ZonedDateTime e(ZonedDateTime zonedDateTime) {
        t.e(zonedDateTime, "<this>");
        ZonedDateTime withZoneSameInstant = zonedDateTime.withZoneSameInstant(ZoneId.systemDefault());
        t.d(withZoneSameInstant, "withZoneSameInstant(ZoneId.systemDefault())");
        return withZoneSameInstant;
    }

    public static final String f(Instant instant) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        if (instant != null) {
            String format = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()).format(dateTimeFormatter);
            t.d(format, "{\n        ZonedDateTime.…).format(formatter)\n    }");
            return format;
        }
        return BuildConfig.FLAVOR;
    }

    public static final String g(Instant instant) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        if (instant != null) {
            String format = ZonedDateTime.ofInstant(instant, ZoneId.of("UTC")).format(dateTimeFormatter);
            t.d(format, "{\n        ZonedDateTime.…).format(formatter)\n    }");
            return format;
        }
        return BuildConfig.FLAVOR;
    }

    public static final ZonedDateTime h(Instant instant, long j10) {
        if (instant == null) {
            instant = Instant.ofEpochMilli(j10);
        }
        ZonedDateTime atZone = instant.atZone(ZoneOffset.UTC);
        t.d(atZone, "this ?: Instant.ofEpochM…)).atZone(ZoneOffset.UTC)");
        return atZone;
    }
}
