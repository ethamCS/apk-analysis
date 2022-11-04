package uf;

import hc.t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.a0;
import of.b0;
import of.d0;
import of.u;
import of.v;
import of.x;
import of.z;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001e"}, d2 = {"Luf/j;", "Lof/v;", "Ljava/io/IOException;", "e", "Ltf/e;", "call", "Lof/z;", "userRequest", BuildConfig.FLAVOR, "requestSendStarted", "f", "d", "Lof/b0;", "userResponse", "Ltf/c;", "exchange", "c", BuildConfig.FLAVOR, "method", "b", BuildConfig.FLAVOR, "defaultDelay", "g", "Lof/v$a;", "chain", "a", "Lof/x;", "client", "<init>", "(Lof/x;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j implements v {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final x f23625a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Luf/j$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(x xVar) {
        t.e(xVar, "client");
        this.f23625a = xVar;
    }

    private final z b(b0 b0Var, String str) {
        String r10;
        u o10;
        a0 a0Var = null;
        if (!this.f23625a.v() || (r10 = b0.r(b0Var, "Location", null, 2, null)) == null || (o10 = b0Var.W().j().o(r10)) == null) {
            return null;
        }
        if (!t.a(o10.p(), b0Var.W().j().p()) && !this.f23625a.w()) {
            return null;
        }
        z.a i10 = b0Var.W().i();
        if (f.b(str)) {
            int i11 = b0Var.i();
            f fVar = f.f23611a;
            boolean z10 = fVar.d(str) || i11 == 308 || i11 == 307;
            if (fVar.c(str) && i11 != 308 && i11 != 307) {
                str = "GET";
            } else if (z10) {
                a0Var = b0Var.W().a();
            }
            i10.f(str, a0Var);
            if (!z10) {
                i10.g("Transfer-Encoding");
                i10.g("Content-Length");
                i10.g("Content-Type");
            }
        }
        if (!pf.d.j(b0Var.W().j(), o10)) {
            i10.g("Authorization");
        }
        return i10.m(o10).b();
    }

    private final z c(b0 b0Var, tf.c cVar) {
        tf.f h10;
        d0 B = (cVar == null || (h10 = cVar.h()) == null) ? null : h10.B();
        int i10 = b0Var.i();
        String h11 = b0Var.W().h();
        if (i10 != 307 && i10 != 308) {
            if (i10 == 401) {
                return this.f23625a.f().a(B, b0Var);
            }
            if (i10 == 421) {
                a0 a10 = b0Var.W().a();
                if ((a10 != null && a10.d()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().z();
                return b0Var.W();
            } else if (i10 == 503) {
                b0 G = b0Var.G();
                if ((G != null && G.i() == 503) || g(b0Var, Integer.MAX_VALUE) != 0) {
                    return null;
                }
                return b0Var.W();
            } else if (i10 == 407) {
                t.b(B);
                if (B.b().type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.f23625a.J().a(B, b0Var);
            } else if (i10 == 408) {
                if (!this.f23625a.M()) {
                    return null;
                }
                a0 a11 = b0Var.W().a();
                if (a11 != null && a11.d()) {
                    return null;
                }
                b0 G2 = b0Var.G();
                if ((G2 != null && G2.i() == 408) || g(b0Var, 0) > 0) {
                    return null;
                }
                return b0Var.W();
            } else {
                switch (i10) {
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
        return b(b0Var, h11);
    }

    private final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private final boolean e(IOException iOException, tf.e eVar, z zVar, boolean z10) {
        if (!this.f23625a.M()) {
            return false;
        }
        return (!z10 || !f(iOException, zVar)) && d(iOException, z10) && eVar.B();
    }

    private final boolean f(IOException iOException, z zVar) {
        a0 a10 = zVar.a();
        return (a10 != null && a10.d()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(b0 b0Var, int i10) {
        String r10 = b0.r(b0Var, "Retry-After", null, 2, null);
        if (r10 == null) {
            return i10;
        }
        if (!new bf.k("\\d+").h(r10)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(r10);
        t.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // of.v
    public b0 a(v.a aVar) {
        List h10;
        IOException e10;
        tf.c p10;
        z c10;
        t.e(aVar, "chain");
        g gVar = (g) aVar;
        z j10 = gVar.j();
        tf.e f10 = gVar.f();
        h10 = ub.u.h();
        boolean z10 = true;
        boolean z11 = false;
        b0 b0Var = null;
        boolean z12 = z10;
        int i10 = z11;
        while (true) {
            f10.i(j10, z12);
            try {
                if (f10.G()) {
                    throw new IOException("Canceled");
                }
                try {
                    b0 a10 = gVar.a(j10);
                    if (b0Var != null) {
                        a10 = a10.B().p(b0Var.B().b(null).c()).c();
                    }
                    b0Var = a10;
                    p10 = f10.p();
                    c10 = c(b0Var, p10);
                } catch (IOException e11) {
                    e10 = e11;
                    if (!e(e10, f10, j10, !(e10 instanceof wf.a) ? z10 : z11)) {
                        throw pf.d.a0(e10, h10);
                    }
                    h10 = c0.p0(h10, e10);
                    f10.j(z10);
                    z12 = z11;
                } catch (tf.i e12) {
                    if (!e(e12.e(), f10, j10, z11)) {
                        throw pf.d.a0(e12.c(), h10);
                    }
                    e10 = e12.c();
                    h10 = c0.p0(h10, e10);
                    f10.j(z10);
                    z12 = z11;
                }
                if (c10 == null) {
                    if (p10 != null && p10.l()) {
                        f10.D();
                    }
                    return b0Var;
                }
                a0 a11 = c10.a();
                if (a11 != null && a11.d()) {
                    return b0Var;
                }
                of.c0 b10 = b0Var.b();
                if (b10 != null) {
                    pf.d.m(b10);
                }
                i10 = (i10 == true ? 1 : 0) + 1;
                if (i10 > 20) {
                    throw new ProtocolException(t.l("Too many follow-up requests: ", Integer.valueOf(i10)));
                }
                f10.j(z10);
                j10 = c10;
                z12 = z10;
            } finally {
                f10.j(z10);
            }
        }
    }
}
