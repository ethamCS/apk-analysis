package org.opendatakit.httpclientandroidlib.impl.client;

import java.util.List;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.auth.MalformedChallengeException;
import org.opendatakit.httpclientandroidlib.auth.params.AuthPNames;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
@Deprecated
/* loaded from: classes.dex */
public class DefaultTargetAuthenticationHandler extends AbstractAuthenticationHandler {
    @Override // org.opendatakit.httpclientandroidlib.client.AuthenticationHandler
    public boolean isAuthenticationRequested(HttpResponse response, HttpContext context) {
        if (response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        int status = response.getStatusLine().getStatusCode();
        return status == 401;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.AuthenticationHandler
    public Map<String, Header> getChallenges(HttpResponse response, HttpContext context) throws MalformedChallengeException {
        if (response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        Header[] headers = response.getHeaders("WWW-Authenticate");
        return parseChallenges(headers);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AbstractAuthenticationHandler
    public List<String> getAuthPreferences(HttpResponse response, HttpContext context) {
        List<String> authpref = (List) response.getParams().getParameter(AuthPNames.TARGET_AUTH_PREF);
        return authpref != null ? authpref : super.getAuthPreferences(response, context);
    }
}
