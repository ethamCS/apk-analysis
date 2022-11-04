package org.opendatakit.httpclientandroidlib.impl.cookie;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.cookie.MalformedCookieException;
import org.opendatakit.httpclientandroidlib.cookie.SetCookie;
@Immutable
/* loaded from: classes.dex */
public class BasicExpiresHandler extends AbstractCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] datepatterns) {
        if (datepatterns == null) {
            throw new IllegalArgumentException("Array of date patterns may not be null");
        }
        this.datepatterns = datepatterns;
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public void parse(SetCookie cookie, String value) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (value == null) {
            throw new MalformedCookieException("Missing value for expires attribute");
        }
        try {
            cookie.setExpiryDate(DateUtils.parseDate(value, this.datepatterns));
        } catch (DateParseException e) {
            throw new MalformedCookieException("Unable to parse expires attribute: " + value);
        }
    }
}
