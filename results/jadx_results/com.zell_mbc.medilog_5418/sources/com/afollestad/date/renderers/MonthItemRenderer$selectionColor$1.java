package com.afollestad.date.renderers;

import android.content.Context;
import com.afollestad.date.R;
import com.afollestad.date.util.ContextsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: MonthItemRenderer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class MonthItemRenderer$selectionColor$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ MonthItemRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthItemRenderer$selectionColor$1(MonthItemRenderer monthItemRenderer) {
        super(0);
        this.this$0 = monthItemRenderer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context context;
        context = this.this$0.context;
        return ContextsKt.resolveColor$default(context, R.attr.colorAccent, null, 2, null);
    }
}
