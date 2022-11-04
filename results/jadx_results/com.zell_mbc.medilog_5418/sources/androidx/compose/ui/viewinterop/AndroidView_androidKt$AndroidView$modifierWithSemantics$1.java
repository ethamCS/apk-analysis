package androidx.compose.ui.viewinterop;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AndroidView.android.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class AndroidView_androidKt$AndroidView$modifierWithSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final AndroidView_androidKt$AndroidView$modifierWithSemantics$1 INSTANCE = new AndroidView_androidKt$AndroidView$modifierWithSemantics$1();

    AndroidView_androidKt$AndroidView$modifierWithSemantics$1() {
        super(1);
    }

    /* renamed from: invoke */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }
}
