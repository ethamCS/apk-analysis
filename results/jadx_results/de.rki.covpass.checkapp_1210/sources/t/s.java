package t;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import w.x1;
/* loaded from: classes.dex */
public class s implements x1 {

    /* renamed from: a */
    public static final List<String> f21782a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean a() {
        return f21782a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
