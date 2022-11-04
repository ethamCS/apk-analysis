package com.zell_mbc.medilog.utility;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserOutputServiceImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J0\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/zell_mbc/medilog/utility/UserOutputServiceImpl;", "Lcom/zell_mbc/medilog/utility/UserOutputService;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "showASnackBarWithNoActionListenerWithDuration", "", "messageAsCharSequence", "", TypedValues.TransitionType.S_DURATION, "", "messageAsResourceId", "showAndHideMessageForLong", "showAndHideMessageForShort", "showMessageAndWaitForDuration", "durationAsMilliseconds", "showMessageAndWaitForDurationAndAction", "actionMessageAsCharSequence", "actionListener", "Landroid/view/View$OnClickListener;", "actionTextColor", "showMessageAndWaitForLong", "messageAsString", "showToastWithDuration", "Companion", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UserOutputServiceImpl implements UserOutputService {
    public static final String ACTION_TEXT = "Action";
    private final Context context;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UserOutputServiceImpl(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.view = view;
    }

    public final Context getContext() {
        return this.context;
    }

    public final View getView() {
        return this.view;
    }

    /* compiled from: UserOutputServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/zell_mbc/medilog/utility/UserOutputServiceImpl$Companion;", "", "()V", "ACTION_TEXT", "", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showAndHideMessageForLong(int i) {
        showToastWithDuration(i, 1);
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showAndHideMessageForLong(CharSequence messageAsCharSequence) {
        Intrinsics.checkNotNullParameter(messageAsCharSequence, "messageAsCharSequence");
        showToastWithDuration(messageAsCharSequence, 1);
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showAndHideMessageForShort(int i) {
        showToastWithDuration(i, 0);
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showAndHideMessageForShort(CharSequence messageAsCharSequence) {
        Intrinsics.checkNotNullParameter(messageAsCharSequence, "messageAsCharSequence");
        showToastWithDuration(messageAsCharSequence, 0);
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showMessageAndWaitForLong(CharSequence messageAsString) {
        Intrinsics.checkNotNullParameter(messageAsString, "messageAsString");
        showASnackBarWithNoActionListenerWithDuration(messageAsString, 0);
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showMessageAndWaitForDuration(CharSequence messageAsCharSequence, int i) {
        Intrinsics.checkNotNullParameter(messageAsCharSequence, "messageAsCharSequence");
        showASnackBarWithNoActionListenerWithDuration(messageAsCharSequence, i);
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showMessageAndWaitForDurationAndAction(CharSequence messageAsCharSequence, int i, CharSequence actionMessageAsCharSequence, View.OnClickListener actionListener, int i2) {
        Intrinsics.checkNotNullParameter(messageAsCharSequence, "messageAsCharSequence");
        Intrinsics.checkNotNullParameter(actionMessageAsCharSequence, "actionMessageAsCharSequence");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        View view = this.view;
        if (view == null) {
            return;
        }
        Snackbar.make(view, messageAsCharSequence, i).setAction(actionMessageAsCharSequence, actionListener).setActionTextColor(SupportMenu.CATEGORY_MASK).show();
    }

    @Override // com.zell_mbc.medilog.utility.UserOutputService
    public void showMessageAndWaitForLong(int i) {
        showASnackBarWithNoActionListenerWithDuration(i);
    }

    private final void showToastWithDuration(int i, int i2) {
        Context context = this.context;
        Toast.makeText(context, context.getString(i), i2).show();
    }

    private final void showToastWithDuration(CharSequence charSequence, int i) {
        Toast.makeText(this.context, charSequence, i).show();
    }

    private final void showASnackBarWithNoActionListenerWithDuration(CharSequence charSequence, int i) {
        View view = this.view;
        if (view == null) {
            return;
        }
        Snackbar.make(view, charSequence, i).setAction(ACTION_TEXT, (View.OnClickListener) null).show();
    }

    private final void showASnackBarWithNoActionListenerWithDuration(int i) {
        View view = this.view;
        if (view == null) {
            return;
        }
        Snackbar.make(view, i, 0).setAction(ACTION_TEXT, (View.OnClickListener) null).show();
    }
}
