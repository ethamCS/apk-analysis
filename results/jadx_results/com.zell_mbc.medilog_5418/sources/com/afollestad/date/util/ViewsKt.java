package com.afollestad.date.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Views.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0000\u001a2\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0000\u001a4\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0000¨\u0006\u0015"}, d2 = {"conceal", "", "Landroid/view/View;", "hide", "inflate", "Landroid/view/ViewGroup;", "res", "", "isVisible", "", "placeAt", "top", "left", "rightOffset", "bottomOffset", "show", "showOrConceal", "showOrHide", "updatePadding", "right", "bottom", "com.afollestad.date-picker"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class ViewsKt {
    public static final void show(View show) {
        Intrinsics.checkParameterIsNotNull(show, "$this$show");
        if (show.getVisibility() == 0) {
            return;
        }
        show.setVisibility(0);
    }

    public static final void hide(View hide) {
        Intrinsics.checkParameterIsNotNull(hide, "$this$hide");
        if (hide.getVisibility() == 8) {
            return;
        }
        hide.setVisibility(8);
    }

    public static final void conceal(View conceal) {
        Intrinsics.checkParameterIsNotNull(conceal, "$this$conceal");
        if (conceal.getVisibility() == 4) {
            return;
        }
        conceal.setVisibility(4);
    }

    public static final void showOrHide(View showOrHide, boolean z) {
        Intrinsics.checkParameterIsNotNull(showOrHide, "$this$showOrHide");
        if (z) {
            show(showOrHide);
        } else {
            hide(showOrHide);
        }
    }

    public static final void showOrConceal(View showOrConceal, boolean z) {
        Intrinsics.checkParameterIsNotNull(showOrConceal, "$this$showOrConceal");
        if (z) {
            show(showOrConceal);
        } else {
            conceal(showOrConceal);
        }
    }

    public static final boolean isVisible(View isVisible) {
        Intrinsics.checkParameterIsNotNull(isVisible, "$this$isVisible");
        return isVisible.getVisibility() == 0;
    }

    public static final View inflate(ViewGroup inflate, int i) {
        Intrinsics.checkParameterIsNotNull(inflate, "$this$inflate");
        View inflate2 = LayoutInflater.from(inflate.getContext()).inflate(i, inflate, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(cont…inflate(res, this, false)");
        return inflate2;
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        updatePadding(view, i, i2, i3, i4);
    }

    public static final void updatePadding(View updatePadding, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(updatePadding, "$this$updatePadding");
        updatePadding.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void placeAt$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = view.getMeasuredWidth();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getMeasuredHeight();
        }
        placeAt(view, i, i2, i3, i4);
    }

    public static final void placeAt(View placeAt, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(placeAt, "$this$placeAt");
        placeAt.layout(i2, i, i3 + i2, i4 + i);
    }
}
