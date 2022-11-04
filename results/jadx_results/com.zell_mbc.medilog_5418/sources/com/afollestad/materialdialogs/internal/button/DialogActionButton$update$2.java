package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: DialogActionButton.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
final class DialogActionButton$update$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogActionButton$update$2(Context context) {
        super(0);
        this.$appContext = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return ColorsKt.adjustAlpha(MDUtil.resolveColor$default(MDUtil.INSTANCE, this.$appContext, null, Integer.valueOf(R.attr.colorPrimary), null, 10, null), 0.12f);
    }
}
