package coil.fetch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.HttpUrl;
/* compiled from: HttpFetcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\f\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcoil/fetch/HttpUrlFetcher;", "Lcoil/fetch/HttpFetcher;", "Lokhttp3/HttpUrl;", "callFactory", "Lokhttp3/Call$Factory;", "(Lokhttp3/Call$Factory;)V", "key", "", "data", "toHttpUrl", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class HttpUrlFetcher extends HttpFetcher<HttpUrl> {
    public HttpUrl toHttpUrl(HttpUrl toHttpUrl) {
        Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
        return toHttpUrl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUrlFetcher(Call.Factory callFactory) {
        super(callFactory);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
    }

    public String key(HttpUrl data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String httpUrl = data.toString();
        Intrinsics.checkNotNullExpressionValue(httpUrl, "data.toString()");
        return httpUrl;
    }
}
