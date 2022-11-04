package coil.bitmap;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import coil.memory.WeakMemoryCache;
import coil.util.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BitmapReferenceCounter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcoil/bitmap/RealBitmapReferenceCounter;", "Lcoil/bitmap/BitmapReferenceCounter;", "weakMemoryCache", "Lcoil/memory/WeakMemoryCache;", "bitmapPool", "Lcoil/bitmap/BitmapPool;", "logger", "Lcoil/util/Logger;", "(Lcoil/memory/WeakMemoryCache;Lcoil/bitmap/BitmapPool;Lcoil/util/Logger;)V", "operationsSinceCleanUp", "", "getOperationsSinceCleanUp$coil_base_release$annotations", "()V", "getOperationsSinceCleanUp$coil_base_release", "()I", "setOperationsSinceCleanUp$coil_base_release", "(I)V", "values", "Landroidx/collection/SparseArrayCompat;", "Lcoil/bitmap/RealBitmapReferenceCounter$Value;", "getValues$coil_base_release$annotations", "getValues$coil_base_release", "()Landroidx/collection/SparseArrayCompat;", "cleanUp", "", "cleanUp$coil_base_release", "cleanUpIfNecessary", "decrement", "", "bitmap", "Landroid/graphics/Bitmap;", "getValue", "key", "getValueOrNull", "increment", "setValid", "isValid", "Companion", "Value", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealBitmapReferenceCounter implements BitmapReferenceCounter {
    private static final int CLEAN_UP_INTERVAL = 50;
    public static final Companion Companion = new Companion(null);
    private static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    private static final String TAG = "RealBitmapReferenceCounter";
    private final BitmapPool bitmapPool;
    private final Logger logger;
    private int operationsSinceCleanUp;
    private final SparseArrayCompat<Value> values = new SparseArrayCompat<>();
    private final WeakMemoryCache weakMemoryCache;

    public static /* synthetic */ void getOperationsSinceCleanUp$coil_base_release$annotations() {
    }

    public static /* synthetic */ void getValues$coil_base_release$annotations() {
    }

    public RealBitmapReferenceCounter(WeakMemoryCache weakMemoryCache, BitmapPool bitmapPool, Logger logger) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.weakMemoryCache = weakMemoryCache;
        this.bitmapPool = bitmapPool;
        this.logger = logger;
    }

    public final SparseArrayCompat<Value> getValues$coil_base_release() {
        return this.values;
    }

    public final int getOperationsSinceCleanUp$coil_base_release() {
        return this.operationsSinceCleanUp;
    }

    public final void setOperationsSinceCleanUp$coil_base_release(int i) {
        this.operationsSinceCleanUp = i;
    }

    private final void cleanUpIfNecessary() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 50) {
            cleanUp$coil_base_release();
        }
    }

    public final void cleanUp$coil_base_release() {
        ArrayList arrayList = new ArrayList();
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (this.values.valueAt(i).getBitmap().get() == null) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        ArrayList arrayList2 = arrayList;
        SparseArrayCompat<Value> sparseArrayCompat = this.values;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sparseArrayCompat.removeAt(((Number) arrayList2.get(i2)).intValue());
        }
    }

    private final Value getValue(int i, Bitmap bitmap) {
        Value valueOrNull = getValueOrNull(i, bitmap);
        if (valueOrNull == null) {
            Value value = new Value(new WeakReference(bitmap), 0, false);
            this.values.put(i, value);
            return value;
        }
        return valueOrNull;
    }

    private final Value getValueOrNull(int i, Bitmap bitmap) {
        Value value = this.values.get(i);
        if (value != null) {
            if (value.getBitmap().get() == bitmap) {
                return value;
            }
        }
        return null;
    }

    /* compiled from: BitmapReferenceCounter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcoil/bitmap/RealBitmapReferenceCounter$Value;", "", "bitmap", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "count", "", "isValid", "", "(Ljava/lang/ref/WeakReference;IZ)V", "getBitmap", "()Ljava/lang/ref/WeakReference;", "getCount", "()I", "setCount", "(I)V", "()Z", "setValid", "(Z)V", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Value {
        private final WeakReference<Bitmap> bitmap;
        private int count;
        private boolean isValid;

        public Value(WeakReference<Bitmap> bitmap, int i, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.count = i;
            this.isValid = z;
        }

        public final WeakReference<Bitmap> getBitmap() {
            return this.bitmap;
        }

        public final int getCount() {
            return this.count;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final void setValid(boolean z) {
            this.isValid = z;
        }
    }

    /* compiled from: BitmapReferenceCounter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcoil/bitmap/RealBitmapReferenceCounter$Companion;", "", "()V", "CLEAN_UP_INTERVAL", "", "MAIN_HANDLER", "Landroid/os/Handler;", "TAG", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // coil.bitmap.BitmapReferenceCounter
    public synchronized void increment(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        Value value = getValue(identityHashCode, bitmap);
        value.setCount(value.getCount() + 1);
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "INCREMENT: [" + identityHashCode + ", " + value.getCount() + ", " + value.isValid() + ']', null);
        }
        cleanUpIfNecessary();
    }

    @Override // coil.bitmap.BitmapReferenceCounter
    public synchronized boolean decrement(final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        Value valueOrNull = getValueOrNull(identityHashCode, bitmap);
        boolean z = false;
        if (valueOrNull == null) {
            RealBitmapReferenceCounter realBitmapReferenceCounter = this;
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 2) {
                logger.log(TAG, 2, "DECREMENT: [" + identityHashCode + ", UNKNOWN, UNKNOWN]", null);
            }
            return false;
        }
        valueOrNull.setCount(valueOrNull.getCount() - 1);
        Logger logger2 = this.logger;
        if (logger2 != null && logger2.getLevel() <= 2) {
            logger2.log(TAG, 2, "DECREMENT: [" + identityHashCode + ", " + valueOrNull.getCount() + ", " + valueOrNull.isValid() + ']', null);
        }
        if (valueOrNull.getCount() <= 0 && valueOrNull.isValid()) {
            z = true;
        }
        if (z) {
            this.values.remove(identityHashCode);
            this.weakMemoryCache.remove(bitmap);
            MAIN_HANDLER.post(new Runnable() { // from class: coil.bitmap.RealBitmapReferenceCounter$decrement$2
                @Override // java.lang.Runnable
                public final void run() {
                    BitmapPool bitmapPool;
                    bitmapPool = RealBitmapReferenceCounter.this.bitmapPool;
                    bitmapPool.put(bitmap);
                }
            });
        }
        cleanUpIfNecessary();
        return z;
    }

    @Override // coil.bitmap.BitmapReferenceCounter
    public synchronized void setValid(Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        if (z) {
            if (getValueOrNull(identityHashCode, bitmap) == null) {
                this.values.put(identityHashCode, new Value(new WeakReference(bitmap), 0, true));
            }
        } else {
            getValue(identityHashCode, bitmap).setValid(false);
        }
        cleanUpIfNecessary();
    }
}
