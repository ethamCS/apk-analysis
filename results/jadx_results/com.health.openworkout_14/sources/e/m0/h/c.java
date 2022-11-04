package e.m0.h;

import e.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final List<p> f4086a;

    /* renamed from: b */
    private int f4087b = 0;

    /* renamed from: c */
    private boolean f4088c;

    /* renamed from: d */
    private boolean f4089d;

    public c(List<p> list) {
        this.f4086a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i = this.f4087b; i < this.f4086a.size(); i++) {
            if (this.f4086a.get(i).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public p a(SSLSocket sSLSocket) {
        p pVar;
        int i = this.f4087b;
        int size = this.f4086a.size();
        while (true) {
            if (i >= size) {
                pVar = null;
                break;
            }
            pVar = this.f4086a.get(i);
            i++;
            if (pVar.c(sSLSocket)) {
                this.f4087b = i;
                break;
            }
        }
        if (pVar != null) {
            this.f4088c = c(sSLSocket);
            e.m0.c.f4060a.c(pVar, sSLSocket, this.f4089d);
            return pVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f4089d + ", modes=" + this.f4086a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f4089d = true;
        if (this.f4088c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            return iOException instanceof SSLException;
        }
        return false;
    }
}
