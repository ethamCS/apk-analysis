package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyStaggeredGridScope.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class LazyStaggeredGridScopeImpl$item$3 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Function3<LazyStaggeredGridItemScope, Composer, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScopeImpl$item$3(Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> function3) {
        super(4);
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyStaggeredGridItemScope items, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation(composer, "C37@1415L9:LazyStaggeredGridScope.kt#fzvcnm");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed(items) ? 4 : 2;
        }
        if ((i2 & 651) == 130 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2037756640, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.<anonymous> (LazyStaggeredGridScope.kt:37)");
        }
        this.$content.invoke(items, composer, Integer.valueOf(i2 & 14));
        if (!ComposerKt.isTraceInProgress()) {
            return;
        }
        ComposerKt.traceEventEnd();
    }
}
