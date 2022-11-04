package org.opendatakit.httpclientandroidlib.impl.auth;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.auth.AuthScheme;
import org.opendatakit.httpclientandroidlib.auth.AuthSchemeFactory;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@Immutable
/* loaded from: classes.dex */
public class BasicSchemeFactory implements AuthSchemeFactory {
    @Override // org.opendatakit.httpclientandroidlib.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams params) {
        return new BasicScheme();
    }
}
