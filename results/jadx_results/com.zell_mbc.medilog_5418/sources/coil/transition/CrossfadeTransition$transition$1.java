package coil.transition;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: CrossfadeTransition.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@"}, d2 = {"transition", "", TypedValues.AttributesType.S_TARGET, "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "coil.transition.CrossfadeTransition", f = "CrossfadeTransition.kt", i = {0, 0, 0, 0}, l = {85}, m = "transition", n = {"this", TypedValues.AttributesType.S_TARGET, "result", "outerCrossfade"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes2.dex */
public final class CrossfadeTransition$transition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CrossfadeTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeTransition$transition$1(CrossfadeTransition crossfadeTransition, Continuation continuation) {
        super(continuation);
        this.this$0 = crossfadeTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.transition(null, null, this);
    }
}
