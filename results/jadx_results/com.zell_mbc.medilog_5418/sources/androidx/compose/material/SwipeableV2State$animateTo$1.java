package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: SwipeableV2.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableV2State", f = "SwipeableV2.kt", i = {0}, l = {250}, m = "animateTo", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SwipeableV2State$animateTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$animateTo$1(SwipeableV2State<T> swipeableV2State, Continuation<? super SwipeableV2State$animateTo$1> continuation) {
        super(continuation);
        this.this$0 = swipeableV2State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateTo(null, 0.0f, this);
    }
}
