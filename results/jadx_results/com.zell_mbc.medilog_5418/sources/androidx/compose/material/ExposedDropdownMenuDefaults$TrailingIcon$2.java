package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class ExposedDropdownMenuDefaults$TrailingIcon$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final ExposedDropdownMenuDefaults$TrailingIcon$2 INSTANCE = new ExposedDropdownMenuDefaults$TrailingIcon$2();

    ExposedDropdownMenuDefaults$TrailingIcon$2() {
        super(1);
    }

    /* renamed from: invoke */
    public final void invoke2(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }
}
