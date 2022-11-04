package vf;

import eg.a0;
import eg.b0;
import eg.j;
import eg.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.t;
import of.u;
import of.x;
import of.z;
import org.conscrypt.BuildConfig;
import uf.i;
import uf.k;
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0007\u0019\u0016\u001c\u001b\u001a\u0014%B)\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0018\u0010)\u001a\u00020\"*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u00020\"*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00069"}, d2 = {"Lvf/b;", "Luf/d;", "Leg/y;", "u", "x", BuildConfig.FLAVOR, "length", "Leg/a0;", "w", "Lof/u;", "url", "v", "y", "Leg/j;", "timeout", "Ltb/e0;", "r", "Lof/z;", "request", "contentLength", "f", "cancel", "b", "Lof/b0;", "response", "a", "e", "d", "c", "Lof/t;", "headers", BuildConfig.FLAVOR, "requestLine", "A", BuildConfig.FLAVOR, "expectContinue", "Lof/b0$a;", "g", "z", "t", "(Lof/b0;)Z", "isChunked", "s", "(Lof/z;)Z", "Ltf/f;", "connection", "Ltf/f;", "h", "()Ltf/f;", "Lof/x;", "client", "Leg/e;", "source", "Leg/d;", "sink", "<init>", "(Lof/x;Ltf/f;Leg/e;Leg/d;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b implements uf.d {
    public static final d Companion = new d(null);

    /* renamed from: a */
    private final x f24102a;

    /* renamed from: b */
    private final tf.f f24103b;

    /* renamed from: c */
    private final eg.e f24104c;

    /* renamed from: d */
    private final eg.d f24105d;

    /* renamed from: e */
    private int f24106e;

    /* renamed from: f */
    private final vf.a f24107f;

    /* renamed from: g */
    private t f24108g;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\"\u0010\f\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lvf/b$a;", "Leg/a0;", "Leg/b0;", "m", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Ltb/e0;", "e", BuildConfig.FLAVOR, "closed", "Z", "b", "()Z", "f", "(Z)V", "<init>", "(Lvf/b;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public abstract class a implements a0 {

        /* renamed from: c */
        private final j f24109c;

        /* renamed from: d */
        private boolean f24110d;

        /* renamed from: q */
        final /* synthetic */ b f24111q;

        public a(b bVar) {
            hc.t.e(bVar, "this$0");
            this.f24111q = bVar;
            this.f24109c = new j(bVar.f24104c.m());
        }

        protected final boolean b() {
            return this.f24110d;
        }

        public final void e() {
            if (this.f24111q.f24106e == 6) {
                return;
            }
            if (this.f24111q.f24106e != 5) {
                throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(this.f24111q.f24106e)));
            }
            this.f24111q.r(this.f24109c);
            this.f24111q.f24106e = 6;
        }

        protected final void f(boolean z10) {
            this.f24110d = z10;
        }

        @Override // eg.a0
        public long g1(eg.c cVar, long j10) {
            hc.t.e(cVar, "sink");
            try {
                return this.f24111q.f24104c.g1(cVar, j10);
            } catch (IOException e10) {
                this.f24111q.h().A();
                e();
                throw e10;
            }
        }

        @Override // eg.a0
        public b0 m() {
            return this.f24109c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lvf/b$b;", "Leg/y;", "Leg/b0;", "m", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "close", "<init>", "(Lvf/b;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: vf.b$b */
    /* loaded from: classes3.dex */
    public final class C0432b implements y {

        /* renamed from: c */
        private final j f24112c;

        /* renamed from: d */
        private boolean f24113d;

        /* renamed from: q */
        final /* synthetic */ b f24114q;

        public C0432b(b bVar) {
            hc.t.e(bVar, "this$0");
            this.f24114q = bVar;
            this.f24112c = new j(bVar.f24105d.m());
        }

        @Override // eg.y
        public void O(eg.c cVar, long j10) {
            hc.t.e(cVar, "source");
            if (!this.f24113d) {
                if (j10 == 0) {
                    return;
                }
                this.f24114q.f24105d.A(j10);
                this.f24114q.f24105d.Q0("\r\n");
                this.f24114q.f24105d.O(cVar, j10);
                this.f24114q.f24105d.Q0("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f24113d) {
                return;
            }
            this.f24113d = true;
            this.f24114q.f24105d.Q0("0\r\n\r\n");
            this.f24114q.r(this.f24112c);
            this.f24114q.f24106e = 3;
        }

        @Override // eg.y, java.io.Flushable
        public synchronized void flush() {
            if (this.f24113d) {
                return;
            }
            this.f24114q.f24105d.flush();
        }

        @Override // eg.y
        public b0 m() {
            return this.f24112c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"Lvf/b$c;", "Lvf/b$a;", "Lvf/b;", "Ltb/e0;", "h", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "close", "Lof/u;", "url", "<init>", "(Lvf/b;Lof/u;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class c extends a {
        final /* synthetic */ b V3;

        /* renamed from: x */
        private final u f24115x;

        /* renamed from: y */
        private long f24116y = -1;
        private boolean U3 = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u uVar) {
            super(bVar);
            hc.t.e(bVar, "this$0");
            hc.t.e(uVar, "url");
            this.V3 = bVar;
            this.f24115x = uVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r1 != false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void h() {
            /*
                r7 = this;
                long r0 = r7.f24116y
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                vf.b r0 = r7.V3
                eg.e r0 = vf.b.m(r0)
                r0.b0()
            L11:
                vf.b r0 = r7.V3     // Catch: java.lang.NumberFormatException -> La2
                eg.e r0 = vf.b.m(r0)     // Catch: java.lang.NumberFormatException -> La2
                long r0 = r0.b1()     // Catch: java.lang.NumberFormatException -> La2
                r7.f24116y = r0     // Catch: java.lang.NumberFormatException -> La2
                vf.b r0 = r7.V3     // Catch: java.lang.NumberFormatException -> La2
                eg.e r0 = vf.b.m(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.b0()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.CharSequence r0 = bf.o.S0(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> La2
                long r1 = r7.f24116y     // Catch: java.lang.NumberFormatException -> La2
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> La2
                r2 = 0
                if (r1 <= 0) goto L40
                r1 = 1
                goto L41
            L40:
                r1 = r2
            L41:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = bf.o.I(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> La2
                if (r1 == 0) goto L81
            L4d:
                long r0 = r7.f24116y
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L80
                r7.U3 = r2
                vf.b r0 = r7.V3
                vf.a r1 = vf.b.k(r0)
                of.t r1 = r1.a()
                vf.b.q(r0, r1)
                vf.b r0 = r7.V3
                of.x r0 = vf.b.j(r0)
                hc.t.b(r0)
                of.n r0 = r0.o()
                of.u r1 = r7.f24115x
                vf.b r2 = r7.V3
                of.t r2 = vf.b.o(r2)
                hc.t.b(r2)
                uf.e.f(r0, r1, r2)
                r7.e()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La2
                r2.<init>()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                long r3 = r7.f24116y     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La2
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> La2
                throw r1     // Catch: java.lang.NumberFormatException -> La2
            La2:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: vf.b.c.h():void");
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.U3 && !pf.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.V3.h().A();
                e();
            }
            f(true);
        }

        @Override // vf.b.a, eg.a0
        public long g1(eg.c cVar, long j10) {
            hc.t.e(cVar, "sink");
            if (j10 >= 0) {
                if (!(!b())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (!this.U3) {
                    return -1L;
                }
                long j11 = this.f24116y;
                if (j11 == 0 || j11 == -1) {
                    h();
                    if (!this.U3) {
                        return -1L;
                    }
                }
                long g12 = super.g1(cVar, Math.min(j10, this.f24116y));
                if (g12 != -1) {
                    this.f24116y -= g12;
                    return g12;
                }
                this.V3.h().A();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            }
            throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lvf/b$d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "NO_CHUNK_YET", "J", BuildConfig.FLAVOR, "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lvf/b$e;", "Lvf/b$a;", "Lvf/b;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Ltb/e0;", "close", "bytesRemaining", "<init>", "(Lvf/b;J)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class e extends a {

        /* renamed from: x */
        private long f24117x;

        /* renamed from: y */
        final /* synthetic */ b f24118y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, long j10) {
            super(bVar);
            hc.t.e(bVar, "this$0");
            this.f24118y = bVar;
            this.f24117x = j10;
            if (j10 == 0) {
                e();
            }
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.f24117x != 0 && !pf.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f24118y.h().A();
                e();
            }
            f(true);
        }

        @Override // vf.b.a, eg.a0
        public long g1(eg.c cVar, long j10) {
            hc.t.e(cVar, "sink");
            if (j10 >= 0) {
                if (!(!b())) {
                    throw new IllegalStateException("closed".toString());
                }
                long j11 = this.f24117x;
                if (j11 == 0) {
                    return -1L;
                }
                long g12 = super.g1(cVar, Math.min(j11, j10));
                if (g12 == -1) {
                    this.f24118y.h().A();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    e();
                    throw protocolException;
                }
                long j12 = this.f24117x - g12;
                this.f24117x = j12;
                if (j12 == 0) {
                    e();
                }
                return g12;
            }
            throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lvf/b$f;", "Leg/y;", "Leg/b0;", "m", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "close", "<init>", "(Lvf/b;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class f implements y {

        /* renamed from: c */
        private final j f24119c;

        /* renamed from: d */
        private boolean f24120d;

        /* renamed from: q */
        final /* synthetic */ b f24121q;

        public f(b bVar) {
            hc.t.e(bVar, "this$0");
            this.f24121q = bVar;
            this.f24119c = new j(bVar.f24105d.m());
        }

        @Override // eg.y
        public void O(eg.c cVar, long j10) {
            hc.t.e(cVar, "source");
            if (!this.f24120d) {
                pf.d.l(cVar.e1(), 0L, j10);
                this.f24121q.f24105d.O(cVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f24120d) {
                return;
            }
            this.f24120d = true;
            this.f24121q.r(this.f24119c);
            this.f24121q.f24106e = 3;
        }

        @Override // eg.y, java.io.Flushable
        public void flush() {
            if (this.f24120d) {
                return;
            }
            this.f24121q.f24105d.flush();
        }

        @Override // eg.y
        public b0 m() {
            return this.f24119c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lvf/b$g;", "Lvf/b$a;", "Lvf/b;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Ltb/e0;", "close", "<init>", "(Lvf/b;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class g extends a {

        /* renamed from: x */
        private boolean f24122x;

        /* renamed from: y */
        final /* synthetic */ b f24123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar) {
            super(bVar);
            hc.t.e(bVar, "this$0");
            this.f24123y = bVar;
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (!this.f24122x) {
                e();
            }
            f(true);
        }

        @Override // vf.b.a, eg.a0
        public long g1(eg.c cVar, long j10) {
            hc.t.e(cVar, "sink");
            if (j10 >= 0) {
                if (!(!b())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (this.f24122x) {
                    return -1L;
                }
                long g12 = super.g1(cVar, j10);
                if (g12 != -1) {
                    return g12;
                }
                this.f24122x = true;
                e();
                return -1L;
            }
            throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
    }

    public b(x xVar, tf.f fVar, eg.e eVar, eg.d dVar) {
        hc.t.e(fVar, "connection");
        hc.t.e(eVar, "source");
        hc.t.e(dVar, "sink");
        this.f24102a = xVar;
        this.f24103b = fVar;
        this.f24104c = eVar;
        this.f24105d = dVar;
        this.f24107f = new vf.a(eVar);
    }

    public final void r(j jVar) {
        b0 i10 = jVar.i();
        jVar.j(b0.f9596d);
        i10.a();
        i10.b();
    }

    private final boolean s(z zVar) {
        boolean v10;
        v10 = bf.x.v("chunked", zVar.d("Transfer-Encoding"), true);
        return v10;
    }

    private final boolean t(of.b0 b0Var) {
        boolean v10;
        v10 = bf.x.v("chunked", of.b0.r(b0Var, "Transfer-Encoding", null, 2, null), true);
        return v10;
    }

    private final y u() {
        int i10 = this.f24106e;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10) {
            this.f24106e = 2;
            return new C0432b(this);
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    private final a0 v(u uVar) {
        int i10 = this.f24106e;
        if (i10 == 4) {
            this.f24106e = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    private final a0 w(long j10) {
        int i10 = this.f24106e;
        if (i10 == 4) {
            this.f24106e = 5;
            return new e(this, j10);
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    private final y x() {
        int i10 = this.f24106e;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10) {
            this.f24106e = 2;
            return new f(this);
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    private final a0 y() {
        int i10 = this.f24106e;
        if (i10 == 4) {
            this.f24106e = 5;
            h().A();
            return new g(this);
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    public final void A(t tVar, String str) {
        hc.t.e(tVar, "headers");
        hc.t.e(str, "requestLine");
        int i10 = this.f24106e;
        if (i10 == 0) {
            this.f24105d.Q0(str).Q0("\r\n");
            int size = tVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f24105d.Q0(tVar.b(i11)).Q0(": ").Q0(tVar.i(i11)).Q0("\r\n");
            }
            this.f24105d.Q0("\r\n");
            this.f24106e = 1;
            return;
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    @Override // uf.d
    public long a(of.b0 b0Var) {
        hc.t.e(b0Var, "response");
        if (!uf.e.b(b0Var)) {
            return 0L;
        }
        if (!t(b0Var)) {
            return pf.d.v(b0Var);
        }
        return -1L;
    }

    @Override // uf.d
    public void b(z zVar) {
        hc.t.e(zVar, "request");
        i iVar = i.f23624a;
        Proxy.Type type = h().B().b().type();
        hc.t.d(type, "connection.route().proxy.type()");
        A(zVar.f(), iVar.a(zVar, type));
    }

    @Override // uf.d
    public void c() {
        this.f24105d.flush();
    }

    @Override // uf.d
    public void cancel() {
        h().e();
    }

    @Override // uf.d
    public void d() {
        this.f24105d.flush();
    }

    @Override // uf.d
    public a0 e(of.b0 b0Var) {
        long v10;
        hc.t.e(b0Var, "response");
        if (!uf.e.b(b0Var)) {
            v10 = 0;
        } else if (t(b0Var)) {
            return v(b0Var.W().j());
        } else {
            v10 = pf.d.v(b0Var);
            if (v10 == -1) {
                return y();
            }
        }
        return w(v10);
    }

    @Override // uf.d
    public y f(z zVar, long j10) {
        hc.t.e(zVar, "request");
        if (zVar.a() == null || !zVar.a().c()) {
            if (s(zVar)) {
                return u();
            }
            if (j10 == -1) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            return x();
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    @Override // uf.d
    public b0.a g(boolean z10) {
        int i10 = this.f24106e;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (z11) {
            try {
                k a10 = k.Companion.a(this.f24107f.b());
                b0.a l10 = new b0.a().q(a10.f23626a).g(a10.f23627b).n(a10.f23628c).l(this.f24107f.a());
                if (z10 && a10.f23627b == 100) {
                    return null;
                }
                if (a10.f23627b == 100) {
                    this.f24106e = 3;
                    return l10;
                }
                this.f24106e = 4;
                return l10;
            } catch (EOFException e10) {
                throw new IOException(hc.t.l("unexpected end of stream on ", h().B().a().l().n()), e10);
            }
        }
        throw new IllegalStateException(hc.t.l("state: ", Integer.valueOf(i10)).toString());
    }

    @Override // uf.d
    public tf.f h() {
        return this.f24103b;
    }

    public final void z(of.b0 b0Var) {
        hc.t.e(b0Var, "response");
        long v10 = pf.d.v(b0Var);
        if (v10 == -1) {
            return;
        }
        a0 w9 = w(v10);
        pf.d.L(w9, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        w9.close();
    }
}
