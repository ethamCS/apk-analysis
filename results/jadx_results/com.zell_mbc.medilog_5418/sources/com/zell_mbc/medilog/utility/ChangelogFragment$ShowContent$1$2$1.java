package com.zell_mbc.medilog.utility;

import android.app.Dialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChangelogFragment.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
final class ChangelogFragment$ShowContent$1$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChangelogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangelogFragment$ShowContent$1$2$1(ChangelogFragment changelogFragment) {
        super(0);
        this.this$0 = changelogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        Dialog dialog = this.this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
