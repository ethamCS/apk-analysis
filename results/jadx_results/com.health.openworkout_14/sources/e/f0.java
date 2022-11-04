package e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class f0 implements j {

    /* renamed from: b */
    final d0 f3965b;

    /* renamed from: c */
    private e.m0.h.k f3966c;

    /* renamed from: d */
    final g0 f3967d;

    /* renamed from: e */
    final boolean f3968e;

    /* renamed from: f */
    private boolean f3969f;

    /* loaded from: classes.dex */
    public final class a extends e.m0.d {

        /* renamed from: c */
        private final k f3970c;

        /* renamed from: d */
        private volatile AtomicInteger f3971d = new AtomicInteger(0);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super("OkHttp %s", r3.g());
            f0.this = r3;
            this.f3970c = kVar;
        }

        @Override // e.m0.d
        protected void k() {
            boolean z;
            IOException e2;
            Throwable th;
            f0.this.f3966c.p();
            try {
                try {
                    z = true;
                    try {
                        this.f3970c.a(f0.this, f0.this.e());
                    } catch (IOException e3) {
                        e2 = e3;
                        if (z) {
                            e.m0.l.f j = e.m0.l.f.j();
                            j.p(4, "Callback failure for " + f0.this.h(), e2);
                        } else {
                            this.f3970c.b(f0.this, e2);
                        }
                        f0.this.f3965b.l().e(this);
                    } catch (Throwable th2) {
                        th = th2;
                        f0.this.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f3970c.b(f0.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    f0.this.f3965b.l().e(this);
                    throw th3;
                }
            } catch (IOException e4) {
                e2 = e4;
                z = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
            f0.this.f3965b.l().e(this);
        }

        public AtomicInteger l() {
            return this.f3971d;
        }

        public void m(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    f0.this.f3966c.l(interruptedIOException);
                    this.f3970c.b(f0.this, interruptedIOException);
                    f0.this.f3965b.l().e(this);
                }
            } catch (Throwable th) {
                f0.this.f3965b.l().e(this);
                throw th;
            }
        }

        public f0 n() {
            return f0.this;
        }

        public String o() {
            return f0.this.f3967d.i().m();
        }

        public void p(a aVar) {
            this.f3971d = aVar.f3971d;
        }
    }

    private f0(d0 d0Var, g0 g0Var, boolean z) {
        this.f3965b = d0Var;
        this.f3967d = g0Var;
        this.f3968e = z;
    }

    public static f0 f(d0 d0Var, g0 g0Var, boolean z) {
        f0 f0Var = new f0(d0Var, g0Var, z);
        f0Var.f3966c = new e.m0.h.k(d0Var, f0Var);
        return f0Var;
    }

    @Override // e.j
    public void I(k kVar) {
        synchronized (this) {
            if (this.f3969f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f3969f = true;
        }
        this.f3966c.b();
        this.f3965b.l().a(new a(kVar));
    }

    @Override // e.j
    public g0 a() {
        return this.f3967d;
    }

    @Override // e.j
    public boolean c() {
        return this.f3966c.i();
    }

    @Override // e.j
    public void cancel() {
        this.f3966c.d();
    }

    /* renamed from: d */
    public f0 clone() {
        return f(this.f3965b, this.f3967d, this.f3968e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    e.i0 e() {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            e.d0 r0 = r11.f3965b
            java.util.List r0 = r0.r()
            r1.addAll(r0)
            e.m0.i.j r0 = new e.m0.i.j
            e.d0 r2 = r11.f3965b
            r0.<init>(r2)
            r1.add(r0)
            e.m0.i.a r0 = new e.m0.i.a
            e.d0 r2 = r11.f3965b
            e.r r2 = r2.j()
            r0.<init>(r2)
            r1.add(r0)
            e.m0.g.a r0 = new e.m0.g.a
            e.d0 r2 = r11.f3965b
            e.m0.g.d r2 = r2.s()
            r0.<init>(r2)
            r1.add(r0)
            e.m0.h.b r0 = new e.m0.h.b
            e.d0 r2 = r11.f3965b
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f3968e
            if (r0 != 0) goto L4b
            e.d0 r0 = r11.f3965b
            java.util.List r0 = r0.t()
            r1.addAll(r0)
        L4b:
            e.m0.i.b r0 = new e.m0.i.b
            boolean r2 = r11.f3968e
            r0.<init>(r2)
            r1.add(r0)
            e.m0.i.g r10 = new e.m0.i.g
            e.m0.h.k r2 = r11.f3966c
            r3 = 0
            r4 = 0
            e.g0 r5 = r11.f3967d
            e.d0 r0 = r11.f3965b
            int r7 = r0.g()
            e.d0 r0 = r11.f3965b
            int r8 = r0.A()
            e.d0 r0 = r11.f3965b
            int r9 = r0.E()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            e.g0 r2 = r11.f3967d     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            e.i0 r2 = r10.c(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            e.m0.h.k r3 = r11.f3966c     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.i()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            e.m0.h.k r0 = r11.f3966c
            r0.l(r1)
            return r2
        L8a:
            e.m0.e.e(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La3
        L97:
            r0 = move-exception
            r2 = 1
            e.m0.h.k r3 = r11.f3966c     // Catch: java.lang.Throwable -> La0
            java.io.IOException r0 = r3.l(r0)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        La3:
            if (r0 != 0) goto Laa
            e.m0.h.k r0 = r11.f3966c
            r0.l(r1)
        Laa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.e():e.i0");
    }

    String g() {
        return this.f3967d.i().B();
    }

    String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(c() ? "canceled " : "");
        sb.append(this.f3968e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(g());
        return sb.toString();
    }
}
