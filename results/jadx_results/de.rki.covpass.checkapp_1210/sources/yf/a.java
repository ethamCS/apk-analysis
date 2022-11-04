package yf;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import hc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.y;
import org.conscrypt.BuildConfig;
import ub.u;
import zf.i;
import zf.j;
import zf.k;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0015"}, d2 = {"Lyf/a;", "Lyf/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Lof/y;", "protocols", "Ltb/e0;", "e", "h", BuildConfig.FLAVOR, "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbg/c;", "c", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a extends h {
    public static final C0462a Companion = new C0462a(null);

    /* renamed from: d */
    private static final boolean f26259d;

    /* renamed from: c */
    private final List<k> f26260c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lyf/a$a;", BuildConfig.FLAVOR, "Lyf/h;", "a", BuildConfig.FLAVOR, "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: yf.a$a */
    /* loaded from: classes3.dex */
    public static final class C0462a {
        private C0462a() {
        }

        public /* synthetic */ C0462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f26259d;
        }
    }

    static {
        f26259d = h.Companion.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List m10;
        m10 = u.m(zf.a.Companion.a(), new j(zf.f.Companion.d()), new j(i.Companion.a()), new j(zf.g.Companion.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (((k) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f26260c = arrayList;
    }

    @Override // yf.h
    public bg.c c(X509TrustManager x509TrustManager) {
        t.e(x509TrustManager, "trustManager");
        zf.b a10 = zf.b.Companion.a(x509TrustManager);
        return a10 == null ? super.c(x509TrustManager) : a10;
    }

    @Override // yf.h
    public void e(SSLSocket sSLSocket, String str, List<? extends y> list) {
        Object obj;
        t.e(sSLSocket, "sslSocket");
        t.e(list, "protocols");
        Iterator<T> it = this.f26260c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return;
        }
        kVar.d(sSLSocket, str, list);
    }

    @Override // yf.h
    public String h(SSLSocket sSLSocket) {
        Object obj;
        t.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f26260c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return null;
        }
        return kVar.b(sSLSocket);
    }

    @Override // yf.h
    @SuppressLint({"NewApi"})
    public boolean j(String str) {
        t.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
