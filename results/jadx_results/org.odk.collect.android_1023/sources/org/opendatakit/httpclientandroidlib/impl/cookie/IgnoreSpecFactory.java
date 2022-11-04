package org.opendatakit.httpclientandroidlib.impl.cookie;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.cookie.CookieSpec;
import org.opendatakit.httpclientandroidlib.cookie.CookieSpecFactory;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@Immutable
/* loaded from: classes.dex */
public class IgnoreSpecFactory implements CookieSpecFactory {
    @Override // org.opendatakit.httpclientandroidlib.cookie.CookieSpecFactory
    public CookieSpec newInstance(HttpParams params) {
        return new IgnoreSpec();
    }
}
