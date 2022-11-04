package androidx.compose.ui;

import androidx.compose.ui.focus.FocusEventModifierLocal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ComposedModifier.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class ComposedModifierKt$WrapFocusEventModifier$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FocusEventModifierLocal $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$WrapFocusEventModifier$1$1$1(FocusEventModifierLocal focusEventModifierLocal) {
        super(0);
        this.$modifier = focusEventModifierLocal;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final void invoke2() {
        this.$modifier.notifyIfNoFocusModifiers();
    }
}
