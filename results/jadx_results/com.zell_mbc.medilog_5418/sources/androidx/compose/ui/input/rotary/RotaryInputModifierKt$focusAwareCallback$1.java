package androidx.compose.ui.input.rotary;

import androidx.compose.ui.input.focus.FocusDirectedInputEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "e", "Landroidx/compose/ui/input/focus/FocusDirectedInputEvent;", "invoke", "(Landroidx/compose/ui/input/focus/FocusDirectedInputEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements Function1<FocusDirectedInputEvent, Boolean> {
    final /* synthetic */ Function1<RotaryScrollEvent, Boolean> $this_focusAwareCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputModifierKt$focusAwareCallback$1(Function1<? super RotaryScrollEvent, Boolean> function1) {
        super(1);
        this.$this_focusAwareCallback = function1;
    }

    public final Boolean invoke(FocusDirectedInputEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!(e instanceof RotaryScrollEvent)) {
            throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
        }
        return this.$this_focusAwareCallback.invoke(e);
    }
}
