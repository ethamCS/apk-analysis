package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyListItemProvider.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ LazyListState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$1(LazyListState lazyListState) {
        super(0);
        this.$state = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$state.getFirstVisibleItemIndex());
    }
}
