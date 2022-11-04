package org.opendatakit.httpclientandroidlib.impl.client;

import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestAddCookies;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestAuthCache;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestClientConnControl;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestDefaultHeaders;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestProxyAuthentication;
import org.opendatakit.httpclientandroidlib.client.protocol.RequestTargetAuthentication;
import org.opendatakit.httpclientandroidlib.client.protocol.ResponseProcessCookies;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.impl.client.cache.CacheConfig;
import org.opendatakit.httpclientandroidlib.params.HttpConnectionParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpProtocolParams;
import org.opendatakit.httpclientandroidlib.params.SyncBasicHttpParams;
import org.opendatakit.httpclientandroidlib.protocol.BasicHttpProcessor;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
import org.opendatakit.httpclientandroidlib.protocol.RequestContent;
import org.opendatakit.httpclientandroidlib.protocol.RequestExpectContinue;
import org.opendatakit.httpclientandroidlib.protocol.RequestTargetHost;
import org.opendatakit.httpclientandroidlib.protocol.RequestUserAgent;
import org.opendatakit.httpclientandroidlib.util.VersionInfo;
@ThreadSafe
/* loaded from: classes.dex */
public class DefaultHttpClient extends AbstractHttpClient {
    public DefaultHttpClient(ClientConnectionManager conman, HttpParams params) {
        super(conman, params);
    }

    public DefaultHttpClient(ClientConnectionManager conman) {
        super(conman, null);
    }

    public DefaultHttpClient(HttpParams params) {
        super(null, params);
    }

    public DefaultHttpClient() {
        super(null, null);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AbstractHttpClient
    protected HttpParams createHttpParams() {
        HttpParams params = new SyncBasicHttpParams();
        setDefaultHttpParams(params);
        return params;
    }

    public static void setDefaultHttpParams(HttpParams params) {
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(params, HTTP.DEF_CONTENT_CHARSET.name());
        HttpConnectionParams.setTcpNoDelay(params, true);
        HttpConnectionParams.setSocketBufferSize(params, CacheConfig.DEFAULT_MAX_OBJECT_SIZE_BYTES);
        VersionInfo vi = VersionInfo.loadVersionInfo("org.opendatakit.httpclientandroidlib.client", DefaultHttpClient.class.getClassLoader());
        String release = vi != null ? vi.getRelease() : VersionInfo.UNAVAILABLE;
        HttpProtocolParams.setUserAgent(params, "Apache-HttpClient/" + release + " (java 1.5)");
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AbstractHttpClient
    public BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor httpproc = new BasicHttpProcessor();
        httpproc.addInterceptor(new RequestDefaultHeaders());
        httpproc.addInterceptor(new RequestContent());
        httpproc.addInterceptor(new RequestTargetHost());
        httpproc.addInterceptor(new RequestClientConnControl());
        httpproc.addInterceptor(new RequestUserAgent());
        httpproc.addInterceptor(new RequestExpectContinue());
        httpproc.addInterceptor(new RequestAddCookies());
        httpproc.addInterceptor(new ResponseProcessCookies());
        httpproc.addInterceptor(new RequestAuthCache());
        httpproc.addInterceptor(new RequestTargetAuthentication());
        httpproc.addInterceptor(new RequestProxyAuthentication());
        return httpproc;
    }
}
