package zf;

import hc.t;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import of.y;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, d2 = {"Lzf/j;", "Lzf/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "e", BuildConfig.FLAVOR, "c", "a", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lof/y;", "protocols", "Ltb/e0;", "d", "b", "Lzf/j$a;", "socketAdapterFactory", "<init>", "(Lzf/j$a;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a */
    private final a f26745a;

    /* renamed from: b */
    private k f26746b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lzf/j$a;", BuildConfig.FLAVOR, "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "a", "Lzf/k;", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        t.e(aVar, "socketAdapterFactory");
        this.f26745a = aVar;
    }

    private final synchronized k e(SSLSocket sSLSocket) {
        if (this.f26746b == null && this.f26745a.a(sSLSocket)) {
            this.f26746b = this.f26745a.b(sSLSocket);
        }
        return this.f26746b;
    }

    @Override // zf.k
    public boolean a(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        return this.f26745a.a(sSLSocket);
    }

    @Override // zf.k
    public String b(SSLSocket sSLSocket) {
        t.e(sSLSocket, "sslSocket");
        k e10 = e(sSLSocket);
        if (e10 == null) {
            return null;
        }
        return e10.b(sSLSocket);
    }

    @Override // zf.k
    public boolean c() {
        return true;
    }

    @Override // zf.k
    public void d(SSLSocket sSLSocket, String str, List<? extends y> list) {
        t.e(sSLSocket, "sslSocket");
        t.e(list, "protocols");
        k e10 = e(sSLSocket);
        if (e10 == null) {
            return;
        }
        e10.d(sSLSocket, str, list);
    }
}
