package androidx.compose.foundation.gestures;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0}, l = {400, TypedValues.CycleType.TYPE_ALPHA}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragLogic$processDragCancel$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragCancel$1(DragLogic dragLogic, Continuation<? super DragLogic$processDragCancel$1> continuation) {
        super(continuation);
        this.this$0 = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processDragCancel(null, this);
    }
}
