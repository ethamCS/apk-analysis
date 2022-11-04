package b.c.f;

import android.content.Context;
import android.os.Build;
import java.io.File;
/* loaded from: classes.dex */
public class a {
    public static File[] a(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalCacheDirs() : new File[]{context.getExternalCacheDir()};
    }

    public static File[] b(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalFilesDirs(str) : new File[]{context.getExternalFilesDir(str)};
    }
}
