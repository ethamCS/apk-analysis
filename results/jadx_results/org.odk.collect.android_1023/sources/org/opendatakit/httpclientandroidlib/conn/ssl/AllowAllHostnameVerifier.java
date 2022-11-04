package org.opendatakit.httpclientandroidlib.conn.ssl;

import org.opendatakit.httpclientandroidlib.annotation.Immutable;
@Immutable
/* loaded from: classes.dex */
public class AllowAllHostnameVerifier extends AbstractVerifier {
    @Override // org.opendatakit.httpclientandroidlib.conn.ssl.X509HostnameVerifier
    public final void verify(String host, String[] cns, String[] subjectAlts) {
    }

    public final String toString() {
        return "ALLOW_ALL";
    }
}
