package t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.x1;
/* loaded from: classes.dex */
public class x implements x1 {

    /* renamed from: a */
    private static final List<String> f21786a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && f21786a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
