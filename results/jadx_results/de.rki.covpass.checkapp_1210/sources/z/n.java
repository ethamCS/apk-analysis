package z;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.c3;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class n {
    public static Map<c3, Rect> a(Rect rect, boolean z10, Rational rational, int i10, int i11, int i12, Map<c3, Size> map) {
        androidx.core.util.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<c3, Size> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF g10 = g(rectF2, d0.a.c(i10, rational), i11, z10, i12, i10);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, g10);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((c3) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    private static RectF b(boolean z10, int i10, RectF rectF, RectF rectF2) {
        boolean z11 = true;
        boolean z12 = i10 == 0 && !z10;
        boolean z13 = i10 == 90 && z10;
        if (z12 || z13) {
            return rectF2;
        }
        boolean z14 = i10 == 0 && z10;
        boolean z15 = i10 == 270 && !z10;
        if (z14 || z15) {
            return c(rectF2, rectF.centerX());
        }
        boolean z16 = i10 == 90 && !z10;
        boolean z17 = i10 == 180 && z10;
        if (z16 || z17) {
            return d(rectF2, rectF.centerY());
        }
        boolean z18 = i10 == 180 && !z10;
        if (i10 != 270 || !z10) {
            z11 = false;
        }
        if (z18 || z11) {
            return c(d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z10 + " rotation " + i10);
    }

    private static RectF c(RectF rectF, float f10) {
        return new RectF(e(rectF.right, f10), rectF.top, e(rectF.left, f10), rectF.bottom);
    }

    private static RectF d(RectF rectF, float f10) {
        return new RectF(rectF.left, f(rectF.bottom, f10), rectF.right, f(rectF.top, f10));
    }

    private static float e(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    private static float f(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    @SuppressLint({"SwitchIntDef"})
    public static RectF g(RectF rectF, Rational rational, int i10, boolean z10, int i11, int i12) {
        Matrix.ScaleToFit scaleToFit;
        if (i10 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i10 == 0) {
            scaleToFit = Matrix.ScaleToFit.START;
        } else if (i10 == 1) {
            scaleToFit = Matrix.ScaleToFit.CENTER;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unexpected scale type: " + i10);
        } else {
            scaleToFit = Matrix.ScaleToFit.END;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return b(h(z10, i11), i12, rectF, rectF3);
    }

    private static boolean h(boolean z10, int i10) {
        boolean z11 = true;
        if (i10 != 1) {
            z11 = false;
        }
        return z10 ^ z11;
    }
}
