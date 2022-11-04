package e.m0.i;

import e.a0;
import e.d0;
import e.g0;
import e.h0;
import e.i0;
import e.k0;
import e.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes.dex */
public final class j implements a0 {

    /* renamed from: a */
    private final d0 f4166a;

    public j(d0 d0Var) {
        this.f4166a = d0Var;
    }

    private g0 b(i0 i0Var, @Nullable k0 k0Var) {
        String N;
        z C;
        if (i0Var != null) {
            int k = i0Var.k();
            String f2 = i0Var.m0().f();
            h0 h0Var = null;
            if (k == 307 || k == 308) {
                if (!f2.equals("GET") && !f2.equals("HEAD")) {
                    return null;
                }
            } else if (k == 401) {
                return this.f4166a.d().a(k0Var, i0Var);
            } else {
                if (k == 503) {
                    if ((i0Var.k0() != null && i0Var.k0().k() == 503) || f(i0Var, Integer.MAX_VALUE) != 0) {
                        return null;
                    }
                    return i0Var.m0();
                } else if (k == 407) {
                    if ((k0Var != null ? k0Var.b() : this.f4166a.x()).type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return this.f4166a.y().a(k0Var, i0Var);
                } else if (k == 408) {
                    if (!this.f4166a.B()) {
                        return null;
                    }
                    h0 a2 = i0Var.m0().a();
                    if (a2 != null && a2.g()) {
                        return null;
                    }
                    if ((i0Var.k0() != null && i0Var.k0().k() == 408) || f(i0Var, 0) > 0) {
                        return null;
                    }
                    return i0Var.m0();
                } else {
                    switch (k) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            }
            if (!this.f4166a.o() || (N = i0Var.N("Location")) == null || (C = i0Var.m0().i().C(N)) == null) {
                return null;
            }
            if (!C.D().equals(i0Var.m0().i().D()) && !this.f4166a.p()) {
                return null;
            }
            g0.a g2 = i0Var.m0().g();
            if (f.b(f2)) {
                boolean d2 = f.d(f2);
                if (f.c(f2)) {
                    g2.d("GET", null);
                } else {
                    if (d2) {
                        h0Var = i0Var.m0().a();
                    }
                    g2.d(f2, h0Var);
                }
                if (!d2) {
                    g2.e("Transfer-Encoding");
                    g2.e("Content-Length");
                    g2.e("Content-Type");
                }
            }
            if (!e.m0.e.C(i0Var.m0().i(), C)) {
                g2.e("Authorization");
            }
            g2.g(C);
            return g2.a();
        }
        throw new IllegalStateException();
    }

    private boolean c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private boolean d(IOException iOException, e.m0.h.k kVar, boolean z, g0 g0Var) {
        if (!this.f4166a.B()) {
            return false;
        }
        return (!z || !e(iOException, g0Var)) && c(iOException, z) && kVar.c();
    }

    private boolean e(IOException iOException, g0 g0Var) {
        h0 a2 = g0Var.a();
        return (a2 != null && a2.g()) || (iOException instanceof FileNotFoundException);
    }

    private int f(i0 i0Var, int i) {
        String N = i0Var.N("Retry-After");
        if (N == null) {
            return i;
        }
        if (!N.matches("\\d+")) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(N).intValue();
    }

    @Override // e.a0
    public i0 a(a0.a aVar) {
        e.m0.h.d f2;
        g0 b2;
        g0 a2 = aVar.a();
        g gVar = (g) aVar;
        e.m0.h.k h2 = gVar.h();
        i0 i0Var = null;
        int i = 0;
        while (true) {
            h2.m(a2);
            if (!h2.i()) {
                try {
                    try {
                        try {
                            i0 g2 = gVar.g(a2, h2, null);
                            if (i0Var != null) {
                                i0.a j0 = g2.j0();
                                i0.a j02 = i0Var.j0();
                                j02.b(null);
                                j0.n(j02.c());
                                g2 = j0.c();
                            }
                            i0Var = g2;
                            f2 = e.m0.c.f4060a.f(i0Var);
                            b2 = b(i0Var, f2 != null ? f2.c().q() : null);
                        } catch (IOException e2) {
                            if (!d(e2, h2, !(e2 instanceof e.m0.k.a), a2)) {
                                throw e2;
                            }
                        }
                    } catch (e.m0.h.i e3) {
                        if (!d(e3.f(), h2, false, a2)) {
                            throw e3.e();
                        }
                    }
                    if (b2 == null) {
                        if (f2 != null && f2.h()) {
                            h2.o();
                        }
                        return i0Var;
                    }
                    h0 a3 = b2.a();
                    if (a3 != null && a3.g()) {
                        return i0Var;
                    }
                    e.m0.e.e(i0Var.a());
                    if (h2.h()) {
                        f2.e();
                    }
                    i++;
                    if (i > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                    a2 = b2;
                } finally {
                    h2.f();
                }
            } else {
                throw new IOException("Canceled");
            }
        }
    }
}
