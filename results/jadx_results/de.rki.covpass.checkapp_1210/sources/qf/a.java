package qf;

import bf.x;
import hc.t;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b;
import of.b0;
import of.d0;
import of.h;
import of.o;
import of.q;
import of.u;
import of.z;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lqf/a;", "Lof/b;", "Ljava/net/Proxy;", "Lof/u;", "url", "Lof/q;", "dns", "Ljava/net/InetAddress;", "b", "Lof/d0;", "route", "Lof/b0;", "response", "Lof/z;", "a", "defaultDns", "<init>", "(Lof/q;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: c */
    private final q f19901c;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: qf.a$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0327a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19902a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f19902a = iArr;
        }
    }

    public a(q qVar) {
        t.e(qVar, "defaultDns");
        this.f19901c = qVar;
    }

    public /* synthetic */ a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f18286a : qVar);
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Object V;
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0327a.f19902a[type.ordinal()]) == 1) {
            V = c0.V(qVar.a(uVar.h()));
            return (InetAddress) V;
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        t.d(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    @Override // of.b
    public z a(d0 d0Var, b0 b0Var) {
        boolean v10;
        PasswordAuthentication passwordAuthentication;
        of.a a10;
        t.e(b0Var, "response");
        List<h> h10 = b0Var.h();
        z W = b0Var.W();
        u j10 = W.j();
        boolean z10 = b0Var.i() == 407;
        Proxy b10 = d0Var == null ? null : d0Var.b();
        if (b10 == null) {
            b10 = Proxy.NO_PROXY;
        }
        for (h hVar : h10) {
            v10 = x.v("Basic", hVar.c(), true);
            if (v10) {
                q c10 = (d0Var == null || (a10 = d0Var.a()) == null) ? null : a10.c();
                if (c10 == null) {
                    c10 = this.f19901c;
                }
                if (z10) {
                    SocketAddress address = b10.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    t.d(b10, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(b10, j10, c10), inetSocketAddress.getPort(), j10.p(), hVar.b(), hVar.c(), j10.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String h11 = j10.h();
                    t.d(b10, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(h11, b(b10, j10, c10), j10.l(), j10.p(), hVar.b(), hVar.c(), j10.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    t.d(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    t.d(password, "auth.password");
                    return W.i().d(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }
}
