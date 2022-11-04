package f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class a extends u {

    /* renamed from: h */
    private static final long f4425h;
    private static final long i;
    @Nullable
    static a j;

    /* renamed from: e */
    private boolean f4426e;
    @Nullable

    /* renamed from: f */
    private a f4427f;

    /* renamed from: g */
    private long f4428g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.a$a */
    /* loaded from: classes.dex */
    public class C0117a implements s {

        /* renamed from: b */
        final /* synthetic */ s f4429b;

        C0117a(s sVar) {
            a.this = r1;
            this.f4429b = sVar;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.k();
            try {
                try {
                    this.f4429b.close();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // f.s
        public u d() {
            return a.this;
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            a.this.k();
            try {
                try {
                    this.f4429b.flush();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // f.s
        public void i(f.c cVar, long j) {
            v.b(cVar.f4436c, 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    p pVar = cVar.f4435b;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += pVar.f4472c - pVar.f4471b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        pVar = pVar.f4475f;
                    }
                    boolean z = false;
                    a.this.k();
                    try {
                        try {
                            this.f4429b.i(cVar, j2);
                            j -= j2;
                            z = true;
                        } catch (IOException e2) {
                            throw a.this.l(e2);
                        }
                    } finally {
                        a.this.m(z);
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f4429b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements t {

        /* renamed from: b */
        final /* synthetic */ t f4431b;

        b(t tVar) {
            a.this = r1;
            this.f4431b = tVar;
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.k();
            try {
                try {
                    this.f4431b.close();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // f.t
        public u d() {
            return a.this;
        }

        @Override // f.t
        public long q(f.c cVar, long j) {
            a.this.k();
            try {
                try {
                    long q = this.f4431b.q(cVar, j);
                    a.this.m(true);
                    return q;
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f4431b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<f.a> r0 = f.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                f.a r1 = f.a.i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                f.a r2 = f.a.j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                f.a.j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4425h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    static a i() {
        a aVar = j.f4427f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(f4425h);
            if (j.f4427f == null && System.nanoTime() - nanoTime >= i) {
                return j;
            }
            return null;
        }
        long p = aVar.p(nanoTime);
        if (p > 0) {
            long j2 = p / 1000000;
            a.class.wait(j2, (int) (p - (1000000 * j2)));
            return null;
        }
        j.f4427f = aVar.f4427f;
        aVar.f4427f = null;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1.f4427f = r3.f4427f;
        r3.f4427f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean j(f.a r3) {
        /*
            java.lang.Class<f.a> r0 = f.a.class
            monitor-enter(r0)
            f.a r1 = f.a.j     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            f.a r2 = r1.f4427f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            f.a r2 = r3.f4427f     // Catch: java.lang.Throwable -> L19
            r1.f4427f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f4427f = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.j(f.a):boolean");
    }

    private long p(long j2) {
        return this.f4428g - j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:15:0x0034, B:16:0x003a, B:17:0x0040, B:19:0x0044, B:22:0x004d, B:23:0x0050, B:25:0x005a, B:28:0x005f, B:29:0x0064), top: B:32:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void q(f.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<f.a> r0 = f.a.class
            monitor-enter(r0)
            f.a r1 = f.a.j     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
            f.a r1 = new f.a     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            f.a.j = r1     // Catch: java.lang.Throwable -> L65
            f.a$c r1 = new f.a$c     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r1.start()     // Catch: java.lang.Throwable -> L65
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L65
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.c()     // Catch: java.lang.Throwable -> L65
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L65
        L2b:
            long r7 = r7 + r1
            r6.f4428g = r7     // Catch: java.lang.Throwable -> L65
            goto L3a
        L2f:
            if (r5 == 0) goto L32
            goto L2b
        L32:
            if (r9 == 0) goto L5f
            long r7 = r6.c()     // Catch: java.lang.Throwable -> L65
            r6.f4428g = r7     // Catch: java.lang.Throwable -> L65
        L3a:
            long r7 = r6.p(r1)     // Catch: java.lang.Throwable -> L65
            f.a r9 = f.a.j     // Catch: java.lang.Throwable -> L65
        L40:
            f.a r3 = r9.f4427f     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L50
            long r3 = r3.p(r1)     // Catch: java.lang.Throwable -> L65
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L50
        L4d:
            f.a r9 = r9.f4427f     // Catch: java.lang.Throwable -> L65
            goto L40
        L50:
            f.a r7 = r9.f4427f     // Catch: java.lang.Throwable -> L65
            r6.f4427f = r7     // Catch: java.lang.Throwable -> L65
            r9.f4427f = r6     // Catch: java.lang.Throwable -> L65
            f.a r6 = f.a.j     // Catch: java.lang.Throwable -> L65
            if (r9 != r6) goto L5d
            r0.notify()     // Catch: java.lang.Throwable -> L65
        L5d:
            monitor-exit(r0)
            return
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.q(f.a, long, boolean):void");
    }

    public final void k() {
        if (!this.f4426e) {
            long h2 = h();
            boolean e2 = e();
            if (h2 == 0 && !e2) {
                return;
            }
            this.f4426e = true;
            q(this, h2, e2);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    final IOException l(IOException iOException) {
        return !n() ? iOException : o(iOException);
    }

    final void m(boolean z) {
        if (!n() || !z) {
            return;
        }
        throw o(null);
    }

    public final boolean n() {
        if (!this.f4426e) {
            return false;
        }
        this.f4426e = false;
        return j(this);
    }

    protected IOException o(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final s r(s sVar) {
        return new C0117a(sVar);
    }

    public final t s(t tVar) {
        return new b(tVar);
    }

    protected void t() {
    }
}
