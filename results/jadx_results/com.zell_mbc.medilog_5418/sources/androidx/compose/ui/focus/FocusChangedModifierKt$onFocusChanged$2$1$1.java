package androidx.compose.ui.focus;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FocusChangedModifier.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class FocusChangedModifierKt$onFocusChanged$2$1$1 extends Lambda implements Function1<FocusState, Unit> {
    final /* synthetic */ MutableState<FocusState> $focusState;
    final /* synthetic */ Function1<FocusState, Unit> $onFocusChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedModifierKt$onFocusChanged$2$1$1(MutableState<FocusState> mutableState, Function1<? super FocusState, Unit> function1) {
        super(1);
        this.$focusState = mutableState;
        this.$onFocusChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(this.$focusState.getValue(), it)) {
            this.$focusState.setValue(it);
            this.$onFocusChanged.invoke(it);
        }
    }
}
