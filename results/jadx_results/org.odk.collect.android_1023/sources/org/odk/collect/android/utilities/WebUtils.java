package org.odk.collect.android.utilities;

import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.format.DateFormat;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.kxml2.io.KXmlParser;
import org.kxml2.kdom.Document;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.auth.AuthScope;
import org.opendatakit.httpclientandroidlib.auth.Credentials;
import org.opendatakit.httpclientandroidlib.auth.UsernamePasswordCredentials;
import org.opendatakit.httpclientandroidlib.auth.params.AuthPNames;
import org.opendatakit.httpclientandroidlib.client.AuthCache;
import org.opendatakit.httpclientandroidlib.client.CredentialsProvider;
import org.opendatakit.httpclientandroidlib.client.HttpClient;
import org.opendatakit.httpclientandroidlib.client.methods.HttpGet;
import org.opendatakit.httpclientandroidlib.client.methods.HttpHead;
import org.opendatakit.httpclientandroidlib.client.methods.HttpPost;
import org.opendatakit.httpclientandroidlib.client.params.AuthPolicy;
import org.opendatakit.httpclientandroidlib.client.params.ClientPNames;
import org.opendatakit.httpclientandroidlib.client.params.CookiePolicy;
import org.opendatakit.httpclientandroidlib.client.params.HttpClientParams;
import org.opendatakit.httpclientandroidlib.client.protocol.ClientContext;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.impl.auth.BasicScheme;
import org.opendatakit.httpclientandroidlib.impl.client.BasicAuthCache;
import org.opendatakit.httpclientandroidlib.impl.client.DefaultHttpClient;
import org.opendatakit.httpclientandroidlib.params.BasicHttpParams;
import org.opendatakit.httpclientandroidlib.params.HttpConnectionParams;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class WebUtils {
    public static final int CONNECTION_TIMEOUT = 30000;
    private static final String DATE_HEADER = "Date";
    public static final String HTTP_CONTENT_TYPE_TEXT_XML = "text/xml";
    public static final String OPEN_ROSA_VERSION = "1.0";
    public static final String OPEN_ROSA_VERSION_HEADER = "X-OpenRosa-Version";
    private static ClientConnectionManager httpConnectionManager = null;
    public static final String t = "WebUtils";

    public static final List<AuthScope> buildAuthScopes(String host) {
        List<AuthScope> asList = new ArrayList<>();
        AuthScope a = new AuthScope(host, -1, null, AuthPolicy.DIGEST);
        asList.add(a);
        AuthScope a2 = new AuthScope(host, 443, null, AuthPolicy.BASIC);
        asList.add(a2);
        AuthScope a3 = new AuthScope(host, 8443, null, AuthPolicy.BASIC);
        asList.add(a3);
        return asList;
    }

    public static final void clearAllCredentials() {
        CredentialsProvider credsProvider = Collect.getInstance().getCredentialsProvider();
        Log.i(t, "clearAllCredentials");
        credsProvider.clear();
    }

    public static final boolean hasCredentials(String userEmail, String host) {
        CredentialsProvider credsProvider = Collect.getInstance().getCredentialsProvider();
        List<AuthScope> asList = buildAuthScopes(host);
        boolean hasCreds = true;
        for (AuthScope a : asList) {
            Credentials c = credsProvider.getCredentials(a);
            if (c == null) {
                hasCreds = false;
            }
        }
        return hasCreds;
    }

    private static final void clearHostCredentials(String host) {
        CredentialsProvider credsProvider = Collect.getInstance().getCredentialsProvider();
        Log.i(t, "clearHostCredentials: " + host);
        List<AuthScope> asList = buildAuthScopes(host);
        for (AuthScope a : asList) {
            credsProvider.setCredentials(a, null);
        }
    }

    public static final void addCredentials(String username, String password, String host) {
        clearHostCredentials(host);
        if (username != null && username.trim().length() != 0) {
            Log.i(t, "adding credential for host: " + host + " username:" + username);
            Credentials c = new UsernamePasswordCredentials(username, password);
            addCredentials(c, host);
        }
    }

    private static final void addCredentials(Credentials c, String host) {
        CredentialsProvider credsProvider = Collect.getInstance().getCredentialsProvider();
        List<AuthScope> asList = buildAuthScopes(host);
        for (AuthScope a : asList) {
            credsProvider.setCredentials(a, c);
        }
    }

    public static final void enablePreemptiveBasicAuth(HttpContext localContext, String host) {
        AuthCache ac = (AuthCache) localContext.getAttribute(ClientContext.AUTH_CACHE);
        HttpHost h = new HttpHost(host);
        if (ac == null) {
            ac = new BasicAuthCache();
            localContext.setAttribute(ClientContext.AUTH_CACHE, ac);
        }
        List<AuthScope> asList = buildAuthScopes(host);
        for (AuthScope a : asList) {
            if (a.getScheme() == AuthPolicy.BASIC) {
                ac.put(h, new BasicScheme());
            }
        }
    }

    private static final void setOpenRosaHeaders(HttpRequest req) {
        req.setHeader(OPEN_ROSA_VERSION_HEADER, OPEN_ROSA_VERSION);
        GregorianCalendar g = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        g.setTime(new Date());
        req.setHeader("Date", DateFormat.format("E, dd MMM yyyy hh:mm:ss zz", g).toString());
    }

    public static final HttpHead createOpenRosaHttpHead(Uri u) {
        HttpHead req = new HttpHead(URI.create(u.toString()));
        setOpenRosaHeaders(req);
        return req;
    }

    public static final HttpGet createOpenRosaHttpGet(URI uri) {
        HttpGet req = new HttpGet();
        setOpenRosaHeaders(req);
        setGoogleHeaders(req);
        req.setURI(uri);
        return req;
    }

    public static final void setGoogleHeaders(HttpRequest req) {
        String auth;
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(Collect.getInstance().getApplicationContext());
        String protocol = settings.getString(PreferencesActivity.KEY_PROTOCOL, PreferencesActivity.PROTOCOL_ODK_DEFAULT);
        if (protocol.equals(PreferencesActivity.PROTOCOL_GOOGLE) && (auth = settings.getString(PreferencesActivity.KEY_AUTH, "")) != null && auth.length() > 0) {
            req.setHeader("Authorization", "GoogleLogin auth=" + auth);
        }
    }

    public static final HttpPost createOpenRosaHttpPost(Uri u) {
        HttpPost req = new HttpPost(URI.create(u.toString()));
        setOpenRosaHeaders(req);
        setGoogleHeaders(req);
        return req;
    }

    public static final synchronized HttpClient createHttpClient(int timeout) {
        DefaultHttpClient httpclient;
        synchronized (WebUtils.class) {
            HttpParams params = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(params, timeout);
            HttpConnectionParams.setSoTimeout(params, timeout * 2);
            HttpClientParams.setRedirecting(params, true);
            HttpClientParams.setAuthenticating(params, true);
            HttpClientParams.setCookiePolicy(params, CookiePolicy.BROWSER_COMPATIBILITY);
            List<String> authPref = new ArrayList<>();
            authPref.add(AuthPolicy.DIGEST);
            authPref.add(AuthPolicy.BASIC);
            params.setParameter(AuthPNames.TARGET_AUTH_PREF, authPref);
            params.setParameter(ClientPNames.MAX_REDIRECTS, 1);
            params.setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);
            if (httpConnectionManager == null) {
                httpclient = new DefaultHttpClient(params);
                httpConnectionManager = httpclient.getConnectionManager();
            } else {
                httpclient = new DefaultHttpClient(httpConnectionManager, params);
            }
        }
        return httpclient;
    }

    public static final void discardEntityBytes(HttpResponse response) {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            try {
                InputStream is = response.getEntity().getContent();
                do {
                } while (is.skip(1024L) == 1024);
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static DocumentFetchResult getXmlDocument(String urlString, HttpContext localContext, HttpClient httpclient) {
        Throwable th;
        InputStreamReader isr;
        Document doc;
        try {
            URL url = new URL(urlString);
            URI u = url.toURI();
            if (u.getScheme().equals("https")) {
                enablePreemptiveBasicAuth(localContext, u.getHost());
            }
            HttpGet req = createOpenRosaHttpGet(u);
            try {
                HttpResponse response = httpclient.execute(req, localContext);
                int statusCode = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (statusCode != 200) {
                    discardEntityBytes(response);
                    if (statusCode == 401) {
                        Collect.getInstance().getCookieStore().clear();
                    }
                    String webError = response.getStatusLine().getReasonPhrase() + " (" + statusCode + ")";
                    return new DocumentFetchResult(u.toString() + " responded with: " + webError, statusCode);
                } else if (entity == null) {
                    String error = "No entity body returned from: " + u.toString();
                    Log.e(t, error);
                    return new DocumentFetchResult(error, 0);
                } else if (!entity.getContentType().getValue().toLowerCase(Locale.ENGLISH).contains(HTTP_CONTENT_TYPE_TEXT_XML)) {
                    discardEntityBytes(response);
                    String error2 = "ContentType: " + entity.getContentType().getValue() + " returned from: " + u.toString() + " is not text/xml.  This is often caused a network proxy.  Do you need to login to your network?";
                    Log.e(t, error2);
                    return new DocumentFetchResult(error2, 0);
                } else {
                    InputStream is = null;
                    InputStreamReader isr2 = null;
                    try {
                        is = entity.getContent();
                        isr = new InputStreamReader(is, "UTF-8");
                        try {
                            doc = new Document();
                        } catch (Throwable th2) {
                            th = th2;
                            isr2 = isr;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        KXmlParser parser = new KXmlParser();
                        parser.setInput(isr);
                        parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
                        doc.parse(parser);
                        isr.close();
                        InputStreamReader isr3 = null;
                        if (0 != 0) {
                            do {
                            } while (isr3.skip(1024L) == 1024);
                            try {
                                isr3.close();
                            } catch (Exception e) {
                            }
                        }
                        if (is != null) {
                            try {
                                is.close();
                            } catch (Exception e2) {
                            }
                        }
                        boolean isOR = false;
                        Header[] fields = response.getHeaders(OPEN_ROSA_VERSION_HEADER);
                        if (fields != null && fields.length >= 1) {
                            isOR = true;
                            boolean versionMatch = false;
                            boolean first = true;
                            StringBuilder b = new StringBuilder();
                            int len$ = fields.length;
                            int i$ = 0;
                            while (true) {
                                if (i$ >= len$) {
                                    break;
                                }
                                Header h = fields[i$];
                                if (OPEN_ROSA_VERSION.equals(h.getValue())) {
                                    versionMatch = true;
                                    break;
                                }
                                if (!first) {
                                    b.append("; ");
                                }
                                first = false;
                                b.append(h.getValue());
                                i$++;
                            }
                            if (!versionMatch) {
                                Log.w(t, "X-OpenRosa-Version unrecognized version(s): " + b.toString());
                            }
                        }
                        return new DocumentFetchResult(doc, isOR);
                    } catch (Throwable th4) {
                        th = th4;
                        isr2 = isr;
                        if (isr2 != null) {
                            do {
                            } while (isr2.skip(1024L) == 1024);
                            try {
                                isr2.close();
                            } catch (Exception e3) {
                            }
                        }
                        if (is != null) {
                            try {
                                is.close();
                            } catch (Exception e4) {
                            }
                        }
                        try {
                            throw th;
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            String error3 = "Parsing failed with " + e5.getMessage() + "while accessing " + u.toString();
                            Log.e(t, error3);
                            return new DocumentFetchResult(error3, 0);
                        }
                    }
                }
            } catch (Exception e6) {
                httpConnectionManager.shutdown();
                httpConnectionManager = null;
                e6.printStackTrace();
                Throwable c = e6;
                while (c.getCause() != null) {
                    c = c.getCause();
                }
                String cause = c.toString();
                String error4 = "Error: " + cause + " while accessing " + u.toString();
                Log.w(t, error4);
                return new DocumentFetchResult(error4, 0);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            return new DocumentFetchResult(e7.getLocalizedMessage() + "while accessing" + urlString, 0);
        }
    }
}
