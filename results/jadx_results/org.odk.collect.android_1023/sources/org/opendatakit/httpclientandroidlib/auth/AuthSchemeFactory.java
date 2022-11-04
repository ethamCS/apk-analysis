package org.opendatakit.httpclientandroidlib.auth;

import org.opendatakit.httpclientandroidlib.params.HttpParams;
/* loaded from: classes.dex */
public interface AuthSchemeFactory {
    AuthScheme newInstance(HttpParams httpParams);
}
