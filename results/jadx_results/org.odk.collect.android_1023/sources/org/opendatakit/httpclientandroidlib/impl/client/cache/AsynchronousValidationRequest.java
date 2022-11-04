package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.ProtocolException;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AsynchronousValidationRequest implements Runnable {
    private final HttpCacheEntry cacheEntry;
    private final CachingHttpClient cachingClient;
    private final HttpContext context;
    private final String identifier;
    private final Log log = LogFactory.getLog(getClass());
    private final AsynchronousValidator parent;
    private final HttpRequest request;
    private final HttpHost target;

    public AsynchronousValidationRequest(AsynchronousValidator parent, CachingHttpClient cachingClient, HttpHost target, HttpRequest request, HttpContext context, HttpCacheEntry cacheEntry, String identifier) {
        this.parent = parent;
        this.cachingClient = cachingClient;
        this.target = target;
        this.request = request;
        this.context = context;
        this.cacheEntry = cacheEntry;
        this.identifier = identifier;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                this.cachingClient.revalidateCacheEntry(this.target, this.request, this.context, this.cacheEntry);
                this.parent.markComplete(this.identifier);
            } catch (IOException ioe) {
                this.log.debug("Asynchronous revalidation failed due to exception: " + ioe);
                this.parent.markComplete(this.identifier);
            } catch (ProtocolException pe) {
                this.log.error("ProtocolException thrown during asynchronous revalidation: " + pe);
                this.parent.markComplete(this.identifier);
            }
        } catch (Throwable th) {
            this.parent.markComplete(this.identifier);
            throw th;
        }
    }

    String getIdentifier() {
        return this.identifier;
    }
}
