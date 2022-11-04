package coil.memory;

import android.graphics.Bitmap;
import android.os.Build;
import coil.memory.MemoryCache;
import coil.memory.RealMemoryCache;
import coil.util.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WeakMemoryCache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0003()*B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J(\u0010#\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0011H\u0016RX\u0010\u0005\u001a>\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0006j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n`\u000b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "logger", "Lcoil/util/Logger;", "(Lcoil/util/Logger;)V", "cache", "Ljava/util/HashMap;", "Lcoil/memory/MemoryCache$Key;", "Ljava/util/ArrayList;", "Lcoil/memory/RealWeakMemoryCache$WeakValue;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "getCache$coil_base_release$annotations", "()V", "getCache$coil_base_release", "()Ljava/util/HashMap;", "operationsSinceCleanUp", "", "getOperationsSinceCleanUp$coil_base_release$annotations", "getOperationsSinceCleanUp$coil_base_release", "()I", "setOperationsSinceCleanUp$coil_base_release", "(I)V", "cleanUp", "", "cleanUp$coil_base_release", "cleanUpIfNecessary", "clearMemory", "get", "Lcoil/memory/RealMemoryCache$Value;", "key", "remove", "", "bitmap", "Landroid/graphics/Bitmap;", "set", "isSampled", "size", "trimMemory", "level", "Companion", "StrongValue", "WeakValue", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealWeakMemoryCache implements WeakMemoryCache {
    private static final int CLEAN_UP_INTERVAL = 10;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RealWeakMemoryCache";
    private final HashMap<MemoryCache.Key, ArrayList<WeakValue>> cache = new HashMap<>();
    private final Logger logger;
    private int operationsSinceCleanUp;

    public static /* synthetic */ void getCache$coil_base_release$annotations() {
    }

    public static /* synthetic */ void getOperationsSinceCleanUp$coil_base_release$annotations() {
    }

    public RealWeakMemoryCache(Logger logger) {
        this.logger = logger;
    }

    public final HashMap<MemoryCache.Key, ArrayList<WeakValue>> getCache$coil_base_release() {
        return this.cache;
    }

    public final int getOperationsSinceCleanUp$coil_base_release() {
        return this.operationsSinceCleanUp;
    }

    public final void setOperationsSinceCleanUp$coil_base_release(int i) {
        this.operationsSinceCleanUp = i;
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized RealMemoryCache.Value get(MemoryCache.Key key) {
        StrongValue strongValue;
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<WeakValue> arrayList = this.cache.get(key);
        StrongValue strongValue2 = null;
        if (arrayList != null) {
            Intrinsics.checkNotNullExpressionValue(arrayList, "cache[key] ?: return null");
            ArrayList<WeakValue> arrayList2 = arrayList;
            int i = 0;
            int size = arrayList2.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                WeakValue weakValue = arrayList2.get(i);
                Bitmap it = weakValue.getBitmap().get();
                if (it != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    strongValue = new StrongValue(it, weakValue.isSampled());
                } else {
                    strongValue = null;
                }
                if (strongValue != null) {
                    strongValue2 = strongValue;
                    break;
                }
                i++;
            }
            cleanUpIfNecessary();
            return strongValue2;
        }
        return null;
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void set(MemoryCache.Key key, Bitmap bitmap, boolean z, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        HashMap<MemoryCache.Key, ArrayList<WeakValue>> hashMap = this.cache;
        ArrayList<WeakValue> arrayList = hashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            hashMap.put(key, arrayList);
        }
        ArrayList<WeakValue> arrayList2 = arrayList;
        RealWeakMemoryCache realWeakMemoryCache = this;
        int identityHashCode = System.identityHashCode(bitmap);
        WeakValue weakValue = new WeakValue(identityHashCode, new WeakReference(bitmap), z, i);
        int i2 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i2 < size) {
                WeakValue weakValue2 = arrayList2.get(i2);
                Intrinsics.checkNotNullExpressionValue(weakValue2, "values[index]");
                WeakValue weakValue3 = weakValue2;
                if (i < weakValue3.getSize()) {
                    i2++;
                } else if (weakValue3.getIdentityHashCode() == identityHashCode && weakValue3.getBitmap().get() == bitmap) {
                    arrayList2.set(i2, weakValue);
                } else {
                    arrayList2.add(i2, weakValue);
                }
            } else {
                arrayList2.add(weakValue);
                break;
            }
        }
        cleanUpIfNecessary();
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized boolean remove(MemoryCache.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cache.remove(key) != null;
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void clearMemory() {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "clearMemory", null);
        }
        this.operationsSinceCleanUp = 0;
        this.cache.clear();
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void trimMemory(int i) {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 2) {
            logger.log(TAG, 2, "trimMemory, level=" + i, null);
        }
        if (i >= 10 && i != 20) {
            cleanUp$coil_base_release();
        }
    }

    private final void cleanUpIfNecessary() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 10) {
            cleanUp$coil_base_release();
        }
    }

    public final void cleanUp$coil_base_release() {
        WeakReference<Bitmap> bitmap;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<WeakValue>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<WeakValue> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            ArrayList<WeakValue> arrayList = next;
            if (arrayList.size() <= 1) {
                WeakValue weakValue = (WeakValue) CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                if (((weakValue == null || (bitmap = weakValue.getBitmap()) == null) ? null : bitmap.get()) == null) {
                    it.remove();
                }
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList.removeIf(RealWeakMemoryCache$cleanUp$1.INSTANCE);
                } else {
                    ArrayList<WeakValue> arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = i2 - i;
                        if (arrayList2.get(i3).getBitmap().get() == null) {
                            arrayList2.remove(i3);
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$WeakValue;", "", "identityHashCode", "", "bitmap", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "isSampled", "", "size", "(ILjava/lang/ref/WeakReference;ZI)V", "getBitmap", "()Ljava/lang/ref/WeakReference;", "getIdentityHashCode", "()I", "()Z", "getSize", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class WeakValue {
        private final WeakReference<Bitmap> bitmap;
        private final int identityHashCode;
        private final boolean isSampled;
        private final int size;

        public WeakValue(int i, WeakReference<Bitmap> bitmap, boolean z, int i2) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.identityHashCode = i;
            this.bitmap = bitmap;
            this.isSampled = z;
            this.size = i2;
        }

        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        public final WeakReference<Bitmap> getBitmap() {
            return this.bitmap;
        }

        public final boolean isSampled() {
            return this.isSampled;
        }

        public final int getSize() {
            return this.size;
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$StrongValue;", "Lcoil/memory/RealMemoryCache$Value;", "bitmap", "Landroid/graphics/Bitmap;", "isSampled", "", "(Landroid/graphics/Bitmap;Z)V", "getBitmap", "()Landroid/graphics/Bitmap;", "()Z", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    private static final class StrongValue implements RealMemoryCache.Value {
        private final Bitmap bitmap;
        private final boolean isSampled;

        public StrongValue(Bitmap bitmap, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.isSampled = z;
        }

        @Override // coil.memory.RealMemoryCache.Value
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        @Override // coil.memory.RealMemoryCache.Value
        public boolean isSampled() {
            return this.isSampled;
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$Companion;", "", "()V", "CLEAN_UP_INTERVAL", "", "TAG", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized boolean remove(Bitmap bitmap) {
        boolean z;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        RealWeakMemoryCache realWeakMemoryCache = this;
        Collection<ArrayList<WeakValue>> values = this.cache.values();
        Intrinsics.checkNotNullExpressionValue(values, "cache.values");
        Iterator<T> it = values.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            ArrayList values2 = (ArrayList) it.next();
            Intrinsics.checkNotNullExpressionValue(values2, "values");
            int size = values2.size();
            for (int i = 0; i < size; i++) {
                if (((WeakValue) values2.get(i)).getIdentityHashCode() == identityHashCode) {
                    values2.remove(i);
                    z = true;
                    break loop0;
                }
            }
        }
        cleanUpIfNecessary();
        return z;
    }
}
