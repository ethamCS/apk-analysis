package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.afollestad.materialdialogs.message.DialogMessageSettings;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: DialogContentLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0002J9\u0010,\u001a\u00020\b2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000e2\b\u0010.\u001a\u0004\u0018\u00010\b2\u0006\u0010/\u001a\u00020(2\u0006\u0010+\u001a\u00020(2\u0006\u00100\u001a\u00020(¢\u0006\u0002\u00101J$\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\b\u00107\u001a\u0004\u0018\u000108J\u0006\u00109\u001a\u00020(J\u001a\u0010:\u001a\u00020*2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000eJ\u001a\u0010=\u001a\u00020*2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000eJ0\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0014J\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000eH\u0014JN\u0010E\u001a\u00020*2\u0006\u00103\u001a\u0002042\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000e2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010I2\u0019\u0010J\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020*\u0018\u00010K¢\u0006\u0002\bM¢\u0006\u0002\u0010NR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "customView", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "frameHorizontalMargin", "", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin$delegate", "Lkotlin/Lazy;", "messageTextView", "Landroid/widget/TextView;", "recyclerView", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "rootLayout", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "scrollFrame", "Landroid/view/ViewGroup;", "scrollView", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "useHorizontalPadding", "", "addContentScrollView", "", "noVerticalPadding", "addCustomView", "res", "view", "scrollable", "horizontalPadding", "(Ljava/lang/Integer;Landroid/view/View;ZZZ)Landroid/view/View;", "addRecyclerView", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "haveMoreThanOneChild", "modifyFirstAndLastPadding", "top", "bottom", "modifyScrollViewPadding", "onLayout", "changed", "left", "right", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMessage", "text", "", "typeface", "Landroid/graphics/Typeface;", "applySettings", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "Lkotlin/ExtensionFunctionType;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;)V", "core"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class DialogContentLayout extends FrameLayout {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};
    private View customView;
    private final Lazy frameHorizontalMargin$delegate;
    private TextView messageTextView;
    private DialogRecyclerView recyclerView;
    private ViewGroup scrollFrame;
    private DialogScrollView scrollView;
    private boolean useHorizontalPadding;

    private final int getFrameHorizontalMargin() {
        Lazy lazy = this.frameHorizontalMargin$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return ((Number) lazy.getValue()).intValue();
    }

    public /* synthetic */ DialogContentLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.frameHorizontalMargin$delegate = LazyKt.lazy(new DialogContentLayout$frameHorizontalMargin$2(this));
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public final DialogScrollView getScrollView() {
        return this.scrollView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.scrollView = dialogScrollView;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.recyclerView = dialogRecyclerView;
    }

    public final View getCustomView() {
        return this.customView;
    }

    public final void setCustomView(View view) {
        this.customView = view;
    }

    public final void setMessage(MaterialDialog dialog, Integer num, CharSequence charSequence, Typeface typeface, Function1<? super DialogMessageSettings, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dialog, "dialog");
        addContentScrollView(false);
        if (this.messageTextView == null) {
            int i = R.layout.md_dialog_stub_message;
            ViewGroup viewGroup = this.scrollFrame;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            TextView textView = (TextView) ViewsKt.inflate(this, i, viewGroup);
            ViewGroup viewGroup2 = this.scrollFrame;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            viewGroup2.addView(textView);
            this.messageTextView = textView;
        }
        TextView textView2 = this.messageTextView;
        if (textView2 == null) {
            Intrinsics.throwNpe();
        }
        DialogMessageSettings dialogMessageSettings = new DialogMessageSettings(dialog, textView2);
        if (function1 != null) {
            function1.invoke(dialogMessageSettings);
        }
        TextView textView3 = this.messageTextView;
        if (textView3 != null) {
            if (typeface != null) {
                textView3.setTypeface(typeface);
            }
            MDUtil.maybeSetTextColor$default(MDUtil.INSTANCE, textView3, dialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), null, 4, null);
            dialogMessageSettings.setText$core(num, charSequence);
        }
    }

    public final void addRecyclerView(MaterialDialog dialog, RecyclerView.Adapter<?> adapter, RecyclerView.LayoutManager layoutManager) {
        Intrinsics.checkParameterIsNotNull(dialog, "dialog");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        if (this.recyclerView == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) ViewsKt.inflate$default(this, R.layout.md_dialog_stub_recyclerview, (ViewGroup) null, 2, (Object) null);
            dialogRecyclerView.attach(dialog);
            if (layoutManager == null) {
                layoutManager = new LinearLayoutManager(dialog.getWindowContext());
            }
            dialogRecyclerView.setLayoutManager(layoutManager);
            this.recyclerView = dialogRecyclerView;
            addView(dialogRecyclerView);
        }
        DialogRecyclerView dialogRecyclerView2 = this.recyclerView;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(adapter);
        }
    }

    public final View addCustomView(Integer num, View view, boolean z, boolean z2, boolean z3) {
        if (!(this.customView == null)) {
            throw new IllegalStateException("Custom view already set.".toString());
        }
        View view2 = null;
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (z) {
            this.useHorizontalPadding = false;
            addContentScrollView(z2);
            if (view == null) {
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                view = (View) ViewsKt.inflate(this, num.intValue(), this.scrollFrame);
            }
            this.customView = view;
            ViewGroup viewGroup2 = this.scrollFrame;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            View view3 = this.customView;
            if (view3 != null) {
                if (z3) {
                    MDUtil.updatePadding$default(MDUtil.INSTANCE, view3, getFrameHorizontalMargin(), 0, getFrameHorizontalMargin(), 0, 10, null);
                }
                view2 = view3;
            }
            viewGroup2.addView(view2);
        } else {
            this.useHorizontalPadding = z3;
            if (view == null) {
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                view = (View) ViewsKt.inflate$default(this, num.intValue(), (ViewGroup) null, 2, (Object) null);
            }
            this.customView = view;
            addView(view);
        }
        View view4 = this.customView;
        if (view4 == null) {
            Intrinsics.throwNpe();
        }
        return view4;
    }

    public final boolean haveMoreThanOneChild() {
        return getChildCount() > 1;
    }

    public static /* synthetic */ void modifyFirstAndLastPadding$default(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.modifyFirstAndLastPadding(i, i2);
    }

    public final void modifyFirstAndLastPadding(int i, int i2) {
        if (i != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, getChildAt(0), 0, i, 0, 0, 13, null);
        }
        if (i2 != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, getChildAt(getChildCount() - 1), 0, 0, 0, i2, 7, null);
        }
    }

    public static /* synthetic */ void modifyScrollViewPadding$default(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.modifyScrollViewPadding(i, i2);
    }

    public final void modifyScrollViewPadding(int i, int i2) {
        ViewGroup viewGroup = this.scrollView;
        if (viewGroup == null) {
            viewGroup = this.recyclerView;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (i != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, viewGroup2, 0, i, 0, 0, 13, null);
        }
        if (i2 != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, viewGroup2, 0, 0, 0, i2, 7, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.scrollView;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.scrollView;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i4 = size2 - measuredHeight;
        int childCount = this.scrollView != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i5 = i4 / childCount;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View currentChild = getChildAt(i6);
            Intrinsics.checkExpressionValueIsNotNull(currentChild, "currentChild");
            int id = currentChild.getId();
            DialogScrollView dialogScrollView3 = this.scrollView;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                if (Intrinsics.areEqual(currentChild, this.customView) && this.useHorizontalPadding) {
                    i3 = View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), BasicMeasure.EXACTLY);
                } else {
                    i3 = View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY);
                }
                currentChild.measure(i3, View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                measuredHeight += currentChild.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount) {
            View currentChild = getChildAt(i7);
            Intrinsics.checkExpressionValueIsNotNull(currentChild, "currentChild");
            int measuredHeight = currentChild.getMeasuredHeight() + i8;
            if (Intrinsics.areEqual(currentChild, this.customView) && this.useHorizontalPadding) {
                i6 = getFrameHorizontalMargin();
                i5 = getMeasuredWidth() - getFrameHorizontalMargin();
            } else {
                i5 = getMeasuredWidth();
                i6 = 0;
            }
            currentChild.layout(i6, i8, i5, measuredHeight);
            i7++;
            i8 = measuredHeight;
        }
    }

    private final void addContentScrollView(boolean z) {
        if (this.scrollView == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) ViewsKt.inflate$default(this, R.layout.md_dialog_stub_scrollview, (ViewGroup) null, 2, (Object) null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt != null) {
                this.scrollFrame = (ViewGroup) childAt;
                if (!z) {
                    DialogScrollView dialogScrollView2 = dialogScrollView;
                    MDUtil.updatePadding$default(MDUtil.INSTANCE, dialogScrollView2, 0, 0, 0, MDUtil.INSTANCE.dimenPx(dialogScrollView2, R.dimen.md_dialog_frame_margin_vertical), 7, null);
                }
                this.scrollView = dialogScrollView;
                addView(dialogScrollView);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
