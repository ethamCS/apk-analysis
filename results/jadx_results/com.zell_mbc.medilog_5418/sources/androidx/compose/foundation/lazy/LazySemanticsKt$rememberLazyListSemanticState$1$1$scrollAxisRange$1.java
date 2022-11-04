package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazySemantics.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class LazySemanticsKt$rememberLazyListSemanticState$1$1$scrollAxisRange$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ LazyListState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$rememberLazyListSemanticState$1$1$scrollAxisRange$1(LazyListState lazyListState) {
        super(0);
        this.$state = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$state.getFirstVisibleItemIndex() + (this.$state.getFirstVisibleItemScrollOffset() / 100000.0f));
    }
}
