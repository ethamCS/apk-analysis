package tf;

import bf.q;
import bf.x;
import cg.d;
import eg.n;
import hc.t;
import hc.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.d0;
import of.l;
import of.r;
import of.s;
import of.u;
import of.y;
import of.z;
import org.conscrypt.BuildConfig;
import wf.f;
import wf.m;
@Metadata(bv = {}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001RB\u0017\u0012\u0006\u0010p\u001a\u00020o\u0012\u0006\u0010q\u001a\u00020\u001b¢\u0006\u0004\br\u0010sJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u001bH\u0016J\u0006\u0010;\u001a\u00020\u000bJ\b\u0010=\u001a\u00020<H\u0016J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016J\n\u0010H\u001a\u0004\u0018\u00010 H\u0016J'\u0010L\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020N2\b\u0010;\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016J\b\u0010T\u001a\u00020SH\u0016R\"\u0010U\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010O\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R#\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0a0`8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010X¨\u0006t"}, d2 = {"Ltf/f;", "Lwf/f$c;", "Lof/j;", BuildConfig.FLAVOR, "connectTimeout", "readTimeout", "writeTimeout", "Lof/e;", "call", "Lof/r;", "eventListener", "Ltb/e0;", "k", "i", "Ltf/b;", "connectionSpecSelector", "pingIntervalMillis", "n", "G", "j", "Lof/z;", "tunnelRequest", "Lof/u;", "url", "l", "m", BuildConfig.FLAVOR, "Lof/d0;", "candidates", BuildConfig.FLAVOR, "C", "H", "Lof/s;", "handshake", "f", "A", "()V", "z", "t", "connectionRetryEnabled", "g", "Lof/a;", "address", "routes", "u", "(Lof/a;Ljava/util/List;)Z", "Lof/x;", "client", "Luf/g;", "chain", "Luf/d;", "x", "(Lof/x;Luf/g;)Luf/d;", "Ltf/c;", "exchange", "Lcg/d$d;", "y", "(Ltf/c;)Lcg/d$d;", "B", "e", "Ljava/net/Socket;", "F", "doExtensiveChecks", "v", "Lwf/i;", "stream", "c", "Lwf/f;", "connection", "Lwf/m;", "settings", "b", "s", "failedRoute", "Ljava/io/IOException;", "failure", "h", "(Lof/x;Lof/d0;Ljava/io/IOException;)V", "Ltf/e;", "I", "(Ltf/e;Ljava/io/IOException;)V", "Lof/y;", "a", BuildConfig.FLAVOR, "toString", "noNewExchanges", "Z", "q", "()Z", "E", "(Z)V", "routeFailureCount", "r", "()I", "setRouteFailureCount$okhttp", "(I)V", BuildConfig.FLAVOR, "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "o", "()Ljava/util/List;", BuildConfig.FLAVOR, "idleAtNs", "J", "p", "()J", "D", "(J)V", "w", "isMultiplexed", "Ltf/g;", "connectionPool", "route", "<init>", "(Ltf/g;Lof/d0;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f extends f.c implements of.j {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private final g f22275b;

    /* renamed from: c */
    private final d0 f22276c;

    /* renamed from: d */
    private Socket f22277d;

    /* renamed from: e */
    private Socket f22278e;

    /* renamed from: f */
    private s f22279f;

    /* renamed from: g */
    private y f22280g;

    /* renamed from: h */
    private wf.f f22281h;

    /* renamed from: i */
    private eg.e f22282i;

    /* renamed from: j */
    private eg.d f22283j;

    /* renamed from: k */
    private boolean f22284k;

    /* renamed from: l */
    private boolean f22285l;

    /* renamed from: m */
    private int f22286m;

    /* renamed from: n */
    private int f22287n;

    /* renamed from: o */
    private int f22288o;

    /* renamed from: p */
    private int f22289p = 1;

    /* renamed from: q */
    private final List<Reference<tf.e>> f22290q = new ArrayList();

    /* renamed from: r */
    private long f22291r = Long.MAX_VALUE;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Ltf/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "IDLE_CONNECTION_HEALTHY_NS", "J", BuildConfig.FLAVOR, "MAX_TUNNEL_ATTEMPTS", "I", BuildConfig.FLAVOR, "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22292a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f22292a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends v implements gc.a<List<? extends Certificate>> {

        /* renamed from: c */
        final /* synthetic */ of.g f22293c;

        /* renamed from: d */
        final /* synthetic */ s f22294d;

        /* renamed from: q */
        final /* synthetic */ of.a f22295q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(of.g gVar, s sVar, of.a aVar) {
            super(0);
            this.f22293c = gVar;
            this.f22294d = sVar;
            this.f22295q = aVar;
        }

        @Override // gc.a
        public final List<? extends Certificate> invoke() {
            bg.c d10 = this.f22293c.d();
            t.b(d10);
            return d10.a(this.f22294d.d(), this.f22295q.l().h());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends v implements gc.a<List<? extends X509Certificate>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            f.this = r1;
        }

        @Override // gc.a
        public final List<? extends X509Certificate> invoke() {
            int s10;
            s sVar = f.this.f22279f;
            t.b(sVar);
            List<Certificate> d10 = sVar.d();
            s10 = ub.v.s(d10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (Certificate certificate : d10) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"tf/f$e", "Lcg/d$d;", "Ltb/e0;", "close", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class e extends d.AbstractC0092d {
        final /* synthetic */ tf.c U3;

        /* renamed from: x */
        final /* synthetic */ eg.e f22297x;

        /* renamed from: y */
        final /* synthetic */ eg.d f22298y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(eg.e eVar, eg.d dVar, tf.c cVar) {
            super(true, eVar, dVar);
            this.f22297x = eVar;
            this.f22298y = dVar;
            this.U3 = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.U3.a(-1L, true, true, null);
        }
    }

    public f(g gVar, d0 d0Var) {
        t.e(gVar, "connectionPool");
        t.e(d0Var, "route");
        this.f22275b = gVar;
        this.f22276c = d0Var;
    }

    private final boolean C(List<d0> list) {
        boolean z10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (d0 d0Var : list) {
                if (d0Var.b().type() == Proxy.Type.DIRECT && this.f22276c.b().type() == Proxy.Type.DIRECT && t.a(this.f22276c.d(), d0Var.d())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void G(int i10) {
        Socket socket = this.f22278e;
        t.b(socket);
        eg.e eVar = this.f22282i;
        t.b(eVar);
        eg.d dVar = this.f22283j;
        t.b(dVar);
        socket.setSoTimeout(0);
        wf.f a10 = new f.a(true, sf.e.f21693h).s(socket, this.f22276c.a().l().h(), eVar, dVar).k(this).l(i10).a();
        this.f22281h = a10;
        this.f22289p = wf.f.Companion.a().d();
        wf.f.v1(a10, false, null, 3, null);
    }

    private final boolean H(u uVar) {
        s sVar;
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        u l10 = this.f22276c.a().l();
        if (uVar.l() != l10.l()) {
            return false;
        }
        if (t.a(uVar.h(), l10.h())) {
            return true;
        }
        if (this.f22285l || (sVar = this.f22279f) == null) {
            return false;
        }
        t.b(sVar);
        return f(uVar, sVar);
    }

    private final boolean f(u uVar, s sVar) {
        List<Certificate> d10 = sVar.d();
        return (d10.isEmpty() ^ true) && bg.d.f6031a.e(uVar.h(), (X509Certificate) d10.get(0));
    }

    private final void i(int i10, int i11, of.e eVar, r rVar) {
        Socket socket;
        Proxy b10 = this.f22276c.b();
        of.a a10 = this.f22276c.a();
        Proxy.Type type = b10.type();
        int i12 = type == null ? -1 : b.f22292a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socket = a10.j().createSocket();
            t.b(socket);
        } else {
            socket = new Socket(b10);
        }
        this.f22277d = socket;
        rVar.j(eVar, this.f22276c.d(), b10);
        socket.setSoTimeout(i11);
        try {
            yf.h.Companion.g().f(socket, this.f22276c.d(), i10);
            try {
                this.f22282i = n.d(n.l(socket));
                this.f22283j = n.c(n.h(socket));
            } catch (NullPointerException e10) {
                if (t.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(t.l("Failed to connect to ", this.f22276c.d()));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void j(tf.b bVar) {
        Throwable th2;
        String h10;
        of.a a10 = this.f22276c.a();
        SSLSocketFactory k10 = a10.k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            t.b(k10);
            Socket createSocket = k10.createSocket(this.f22277d, a10.l().h(), a10.l().l(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                l a11 = bVar.a(sSLSocket2);
                if (a11.h()) {
                    yf.h.Companion.g().e(sSLSocket2, a10.l().h(), a10.f());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                s.a aVar = s.Companion;
                t.d(session, "sslSocketSession");
                s a12 = aVar.a(session);
                HostnameVerifier e10 = a10.e();
                t.b(e10);
                if (e10.verify(a10.l().h(), session)) {
                    of.g a13 = a10.a();
                    t.b(a13);
                    this.f22279f = new s(a12.e(), a12.a(), a12.c(), new c(a13, a12, a10));
                    a13.b(a10.l().h(), new d());
                    if (a11.h()) {
                        str = yf.h.Companion.g().h(sSLSocket2);
                    }
                    this.f22278e = sSLSocket2;
                    this.f22282i = n.d(n.l(sSLSocket2));
                    this.f22283j = n.c(n.h(sSLSocket2));
                    this.f22280g = str != null ? y.Companion.a(str) : y.HTTP_1_1;
                    yf.h.Companion.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> d10 = a12.d();
                if (!(!d10.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + a10.l().h() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) d10.get(0);
                h10 = q.h("\n              |Hostname " + a10.l().h() + " not verified:\n              |    certificate: " + of.g.Companion.a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + bg.d.f6031a.a(x509Certificate) + "\n              ", null, 1, null);
                throw new SSLPeerUnverifiedException(h10);
            } catch (Throwable th3) {
                th2 = th3;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    yf.h.Companion.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    pf.d.n(sSLSocket);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private final void k(int i10, int i11, int i12, of.e eVar, r rVar) {
        z m10 = m();
        u j10 = m10.j();
        int i13 = 0;
        while (i13 < 21) {
            i13++;
            i(i10, i11, eVar, rVar);
            m10 = l(i11, i12, m10, j10);
            if (m10 == null) {
                return;
            }
            Socket socket = this.f22277d;
            if (socket != null) {
                pf.d.n(socket);
            }
            this.f22277d = null;
            this.f22283j = null;
            this.f22282i = null;
            rVar.h(eVar, this.f22276c.d(), this.f22276c.b(), null);
        }
    }

    private final z l(int i10, int i11, z zVar, u uVar) {
        boolean v10;
        String str = "CONNECT " + pf.d.S(uVar, true) + " HTTP/1.1";
        while (true) {
            eg.e eVar = this.f22282i;
            t.b(eVar);
            eg.d dVar = this.f22283j;
            t.b(dVar);
            vf.b bVar = new vf.b(null, this, eVar, dVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.m().g(i10, timeUnit);
            dVar.m().g(i11, timeUnit);
            bVar.A(zVar.f(), str);
            bVar.c();
            b0.a g10 = bVar.g(false);
            t.b(g10);
            b0 c10 = g10.s(zVar).c();
            bVar.z(c10);
            int i12 = c10.i();
            if (i12 == 200) {
                if (eVar.c().g0() && dVar.c().g0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (i12 != 407) {
                throw new IOException(t.l("Unexpected response code for CONNECT: ", Integer.valueOf(c10.i())));
            } else {
                z a10 = this.f22276c.a().h().a(this.f22276c, c10);
                if (a10 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                v10 = x.v("close", b0.r(c10, "Connection", null, 2, null), true);
                if (v10) {
                    return a10;
                }
                zVar = a10;
            }
        }
    }

    private final z m() {
        z b10 = new z.a().m(this.f22276c.a().l()).f("CONNECT", null).d("Host", pf.d.S(this.f22276c.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.10.0").b();
        z a10 = this.f22276c.a().h().a(this.f22276c, new b0.a().s(b10).q(y.HTTP_1_1).g(407).n("Preemptive Authenticate").b(pf.d.f19190c).t(-1L).r(-1L).k("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 == null ? b10 : a10;
    }

    private final void n(tf.b bVar, int i10, of.e eVar, r rVar) {
        if (this.f22276c.a().k() != null) {
            rVar.C(eVar);
            j(bVar);
            rVar.B(eVar, this.f22279f);
            if (this.f22280g != y.HTTP_2) {
                return;
            }
            G(i10);
            return;
        }
        List<y> f10 = this.f22276c.a().f();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        if (!f10.contains(yVar)) {
            this.f22278e = this.f22277d;
            this.f22280g = y.HTTP_1_1;
            return;
        }
        this.f22278e = this.f22277d;
        this.f22280g = yVar;
        G(i10);
    }

    public final synchronized void A() {
        this.f22284k = true;
    }

    public d0 B() {
        return this.f22276c;
    }

    public final void D(long j10) {
        this.f22291r = j10;
    }

    public final void E(boolean z10) {
        this.f22284k = z10;
    }

    public Socket F() {
        Socket socket = this.f22278e;
        t.b(socket);
        return socket;
    }

    public final synchronized void I(tf.e eVar, IOException iOException) {
        int i10;
        t.e(eVar, "call");
        if (iOException instanceof wf.n) {
            if (((wf.n) iOException).f25078c == wf.b.REFUSED_STREAM) {
                int i11 = this.f22288o + 1;
                this.f22288o = i11;
                if (i11 > 1) {
                    this.f22284k = true;
                    i10 = this.f22286m;
                    this.f22286m = i10 + 1;
                }
            } else if (((wf.n) iOException).f25078c != wf.b.CANCEL || !eVar.G()) {
                this.f22284k = true;
                i10 = this.f22286m;
                this.f22286m = i10 + 1;
            }
        } else if (!w() || (iOException instanceof wf.a)) {
            this.f22284k = true;
            if (this.f22287n == 0) {
                if (iOException != null) {
                    h(eVar.k(), this.f22276c, iOException);
                }
                i10 = this.f22286m;
                this.f22286m = i10 + 1;
            }
        }
    }

    @Override // of.j
    public y a() {
        y yVar = this.f22280g;
        t.b(yVar);
        return yVar;
    }

    @Override // wf.f.c
    public synchronized void b(wf.f fVar, m mVar) {
        t.e(fVar, "connection");
        t.e(mVar, "settings");
        this.f22289p = mVar.d();
    }

    @Override // wf.f.c
    public void c(wf.i iVar) {
        t.e(iVar, "stream");
        iVar.d(wf.b.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.f22277d;
        if (socket == null) {
            return;
        }
        pf.d.n(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00fd, blocks: (B:20:0x009a, B:22:0x00a2), top: B:62:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e A[EDGE_INSN: B:66:0x014e->B:55:0x014e ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, of.e r22, of.r r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.f.g(int, int, int, int, boolean, of.e, of.r):void");
    }

    public final void h(of.x xVar, d0 d0Var, IOException iOException) {
        t.e(xVar, "client");
        t.e(d0Var, "failedRoute");
        t.e(iOException, "failure");
        if (d0Var.b().type() != Proxy.Type.DIRECT) {
            of.a a10 = d0Var.a();
            a10.i().connectFailed(a10.l().q(), d0Var.b().address(), iOException);
        }
        xVar.x().b(d0Var);
    }

    public final List<Reference<tf.e>> o() {
        return this.f22290q;
    }

    public final long p() {
        return this.f22291r;
    }

    public final boolean q() {
        return this.f22284k;
    }

    public final int r() {
        return this.f22286m;
    }

    public s s() {
        return this.f22279f;
    }

    public final synchronized void t() {
        this.f22287n++;
    }

    public String toString() {
        of.i a10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f22276c.a().l().h());
        sb2.append(':');
        sb2.append(this.f22276c.a().l().l());
        sb2.append(", proxy=");
        sb2.append(this.f22276c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f22276c.d());
        sb2.append(" cipherSuite=");
        s sVar = this.f22279f;
        Object obj = "none";
        if (sVar != null && (a10 = sVar.a()) != null) {
            obj = a10;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f22280g);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(of.a aVar, List<d0> list) {
        t.e(aVar, "address");
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        } else if (this.f22290q.size() >= this.f22289p || this.f22284k || !this.f22276c.a().d(aVar)) {
            return false;
        } else {
            if (t.a(aVar.l().h(), B().a().l().h())) {
                return true;
            }
            if (this.f22281h == null || list == null || !C(list) || aVar.e() != bg.d.f6031a || !H(aVar.l())) {
                return false;
            }
            try {
                of.g a10 = aVar.a();
                t.b(a10);
                String h10 = aVar.l().h();
                s s10 = s();
                t.b(s10);
                a10.a(h10, s10.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean v(boolean z10) {
        long p10;
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f22277d;
        t.b(socket);
        Socket socket2 = this.f22278e;
        t.b(socket2);
        eg.e eVar = this.f22282i;
        t.b(eVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        wf.f fVar = this.f22281h;
        if (fVar != null) {
            return fVar.f1(nanoTime);
        }
        synchronized (this) {
            p10 = nanoTime - p();
        }
        if (p10 >= 10000000000L && z10) {
            return pf.d.G(socket2, eVar);
        }
        return true;
    }

    public final boolean w() {
        return this.f22281h != null;
    }

    public final uf.d x(of.x xVar, uf.g gVar) {
        t.e(xVar, "client");
        t.e(gVar, "chain");
        Socket socket = this.f22278e;
        t.b(socket);
        eg.e eVar = this.f22282i;
        t.b(eVar);
        eg.d dVar = this.f22283j;
        t.b(dVar);
        wf.f fVar = this.f22281h;
        if (fVar != null) {
            return new wf.g(xVar, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.l());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eVar.m().g(gVar.i(), timeUnit);
        dVar.m().g(gVar.k(), timeUnit);
        return new vf.b(xVar, this, eVar, dVar);
    }

    public final d.AbstractC0092d y(tf.c cVar) {
        t.e(cVar, "exchange");
        Socket socket = this.f22278e;
        t.b(socket);
        eg.e eVar = this.f22282i;
        t.b(eVar);
        eg.d dVar = this.f22283j;
        t.b(dVar);
        socket.setSoTimeout(0);
        A();
        return new e(eVar, dVar, cVar);
    }

    public final synchronized void z() {
        this.f22285l = true;
    }
}
