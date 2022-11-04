package a0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.core.util.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class c {

    /* renamed from: a */
    private static Method f144a;

    static {
        try {
            Class cls = Integer.TYPE;
            f144a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e10) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e10);
        }
    }

    public static ImageWriter a(Surface surface, int i10, int i11) {
        Throwable th2 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) h.g(f144a.invoke(null, surface, Integer.valueOf(i10), Integer.valueOf(i11)));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                th2 = e10;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th2);
    }
}
