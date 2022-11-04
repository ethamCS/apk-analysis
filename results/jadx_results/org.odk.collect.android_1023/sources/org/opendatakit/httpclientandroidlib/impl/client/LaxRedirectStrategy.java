package org.opendatakit.httpclientandroidlib.impl.client;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.methods.HttpPost;
@Immutable
/* loaded from: classes.dex */
public class LaxRedirectStrategy extends DefaultRedirectStrategy {
    private static final String[] REDIRECT_METHODS = {"GET", HttpPost.METHOD_NAME, "HEAD"};

    @Override // org.opendatakit.httpclientandroidlib.impl.client.DefaultRedirectStrategy
    protected boolean isRedirectable(String method) {
        String[] arr$ = REDIRECT_METHODS;
        for (String m : arr$) {
            if (m.equalsIgnoreCase(method)) {
                return true;
            }
        }
        return false;
    }
}
