package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.request.ImageResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ImageResult.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcoil/request/SuccessResult;", "Lcoil/request/ImageResult;", "drawable", "Landroid/graphics/drawable/Drawable;", "request", "Lcoil/request/ImageRequest;", "metadata", "Lcoil/request/ImageResult$Metadata;", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/request/ImageResult$Metadata;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getMetadata", "()Lcoil/request/ImageResult$Metadata;", "getRequest", "()Lcoil/request/ImageRequest;", "source", "Lcoil/decode/DataSource;", "getSource$annotations", "()V", "getSource", "()Lcoil/decode/DataSource;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class SuccessResult extends ImageResult {
    private final Drawable drawable;
    private final ImageResult.Metadata metadata;
    private final ImageRequest request;

    public static /* synthetic */ SuccessResult copy$default(SuccessResult successResult, Drawable drawable, ImageRequest imageRequest, ImageResult.Metadata metadata, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = successResult.getDrawable();
        }
        if ((i & 2) != 0) {
            imageRequest = successResult.getRequest();
        }
        if ((i & 4) != 0) {
            metadata = successResult.metadata;
        }
        return successResult.copy(drawable, imageRequest, metadata);
    }

    @Deprecated(message = "Moved to Metadata.", replaceWith = @ReplaceWith(expression = "metadata.dataSource", imports = {}))
    public static /* synthetic */ void getSource$annotations() {
    }

    public final Drawable component1() {
        return getDrawable();
    }

    public final ImageRequest component2() {
        return getRequest();
    }

    public final ImageResult.Metadata component3() {
        return this.metadata;
    }

    public final SuccessResult copy(Drawable drawable, ImageRequest request, ImageResult.Metadata metadata) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new SuccessResult(drawable, request, metadata);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuccessResult)) {
                return false;
            }
            SuccessResult successResult = (SuccessResult) obj;
            return Intrinsics.areEqual(getDrawable(), successResult.getDrawable()) && Intrinsics.areEqual(getRequest(), successResult.getRequest()) && Intrinsics.areEqual(this.metadata, successResult.metadata);
        }
        return true;
    }

    public int hashCode() {
        Drawable drawable = getDrawable();
        int i = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        ImageRequest request = getRequest();
        int hashCode2 = (hashCode + (request != null ? request.hashCode() : 0)) * 31;
        ImageResult.Metadata metadata = this.metadata;
        if (metadata != null) {
            i = metadata.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SuccessResult(drawable=" + getDrawable() + ", request=" + getRequest() + ", metadata=" + this.metadata + ")";
    }

    @Override // coil.request.ImageResult
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil.request.ImageResult
    public ImageRequest getRequest() {
        return this.request;
    }

    public final ImageResult.Metadata getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessResult(Drawable drawable, ImageRequest request, ImageResult.Metadata metadata) {
        super(null);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.drawable = drawable;
        this.request = request;
        this.metadata = metadata;
    }

    public final DataSource getSource() {
        return this.metadata.getDataSource();
    }
}
