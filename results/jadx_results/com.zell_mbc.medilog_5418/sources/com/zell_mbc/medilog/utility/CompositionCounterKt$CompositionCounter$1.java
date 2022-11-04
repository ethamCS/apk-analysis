package com.zell_mbc.medilog.utility;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: CompositionCounter.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 176)
/* loaded from: classes2.dex */
public final class CompositionCounterKt$CompositionCounter$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref $ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionCounterKt$CompositionCounter$1(Ref ref) {
        super(0);
        this.$ref = ref;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        Ref ref = this.$ref;
        ref.setValue(ref.getValue() + 1);
    }
}
