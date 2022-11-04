package org.opendatakit.httpclientandroidlib.impl.client;

import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.auth.AuthProtocolState;
import org.opendatakit.httpclientandroidlib.auth.AuthState;
import org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* loaded from: classes.dex */
public class HttpAuthenticator {
    private final Log log;

    public HttpAuthenticator(Log log) {
        this.log = log == null ? LogFactory.getLog(getClass()) : log;
    }

    public HttpAuthenticator() {
        this(null);
    }

    public boolean isAuthenticationRequested(HttpHost host, HttpResponse response, AuthenticationStrategy authStrategy, AuthState authState, HttpContext context) {
        if (authStrategy.isAuthenticationRequested(host, response, context)) {
            return true;
        }
        switch (authState.getState()) {
            case CHALLENGED:
            case HANDSHAKE:
                authState.setState(AuthProtocolState.SUCCESS);
                authStrategy.authSucceeded(host, authState.getAuthScheme(), context);
                break;
            case SUCCESS:
                break;
            default:
                authState.setState(AuthProtocolState.UNCHALLENGED);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: MalformedChallengeException -> 0x0086, TryCatch #0 {MalformedChallengeException -> 0x0086, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x0024, B:7:0x002e, B:9:0x0037, B:10:0x0047, B:11:0x004a, B:13:0x0050, B:15:0x0056, B:17:0x005e, B:18:0x0076, B:20:0x0082, B:27:0x00b2, B:29:0x00ca, B:31:0x00dc, B:33:0x00ec, B:34:0x0105, B:35:0x010d), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[Catch: MalformedChallengeException -> 0x0086, TryCatch #0 {MalformedChallengeException -> 0x0086, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x0024, B:7:0x002e, B:9:0x0037, B:10:0x0047, B:11:0x004a, B:13:0x0050, B:15:0x0056, B:17:0x005e, B:18:0x0076, B:20:0x0082, B:27:0x00b2, B:29:0x00ca, B:31:0x00dc, B:33:0x00ec, B:34:0x0105, B:35:0x010d), top: B:37:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean authenticate(org.opendatakit.httpclientandroidlib.HttpHost r10, org.opendatakit.httpclientandroidlib.HttpResponse r11, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy r12, org.opendatakit.httpclientandroidlib.auth.AuthState r13, org.opendatakit.httpclientandroidlib.protocol.HttpContext r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opendatakit.httpclientandroidlib.impl.client.HttpAuthenticator.authenticate(org.opendatakit.httpclientandroidlib.HttpHost, org.opendatakit.httpclientandroidlib.HttpResponse, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy, org.opendatakit.httpclientandroidlib.auth.AuthState, org.opendatakit.httpclientandroidlib.protocol.HttpContext):boolean");
    }
}
