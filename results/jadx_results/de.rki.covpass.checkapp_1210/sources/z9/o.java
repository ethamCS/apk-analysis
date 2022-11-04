package z9;

import hc.t;
import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0003"}, d2 = {BuildConfig.FLAVOR, "date", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o {
    public static final String a(String str) {
        t.e(str, "date");
        try {
            LocalDate parse = LocalDate.parse(str);
            t.d(parse, "parse(date)");
            return m.a(parse);
        } catch (DateTimeParseException unused) {
            return str;
        }
    }
}
