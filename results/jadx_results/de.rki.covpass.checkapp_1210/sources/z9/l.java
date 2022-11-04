package z9;

import hc.t;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"j$/time/LocalDateTime", BuildConfig.FLAVOR, "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class l {
    public static final String a(LocalDateTime localDateTime) {
        t.e(localDateTime, "<this>");
        String format = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT));
        t.d(format, "format(formatter)");
        return format;
    }
}
