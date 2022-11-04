package com.zell_mbc.medilog.utility;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.zell_mbc.medilog.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ThemeUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\b"}, d2 = {"getBackgroundColor", "", "context", "Landroid/content/Context;", "getFontSizeMediumInPx", "getFontSizeSmallInPx", "getTextColorPrimary", "getTextColorSecondary", "app_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeUtilKt {
    public static final int getFontSizeSmallInPx(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.TextSmall, new int[]{16842901});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…android.R.attr.textSize))");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 12);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static final int getFontSizeMediumInPx(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.TextMedium, new int[]{16842901});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…android.R.attr.textSize))");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 15);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static final int getTextColorSecondary(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842808, typedValue, true);
        return ContextCompat.getColor(context, typedValue.resourceId);
    }

    public static final int getBackgroundColor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        return ContextCompat.getColor(context, typedValue.resourceId);
    }

    public static final int getTextColorPrimary(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842806, typedValue, true);
        return ContextCompat.getColor(context, typedValue.resourceId);
    }
}
