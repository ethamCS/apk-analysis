package coil.fetch;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.bitmap.BitmapPool;
import coil.decode.DataSource;
import coil.decode.Options;
import coil.fetch.Fetcher;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BitmapFetcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0002H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcoil/fetch/BitmapFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/graphics/Bitmap;", "()V", "fetch", "Lcoil/fetch/FetchResult;", "pool", "Lcoil/bitmap/BitmapPool;", "data", "size", "Lcoil/size/Size;", "options", "Lcoil/decode/Options;", "(Lcoil/bitmap/BitmapPool;Landroid/graphics/Bitmap;Lcoil/size/Size;Lcoil/decode/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class BitmapFetcher implements Fetcher<Bitmap> {
    public String key(Bitmap data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // coil.fetch.Fetcher
    public /* bridge */ /* synthetic */ Object fetch(BitmapPool bitmapPool, Bitmap bitmap, Size size, Options options, Continuation continuation) {
        return fetch2(bitmapPool, bitmap, size, options, (Continuation<? super FetchResult>) continuation);
    }

    public boolean handles(Bitmap data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Fetcher.DefaultImpls.handles(this, data);
    }

    /* renamed from: fetch */
    public Object fetch2(BitmapPool bitmapPool, Bitmap bitmap, Size size, Options options, Continuation<? super FetchResult> continuation) {
        Resources resources = options.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return new DrawableResult(new BitmapDrawable(resources, bitmap), false, DataSource.MEMORY);
    }
}
