package e.m0.j;

import e.d0;
import e.g0;
import e.i0;
import e.m0.i.k;
import e.y;
import e.z;
import f.i;
import f.s;
import f.t;
import f.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a implements e.m0.i.c {

    /* renamed from: a */
    private final d0 f4170a;

    /* renamed from: b */
    private final e.m0.h.f f4171b;

    /* renamed from: c */
    private final f.e f4172c;

    /* renamed from: d */
    private final f.d f4173d;

    /* renamed from: e */
    private int f4174e = 0;

    /* renamed from: f */
    private long f4175f = 262144;

    /* renamed from: g */
    private y f4176g;

    /* loaded from: classes.dex */
    public abstract class b implements t {

        /* renamed from: b */
        protected final i f4177b;

        /* renamed from: c */
        protected boolean f4178c;

        private b() {
            a.this = r2;
            this.f4177b = new i(r2.f4172c.d());
        }

        final void a() {
            if (a.this.f4174e == 6) {
                return;
            }
            if (a.this.f4174e == 5) {
                a.this.s(this.f4177b);
                a.this.f4174e = 6;
                return;
            }
            throw new IllegalStateException("state: " + a.this.f4174e);
        }

        @Override // f.t
        public u d() {
            return this.f4177b;
        }

        @Override // f.t
        public long q(f.c cVar, long j) {
            try {
                return a.this.f4172c.q(cVar, j);
            } catch (IOException e2) {
                a.this.f4171b.p();
                a();
                throw e2;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c implements s {

        /* renamed from: b */
        private final i f4180b;

        /* renamed from: c */
        private boolean f4181c;

        c() {
            a.this = r2;
            this.f4180b = new i(r2.f4173d.d());
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f4181c) {
                return;
            }
            this.f4181c = true;
            a.this.f4173d.O("0\r\n\r\n");
            a.this.s(this.f4180b);
            a.this.f4174e = 3;
        }

        @Override // f.s
        public u d() {
            return this.f4180b;
        }

        @Override // f.s, java.io.Flushable
        public synchronized void flush() {
            if (this.f4181c) {
                return;
            }
            a.this.f4173d.flush();
        }

        @Override // f.s
        public void i(f.c cVar, long j) {
            if (!this.f4181c) {
                if (j == 0) {
                    return;
                }
                a.this.f4173d.o(j);
                a.this.f4173d.O("\r\n");
                a.this.f4173d.i(cVar, j);
                a.this.f4173d.O("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public class d extends b {

        /* renamed from: e */
        private final z f4183e;

        /* renamed from: f */
        private long f4184f = -1;

        /* renamed from: g */
        private boolean f4185g = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(z zVar) {
            super();
            a.this = r3;
            this.f4183e = zVar;
        }

        private void c() {
            if (this.f4184f != -1) {
                a.this.f4172c.K();
            }
            try {
                this.f4184f = a.this.f4172c.a0();
                String trim = a.this.f4172c.K().trim();
                if (this.f4184f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4184f + trim + "\"");
                } else if (this.f4184f != 0) {
                } else {
                    this.f4185g = false;
                    a aVar = a.this;
                    aVar.f4176g = aVar.z();
                    e.m0.i.e.e(a.this.f4170a.j(), this.f4183e, a.this.f4176g);
                    a();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4178c) {
                return;
            }
            if (this.f4185g && !e.m0.e.n(this, 100, TimeUnit.MILLISECONDS)) {
                a.this.f4171b.p();
                a();
            }
            this.f4178c = true;
        }

        @Override // e.m0.j.a.b, f.t
        public long q(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f4178c) {
                throw new IllegalStateException("closed");
            } else {
                if (!this.f4185g) {
                    return -1L;
                }
                long j2 = this.f4184f;
                if (j2 == 0 || j2 == -1) {
                    c();
                    if (!this.f4185g) {
                        return -1L;
                    }
                }
                long q = super.q(cVar, Math.min(j, this.f4184f));
                if (q != -1) {
                    this.f4184f -= q;
                    return q;
                }
                a.this.f4171b.p();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends b {

        /* renamed from: e */
        private long f4187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j) {
            super();
            a.this = r3;
            this.f4187e = j;
            if (j == 0) {
                a();
            }
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4178c) {
                return;
            }
            if (this.f4187e != 0 && !e.m0.e.n(this, 100, TimeUnit.MILLISECONDS)) {
                a.this.f4171b.p();
                a();
            }
            this.f4178c = true;
        }

        @Override // e.m0.j.a.b, f.t
        public long q(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f4178c) {
                throw new IllegalStateException("closed");
            } else {
                long j2 = this.f4187e;
                if (j2 == 0) {
                    return -1L;
                }
                long q = super.q(cVar, Math.min(j2, j));
                if (q == -1) {
                    a.this.f4171b.p();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a();
                    throw protocolException;
                }
                long j3 = this.f4187e - q;
                this.f4187e = j3;
                if (j3 == 0) {
                    a();
                }
                return q;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class f implements s {

        /* renamed from: b */
        private final i f4189b;

        /* renamed from: c */
        private boolean f4190c;

        private f() {
            a.this = r2;
            this.f4189b = new i(r2.f4173d.d());
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4190c) {
                return;
            }
            this.f4190c = true;
            a.this.s(this.f4189b);
            a.this.f4174e = 3;
        }

        @Override // f.s
        public u d() {
            return this.f4189b;
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            if (this.f4190c) {
                return;
            }
            a.this.f4173d.flush();
        }

        @Override // f.s
        public void i(f.c cVar, long j) {
            if (!this.f4190c) {
                e.m0.e.d(cVar.v0(), 0L, j);
                a.this.f4173d.i(cVar, j);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public class g extends b {

        /* renamed from: e */
        private boolean f4192e;

        private g(a aVar) {
            super();
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4178c) {
                return;
            }
            if (!this.f4192e) {
                a();
            }
            this.f4178c = true;
        }

        @Override // e.m0.j.a.b, f.t
        public long q(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f4178c) {
                throw new IllegalStateException("closed");
            } else {
                if (this.f4192e) {
                    return -1L;
                }
                long q = super.q(cVar, j);
                if (q != -1) {
                    return q;
                }
                this.f4192e = true;
                a();
                return -1L;
            }
        }
    }

    public a(d0 d0Var, e.m0.h.f fVar, f.e eVar, f.d dVar) {
        this.f4170a = d0Var;
        this.f4171b = fVar;
        this.f4172c = eVar;
        this.f4173d = dVar;
    }

    public void s(i iVar) {
        u i = iVar.i();
        iVar.j(u.f4481d);
        i.a();
        i.b();
    }

    private s t() {
        if (this.f4174e == 1) {
            this.f4174e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f4174e);
    }

    private t u(z zVar) {
        if (this.f4174e == 4) {
            this.f4174e = 5;
            return new d(zVar);
        }
        throw new IllegalStateException("state: " + this.f4174e);
    }

    private t v(long j) {
        if (this.f4174e == 4) {
            this.f4174e = 5;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f4174e);
    }

    private s w() {
        if (this.f4174e == 1) {
            this.f4174e = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f4174e);
    }

    private t x() {
        if (this.f4174e == 4) {
            this.f4174e = 5;
            this.f4171b.p();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f4174e);
    }

    private String y() {
        String u = this.f4172c.u(this.f4175f);
        this.f4175f -= u.length();
        return u;
    }

    public y z() {
        y.a aVar = new y.a();
        while (true) {
            String y = y();
            if (y.length() != 0) {
                e.m0.c.f4060a.a(aVar, y);
            } else {
                return aVar.e();
            }
        }
    }

    public void A(i0 i0Var) {
        long b2 = e.m0.i.e.b(i0Var);
        if (b2 == -1) {
            return;
        }
        t v = v(b2);
        e.m0.e.D(v, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        v.close();
    }

    public void B(y yVar, String str) {
        if (this.f4174e != 0) {
            throw new IllegalStateException("state: " + this.f4174e);
        }
        this.f4173d.O(str).O("\r\n");
        int h2 = yVar.h();
        for (int i = 0; i < h2; i++) {
            this.f4173d.O(yVar.e(i)).O(": ").O(yVar.i(i)).O("\r\n");
        }
        this.f4173d.O("\r\n");
        this.f4174e = 1;
    }

    @Override // e.m0.i.c
    public void a() {
        this.f4173d.flush();
    }

    @Override // e.m0.i.c
    public void b(g0 g0Var) {
        B(g0Var.d(), e.m0.i.i.a(g0Var, this.f4171b.q().b().type()));
    }

    @Override // e.m0.i.c
    public void c() {
        this.f4173d.flush();
    }

    @Override // e.m0.i.c
    public void cancel() {
        e.m0.h.f fVar = this.f4171b;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // e.m0.i.c
    public s d(g0 g0Var, long j) {
        if (g0Var.a() == null || !g0Var.a().f()) {
            if ("chunked".equalsIgnoreCase(g0Var.c("Transfer-Encoding"))) {
                return t();
            }
            if (j == -1) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            return w();
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    @Override // e.m0.i.c
    public long e(i0 i0Var) {
        if (!e.m0.i.e.c(i0Var)) {
            return 0L;
        }
        if (!"chunked".equalsIgnoreCase(i0Var.N("Transfer-Encoding"))) {
            return e.m0.i.e.b(i0Var);
        }
        return -1L;
    }

    @Override // e.m0.i.c
    public t f(i0 i0Var) {
        if (!e.m0.i.e.c(i0Var)) {
            return v(0L);
        }
        if ("chunked".equalsIgnoreCase(i0Var.N("Transfer-Encoding"))) {
            return u(i0Var.m0().i());
        }
        long b2 = e.m0.i.e.b(i0Var);
        return b2 != -1 ? v(b2) : x();
    }

    @Override // e.m0.i.c
    public i0.a g(boolean z) {
        int i = this.f4174e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f4174e);
        }
        try {
            k a2 = k.a(y());
            i0.a aVar = new i0.a();
            aVar.o(a2.f4167a);
            aVar.g(a2.f4168b);
            aVar.l(a2.f4169c);
            aVar.j(z());
            if (z && a2.f4168b == 100) {
                return null;
            }
            if (a2.f4168b == 100) {
                this.f4174e = 3;
                return aVar;
            }
            this.f4174e = 4;
            return aVar;
        } catch (EOFException e2) {
            e.m0.h.f fVar = this.f4171b;
            String B = fVar != null ? fVar.q().a().l().B() : "unknown";
            throw new IOException("unexpected end of stream on " + B, e2);
        }
    }

    @Override // e.m0.i.c
    public e.m0.h.f h() {
        return this.f4171b;
    }
}
