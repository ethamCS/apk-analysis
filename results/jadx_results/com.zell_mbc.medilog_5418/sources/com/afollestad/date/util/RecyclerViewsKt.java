package com.afollestad.date.util;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RecyclerViews.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"attachTopDivider", "", "Landroidx/recyclerview/widget/RecyclerView;", "divider", "Landroid/view/View;", "invalidateTopDividerNow", "com.afollestad.date-picker"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class RecyclerViewsKt {
    public static final void attachTopDivider(final RecyclerView attachTopDivider, final View divider) {
        Intrinsics.checkParameterIsNotNull(attachTopDivider, "$this$attachTopDivider");
        Intrinsics.checkParameterIsNotNull(divider, "divider");
        invalidateTopDividerNow(attachTopDivider, divider);
        attachTopDivider.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.afollestad.date.util.RecyclerViewsKt$attachTopDivider$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                RecyclerViewsKt.invalidateTopDividerNow(RecyclerView.this, divider);
            }
        });
    }

    public static final void invalidateTopDividerNow(RecyclerView invalidateTopDividerNow, View divider) {
        Intrinsics.checkParameterIsNotNull(invalidateTopDividerNow, "$this$invalidateTopDividerNow");
        Intrinsics.checkParameterIsNotNull(divider, "divider");
        if (!ViewsKt.isVisible(invalidateTopDividerNow)) {
            ViewsKt.hide(divider);
        } else {
            ViewsKt.showOrHide(divider, invalidateTopDividerNow.computeVerticalScrollOffset() > divider.getMeasuredHeight() * 2);
        }
    }
}
