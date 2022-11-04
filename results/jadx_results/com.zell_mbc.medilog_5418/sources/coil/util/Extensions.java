package coil.util;

import android.app.ActivityManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.StatFs;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.base.R;
import coil.bitmap.BitmapReferenceCounter;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.memory.TargetDelegate;
import coil.memory.ViewTargetRequestManager;
import coil.request.ImageResult;
import coil.request.Parameters;
import coil.size.Scale;
import coil.size.Size;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transform.Transformation;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Request;
/* compiled from: Extensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010F\u001a\u00020\"H\u0000\u001a\u0016\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0JH\u0000\u001a\f\u0010K\u001a\u00020L*\u00020MH\u0000\u001a\u0017\u0010N\u001a\u00020L*\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0080\b\u001a\u0017\u0010N\u001a\u00020L*\u00020O2\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0080\b\u001a\u0018\u0010S\u001a\u0004\u0018\u00010\u0010*\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u001d\u0010V\u001a\u00020W*\u00020X2\u0006\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020[H\u0080\n\u001a3\u0010V\u001a\u00020W*\u00020X2\u0006\u0010Y\u001a\u00020\u00102\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010_\u001a\u00020`2\u0006\u0010Z\u001a\u00020[H\u0080\n\u001a$\u0010a\u001a\u00020L*\u00020b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020L0dH\u0080\bø\u0001\u0000\u001a\u000e\u0010e\u001a\u00020[*\u0004\u0018\u00010[H\u0000\u001a\u0016\u0010e\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u0004\u0018\u00010\u0001H\u0000\u001a\u001f\u0010f\u001a\u00020L*\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010g\u001a\u00020\"H\u0080\b\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078À\u0002X\u0080\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0006*\u00020\u00078À\u0002X\u0080\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0010*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u0019*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0019\u0010!\u001a\u00020\"*\u00020#8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010$\"\u0019\u0010%\u001a\u00020\"*\u00020&8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010'\"\u0018\u0010(\u001a\u00020\"*\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0019\u0010*\u001a\u00020+*\u00020,8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\",\u00101\u001a\u0004\u0018\u000100*\u0002022\b\u0010/\u001a\u0004\u0018\u0001008@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106\"\u0018\u00107\u001a\u00020\u0019*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0018\u0010;\u001a\u00020<*\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0018\u0010?\u001a\u00020@*\u00020A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0018\u0010D\u001a\u00020\u0019*\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006h"}, d2 = {"EMPTY_HEADERS", "Lokhttp3/Headers;", "kotlin.jvm.PlatformType", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "blockCountCompat", "", "Landroid/os/StatFs;", "getBlockCountCompat$annotations", "(Landroid/os/StatFs;)V", "getBlockCountCompat", "(Landroid/os/StatFs;)J", "blockSizeCompat", "getBlockSizeCompat$annotations", "getBlockSizeCompat", "emoji", "", "Lcoil/decode/DataSource;", "getEmoji", "(Lcoil/decode/DataSource;)Ljava/lang/String;", "firstPathSegment", "Landroid/net/Uri;", "getFirstPathSegment", "(Landroid/net/Uri;)Ljava/lang/String;", "height", "", "Landroid/graphics/drawable/Drawable;", "getHeight", "(Landroid/graphics/drawable/Drawable;)I", "identityHashCode", "", "getIdentityHashCode", "(Ljava/lang/Object;)I", "isAttachedToWindowCompat", "", "Landroid/view/View;", "(Landroid/view/View;)Z", "isLowRamDeviceCompat", "Landroid/app/ActivityManager;", "(Landroid/app/ActivityManager;)Z", "isVector", "(Landroid/graphics/drawable/Drawable;)Z", "job", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "value", "Lcoil/request/ImageResult$Metadata;", "metadata", "Lcoil/memory/TargetDelegate;", "getMetadata", "(Lcoil/memory/TargetDelegate;)Lcoil/request/ImageResult$Metadata;", "setMetadata", "(Lcoil/memory/TargetDelegate;Lcoil/request/ImageResult$Metadata;)V", "nightMode", "Landroid/content/res/Configuration;", "getNightMode", "(Landroid/content/res/Configuration;)I", "requestManager", "Lcoil/memory/ViewTargetRequestManager;", "getRequestManager", "(Landroid/view/View;)Lcoil/memory/ViewTargetRequestManager;", "scale", "Lcoil/size/Scale;", "Landroid/widget/ImageView;", "getScale", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", "width", "getWidth", "isMainThread", "lazyCallFactory", "Lokhttp3/Call$Factory;", "initializer", "Lkotlin/Function0;", "closeQuietly", "", "Ljava/io/Closeable;", "decrement", "Lcoil/bitmap/BitmapReferenceCounter;", "bitmap", "Landroid/graphics/Bitmap;", "drawable", "getMimeTypeFromUrl", "Landroid/webkit/MimeTypeMap;", "url", "invoke", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/MemoryCache$Key$Companion;", "base", "parameters", "Lcoil/request/Parameters;", "transformations", "", "Lcoil/transform/Transformation;", "size", "Lcoil/size/Size;", "loop", "Ljava/util/concurrent/atomic/AtomicInteger;", "action", "Lkotlin/Function1;", "orEmpty", "setValid", "isValid", "coil-base_release"}, k = 2, mv = {1, 4, 0})
/* renamed from: coil.util.-Extensions */
/* loaded from: classes2.dex */
public final class Extensions {
    private static final Headers EMPTY_HEADERS = new Headers.Builder().build();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* renamed from: coil.util.-Extensions$WhenMappings */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DataSource.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        }
    }

    public static /* synthetic */ void getBlockCountCompat$annotations(StatFs statFs) {
    }

    public static /* synthetic */ void getBlockSizeCompat$annotations(StatFs statFs) {
    }

    public static final boolean isLowRamDeviceCompat(ActivityManager isLowRamDeviceCompat) {
        Intrinsics.checkNotNullParameter(isLowRamDeviceCompat, "$this$isLowRamDeviceCompat");
        return Build.VERSION.SDK_INT < 19 || isLowRamDeviceCompat.isLowRamDevice();
    }

    public static final long getBlockCountCompat(StatFs blockCountCompat) {
        Intrinsics.checkNotNullParameter(blockCountCompat, "$this$blockCountCompat");
        return Build.VERSION.SDK_INT >= 18 ? blockCountCompat.getBlockCountLong() : blockCountCompat.getBlockCount();
    }

    public static final long getBlockSizeCompat(StatFs blockSizeCompat) {
        Intrinsics.checkNotNullParameter(blockSizeCompat, "$this$blockSizeCompat");
        return Build.VERSION.SDK_INT >= 18 ? blockSizeCompat.getBlockSizeLong() : blockSizeCompat.getBlockSize();
    }

    public static final ViewTargetRequestManager getRequestManager(View requestManager) {
        Intrinsics.checkNotNullParameter(requestManager, "$this$requestManager");
        Object tag = requestManager.getTag(R.id.coil_request_manager);
        Object obj = null;
        if (!(tag instanceof ViewTargetRequestManager)) {
            tag = null;
        }
        ViewTargetRequestManager viewTargetRequestManager = (ViewTargetRequestManager) tag;
        if (viewTargetRequestManager == null) {
            synchronized (requestManager) {
                Object tag2 = requestManager.getTag(R.id.coil_request_manager);
                if (tag2 instanceof ViewTargetRequestManager) {
                    obj = tag2;
                }
                ViewTargetRequestManager viewTargetRequestManager2 = (ViewTargetRequestManager) obj;
                if (viewTargetRequestManager2 != null) {
                    viewTargetRequestManager = viewTargetRequestManager2;
                } else {
                    viewTargetRequestManager = new ViewTargetRequestManager();
                    requestManager.addOnAttachStateChangeListener(viewTargetRequestManager);
                    requestManager.setTag(R.id.coil_request_manager, viewTargetRequestManager);
                }
            }
        }
        return viewTargetRequestManager;
    }

    public static final boolean isAttachedToWindowCompat(View isAttachedToWindowCompat) {
        Intrinsics.checkNotNullParameter(isAttachedToWindowCompat, "$this$isAttachedToWindowCompat");
        return ViewCompat.isAttachedToWindow(isAttachedToWindowCompat);
    }

    public static final String getEmoji(DataSource emoji) {
        Intrinsics.checkNotNullParameter(emoji, "$this$emoji");
        int i = WhenMappings.$EnumSwitchMapping$0[emoji.ordinal()];
        if (i == 1 || i == 2) {
            return Emoji.BRAIN;
        }
        if (i == 3) {
            return Emoji.FLOPPY;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Emoji.CLOUD;
    }

    public static final int getWidth(Drawable width) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(width, "$this$width");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) (!(width instanceof BitmapDrawable) ? null : width);
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? width.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int getHeight(Drawable height) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(height, "$this$height");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) (!(height instanceof BitmapDrawable) ? null : height);
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? height.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final boolean isVector(Drawable isVector) {
        Intrinsics.checkNotNullParameter(isVector, "$this$isVector");
        return (isVector instanceof VectorDrawableCompat) || (Build.VERSION.SDK_INT > 21 && (isVector instanceof VectorDrawable));
    }

    public static final void closeQuietly(Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final Scale getScale(ImageView scale) {
        int i;
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        ImageView.ScaleType scaleType = scale.getScaleType();
        if (scaleType != null && ((i = WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()]) == 1 || i == 2 || i == 3 || i == 4)) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    public static final Call.Factory lazyCallFactory(Function0<? extends Call.Factory> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        final Lazy lazy = LazyKt.lazy(initializer);
        return new Call.Factory() { // from class: coil.util.-Extensions$lazyCallFactory$1
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                return ((Call.Factory) Lazy.this.getValue()).newCall(request);
            }
        };
    }

    public static final String getMimeTypeFromUrl(MimeTypeMap getMimeTypeFromUrl, String str) {
        Intrinsics.checkNotNullParameter(getMimeTypeFromUrl, "$this$getMimeTypeFromUrl");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return getMimeTypeFromUrl.getMimeTypeFromExtension(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final String getFirstPathSegment(Uri firstPathSegment) {
        Intrinsics.checkNotNullParameter(firstPathSegment, "$this$firstPathSegment");
        List<String> pathSegments = firstPathSegment.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        return (String) CollectionsKt.firstOrNull((List<? extends Object>) pathSegments);
    }

    public static final int getNightMode(Configuration nightMode) {
        Intrinsics.checkNotNullParameter(nightMode, "$this$nightMode");
        return nightMode.uiMode & 48;
    }

    public static final Headers getEMPTY_HEADERS() {
        return EMPTY_HEADERS;
    }

    public static final Headers orEmpty(Headers headers) {
        return headers != null ? headers : EMPTY_HEADERS;
    }

    public static final Parameters orEmpty(Parameters parameters) {
        return parameters != null ? parameters : Parameters.EMPTY;
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final int getIdentityHashCode(Object identityHashCode) {
        Intrinsics.checkNotNullParameter(identityHashCode, "$this$identityHashCode");
        return System.identityHashCode(identityHashCode);
    }

    public static final void loop(AtomicInteger loop, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(loop, "$this$loop");
        Intrinsics.checkNotNullParameter(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(loop.get()));
        }
    }

    public static final Job getJob(CoroutineContext job) {
        Intrinsics.checkNotNullParameter(job, "$this$job");
        CoroutineContext.Element element = job.get(Job.Key);
        Intrinsics.checkNotNull(element);
        return (Job) element;
    }

    public static final ImageResult.Metadata getMetadata(TargetDelegate metadata) {
        View view;
        ViewTargetRequestManager requestManager;
        Intrinsics.checkNotNullParameter(metadata, "$this$metadata");
        Target target = metadata.getTarget();
        if (!(target instanceof ViewTarget)) {
            target = null;
        }
        ViewTarget viewTarget = (ViewTarget) target;
        if (viewTarget == null || (view = viewTarget.getView()) == null || (requestManager = getRequestManager(view)) == null) {
            return null;
        }
        return requestManager.getMetadata();
    }

    public static final void setMetadata(TargetDelegate metadata, ImageResult.Metadata metadata2) {
        View view;
        ViewTargetRequestManager requestManager;
        Intrinsics.checkNotNullParameter(metadata, "$this$metadata");
        Target target = metadata.getTarget();
        if (!(target instanceof ViewTarget)) {
            target = null;
        }
        ViewTarget viewTarget = (ViewTarget) target;
        if (viewTarget == null || (view = viewTarget.getView()) == null || (requestManager = getRequestManager(view)) == null) {
            return;
        }
        requestManager.setMetadata(metadata2);
    }

    public static final MemoryCache.Key invoke(MemoryCache.Key.Companion invoke, String base, Parameters parameters) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new MemoryCache.Key.Complex(base, CollectionsKt.emptyList(), null, parameters.cacheKeys());
    }

    public static final void decrement(BitmapReferenceCounter decrement, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(decrement, "$this$decrement");
        if (bitmap != null) {
            decrement.decrement(bitmap);
        }
    }

    public static final void decrement(BitmapReferenceCounter decrement, Drawable drawable) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(decrement, "$this$decrement");
        if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
            return;
        }
        decrement.decrement(bitmap);
    }

    public static final void setValid(BitmapReferenceCounter setValid, Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(setValid, "$this$setValid");
        if (bitmap != null) {
            setValid.setValid(bitmap, z);
        }
    }

    public static final MemoryCache.Key invoke(MemoryCache.Key.Companion invoke, String base, List<? extends Transformation> transformations, Size size, Parameters parameters) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        ArrayList arrayList = new ArrayList(transformations.size());
        int size2 = transformations.size();
        for (int i = 0; i < size2; i++) {
            arrayList.add(transformations.get(i).key());
        }
        return new MemoryCache.Key.Complex(base, arrayList, size, parameters.cacheKeys());
    }
}
