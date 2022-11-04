package of;

import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import of.t;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001JB}\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010\u0000\u0012\b\u00104\u001a\u0004\u0018\u00010\u0000\u0012\b\u00106\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010=\u001a\u000208\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bH\u0010IJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u00104\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u00106\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0017\u00109\u001a\u0002088\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\u0002088\u0007¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001c\u0010@\u001a\u0004\u0018\u00010?8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0011\u0010G\u001a\u00020D8G¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006K"}, d2 = {"Lof/b0;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "name", "defaultValue", "p", "Lof/b0$a;", "B", BuildConfig.FLAVOR, "Lof/h;", "h", "Ltb/e0;", "close", "toString", "Lof/z;", "request", "Lof/z;", "W", "()Lof/z;", "Lof/y;", "protocol", "Lof/y;", "M", "()Lof/y;", "message", "Ljava/lang/String;", "u", "()Ljava/lang/String;", BuildConfig.FLAVOR, "code", "I", "i", "()I", "Lof/s;", "handshake", "Lof/s;", "n", "()Lof/s;", "Lof/t;", "headers", "Lof/t;", "s", "()Lof/t;", "Lof/c0;", "body", "Lof/c0;", "b", "()Lof/c0;", "networkResponse", "Lof/b0;", "z", "()Lof/b0;", "cacheResponse", "f", "priorResponse", "G", BuildConfig.FLAVOR, "sentRequestAtMillis", "J", "e0", "()J", "receivedResponseAtMillis", "V", "Ltf/c;", "exchange", "Ltf/c;", "j", "()Ltf/c;", "Lof/d;", "e", "()Lof/d;", "cacheControl", "<init>", "(Lof/z;Lof/y;Ljava/lang/String;ILof/s;Lof/t;Lof/c0;Lof/b0;Lof/b0;Lof/b0;JJLtf/c;)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b0 implements Closeable {
    private final t U3;
    private final c0 V3;
    private final b0 W3;
    private final b0 X3;
    private final b0 Y3;
    private final long Z3;

    /* renamed from: a4 */
    private final long f18081a4;

    /* renamed from: b4 */
    private final tf.c f18082b4;

    /* renamed from: c */
    private final z f18083c;

    /* renamed from: c4 */
    private d f18084c4;

    /* renamed from: d */
    private final y f18085d;

    /* renamed from: q */
    private final String f18086q;

    /* renamed from: x */
    private final int f18087x;

    /* renamed from: y */
    private final s f18088y;

    @Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bd\u0010eB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bd\u0010XJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&H\u0016J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001b\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010)\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010]\u001a\u0004\bb\u0010_\"\u0004\bc\u0010a¨\u0006f"}, d2 = {"Lof/b0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "Lof/b0;", "response", "Ltb/e0;", "f", "e", "Lof/z;", "request", "s", "Lof/y;", "protocol", "q", BuildConfig.FLAVOR, "code", "g", "message", "n", "Lof/s;", "handshake", "j", "value", "k", "a", "Lof/t;", "headers", "l", "Lof/c0;", "body", "b", "networkResponse", "o", "cacheResponse", "d", "priorResponse", "p", BuildConfig.FLAVOR, "sentRequestAtMillis", "t", "receivedResponseAtMillis", "r", "Ltf/c;", "deferredTrailers", "m", "(Ltf/c;)V", "c", "Lof/z;", "getRequest$okhttp", "()Lof/z;", "E", "(Lof/z;)V", "Lof/y;", "getProtocol$okhttp", "()Lof/y;", "C", "(Lof/y;)V", "I", "h", "()I", "w", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "z", "(Ljava/lang/String;)V", "Lof/s;", "getHandshake$okhttp", "()Lof/s;", "x", "(Lof/s;)V", "Lof/t$a;", "Lof/t$a;", "i", "()Lof/t$a;", "y", "(Lof/t$a;)V", "Lof/c0;", "getBody$okhttp", "()Lof/c0;", "u", "(Lof/c0;)V", "Lof/b0;", "getNetworkResponse$okhttp", "()Lof/b0;", "A", "(Lof/b0;)V", "getCacheResponse$okhttp", "v", "getPriorResponse$okhttp", "B", "J", "getSentRequestAtMillis$okhttp", "()J", "F", "(J)V", "getReceivedResponseAtMillis$okhttp", "D", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private z f18089a;

        /* renamed from: b */
        private y f18090b;

        /* renamed from: c */
        private int f18091c;

        /* renamed from: d */
        private String f18092d;

        /* renamed from: e */
        private s f18093e;

        /* renamed from: f */
        private t.a f18094f;

        /* renamed from: g */
        private c0 f18095g;

        /* renamed from: h */
        private b0 f18096h;

        /* renamed from: i */
        private b0 f18097i;

        /* renamed from: j */
        private b0 f18098j;

        /* renamed from: k */
        private long f18099k;

        /* renamed from: l */
        private long f18100l;

        /* renamed from: m */
        private tf.c f18101m;

        public a() {
            this.f18091c = -1;
            this.f18094f = new t.a();
        }

        public a(b0 b0Var) {
            hc.t.e(b0Var, "response");
            this.f18091c = -1;
            this.f18089a = b0Var.W();
            this.f18090b = b0Var.M();
            this.f18091c = b0Var.i();
            this.f18092d = b0Var.u();
            this.f18093e = b0Var.n();
            this.f18094f = b0Var.s().e();
            this.f18095g = b0Var.b();
            this.f18096h = b0Var.z();
            this.f18097i = b0Var.f();
            this.f18098j = b0Var.G();
            this.f18099k = b0Var.e0();
            this.f18100l = b0Var.V();
            this.f18101m = b0Var.j();
        }

        private final void e(b0 b0Var) {
            if (b0Var == null) {
                return;
            }
            if (!(b0Var.b() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void f(String str, b0 b0Var) {
            if (b0Var == null) {
                return;
            }
            boolean z10 = true;
            if (!(b0Var.b() == null)) {
                throw new IllegalArgumentException(hc.t.l(str, ".body != null").toString());
            }
            if (!(b0Var.z() == null)) {
                throw new IllegalArgumentException(hc.t.l(str, ".networkResponse != null").toString());
            }
            if (!(b0Var.f() == null)) {
                throw new IllegalArgumentException(hc.t.l(str, ".cacheResponse != null").toString());
            }
            if (b0Var.G() != null) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(hc.t.l(str, ".priorResponse != null").toString());
            }
        }

        public final void A(b0 b0Var) {
            this.f18096h = b0Var;
        }

        public final void B(b0 b0Var) {
            this.f18098j = b0Var;
        }

        public final void C(y yVar) {
            this.f18090b = yVar;
        }

        public final void D(long j10) {
            this.f18100l = j10;
        }

        public final void E(z zVar) {
            this.f18089a = zVar;
        }

        public final void F(long j10) {
            this.f18099k = j10;
        }

        public a a(String str, String str2) {
            hc.t.e(str, "name");
            hc.t.e(str2, "value");
            i().a(str, str2);
            return this;
        }

        public a b(c0 c0Var) {
            u(c0Var);
            return this;
        }

        public b0 c() {
            int i10 = this.f18091c;
            if (i10 >= 0) {
                z zVar = this.f18089a;
                if (zVar == null) {
                    throw new IllegalStateException("request == null".toString());
                }
                y yVar = this.f18090b;
                if (yVar == null) {
                    throw new IllegalStateException("protocol == null".toString());
                }
                String str = this.f18092d;
                if (str == null) {
                    throw new IllegalStateException("message == null".toString());
                }
                return new b0(zVar, yVar, str, i10, this.f18093e, this.f18094f.d(), this.f18095g, this.f18096h, this.f18097i, this.f18098j, this.f18099k, this.f18100l, this.f18101m);
            }
            throw new IllegalStateException(hc.t.l("code < 0: ", Integer.valueOf(h())).toString());
        }

        public a d(b0 b0Var) {
            f("cacheResponse", b0Var);
            v(b0Var);
            return this;
        }

        public a g(int i10) {
            w(i10);
            return this;
        }

        public final int h() {
            return this.f18091c;
        }

        public final t.a i() {
            return this.f18094f;
        }

        public a j(s sVar) {
            x(sVar);
            return this;
        }

        public a k(String str, String str2) {
            hc.t.e(str, "name");
            hc.t.e(str2, "value");
            i().h(str, str2);
            return this;
        }

        public a l(t tVar) {
            hc.t.e(tVar, "headers");
            y(tVar.e());
            return this;
        }

        public final void m(tf.c cVar) {
            hc.t.e(cVar, "deferredTrailers");
            this.f18101m = cVar;
        }

        public a n(String str) {
            hc.t.e(str, "message");
            z(str);
            return this;
        }

        public a o(b0 b0Var) {
            f("networkResponse", b0Var);
            A(b0Var);
            return this;
        }

        public a p(b0 b0Var) {
            e(b0Var);
            B(b0Var);
            return this;
        }

        public a q(y yVar) {
            hc.t.e(yVar, "protocol");
            C(yVar);
            return this;
        }

        public a r(long j10) {
            D(j10);
            return this;
        }

        public a s(z zVar) {
            hc.t.e(zVar, "request");
            E(zVar);
            return this;
        }

        public a t(long j10) {
            F(j10);
            return this;
        }

        public final void u(c0 c0Var) {
            this.f18095g = c0Var;
        }

        public final void v(b0 b0Var) {
            this.f18097i = b0Var;
        }

        public final void w(int i10) {
            this.f18091c = i10;
        }

        public final void x(s sVar) {
            this.f18093e = sVar;
        }

        public final void y(t.a aVar) {
            hc.t.e(aVar, "<set-?>");
            this.f18094f = aVar;
        }

        public final void z(String str) {
            this.f18092d = str;
        }
    }

    public b0(z zVar, y yVar, String str, int i10, s sVar, t tVar, c0 c0Var, b0 b0Var, b0 b0Var2, b0 b0Var3, long j10, long j11, tf.c cVar) {
        hc.t.e(zVar, "request");
        hc.t.e(yVar, "protocol");
        hc.t.e(str, "message");
        hc.t.e(tVar, "headers");
        this.f18083c = zVar;
        this.f18085d = yVar;
        this.f18086q = str;
        this.f18087x = i10;
        this.f18088y = sVar;
        this.U3 = tVar;
        this.V3 = c0Var;
        this.W3 = b0Var;
        this.X3 = b0Var2;
        this.Y3 = b0Var3;
        this.Z3 = j10;
        this.f18081a4 = j11;
        this.f18082b4 = cVar;
    }

    public static /* synthetic */ String r(b0 b0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return b0Var.p(str, str2);
    }

    public final a B() {
        return new a(this);
    }

    public final b0 G() {
        return this.Y3;
    }

    public final y M() {
        return this.f18085d;
    }

    public final long V() {
        return this.f18081a4;
    }

    public final z W() {
        return this.f18083c;
    }

    public final c0 b() {
        return this.V3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c0 c0Var = this.V3;
        if (c0Var != null) {
            c0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final d e() {
        d dVar = this.f18084c4;
        if (dVar == null) {
            d b10 = d.Companion.b(this.U3);
            this.f18084c4 = b10;
            return b10;
        }
        return dVar;
    }

    public final long e0() {
        return this.Z3;
    }

    public final b0 f() {
        return this.X3;
    }

    public final List<h> h() {
        String str;
        List<h> h10;
        t tVar = this.U3;
        int i10 = this.f18087x;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            h10 = ub.u.h();
            return h10;
        } else {
            str = "Proxy-Authenticate";
        }
        return uf.e.a(tVar, str);
    }

    public final int i() {
        return this.f18087x;
    }

    public final tf.c j() {
        return this.f18082b4;
    }

    public final s n() {
        return this.f18088y;
    }

    public final String p(String str, String str2) {
        hc.t.e(str, "name");
        String a10 = this.U3.a(str);
        return a10 == null ? str2 : a10;
    }

    public final t s() {
        return this.U3;
    }

    public String toString() {
        return "Response{protocol=" + this.f18085d + ", code=" + this.f18087x + ", message=" + this.f18086q + ", url=" + this.f18083c.j() + '}';
    }

    public final String u() {
        return this.f18086q;
    }

    public final b0 z() {
        return this.W3;
    }
}
