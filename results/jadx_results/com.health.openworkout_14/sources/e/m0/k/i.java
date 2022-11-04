package e.m0.k;

import e.y;
import f.s;
import f.t;
import f.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b */
    long f4301b;

    /* renamed from: c */
    final int f4302c;

    /* renamed from: d */
    final f f4303d;

    /* renamed from: e */
    private final Deque<y> f4304e;

    /* renamed from: f */
    private boolean f4305f;

    /* renamed from: g */
    private final b f4306g;

    /* renamed from: h */
    final a f4307h;
    @Nullable
    e.m0.k.b k;
    @Nullable
    IOException l;

    /* renamed from: a */
    long f4300a = 0;
    final c i = new c();
    final c j = new c();

    /* loaded from: classes.dex */
    public final class a implements s {

        /* renamed from: b */
        private final f.c f4308b = new f.c();

        /* renamed from: c */
        private y f4309c;

        /* renamed from: d */
        boolean f4310d;

        /* renamed from: e */
        boolean f4311e;

        a() {
            i.this = r1;
        }

        private void a(boolean z) {
            i iVar;
            long min;
            i iVar2;
            boolean z2;
            synchronized (i.this) {
                i.this.j.k();
                while (true) {
                    iVar = i.this;
                    if (iVar.f4301b > 0 || this.f4311e || this.f4310d || iVar.k != null) {
                        break;
                    }
                    iVar.q();
                }
                iVar.j.u();
                i.this.c();
                min = Math.min(i.this.f4301b, this.f4308b.v0());
                iVar2 = i.this;
                iVar2.f4301b -= min;
            }
            iVar2.j.k();
            if (z) {
                try {
                    if (min == this.f4308b.v0()) {
                        z2 = true;
                        i iVar3 = i.this;
                        iVar3.f4303d.E0(iVar3.f4302c, z2, this.f4308b, min);
                        i.this.j.u();
                    }
                } catch (Throwable th) {
                    i.this.j.u();
                    throw th;
                }
            }
            z2 = false;
            i iVar32 = i.this;
            iVar32.f4303d.E0(iVar32.f4302c, z2, this.f4308b, min);
            i.this.j.u();
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                if (this.f4310d) {
                    return;
                }
                if (!i.this.f4307h.f4311e) {
                    boolean z = this.f4308b.v0() > 0;
                    if (this.f4309c != null) {
                        while (this.f4308b.v0() > 0) {
                            a(false);
                        }
                        i iVar = i.this;
                        iVar.f4303d.F0(iVar.f4302c, true, e.m0.e.H(this.f4309c));
                    } else if (z) {
                        while (this.f4308b.v0() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar2 = i.this;
                        iVar2.f4303d.E0(iVar2.f4302c, true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f4310d = true;
                }
                i.this.f4303d.flush();
                i.this.b();
            }
        }

        @Override // f.s
        public u d() {
            return i.this.j;
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f4308b.v0() > 0) {
                a(false);
                i.this.f4303d.flush();
            }
        }

        @Override // f.s
        public void i(f.c cVar, long j) {
            this.f4308b.i(cVar, j);
            while (this.f4308b.v0() >= 16384) {
                a(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b implements t {

        /* renamed from: b */
        private final f.c f4313b = new f.c();

        /* renamed from: c */
        private final f.c f4314c = new f.c();

        /* renamed from: d */
        private final long f4315d;

        /* renamed from: e */
        private y f4316e;

        /* renamed from: f */
        boolean f4317f;

        /* renamed from: g */
        boolean f4318g;

        b(long j) {
            i.this = r1;
            this.f4315d = j;
        }

        private void k(long j) {
            i.this.f4303d.D0(j);
        }

        void c(f.e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (i.this) {
                    z = this.f4318g;
                    z2 = true;
                    z3 = this.f4314c.v0() + j > this.f4315d;
                }
                if (z3) {
                    eVar.w(j);
                    i.this.f(e.m0.k.b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.w(j);
                    return;
                } else {
                    long q = eVar.q(this.f4313b, j);
                    if (q == -1) {
                        throw new EOFException();
                    }
                    j -= q;
                    synchronized (i.this) {
                        if (this.f4317f) {
                            j2 = this.f4313b.v0();
                            this.f4313b.f0();
                        } else {
                            if (this.f4314c.v0() != 0) {
                                z2 = false;
                            }
                            this.f4314c.C0(this.f4313b);
                            if (z2) {
                                i.this.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        k(j2);
                    }
                }
            }
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long v0;
            synchronized (i.this) {
                this.f4317f = true;
                v0 = this.f4314c.v0();
                this.f4314c.f0();
                i.this.notifyAll();
            }
            if (v0 > 0) {
                k(v0);
            }
            i.this.b();
        }

        @Override // f.t
        public u d() {
            return i.this.i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            r11 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
        @Override // f.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long q(f.c r11, long r12) {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto La8
            L6:
                r2 = 0
                e.m0.k.i r3 = e.m0.k.i.this
                monitor-enter(r3)
                e.m0.k.i r4 = e.m0.k.i.this     // Catch: java.lang.Throwable -> La5
                e.m0.k.i$c r4 = r4.i     // Catch: java.lang.Throwable -> La5
                r4.k()     // Catch: java.lang.Throwable -> La5
                e.m0.k.i r4 = e.m0.k.i.this     // Catch: java.lang.Throwable -> L9c
                e.m0.k.b r5 = r4.k     // Catch: java.lang.Throwable -> L9c
                if (r5 == 0) goto L25
                java.io.IOException r2 = r4.l     // Catch: java.lang.Throwable -> L9c
                if (r2 == 0) goto L1c
                goto L25
            L1c:
                e.m0.k.n r2 = new e.m0.k.n     // Catch: java.lang.Throwable -> L9c
                e.m0.k.i r4 = e.m0.k.i.this     // Catch: java.lang.Throwable -> L9c
                e.m0.k.b r4 = r4.k     // Catch: java.lang.Throwable -> L9c
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            L25:
                boolean r4 = r10.f4317f     // Catch: java.lang.Throwable -> L9c
                if (r4 != 0) goto L94
                f.c r4 = r10.f4314c     // Catch: java.lang.Throwable -> L9c
                long r4 = r4.v0()     // Catch: java.lang.Throwable -> L9c
                r6 = -1
                int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r8 <= 0) goto L6b
                f.c r4 = r10.f4314c     // Catch: java.lang.Throwable -> L9c
                long r8 = r4.v0()     // Catch: java.lang.Throwable -> L9c
                long r12 = java.lang.Math.min(r12, r8)     // Catch: java.lang.Throwable -> L9c
                long r11 = r4.q(r11, r12)     // Catch: java.lang.Throwable -> L9c
                e.m0.k.i r13 = e.m0.k.i.this     // Catch: java.lang.Throwable -> L9c
                long r4 = r13.f4300a     // Catch: java.lang.Throwable -> L9c
                long r4 = r4 + r11
                r13.f4300a = r4     // Catch: java.lang.Throwable -> L9c
                if (r2 != 0) goto L80
                e.m0.k.f r13 = r13.f4303d     // Catch: java.lang.Throwable -> L9c
                e.m0.k.m r13 = r13.t     // Catch: java.lang.Throwable -> L9c
                int r13 = r13.d()     // Catch: java.lang.Throwable -> L9c
                int r13 = r13 / 2
                long r8 = (long) r13     // Catch: java.lang.Throwable -> L9c
                int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r13 < 0) goto L80
                e.m0.k.i r13 = e.m0.k.i.this     // Catch: java.lang.Throwable -> L9c
                e.m0.k.f r4 = r13.f4303d     // Catch: java.lang.Throwable -> L9c
                int r5 = r13.f4302c     // Catch: java.lang.Throwable -> L9c
                long r8 = r13.f4300a     // Catch: java.lang.Throwable -> L9c
                r4.J0(r5, r8)     // Catch: java.lang.Throwable -> L9c
                e.m0.k.i r13 = e.m0.k.i.this     // Catch: java.lang.Throwable -> L9c
                r13.f4300a = r0     // Catch: java.lang.Throwable -> L9c
                goto L80
            L6b:
                boolean r4 = r10.f4318g     // Catch: java.lang.Throwable -> L9c
                if (r4 != 0) goto L7f
                if (r2 != 0) goto L7f
                e.m0.k.i r2 = e.m0.k.i.this     // Catch: java.lang.Throwable -> L9c
                r2.q()     // Catch: java.lang.Throwable -> L9c
                e.m0.k.i r2 = e.m0.k.i.this     // Catch: java.lang.Throwable -> La5
                e.m0.k.i$c r2 = r2.i     // Catch: java.lang.Throwable -> La5
                r2.u()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                goto L6
            L7f:
                r11 = r6
            L80:
                e.m0.k.i r13 = e.m0.k.i.this     // Catch: java.lang.Throwable -> La5
                e.m0.k.i$c r13 = r13.i     // Catch: java.lang.Throwable -> La5
                r13.u()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 == 0) goto L90
                r10.k(r11)
                return r11
            L90:
                if (r2 != 0) goto L93
                return r6
            L93:
                throw r2
            L94:
                java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L9c
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L9c
                throw r11     // Catch: java.lang.Throwable -> L9c
            L9c:
                r11 = move-exception
                e.m0.k.i r12 = e.m0.k.i.this     // Catch: java.lang.Throwable -> La5
                e.m0.k.i$c r12 = r12.i     // Catch: java.lang.Throwable -> La5
                r12.u()     // Catch: java.lang.Throwable -> La5
                throw r11     // Catch: java.lang.Throwable -> La5
            La5:
                r11 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                throw r11
            La8:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: e.m0.k.i.b.q(f.c, long):long");
        }
    }

    /* loaded from: classes.dex */
    public class c extends f.a {
        c() {
            i.this = r1;
        }

        @Override // f.a
        protected IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // f.a
        protected void t() {
            i.this.f(e.m0.k.b.CANCEL);
            i.this.f4303d.z0();
        }

        public void u() {
            if (!n()) {
                return;
            }
            throw o(null);
        }
    }

    public i(int i, f fVar, boolean z, boolean z2, @Nullable y yVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4304e = arrayDeque;
        Objects.requireNonNull(fVar, "connection == null");
        this.f4302c = i;
        this.f4303d = fVar;
        this.f4301b = fVar.u.d();
        b bVar = new b(fVar.t.d());
        this.f4306g = bVar;
        a aVar = new a();
        this.f4307h = aVar;
        bVar.f4318g = z2;
        aVar.f4311e = z;
        if (yVar != null) {
            arrayDeque.add(yVar);
        }
        if (!j() || yVar == null) {
            if (!j() && yVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
    }

    private boolean e(e.m0.k.b bVar, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.f4306g.f4318g && this.f4307h.f4311e) {
                return false;
            }
            this.k = bVar;
            this.l = iOException;
            notifyAll();
            this.f4303d.y0(this.f4302c);
            return true;
        }
    }

    public void a(long j) {
        this.f4301b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    void b() {
        boolean z;
        boolean k;
        synchronized (this) {
            b bVar = this.f4306g;
            if (!bVar.f4318g && bVar.f4317f) {
                a aVar = this.f4307h;
                if (aVar.f4311e || aVar.f4310d) {
                    z = true;
                    k = k();
                }
            }
            z = false;
            k = k();
        }
        if (z) {
            d(e.m0.k.b.CANCEL, null);
        } else if (k) {
        } else {
            this.f4303d.y0(this.f4302c);
        }
    }

    void c() {
        a aVar = this.f4307h;
        if (!aVar.f4310d) {
            if (aVar.f4311e) {
                throw new IOException("stream finished");
            }
            if (this.k == null) {
                return;
            }
            IOException iOException = this.l;
            if (iOException == null) {
                throw new n(this.k);
            }
            throw iOException;
        }
        throw new IOException("stream closed");
    }

    public void d(e.m0.k.b bVar, @Nullable IOException iOException) {
        if (!e(bVar, iOException)) {
            return;
        }
        this.f4303d.H0(this.f4302c, bVar);
    }

    public void f(e.m0.k.b bVar) {
        if (!e(bVar, null)) {
            return;
        }
        this.f4303d.I0(this.f4302c, bVar);
    }

    public int g() {
        return this.f4302c;
    }

    public s h() {
        synchronized (this) {
            if (!this.f4305f && !j()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4307h;
    }

    public t i() {
        return this.f4306g;
    }

    public boolean j() {
        return this.f4303d.f4230b == ((this.f4302c & 1) == 1);
    }

    public synchronized boolean k() {
        if (this.k != null) {
            return false;
        }
        b bVar = this.f4306g;
        if (bVar.f4318g || bVar.f4317f) {
            a aVar = this.f4307h;
            if (aVar.f4311e || aVar.f4310d) {
                if (this.f4305f) {
                    return false;
                }
            }
        }
        return true;
    }

    public u l() {
        return this.i;
    }

    public void m(f.e eVar, int i) {
        this.f4306g.c(eVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:8:0x000f, B:10:0x0018, B:11:0x001c, B:12:0x0023), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(e.y r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f4305f     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            e.m0.k.i$b r0 = r2.f4306g     // Catch: java.lang.Throwable -> L2e
            e.m0.k.i.b.a(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.f4305f = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<e.y> r0 = r2.f4304e     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            e.m0.k.i$b r3 = r2.f4306g     // Catch: java.lang.Throwable -> L2e
            r3.f4318g = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.k()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            e.m0.k.f r3 = r2.f4303d
            int r4 = r2.f4302c
            r3.y0(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.k.i.n(e.y, boolean):void");
    }

    public synchronized void o(e.m0.k.b bVar) {
        if (this.k == null) {
            this.k = bVar;
            notifyAll();
        }
    }

    public synchronized y p() {
        this.i.k();
        while (this.f4304e.isEmpty() && this.k == null) {
            q();
        }
        this.i.u();
        if (this.f4304e.isEmpty()) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new n(this.k);
            }
            throw iOException;
        }
        return this.f4304e.removeFirst();
    }

    void q() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public u r() {
        return this.j;
    }
}
