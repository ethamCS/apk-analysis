package com.afollestad.date.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Attrs.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001\u001a,\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¨\u0006\n"}, d2 = {TypedValues.Custom.S_COLOR, "", "Landroid/content/res/TypedArray;", "attr", "fallback", "Lkotlin/Function0;", "font", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "com.afollestad.date-picker"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class AttrsKt {
    public static final int color(TypedArray color, int i, Function0<Integer> fallback) {
        Intrinsics.checkParameterIsNotNull(color, "$this$color");
        Intrinsics.checkParameterIsNotNull(fallback, "fallback");
        int color2 = color.getColor(i, 0);
        return color2 == 0 ? fallback.invoke().intValue() : color2;
    }

    public static final Typeface font(TypedArray font, Context context, int i, Function0<? extends Typeface> fallback) {
        Intrinsics.checkParameterIsNotNull(font, "$this$font");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fallback, "fallback");
        int resourceId = font.getResourceId(i, 0);
        if (resourceId == 0) {
            return fallback.invoke();
        }
        Typeface font2 = ResourcesCompat.getFont(context, resourceId);
        return font2 != null ? font2 : fallback.invoke();
    }
}
