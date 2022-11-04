package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.MagnifierStyle$$ExternalSyntheticBackport0;
import coil.size.Precision;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
/* compiled from: DefaultRequestOptions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0002\u0010\u0015J\u0084\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020/H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcoil/request/DefaultRequestOptions;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "transition", "Lcoil/transition/Transition;", "precision", "Lcoil/size/Precision;", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "allowHardware", "", "allowRgb565", "placeholder", "Landroid/graphics/drawable/Drawable;", "error", "fallback", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "getAllowHardware", "()Z", "getAllowRgb565", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getError", "()Landroid/graphics/drawable/Drawable;", "getFallback", "getMemoryCachePolicy", "getNetworkCachePolicy", "getPlaceholder", "getPrecision", "()Lcoil/size/Precision;", "getTransition", "()Lcoil/transition/Transition;", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class DefaultRequestOptions {
    public static final Companion Companion = new Companion(null);
    public static final DefaultRequestOptions INSTANCE = new DefaultRequestOptions(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    private final boolean allowHardware;
    private final boolean allowRgb565;
    private final Bitmap.Config bitmapConfig;
    private final CachePolicy diskCachePolicy;
    private final CoroutineDispatcher dispatcher;
    private final Drawable error;
    private final Drawable fallback;
    private final CachePolicy memoryCachePolicy;
    private final CachePolicy networkCachePolicy;
    private final Drawable placeholder;
    private final Precision precision;
    private final Transition transition;

    public DefaultRequestOptions() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public DefaultRequestOptions(CoroutineDispatcher dispatcher, Transition transition, Precision precision, Bitmap.Config bitmapConfig, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy memoryCachePolicy, CachePolicy diskCachePolicy, CachePolicy networkCachePolicy) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(memoryCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(diskCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        this.dispatcher = dispatcher;
        this.transition = transition;
        this.precision = precision;
        this.bitmapConfig = bitmapConfig;
        this.allowHardware = z;
        this.allowRgb565 = z2;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = memoryCachePolicy;
        this.diskCachePolicy = diskCachePolicy;
        this.networkCachePolicy = networkCachePolicy;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DefaultRequestOptions(kotlinx.coroutines.CoroutineDispatcher r13, coil.transition.Transition r14, coil.size.Precision r15, android.graphics.Bitmap.Config r16, boolean r17, boolean r18, android.graphics.drawable.Drawable r19, android.graphics.drawable.Drawable r20, android.graphics.drawable.Drawable r21, coil.request.CachePolicy r22, coil.request.CachePolicy r23, coil.request.CachePolicy r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 1
            if (r1 == 0) goto Lb
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            goto Lc
        Lb:
            r1 = r13
        Lc:
            r2 = r0 & 2
            if (r2 == 0) goto L13
            coil.transition.Transition r2 = coil.transition.Transition.NONE
            goto L14
        L13:
            r2 = r14
        L14:
            r3 = r0 & 4
            if (r3 == 0) goto L1b
            coil.size.Precision r3 = coil.size.Precision.AUTOMATIC
            goto L1c
        L1b:
            r3 = r15
        L1c:
            r4 = r0 & 8
            if (r4 == 0) goto L27
            coil.util.Utils r4 = coil.util.Utils.INSTANCE
            android.graphics.Bitmap$Config r4 = r4.getDEFAULT_BITMAP_CONFIG()
            goto L29
        L27:
            r4 = r16
        L29:
            r5 = r0 & 16
            if (r5 == 0) goto L2f
            r5 = 1
            goto L31
        L2f:
            r5 = r17
        L31:
            r6 = r0 & 32
            if (r6 == 0) goto L37
            r6 = 0
            goto L39
        L37:
            r6 = r18
        L39:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L43
            r7 = r8
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r7 = r8
            goto L45
        L43:
            r7 = r19
        L45:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L4e
            r9 = r8
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r9 = r8
            goto L50
        L4e:
            r9 = r20
        L50:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L58
            r10 = r8
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            goto L5a
        L58:
            r8 = r21
        L5a:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L61
            coil.request.CachePolicy r10 = coil.request.CachePolicy.ENABLED
            goto L63
        L61:
            r10 = r22
        L63:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L6a
            coil.request.CachePolicy r11 = coil.request.CachePolicy.ENABLED
            goto L6c
        L6a:
            r11 = r23
        L6c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L73
            coil.request.CachePolicy r0 = coil.request.CachePolicy.ENABLED
            goto L75
        L73:
            r0 = r24
        L75:
            r13 = r12
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r9
            r22 = r8
            r23 = r10
            r24 = r11
            r25 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.DefaultRequestOptions.<init>(kotlinx.coroutines.CoroutineDispatcher, coil.transition.Transition, coil.size.Precision, android.graphics.Bitmap$Config, boolean, boolean, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, coil.request.CachePolicy, coil.request.CachePolicy, coil.request.CachePolicy, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final Transition getTransition() {
        return this.transition;
    }

    public final Precision getPrecision() {
        return this.precision;
    }

    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    public final Drawable getError() {
        return this.error;
    }

    public final Drawable getFallback() {
        return this.fallback;
    }

    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final DefaultRequestOptions copy(CoroutineDispatcher dispatcher, Transition transition, Precision precision, Bitmap.Config bitmapConfig, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy memoryCachePolicy, CachePolicy diskCachePolicy, CachePolicy networkCachePolicy) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(memoryCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(diskCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        return new DefaultRequestOptions(dispatcher, transition, precision, bitmapConfig, z, z2, drawable, drawable2, drawable3, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRequestOptions) {
            DefaultRequestOptions defaultRequestOptions = (DefaultRequestOptions) obj;
            if (Intrinsics.areEqual(this.dispatcher, defaultRequestOptions.dispatcher) && Intrinsics.areEqual(this.transition, defaultRequestOptions.transition) && this.precision == defaultRequestOptions.precision && this.bitmapConfig == defaultRequestOptions.bitmapConfig && this.allowHardware == defaultRequestOptions.allowHardware && this.allowRgb565 == defaultRequestOptions.allowRgb565 && Intrinsics.areEqual(this.placeholder, defaultRequestOptions.placeholder) && Intrinsics.areEqual(this.error, defaultRequestOptions.error) && Intrinsics.areEqual(this.fallback, defaultRequestOptions.fallback) && this.memoryCachePolicy == defaultRequestOptions.memoryCachePolicy && this.diskCachePolicy == defaultRequestOptions.diskCachePolicy && this.networkCachePolicy == defaultRequestOptions.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.dispatcher.hashCode() * 31) + this.transition.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.bitmapConfig.hashCode()) * 31) + MagnifierStyle$$ExternalSyntheticBackport0.m(this.allowHardware)) * 31) + MagnifierStyle$$ExternalSyntheticBackport0.m(this.allowRgb565)) * 31;
        Drawable drawable = this.placeholder;
        int i = 0;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.error;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallback;
        if (drawable3 != null) {
            i = drawable3.hashCode();
        }
        return ((((((hashCode3 + i) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    public String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.dispatcher + ", transition=" + this.transition + ", precision=" + this.precision + ", bitmapConfig=" + this.bitmapConfig + ", allowHardware=" + this.allowHardware + ", allowRgb565=" + this.allowRgb565 + ", placeholder=" + this.placeholder + ", error=" + this.error + ", fallback=" + this.fallback + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ')';
    }

    /* compiled from: DefaultRequestOptions.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcoil/request/DefaultRequestOptions$Companion;", "", "()V", "INSTANCE", "Lcoil/request/DefaultRequestOptions;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
