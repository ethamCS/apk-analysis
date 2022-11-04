package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: PullRefreshIndicatorTransform.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ MutableState<Integer> $height$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1$1(MutableState<Integer> mutableState) {
        super(1);
        this.$height$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m1303invokeozmzZPI(intSize.m4270unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI */
    public final void m1303invokeozmzZPI(long j) {
        PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2.m1302invoke$lambda2(this.$height$delegate, IntSize.m4265getHeightimpl(j));
    }
}
