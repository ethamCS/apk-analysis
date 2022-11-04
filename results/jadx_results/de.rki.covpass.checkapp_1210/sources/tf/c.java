package tf;

import cg.d;
import eg.a0;
import eg.n;
import eg.y;
import hc.t;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import of.b0;
import of.c0;
import of.r;
import of.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\"\u001bB'\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J9\u0010\"\u001a\u00028\u0000\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u0006\u0010$\u001a\u00020\u0004R\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u00108¨\u0006D"}, d2 = {"Ltf/c;", BuildConfig.FLAVOR, "Ljava/io/IOException;", "e", "Ltb/e0;", "t", "Lof/z;", "request", "v", BuildConfig.FLAVOR, "duplex", "Leg/y;", "c", "f", "s", "expectContinue", "Lof/b0$a;", "q", "Lof/b0;", "response", "r", "Lof/c0;", "p", "Lcg/d$d;", "m", "u", "n", "b", "d", "E", BuildConfig.FLAVOR, "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "Ltf/e;", "call", "Ltf/e;", "g", "()Ltf/e;", "Lof/r;", "eventListener", "Lof/r;", "i", "()Lof/r;", "Ltf/d;", "finder", "Ltf/d;", "j", "()Ltf/d;", "<set-?>", "isDuplex", "Z", "l", "()Z", "Ltf/f;", "connection", "Ltf/f;", "h", "()Ltf/f;", "k", "isCoalescedConnection", "Luf/d;", "codec", "<init>", "(Ltf/e;Lof/r;Ltf/d;Luf/d;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private final e f22234a;

    /* renamed from: b */
    private final r f22235b;

    /* renamed from: c */
    private final d f22236c;

    /* renamed from: d */
    private final uf.d f22237d;

    /* renamed from: e */
    private boolean f22238e;

    /* renamed from: f */
    private final f f22239f;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016¨\u0006\u0014"}, d2 = {"Ltf/c$a;", "Leg/h;", "Ljava/io/IOException;", "E", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "close", "Leg/y;", "delegate", "contentLength", "<init>", "(Ltf/c;Leg/y;J)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class a extends eg.h {
        final /* synthetic */ c U3;

        /* renamed from: d */
        private final long f22240d;

        /* renamed from: q */
        private boolean f22241q;

        /* renamed from: x */
        private long f22242x;

        /* renamed from: y */
        private boolean f22243y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, y yVar, long j10) {
            super(yVar);
            t.e(cVar, "this$0");
            t.e(yVar, "delegate");
            this.U3 = cVar;
            this.f22240d = j10;
        }

        private final <E extends IOException> E b(E e10) {
            if (this.f22241q) {
                return e10;
            }
            this.f22241q = true;
            return (E) this.U3.a(this.f22242x, false, true, e10);
        }

        @Override // eg.h, eg.y
        public void O(eg.c cVar, long j10) {
            t.e(cVar, "source");
            if (!this.f22243y) {
                long j11 = this.f22240d;
                if (j11 == -1 || this.f22242x + j10 <= j11) {
                    try {
                        super.O(cVar, j10);
                        this.f22242x += j10;
                        return;
                    } catch (IOException e10) {
                        throw b(e10);
                    }
                }
                throw new ProtocolException("expected " + this.f22240d + " bytes but received " + (this.f22242x + j10));
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // eg.h, eg.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f22243y) {
                return;
            }
            this.f22243y = true;
            long j10 = this.f22240d;
            if (j10 != -1 && this.f22242x != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // eg.h, eg.y, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Ltf/c$b;", "Leg/i;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Ltb/e0;", "close", "Ljava/io/IOException;", "E", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "Leg/a0;", "delegate", "contentLength", "<init>", "(Ltf/c;Leg/a0;J)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class b extends eg.i {
        private boolean U3;
        final /* synthetic */ c V3;

        /* renamed from: d */
        private final long f22244d;

        /* renamed from: q */
        private long f22245q;

        /* renamed from: x */
        private boolean f22246x = true;

        /* renamed from: y */
        private boolean f22247y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, a0 a0Var, long j10) {
            super(a0Var);
            t.e(cVar, "this$0");
            t.e(a0Var, "delegate");
            this.V3 = cVar;
            this.f22244d = j10;
            if (j10 == 0) {
                e(null);
            }
        }

        @Override // eg.i, eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.U3) {
                return;
            }
            this.U3 = true;
            try {
                super.close();
                e(null);
            } catch (IOException e10) {
                throw e(e10);
            }
        }

        public final <E extends IOException> E e(E e10) {
            if (this.f22247y) {
                return e10;
            }
            this.f22247y = true;
            if (e10 == null && this.f22246x) {
                this.f22246x = false;
                this.V3.i().w(this.V3.g());
            }
            return (E) this.V3.a(this.f22245q, true, false, e10);
        }

        @Override // eg.i, eg.a0
        public long g1(eg.c cVar, long j10) {
            t.e(cVar, "sink");
            if (!this.U3) {
                try {
                    long g12 = b().g1(cVar, j10);
                    if (this.f22246x) {
                        this.f22246x = false;
                        this.V3.i().w(this.V3.g());
                    }
                    if (g12 == -1) {
                        e(null);
                        return -1L;
                    }
                    long j11 = this.f22245q + g12;
                    long j12 = this.f22244d;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.f22244d + " bytes but received " + j11);
                    }
                    this.f22245q = j11;
                    if (j11 == j12) {
                        e(null);
                    }
                    return g12;
                } catch (IOException e10) {
                    throw e(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public c(e eVar, r rVar, d dVar, uf.d dVar2) {
        t.e(eVar, "call");
        t.e(rVar, "eventListener");
        t.e(dVar, "finder");
        t.e(dVar2, "codec");
        this.f22234a = eVar;
        this.f22235b = rVar;
        this.f22236c = dVar;
        this.f22237d = dVar2;
        this.f22239f = dVar2.h();
    }

    private final void t(IOException iOException) {
        this.f22236c.h(iOException);
        this.f22237d.h().I(this.f22234a, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            t(e10);
        }
        if (z11) {
            r rVar = this.f22235b;
            e eVar = this.f22234a;
            if (e10 != null) {
                rVar.s(eVar, e10);
            } else {
                rVar.q(eVar, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f22235b.x(this.f22234a, e10);
            } else {
                this.f22235b.v(this.f22234a, j10);
            }
        }
        return (E) this.f22234a.w(this, z11, z10, e10);
    }

    public final void b() {
        this.f22237d.cancel();
    }

    public final y c(z zVar, boolean z10) {
        t.e(zVar, "request");
        this.f22238e = z10;
        of.a0 a10 = zVar.a();
        t.b(a10);
        long a11 = a10.a();
        this.f22235b.r(this.f22234a);
        return new a(this, this.f22237d.f(zVar, a11), a11);
    }

    public final void d() {
        this.f22237d.cancel();
        this.f22234a.w(this, true, true, null);
    }

    public final void e() {
        try {
            this.f22237d.c();
        } catch (IOException e10) {
            this.f22235b.s(this.f22234a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f22237d.d();
        } catch (IOException e10) {
            this.f22235b.s(this.f22234a, e10);
            t(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f22234a;
    }

    public final f h() {
        return this.f22239f;
    }

    public final r i() {
        return this.f22235b;
    }

    public final d j() {
        return this.f22236c;
    }

    public final boolean k() {
        return !t.a(this.f22236c.d().l().h(), this.f22239f.B().a().l().h());
    }

    public final boolean l() {
        return this.f22238e;
    }

    public final d.AbstractC0092d m() {
        this.f22234a.D();
        return this.f22237d.h().y(this);
    }

    public final void n() {
        this.f22237d.h().A();
    }

    public final void o() {
        this.f22234a.w(this, true, false, null);
    }

    public final c0 p(b0 b0Var) {
        t.e(b0Var, "response");
        try {
            String r10 = b0.r(b0Var, "Content-Type", null, 2, null);
            long a10 = this.f22237d.a(b0Var);
            return new uf.h(r10, a10, n.d(new b(this, this.f22237d.e(b0Var), a10)));
        } catch (IOException e10) {
            this.f22235b.x(this.f22234a, e10);
            t(e10);
            throw e10;
        }
    }

    public final b0.a q(boolean z10) {
        try {
            b0.a g10 = this.f22237d.g(z10);
            if (g10 != null) {
                g10.m(this);
            }
            return g10;
        } catch (IOException e10) {
            this.f22235b.x(this.f22234a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(b0 b0Var) {
        t.e(b0Var, "response");
        this.f22235b.y(this.f22234a, b0Var);
    }

    public final void s() {
        this.f22235b.z(this.f22234a);
    }

    public final void u() {
        a(-1L, true, true, null);
    }

    public final void v(z zVar) {
        t.e(zVar, "request");
        try {
            this.f22235b.u(this.f22234a);
            this.f22237d.b(zVar);
            this.f22235b.t(this.f22234a, zVar);
        } catch (IOException e10) {
            this.f22235b.s(this.f22234a, e10);
            t(e10);
            throw e10;
        }
    }
}
