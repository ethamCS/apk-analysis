package t;

import android.os.Build;
import java.util.Locale;
import w.x1;
/* loaded from: classes.dex */
public class z implements x1 {
    public static boolean a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
