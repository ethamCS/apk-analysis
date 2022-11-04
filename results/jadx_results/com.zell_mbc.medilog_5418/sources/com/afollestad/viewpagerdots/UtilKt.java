package com.afollestad.viewpagerdots;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Util.kt */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"tint", "Landroid/graphics/drawable/Drawable;", TypedValues.Custom.S_COLOR, "", BuildConfig.APPLICATION_ID}, k = 2, mv = {1, 1, 11})
/* loaded from: classes2.dex */
public final class UtilKt {
    public static final Drawable tint(Drawable receiver, int i) {
        Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        Drawable wrapped = DrawableCompat.wrap(receiver);
        DrawableCompat.setTint(wrapped, i);
        Intrinsics.checkExpressionValueIsNotNull(wrapped, "wrapped");
        return wrapped;
    }
}
