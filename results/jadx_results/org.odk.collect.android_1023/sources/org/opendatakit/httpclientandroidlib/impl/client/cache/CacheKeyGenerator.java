package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.javarosa.core.model.instance.TreeReference;
import org.opendatakit.httpclientandroidlib.Consts;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
@Immutable
/* loaded from: classes.dex */
public class CacheKeyGenerator {
    public String getURI(HttpHost host, HttpRequest req) {
        return isRelativeRequest(req) ? canonicalizeUri(String.format("%s%s", host.toString(), req.getRequestLine().getUri())) : canonicalizeUri(req.getRequestLine().getUri());
    }

    public String canonicalizeUri(String uri) {
        try {
            URL u = new URL(uri);
            String protocol = u.getProtocol().toLowerCase();
            String hostname = u.getHost().toLowerCase();
            int port = canonicalizePort(u.getPort(), protocol);
            String path = canonicalizePath(u.getPath());
            if ("".equals(path)) {
                path = "/";
            }
            String query = u.getQuery();
            String file = query != null ? path + "?" + query : path;
            URL out = new URL(protocol, hostname, port, file);
            return out.toString();
        } catch (MalformedURLException e) {
            return uri;
        }
    }

    private String canonicalizePath(String path) {
        try {
            String decoded = URLDecoder.decode(path, "UTF-8");
            return new URI(decoded).getPath();
        } catch (UnsupportedEncodingException e) {
            return path;
        } catch (URISyntaxException e2) {
            return path;
        }
    }

    private int canonicalizePort(int port, String protocol) {
        if (port == -1 && HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(protocol)) {
            return 80;
        }
        if (port == -1 && "https".equalsIgnoreCase(protocol)) {
            return 443;
        }
        return port;
    }

    private boolean isRelativeRequest(HttpRequest req) {
        String requestUri = req.getRequestLine().getUri();
        return TreeReference.NAME_WILDCARD.equals(requestUri) || requestUri.startsWith("/");
    }

    protected String getFullHeaderValue(Header[] headers) {
        if (headers == null) {
            return "";
        }
        StringBuilder buf = new StringBuilder("");
        boolean first = true;
        for (Header hdr : headers) {
            if (!first) {
                buf.append(", ");
            }
            buf.append(hdr.getValue().trim());
            first = false;
        }
        return buf.toString();
    }

    public String getVariantURI(HttpHost host, HttpRequest req, HttpCacheEntry entry) {
        return !entry.hasVariants() ? getURI(host, req) : getVariantKey(req, entry) + getURI(host, req);
    }

    public String getVariantKey(HttpRequest req, HttpCacheEntry entry) {
        List<String> variantHeaderNames = new ArrayList<>();
        Header[] arr$ = entry.getHeaders("Vary");
        for (Header varyHdr : arr$) {
            HeaderElement[] arr$2 = varyHdr.getElements();
            for (HeaderElement elt : arr$2) {
                variantHeaderNames.add(elt.getName());
            }
        }
        Collections.sort(variantHeaderNames);
        try {
            StringBuilder buf = new StringBuilder("{");
            boolean first = true;
            for (String headerName : variantHeaderNames) {
                if (!first) {
                    buf.append("&");
                }
                buf.append(URLEncoder.encode(headerName, Consts.UTF_8.name()));
                buf.append("=");
                buf.append(URLEncoder.encode(getFullHeaderValue(req.getHeaders(headerName)), Consts.UTF_8.name()));
                first = false;
            }
            buf.append("}");
            return buf.toString();
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("couldn't encode to UTF-8", uee);
        }
    }
}
