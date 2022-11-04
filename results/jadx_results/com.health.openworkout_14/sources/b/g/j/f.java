package b.g.j;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final Locale f2490a = new Locale("", "");

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f2490a)) {
            return 0;
        }
        String c2 = b.c(locale);
        return c2 == null ? a(locale) : (c2.equalsIgnoreCase("Arab") || c2.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
