package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static class a {
        static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context a(Context context) {
        String b10;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (b10 = a.b(context)) == null) ? applicationContext : a.a(applicationContext, b10);
    }

    public static Application b(Context context) {
        for (Context a10 = a(context); a10 instanceof ContextWrapper; a10 = c((ContextWrapper) a10)) {
            if (a10 instanceof Application) {
                return (Application) a10;
            }
        }
        return null;
    }

    public static Context c(ContextWrapper contextWrapper) {
        String b10;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (b10 = a.b(contextWrapper)) == null) ? baseContext : a.a(baseContext, b10);
    }
}
