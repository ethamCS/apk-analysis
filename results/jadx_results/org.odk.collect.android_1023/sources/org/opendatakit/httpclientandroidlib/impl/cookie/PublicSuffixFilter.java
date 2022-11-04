package org.opendatakit.httpclientandroidlib.impl.cookie;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.javarosa.core.model.instance.TreeReference;
import org.opendatakit.httpclientandroidlib.client.utils.Punycode;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
import org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler;
import org.opendatakit.httpclientandroidlib.cookie.CookieOrigin;
import org.opendatakit.httpclientandroidlib.cookie.MalformedCookieException;
import org.opendatakit.httpclientandroidlib.cookie.SetCookie;
/* loaded from: classes.dex */
public class PublicSuffixFilter implements CookieAttributeHandler {
    private Set<String> exceptions;
    private Set<String> suffixes;
    private final CookieAttributeHandler wrapped;

    public PublicSuffixFilter(CookieAttributeHandler wrapped) {
        this.wrapped = wrapped;
    }

    public void setPublicSuffixes(Collection<String> suffixes) {
        this.suffixes = new HashSet(suffixes);
    }

    public void setExceptions(Collection<String> exceptions) {
        this.exceptions = new HashSet(exceptions);
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin origin) {
        if (isForPublicSuffix(cookie)) {
            return false;
        }
        return this.wrapped.match(cookie, origin);
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public void parse(SetCookie cookie, String value) throws MalformedCookieException {
        this.wrapped.parse(cookie, value);
    }

    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
        this.wrapped.validate(cookie, origin);
    }

    private boolean isForPublicSuffix(Cookie cookie) {
        String domain = cookie.getDomain();
        if (domain.startsWith(".")) {
            domain = domain.substring(1);
        }
        String domain2 = Punycode.toUnicode(domain);
        if ((this.exceptions == null || !this.exceptions.contains(domain2)) && this.suffixes != null) {
            while (!this.suffixes.contains(domain2)) {
                if (domain2.startsWith("*.")) {
                    domain2 = domain2.substring(2);
                }
                int nextdot = domain2.indexOf(46);
                if (nextdot == -1) {
                    return false;
                }
                domain2 = TreeReference.NAME_WILDCARD + domain2.substring(nextdot);
                if (domain2.length() <= 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
