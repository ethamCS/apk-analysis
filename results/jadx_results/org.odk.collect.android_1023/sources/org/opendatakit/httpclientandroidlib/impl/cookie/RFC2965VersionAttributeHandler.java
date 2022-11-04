package org.opendatakit.httpclientandroidlib.impl.cookie;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.cookie.ClientCookie;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
import org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler;
import org.opendatakit.httpclientandroidlib.cookie.CookieOrigin;
import org.opendatakit.httpclientandroidlib.cookie.CookieRestrictionViolationException;
import org.opendatakit.httpclientandroidlib.cookie.MalformedCookieException;
import org.opendatakit.httpclientandroidlib.cookie.SetCookie;
import org.opendatakit.httpclientandroidlib.cookie.SetCookie2;
@Immutable
/* loaded from: classes.dex */
public class RFC2965VersionAttributeHandler implements CookieAttributeHandler {
    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public void parse(SetCookie cookie, String value) throws MalformedCookieException {
        int version;
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (value == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        try {
            version = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            version = -1;
        }
        if (version < 0) {
            throw new MalformedCookieException("Invalid cookie version.");
        }
        cookie.setVersion(version);
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if ((cookie instanceof SetCookie2) && (cookie instanceof ClientCookie) && !((ClientCookie) cookie).containsAttribute("version")) {
            throw new CookieRestrictionViolationException("Violates RFC 2965. Version attribute is required.");
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin origin) {
        return true;
    }
}
