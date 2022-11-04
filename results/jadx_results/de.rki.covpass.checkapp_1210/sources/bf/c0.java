package bf;

import java.util.Locale;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class c0 {
    public static final String a(char c10) {
        String valueOf = String.valueOf(c10);
        hc.t.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        hc.t.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c10 == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            hc.t.c(upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
            hc.t.c(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            hc.t.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c10));
    }
}
