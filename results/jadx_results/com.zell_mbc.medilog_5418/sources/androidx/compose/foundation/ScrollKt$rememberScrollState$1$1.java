package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Scroll.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class ScrollKt$rememberScrollState$1$1 extends Lambda implements Function0<ScrollState> {
    final /* synthetic */ int $initial;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1$1(int i) {
        super(0);
        this.$initial = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
