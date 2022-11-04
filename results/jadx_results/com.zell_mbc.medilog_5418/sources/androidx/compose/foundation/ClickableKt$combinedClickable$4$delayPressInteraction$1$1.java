package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Clickable.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class ClickableKt$combinedClickable$4$delayPressInteraction$1$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ MutableState<Boolean> $isClickableInScrollableContainer;
    final /* synthetic */ Function0<Boolean> $isRootInScrollableContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickable$4$delayPressInteraction$1$1(MutableState<Boolean> mutableState, Function0<Boolean> function0) {
        super(0);
        this.$isClickableInScrollableContainer = mutableState;
        this.$isRootInScrollableContainer = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isClickableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
