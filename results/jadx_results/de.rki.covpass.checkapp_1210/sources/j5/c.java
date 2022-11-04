package j5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import b5.d;
import b5.l;
import com.google.android.material.internal.m;
/* loaded from: classes.dex */
public class c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray h10 = m.h(context, null, l.f5583i2, i10, i11, new int[0]);
        int dimensionPixelSize = h10.getDimensionPixelSize(l.f5610l2, context.getResources().getDimensionPixelSize(d.C));
        int dimensionPixelSize2 = h10.getDimensionPixelSize(l.f5619m2, context.getResources().getDimensionPixelSize(d.D));
        int dimensionPixelSize3 = h10.getDimensionPixelSize(l.f5601k2, context.getResources().getDimensionPixelSize(d.B));
        int dimensionPixelSize4 = h10.getDimensionPixelSize(l.f5592j2, context.getResources().getDimensionPixelSize(d.A));
        h10.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
