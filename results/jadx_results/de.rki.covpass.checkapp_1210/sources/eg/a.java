package eg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¨\u0006\u0018"}, d2 = {"Leg/a;", "Leg/b0;", BuildConfig.FLAVOR, "now", "w", "Ltb/e0;", "t", BuildConfig.FLAVOR, "u", "z", "Leg/y;", "sink", "x", "Leg/a0;", "source", "y", "Ljava/io/IOException;", "cause", "n", "v", "<init>", "()V", "a", "b", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class a extends b0 {
    public static final C0141a Companion = new C0141a(null);

    /* renamed from: h */
    private static final long f9586h;

    /* renamed from: i */
    private static final long f9587i;

    /* renamed from: j */
    private static a f9588j;

    /* renamed from: e */
    private boolean f9589e;

    /* renamed from: f */
    private a f9590f;

    /* renamed from: g */
    private long f9591g;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Leg/a$a;", BuildConfig.FLAVOR, "Leg/a;", "node", BuildConfig.FLAVOR, "timeoutNanos", BuildConfig.FLAVOR, "hasDeadline", "Ltb/e0;", "e", "d", "c", "()Leg/a;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", BuildConfig.FLAVOR, "TIMEOUT_WRITE_SIZE", "I", "head", "Leg/a;", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* renamed from: eg.a$a */
    /* loaded from: classes3.dex */
    public static final class C0141a {
        private C0141a() {
        }

        public /* synthetic */ C0141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean d(a aVar) {
            synchronized (a.class) {
                if (!aVar.f9589e) {
                    return false;
                }
                aVar.f9589e = false;
                for (a aVar2 = a.f9588j; aVar2 != null; aVar2 = aVar2.f9590f) {
                    if (aVar2.f9590f == aVar) {
                        aVar2.f9590f = aVar.f9590f;
                        aVar.f9590f = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0026, B:12:0x0032, B:13:0x003b, B:17:0x0045, B:18:0x004c, B:19:0x0054, B:21:0x005d, B:24:0x006d, B:25:0x0072, B:27:0x0082, B:28:0x0085, B:31:0x0089, B:32:0x008e, B:33:0x008f, B:34:0x009a), top: B:37:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0026, B:12:0x0032, B:13:0x003b, B:17:0x0045, B:18:0x004c, B:19:0x0054, B:21:0x005d, B:24:0x006d, B:25:0x0072, B:27:0x0082, B:28:0x0085, B:31:0x0089, B:32:0x008e, B:33:0x008f, B:34:0x009a), top: B:37:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0072 A[EDGE_INSN: B:39:0x0072->B:25:0x0072 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void e(eg.a r6, long r7, boolean r9) {
            /*
                r5 = this;
                java.lang.Class<eg.a> r0 = eg.a.class
                monitor-enter(r0)
                boolean r1 = eg.a.l(r6)     // Catch: java.lang.Throwable -> L9b
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L8f
                eg.a.q(r6, r2)     // Catch: java.lang.Throwable -> L9b
                eg.a r1 = eg.a.i()     // Catch: java.lang.Throwable -> L9b
                if (r1 != 0) goto L26
                eg.a$a r1 = eg.a.Companion     // Catch: java.lang.Throwable -> L9b
                eg.a r1 = new eg.a     // Catch: java.lang.Throwable -> L9b
                r1.<init>()     // Catch: java.lang.Throwable -> L9b
                eg.a.p(r1)     // Catch: java.lang.Throwable -> L9b
                eg.a$b r1 = new eg.a$b     // Catch: java.lang.Throwable -> L9b
                r1.<init>()     // Catch: java.lang.Throwable -> L9b
                r1.start()     // Catch: java.lang.Throwable -> L9b
            L26:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L9b
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L40
                if (r9 == 0) goto L40
                long r3 = r6.c()     // Catch: java.lang.Throwable -> L9b
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L9b
            L3b:
                long r7 = r7 + r1
                eg.a.s(r6, r7)     // Catch: java.lang.Throwable -> L9b
                goto L4c
            L40:
                if (r3 == 0) goto L43
                goto L3b
            L43:
                if (r9 == 0) goto L89
                long r7 = r6.c()     // Catch: java.lang.Throwable -> L9b
                eg.a.s(r6, r7)     // Catch: java.lang.Throwable -> L9b
            L4c:
                long r7 = eg.a.o(r6, r1)     // Catch: java.lang.Throwable -> L9b
                eg.a r9 = eg.a.i()     // Catch: java.lang.Throwable -> L9b
            L54:
                hc.t.b(r9)     // Catch: java.lang.Throwable -> L9b
                eg.a r3 = eg.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                if (r3 == 0) goto L72
                eg.a r3 = eg.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                hc.t.b(r3)     // Catch: java.lang.Throwable -> L9b
                long r3 = eg.a.o(r3, r1)     // Catch: java.lang.Throwable -> L9b
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L6d
                goto L72
            L6d:
                eg.a r9 = eg.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                goto L54
            L72:
                eg.a r7 = eg.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                eg.a.r(r6, r7)     // Catch: java.lang.Throwable -> L9b
                eg.a.r(r9, r6)     // Catch: java.lang.Throwable -> L9b
                eg.a r6 = eg.a.i()     // Catch: java.lang.Throwable -> L9b
                if (r9 != r6) goto L85
                r0.notify()     // Catch: java.lang.Throwable -> L9b
            L85:
                tb.e0 r6 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L9b
                monitor-exit(r0)
                return
            L89:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L9b
                r6.<init>()     // Catch: java.lang.Throwable -> L9b
                throw r6     // Catch: java.lang.Throwable -> L9b
            L8f:
                java.lang.String r6 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L9b
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L9b
                throw r7     // Catch: java.lang.Throwable -> L9b
            L9b:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: eg.a.C0141a.e(eg.a, long, boolean):void");
        }

        public final a c() {
            a aVar = a.f9588j;
            hc.t.b(aVar);
            a aVar2 = aVar.f9590f;
            long nanoTime = System.nanoTime();
            if (aVar2 == null) {
                a.class.wait(a.f9586h);
                a aVar3 = a.f9588j;
                hc.t.b(aVar3);
                if (aVar3.f9590f == null && System.nanoTime() - nanoTime >= a.f9587i) {
                    return a.f9588j;
                }
                return null;
            }
            long w9 = aVar2.w(nanoTime);
            if (w9 > 0) {
                long j10 = w9 / 1000000;
                a.class.wait(j10, (int) (w9 - (1000000 * j10)));
                return null;
            }
            a aVar4 = a.f9588j;
            hc.t.b(aVar4);
            aVar4.f9590f = aVar2.f9590f;
            aVar2.f9590f = null;
            return aVar2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Leg/a$b;", "Ljava/lang/Thread;", "Ltb/e0;", "run", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a c10;
            while (true) {
                try {
                    synchronized (a.class) {
                        c10 = a.Companion.c();
                        if (c10 == a.f9588j) {
                            a.f9588j = null;
                            return;
                        }
                        tb.e0 e0Var = tb.e0.f22152a;
                    }
                    if (c10 != null) {
                        c10.z();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"eg/a$c", "Leg/y;", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "close", "Leg/a;", "b", BuildConfig.FLAVOR, "toString", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c implements y {

        /* renamed from: d */
        final /* synthetic */ y f9593d;

        c(y yVar) {
            a.this = r1;
            this.f9593d = yVar;
        }

        @Override // eg.y
        public void O(eg.c cVar, long j10) {
            hc.t.e(cVar, "source");
            f0.b(cVar.e1(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    v vVar = cVar.f9600c;
                    while (true) {
                        hc.t.b(vVar);
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += vVar.f9652c - vVar.f9651b;
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        }
                        vVar = vVar.f9655f;
                    }
                    a aVar = a.this;
                    y yVar = this.f9593d;
                    aVar.t();
                    try {
                        yVar.O(cVar, j11);
                        tb.e0 e0Var = tb.e0.f22152a;
                        if (aVar.u()) {
                            throw aVar.n(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!aVar.u()) {
                            throw e10;
                        }
                        throw aVar.n(e10);
                    } finally {
                        aVar.u();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public a m() {
            return a.this;
        }

        @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            y yVar = this.f9593d;
            aVar.t();
            try {
                yVar.close();
                tb.e0 e0Var = tb.e0.f22152a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (aVar.u()) {
                    throw aVar.n(e10);
                }
            } finally {
                aVar.u();
            }
        }

        @Override // eg.y, java.io.Flushable
        public void flush() {
            a aVar = a.this;
            y yVar = this.f9593d;
            aVar.t();
            try {
                yVar.flush();
                tb.e0 e0Var = tb.e0.f22152a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (aVar.u()) {
                    throw aVar.n(e10);
                }
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f9593d + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"eg/a$d", "Leg/a0;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Ltb/e0;", "close", "Leg/a;", "b", BuildConfig.FLAVOR, "toString", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class d implements a0 {

        /* renamed from: d */
        final /* synthetic */ a0 f9595d;

        d(a0 a0Var) {
            a.this = r1;
            this.f9595d = a0Var;
        }

        /* renamed from: b */
        public a m() {
            return a.this;
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            a0 a0Var = this.f9595d;
            aVar.t();
            try {
                a0Var.close();
                tb.e0 e0Var = tb.e0.f22152a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (aVar.u()) {
                    throw aVar.n(e10);
                }
            } finally {
                aVar.u();
            }
        }

        @Override // eg.a0
        public long g1(eg.c cVar, long j10) {
            hc.t.e(cVar, "sink");
            a aVar = a.this;
            a0 a0Var = this.f9595d;
            aVar.t();
            try {
                long g12 = a0Var.g1(cVar, j10);
                if (aVar.u()) {
                    throw aVar.n(null);
                }
                return g12;
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f9595d + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f9586h = millis;
        f9587i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long w(long j10) {
        return this.f9591g - j10;
    }

    public final IOException n(IOException iOException) {
        return v(iOException);
    }

    public final void t() {
        long h10 = h();
        boolean e10 = e();
        if (h10 != 0 || e10) {
            Companion.e(this, h10, e10);
        }
    }

    public final boolean u() {
        return Companion.d(this);
    }

    protected IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y x(y yVar) {
        hc.t.e(yVar, "sink");
        return new c(yVar);
    }

    public final a0 y(a0 a0Var) {
        hc.t.e(a0Var, "source");
        return new d(a0Var);
    }

    protected void z() {
    }
}
