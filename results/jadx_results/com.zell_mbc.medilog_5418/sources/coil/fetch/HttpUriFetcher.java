package coil.fetch;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.HttpUrl;
/* compiled from: HttpFetcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/HttpFetcher;", "Landroid/net/Uri;", "callFactory", "Lokhttp3/Call$Factory;", "(Lokhttp3/Call$Factory;)V", "handles", "", "data", "key", "", "toHttpUrl", "Lokhttp3/HttpUrl;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class HttpUriFetcher extends HttpFetcher<Uri> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher(Call.Factory callFactory) {
        super(callFactory);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
    }

    public boolean handles(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getScheme(), "http") || Intrinsics.areEqual(data.getScheme(), "https");
    }

    public String key(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String uri = data.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "data.toString()");
        return uri;
    }

    public HttpUrl toHttpUrl(Uri toHttpUrl) {
        Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
        HttpUrl httpUrl = HttpUrl.get(toHttpUrl.toString());
        Intrinsics.checkNotNullExpressionValue(httpUrl, "HttpUrl.get(toString())");
        return httpUrl;
    }
}
