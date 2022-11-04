package wf;

import eg.a0;
import eg.b0;
import eg.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.t;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0004 \u001c!\u0011B3\b\u0000\u0012\u0006\u0010#\u001a\u00020\u0015\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010[\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\\\u0010]J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010\u001dR\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u0010-\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00103\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R*\u00106\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R*\u00109\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010.\u001a\u0004\b:\u00100\"\u0004\b;\u00102R\u001e\u0010\u0014\u001a\u00060<R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b>\u0010?R\u001e\u0010A\u001a\u00060@R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001e\u0010F\u001a\u00060ER\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001e\u0010J\u001a\u00060ER\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0011\u0010X\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010Z\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bY\u0010W¨\u0006^"}, d2 = {"Lwf/i;", BuildConfig.FLAVOR, "Lwf/b;", "errorCode", "Ljava/io/IOException;", "errorException", BuildConfig.FLAVOR, "e", "Lof/t;", "E", "Leg/b0;", "v", "G", "Leg/y;", "n", "rstStatusCode", "Ltb/e0;", "d", "f", "Leg/e;", "source", BuildConfig.FLAVOR, "length", "w", "headers", "inFinished", "x", "y", "b", "()V", BuildConfig.FLAVOR, "delta", "a", "c", "F", "id", "I", "j", "()I", "Lwf/f;", "connection", "Lwf/f;", "g", "()Lwf/f;", "<set-?>", "readBytesTotal", "J", "l", "()J", "C", "(J)V", "readBytesAcknowledged", "k", "B", "writeBytesTotal", "r", "D", "writeBytesMaximum", "q", "setWriteBytesMaximum$okhttp", "Lwf/i$c;", "Lwf/i$c;", "p", "()Lwf/i$c;", "Lwf/i$b;", "sink", "Lwf/i$b;", "o", "()Lwf/i$b;", "Lwf/i$d;", "readTimeout", "Lwf/i$d;", "m", "()Lwf/i$d;", "writeTimeout", "s", "Lwf/b;", "h", "()Lwf/b;", "z", "(Lwf/b;)V", "Ljava/io/IOException;", "i", "()Ljava/io/IOException;", "A", "(Ljava/io/IOException;)V", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "outFinished", "<init>", "(ILwf/f;ZZLof/t;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f25037a;

    /* renamed from: b */
    private final f f25038b;

    /* renamed from: c */
    private long f25039c;

    /* renamed from: d */
    private long f25040d;

    /* renamed from: e */
    private long f25041e;

    /* renamed from: f */
    private long f25042f;

    /* renamed from: g */
    private final ArrayDeque<t> f25043g;

    /* renamed from: h */
    private boolean f25044h;

    /* renamed from: i */
    private final c f25045i;

    /* renamed from: j */
    private final b f25046j;

    /* renamed from: k */
    private final d f25047k = new d(this);

    /* renamed from: l */
    private final d f25048l = new d(this);

    /* renamed from: m */
    private wf.b f25049m;

    /* renamed from: n */
    private IOException f25050n;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lwf/i$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lwf/i$b;", "Leg/y;", BuildConfig.FLAVOR, "outFinishedOnLastFrame", "Ltb/e0;", "b", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "O", "flush", "Leg/b0;", "m", "close", "finished", "Z", "f", "()Z", "setFinished", "(Z)V", "closed", "e", "h", "<init>", "(Lwf/i;Z)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class b implements y {

        /* renamed from: c */
        private boolean f25051c;

        /* renamed from: d */
        private final eg.c f25052d = new eg.c();

        /* renamed from: q */
        private t f25053q;

        /* renamed from: x */
        private boolean f25054x;

        /* renamed from: y */
        final /* synthetic */ i f25055y;

        public b(i iVar, boolean z10) {
            hc.t.e(iVar, "this$0");
            this.f25055y = iVar;
            this.f25051c = z10;
        }

        private final void b(boolean z10) {
            long min;
            boolean z11;
            i iVar = this.f25055y;
            synchronized (iVar) {
                iVar.s().t();
                while (iVar.r() >= iVar.q() && !f() && !e() && iVar.h() == null) {
                    iVar.F();
                }
                iVar.s().A();
                iVar.c();
                min = Math.min(iVar.q() - iVar.r(), this.f25052d.e1());
                iVar.D(iVar.r() + min);
                z11 = z10 && min == this.f25052d.e1();
                e0 e0Var = e0.f22152a;
            }
            this.f25055y.s().t();
            try {
                this.f25055y.g().x1(this.f25055y.j(), z11, this.f25052d, min);
            } finally {
                this.f25055y.s().A();
            }
        }

        @Override // eg.y
        public void O(eg.c cVar, long j10) {
            hc.t.e(cVar, "source");
            i iVar = this.f25055y;
            if (!pf.d.f19195h || !Thread.holdsLock(iVar)) {
                this.f25052d.O(cVar, j10);
                while (this.f25052d.e1() >= 16384) {
                    b(false);
                }
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
        }

        @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i iVar = this.f25055y;
            if (pf.d.f19195h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = this.f25055y;
            synchronized (iVar2) {
                if (e()) {
                    return;
                }
                boolean z10 = iVar2.h() == null;
                e0 e0Var = e0.f22152a;
                if (!this.f25055y.o().f25051c) {
                    boolean z11 = this.f25052d.e1() > 0;
                    if (this.f25053q != null) {
                        while (this.f25052d.e1() > 0) {
                            b(false);
                        }
                        f g10 = this.f25055y.g();
                        int j10 = this.f25055y.j();
                        t tVar = this.f25053q;
                        hc.t.b(tVar);
                        g10.y1(j10, z10, pf.d.O(tVar));
                    } else if (z11) {
                        while (this.f25052d.e1() > 0) {
                            b(true);
                        }
                    } else if (z10) {
                        this.f25055y.g().x1(this.f25055y.j(), true, null, 0L);
                    }
                }
                synchronized (this.f25055y) {
                    h(true);
                    e0 e0Var2 = e0.f22152a;
                }
                this.f25055y.g().flush();
                this.f25055y.b();
            }
        }

        public final boolean e() {
            return this.f25054x;
        }

        public final boolean f() {
            return this.f25051c;
        }

        @Override // eg.y, java.io.Flushable
        public void flush() {
            i iVar = this.f25055y;
            if (pf.d.f19195h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = this.f25055y;
            synchronized (iVar2) {
                iVar2.c();
                e0 e0Var = e0.f22152a;
            }
            while (this.f25052d.e1() > 0) {
                b(false);
                this.f25055y.g().flush();
            }
        }

        public final void h(boolean z10) {
            this.f25054x = z10;
        }

        @Override // eg.y
        public b0 m() {
            return this.f25055y.s();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lwf/i$c;", "Leg/a0;", BuildConfig.FLAVOR, "read", "Ltb/e0;", "r", "Leg/c;", "sink", "byteCount", "g1", "Leg/e;", "source", "i", "(Leg/e;J)V", "Leg/b0;", "m", "close", BuildConfig.FLAVOR, "finished", "Z", "e", "()Z", "n", "(Z)V", "receiveBuffer", "Leg/c;", "h", "()Leg/c;", "readBuffer", "f", "Lof/t;", "trailers", "Lof/t;", "getTrailers", "()Lof/t;", "p", "(Lof/t;)V", "closed", "b", "j", "maxByteCount", "<init>", "(Lwf/i;JZ)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class c implements a0 {
        private boolean U3;
        final /* synthetic */ i V3;

        /* renamed from: c */
        private final long f25056c;

        /* renamed from: d */
        private boolean f25057d;

        /* renamed from: q */
        private final eg.c f25058q = new eg.c();

        /* renamed from: x */
        private final eg.c f25059x = new eg.c();

        /* renamed from: y */
        private t f25060y;

        public c(i iVar, long j10, boolean z10) {
            hc.t.e(iVar, "this$0");
            this.V3 = iVar;
            this.f25056c = j10;
            this.f25057d = z10;
        }

        private final void r(long j10) {
            i iVar = this.V3;
            if (!pf.d.f19195h || !Thread.holdsLock(iVar)) {
                this.V3.g().w1(j10);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
        }

        public final boolean b() {
            return this.U3;
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long e12;
            i iVar = this.V3;
            synchronized (iVar) {
                j(true);
                e12 = f().e1();
                f().e();
                iVar.notifyAll();
                e0 e0Var = e0.f22152a;
            }
            if (e12 > 0) {
                r(e12);
            }
            this.V3.b();
        }

        public final boolean e() {
            return this.f25057d;
        }

        public final eg.c f() {
            return this.f25059x;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // eg.a0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long g1(eg.c r18, long r19) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r4 = "sink"
                hc.t.e(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L13
                r6 = 1
                goto L14
            L13:
                r6 = 0
            L14:
                if (r6 == 0) goto Ldb
            L16:
                r6 = 0
                wf.i r9 = r1.V3
                monitor-enter(r9)
                wf.i$d r10 = r9.m()     // Catch: java.lang.Throwable -> Ld8
                r10.t()     // Catch: java.lang.Throwable -> Ld8
                wf.b r10 = r9.h()     // Catch: java.lang.Throwable -> Lcf
                if (r10 == 0) goto L39
                java.io.IOException r6 = r9.i()     // Catch: java.lang.Throwable -> Lcf
                if (r6 != 0) goto L39
                wf.n r6 = new wf.n     // Catch: java.lang.Throwable -> Lcf
                wf.b r10 = r9.h()     // Catch: java.lang.Throwable -> Lcf
                hc.t.b(r10)     // Catch: java.lang.Throwable -> Lcf
                r6.<init>(r10)     // Catch: java.lang.Throwable -> Lcf
            L39:
                boolean r10 = r17.b()     // Catch: java.lang.Throwable -> Lcf
                if (r10 != 0) goto Lc7
                eg.c r10 = r17.f()     // Catch: java.lang.Throwable -> Lcf
                long r10 = r10.e1()     // Catch: java.lang.Throwable -> Lcf
                int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                r11 = -1
                if (r10 <= 0) goto L9b
                eg.c r10 = r17.f()     // Catch: java.lang.Throwable -> Lcf
                eg.c r13 = r17.f()     // Catch: java.lang.Throwable -> Lcf
                long r13 = r13.e1()     // Catch: java.lang.Throwable -> Lcf
                long r13 = java.lang.Math.min(r2, r13)     // Catch: java.lang.Throwable -> Lcf
                long r13 = r10.g1(r0, r13)     // Catch: java.lang.Throwable -> Lcf
                long r15 = r9.l()     // Catch: java.lang.Throwable -> Lcf
                long r4 = r15 + r13
                r9.C(r4)     // Catch: java.lang.Throwable -> Lcf
                long r4 = r9.l()     // Catch: java.lang.Throwable -> Lcf
                long r15 = r9.k()     // Catch: java.lang.Throwable -> Lcf
                long r4 = r4 - r15
                if (r6 != 0) goto Laa
                wf.f r10 = r9.g()     // Catch: java.lang.Throwable -> Lcf
                wf.m r10 = r10.D0()     // Catch: java.lang.Throwable -> Lcf
                int r10 = r10.c()     // Catch: java.lang.Throwable -> Lcf
                int r10 = r10 / 2
                long r7 = (long) r10     // Catch: java.lang.Throwable -> Lcf
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 < 0) goto Laa
                wf.f r7 = r9.g()     // Catch: java.lang.Throwable -> Lcf
                int r8 = r9.j()     // Catch: java.lang.Throwable -> Lcf
                r7.C1(r8, r4)     // Catch: java.lang.Throwable -> Lcf
                long r4 = r9.l()     // Catch: java.lang.Throwable -> Lcf
                r9.B(r4)     // Catch: java.lang.Throwable -> Lcf
                goto Laa
            L9b:
                boolean r4 = r17.e()     // Catch: java.lang.Throwable -> Lcf
                if (r4 != 0) goto La9
                if (r6 != 0) goto La9
                r9.F()     // Catch: java.lang.Throwable -> Lcf
                r13 = r11
                r4 = 1
                goto Lab
            La9:
                r13 = r11
            Laa:
                r4 = 0
            Lab:
                wf.i$d r5 = r9.m()     // Catch: java.lang.Throwable -> Ld8
                r5.A()     // Catch: java.lang.Throwable -> Ld8
                tb.e0 r5 = tb.e0.f22152a     // Catch: java.lang.Throwable -> Ld8
                monitor-exit(r9)
                if (r4 == 0) goto Lbb
                r4 = 0
                goto L16
            Lbb:
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 == 0) goto Lc3
                r1.r(r13)
                return r13
            Lc3:
                if (r6 != 0) goto Lc6
                return r11
            Lc6:
                throw r6
            Lc7:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lcf
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lcf
                throw r0     // Catch: java.lang.Throwable -> Lcf
            Lcf:
                r0 = move-exception
                wf.i$d r2 = r9.m()     // Catch: java.lang.Throwable -> Ld8
                r2.A()     // Catch: java.lang.Throwable -> Ld8
                throw r0     // Catch: java.lang.Throwable -> Ld8
            Ld8:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            Ldb:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.Long r2 = java.lang.Long.valueOf(r19)
                java.lang.String r0 = hc.t.l(r0, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: wf.i.c.g1(eg.c, long):long");
        }

        public final eg.c h() {
            return this.f25058q;
        }

        public final void i(eg.e eVar, long j10) {
            boolean e10;
            boolean z10;
            boolean z11;
            long j11;
            hc.t.e(eVar, "source");
            i iVar = this.V3;
            if (pf.d.f19195h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            while (j10 > 0) {
                synchronized (this.V3) {
                    e10 = e();
                    z10 = true;
                    z11 = f().e1() + j10 > this.f25056c;
                    e0 e0Var = e0.f22152a;
                }
                if (z11) {
                    eVar.skip(j10);
                    this.V3.f(wf.b.FLOW_CONTROL_ERROR);
                    return;
                } else if (e10) {
                    eVar.skip(j10);
                    return;
                } else {
                    long g12 = eVar.g1(this.f25058q, j10);
                    if (g12 == -1) {
                        throw new EOFException();
                    }
                    j10 -= g12;
                    i iVar2 = this.V3;
                    synchronized (iVar2) {
                        if (b()) {
                            j11 = h().e1();
                            h().e();
                        } else {
                            if (f().e1() != 0) {
                                z10 = false;
                            }
                            f().G0(h());
                            if (z10) {
                                iVar2.notifyAll();
                            }
                            j11 = 0;
                        }
                    }
                    if (j11 > 0) {
                        r(j11);
                    }
                }
            }
        }

        public final void j(boolean z10) {
            this.U3 = z10;
        }

        @Override // eg.a0
        public b0 m() {
            return this.V3.m();
        }

        public final void n(boolean z10) {
            this.f25057d = z10;
        }

        public final void p(t tVar) {
            this.f25060y = tVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lwf/i$d;", "Leg/a;", "Ltb/e0;", "z", "Ljava/io/IOException;", "cause", "v", "A", "<init>", "(Lwf/i;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class d extends eg.a {

        /* renamed from: k */
        final /* synthetic */ i f25061k;

        public d(i iVar) {
            hc.t.e(iVar, "this$0");
            this.f25061k = iVar;
        }

        public final void A() {
            if (!u()) {
                return;
            }
            throw v(null);
        }

        @Override // eg.a
        protected IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // eg.a
        protected void z() {
            this.f25061k.f(wf.b.CANCEL);
            this.f25061k.g().p1();
        }
    }

    public i(int i10, f fVar, boolean z10, boolean z11, t tVar) {
        hc.t.e(fVar, "connection");
        this.f25037a = i10;
        this.f25038b = fVar;
        this.f25042f = fVar.K0().c();
        ArrayDeque<t> arrayDeque = new ArrayDeque<>();
        this.f25043g = arrayDeque;
        this.f25045i = new c(this, fVar.D0().c(), z11);
        this.f25046j = new b(this, z10);
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else if (!(!t())) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else {
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(wf.b bVar, IOException iOException) {
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            if (p().e() && o().f()) {
                return false;
            }
            z(bVar);
            A(iOException);
            notifyAll();
            e0 e0Var = e0.f22152a;
            this.f25038b.o1(this.f25037a);
            return true;
        }
    }

    public final void A(IOException iOException) {
        this.f25050n = iOException;
    }

    public final void B(long j10) {
        this.f25040d = j10;
    }

    public final void C(long j10) {
        this.f25039c = j10;
    }

    public final void D(long j10) {
        this.f25041e = j10;
    }

    public final synchronized t E() {
        t removeFirst;
        this.f25047k.t();
        while (this.f25043g.isEmpty() && this.f25049m == null) {
            F();
        }
        this.f25047k.A();
        if (!(!this.f25043g.isEmpty())) {
            IOException iOException = this.f25050n;
            if (iOException != null) {
                throw iOException;
            }
            wf.b bVar = this.f25049m;
            hc.t.b(bVar);
            throw new n(bVar);
        }
        removeFirst = this.f25043g.removeFirst();
        hc.t.d(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    public final void F() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final b0 G() {
        return this.f25048l;
    }

    public final void a(long j10) {
        this.f25042f += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean u10;
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z10 = !p().e() && p().b() && (o().f() || o().e());
            u10 = u();
            e0 e0Var = e0.f22152a;
        }
        if (z10) {
            d(wf.b.CANCEL, null);
        } else if (u10) {
        } else {
            this.f25038b.o1(this.f25037a);
        }
    }

    public final void c() {
        if (!this.f25046j.e()) {
            if (this.f25046j.f()) {
                throw new IOException("stream finished");
            }
            if (this.f25049m == null) {
                return;
            }
            IOException iOException = this.f25050n;
            if (iOException != null) {
                throw iOException;
            }
            wf.b bVar = this.f25049m;
            hc.t.b(bVar);
            throw new n(bVar);
        }
        throw new IOException("stream closed");
    }

    public final void d(wf.b bVar, IOException iOException) {
        hc.t.e(bVar, "rstStatusCode");
        if (!e(bVar, iOException)) {
            return;
        }
        this.f25038b.A1(this.f25037a, bVar);
    }

    public final void f(wf.b bVar) {
        hc.t.e(bVar, "errorCode");
        if (!e(bVar, null)) {
            return;
        }
        this.f25038b.B1(this.f25037a, bVar);
    }

    public final f g() {
        return this.f25038b;
    }

    public final synchronized wf.b h() {
        return this.f25049m;
    }

    public final IOException i() {
        return this.f25050n;
    }

    public final int j() {
        return this.f25037a;
    }

    public final long k() {
        return this.f25040d;
    }

    public final long l() {
        return this.f25039c;
    }

    public final d m() {
        return this.f25047k;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:19:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eg.y n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f25044h     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.t()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            tb.e0 r0 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            wf.i$b r0 = r2.f25046j
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.i.n():eg.y");
    }

    public final b o() {
        return this.f25046j;
    }

    public final c p() {
        return this.f25045i;
    }

    public final long q() {
        return this.f25042f;
    }

    public final long r() {
        return this.f25041e;
    }

    public final d s() {
        return this.f25048l;
    }

    public final boolean t() {
        return this.f25038b.j0() == ((this.f25037a & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f25049m != null) {
            return false;
        }
        if ((this.f25045i.e() || this.f25045i.b()) && (this.f25046j.f() || this.f25046j.e())) {
            if (this.f25044h) {
                return false;
            }
        }
        return true;
    }

    public final b0 v() {
        return this.f25047k;
    }

    public final void w(eg.e eVar, int i10) {
        hc.t.e(eVar, "source");
        if (!pf.d.f19195h || !Thread.holdsLock(this)) {
            this.f25045i.i(eVar, i10);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:9:0x0038, B:13:0x0040, B:14:0x0048, B:16:0x0051, B:17:0x0058), top: B:24:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(of.t r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            hc.t.e(r3, r0)
            boolean r0 = pf.d.f19195h
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.f25044h     // Catch: java.lang.Throwable -> L6c
            r1 = 1
            if (r0 == 0) goto L48
            if (r4 != 0) goto L40
            goto L48
        L40:
            wf.i$c r0 = r2.p()     // Catch: java.lang.Throwable -> L6c
            r0.p(r3)     // Catch: java.lang.Throwable -> L6c
            goto L4f
        L48:
            r2.f25044h = r1     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayDeque<of.t> r0 = r2.f25043g     // Catch: java.lang.Throwable -> L6c
            r0.add(r3)     // Catch: java.lang.Throwable -> L6c
        L4f:
            if (r4 == 0) goto L58
            wf.i$c r3 = r2.p()     // Catch: java.lang.Throwable -> L6c
            r3.n(r1)     // Catch: java.lang.Throwable -> L6c
        L58:
            boolean r3 = r2.u()     // Catch: java.lang.Throwable -> L6c
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6c
            tb.e0 r4 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)
            if (r3 != 0) goto L6b
            wf.f r3 = r2.f25038b
            int r4 = r2.f25037a
            r3.o1(r4)
        L6b:
            return
        L6c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.i.x(of.t, boolean):void");
    }

    public final synchronized void y(wf.b bVar) {
        hc.t.e(bVar, "errorCode");
        if (this.f25049m == null) {
            this.f25049m = bVar;
            notifyAll();
        }
    }

    public final void z(wf.b bVar) {
        this.f25049m = bVar;
    }
}
