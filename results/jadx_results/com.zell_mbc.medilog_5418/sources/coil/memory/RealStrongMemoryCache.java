package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.bitmap.BitmapReferenceCounter;
import coil.memory.MemoryCache;
import coil.memory.RealMemoryCache;
import coil.memory.RealStrongMemoryCache;
import coil.util.Bitmaps;
import coil.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StrongMemoryCache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\f\b\u0002\u0018\u0000  2\u00020\u0001:\u0002 !B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0007H\u0016R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "weakMemoryCache", "Lcoil/memory/WeakMemoryCache;", "referenceCounter", "Lcoil/bitmap/BitmapReferenceCounter;", "maxSize", "", "logger", "Lcoil/util/Logger;", "(Lcoil/memory/WeakMemoryCache;Lcoil/bitmap/BitmapReferenceCounter;ILcoil/util/Logger;)V", "cache", "coil/memory/RealStrongMemoryCache$cache$1", "Lcoil/memory/RealStrongMemoryCache$cache$1;", "getMaxSize", "()I", "size", "getSize", "clearMemory", "", "get", "Lcoil/memory/RealStrongMemoryCache$InternalValue;", "key", "Lcoil/memory/MemoryCache$Key;", "remove", "", "set", "bitmap", "Landroid/graphics/Bitmap;", "isSampled", "trimMemory", "level", "Companion", "InternalValue", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealStrongMemoryCache implements StrongMemoryCache {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RealStrongMemoryCache";
    private final RealStrongMemoryCache$cache$1 cache;
    private final Logger logger;
    private final BitmapReferenceCounter referenceCounter;
    private final WeakMemoryCache weakMemoryCache;

    /* JADX WARN: Type inference failed for: r2v1, types: [coil.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(WeakMemoryCache weakMemoryCache, BitmapReferenceCounter referenceCounter, final int i, Logger logger) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.weakMemoryCache = weakMemoryCache;
        this.referenceCounter = referenceCounter;
        this.logger = logger;
        this.cache = new LruCache<MemoryCache.Key, InternalValue>(i) { // from class: coil.memory.RealStrongMemoryCache$cache$1
            /* JADX INFO: Access modifiers changed from: protected */
            public void entryRemoved(boolean z, MemoryCache.Key key, RealStrongMemoryCache.InternalValue oldValue, RealStrongMemoryCache.InternalValue internalValue) {
                BitmapReferenceCounter bitmapReferenceCounter;
                WeakMemoryCache weakMemoryCache2;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(oldValue, "oldValue");
                bitmapReferenceCounter = RealStrongMemoryCache.this.referenceCounter;
                if (!bitmapReferenceCounter.decrement(oldValue.getBitmap())) {
                    weakMemoryCache2 = RealStrongMemoryCache.this.weakMemoryCache;
                    weakMemoryCache2.set(key, oldValue.getBitmap(), oldValue.isSampled(), oldValue.getSize());
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public int sizeOf(MemoryCache.Key key, RealStrongMemoryCache.InternalValue value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                return value.getSize();
            }
        };
    }

    @Override // coil.memory.StrongMemoryCache
    public int getSize() {
        return size();
    }

    @Override // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return maxSize();
    }

    @Override // coil.memory.StrongMemoryCache
    public synchronized InternalValue get(MemoryCache.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(key);
    }

    @Override // coil.memory.StrongMemoryCache
    public synchronized void set(MemoryCache.Key key, Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int allocationByteCountCompat = Bitmaps.getAllocationByteCountCompat(bitmap);
        if (allocationByteCountCompat > getMaxSize()) {
            if (remove(key) == null) {
                this.weakMemoryCache.set(key, bitmap, z, allocationByteCountCompat);
            }
            return;
        }
        this.referenceCounter.increment(bitmap);
        put(key, new InternalValue(bitmap, z, allocationByteCountCompat));
    }

    @Override // coil.memory.StrongMemoryCache
    public synchronized boolean remove(MemoryCache.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return remove(key) != null;
    }

    @Override // coil.memory.StrongMemoryCache
    public synchronized void clearMemory() {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "clearMemory", null);
        }
        trimToSize(-1);
    }

    @Override // coil.memory.StrongMemoryCache
    public synchronized void trimMemory(int i) {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "trimMemory, level=" + i, null);
        }
        if (i >= 40) {
            clearMemory();
        } else if (10 <= i && 20 > i) {
            trimToSize(getSize() / 2);
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcoil/memory/RealStrongMemoryCache$InternalValue;", "Lcoil/memory/RealMemoryCache$Value;", "bitmap", "Landroid/graphics/Bitmap;", "isSampled", "", "size", "", "(Landroid/graphics/Bitmap;ZI)V", "getBitmap", "()Landroid/graphics/Bitmap;", "()Z", "getSize", "()I", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class InternalValue implements RealMemoryCache.Value {
        private final Bitmap bitmap;
        private final boolean isSampled;
        private final int size;

        public InternalValue(Bitmap bitmap, boolean z, int i) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.isSampled = z;
            this.size = i;
        }

        @Override // coil.memory.RealMemoryCache.Value
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        @Override // coil.memory.RealMemoryCache.Value
        public boolean isSampled() {
            return this.isSampled;
        }

        public final int getSize() {
            return this.size;
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcoil/memory/RealStrongMemoryCache$Companion;", "", "()V", "TAG", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
