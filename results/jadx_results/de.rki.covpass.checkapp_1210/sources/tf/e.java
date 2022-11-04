package tf;

import hc.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import of.p;
import of.r;
import of.u;
import of.x;
import of.z;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0002UVB\u001f\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010:\u001a\u00020\u0019\u0012\u0006\u0010>\u001a\u00020\u0011¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000f\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"J;\u0010(\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b*\u0010\u0007J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u0002J\u0017\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0011H\u0000¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0011J\u000f\u00103\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010G\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010H\u001a\u0004\bI\u0010JR(\u0010K\u001a\u0004\u0018\u00010\u001f2\b\u0010G\u001a\u0004\u0018\u00010\u001f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010O\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010H\u001a\u0004\bP\u0010J\"\u0004\bQ\u0010R¨\u0006W"}, d2 = {"Ltf/e;", "Lof/e;", "Ltb/e0;", "f", "Ljava/io/IOException;", "E", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "Lof/u;", "url", "Lof/a;", "h", BuildConfig.FLAVOR, "F", "g", "cancel", BuildConfig.FLAVOR, "G", "Lof/f;", "responseCallback", "r", "Lof/b0;", "t", "()Lof/b0;", "Lof/z;", "request", "newExchangeFinder", "i", "Luf/g;", "chain", "Ltf/c;", "v", "(Luf/g;)Ltf/c;", "Ltf/f;", "connection", "d", "exchange", "requestDone", "responseDone", "w", "(Ltf/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "x", "Ljava/net/Socket;", "A", "()Ljava/net/Socket;", "D", "closeExchange", "j", "(Z)V", "B", "y", "()Ljava/lang/String;", "Lof/x;", "client", "Lof/x;", "k", "()Lof/x;", "originalRequest", "Lof/z;", "q", "()Lof/z;", "forWebSocket", "Z", "o", "()Z", "Lof/r;", "eventListener", "Lof/r;", "m", "()Lof/r;", "<set-?>", "Ltf/f;", "l", "()Ltf/f;", "interceptorScopedExchange", "Ltf/c;", "p", "()Ltf/c;", "connectionToCancel", "getConnectionToCancel", "C", "(Ltf/f;)V", "<init>", "(Lof/x;Lof/z;Z)V", "a", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e implements of.e {
    private final c U3;
    private Object W3;
    private d X3;
    private f Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private tf.c f22258a4;

    /* renamed from: b4 */
    private boolean f22259b4;

    /* renamed from: c */
    private final x f22260c;

    /* renamed from: c4 */
    private boolean f22261c4;

    /* renamed from: d */
    private final z f22262d;

    /* renamed from: e4 */
    private volatile boolean f22264e4;

    /* renamed from: f4 */
    private volatile tf.c f22265f4;

    /* renamed from: g4 */
    private volatile f f22266g4;

    /* renamed from: q */
    private final boolean f22267q;

    /* renamed from: x */
    private final g f22268x;

    /* renamed from: y */
    private final r f22269y;
    private final AtomicBoolean V3 = new AtomicBoolean();

    /* renamed from: d4 */
    private boolean f22263d4 = true;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Ltf/e$a;", "Ljava/lang/Runnable;", "Ltf/e;", "other", "Ltb/e0;", "e", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", BuildConfig.FLAVOR, "d", "()Ljava/lang/String;", "host", "b", "()Ltf/e;", "call", "Lof/f;", "responseCallback", "<init>", "(Ltf/e;Lof/f;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: c */
        private final of.f f22270c;

        /* renamed from: d */
        private volatile AtomicInteger f22271d = new AtomicInteger(0);

        /* renamed from: q */
        final /* synthetic */ e f22272q;

        public a(e eVar, of.f fVar) {
            t.e(eVar, "this$0");
            t.e(fVar, "responseCallback");
            this.f22272q = eVar;
            this.f22270c = fVar;
        }

        public final void a(ExecutorService executorService) {
            t.e(executorService, "executorService");
            p p10 = this.f22272q.k().p();
            if (pf.d.f19195h && Thread.holdsLock(p10)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + p10);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f22272q.x(interruptedIOException);
                    this.f22270c.b(this.f22272q, interruptedIOException);
                    this.f22272q.k().p().e(this);
                }
            } catch (Throwable th2) {
                this.f22272q.k().p().e(this);
                throw th2;
            }
        }

        public final e b() {
            return this.f22272q;
        }

        public final AtomicInteger c() {
            return this.f22271d;
        }

        public final String d() {
            return this.f22272q.q().j().h();
        }

        public final void e(a aVar) {
            t.e(aVar, "other");
            this.f22271d = aVar.f22271d;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            IOException e10;
            p p10;
            Throwable th2;
            String l10 = t.l("OkHttp ", this.f22272q.y());
            e eVar = this.f22272q;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(l10);
            try {
                eVar.U3.t();
                try {
                    z10 = true;
                    try {
                        this.f22270c.a(eVar, eVar.t());
                        p10 = eVar.k().p();
                    } catch (IOException e11) {
                        e10 = e11;
                        if (z10) {
                            yf.h.Companion.g().k(t.l("Callback failure for ", eVar.F()), 4, e10);
                        } else {
                            this.f22270c.b(eVar, e10);
                        }
                        p10 = eVar.k().p();
                        p10.e(this);
                    } catch (Throwable th3) {
                        th2 = th3;
                        eVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException(t.l("canceled due to ", th2));
                            tb.f.a(iOException, th2);
                            this.f22270c.b(eVar, iOException);
                        }
                        throw th2;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th2 = th4;
                }
                p10.e(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Ltf/e$b;", "Ljava/lang/ref/WeakReference;", "Ltf/e;", BuildConfig.FLAVOR, "callStackTrace", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "referent", "<init>", "(Ltf/e;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a */
        private final Object f22273a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            t.e(eVar, "referent");
            this.f22273a = obj;
        }

        public final Object a() {
            return this.f22273a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"tf/e$c", "Leg/a;", "Ltb/e0;", "z", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c extends eg.a {
        c() {
            e.this = r1;
        }

        @Override // eg.a
        protected void z() {
            e.this.cancel();
        }
    }

    public e(x xVar, z zVar, boolean z10) {
        t.e(xVar, "client");
        t.e(zVar, "originalRequest");
        this.f22260c = xVar;
        this.f22262d = zVar;
        this.f22267q = z10;
        this.f22268x = xVar.l().b();
        this.f22269y = xVar.t().a(this);
        c cVar = new c();
        cVar.g(k().h(), TimeUnit.MILLISECONDS);
        this.U3 = cVar;
    }

    private final <E extends IOException> E E(E e10) {
        if (!this.Z3 && this.U3.u()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
            return interruptedIOException;
        }
        return e10;
    }

    public final String F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G() ? "canceled " : BuildConfig.FLAVOR);
        sb2.append(this.f22267q ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(y());
        return sb2.toString();
    }

    private final <E extends IOException> E e(E e10) {
        Socket A;
        boolean z10 = pf.d.f19195h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        f fVar = this.Y3;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                A = A();
            }
            if (this.Y3 == null) {
                if (A != null) {
                    pf.d.n(A);
                }
                this.f22269y.l(this, fVar);
            } else {
                if (!(A == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) E(e10);
        if (e10 != null) {
            r rVar = this.f22269y;
            t.b(e11);
            rVar.e(this, e11);
        } else {
            this.f22269y.d(this);
        }
        return e11;
    }

    private final void f() {
        this.W3 = yf.h.Companion.g().i("response.body().close()");
        this.f22269y.f(this);
    }

    private final of.a h(u uVar) {
        of.g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (uVar.i()) {
            SSLSocketFactory O = this.f22260c.O();
            hostnameVerifier = this.f22260c.y();
            sSLSocketFactory = O;
            gVar = this.f22260c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new of.a(uVar.h(), uVar.l(), this.f22260c.q(), this.f22260c.N(), sSLSocketFactory, hostnameVerifier, gVar, this.f22260c.J(), this.f22260c.I(), this.f22260c.H(), this.f22260c.m(), this.f22260c.K());
    }

    public final Socket A() {
        f fVar = this.Y3;
        t.b(fVar);
        if (pf.d.f19195h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> o10 = fVar.o();
        Iterator<Reference<e>> it = o10.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (t.a(it.next().get(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Check failed.".toString());
        }
        o10.remove(i10);
        this.Y3 = null;
        if (o10.isEmpty()) {
            fVar.D(System.nanoTime());
            if (this.f22268x.c(fVar)) {
                return fVar.F();
            }
        }
        return null;
    }

    public final boolean B() {
        d dVar = this.X3;
        t.b(dVar);
        return dVar.e();
    }

    public final void C(f fVar) {
        this.f22266g4 = fVar;
    }

    public final void D() {
        if (!this.Z3) {
            this.Z3 = true;
            this.U3.u();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // of.e
    public boolean G() {
        return this.f22264e4;
    }

    @Override // of.e
    public void cancel() {
        if (this.f22264e4) {
            return;
        }
        this.f22264e4 = true;
        tf.c cVar = this.f22265f4;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f22266g4;
        if (fVar != null) {
            fVar.e();
        }
        this.f22269y.g(this);
    }

    public final void d(f fVar) {
        t.e(fVar, "connection");
        if (!pf.d.f19195h || Thread.holdsLock(fVar)) {
            if (!(this.Y3 == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.Y3 = fVar;
            fVar.o().add(new b(this, this.W3));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
    }

    /* renamed from: g */
    public e clone() {
        return new e(this.f22260c, this.f22262d, this.f22267q);
    }

    public final void i(z zVar, boolean z10) {
        t.e(zVar, "request");
        if (this.f22258a4 == null) {
            synchronized (this) {
                if (!(!this.f22261c4)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(!this.f22259b4)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                e0 e0Var = e0.f22152a;
            }
            if (!z10) {
                return;
            }
            this.X3 = new d(this.f22268x, h(zVar.j()), this, this.f22269y);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void j(boolean z10) {
        tf.c cVar;
        synchronized (this) {
            if (!this.f22263d4) {
                throw new IllegalStateException("released".toString());
            }
            e0 e0Var = e0.f22152a;
        }
        if (z10 && (cVar = this.f22265f4) != null) {
            cVar.d();
        }
        this.f22258a4 = null;
    }

    public final x k() {
        return this.f22260c;
    }

    public final f l() {
        return this.Y3;
    }

    public final r m() {
        return this.f22269y;
    }

    public final boolean o() {
        return this.f22267q;
    }

    public final tf.c p() {
        return this.f22258a4;
    }

    public final z q() {
        return this.f22262d;
    }

    @Override // of.e
    public void r(of.f fVar) {
        t.e(fVar, "responseCallback");
        if (this.V3.compareAndSet(false, true)) {
            f();
            this.f22260c.p().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final of.b0 t() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            of.x r0 = r11.f22260c
            java.util.List r0 = r0.A()
            ub.s.x(r2, r0)
            uf.j r0 = new uf.j
            of.x r1 = r11.f22260c
            r0.<init>(r1)
            r2.add(r0)
            uf.a r0 = new uf.a
            of.x r1 = r11.f22260c
            of.n r1 = r1.o()
            r0.<init>(r1)
            r2.add(r0)
            rf.a r0 = new rf.a
            of.x r1 = r11.f22260c
            of.c r1 = r1.g()
            r0.<init>(r1)
            r2.add(r0)
            tf.a r0 = tf.a.f22229a
            r2.add(r0)
            boolean r0 = r11.f22267q
            if (r0 != 0) goto L46
            of.x r0 = r11.f22260c
            java.util.List r0 = r0.C()
            ub.s.x(r2, r0)
        L46:
            uf.b r0 = new uf.b
            boolean r1 = r11.f22267q
            r0.<init>(r1)
            r2.add(r0)
            uf.g r9 = new uf.g
            r3 = 0
            r4 = 0
            of.z r5 = r11.f22262d
            of.x r0 = r11.f22260c
            int r6 = r0.k()
            of.x r0 = r11.f22260c
            int r7 = r0.L()
            of.x r0 = r11.f22260c
            int r8 = r0.Q()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            of.z r2 = r11.f22262d     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            of.b0 r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.G()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.x(r1)
            return r2
        L7f:
            pf.d.m(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.x(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        La1:
            if (r0 != 0) goto La6
            r11.x(r1)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.e.t():of.b0");
    }

    public final tf.c v(uf.g gVar) {
        t.e(gVar, "chain");
        synchronized (this) {
            if (!this.f22263d4) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f22261c4)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f22259b4)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            e0 e0Var = e0.f22152a;
        }
        d dVar = this.X3;
        t.b(dVar);
        tf.c cVar = new tf.c(this, this.f22269y, dVar, dVar.a(this.f22260c, gVar));
        this.f22258a4 = cVar;
        this.f22265f4 = cVar;
        synchronized (this) {
            this.f22259b4 = true;
            this.f22261c4 = true;
        }
        if (!this.f22264e4) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:14:0x001b, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042), top: B:45:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:14:0x001b, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042), top: B:45:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E w(tf.c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            hc.t.e(r2, r0)
            tf.c r0 = r1.f22265f4
            boolean r2 = hc.t.a(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f22259b4     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L5a
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f22261c4     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f22259b4 = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f22261c4 = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f22259b4     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f22261c4     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f22261c4     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f22263d4     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            tb.e0 r4 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r2 = 0
            r1.f22265f4 = r2
            tf.f r2 = r1.Y3
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            r2.t()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r1.e(r5)
            return r2
        L59:
            return r5
        L5a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.e.w(tf.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException x(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f22263d4) {
                this.f22263d4 = false;
                if (!this.f22259b4 && !this.f22261c4) {
                    z10 = true;
                }
            }
            e0 e0Var = e0.f22152a;
        }
        return z10 ? e(iOException) : iOException;
    }

    public final String y() {
        return this.f22262d.j().n();
    }
}
