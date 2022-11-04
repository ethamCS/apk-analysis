package org.opendatakit.httpclientandroidlib.impl.cookie;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
import org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler;
import org.opendatakit.httpclientandroidlib.cookie.CookieOrigin;
import org.opendatakit.httpclientandroidlib.cookie.MalformedCookieException;
@Immutable
/* loaded from: classes.dex */
public abstract class AbstractCookieAttributeHandler implements CookieAttributeHandler {
    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin origin) {
        return true;
    }
}
