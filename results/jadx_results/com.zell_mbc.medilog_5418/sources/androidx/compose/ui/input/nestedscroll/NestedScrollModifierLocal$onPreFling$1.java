package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: NestedScrollModifierLocal.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", i = {0, 0, 1}, l = {88, 89}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
/* loaded from: classes.dex */
public final class NestedScrollModifierLocal$onPreFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollModifierLocal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, Continuation<? super NestedScrollModifierLocal$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo339onPreFlingQWom1Mo(0L, this);
    }
}
