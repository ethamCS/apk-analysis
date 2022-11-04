package coil.size;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.exifinterface.media.ExifInterface;
import coil.size.ViewSizeResolver;
import com.android.tools.r8.annotations.SynthesizedClass;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
/* compiled from: ViewSizeResolver.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u001e*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u001eJ0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0011\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcoil/size/ViewSizeResolver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Lcoil/size/SizeResolver;", "subtractPadding", "", "getSubtractPadding", "()Z", "view", "getView", "()Landroid/view/View;", "getDimension", "", "paramSize", "viewSize", "paddingSize", "isLayoutRequested", "isWidth", "getHeight", "getSize", "Lcoil/size/PixelSize;", "getWidth", "size", "Lcoil/size/Size;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePreDrawListenerSafe", "", "Landroid/view/ViewTreeObserver;", "victim", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Companion", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public interface ViewSizeResolver<T extends View> extends SizeResolver {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ViewSizeResolver.kt */
    @SynthesizedClass(kind = "$-CC")
    /* renamed from: coil.size.ViewSizeResolver$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T extends View> {
        static {
            Companion companion = ViewSizeResolver.Companion;
        }

        @JvmStatic
        public static <T extends View> ViewSizeResolver<T> create(T t, boolean z) {
            return ViewSizeResolver.Companion.create(t, z);
        }
    }

    boolean getSubtractPadding();

    T getView();

    @Override // coil.size.SizeResolver
    Object size(Continuation<? super Size> continuation);

    /* compiled from: ViewSizeResolver.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcoil/size/ViewSizeResolver$Companion;", "", "()V", "invoke", "Lcoil/size/ViewSizeResolver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "view", "subtractPadding", "", "create", "(Landroid/view/View;Z)Lcoil/size/ViewSizeResolver;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ViewSizeResolver create$default(Companion companion, View view, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return companion.create(view, z);
        }

        @JvmStatic
        public final <T extends View> ViewSizeResolver<T> create(T view, boolean z) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new RealViewSizeResolver(view, z);
        }
    }

    /* compiled from: ViewSizeResolver.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static <T extends View> boolean getSubtractPadding(ViewSizeResolver<T> viewSizeResolver) {
            return true;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [coil.size.ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$1] */
        public static <T extends View> Object size(final ViewSizeResolver<T> viewSizeResolver, Continuation<? super Size> continuation) {
            PixelSize size = getSize(viewSizeResolver, viewSizeResolver.getView().isLayoutRequested());
            if (size != null) {
                return size;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            ?? r3 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    PixelSize size2;
                    size2 = ViewSizeResolver.DefaultImpls.getSize(viewSizeResolver, false);
                    if (size2 != null) {
                        ViewSizeResolver viewSizeResolver2 = viewSizeResolver;
                        ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                        Intrinsics.checkNotNullExpressionValue(viewTreeObserver2, "viewTreeObserver");
                        ViewSizeResolver.DefaultImpls.removePreDrawListenerSafe(viewSizeResolver2, viewTreeObserver2, this);
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl2.resumeWith(Result.m4749constructorimpl(size2));
                        return true;
                    }
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) r3);
            cancellableContinuationImpl2.invokeOnCancellation(new ViewSizeResolver$size$$inlined$suspendCancellableCoroutine$lambda$2(viewTreeObserver, r3, viewSizeResolver));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        public static <T extends View> PixelSize getSize(ViewSizeResolver<T> viewSizeResolver, boolean z) {
            int height;
            int width = getWidth(viewSizeResolver, z);
            if (width > 0 && (height = getHeight(viewSizeResolver, z)) > 0) {
                return new PixelSize(width, height);
            }
            return null;
        }

        private static <T extends View> int getWidth(ViewSizeResolver<T> viewSizeResolver, boolean z) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return getDimension(viewSizeResolver, layoutParams != null ? layoutParams.width : -1, viewSizeResolver.getView().getWidth(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight() : 0, z, true);
        }

        private static <T extends View> int getHeight(ViewSizeResolver<T> viewSizeResolver, boolean z) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return getDimension(viewSizeResolver, layoutParams != null ? layoutParams.height : -1, viewSizeResolver.getView().getHeight(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom() : 0, z, false);
        }

        private static <T extends View> int getDimension(ViewSizeResolver<T> viewSizeResolver, int i, int i2, int i3, boolean z, boolean z2) {
            int i4 = i - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return i5;
            }
            if (z || i != -2) {
                return -1;
            }
            Context context = viewSizeResolver.getView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "view.context.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return z2 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        public static <T extends View> void removePreDrawListenerSafe(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }
    }
}
