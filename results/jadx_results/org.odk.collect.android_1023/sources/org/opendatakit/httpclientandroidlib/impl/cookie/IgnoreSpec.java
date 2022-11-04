package org.opendatakit.httpclientandroidlib.impl.cookie;

import java.util.Collections;
import java.util.List;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
import org.opendatakit.httpclientandroidlib.cookie.CookieOrigin;
import org.opendatakit.httpclientandroidlib.cookie.MalformedCookieException;
@NotThreadSafe
/* loaded from: classes.dex */
public class IgnoreSpec extends CookieSpecBase {
    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieSpec
    public int getVersion() {
        return 0;
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException {
        return Collections.emptyList();
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> cookies) {
        return Collections.emptyList();
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieSpec
    public Header getVersionHeader() {
        return null;
    }
}
