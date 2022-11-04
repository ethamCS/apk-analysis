package e.m0.h;

import e.g0;
import e.i0;
import e.j0;
import e.v;
import f.l;
import f.s;
import f.t;
import java.io.IOException;
import java.net.ProtocolException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    final k f4090a;

    /* renamed from: b */
    final e.j f4091b;

    /* renamed from: c */
    final v f4092c;

    /* renamed from: d */
    final e f4093d;

    /* renamed from: e */
    final e.m0.i.c f4094e;

    /* renamed from: f */
    private boolean f4095f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a extends f.g {

        /* renamed from: c */
        private boolean f4096c;

        /* renamed from: d */
        private long f4097d;

        /* renamed from: e */
        private long f4098e;

        /* renamed from: f */
        private boolean f4099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, long j) {
            super(sVar);
            d.this = r1;
            this.f4097d = j;
        }

        @Nullable
        private IOException a(@Nullable IOException iOException) {
            if (this.f4096c) {
                return iOException;
            }
            this.f4096c = true;
            return d.this.a(this.f4098e, false, true, iOException);
        }

        @Override // f.g, f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4099f) {
                return;
            }
            this.f4099f = true;
            long j = this.f4097d;
            if (j != -1 && this.f4098e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e2) {
                throw a(e2);
            }
        }

        @Override // f.g, f.s, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e2) {
                throw a(e2);
            }
        }

        @Override // f.g, f.s
        public void i(f.c cVar, long j) {
            if (!this.f4099f) {
                long j2 = this.f4097d;
                if (j2 == -1 || this.f4098e + j <= j2) {
                    try {
                        super.i(cVar, j);
                        this.f4098e += j;
                        return;
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                }
                throw new ProtocolException("expected " + this.f4097d + " bytes but received " + (this.f4098e + j));
            }
            throw new IllegalStateException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b extends f.h {

        /* renamed from: c */
        private final long f4101c;

        /* renamed from: d */
        private long f4102d;

        /* renamed from: e */
        private boolean f4103e;

        /* renamed from: f */
        private boolean f4104f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar, long j) {
            super(tVar);
            d.this = r2;
            this.f4101c = j;
            if (j == 0) {
                c(null);
            }
        }

        @Nullable
        IOException c(@Nullable IOException iOException) {
            if (this.f4103e) {
                return iOException;
            }
            this.f4103e = true;
            return d.this.a(this.f4102d, true, false, iOException);
        }

        @Override // f.h, f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4104f) {
                return;
            }
            this.f4104f = true;
            try {
                super.close();
                c(null);
            } catch (IOException e2) {
                throw c(e2);
            }
        }

        @Override // f.h, f.t
        public long q(f.c cVar, long j) {
            if (!this.f4104f) {
                try {
                    long q = a().q(cVar, j);
                    if (q == -1) {
                        c(null);
                        return -1L;
                    }
                    long j2 = this.f4102d + q;
                    long j3 = this.f4101c;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.f4101c + " bytes but received " + j2);
                    }
                    this.f4102d = j2;
                    if (j2 == j3) {
                        c(null);
                    }
                    return q;
                } catch (IOException e2) {
                    throw c(e2);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    public d(k kVar, e.j jVar, v vVar, e eVar, e.m0.i.c cVar) {
        this.f4090a = kVar;
        this.f4091b = jVar;
        this.f4092c = vVar;
        this.f4093d = eVar;
        this.f4094e = cVar;
    }

    @Nullable
    IOException a(long j, boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            o(iOException);
        }
        if (z2) {
            v vVar = this.f4092c;
            e.j jVar = this.f4091b;
            if (iOException != null) {
                vVar.o(jVar, iOException);
            } else {
                vVar.m(jVar, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f4092c.t(this.f4091b, iOException);
            } else {
                this.f4092c.r(this.f4091b, j);
            }
        }
        return this.f4090a.g(this, z2, z, iOException);
    }

    public void b() {
        this.f4094e.cancel();
    }

    public f c() {
        return this.f4094e.h();
    }

    public s d(g0 g0Var, boolean z) {
        this.f4095f = z;
        long a2 = g0Var.a().a();
        this.f4092c.n(this.f4091b);
        return new a(this.f4094e.d(g0Var, a2), a2);
    }

    public void e() {
        this.f4094e.cancel();
        this.f4090a.g(this, true, true, null);
    }

    public void f() {
        try {
            this.f4094e.a();
        } catch (IOException e2) {
            this.f4092c.o(this.f4091b, e2);
            o(e2);
            throw e2;
        }
    }

    public void g() {
        try {
            this.f4094e.c();
        } catch (IOException e2) {
            this.f4092c.o(this.f4091b, e2);
            o(e2);
            throw e2;
        }
    }

    public boolean h() {
        return this.f4095f;
    }

    public void i() {
        this.f4094e.h().p();
    }

    public void j() {
        this.f4090a.g(this, true, false, null);
    }

    public j0 k(i0 i0Var) {
        try {
            this.f4092c.s(this.f4091b);
            String N = i0Var.N("Content-Type");
            long e2 = this.f4094e.e(i0Var);
            return new e.m0.i.h(N, e2, l.b(new b(this.f4094e.f(i0Var), e2)));
        } catch (IOException e3) {
            this.f4092c.t(this.f4091b, e3);
            o(e3);
            throw e3;
        }
    }

    @Nullable
    public i0.a l(boolean z) {
        try {
            i0.a g2 = this.f4094e.g(z);
            if (g2 != null) {
                e.m0.c.f4060a.g(g2, this);
            }
            return g2;
        } catch (IOException e2) {
            this.f4092c.t(this.f4091b, e2);
            o(e2);
            throw e2;
        }
    }

    public void m(i0 i0Var) {
        this.f4092c.u(this.f4091b, i0Var);
    }

    public void n() {
        this.f4092c.v(this.f4091b);
    }

    void o(IOException iOException) {
        this.f4093d.h();
        this.f4094e.h().v(iOException);
    }

    public void p(g0 g0Var) {
        try {
            this.f4092c.q(this.f4091b);
            this.f4094e.b(g0Var);
            this.f4092c.p(this.f4091b, g0Var);
        } catch (IOException e2) {
            this.f4092c.o(this.f4091b, e2);
            o(e2);
            throw e2;
        }
    }
}
