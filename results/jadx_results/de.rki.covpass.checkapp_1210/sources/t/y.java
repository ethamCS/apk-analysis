package t;

import android.os.Build;
import w.x1;
/* loaded from: classes.dex */
public class y implements x1 {
    public static boolean a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return a();
    }
}
