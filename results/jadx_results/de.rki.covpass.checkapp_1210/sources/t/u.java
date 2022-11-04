package t;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes.dex */
public final class u implements b0.e {

    /* renamed from: a */
    private static final Set<String> f21784a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    public static boolean a(r.z zVar) {
        return f21784a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
