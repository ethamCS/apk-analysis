package wf;

import hc.h0;
import hc.j0;
import hc.t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import wf.h;
@Metadata(bv = {}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\b\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001B\u0015\b\u0000\u0012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0014J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010%\u001a\u00020!J\b\u00100\u001a\u00020\rH\u0016J)\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b4\u00105J\u001c\u00109\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u000207H\u0007J\u000e\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0014J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b@\u0010AJ-\u0010C\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bC\u0010DJ/\u0010G\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bI\u0010$R\u001a\u0010J\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010O\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR&\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010Y\u001a\u00020X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010]\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010^\u001a\u0004\bd\u0010`\"\u0004\be\u0010bR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\"\u0010k\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010h\u001a\u0004\bl\u0010j\"\u0004\bm\u0010nR$\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR$\u0010t\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010q\u001a\u0004\bu\u0010sR\u001a\u0010w\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0017\u0010|\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f¨\u0006\u0088\u0001"}, d2 = {"Lwf/f;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "associatedStreamId", BuildConfig.FLAVOR, "Lwf/c;", "requestHeaders", BuildConfig.FLAVOR, "out", "Lwf/i;", "h1", "Ljava/io/IOException;", "e", "Ltb/e0;", "h0", "id", "O0", "streamId", "o1", "(I)Lwf/i;", BuildConfig.FLAVOR, "read", "w1", "(J)V", "i1", "outFinished", "alternating", "y1", "(IZLjava/util/List;)V", "Leg/c;", "buffer", "byteCount", "x1", "Lwf/b;", "errorCode", "B1", "(ILwf/b;)V", "statusCode", "A1", "unacknowledgedBytesRead", "C1", "(IJ)V", "reply", "payload1", "payload2", "z1", "flush", "t1", "close", "connectionCode", "streamCode", "cause", "f0", "(Lwf/b;Lwf/b;Ljava/io/IOException;)V", "sendConnectionPreface", "Lsf/e;", "taskRunner", "u1", "nowNs", "f1", "p1", "()V", "n1", "(I)Z", "l1", "(ILjava/util/List;)V", "inFinished", "k1", "(ILjava/util/List;Z)V", "Leg/e;", "source", "j1", "(ILeg/e;IZ)V", "m1", "client", "Z", "j0", "()Z", "Lwf/f$c;", "listener", "Lwf/f$c;", "w0", "()Lwf/f$c;", BuildConfig.FLAVOR, "streams", "Ljava/util/Map;", "R0", "()Ljava/util/Map;", BuildConfig.FLAVOR, "connectionName", "Ljava/lang/String;", "s0", "()Ljava/lang/String;", "lastGoodStreamId", "I", "u0", "()I", "q1", "(I)V", "nextStreamId", "z0", "r1", "Lwf/m;", "okHttpSettings", "Lwf/m;", "D0", "()Lwf/m;", "peerSettings", "K0", "s1", "(Lwf/m;)V", "<set-?>", "writeBytesTotal", "J", "c1", "()J", "writeBytesMaximum", "V0", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "M0", "()Ljava/net/Socket;", "Lwf/j;", "writer", "Lwf/j;", "e1", "()Lwf/j;", "Lwf/f$a;", "builder", "<init>", "(Lwf/f$a;)V", "a", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f implements Closeable {
    public static final b Companion = new b(null);

    /* renamed from: r4 */
    private static final m f24927r4;
    private int U3;
    private boolean V3;
    private final sf.e W3;
    private final sf.d X3;
    private final sf.d Y3;
    private final sf.d Z3;

    /* renamed from: a4 */
    private final wf.l f24928a4;

    /* renamed from: b4 */
    private long f24929b4;

    /* renamed from: c */
    private final boolean f24930c;

    /* renamed from: c4 */
    private long f24931c4;

    /* renamed from: d */
    private final c f24932d;

    /* renamed from: d4 */
    private long f24933d4;

    /* renamed from: e4 */
    private long f24934e4;

    /* renamed from: f4 */
    private long f24935f4;

    /* renamed from: g4 */
    private long f24936g4;

    /* renamed from: h4 */
    private final m f24937h4;

    /* renamed from: i4 */
    private m f24938i4;

    /* renamed from: j4 */
    private long f24939j4;

    /* renamed from: k4 */
    private long f24940k4;

    /* renamed from: l4 */
    private long f24941l4;

    /* renamed from: m4 */
    private long f24942m4;

    /* renamed from: n4 */
    private final Socket f24943n4;

    /* renamed from: o4 */
    private final wf.j f24944o4;

    /* renamed from: p4 */
    private final d f24945p4;

    /* renamed from: q */
    private final Map<Integer, wf.i> f24946q = new LinkedHashMap();

    /* renamed from: q4 */
    private final Set<Integer> f24947q4;

    /* renamed from: x */
    private final String f24948x;

    /* renamed from: y */
    private int f24949y;

    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bE\u0010FJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lwf/f$a;", BuildConfig.FLAVOR, "Ljava/net/Socket;", "socket", BuildConfig.FLAVOR, "peerName", "Leg/e;", "source", "Leg/d;", "sink", "s", "Lwf/f$c;", "listener", "k", BuildConfig.FLAVOR, "pingIntervalMillis", "l", "Lwf/f;", "a", BuildConfig.FLAVOR, "client", "Z", "b", "()Z", "setClient$okhttp", "(Z)V", "Lsf/e;", "taskRunner", "Lsf/e;", "j", "()Lsf/e;", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "q", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "Leg/e;", "i", "()Leg/e;", "r", "(Leg/e;)V", "Leg/d;", "g", "()Leg/d;", "p", "(Leg/d;)V", "Lwf/f$c;", "d", "()Lwf/f$c;", "n", "(Lwf/f$c;)V", "Lwf/l;", "pushObserver", "Lwf/l;", "f", "()Lwf/l;", "setPushObserver$okhttp", "(Lwf/l;)V", "I", "e", "()I", "o", "(I)V", "<init>", "(ZLsf/e;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f24950a;

        /* renamed from: b */
        private final sf.e f24951b;

        /* renamed from: c */
        public Socket f24952c;

        /* renamed from: d */
        public String f24953d;

        /* renamed from: e */
        public eg.e f24954e;

        /* renamed from: f */
        public eg.d f24955f;

        /* renamed from: g */
        private c f24956g = c.f24959a;

        /* renamed from: h */
        private wf.l f24957h = wf.l.f25074a;

        /* renamed from: i */
        private int f24958i;

        public a(boolean z10, sf.e eVar) {
            t.e(eVar, "taskRunner");
            this.f24950a = z10;
            this.f24951b = eVar;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f24950a;
        }

        public final String c() {
            String str = this.f24953d;
            if (str != null) {
                return str;
            }
            t.s("connectionName");
            return null;
        }

        public final c d() {
            return this.f24956g;
        }

        public final int e() {
            return this.f24958i;
        }

        public final wf.l f() {
            return this.f24957h;
        }

        public final eg.d g() {
            eg.d dVar = this.f24955f;
            if (dVar != null) {
                return dVar;
            }
            t.s("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f24952c;
            if (socket != null) {
                return socket;
            }
            t.s("socket");
            return null;
        }

        public final eg.e i() {
            eg.e eVar = this.f24954e;
            if (eVar != null) {
                return eVar;
            }
            t.s("source");
            return null;
        }

        public final sf.e j() {
            return this.f24951b;
        }

        public final a k(c cVar) {
            t.e(cVar, "listener");
            n(cVar);
            return this;
        }

        public final a l(int i10) {
            o(i10);
            return this;
        }

        public final void m(String str) {
            t.e(str, "<set-?>");
            this.f24953d = str;
        }

        public final void n(c cVar) {
            t.e(cVar, "<set-?>");
            this.f24956g = cVar;
        }

        public final void o(int i10) {
            this.f24958i = i10;
        }

        public final void p(eg.d dVar) {
            t.e(dVar, "<set-?>");
            this.f24955f = dVar;
        }

        public final void q(Socket socket) {
            t.e(socket, "<set-?>");
            this.f24952c = socket;
        }

        public final void r(eg.e eVar) {
            t.e(eVar, "<set-?>");
            this.f24954e = eVar;
        }

        public final a s(Socket socket, String str, eg.e eVar, eg.d dVar) {
            String str2;
            t.e(socket, "socket");
            t.e(str, "peerName");
            t.e(eVar, "source");
            t.e(dVar, "sink");
            q(socket);
            if (b()) {
                str2 = pf.d.f19196i + ' ' + str;
            } else {
                str2 = t.l("MockWebServer ", str);
            }
            m(str2);
            r(eVar);
            p(dVar);
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lwf/f$b;", BuildConfig.FLAVOR, "Lwf/m;", "DEFAULT_SETTINGS", "Lwf/m;", "a", "()Lwf/m;", BuildConfig.FLAVOR, "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return f.f24927r4;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lwf/f$c;", BuildConfig.FLAVOR, "Lwf/i;", "stream", "Ltb/e0;", "c", "Lwf/f;", "connection", "Lwf/m;", "settings", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static abstract class c {
        public static final b Companion = new b(null);

        /* renamed from: a */
        public static final c f24959a = new a();

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"wf/f$c$a", "Lwf/f$c;", "Lwf/i;", "stream", "Ltb/e0;", "c", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class a extends c {
            a() {
            }

            @Override // wf.f.c
            public void c(wf.i iVar) {
                t.e(iVar, "stream");
                iVar.d(wf.b.REFUSED_STREAM, null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lwf/f$c$b;", BuildConfig.FLAVOR, "Lwf/f$c;", "REFUSE_INCOMING_STREAMS", "Lwf/f$c;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void b(f fVar, m mVar) {
            t.e(fVar, "connection");
            t.e(mVar, "settings");
        }

        public abstract void c(wf.i iVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¨\u00061"}, d2 = {"Lwf/f$d;", "Lwf/h$c;", "Lkotlin/Function0;", "Ltb/e0;", "m", BuildConfig.FLAVOR, "inFinished", BuildConfig.FLAVOR, "streamId", "Leg/e;", "source", "length", "b", "associatedStreamId", BuildConfig.FLAVOR, "Lwf/c;", "headerBlock", "f", "Lwf/b;", "errorCode", "d", "clearPrevious", "Lwf/m;", "settings", "k", "l", "a", "ack", "payload1", "payload2", "c", "lastGoodStreamId", "Leg/f;", "debugData", "g", BuildConfig.FLAVOR, "windowSizeIncrement", "h", "streamDependency", "weight", "exclusive", "e", "promisedStreamId", "requestHeaders", "j", "Lwf/h;", "reader", "<init>", "(Lwf/f;Lwf/h;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class d implements h.c, gc.a<e0> {

        /* renamed from: c */
        private final wf.h f24960c;

        /* renamed from: d */
        final /* synthetic */ f f24961d;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class a extends sf.a {

            /* renamed from: e */
            final /* synthetic */ String f24962e;

            /* renamed from: f */
            final /* synthetic */ boolean f24963f;

            /* renamed from: g */
            final /* synthetic */ f f24964g;

            /* renamed from: h */
            final /* synthetic */ j0 f24965h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, f fVar, j0 j0Var) {
                super(str, z10);
                this.f24962e = str;
                this.f24963f = z10;
                this.f24964g = fVar;
                this.f24965h = j0Var;
            }

            @Override // sf.a
            public long f() {
                this.f24964g.w0().b(this.f24964g, (m) this.f24965h.f11764c);
                return -1L;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class b extends sf.a {

            /* renamed from: e */
            final /* synthetic */ String f24966e;

            /* renamed from: f */
            final /* synthetic */ boolean f24967f;

            /* renamed from: g */
            final /* synthetic */ f f24968g;

            /* renamed from: h */
            final /* synthetic */ wf.i f24969h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, f fVar, wf.i iVar) {
                super(str, z10);
                this.f24966e = str;
                this.f24967f = z10;
                this.f24968g = fVar;
                this.f24969h = iVar;
            }

            @Override // sf.a
            public long f() {
                try {
                    this.f24968g.w0().c(this.f24969h);
                    return -1L;
                } catch (IOException e10) {
                    yf.h.Companion.g().k(t.l("Http2Connection.Listener failure for ", this.f24968g.s0()), 4, e10);
                    try {
                        this.f24969h.d(wf.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class c extends sf.a {

            /* renamed from: e */
            final /* synthetic */ String f24970e;

            /* renamed from: f */
            final /* synthetic */ boolean f24971f;

            /* renamed from: g */
            final /* synthetic */ f f24972g;

            /* renamed from: h */
            final /* synthetic */ int f24973h;

            /* renamed from: i */
            final /* synthetic */ int f24974i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, f fVar, int i10, int i11) {
                super(str, z10);
                this.f24970e = str;
                this.f24971f = z10;
                this.f24972g = fVar;
                this.f24973h = i10;
                this.f24974i = i11;
            }

            @Override // sf.a
            public long f() {
                this.f24972g.z1(true, this.f24973h, this.f24974i);
                return -1L;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: wf.f$d$d */
        /* loaded from: classes3.dex */
        public static final class C0442d extends sf.a {

            /* renamed from: e */
            final /* synthetic */ String f24975e;

            /* renamed from: f */
            final /* synthetic */ boolean f24976f;

            /* renamed from: g */
            final /* synthetic */ d f24977g;

            /* renamed from: h */
            final /* synthetic */ boolean f24978h;

            /* renamed from: i */
            final /* synthetic */ m f24979i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0442d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f24975e = str;
                this.f24976f = z10;
                this.f24977g = dVar;
                this.f24978h = z11;
                this.f24979i = mVar;
            }

            @Override // sf.a
            public long f() {
                this.f24977g.l(this.f24978h, this.f24979i);
                return -1L;
            }
        }

        public d(f fVar, wf.h hVar) {
            t.e(fVar, "this$0");
            t.e(hVar, "reader");
            this.f24961d = fVar;
            this.f24960c = hVar;
        }

        @Override // wf.h.c
        public void a() {
        }

        @Override // wf.h.c
        public void b(boolean z10, int i10, eg.e eVar, int i11) {
            t.e(eVar, "source");
            if (this.f24961d.n1(i10)) {
                this.f24961d.j1(i10, eVar, i11, z10);
                return;
            }
            wf.i O0 = this.f24961d.O0(i10);
            if (O0 == null) {
                this.f24961d.B1(i10, wf.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f24961d.w1(j10);
                eVar.skip(j10);
                return;
            }
            O0.w(eVar, i11);
            if (!z10) {
                return;
            }
            O0.x(pf.d.f19189b, true);
        }

        @Override // wf.h.c
        public void c(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f24961d.X3.i(new c(t.l(this.f24961d.s0(), " ping"), true, this.f24961d, i10, i11), 0L);
                return;
            }
            f fVar = this.f24961d;
            synchronized (fVar) {
                if (i10 == 1) {
                    fVar.f24931c4++;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        fVar.f24935f4++;
                        fVar.notifyAll();
                    }
                    e0 e0Var = e0.f22152a;
                } else {
                    fVar.f24934e4++;
                }
            }
        }

        @Override // wf.h.c
        public void d(int i10, wf.b bVar) {
            t.e(bVar, "errorCode");
            if (this.f24961d.n1(i10)) {
                this.f24961d.m1(i10, bVar);
                return;
            }
            wf.i o12 = this.f24961d.o1(i10);
            if (o12 == null) {
                return;
            }
            o12.y(bVar);
        }

        @Override // wf.h.c
        public void e(int i10, int i11, int i12, boolean z10) {
        }

        @Override // wf.h.c
        public void f(boolean z10, int i10, int i11, List<wf.c> list) {
            t.e(list, "headerBlock");
            if (this.f24961d.n1(i10)) {
                this.f24961d.k1(i10, list, z10);
                return;
            }
            f fVar = this.f24961d;
            synchronized (fVar) {
                wf.i O0 = fVar.O0(i10);
                if (O0 != null) {
                    e0 e0Var = e0.f22152a;
                    O0.x(pf.d.P(list), z10);
                } else if (fVar.V3) {
                } else {
                    if (i10 <= fVar.u0()) {
                        return;
                    }
                    if (i10 % 2 == fVar.z0() % 2) {
                        return;
                    }
                    wf.i iVar = new wf.i(i10, fVar, false, z10, pf.d.P(list));
                    fVar.q1(i10);
                    fVar.R0().put(Integer.valueOf(i10), iVar);
                    sf.d i12 = fVar.W3.i();
                    i12.i(new b(fVar.s0() + '[' + i10 + "] onStream", true, fVar, iVar), 0L);
                }
            }
        }

        @Override // wf.h.c
        public void g(int i10, wf.b bVar, eg.f fVar) {
            int i11;
            Object[] array;
            t.e(bVar, "errorCode");
            t.e(fVar, "debugData");
            fVar.W();
            f fVar2 = this.f24961d;
            synchronized (fVar2) {
                i11 = 0;
                array = fVar2.R0().values().toArray(new wf.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                fVar2.V3 = true;
                e0 e0Var = e0.f22152a;
            }
            wf.i[] iVarArr = (wf.i[]) array;
            int length = iVarArr.length;
            while (i11 < length) {
                wf.i iVar = iVarArr[i11];
                i11++;
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(wf.b.REFUSED_STREAM);
                    this.f24961d.o1(iVar.j());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wf.h.c
        public void h(int i10, long j10) {
            wf.i iVar;
            if (i10 == 0) {
                f fVar = this.f24961d;
                synchronized (fVar) {
                    fVar.f24942m4 = fVar.V0() + j10;
                    fVar.notifyAll();
                    e0 e0Var = e0.f22152a;
                    iVar = fVar;
                }
            } else {
                wf.i O0 = this.f24961d.O0(i10);
                if (O0 == null) {
                    return;
                }
                synchronized (O0) {
                    O0.a(j10);
                    e0 e0Var2 = e0.f22152a;
                    iVar = O0;
                }
            }
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            m();
            return e0.f22152a;
        }

        @Override // wf.h.c
        public void j(int i10, int i11, List<wf.c> list) {
            t.e(list, "requestHeaders");
            this.f24961d.l1(i11, list);
        }

        @Override // wf.h.c
        public void k(boolean z10, m mVar) {
            t.e(mVar, "settings");
            this.f24961d.X3.i(new C0442d(t.l(this.f24961d.s0(), " applyAndAckSettings"), true, this, z10, mVar), 0L);
        }

        /* JADX WARN: Type inference failed for: r13v1, types: [T, wf.m] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v4 */
        public final void l(boolean z10, m mVar) {
            ?? r13;
            long c10;
            int i10;
            wf.i[] iVarArr;
            t.e(mVar, "settings");
            j0 j0Var = new j0();
            wf.j e12 = this.f24961d.e1();
            f fVar = this.f24961d;
            synchronized (e12) {
                synchronized (fVar) {
                    m K0 = fVar.K0();
                    if (z10) {
                        r13 = mVar;
                    } else {
                        m mVar2 = new m();
                        mVar2.g(K0);
                        mVar2.g(mVar);
                        r13 = mVar2;
                    }
                    j0Var.f11764c = r13;
                    c10 = r13.c() - K0.c();
                    i10 = 0;
                    if (c10 != 0 && !fVar.R0().isEmpty()) {
                        Object[] array = fVar.R0().values().toArray(new wf.i[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (wf.i[]) array;
                        fVar.s1((m) j0Var.f11764c);
                        fVar.Z3.i(new a(t.l(fVar.s0(), " onSettings"), true, fVar, j0Var), 0L);
                        e0 e0Var = e0.f22152a;
                    }
                    iVarArr = null;
                    fVar.s1((m) j0Var.f11764c);
                    fVar.Z3.i(new a(t.l(fVar.s0(), " onSettings"), true, fVar, j0Var), 0L);
                    e0 e0Var2 = e0.f22152a;
                }
                try {
                    fVar.e1().b((m) j0Var.f11764c);
                } catch (IOException e10) {
                    fVar.h0(e10);
                }
                e0 e0Var3 = e0.f22152a;
            }
            if (iVarArr != null) {
                int length = iVarArr.length;
                while (i10 < length) {
                    wf.i iVar = iVarArr[i10];
                    i10++;
                    synchronized (iVar) {
                        iVar.a(c10);
                        e0 e0Var4 = e0.f22152a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [wf.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable, wf.h] */
        public void m() {
            Throwable th2;
            wf.b bVar;
            wf.b bVar2 = wf.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f24960c.f(this);
                    while (this.f24960c.e(false, this)) {
                    }
                    wf.b bVar3 = wf.b.NO_ERROR;
                    try {
                        this.f24961d.f0(bVar3, wf.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        wf.b bVar4 = wf.b.PROTOCOL_ERROR;
                        f fVar = this.f24961d;
                        fVar.f0(bVar4, bVar4, e10);
                        bVar = fVar;
                        bVar2 = this.f24960c;
                        pf.d.m(bVar2);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f24961d.f0(bVar, bVar2, e10);
                    pf.d.m(this.f24960c);
                    throw th2;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th4) {
                th2 = th4;
                bVar = bVar2;
                this.f24961d.f0(bVar, bVar2, e10);
                pf.d.m(this.f24960c);
                throw th2;
            }
            bVar2 = this.f24960c;
            pf.d.m(bVar2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class e extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f24980e;

        /* renamed from: f */
        final /* synthetic */ boolean f24981f;

        /* renamed from: g */
        final /* synthetic */ f f24982g;

        /* renamed from: h */
        final /* synthetic */ int f24983h;

        /* renamed from: i */
        final /* synthetic */ eg.c f24984i;

        /* renamed from: j */
        final /* synthetic */ int f24985j;

        /* renamed from: k */
        final /* synthetic */ boolean f24986k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, f fVar, int i10, eg.c cVar, int i11, boolean z11) {
            super(str, z10);
            this.f24980e = str;
            this.f24981f = z10;
            this.f24982g = fVar;
            this.f24983h = i10;
            this.f24984i = cVar;
            this.f24985j = i11;
            this.f24986k = z11;
        }

        @Override // sf.a
        public long f() {
            try {
                boolean c10 = this.f24982g.f24928a4.c(this.f24983h, this.f24984i, this.f24985j, this.f24986k);
                if (c10) {
                    this.f24982g.e1().u(this.f24983h, wf.b.CANCEL);
                }
                if (!c10 && !this.f24986k) {
                    return -1L;
                }
                synchronized (this.f24982g) {
                    this.f24982g.f24947q4.remove(Integer.valueOf(this.f24983h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: wf.f$f */
    /* loaded from: classes3.dex */
    public static final class C0443f extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f24987e;

        /* renamed from: f */
        final /* synthetic */ boolean f24988f;

        /* renamed from: g */
        final /* synthetic */ f f24989g;

        /* renamed from: h */
        final /* synthetic */ int f24990h;

        /* renamed from: i */
        final /* synthetic */ List f24991i;

        /* renamed from: j */
        final /* synthetic */ boolean f24992j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0443f(String str, boolean z10, f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f24987e = str;
            this.f24988f = z10;
            this.f24989g = fVar;
            this.f24990h = i10;
            this.f24991i = list;
            this.f24992j = z11;
        }

        @Override // sf.a
        public long f() {
            boolean b10 = this.f24989g.f24928a4.b(this.f24990h, this.f24991i, this.f24992j);
            if (b10) {
                try {
                    this.f24989g.e1().u(this.f24990h, wf.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (b10 || this.f24992j) {
                synchronized (this.f24989g) {
                    this.f24989g.f24947q4.remove(Integer.valueOf(this.f24990h));
                }
                return -1L;
            }
            return -1L;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class g extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f24993e;

        /* renamed from: f */
        final /* synthetic */ boolean f24994f;

        /* renamed from: g */
        final /* synthetic */ f f24995g;

        /* renamed from: h */
        final /* synthetic */ int f24996h;

        /* renamed from: i */
        final /* synthetic */ List f24997i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, f fVar, int i10, List list) {
            super(str, z10);
            this.f24993e = str;
            this.f24994f = z10;
            this.f24995g = fVar;
            this.f24996h = i10;
            this.f24997i = list;
        }

        @Override // sf.a
        public long f() {
            if (this.f24995g.f24928a4.a(this.f24996h, this.f24997i)) {
                try {
                    this.f24995g.e1().u(this.f24996h, wf.b.CANCEL);
                    synchronized (this.f24995g) {
                        this.f24995g.f24947q4.remove(Integer.valueOf(this.f24996h));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class h extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f24998e;

        /* renamed from: f */
        final /* synthetic */ boolean f24999f;

        /* renamed from: g */
        final /* synthetic */ f f25000g;

        /* renamed from: h */
        final /* synthetic */ int f25001h;

        /* renamed from: i */
        final /* synthetic */ wf.b f25002i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, f fVar, int i10, wf.b bVar) {
            super(str, z10);
            this.f24998e = str;
            this.f24999f = z10;
            this.f25000g = fVar;
            this.f25001h = i10;
            this.f25002i = bVar;
        }

        @Override // sf.a
        public long f() {
            this.f25000g.f24928a4.d(this.f25001h, this.f25002i);
            synchronized (this.f25000g) {
                this.f25000g.f24947q4.remove(Integer.valueOf(this.f25001h));
                e0 e0Var = e0.f22152a;
            }
            return -1L;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class i extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f25003e;

        /* renamed from: f */
        final /* synthetic */ boolean f25004f;

        /* renamed from: g */
        final /* synthetic */ f f25005g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, f fVar) {
            super(str, z10);
            this.f25003e = str;
            this.f25004f = z10;
            this.f25005g = fVar;
        }

        @Override // sf.a
        public long f() {
            this.f25005g.z1(false, 2, 0);
            return -1L;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"wf/f$j", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class j extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f25006e;

        /* renamed from: f */
        final /* synthetic */ f f25007f;

        /* renamed from: g */
        final /* synthetic */ long f25008g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j10) {
            super(str, false, 2, null);
            this.f25006e = str;
            this.f25007f = fVar;
            this.f25008g = j10;
        }

        @Override // sf.a
        public long f() {
            boolean z10;
            synchronized (this.f25007f) {
                if (this.f25007f.f24931c4 < this.f25007f.f24929b4) {
                    z10 = true;
                } else {
                    this.f25007f.f24929b4++;
                    z10 = false;
                }
            }
            f fVar = this.f25007f;
            if (z10) {
                fVar.h0(null);
                return -1L;
            }
            fVar.z1(false, 1, 0);
            return this.f25008g;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class k extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f25009e;

        /* renamed from: f */
        final /* synthetic */ boolean f25010f;

        /* renamed from: g */
        final /* synthetic */ f f25011g;

        /* renamed from: h */
        final /* synthetic */ int f25012h;

        /* renamed from: i */
        final /* synthetic */ wf.b f25013i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, f fVar, int i10, wf.b bVar) {
            super(str, z10);
            this.f25009e = str;
            this.f25010f = z10;
            this.f25011g = fVar;
            this.f25012h = i10;
            this.f25013i = bVar;
        }

        @Override // sf.a
        public long f() {
            try {
                this.f25011g.A1(this.f25012h, this.f25013i);
                return -1L;
            } catch (IOException e10) {
                this.f25011g.h0(e10);
                return -1L;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"sf/c", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class l extends sf.a {

        /* renamed from: e */
        final /* synthetic */ String f25014e;

        /* renamed from: f */
        final /* synthetic */ boolean f25015f;

        /* renamed from: g */
        final /* synthetic */ f f25016g;

        /* renamed from: h */
        final /* synthetic */ int f25017h;

        /* renamed from: i */
        final /* synthetic */ long f25018i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, f fVar, int i10, long j10) {
            super(str, z10);
            this.f25014e = str;
            this.f25015f = z10;
            this.f25016g = fVar;
            this.f25017h = i10;
            this.f25018i = j10;
        }

        @Override // sf.a
        public long f() {
            try {
                this.f25016g.e1().B(this.f25017h, this.f25018i);
                return -1L;
            } catch (IOException e10) {
                this.f25016g.h0(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f24927r4 = mVar;
    }

    public f(a aVar) {
        t.e(aVar, "builder");
        boolean b10 = aVar.b();
        this.f24930c = b10;
        this.f24932d = aVar.d();
        String c10 = aVar.c();
        this.f24948x = c10;
        this.U3 = aVar.b() ? 3 : 2;
        sf.e j10 = aVar.j();
        this.W3 = j10;
        sf.d i10 = j10.i();
        this.X3 = i10;
        this.Y3 = j10.i();
        this.Z3 = j10.i();
        this.f24928a4 = aVar.f();
        m mVar = new m();
        if (aVar.b()) {
            mVar.h(7, 16777216);
        }
        this.f24937h4 = mVar;
        m mVar2 = f24927r4;
        this.f24938i4 = mVar2;
        this.f24942m4 = mVar2.c();
        this.f24943n4 = aVar.h();
        this.f24944o4 = new wf.j(aVar.g(), b10);
        this.f24945p4 = new d(this, new wf.h(aVar.i(), b10));
        this.f24947q4 = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.e());
            i10.i(new j(t.l(c10, " ping"), this, nanos), nanos);
        }
    }

    public final void h0(IOException iOException) {
        wf.b bVar = wf.b.PROTOCOL_ERROR;
        f0(bVar, bVar, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0096, TryCatch #1 {, blocks: (B:4:0x0006, B:23:0x0062, B:25:0x0065, B:26:0x006d, B:28:0x0074, B:33:0x0084, B:34:0x008f, B:5:0x0007, B:7:0x0010, B:8:0x0015, B:10:0x0019, B:12:0x0033, B:14:0x003f, B:19:0x004f, B:21:0x0055, B:22:0x0060, B:35:0x0090, B:36:0x0095), top: B:39:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final wf.i h1(int r11, java.util.List<wf.c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            wf.j r7 = r10.f24944o4
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L99
            int r0 = r10.z0()     // Catch: java.lang.Throwable -> L96
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            wf.b r0 = wf.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L96
            r10.t1(r0)     // Catch: java.lang.Throwable -> L96
        L15:
            boolean r0 = r10.V3     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L90
            int r8 = r10.z0()     // Catch: java.lang.Throwable -> L96
            int r0 = r10.z0()     // Catch: java.lang.Throwable -> L96
            int r0 = r0 + 2
            r10.r1(r0)     // Catch: java.lang.Throwable -> L96
            wf.i r9 = new wf.i     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L96
            r0 = 1
            if (r13 == 0) goto L4e
            long r1 = r10.c1()     // Catch: java.lang.Throwable -> L96
            long r3 = r10.V0()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L4e
            long r1 = r9.r()     // Catch: java.lang.Throwable -> L96
            long r3 = r9.q()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L4c
            goto L4e
        L4c:
            r13 = 0
            goto L4f
        L4e:
            r13 = r0
        L4f:
            boolean r1 = r9.u()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L60
            java.util.Map r1 = r10.R0()     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L96
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L96
        L60:
            tb.e0 r1 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L96
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            if (r11 != 0) goto L6d
            wf.j r11 = r10.e1()     // Catch: java.lang.Throwable -> L99
            r11.n(r6, r8, r12)     // Catch: java.lang.Throwable -> L99
            goto L7b
        L6d:
            boolean r1 = r10.j0()     // Catch: java.lang.Throwable -> L99
            r0 = r0 ^ r1
            if (r0 == 0) goto L84
            wf.j r0 = r10.e1()     // Catch: java.lang.Throwable -> L99
            r0.s(r11, r8, r12)     // Catch: java.lang.Throwable -> L99
        L7b:
            monitor-exit(r7)
            if (r13 == 0) goto L83
            wf.j r11 = r10.f24944o4
            r11.flush()
        L83:
            return r9
        L84:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L99
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L99
            throw r12     // Catch: java.lang.Throwable -> L99
        L90:
            wf.a r11 = new wf.a     // Catch: java.lang.Throwable -> L96
            r11.<init>()     // Catch: java.lang.Throwable -> L96
            throw r11     // Catch: java.lang.Throwable -> L96
        L96:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            throw r11     // Catch: java.lang.Throwable -> L99
        L99:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.f.h1(int, java.util.List, boolean):wf.i");
    }

    public static /* synthetic */ void v1(f fVar, boolean z10, sf.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = sf.e.f21693h;
        }
        fVar.u1(z10, eVar);
    }

    public final void A1(int i10, wf.b bVar) {
        t.e(bVar, "statusCode");
        this.f24944o4.u(i10, bVar);
    }

    public final void B1(int i10, wf.b bVar) {
        t.e(bVar, "errorCode");
        sf.d dVar = this.X3;
        dVar.i(new k(this.f24948x + '[' + i10 + "] writeSynReset", true, this, i10, bVar), 0L);
    }

    public final void C1(int i10, long j10) {
        sf.d dVar = this.X3;
        dVar.i(new l(this.f24948x + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final m D0() {
        return this.f24937h4;
    }

    public final m K0() {
        return this.f24938i4;
    }

    public final Socket M0() {
        return this.f24943n4;
    }

    public final synchronized wf.i O0(int i10) {
        return this.f24946q.get(Integer.valueOf(i10));
    }

    public final Map<Integer, wf.i> R0() {
        return this.f24946q;
    }

    public final long V0() {
        return this.f24942m4;
    }

    public final long c1() {
        return this.f24941l4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f0(wf.b.NO_ERROR, wf.b.CANCEL, null);
    }

    public final wf.j e1() {
        return this.f24944o4;
    }

    public final void f0(wf.b bVar, wf.b bVar2, IOException iOException) {
        int i10;
        t.e(bVar, "connectionCode");
        t.e(bVar2, "streamCode");
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            t1(bVar);
        } catch (IOException unused) {
        }
        Object[] objArr = null;
        synchronized (this) {
            if (!R0().isEmpty()) {
                objArr = R0().values().toArray(new wf.i[0]);
                if (objArr == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                R0().clear();
            }
            e0 e0Var = e0.f22152a;
        }
        wf.i[] iVarArr = (wf.i[]) objArr;
        if (iVarArr != null) {
            for (wf.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            e1().close();
        } catch (IOException unused3) {
        }
        try {
            M0().close();
        } catch (IOException unused4) {
        }
        this.X3.o();
        this.Y3.o();
        this.Z3.o();
    }

    public final synchronized boolean f1(long j10) {
        if (this.V3) {
            return false;
        }
        if (this.f24934e4 < this.f24933d4) {
            if (j10 >= this.f24936g4) {
                return false;
            }
        }
        return true;
    }

    public final void flush() {
        this.f24944o4.flush();
    }

    public final wf.i i1(List<wf.c> list, boolean z10) {
        t.e(list, "requestHeaders");
        return h1(0, list, z10);
    }

    public final boolean j0() {
        return this.f24930c;
    }

    public final void j1(int i10, eg.e eVar, int i11, boolean z10) {
        t.e(eVar, "source");
        eg.c cVar = new eg.c();
        long j10 = i11;
        eVar.N0(j10);
        eVar.g1(cVar, j10);
        this.Y3.i(new e(this.f24948x + '[' + i10 + "] onData", true, this, i10, cVar, i11, z10), 0L);
    }

    public final void k1(int i10, List<wf.c> list, boolean z10) {
        t.e(list, "requestHeaders");
        sf.d dVar = this.Y3;
        dVar.i(new C0443f(this.f24948x + '[' + i10 + "] onHeaders", true, this, i10, list, z10), 0L);
    }

    public final void l1(int i10, List<wf.c> list) {
        t.e(list, "requestHeaders");
        synchronized (this) {
            if (this.f24947q4.contains(Integer.valueOf(i10))) {
                B1(i10, wf.b.PROTOCOL_ERROR);
                return;
            }
            this.f24947q4.add(Integer.valueOf(i10));
            sf.d dVar = this.Y3;
            dVar.i(new g(this.f24948x + '[' + i10 + "] onRequest", true, this, i10, list), 0L);
        }
    }

    public final void m1(int i10, wf.b bVar) {
        t.e(bVar, "errorCode");
        sf.d dVar = this.Y3;
        dVar.i(new h(this.f24948x + '[' + i10 + "] onReset", true, this, i10, bVar), 0L);
    }

    public final boolean n1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized wf.i o1(int i10) {
        wf.i remove;
        remove = this.f24946q.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void p1() {
        synchronized (this) {
            long j10 = this.f24934e4;
            long j11 = this.f24933d4;
            if (j10 < j11) {
                return;
            }
            this.f24933d4 = j11 + 1;
            this.f24936g4 = System.nanoTime() + 1000000000;
            e0 e0Var = e0.f22152a;
            this.X3.i(new i(t.l(this.f24948x, " ping"), true, this), 0L);
        }
    }

    public final void q1(int i10) {
        this.f24949y = i10;
    }

    public final void r1(int i10) {
        this.U3 = i10;
    }

    public final String s0() {
        return this.f24948x;
    }

    public final void s1(m mVar) {
        t.e(mVar, "<set-?>");
        this.f24938i4 = mVar;
    }

    public final void t1(wf.b bVar) {
        t.e(bVar, "statusCode");
        synchronized (this.f24944o4) {
            h0 h0Var = new h0();
            synchronized (this) {
                if (this.V3) {
                    return;
                }
                this.V3 = true;
                h0Var.f11761c = u0();
                e0 e0Var = e0.f22152a;
                e1().j(h0Var.f11761c, bVar, pf.d.f19188a);
            }
        }
    }

    public final int u0() {
        return this.f24949y;
    }

    public final void u1(boolean z10, sf.e eVar) {
        t.e(eVar, "taskRunner");
        if (z10) {
            this.f24944o4.e();
            this.f24944o4.z(this.f24937h4);
            int c10 = this.f24937h4.c();
            if (c10 != 65535) {
                this.f24944o4.B(0, c10 - 65535);
            }
        }
        eVar.i().i(new sf.c(this.f24948x, true, this.f24945p4), 0L);
    }

    public final c w0() {
        return this.f24932d;
    }

    public final synchronized void w1(long j10) {
        long j11 = this.f24939j4 + j10;
        this.f24939j4 = j11;
        long j12 = j11 - this.f24940k4;
        if (j12 >= this.f24937h4.c() / 2) {
            C1(0, j12);
            this.f24940k4 += j12;
        }
    }

    public final void x1(int i10, boolean z10, eg.c cVar, long j10) {
        int min;
        long j11;
        if (j10 == 0) {
            this.f24944o4.f(z10, i10, cVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (c1() >= V0()) {
                    try {
                        if (!R0().containsKey(Integer.valueOf(i10))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j10, V0() - c1()), e1().p());
                j11 = min;
                this.f24941l4 = c1() + j11;
                e0 e0Var = e0.f22152a;
            }
            j10 -= j11;
            this.f24944o4.f(z10 && j10 == 0, i10, cVar, min);
        }
    }

    public final void y1(int i10, boolean z10, List<wf.c> list) {
        t.e(list, "alternating");
        this.f24944o4.n(z10, i10, list);
    }

    public final int z0() {
        return this.U3;
    }

    public final void z1(boolean z10, int i10, int i11) {
        try {
            this.f24944o4.r(z10, i10, i11);
        } catch (IOException e10) {
            h0(e10);
        }
    }
}
