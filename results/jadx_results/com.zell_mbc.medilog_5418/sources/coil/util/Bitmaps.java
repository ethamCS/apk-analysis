package coil.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Bitmaps.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a\u000e\u0010\u0015\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"allocationByteCountCompat", "", "Landroid/graphics/Bitmap;", "getAllocationByteCountCompat", "(Landroid/graphics/Bitmap;)I", "bytesPerPixel", "Landroid/graphics/Bitmap$Config;", "getBytesPerPixel$annotations", "(Landroid/graphics/Bitmap$Config;)V", "getBytesPerPixel", "(Landroid/graphics/Bitmap$Config;)I", "isHardware", "", "(Landroid/graphics/Bitmap$Config;)Z", "safeConfig", "getSafeConfig", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "toDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "context", "Landroid/content/Context;", "toSoftware", "coil-base_release"}, k = 2, mv = {1, 4, 0})
/* renamed from: coil.util.-Bitmaps */
/* loaded from: classes2.dex */
public final class Bitmaps {
    public static /* synthetic */ void getBytesPerPixel$annotations(Bitmap.Config config) {
    }

    public static final int getBytesPerPixel(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    public static final int getAllocationByteCountCompat(Bitmap allocationByteCountCompat) {
        Intrinsics.checkNotNullParameter(allocationByteCountCompat, "$this$allocationByteCountCompat");
        if (!(!allocationByteCountCompat.isRecycled())) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + allocationByteCountCompat + " [" + allocationByteCountCompat.getWidth() + " x " + allocationByteCountCompat.getHeight() + "] + " + allocationByteCountCompat.getConfig()).toString());
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                allocationByteCountCompat = allocationByteCountCompat.getAllocationByteCount();
            } else {
                allocationByteCountCompat = allocationByteCountCompat.getHeight() * allocationByteCountCompat.getRowBytes();
            }
            return allocationByteCountCompat;
        } catch (Exception unused) {
            return Utils.INSTANCE.calculateAllocationByteCount(allocationByteCountCompat.getWidth(), allocationByteCountCompat.getHeight(), allocationByteCountCompat.getConfig());
        }
    }

    public static final boolean isHardware(Bitmap.Config isHardware) {
        Intrinsics.checkNotNullParameter(isHardware, "$this$isHardware");
        return Build.VERSION.SDK_INT >= 26 && isHardware == Bitmap.Config.HARDWARE;
    }

    public static final Bitmap.Config getSafeConfig(Bitmap safeConfig) {
        Intrinsics.checkNotNullParameter(safeConfig, "$this$safeConfig");
        Bitmap.Config config = safeConfig.getConfig();
        return config != null ? config : Bitmap.Config.ARGB_8888;
    }

    public static final BitmapDrawable toDrawable(Bitmap toDrawable, Context context) {
        Intrinsics.checkNotNullParameter(toDrawable, "$this$toDrawable");
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return new BitmapDrawable(resources, toDrawable);
    }

    public static final Bitmap.Config toSoftware(Bitmap.Config config) {
        return (config == null || isHardware(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
