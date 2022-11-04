package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&JD\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", "isScrollInProgress", "", "()Z", "dispatchRawDelta", "", "delta", "scroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ScrollableState {
    float dispatchRawDelta(float f);

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    /* compiled from: ScrollableState.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: ScrollableState.kt */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableState$-CC */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    mutatePriority = MutatePriority.Default;
                }
                return scrollableState.scroll(mutatePriority, function2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
    }
}
