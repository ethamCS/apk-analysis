package b.c.g;

import android.os.Build;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a {
    public static int a(Object... objArr) {
        int i = Build.VERSION.SDK_INT;
        return Arrays.hashCode(objArr);
    }
}
