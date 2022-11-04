package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.StatFs;
import androidx.core.content.ContextCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: Utils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcoil/util/Utils;", "", "()V", "CACHE_DIRECTORY_NAME", "", "DEFAULT_BITMAP_CONFIG", "Landroid/graphics/Bitmap$Config;", "getDEFAULT_BITMAP_CONFIG", "()Landroid/graphics/Bitmap$Config;", "DISK_CACHE_PERCENTAGE", "", "LOW_MEMORY_MULTIPLIER", "MAX_DISK_CACHE_SIZE", "", "MIN_DISK_CACHE_SIZE", "REQUEST_TYPE_ENQUEUE", "", "REQUEST_TYPE_EXECUTE", "STANDARD_MULTIPLIER", "calculateAllocationByteCount", "width", "height", "config", "calculateAvailableMemorySize", "context", "Landroid/content/Context;", "percentage", "calculateDiskCacheSize", "cacheDirectory", "Ljava/io/File;", "getDefaultAvailableMemoryPercentage", "getDefaultBitmapPoolPercentage", "getDefaultCacheDirectory", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Utils {
    private static final String CACHE_DIRECTORY_NAME = "image_cache";
    private static final double DISK_CACHE_PERCENTAGE = 0.02d;
    public static final Utils INSTANCE = new Utils();
    private static final double LOW_MEMORY_MULTIPLIER = 0.15d;
    private static final long MAX_DISK_CACHE_SIZE = 262144000;
    private static final long MIN_DISK_CACHE_SIZE = 10485760;
    public static final int REQUEST_TYPE_ENQUEUE = 0;
    public static final int REQUEST_TYPE_EXECUTE = 1;
    private static final double STANDARD_MULTIPLIER = 0.2d;

    private Utils() {
    }

    public final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public final int calculateAllocationByteCount(int i, int i2, Bitmap.Config config) {
        return i * i2 * Bitmaps.getBytesPerPixel(config);
    }

    public final File getDefaultCacheDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getCacheDir(), CACHE_DIRECTORY_NAME);
        file.mkdirs();
        return file;
    }

    public final long calculateDiskCacheSize(File cacheDirectory) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        try {
            StatFs statFs = new StatFs(cacheDirectory.getAbsolutePath());
            return RangesKt.coerceIn((long) (DISK_CACHE_PERCENTAGE * (Build.VERSION.SDK_INT >= 18 ? statFs.getBlockCountLong() : statFs.getBlockCount()) * (Build.VERSION.SDK_INT >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize())), (long) MIN_DISK_CACHE_SIZE, (long) MAX_DISK_CACHE_SIZE);
        } catch (Exception unused) {
            return MIN_DISK_CACHE_SIZE;
        }
    }

    public final double getDefaultBitmapPoolPercentage() {
        if (Build.VERSION.SDK_INT >= 24) {
            return 0.0d;
        }
        return Build.VERSION.SDK_INT >= 19 ? 0.5d : 0.25d;
    }

    public final long calculateAvailableMemorySize(Context context, double d) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
        if (systemService != null) {
            ActivityManager activityManager = (ActivityManager) systemService;
            double largeMemoryClass = d * ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass());
            double d2 = 1024;
            return (long) (largeMemoryClass * d2 * d2);
        }
        throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
    }

    public final double getDefaultAvailableMemoryPercentage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
        if (systemService != null) {
            return Build.VERSION.SDK_INT < 19 || ((ActivityManager) systemService).isLowRamDevice() ? LOW_MEMORY_MULTIPLIER : STANDARD_MULTIPLIER;
        }
        throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
    }
}
