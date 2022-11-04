package coil.fetch;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import coil.bitmap.BitmapPool;
import coil.decode.DataSource;
import coil.decode.Options;
import coil.size.Size;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
/* compiled from: ContentUriFetcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0001¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcoil/fetch/ContentUriFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fetch", "Lcoil/fetch/FetchResult;", "pool", "Lcoil/bitmap/BitmapPool;", "data", "size", "Lcoil/size/Size;", "options", "Lcoil/decode/Options;", "(Lcoil/bitmap/BitmapPool;Landroid/net/Uri;Lcoil/size/Size;Lcoil/decode/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handles", "", "isContactPhotoUri", "isContactPhotoUri$coil_base_release", "key", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ContentUriFetcher implements Fetcher<Uri> {
    private final Context context;

    public ContentUriFetcher(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // coil.fetch.Fetcher
    public /* bridge */ /* synthetic */ Object fetch(BitmapPool bitmapPool, Uri uri, Size size, Options options, Continuation continuation) {
        return fetch2(bitmapPool, uri, size, options, (Continuation<? super FetchResult>) continuation);
    }

    public boolean handles(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getScheme(), "content");
    }

    public String key(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String uri = data.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "data.toString()");
        return uri;
    }

    /* renamed from: fetch */
    public Object fetch2(BitmapPool bitmapPool, Uri uri, Size size, Options options, Continuation<? super FetchResult> continuation) {
        FileInputStream fileInputStream;
        if (isContactPhotoUri$coil_base_release(uri)) {
            AssetFileDescriptor openAssetFileDescriptor = this.context.getContentResolver().openAssetFileDescriptor(uri, "r");
            fileInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (fileInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else {
            fileInputStream = this.context.getContentResolver().openInputStream(uri);
            if (fileInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new SourceResult(Okio.buffer(Okio.source(fileInputStream)), this.context.getContentResolver().getType(uri), DataSource.DISK);
    }

    public final boolean isContactPhotoUri$coil_base_release(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(data.getLastPathSegment(), "display_photo");
    }
}
