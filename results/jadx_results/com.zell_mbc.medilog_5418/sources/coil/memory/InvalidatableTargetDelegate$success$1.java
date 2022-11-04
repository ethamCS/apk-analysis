package coil.memory;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: TargetDelegate.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@"}, d2 = {"success", "", "result", "Lcoil/request/SuccessResult;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", i = {0, 0, 0, 0, 0, 0}, l = {231}, m = "success", n = {"this", "result", "$this$onSuccess$iv", "eventListener$iv", "logger$iv", "transition$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes2.dex */
public final class InvalidatableTargetDelegate$success$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InvalidatableTargetDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidatableTargetDelegate$success$1(InvalidatableTargetDelegate invalidatableTargetDelegate, Continuation continuation) {
        super(continuation);
        this.this$0 = invalidatableTargetDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.success(null, this);
    }
}
