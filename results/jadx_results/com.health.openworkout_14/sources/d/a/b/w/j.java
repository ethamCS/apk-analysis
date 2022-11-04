package d.a.b.w;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public class j {
    private static String a(int i) {
        if (i != 0) {
            if (i == 1) {
                return "MMMM d, yyyy";
            }
            if (i == 2) {
                return "MMM d, yyyy";
            }
            if (i == 3) {
                return "M/d/yy";
            }
            throw new IllegalArgumentException("Unknown DateFormat style: " + i);
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    public static DateFormat c(int i, int i2) {
        return new SimpleDateFormat(a(i) + " " + b(i2), Locale.US);
    }
}
