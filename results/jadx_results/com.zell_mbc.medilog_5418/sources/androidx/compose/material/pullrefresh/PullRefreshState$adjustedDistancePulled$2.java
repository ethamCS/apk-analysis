package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshState$adjustedDistancePulled$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ PullRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$adjustedDistancePulled$2(PullRefreshState pullRefreshState) {
        super(0);
        this.this$0 = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float distancePulled;
        distancePulled = this.this$0.getDistancePulled();
        return Float.valueOf(distancePulled * 0.5f);
    }
}