package org.opendatakit.httpclientandroidlib.conn.ssl;

import javax.net.ssl.SSLException;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
@Immutable
/* loaded from: classes.dex */
public class BrowserCompatHostnameVerifier extends AbstractVerifier {
    @Override // org.opendatakit.httpclientandroidlib.conn.ssl.X509HostnameVerifier
    public final void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
        verify(host, cns, subjectAlts, false);
    }

    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }
}
