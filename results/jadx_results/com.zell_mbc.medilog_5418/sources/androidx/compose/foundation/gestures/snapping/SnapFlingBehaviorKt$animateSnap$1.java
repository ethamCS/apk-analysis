package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {331}, m = "animateSnap", n = {"animationState", "initialVelocity"}, s = {"L$0", "F$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateSnap$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateSnap$1(Continuation<? super SnapFlingBehaviorKt$animateSnap$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateSnap;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateSnap = SnapFlingBehaviorKt.animateSnap(null, 0.0f, 0.0f, null, null, this);
        return animateSnap;
    }
}
