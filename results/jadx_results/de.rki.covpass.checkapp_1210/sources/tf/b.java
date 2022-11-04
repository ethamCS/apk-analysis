package tf;

import hc.t;
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
import kotlin.Metadata;
import of.l;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Ltf/b;", BuildConfig.FLAVOR, "Ljavax/net/ssl/SSLSocket;", "socket", BuildConfig.FLAVOR, "c", "sslSocket", "Lof/l;", "a", "Ljava/io/IOException;", "e", "b", BuildConfig.FLAVOR, "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    private final List<l> f22230a;

    /* renamed from: b */
    private int f22231b;

    /* renamed from: c */
    private boolean f22232c;

    /* renamed from: d */
    private boolean f22233d;

    public b(List<l> list) {
        t.e(list, "connectionSpecs");
        this.f22230a = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int i10 = this.f22231b;
        int size = this.f22230a.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.f22230a.get(i10).e(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        t.e(sSLSocket, "sslSocket");
        int i10 = this.f22231b;
        int size = this.f22230a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            int i11 = i10 + 1;
            lVar = this.f22230a.get(i10);
            if (lVar.e(sSLSocket)) {
                this.f22231b = i11;
                break;
            }
            i10 = i11;
        }
        if (lVar != null) {
            this.f22232c = c(sSLSocket);
            lVar.c(sSLSocket, this.f22233d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f22233d);
        sb2.append(", modes=");
        sb2.append(this.f22230a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        t.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        t.d(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        t.e(iOException, "e");
        this.f22233d = true;
        return this.f22232c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }
}
