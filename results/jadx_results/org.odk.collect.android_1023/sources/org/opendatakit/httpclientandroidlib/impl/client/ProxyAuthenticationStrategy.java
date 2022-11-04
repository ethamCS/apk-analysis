package org.opendatakit.httpclientandroidlib.impl.client;

import java.util.Map;
import java.util.Queue;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpStatus;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.auth.AuthScheme;
import org.opendatakit.httpclientandroidlib.auth.MalformedChallengeException;
import org.opendatakit.httpclientandroidlib.auth.params.AuthPNames;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@Immutable
/* loaded from: classes.dex */
public class ProxyAuthenticationStrategy extends AuthenticationStrategyImpl {
    @Override // org.opendatakit.httpclientandroidlib.impl.client.AuthenticationStrategyImpl, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ void authFailed(HttpHost x0, AuthScheme x1, HttpContext x2) {
        super.authFailed(x0, x1, x2);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AuthenticationStrategyImpl, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ void authSucceeded(HttpHost x0, AuthScheme x1, HttpContext x2) {
        super.authSucceeded(x0, x1, x2);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AuthenticationStrategyImpl, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ Map getChallenges(HttpHost x0, HttpResponse x1, HttpContext x2) throws MalformedChallengeException {
        return super.getChallenges(x0, x1, x2);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AuthenticationStrategyImpl, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ boolean isAuthenticationRequested(HttpHost x0, HttpResponse x1, HttpContext x2) {
        return super.isAuthenticationRequested(x0, x1, x2);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.AuthenticationStrategyImpl, org.opendatakit.httpclientandroidlib.client.AuthenticationStrategy
    public /* bridge */ /* synthetic */ Queue select(Map x0, HttpHost x1, HttpResponse x2, HttpContext x3) throws MalformedChallengeException {
        return super.select(x0, x1, x2, x3);
    }

    public ProxyAuthenticationStrategy() {
        super(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, "Proxy-Authenticate", AuthPNames.PROXY_AUTH_PREF);
    }
}
