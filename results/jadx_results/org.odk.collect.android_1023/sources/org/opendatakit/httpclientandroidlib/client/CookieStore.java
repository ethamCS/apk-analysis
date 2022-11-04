package org.opendatakit.httpclientandroidlib.client;

import java.util.Date;
import java.util.List;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
/* loaded from: classes.dex */
public interface CookieStore {
    void addCookie(Cookie cookie);

    void clear();

    boolean clearExpired(Date date);

    List<Cookie> getCookies();
}
