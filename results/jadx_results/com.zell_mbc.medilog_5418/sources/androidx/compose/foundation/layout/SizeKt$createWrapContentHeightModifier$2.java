package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class SizeKt$createWrapContentHeightModifier$2 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Alignment.Vertical $align;
    final /* synthetic */ boolean $unbounded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentHeightModifier$2(Alignment.Vertical vertical, boolean z) {
        super(1);
        this.$align = vertical;
        this.$unbounded = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(InspectorInfo $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        $receiver.setName("wrapContentHeight");
        $receiver.getProperties().set("align", this.$align);
        $receiver.getProperties().set("unbounded", Boolean.valueOf(this.$unbounded));
    }
}