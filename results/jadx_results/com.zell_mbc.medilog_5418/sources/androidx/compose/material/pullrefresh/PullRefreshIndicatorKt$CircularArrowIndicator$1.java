package androidx.compose.material.pullrefresh;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PullRefreshIndicator.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class PullRefreshIndicatorKt$CircularArrowIndicator$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final PullRefreshIndicatorKt$CircularArrowIndicator$1 INSTANCE = new PullRefreshIndicatorKt$CircularArrowIndicator$1();

    PullRefreshIndicatorKt$CircularArrowIndicator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "Refreshing");
    }
}
