package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
/* compiled from: LazyStaggeredGridDsl.kt */
@LazyStaggeredGridScopeMarker
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH'¢\u0006\u0002\u0010\u000bJ\u0096\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000721\u0010\u0012\u001a-\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0002\u0010\u0014\u0082\u0001\u0001\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "item", "", "key", "contentType", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl;", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    @ExperimentalFoundationApi
    void item(Object obj, Object obj2, Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> function3);

    void items(int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function4<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4);

    /* compiled from: LazyStaggeredGridDsl.kt */
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$-CC */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, Function3 function3, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                lazyStaggeredGridScope.item(obj, obj2, function3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i, Function1 function1, Function1 function12, Function4 function4, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    function1 = null;
                }
                if ((i2 & 4) != 0) {
                    function12 = LazyStaggeredGridScope$items$1.INSTANCE;
                }
                lazyStaggeredGridScope.items(i, function1, function12, function4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
    }
}
