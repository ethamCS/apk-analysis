package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1 extends Lambda implements Function1<IntrinsicMeasurable, Integer> {
    final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(int i) {
        super(1);
        this.$width = i;
    }

    public final Integer invoke(IntrinsicMeasurable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.minIntrinsicHeight(this.$width));
    }
}
