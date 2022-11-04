package org.opendatakit.httpclientandroidlib.impl.client;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.auth.AuthScheme;
import org.opendatakit.httpclientandroidlib.auth.AuthState;
import org.opendatakit.httpclientandroidlib.auth.Credentials;
import org.opendatakit.httpclientandroidlib.client.UserTokenHandler;
import org.opendatakit.httpclientandroidlib.client.protocol.ClientContext;
import org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection;
import org.opendatakit.httpclientandroidlib.protocol.ExecutionContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
/* loaded from: classes.dex */
public class DefaultUserTokenHandler implements UserTokenHandler {
    @Override // org.opendatakit.httpclientandroidlib.client.UserTokenHandler
    public Object getUserToken(HttpContext context) {
        SSLSession sslsession;
        Principal userPrincipal = null;
        AuthState targetAuthState = (AuthState) context.getAttribute(ClientContext.TARGET_AUTH_STATE);
        if (targetAuthState != null && (userPrincipal = getAuthPrincipal(targetAuthState)) == null) {
            AuthState proxyAuthState = (AuthState) context.getAttribute(ClientContext.PROXY_AUTH_STATE);
            userPrincipal = getAuthPrincipal(proxyAuthState);
        }
        if (userPrincipal == null) {
            HttpRoutedConnection conn = (HttpRoutedConnection) context.getAttribute(ExecutionContext.HTTP_CONNECTION);
            if (conn.isOpen() && (sslsession = conn.getSSLSession()) != null) {
                Principal userPrincipal2 = sslsession.getLocalPrincipal();
                return userPrincipal2;
            }
            return userPrincipal;
        }
        return userPrincipal;
    }

    private static Principal getAuthPrincipal(AuthState authState) {
        Credentials creds;
        AuthScheme scheme = authState.getAuthScheme();
        if (scheme == null || !scheme.isComplete() || !scheme.isConnectionBased() || (creds = authState.getCredentials()) == null) {
            return null;
        }
        return creds.getUserPrincipal();
    }
}
