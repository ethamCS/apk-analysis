package bb;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lbb/w;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "value", "I", "b0", "()I", "description", "<init>", "(ILjava/lang/String;)V", "a", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d0 */
    private static final w[] f5943d0;

    /* renamed from: a */
    private final int f5966a;

    /* renamed from: b */
    private final String f5967b;
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final w f5940c = new w(100, "Continue");

    /* renamed from: d */
    private static final w f5942d = new w(101, "Switching Protocols");

    /* renamed from: e */
    private static final w f5944e = new w(102, "Processing");

    /* renamed from: f */
    private static final w f5945f = new w(200, "OK");

    /* renamed from: g */
    private static final w f5946g = new w(201, "Created");

    /* renamed from: h */
    private static final w f5947h = new w(202, "Accepted");

    /* renamed from: i */
    private static final w f5948i = new w(203, "Non-Authoritative Information");

    /* renamed from: j */
    private static final w f5949j = new w(204, "No Content");

    /* renamed from: k */
    private static final w f5950k = new w(205, "Reset Content");

    /* renamed from: l */
    private static final w f5951l = new w(206, "Partial Content");

    /* renamed from: m */
    private static final w f5952m = new w(207, "Multi-Status");

    /* renamed from: n */
    private static final w f5953n = new w(300, "Multiple Choices");

    /* renamed from: o */
    private static final w f5954o = new w(301, "Moved Permanently");

    /* renamed from: p */
    private static final w f5955p = new w(302, "Found");

    /* renamed from: q */
    private static final w f5956q = new w(303, "See Other");

    /* renamed from: r */
    private static final w f5957r = new w(304, "Not Modified");

    /* renamed from: s */
    private static final w f5958s = new w(305, "Use Proxy");

    /* renamed from: t */
    private static final w f5959t = new w(306, "Switch Proxy");

    /* renamed from: u */
    private static final w f5960u = new w(307, "Temporary Redirect");

    /* renamed from: v */
    private static final w f5961v = new w(308, "Permanent Redirect");

    /* renamed from: w */
    private static final w f5962w = new w(400, "Bad Request");

    /* renamed from: x */
    private static final w f5963x = new w(401, "Unauthorized");

    /* renamed from: y */
    private static final w f5964y = new w(402, "Payment Required");

    /* renamed from: z */
    private static final w f5965z = new w(403, "Forbidden");
    private static final w A = new w(404, "Not Found");
    private static final w B = new w(405, "Method Not Allowed");
    private static final w C = new w(406, "Not Acceptable");
    private static final w D = new w(407, "Proxy Authentication Required");
    private static final w E = new w(408, "Request Timeout");
    private static final w F = new w(409, "Conflict");
    private static final w G = new w(410, "Gone");
    private static final w H = new w(411, "Length Required");
    private static final w I = new w(412, "Precondition Failed");
    private static final w J = new w(413, "Payload Too Large");
    private static final w K = new w(414, "Request-URI Too Long");
    private static final w L = new w(415, "Unsupported Media Type");
    private static final w M = new w(416, "Requested Range Not Satisfiable");
    private static final w N = new w(417, "Expectation Failed");
    private static final w O = new w(422, "Unprocessable Entity");
    private static final w P = new w(423, "Locked");
    private static final w Q = new w(424, "Failed Dependency");
    private static final w R = new w(426, "Upgrade Required");
    private static final w S = new w(429, "Too Many Requests");
    private static final w T = new w(431, "Request Header Fields Too Large");
    private static final w U = new w(500, "Internal Server Error");
    private static final w V = new w(501, "Not Implemented");
    private static final w W = new w(502, "Bad Gateway");
    private static final w X = new w(503, "Service Unavailable");
    private static final w Y = new w(504, "Gateway Timeout");
    private static final w Z = new w(505, "HTTP Version Not Supported");

    /* renamed from: a0 */
    private static final w f5938a0 = new w(506, "Variant Also Negotiates");

    /* renamed from: b0 */
    private static final w f5939b0 = new w(507, "Insufficient Storage");

    /* renamed from: c0 */
    private static final List<w> f5941c0 = x.a();

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bk\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bs\u0010tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\tR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\tR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\tR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\tR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0007\u001a\u0004\b+\u0010\tR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0007\u001a\u0004\b-\u0010\tR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0007\u001a\u0004\b/\u0010\tR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0007\u001a\u0004\b1\u0010\tR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0007\u001a\u0004\b3\u0010\tR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0007\u001a\u0004\b5\u0010\tR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0007\u001a\u0004\b7\u0010\tR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0007\u001a\u0004\b9\u0010\tR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0007\u001a\u0004\b;\u0010\tR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0007\u001a\u0004\b=\u0010\tR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0007\u001a\u0004\b?\u0010\tR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0007\u001a\u0004\bA\u0010\tR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0007\u001a\u0004\bC\u0010\tR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0007\u001a\u0004\bE\u0010\tR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0007\u001a\u0004\bG\u0010\tR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0007\u001a\u0004\bI\u0010\tR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0007\u001a\u0004\bK\u0010\tR\u0017\u0010L\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0007\u001a\u0004\bM\u0010\tR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0007\u001a\u0004\bO\u0010\tR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0007\u001a\u0004\bQ\u0010\tR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0007\u001a\u0004\bS\u0010\tR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0007\u001a\u0004\bU\u0010\tR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0007\u001a\u0004\bW\u0010\tR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0007\u001a\u0004\bY\u0010\tR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\u0007\u001a\u0004\b[\u0010\tR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0007\u001a\u0004\b]\u0010\tR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0007\u001a\u0004\b_\u0010\tR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0007\u001a\u0004\ba\u0010\tR\u0017\u0010b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0007\u001a\u0004\bc\u0010\tR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0007\u001a\u0004\be\u0010\tR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0007\u001a\u0004\bg\u0010\tR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0007\u001a\u0004\bi\u0010\tR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0007\u001a\u0004\bk\u0010\tR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0007\u001a\u0004\bm\u0010\tR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010\u0007\u001a\u0004\bo\u0010\tR\u001c\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lbb/w$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "Lbb/w;", "a", "Continue", "Lbb/w;", "f", "()Lbb/w;", "SwitchingProtocols", "R", "Processing", "H", "OK", "B", "Created", "g", "Accepted", "b", "NonAuthoritativeInformation", "w", "NoContent", "v", "ResetContent", "N", "PartialContent", "C", "MultiStatus", "t", "MultipleChoices", "u", "MovedPermanently", "s", "Found", "k", "SeeOther", "O", "NotModified", "A", "UseProxy", "Y", "SwitchProxy", "Q", "TemporaryRedirect", "S", "PermanentRedirect", "F", "BadRequest", "d", "Unauthorized", "U", "PaymentRequired", "E", "Forbidden", "j", "NotFound", "y", "MethodNotAllowed", "r", "NotAcceptable", "x", "ProxyAuthenticationRequired", "I", "RequestTimeout", "K", "Conflict", "e", "Gone", "m", "LengthRequired", "p", "PreconditionFailed", "G", "PayloadTooLarge", "D", "RequestURITooLong", "L", "UnsupportedMediaType", "W", "RequestedRangeNotSatisfiable", "M", "ExpectationFailed", "h", "UnprocessableEntity", "V", "Locked", "q", "FailedDependency", "i", "UpgradeRequired", "X", "TooManyRequests", "T", "RequestHeaderFieldTooLarge", "J", "InternalServerError", "o", "NotImplemented", "z", "BadGateway", "c", "ServiceUnavailable", "P", "GatewayTimeout", "l", "VersionNotSupported", "a0", "VariantAlsoNegotiates", "Z", "InsufficientStorage", "n", BuildConfig.FLAVOR, "byValue", "[Lbb/w;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w A() {
            return w.f5957r;
        }

        public final w B() {
            return w.f5945f;
        }

        public final w C() {
            return w.f5951l;
        }

        public final w D() {
            return w.J;
        }

        public final w E() {
            return w.f5964y;
        }

        public final w F() {
            return w.f5961v;
        }

        public final w G() {
            return w.I;
        }

        public final w H() {
            return w.f5944e;
        }

        public final w I() {
            return w.D;
        }

        public final w J() {
            return w.T;
        }

        public final w K() {
            return w.E;
        }

        public final w L() {
            return w.K;
        }

        public final w M() {
            return w.M;
        }

        public final w N() {
            return w.f5950k;
        }

        public final w O() {
            return w.f5956q;
        }

        public final w P() {
            return w.X;
        }

        public final w Q() {
            return w.f5959t;
        }

        public final w R() {
            return w.f5942d;
        }

        public final w S() {
            return w.f5960u;
        }

        public final w T() {
            return w.S;
        }

        public final w U() {
            return w.f5963x;
        }

        public final w V() {
            return w.O;
        }

        public final w W() {
            return w.L;
        }

        public final w X() {
            return w.R;
        }

        public final w Y() {
            return w.f5958s;
        }

        public final w Z() {
            return w.f5938a0;
        }

        public final w a(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 1000) {
                z10 = true;
            }
            w wVar = z10 ? w.f5943d0[i10] : null;
            return wVar == null ? new w(i10, "Unknown Status Code") : wVar;
        }

        public final w a0() {
            return w.Z;
        }

        public final w b() {
            return w.f5947h;
        }

        public final w c() {
            return w.W;
        }

        public final w d() {
            return w.f5962w;
        }

        public final w e() {
            return w.F;
        }

        public final w f() {
            return w.f5940c;
        }

        public final w g() {
            return w.f5946g;
        }

        public final w h() {
            return w.N;
        }

        public final w i() {
            return w.Q;
        }

        public final w j() {
            return w.f5965z;
        }

        public final w k() {
            return w.f5955p;
        }

        public final w l() {
            return w.Y;
        }

        public final w m() {
            return w.G;
        }

        public final w n() {
            return w.f5939b0;
        }

        public final w o() {
            return w.U;
        }

        public final w p() {
            return w.H;
        }

        public final w q() {
            return w.P;
        }

        public final w r() {
            return w.B;
        }

        public final w s() {
            return w.f5954o;
        }

        public final w t() {
            return w.f5952m;
        }

        public final w u() {
            return w.f5953n;
        }

        public final w v() {
            return w.f5949j;
        }

        public final w w() {
            return w.f5948i;
        }

        public final w x() {
            return w.C;
        }

        public final w y() {
            return w.A;
        }

        public final w z() {
            return w.V;
        }
    }

    static {
        Object obj;
        boolean z10;
        w[] wVarArr = new w[1000];
        for (int i10 = 0; i10 < 1000; i10++) {
            Iterator<T> it = f5941c0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((w) obj).b0() == i10) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            wVarArr[i10] = (w) obj;
        }
        f5943d0 = wVarArr;
    }

    public w(int i10, String str) {
        hc.t.e(str, "description");
        this.f5966a = i10;
        this.f5967b = str;
    }

    public final int b0() {
        return this.f5966a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && ((w) obj).f5966a == this.f5966a;
    }

    public int hashCode() {
        return this.f5966a;
    }

    public String toString() {
        return this.f5966a + ' ' + this.f5967b;
    }
}
