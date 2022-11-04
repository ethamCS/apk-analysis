package e;

import e.y;
import java.io.Closeable;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i0 implements Closeable {

    /* renamed from: b */
    final g0 f4008b;

    /* renamed from: c */
    final e0 f4009c;

    /* renamed from: d */
    final int f4010d;

    /* renamed from: e */
    final String f4011e;
    @Nullable

    /* renamed from: f */
    final x f4012f;

    /* renamed from: g */
    final y f4013g;
    @Nullable

    /* renamed from: h */
    final j0 f4014h;
    @Nullable
    final i0 i;
    @Nullable
    final i0 j;
    @Nullable
    final i0 k;
    final long l;
    final long m;
    @Nullable
    final e.m0.h.d n;
    @Nullable
    private volatile i o;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a */
        g0 f4015a;
        @Nullable

        /* renamed from: b */
        e0 f4016b;

        /* renamed from: c */
        int f4017c;

        /* renamed from: d */
        String f4018d;
        @Nullable

        /* renamed from: e */
        x f4019e;

        /* renamed from: f */
        y.a f4020f;
        @Nullable

        /* renamed from: g */
        j0 f4021g;
        @Nullable

        /* renamed from: h */
        i0 f4022h;
        @Nullable
        i0 i;
        @Nullable
        i0 j;
        long k;
        long l;
        @Nullable
        e.m0.h.d m;

        public a() {
            this.f4017c = -1;
            this.f4020f = new y.a();
        }

        a(i0 i0Var) {
            this.f4017c = -1;
            this.f4015a = i0Var.f4008b;
            this.f4016b = i0Var.f4009c;
            this.f4017c = i0Var.f4010d;
            this.f4018d = i0Var.f4011e;
            this.f4019e = i0Var.f4012f;
            this.f4020f = i0Var.f4013g.f();
            this.f4021g = i0Var.f4014h;
            this.f4022h = i0Var.i;
            this.i = i0Var.j;
            this.j = i0Var.k;
            this.k = i0Var.l;
            this.l = i0Var.m;
            this.m = i0Var.n;
        }

        private void e(i0 i0Var) {
            if (i0Var.f4014h == null) {
                return;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        private void f(String str, i0 i0Var) {
            if (i0Var.f4014h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (i0Var.i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (i0Var.j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (i0Var.k == null) {
            } else {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public a a(String str, String str2) {
            this.f4020f.a(str, str2);
            return this;
        }

        public a b(@Nullable j0 j0Var) {
            this.f4021g = j0Var;
            return this;
        }

        public i0 c() {
            if (this.f4015a != null) {
                if (this.f4016b == null) {
                    throw new IllegalStateException("protocol == null");
                }
                if (this.f4017c >= 0) {
                    if (this.f4018d == null) {
                        throw new IllegalStateException("message == null");
                    }
                    return new i0(this);
                }
                throw new IllegalStateException("code < 0: " + this.f4017c);
            }
            throw new IllegalStateException("request == null");
        }

        public a d(@Nullable i0 i0Var) {
            if (i0Var != null) {
                f("cacheResponse", i0Var);
            }
            this.i = i0Var;
            return this;
        }

        public a g(int i) {
            this.f4017c = i;
            return this;
        }

        public a h(@Nullable x xVar) {
            this.f4019e = xVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f4020f.g(str, str2);
            return this;
        }

        public a j(y yVar) {
            this.f4020f = yVar.f();
            return this;
        }

        public void k(e.m0.h.d dVar) {
            this.m = dVar;
        }

        public a l(String str) {
            this.f4018d = str;
            return this;
        }

        public a m(@Nullable i0 i0Var) {
            if (i0Var != null) {
                f("networkResponse", i0Var);
            }
            this.f4022h = i0Var;
            return this;
        }

        public a n(@Nullable i0 i0Var) {
            if (i0Var != null) {
                e(i0Var);
            }
            this.j = i0Var;
            return this;
        }

        public a o(e0 e0Var) {
            this.f4016b = e0Var;
            return this;
        }

        public a p(long j) {
            this.l = j;
            return this;
        }

        public a q(g0 g0Var) {
            this.f4015a = g0Var;
            return this;
        }

        public a r(long j) {
            this.k = j;
            return this;
        }
    }

    i0(a aVar) {
        this.f4008b = aVar.f4015a;
        this.f4009c = aVar.f4016b;
        this.f4010d = aVar.f4017c;
        this.f4011e = aVar.f4018d;
        this.f4012f = aVar.f4019e;
        this.f4013g = aVar.f4020f.e();
        this.f4014h = aVar.f4021g;
        this.i = aVar.f4022h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
    }

    @Nullable
    public x I() {
        return this.f4012f;
    }

    @Nullable
    public String N(String str) {
        return f0(str, null);
    }

    @Nullable
    public j0 a() {
        return this.f4014h;
    }

    public i c() {
        i iVar = this.o;
        if (iVar != null) {
            return iVar;
        }
        i k = i.k(this.f4013g);
        this.o = k;
        return k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j0 j0Var = this.f4014h;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    @Nullable
    public String f0(String str, @Nullable String str2) {
        String c2 = this.f4013g.c(str);
        return c2 != null ? c2 : str2;
    }

    public y g0() {
        return this.f4013g;
    }

    public boolean h0() {
        int i = this.f4010d;
        return i >= 200 && i < 300;
    }

    public String i0() {
        return this.f4011e;
    }

    public a j0() {
        return new a(this);
    }

    public int k() {
        return this.f4010d;
    }

    @Nullable
    public i0 k0() {
        return this.k;
    }

    public long l0() {
        return this.m;
    }

    public g0 m0() {
        return this.f4008b;
    }

    public long n0() {
        return this.l;
    }

    public String toString() {
        return "Response{protocol=" + this.f4009c + ", code=" + this.f4010d + ", message=" + this.f4011e + ", url=" + this.f4008b.i() + '}';
    }
}
