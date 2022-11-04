package org.opendatakit.httpclientandroidlib.impl.cookie;

import java.util.Collection;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.cookie.CookieSpec;
import org.opendatakit.httpclientandroidlib.cookie.CookieSpecFactory;
import org.opendatakit.httpclientandroidlib.cookie.params.CookieSpecPNames;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@Immutable
/* loaded from: classes.dex */
public class RFC2109SpecFactory implements CookieSpecFactory {
    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieSpecFactory
    public CookieSpec newInstance(HttpParams params) {
        if (params != null) {
            String[] patterns = null;
            Collection<?> param = (Collection) params.getParameter(CookieSpecPNames.DATE_PATTERNS);
            if (param != null) {
                String[] patterns2 = new String[param.size()];
                patterns = (String[]) param.toArray(patterns2);
            }
            boolean singleHeader = params.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false);
            return new RFC2109Spec(patterns, singleHeader);
        }
        return new RFC2109Spec();
    }
}
