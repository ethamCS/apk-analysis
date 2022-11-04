package g;

import e.b0;
import e.g0;
import e.i0;
import e.j;
import e.j0;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class n<T> implements d<T> {

    /* renamed from: b */
    private final s f4532b;

    /* renamed from: c */
    private final Object[] f4533c;

    /* renamed from: d */
    private final j.a f4534d;

    /* renamed from: e */
    private final h<j0, T> f4535e;

    /* renamed from: f */
    private volatile boolean f4536f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g */
    private e.j f4537g;
    @GuardedBy("this")
    @Nullable

    /* renamed from: h */
    private Throwable f4538h;
    @GuardedBy("this")
    private boolean i;

    /* loaded from: classes.dex */
    class a implements e.k {

        /* renamed from: a */
        final /* synthetic */ f f4539a;

        a(f fVar) {
            n.this = r1;
            this.f4539a = fVar;
        }

        private void c(Throwable th) {
            try {
                this.f4539a.a(n.this, th);
            } catch (Throwable th2) {
                y.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // e.k
        public void a(e.j jVar, i0 i0Var) {
            try {
                try {
                    this.f4539a.b(n.this, n.this.f(i0Var));
                } catch (Throwable th) {
                    y.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                y.s(th2);
                c(th2);
            }
        }

        @Override // e.k
        public void b(e.j jVar, IOException iOException) {
            c(iOException);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j0 {

        /* renamed from: c */
        private final j0 f4541c;

        /* renamed from: d */
        private final f.e f4542d;
        @Nullable

        /* renamed from: e */
        IOException f4543e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends f.h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.t tVar) {
                super(tVar);
                b.this = r1;
            }

            @Override // f.h, f.t
            public long q(f.c cVar, long j) {
                try {
                    return super.q(cVar, j);
                } catch (IOException e2) {
                    b.this.f4543e = e2;
                    throw e2;
                }
            }
        }

        b(j0 j0Var) {
            this.f4541c = j0Var;
            this.f4542d = f.l.b(new a(j0Var.h0()));
        }

        @Override // e.j0
        public long I() {
            return this.f4541c.I();
        }

        @Override // e.j0
        public b0 N() {
            return this.f4541c.N();
        }

        @Override // e.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4541c.close();
        }

        @Override // e.j0
        public f.e h0() {
            return this.f4542d;
        }

        void i0() {
            IOException iOException = this.f4543e;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j0 {
        @Nullable

        /* renamed from: c */
        private final b0 f4545c;

        /* renamed from: d */
        private final long f4546d;

        c(@Nullable b0 b0Var, long j) {
            this.f4545c = b0Var;
            this.f4546d = j;
        }

        @Override // e.j0
        public long I() {
            return this.f4546d;
        }

        @Override // e.j0
        public b0 N() {
            return this.f4545c;
        }

        @Override // e.j0
        public f.e h0() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public n(s sVar, Object[] objArr, j.a aVar, h<j0, T> hVar) {
        this.f4532b = sVar;
        this.f4533c = objArr;
        this.f4534d = aVar;
        this.f4535e = hVar;
    }

    private e.j d() {
        e.j b2 = this.f4534d.b(this.f4532b.a(this.f4533c));
        Objects.requireNonNull(b2, "Call.Factory returned null.");
        return b2;
    }

    @GuardedBy("this")
    private e.j e() {
        e.j jVar = this.f4537g;
        if (jVar != null) {
            return jVar;
        }
        Throwable th = this.f4538h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw ((Error) th);
            }
            throw ((RuntimeException) th);
        }
        try {
            e.j d2 = d();
            this.f4537g = d2;
            return d2;
        } catch (IOException | Error | RuntimeException e2) {
            y.s(e2);
            this.f4538h = e2;
            throw e2;
        }
    }

    @Override // g.d
    public void N(f<T> fVar) {
        e.j jVar;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Already executed.");
            }
            this.i = true;
            jVar = this.f4537g;
            th = this.f4538h;
            if (jVar == null && th == null) {
                e.j d2 = d();
                this.f4537g = d2;
                jVar = d2;
            }
        }
        if (th != null) {
            fVar.a(this, th);
            return;
        }
        if (this.f4536f) {
            jVar.cancel();
        }
        jVar.I(new a(fVar));
    }

    @Override // g.d
    public synchronized g0 a() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return e().a();
    }

    /* renamed from: b */
    public n<T> k() {
        return new n<>(this.f4532b, this.f4533c, this.f4534d, this.f4535e);
    }

    @Override // g.d
    public boolean c() {
        boolean z = true;
        if (this.f4536f) {
            return true;
        }
        synchronized (this) {
            e.j jVar = this.f4537g;
            if (jVar == null || !jVar.c()) {
                z = false;
            }
        }
        return z;
    }

    @Override // g.d
    public void cancel() {
        e.j jVar;
        this.f4536f = true;
        synchronized (this) {
            jVar = this.f4537g;
        }
        if (jVar != null) {
            jVar.cancel();
        }
    }

    t<T> f(i0 i0Var) {
        j0 a2 = i0Var.a();
        i0.a j0 = i0Var.j0();
        j0.b(new c(a2.N(), a2.I()));
        i0 c2 = j0.c();
        int k = c2.k();
        if (k < 200 || k >= 300) {
            try {
                return t.c(y.a(a2), c2);
            } finally {
                a2.close();
            }
        } else if (k == 204 || k == 205) {
            a2.close();
            return t.f(null, c2);
        } else {
            b bVar = new b(a2);
            try {
                return t.f(this.f4535e.a(bVar), c2);
            } catch (RuntimeException e2) {
                bVar.i0();
                throw e2;
            }
        }
    }
}
