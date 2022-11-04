package e.m0.l;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import e.e0;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class a extends b {
    a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    @Nullable
    public static f t() {
        try {
            if (b.u() < 29) {
                return null;
            }
            return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    private void v(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // e.m0.l.b, e.m0.l.f
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        v(sSLSocket);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) f.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // e.m0.l.b, e.m0.l.f
    @Nullable
    @IgnoreJRERequirement
    public String l(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
