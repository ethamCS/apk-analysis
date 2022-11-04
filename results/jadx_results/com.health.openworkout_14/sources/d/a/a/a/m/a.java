package d.a.a.a.m;

import android.graphics.Canvas;
import android.os.Build;
/* loaded from: classes.dex */
public class a {
    public static int a(Canvas canvas, float f2, float f3, float f4, float f5, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
    }
}
