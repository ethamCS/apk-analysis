package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawerScrim$dismissModifier$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ String $closeDrawer;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerScrim$dismissModifier$2$1(String str, Function0<Unit> function0) {
        super(1);
        this.$closeDrawer = str;
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onDismiss.invoke();
            return true;
        }
    }

    /* renamed from: invoke */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.$closeDrawer);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass1(this.$onDismiss), 1, null);
    }
}