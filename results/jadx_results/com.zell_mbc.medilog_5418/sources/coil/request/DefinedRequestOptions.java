package coil.request;

import android.graphics.Bitmap;
import androidx.compose.foundation.MagnifierStyle$$ExternalSyntheticBackport0;
import androidx.lifecycle.Lifecycle;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
/* compiled from: DefinedRequestOptions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0017J\u009b\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000205H\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u00066"}, d2 = {"Lcoil/request/DefinedRequestOptions;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "transition", "Lcoil/transition/Transition;", "precision", "Lcoil/size/Precision;", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "allowHardware", "", "allowRgb565", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "getAllowHardware", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowRgb565", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getMemoryCachePolicy", "getNetworkCachePolicy", "getPrecision", "()Lcoil/size/Precision;", "getScale", "()Lcoil/size/Scale;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getTransition", "()Lcoil/transition/Transition;", "copy", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/DefinedRequestOptions;", "equals", "other", "hashCode", "", "toString", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class DefinedRequestOptions {
    private final Boolean allowHardware;
    private final Boolean allowRgb565;
    private final Bitmap.Config bitmapConfig;
    private final CachePolicy diskCachePolicy;
    private final CoroutineDispatcher dispatcher;
    private final Lifecycle lifecycle;
    private final CachePolicy memoryCachePolicy;
    private final CachePolicy networkCachePolicy;
    private final Precision precision;
    private final Scale scale;
    private final SizeResolver sizeResolver;
    private final Transition transition;

    public DefinedRequestOptions(Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, CoroutineDispatcher coroutineDispatcher, Transition transition, Precision precision, Bitmap.Config config, Boolean bool, Boolean bool2, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.lifecycle = lifecycle;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.dispatcher = coroutineDispatcher;
        this.transition = transition;
        this.precision = precision;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    public final Scale getScale() {
        return this.scale;
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

    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final Boolean getAllowRgb565() {
        return this.allowRgb565;
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

    public final DefinedRequestOptions copy(Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, CoroutineDispatcher coroutineDispatcher, Transition transition, Precision precision, Bitmap.Config config, Boolean bool, Boolean bool2, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        return new DefinedRequestOptions(lifecycle, sizeResolver, scale, coroutineDispatcher, transition, precision, config, bool, bool2, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefinedRequestOptions) {
            DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) obj;
            if (Intrinsics.areEqual(this.lifecycle, definedRequestOptions.lifecycle) && Intrinsics.areEqual(this.sizeResolver, definedRequestOptions.sizeResolver) && this.scale == definedRequestOptions.scale && Intrinsics.areEqual(this.dispatcher, definedRequestOptions.dispatcher) && Intrinsics.areEqual(this.transition, definedRequestOptions.transition) && this.precision == definedRequestOptions.precision && this.bitmapConfig == definedRequestOptions.bitmapConfig && Intrinsics.areEqual(this.allowHardware, definedRequestOptions.allowHardware) && Intrinsics.areEqual(this.allowRgb565, definedRequestOptions.allowRgb565) && this.memoryCachePolicy == definedRequestOptions.memoryCachePolicy && this.diskCachePolicy == definedRequestOptions.diskCachePolicy && this.networkCachePolicy == definedRequestOptions.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.lifecycle;
        int i = 0;
        int hashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        SizeResolver sizeResolver = this.sizeResolver;
        int hashCode2 = (hashCode + (sizeResolver != null ? sizeResolver.hashCode() : 0)) * 31;
        Scale scale = this.scale;
        int hashCode3 = (hashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        int hashCode4 = (hashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        Transition transition = this.transition;
        int hashCode5 = (hashCode4 + (transition != null ? transition.hashCode() : 0)) * 31;
        Precision precision = this.precision;
        int hashCode6 = (hashCode5 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int hashCode7 = (hashCode6 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int m = (hashCode7 + (bool != null ? MagnifierStyle$$ExternalSyntheticBackport0.m(bool.booleanValue()) : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int m2 = (m + (bool2 != null ? MagnifierStyle$$ExternalSyntheticBackport0.m(bool2.booleanValue()) : 0)) * 31;
        CachePolicy cachePolicy = this.memoryCachePolicy;
        int hashCode8 = (m2 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.diskCachePolicy;
        int hashCode9 = (hashCode8 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.networkCachePolicy;
        if (cachePolicy3 != null) {
            i = cachePolicy3.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        return "DefinedRequestOptions(lifecycle=" + this.lifecycle + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", dispatcher=" + this.dispatcher + ", transition=" + this.transition + ", precision=" + this.precision + ", bitmapConfig=" + this.bitmapConfig + ", allowHardware=" + this.allowHardware + ", allowRgb565=" + this.allowRgb565 + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ')';
    }
}
