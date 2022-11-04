package io.noties.markwon.utils;

import android.graphics.drawable.Drawable;
@Deprecated
/* loaded from: classes2.dex */
public abstract class DrawableUtils {
    public static void intrinsicBounds(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private DrawableUtils() {
    }
}
