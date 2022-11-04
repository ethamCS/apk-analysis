package coil.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import coil.util.Bitmaps;
import coil.util.Logger;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RealBitmapPool.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J$\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J$\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcoil/bitmap/RealBitmapPool;", "Lcoil/bitmap/BitmapPool;", "maxSize", "", "allowedConfigs", "", "Landroid/graphics/Bitmap$Config;", "strategy", "Lcoil/bitmap/BitmapPoolStrategy;", "logger", "Lcoil/util/Logger;", "(ILjava/util/Set;Lcoil/bitmap/BitmapPoolStrategy;Lcoil/util/Logger;)V", "bitmaps", "Ljava/util/HashSet;", "Landroid/graphics/Bitmap;", "Lkotlin/collections/HashSet;", "currentSize", "evictions", "hits", "misses", "puts", "clear", "", "clearMemory", "get", "width", "height", "config", "getDirty", "getDirtyOrNull", "getOrNull", "logStats", "", "normalize", "bitmap", "put", "trimMemory", "level", "trimToSize", "size", "Companion", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealBitmapPool implements BitmapPool {
    private static final Set<Bitmap.Config> ALLOWED_CONFIGS;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RealBitmapPool";
    private final Set<Bitmap.Config> allowedConfigs;
    private final HashSet<Bitmap> bitmaps;
    private int currentSize;
    private int evictions;
    private int hits;
    private final Logger logger;
    private final int maxSize;
    private int misses;
    private int puts;
    private final BitmapPoolStrategy strategy;

    /* JADX WARN: Multi-variable type inference failed */
    public RealBitmapPool(int i, Set<? extends Bitmap.Config> allowedConfigs, BitmapPoolStrategy strategy, Logger logger) {
        Intrinsics.checkNotNullParameter(allowedConfigs, "allowedConfigs");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.maxSize = i;
        this.allowedConfigs = allowedConfigs;
        this.strategy = strategy;
        this.logger = logger;
        this.bitmaps = new HashSet<>();
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxSize must be >= 0.".toString());
    }

    public /* synthetic */ RealBitmapPool(int i, Set set, BitmapPoolStrategy bitmapPoolStrategy, Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? ALLOWED_CONFIGS : set, (i2 & 4) != 0 ? BitmapPoolStrategy.Companion.invoke() : bitmapPoolStrategy, (i2 & 8) != 0 ? null : logger);
    }

    @Override // coil.bitmap.BitmapPool
    public synchronized void put(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 6) {
                logger.log(TAG, 6, "Rejecting recycled bitmap from pool; bitmap: " + bitmap, null);
            }
            return;
        }
        int allocationByteCountCompat = Bitmaps.getAllocationByteCountCompat(bitmap);
        boolean z = true;
        if (bitmap.isMutable() && allocationByteCountCompat <= this.maxSize && this.allowedConfigs.contains(bitmap.getConfig())) {
            if (this.bitmaps.contains(bitmap)) {
                Logger logger2 = this.logger;
                if (logger2 != null && logger2.getLevel() <= 6) {
                    logger2.log(TAG, 6, "Rejecting duplicate bitmap from pool; bitmap: " + this.strategy.stringify(bitmap), null);
                }
                return;
            }
            this.strategy.put(bitmap);
            this.bitmaps.add(bitmap);
            this.currentSize += allocationByteCountCompat;
            this.puts++;
            Logger logger3 = this.logger;
            if (logger3 != null && logger3.getLevel() <= 2) {
                logger3.log(TAG, 2, "Put bitmap=" + this.strategy.stringify(bitmap) + '\n' + logStats(), null);
            }
            trimToSize(this.maxSize);
            return;
        }
        Logger logger4 = this.logger;
        if (logger4 != null && logger4.getLevel() <= 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Rejecting bitmap from pool; bitmap: ");
            sb.append(this.strategy.stringify(bitmap));
            sb.append(", ");
            sb.append("is mutable: ");
            sb.append(bitmap.isMutable());
            sb.append(", ");
            sb.append("is greater than max size: ");
            if (allocationByteCountCompat <= this.maxSize) {
                z = false;
            }
            sb.append(z);
            sb.append(", ");
            sb.append("is allowed config: ");
            sb.append(this.allowedConfigs.contains(bitmap.getConfig()));
            logger4.log(TAG, 2, sb.toString(), null);
        }
        bitmap.recycle();
    }

    @Override // coil.bitmap.BitmapPool
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap orNull = getOrNull(i, i2, config);
        if (orNull != null) {
            return orNull;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    @Override // coil.bitmap.BitmapPool
    public Bitmap getOrNull(int i, int i2, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        if (dirtyOrNull != null) {
            dirtyOrNull.eraseColor(0);
            return dirtyOrNull;
        }
        return null;
    }

    @Override // coil.bitmap.BitmapPool
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        if (dirtyOrNull != null) {
            return dirtyOrNull;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    @Override // coil.bitmap.BitmapPool
    public synchronized Bitmap getDirtyOrNull(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(!Bitmaps.isHardware(config))) {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        bitmap = this.strategy.get(i, i2, config);
        if (bitmap == null) {
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 2) {
                logger.log(TAG, 2, "Missing bitmap=" + this.strategy.stringify(i, i2, config), null);
            }
            this.misses++;
        } else {
            this.bitmaps.remove(bitmap);
            this.currentSize -= Bitmaps.getAllocationByteCountCompat(bitmap);
            this.hits++;
            normalize(bitmap);
        }
        Logger logger2 = this.logger;
        if (logger2 != null && logger2.getLevel() <= 2) {
            logger2.log(TAG, 2, "Get bitmap=" + this.strategy.stringify(i, i2, config) + '\n' + logStats(), null);
        }
        return bitmap;
    }

    @Override // coil.bitmap.BitmapPool
    public void clear() {
        clearMemory();
    }

    public final void clearMemory() {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "clearMemory", null);
        }
        trimToSize(-1);
    }

    @Override // coil.bitmap.BitmapPool
    public synchronized void trimMemory(int i) {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "trimMemory, level=" + i, null);
        }
        if (i >= 40) {
            clearMemory();
        } else if (10 <= i && 20 > i) {
            trimToSize(this.currentSize / 2);
        }
    }

    private final void normalize(Bitmap bitmap) {
        bitmap.setDensity(0);
        bitmap.setHasAlpha(true);
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private final synchronized void trimToSize(int i) {
        while (this.currentSize > i) {
            Bitmap removeLast = this.strategy.removeLast();
            if (removeLast == null) {
                Logger logger = this.logger;
                if (logger != null && logger.getLevel() <= 5) {
                    logger.log(TAG, 5, "Size mismatch, resetting.\n" + logStats(), null);
                }
                this.currentSize = 0;
                return;
            }
            this.bitmaps.remove(removeLast);
            this.currentSize -= Bitmaps.getAllocationByteCountCompat(removeLast);
            this.evictions++;
            Logger logger2 = this.logger;
            if (logger2 != null && logger2.getLevel() <= 2) {
                logger2.log(TAG, 2, "Evicting bitmap=" + this.strategy.stringify(removeLast) + '\n' + logStats(), null);
            }
            removeLast.recycle();
        }
    }

    private final String logStats() {
        return "Hits=" + this.hits + ", misses=" + this.misses + ", puts=" + this.puts + ", evictions=" + this.evictions + ", currentSize=" + this.currentSize + ", maxSize=" + this.maxSize + ", strategy=" + this.strategy;
    }

    /* compiled from: RealBitmapPool.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcoil/bitmap/RealBitmapPool$Companion;", "", "()V", "ALLOWED_CONFIGS", "", "Landroid/graphics/Bitmap$Config;", "getALLOWED_CONFIGS$annotations", "TAG", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private static /* synthetic */ void getALLOWED_CONFIGS$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set createSetBuilder = SetsKt.createSetBuilder();
        createSetBuilder.add(Bitmap.Config.ALPHA_8);
        createSetBuilder.add(Bitmap.Config.RGB_565);
        createSetBuilder.add(Bitmap.Config.ARGB_4444);
        createSetBuilder.add(Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            createSetBuilder.add(Bitmap.Config.RGBA_F16);
        }
        ALLOWED_CONFIGS = SetsKt.build(createSetBuilder);
    }
}
