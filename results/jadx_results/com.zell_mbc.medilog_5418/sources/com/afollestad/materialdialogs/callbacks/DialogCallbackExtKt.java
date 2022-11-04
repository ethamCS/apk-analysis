package com.afollestad.materialdialogs.callbacks;

import android.content.DialogInterface;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DialogCallbackExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00050\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005¨\u0006\f"}, d2 = {"invokeAll", "", "", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "dialog", "onCancel", "callback", "onDismiss", "onPreShow", "onShow", "core"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class DialogCallbackExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final MaterialDialog onPreShow(MaterialDialog onPreShow, Function1<? super MaterialDialog, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(onPreShow, "$this$onPreShow");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        onPreShow.getPreShowListeners$core().add(callback);
        return onPreShow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MaterialDialog onShow(final MaterialDialog onShow, Function1<? super MaterialDialog, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(onShow, "$this$onShow");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        onShow.getShowListeners$core().add(callback);
        if (onShow.isShowing()) {
            invokeAll(onShow.getShowListeners$core(), onShow);
        }
        onShow.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt$onShow$1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                DialogCallbackExtKt.invokeAll(MaterialDialog.this.getShowListeners$core(), MaterialDialog.this);
            }
        });
        return onShow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MaterialDialog onDismiss(final MaterialDialog onDismiss, Function1<? super MaterialDialog, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(onDismiss, "$this$onDismiss");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        onDismiss.getDismissListeners$core().add(callback);
        onDismiss.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt$onDismiss$1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogCallbackExtKt.invokeAll(MaterialDialog.this.getDismissListeners$core(), MaterialDialog.this);
            }
        });
        return onDismiss;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MaterialDialog onCancel(final MaterialDialog onCancel, Function1<? super MaterialDialog, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(onCancel, "$this$onCancel");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        onCancel.getCancelListeners$core().add(callback);
        onCancel.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt$onCancel$1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogCallbackExtKt.invokeAll(MaterialDialog.this.getCancelListeners$core(), MaterialDialog.this);
            }
        });
        return onCancel;
    }

    public static final void invokeAll(List<Function1<MaterialDialog, Unit>> invokeAll, MaterialDialog dialog) {
        Intrinsics.checkParameterIsNotNull(invokeAll, "$this$invokeAll");
        Intrinsics.checkParameterIsNotNull(dialog, "dialog");
        for (Function1<MaterialDialog, Unit> function1 : invokeAll) {
            function1.invoke(dialog);
        }
    }
}
