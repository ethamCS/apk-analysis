package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements Function1<IntSize, IntOffset> {
    final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$slideInVertically$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$initialOffsetY = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
        return IntOffset.m4215boximpl(m76invokemHKZG7I(intSize.m4270unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I */
    public final long m76invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(0, this.$initialOffsetY.invoke(Integer.valueOf(IntSize.m4265getHeightimpl(j))).intValue());
    }
}