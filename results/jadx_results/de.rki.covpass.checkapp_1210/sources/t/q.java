package t;

import android.os.Build;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import w.x1;
/* loaded from: classes.dex */
public class q implements x1 {

    /* renamed from: a */
    private static final Set<Pair<String, String>> f21780a = new HashSet(Arrays.asList(new Pair("sprd", "lemp")));

    public static boolean a() {
        Set<Pair<String, String>> set = f21780a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
