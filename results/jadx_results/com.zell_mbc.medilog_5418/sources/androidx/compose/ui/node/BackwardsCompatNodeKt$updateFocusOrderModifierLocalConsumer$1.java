package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BackwardsCompatNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/BackwardsCompatNode;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class BackwardsCompatNodeKt$updateFocusOrderModifierLocalConsumer$1 extends Lambda implements Function1<BackwardsCompatNode, Unit> {
    public static final BackwardsCompatNodeKt$updateFocusOrderModifierLocalConsumer$1 INSTANCE = new BackwardsCompatNodeKt$updateFocusOrderModifierLocalConsumer$1();

    BackwardsCompatNodeKt$updateFocusOrderModifierLocalConsumer$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BackwardsCompatNode backwardsCompatNode) {
        invoke2(backwardsCompatNode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(BackwardsCompatNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.updateFocusOrderModifierLocalConsumer();
    }
}