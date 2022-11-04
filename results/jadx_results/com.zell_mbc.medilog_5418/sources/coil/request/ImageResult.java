package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ImageResult.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcoil/request/ImageResult;", "", "()V", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "request", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "Metadata", "Lcoil/request/SuccessResult;", "Lcoil/request/ErrorResult;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class ImageResult {
    public abstract Drawable getDrawable();

    public abstract ImageRequest getRequest();

    private ImageResult() {
    }

    public /* synthetic */ ImageResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ImageResult.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcoil/request/ImageResult$Metadata;", "", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "isPlaceholderMemoryCacheKeyPresent", "(Lcoil/memory/MemoryCache$Key;ZLcoil/decode/DataSource;Z)V", "getDataSource", "()Lcoil/decode/DataSource;", "()Z", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Metadata {
        private final DataSource dataSource;
        private final boolean isPlaceholderMemoryCacheKeyPresent;
        private final boolean isSampled;
        private final MemoryCache.Key memoryCacheKey;

        public static /* synthetic */ Metadata copy$default(Metadata metadata, MemoryCache.Key key, boolean z, DataSource dataSource, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                key = metadata.memoryCacheKey;
            }
            if ((i & 2) != 0) {
                z = metadata.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = metadata.dataSource;
            }
            if ((i & 8) != 0) {
                z2 = metadata.isPlaceholderMemoryCacheKeyPresent;
            }
            return metadata.copy(key, z, dataSource, z2);
        }

        public final MemoryCache.Key component1() {
            return this.memoryCacheKey;
        }

        public final boolean component2() {
            return this.isSampled;
        }

        public final DataSource component3() {
            return this.dataSource;
        }

        public final boolean component4() {
            return this.isPlaceholderMemoryCacheKeyPresent;
        }

        public final Metadata copy(MemoryCache.Key key, boolean z, DataSource dataSource, boolean z2) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            return new Metadata(key, z, dataSource, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof Metadata)) {
                    return false;
                }
                Metadata metadata = (Metadata) obj;
                return Intrinsics.areEqual(this.memoryCacheKey, metadata.memoryCacheKey) && this.isSampled == metadata.isSampled && Intrinsics.areEqual(this.dataSource, metadata.dataSource) && this.isPlaceholderMemoryCacheKeyPresent == metadata.isPlaceholderMemoryCacheKeyPresent;
            }
            return true;
        }

        public int hashCode() {
            MemoryCache.Key key = this.memoryCacheKey;
            int i = 0;
            int hashCode = (key != null ? key.hashCode() : 0) * 31;
            boolean z = this.isSampled;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i3) * 31;
            DataSource dataSource = this.dataSource;
            if (dataSource != null) {
                i = dataSource.hashCode();
            }
            int i6 = (i5 + i) * 31;
            boolean z2 = this.isPlaceholderMemoryCacheKeyPresent;
            if (!z2) {
                i2 = z2 ? 1 : 0;
            }
            return i6 + i2;
        }

        public String toString() {
            return "Metadata(memoryCacheKey=" + this.memoryCacheKey + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", isPlaceholderMemoryCacheKeyPresent=" + this.isPlaceholderMemoryCacheKeyPresent + ")";
        }

        public Metadata(MemoryCache.Key key, boolean z, DataSource dataSource, boolean z2) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            this.memoryCacheKey = key;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.isPlaceholderMemoryCacheKeyPresent = z2;
        }

        public final MemoryCache.Key getMemoryCacheKey() {
            return this.memoryCacheKey;
        }

        public final boolean isSampled() {
            return this.isSampled;
        }

        public final DataSource getDataSource() {
            return this.dataSource;
        }

        public final boolean isPlaceholderMemoryCacheKeyPresent() {
            return this.isPlaceholderMemoryCacheKeyPresent;
        }
    }
}
