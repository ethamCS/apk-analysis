package a0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
/* loaded from: classes.dex */
public final class a {
    public static void a(ImageWriter imageWriter) {
        b.a(imageWriter);
    }

    public static Image b(ImageWriter imageWriter) {
        return b.b(imageWriter);
    }

    public static ImageWriter c(Surface surface, int i10) {
        return b.c(surface, i10);
    }

    public static ImageWriter d(Surface surface, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            return d.a(surface, i10, i11);
        }
        if (i12 >= 26) {
            return c.a(surface, i10, i11);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i12 + ". Version 26 or higher required.");
    }

    public static void e(ImageWriter imageWriter, Image image) {
        b.d(imageWriter, image);
    }
}
