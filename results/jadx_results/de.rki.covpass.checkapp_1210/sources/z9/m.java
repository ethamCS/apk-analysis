package z9;

import hc.t;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"j$/time/LocalDate", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "days", BuildConfig.FLAVOR, "b", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class m {
    public static final String a(LocalDate localDate) {
        t.e(localDate, "<this>");
        String format = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        t.d(format, "format(formatter)");
        return format;
    }

    public static final boolean b(LocalDate localDate, long j10) {
        t.e(localDate, "<this>");
        return localDate.plusDays(j10).isBefore(LocalDate.now());
    }
}
