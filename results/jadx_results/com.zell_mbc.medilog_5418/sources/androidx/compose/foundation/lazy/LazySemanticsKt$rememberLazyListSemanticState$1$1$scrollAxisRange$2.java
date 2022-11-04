package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazySemantics.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class LazySemanticsKt$rememberLazyListSemanticState$1$1$scrollAxisRange$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ LazyListState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$rememberLazyListSemanticState$1$1$scrollAxisRange$2(LazyListState lazyListState, LazyLayoutItemProvider lazyLayoutItemProvider) {
        super(0);
        this.$state = lazyListState;
        this.$itemProvider = lazyLayoutItemProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float f;
        float f2;
        if (this.$state.getCanScrollForward$foundation_release()) {
            f2 = this.$itemProvider.getItemCount();
            f = 1.0f;
        } else {
            f2 = this.$state.getFirstVisibleItemIndex();
            f = this.$state.getFirstVisibleItemScrollOffset() / 100000.0f;
        }
        return Float.valueOf(f2 + f);
    }
}
