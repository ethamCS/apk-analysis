package coil.size;

import android.view.ViewTreeObserver;
import androidx.exifinterface.media.ExifInterface;
import coil.size.ViewSizeResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewSizeResolver.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "it", "", "invoke", "coil/size/ViewSizeResolver$size$3$1"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$1 $preDrawListener;
    final /* synthetic */ ViewTreeObserver $viewTreeObserver;
    final /* synthetic */ ViewSizeResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$2(ViewTreeObserver viewTreeObserver, ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$1 viewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$1, ViewSizeResolver viewSizeResolver) {
        super(1);
        this.$viewTreeObserver = viewTreeObserver;
        this.$preDrawListener = viewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$1;
        this.this$0 = viewSizeResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Throwable th) {
        ViewSizeResolver viewSizeResolver = this.this$0;
        ViewTreeObserver viewTreeObserver = this.$viewTreeObserver;
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "viewTreeObserver");
        ViewSizeResolver.DefaultImpls.removePreDrawListenerSafe(viewSizeResolver, viewTreeObserver, this.$preDrawListener);
    }
}
