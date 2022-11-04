package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import coil.target.ViewTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PoolableViewTarget.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcoil/target/PoolableViewTarget;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Lcoil/target/ViewTarget;", "onClear", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public interface PoolableViewTarget<T extends View> extends ViewTarget<T> {

    /* compiled from: PoolableViewTarget.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static <T extends View> void onError(PoolableViewTarget<T> poolableViewTarget, Drawable drawable) {
            ViewTarget.DefaultImpls.onError(poolableViewTarget, drawable);
        }

        public static <T extends View> void onStart(PoolableViewTarget<T> poolableViewTarget, Drawable drawable) {
            ViewTarget.DefaultImpls.onStart(poolableViewTarget, drawable);
        }

        public static <T extends View> void onSuccess(PoolableViewTarget<T> poolableViewTarget, Drawable result) {
            Intrinsics.checkNotNullParameter(result, "result");
            ViewTarget.DefaultImpls.onSuccess(poolableViewTarget, result);
        }
    }

    void onClear();
}
