package org.opendatakit.httpclientandroidlib.impl.auth;

import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.androidextra.Base64;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.auth.AuthenticationException;
import org.opendatakit.httpclientandroidlib.auth.ChallengeState;
import org.opendatakit.httpclientandroidlib.auth.Credentials;
import org.opendatakit.httpclientandroidlib.auth.MalformedChallengeException;
import org.opendatakit.httpclientandroidlib.auth.params.AuthParams;
import org.opendatakit.httpclientandroidlib.message.BufferedHeader;
import org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
import org.opendatakit.httpclientandroidlib.util.EncodingUtils;
@NotThreadSafe
/* loaded from: classes.dex */
public class BasicScheme extends RFC2617Scheme {
    private boolean complete;

    public BasicScheme(ChallengeState challengeState) {
        super(challengeState);
        this.complete = false;
    }

    public BasicScheme() {
        this(null);
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public String getSchemeName() {
        return "basic";
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.auth.AuthSchemeBase, org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        this.complete = true;
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public boolean isComplete() {
        return this.complete;
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public boolean isConnectionBased() {
        return false;
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException {
        return authenticate(credentials, request, new BasicHttpContext());
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.auth.AuthSchemeBase, org.opendatakit.httpclientandroidlib.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest request, HttpContext context) throws AuthenticationException {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        String charset = AuthParams.getCredentialCharset(request.getParams());
        return authenticate(credentials, charset, isProxy());
    }

    public static Header authenticate(Credentials credentials, String charset, boolean proxy) {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset may not be null");
        }
        StringBuilder tmp = new StringBuilder();
        tmp.append(credentials.getUserPrincipal().getName());
        tmp.append(":");
        tmp.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] base64password = Base64.encode(EncodingUtils.getBytes(tmp.toString(), charset), 2);
        CharArrayBuffer buffer = new CharArrayBuffer(32);
        if (proxy) {
            buffer.append("Proxy-Authorization");
        } else {
            buffer.append("Authorization");
        }
        buffer.append(": Basic ");
        buffer.append(base64password, 0, base64password.length);
        return new BufferedHeader(buffer);
    }
}
