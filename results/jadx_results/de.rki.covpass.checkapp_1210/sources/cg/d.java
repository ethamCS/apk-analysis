package cg;

import bf.x;
import cg.g;
import eg.f;
import hc.t;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.f0;
import of.g0;
import of.r;
import of.y;
import of.z;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0005)'(# BA\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010?\u001a\u00020*\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010A\u001a\u00020*¢\u0006\u0004\bB\u0010CJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010,\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010+\u001a\u00020*J\u000f\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b/\u00100J\u001c\u00103\u001a\u00020\u000b2\n\u0010 \u001a\u000601j\u0002`22\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u001a\u00105\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006D"}, d2 = {"Lcg/d;", "Lof/f0;", "Lcg/g$a;", "Lcg/e;", BuildConfig.FLAVOR, "s", "Leg/f;", "data", BuildConfig.FLAVOR, "formatOpcode", "v", "Ltb/e0;", "u", "cancel", "Lof/x;", "client", "o", "Lof/b0;", "response", "Ltf/c;", "exchange", "m", "(Lof/b0;Ltf/c;)V", BuildConfig.FLAVOR, "name", "Lcg/d$d;", "streams", "r", "t", "text", "f", "bytes", "e", "payload", "g", "d", "code", "reason", "h", "b", "c", "a", BuildConfig.FLAVOR, "cancelAfterCloseMillis", "n", "w", "()Z", "x", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p", "Lof/g0;", "listener", "Lof/g0;", "q", "()Lof/g0;", "Lsf/e;", "taskRunner", "Lof/z;", "originalRequest", "Ljava/util/Random;", "random", "pingIntervalMillis", "extensions", "minimumDeflateSize", "<init>", "(Lsf/e;Lof/z;Lof/g0;Ljava/util/Random;JLcg/e;J)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d implements f0, g.a {
    public static final b Companion = new b(null);

    /* renamed from: z */
    private static final List<y> f6489z;

    /* renamed from: a */
    private final z f6490a;

    /* renamed from: b */
    private final g0 f6491b;

    /* renamed from: c */
    private final Random f6492c;

    /* renamed from: d */
    private final long f6493d;

    /* renamed from: e */
    private cg.e f6494e;

    /* renamed from: f */
    private long f6495f;

    /* renamed from: g */
    private final String f6496g;

    /* renamed from: h */
    private of.e f6497h;

    /* renamed from: i */
    private sf.a f6498i;

    /* renamed from: j */
    private cg.g f6499j;

    /* renamed from: k */
    private cg.h f6500k;

    /* renamed from: l */
    private sf.d f6501l;

    /* renamed from: m */
    private String f6502m;

    /* renamed from: n */
    private AbstractC0092d f6503n;

    /* renamed from: q */
    private long f6506q;

    /* renamed from: r */
    private boolean f6507r;

    /* renamed from: t */
    private String f6509t;

    /* renamed from: u */
    private boolean f6510u;

    /* renamed from: v */
    private int f6511v;

    /* renamed from: w */
    private int f6512w;

    /* renamed from: x */
    private int f6513x;

    /* renamed from: y */
    private boolean f6514y;

    /* renamed from: o */
    private final ArrayDeque<eg.f> f6504o = new ArrayDeque<>();

    /* renamed from: p */
    private final ArrayDeque<Object> f6505p = new ArrayDeque<>();

    /* renamed from: s */
    private int f6508s = -1;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcg/d$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "code", "I", "b", "()I", "Leg/f;", "reason", "Leg/f;", "c", "()Leg/f;", BuildConfig.FLAVOR, "cancelAfterCloseMillis", "J", "a", "()J", "<init>", "(ILeg/f;J)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f6515a;

        /* renamed from: b */
        private final eg.f f6516b;

        /* renamed from: c */
        private final long f6517c;

        public a(int i10, eg.f fVar, long j10) {
            this.f6515a = i10;
            this.f6516b = fVar;
            this.f6517c = j10;
        }

        public final long a() {
            return this.f6517c;
        }

        public final int b() {
            return this.f6515a;
        }

        public final eg.f c() {
            return this.f6516b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcg/d$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", BuildConfig.FLAVOR, "Lof/y;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcg/d$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "formatOpcode", "I", "b", "()I", "Leg/f;", "data", "Leg/f;", "a", "()Leg/f;", "<init>", "(ILeg/f;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final int f6518a;

        /* renamed from: b */
        private final eg.f f6519b;

        public c(int i10, eg.f fVar) {
            t.e(fVar, "data");
            this.f6518a = i10;
            this.f6519b = fVar;
        }

        public final eg.f a() {
            return this.f6519b;
        }

        public final int b() {
            return this.f6518a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcg/d$d;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "client", "Z", "b", "()Z", "Leg/e;", "source", "Leg/e;", "f", "()Leg/e;", "Leg/d;", "sink", "Leg/d;", "e", "()Leg/d;", "<init>", "(ZLeg/e;Leg/d;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: cg.d$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0092d implements Closeable {

        /* renamed from: c */
        private final boolean f6520c;

        /* renamed from: d */
        private final eg.e f6521d;

        /* renamed from: q */
        private final eg.d f6522q;

        public AbstractC0092d(boolean z10, eg.e eVar, eg.d dVar) {
            t.e(eVar, "source");
            t.e(dVar, "sink");
            this.f6520c = z10;
            this.f6521d = eVar;
            this.f6522q = dVar;
        }

        public final boolean b() {
            return this.f6520c;
        }

        public final eg.d e() {
            return this.f6522q;
        }

        public final eg.e f() {
            return this.f6521d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcg/d$e;", "Lsf/a;", BuildConfig.FLAVOR, "f", "<init>", "(Lcg/d;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class e extends sf.a {

        /* renamed from: e */
        final /* synthetic */ d f6523e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(t.l(dVar.f6502m, " writer"), false, 2, null);
            t.e(dVar, "this$0");
            this.f6523e = dVar;
        }

        @Override // sf.a
        public long f() {
            try {
                return this.f6523e.w() ? 0L : -1L;
            } catch (IOException e10) {
                this.f6523e.p(e10, null);
                return -1L;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"cg/d$f", "Lof/f;", "Lof/e;", "call", "Lof/b0;", "response", "Ltb/e0;", "a", "Ljava/io/IOException;", "e", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class f implements of.f {

        /* renamed from: b */
        final /* synthetic */ z f6525b;

        f(z zVar) {
            d.this = r1;
            this.f6525b = zVar;
        }

        @Override // of.f
        public void a(of.e eVar, b0 b0Var) {
            t.e(eVar, "call");
            t.e(b0Var, "response");
            tf.c j10 = b0Var.j();
            try {
                d.this.m(b0Var, j10);
                t.b(j10);
                AbstractC0092d m10 = j10.m();
                cg.e a10 = cg.e.Companion.a(b0Var.s());
                d.this.f6494e = a10;
                if (!d.this.s(a10)) {
                    d dVar = d.this;
                    synchronized (dVar) {
                        dVar.f6505p.clear();
                        dVar.a(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.r(pf.d.f19196i + " WebSocket " + this.f6525b.j().n(), m10);
                    d.this.q().i(d.this, b0Var);
                    d.this.t();
                } catch (Exception e10) {
                    d.this.p(e10, null);
                }
            } catch (IOException e11) {
                if (j10 != null) {
                    j10.u();
                }
                d.this.p(e11, b0Var);
                pf.d.m(b0Var);
            }
        }

        @Override // of.f
        public void b(of.e eVar, IOException iOException) {
            t.e(eVar, "call");
            t.e(iOException, "e");
            d.this.p(iOException, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"cg/d$g", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class g extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f6526e;

        /* renamed from: f */
        final /* synthetic */ d f6527f;

        /* renamed from: g */
        final /* synthetic */ long f6528g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, d dVar, long j10) {
            super(str, false, 2, null);
            this.f6526e = str;
            this.f6527f = dVar;
            this.f6528g = j10;
        }

        @Override // sf.a
        public long f() {
            this.f6527f.x();
            return this.f6528g;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class h extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f6529e;

        /* renamed from: f */
        final /* synthetic */ boolean f6530f;

        /* renamed from: g */
        final /* synthetic */ d f6531g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, d dVar) {
            super(str, z10);
            this.f6529e = str;
            this.f6530f = z10;
            this.f6531g = dVar;
        }

        @Override // sf.a
        public long f() {
            this.f6531g.cancel();
            return -1L;
        }
    }

    static {
        List<y> d10;
        d10 = ub.t.d(y.HTTP_1_1);
        f6489z = d10;
    }

    public d(sf.e eVar, z zVar, g0 g0Var, Random random, long j10, cg.e eVar2, long j11) {
        t.e(eVar, "taskRunner");
        t.e(zVar, "originalRequest");
        t.e(g0Var, "listener");
        t.e(random, "random");
        this.f6490a = zVar;
        this.f6491b = g0Var;
        this.f6492c = random;
        this.f6493d = j10;
        this.f6494e = eVar2;
        this.f6495f = j11;
        this.f6501l = eVar.i();
        if (t.a("GET", zVar.h())) {
            f.a aVar = eg.f.Companion;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            e0 e0Var = e0.f22152a;
            this.f6496g = f.a.f(aVar, bArr, 0, 0, 3, null).b();
            return;
        }
        throw new IllegalArgumentException(t.l("Request must be GET: ", zVar.h()).toString());
    }

    public final boolean s(cg.e eVar) {
        if (!eVar.f6537f && eVar.f6533b == null) {
            return eVar.f6535d == null || new nc.g(8, 15).i(eVar.f6535d.intValue());
        }
        return false;
    }

    private final void u() {
        if (!pf.d.f19195h || Thread.holdsLock(this)) {
            sf.a aVar = this.f6498i;
            if (aVar == null) {
                return;
            }
            sf.d.j(this.f6501l, aVar, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
    }

    private final synchronized boolean v(eg.f fVar, int i10) {
        if (!this.f6510u && !this.f6507r) {
            if (this.f6506q + fVar.W() > 16777216) {
                a(1001, null);
                return false;
            }
            this.f6506q += fVar.W();
            this.f6505p.add(new c(i10, fVar));
            u();
            return true;
        }
        return false;
    }

    @Override // of.f0
    public boolean a(int i10, String str) {
        return n(i10, str, 60000L);
    }

    @Override // of.f0
    public boolean b(String str) {
        t.e(str, "text");
        return v(eg.f.Companion.d(str), 1);
    }

    @Override // of.f0
    public boolean c(eg.f fVar) {
        t.e(fVar, "bytes");
        return v(fVar, 2);
    }

    @Override // of.f0
    public void cancel() {
        of.e eVar = this.f6497h;
        t.b(eVar);
        eVar.cancel();
    }

    @Override // cg.g.a
    public synchronized void d(eg.f fVar) {
        t.e(fVar, "payload");
        this.f6513x++;
        this.f6514y = false;
    }

    @Override // cg.g.a
    public void e(eg.f fVar) {
        t.e(fVar, "bytes");
        this.f6491b.f(this, fVar);
    }

    @Override // cg.g.a
    public void f(String str) {
        t.e(str, "text");
        this.f6491b.g(this, str);
    }

    @Override // cg.g.a
    public synchronized void g(eg.f fVar) {
        t.e(fVar, "payload");
        if (!this.f6510u && (!this.f6507r || !this.f6505p.isEmpty())) {
            this.f6504o.add(fVar);
            u();
            this.f6512w++;
        }
    }

    @Override // cg.g.a
    public void h(int i10, String str) {
        AbstractC0092d abstractC0092d;
        cg.h hVar;
        cg.g gVar;
        t.e(str, "reason");
        boolean z10 = true;
        if (i10 != -1) {
            synchronized (this) {
                if (this.f6508s != -1) {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.f6508s = i10;
                this.f6509t = str;
                abstractC0092d = null;
                if (!this.f6507r || !this.f6505p.isEmpty()) {
                    gVar = null;
                    hVar = null;
                } else {
                    AbstractC0092d abstractC0092d2 = this.f6503n;
                    this.f6503n = null;
                    gVar = this.f6499j;
                    this.f6499j = null;
                    hVar = this.f6500k;
                    this.f6500k = null;
                    this.f6501l.o();
                    abstractC0092d = abstractC0092d2;
                }
                e0 e0Var = e0.f22152a;
            }
            try {
                this.f6491b.c(this, i10, str);
                if (abstractC0092d != null) {
                    this.f6491b.a(this, i10, str);
                }
                if (hVar != null) {
                    return;
                }
                return;
            } finally {
                if (abstractC0092d != null) {
                    pf.d.m(abstractC0092d);
                }
                if (gVar != null) {
                    pf.d.m(gVar);
                }
                if (hVar != null) {
                    pf.d.m(hVar);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void m(b0 b0Var, tf.c cVar) {
        boolean v10;
        boolean v11;
        t.e(b0Var, "response");
        if (b0Var.i() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + b0Var.i() + ' ' + b0Var.u() + '\'');
        }
        String r10 = b0.r(b0Var, "Connection", null, 2, null);
        v10 = x.v("Upgrade", r10, true);
        if (!v10) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) r10) + '\'');
        }
        String r11 = b0.r(b0Var, "Upgrade", null, 2, null);
        v11 = x.v("websocket", r11, true);
        if (!v11) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) r11) + '\'');
        }
        String r12 = b0.r(b0Var, "Sec-WebSocket-Accept", null, 2, null);
        String b10 = eg.f.Companion.d(t.l(this.f6496g, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).N().b();
        if (t.a(b10, r12)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + b10 + "' but was '" + ((Object) r12) + '\'');
    }

    public final synchronized boolean n(int i10, String str, long j10) {
        cg.f.f6538a.c(i10);
        eg.f fVar = null;
        if (str != null) {
            fVar = eg.f.Companion.d(str);
            if (!(((long) fVar.W()) <= 123)) {
                throw new IllegalArgumentException(t.l("reason.size() > 123: ", str).toString());
            }
        }
        if (!this.f6510u && !this.f6507r) {
            this.f6507r = true;
            this.f6505p.add(new a(i10, fVar, j10));
            u();
            return true;
        }
        return false;
    }

    public final void o(of.x xVar) {
        t.e(xVar, "client");
        if (this.f6490a.d("Sec-WebSocket-Extensions") != null) {
            p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        of.x b10 = xVar.D().h(r.f18288a).O(f6489z).b();
        z b11 = this.f6490a.i().d("Upgrade", "websocket").d("Connection", "Upgrade").d("Sec-WebSocket-Key", this.f6496g).d("Sec-WebSocket-Version", "13").d("Sec-WebSocket-Extensions", "permessage-deflate").b();
        tf.e eVar = new tf.e(b10, b11, true);
        this.f6497h = eVar;
        t.b(eVar);
        eVar.r(new f(b11));
    }

    public final void p(Exception exc, b0 b0Var) {
        t.e(exc, "e");
        synchronized (this) {
            if (this.f6510u) {
                return;
            }
            this.f6510u = true;
            AbstractC0092d abstractC0092d = this.f6503n;
            this.f6503n = null;
            cg.g gVar = this.f6499j;
            this.f6499j = null;
            cg.h hVar = this.f6500k;
            this.f6500k = null;
            this.f6501l.o();
            e0 e0Var = e0.f22152a;
            try {
                this.f6491b.d(this, exc, b0Var);
            } finally {
                if (abstractC0092d != null) {
                    pf.d.m(abstractC0092d);
                }
                if (gVar != null) {
                    pf.d.m(gVar);
                }
                if (hVar != null) {
                    pf.d.m(hVar);
                }
            }
        }
    }

    public final g0 q() {
        return this.f6491b;
    }

    public final void r(String str, AbstractC0092d abstractC0092d) {
        t.e(str, "name");
        t.e(abstractC0092d, "streams");
        cg.e eVar = this.f6494e;
        t.b(eVar);
        synchronized (this) {
            this.f6502m = str;
            this.f6503n = abstractC0092d;
            this.f6500k = new cg.h(abstractC0092d.b(), abstractC0092d.e(), this.f6492c, eVar.f6532a, eVar.a(abstractC0092d.b()), this.f6495f);
            this.f6498i = new e(this);
            long j10 = this.f6493d;
            if (j10 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                this.f6501l.i(new g(t.l(str, " ping"), this, nanos), nanos);
            }
            if (!this.f6505p.isEmpty()) {
                u();
            }
            e0 e0Var = e0.f22152a;
        }
        this.f6499j = new cg.g(abstractC0092d.b(), abstractC0092d.f(), this, eVar.f6532a, eVar.a(!abstractC0092d.b()));
    }

    public final void t() {
        while (this.f6508s == -1) {
            cg.g gVar = this.f6499j;
            t.b(gVar);
            gVar.b();
        }
    }

    public final boolean w() {
        Closeable closeable;
        cg.g gVar;
        String str;
        AbstractC0092d abstractC0092d;
        synchronized (this) {
            if (this.f6510u) {
                return false;
            }
            cg.h hVar = this.f6500k;
            eg.f poll = this.f6504o.poll();
            int i10 = -1;
            c cVar = null;
            if (poll == null) {
                Object poll2 = this.f6505p.poll();
                if (poll2 instanceof a) {
                    int i11 = this.f6508s;
                    str = this.f6509t;
                    if (i11 != -1) {
                        AbstractC0092d abstractC0092d2 = this.f6503n;
                        this.f6503n = null;
                        gVar = this.f6499j;
                        this.f6499j = null;
                        closeable = this.f6500k;
                        this.f6500k = null;
                        this.f6501l.o();
                        cVar = poll2;
                        i10 = i11;
                        abstractC0092d = abstractC0092d2;
                    } else {
                        long a10 = ((a) poll2).a();
                        this.f6501l.i(new h(t.l(this.f6502m, " cancel"), true, this), TimeUnit.MILLISECONDS.toNanos(a10));
                        i10 = i11;
                        abstractC0092d = null;
                        gVar = null;
                    }
                } else if (poll2 == 0) {
                    return false;
                } else {
                    abstractC0092d = null;
                    str = null;
                    gVar = null;
                }
                closeable = gVar;
                cVar = poll2;
            } else {
                abstractC0092d = null;
                str = null;
                gVar = null;
                closeable = null;
            }
            e0 e0Var = e0.f22152a;
            try {
                if (poll != null) {
                    t.b(hVar);
                    hVar.i(poll);
                } else if (cVar instanceof c) {
                    c cVar2 = cVar;
                    t.b(hVar);
                    hVar.f(cVar2.b(), cVar2.a());
                    synchronized (this) {
                        this.f6506q -= cVar2.a().W();
                    }
                } else if (!(cVar instanceof a)) {
                    throw new AssertionError();
                } else {
                    a aVar = (a) cVar;
                    t.b(hVar);
                    hVar.b(aVar.b(), aVar.c());
                    if (abstractC0092d != null) {
                        g0 g0Var = this.f6491b;
                        t.b(str);
                        g0Var.a(this, i10, str);
                    }
                }
                return true;
            } finally {
                if (abstractC0092d != null) {
                    pf.d.m(abstractC0092d);
                }
                if (gVar != null) {
                    pf.d.m(gVar);
                }
                if (closeable != null) {
                    pf.d.m(closeable);
                }
            }
        }
    }

    public final void x() {
        synchronized (this) {
            if (this.f6510u) {
                return;
            }
            cg.h hVar = this.f6500k;
            if (hVar == null) {
                return;
            }
            int i10 = this.f6514y ? this.f6511v : -1;
            this.f6511v++;
            this.f6514y = true;
            e0 e0Var = e0.f22152a;
            if (i10 == -1) {
                try {
                    hVar.h(eg.f.f9610x);
                    return;
                } catch (IOException e10) {
                    p(e10, null);
                    return;
                }
            }
            p(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f6493d + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
        }
    }
}
