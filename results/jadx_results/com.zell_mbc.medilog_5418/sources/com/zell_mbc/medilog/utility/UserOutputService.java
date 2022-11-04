package com.zell_mbc.medilog.utility;

import android.view.View;
import kotlin.Metadata;
/* compiled from: UserOutputService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/zell_mbc/medilog/utility/UserOutputService;", "", "showAndHideMessageForLong", "", "messageAsCharSequence", "", "messageAsResourceId", "", "showAndHideMessageForShort", "showMessageAndWaitForDuration", "durationAsMilliseconds", "showMessageAndWaitForDurationAndAction", "actionMessageAsCharSequence", "actionListener", "Landroid/view/View$OnClickListener;", "actionTextColor", "showMessageAndWaitForLong", "messageAsString", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface UserOutputService {
    void showAndHideMessageForLong(int i);

    void showAndHideMessageForLong(CharSequence charSequence);

    void showAndHideMessageForShort(int i);

    void showAndHideMessageForShort(CharSequence charSequence);

    void showMessageAndWaitForDuration(CharSequence charSequence, int i);

    void showMessageAndWaitForDurationAndAction(CharSequence charSequence, int i, CharSequence charSequence2, View.OnClickListener onClickListener, int i2);

    void showMessageAndWaitForLong(int i);

    void showMessageAndWaitForLong(CharSequence charSequence);
}
