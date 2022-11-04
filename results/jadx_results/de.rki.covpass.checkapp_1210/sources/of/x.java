package of;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.f0;
import of.r;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\r\u008c\u0001B\u0014\b\u0000\u0012\u0007\u0010\u0088\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008b\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0011\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8G¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010#\u001a\u00020\"8G¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8G¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020'8G¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+R\u0017\u00103\u001a\u00020'8G¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0017\u00106\u001a\u0002058G¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010;\u001a\u0004\u0018\u00010:8G¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8G¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010E\u001a\u0004\u0018\u00010D8G¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010J\u001a\u00020I8G¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010N\u001a\u00020,8G¢\u0006\f\n\u0004\bN\u0010.\u001a\u0004\bO\u00100R\u0017\u0010Q\u001a\u00020P8G¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010X\u001a\u00020U8G¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0019\u0010Z\u001a\u0004\u0018\u00010Y8G¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u001a8G¢\u0006\f\n\u0004\b_\u0010\u001d\u001a\u0004\b`\u0010\u001fR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a8G¢\u0006\f\n\u0004\bb\u0010\u001d\u001a\u0004\bc\u0010\u001fR\u0017\u0010e\u001a\u00020d8G¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010j\u001a\u00020i8G¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010o\u001a\u0004\u0018\u00010n8G¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010t\u001a\u00020s8G¢\u0006\f\n\u0004\bt\u0010G\u001a\u0004\bu\u0010vR\u0017\u0010w\u001a\u00020s8G¢\u0006\f\n\u0004\bw\u0010G\u001a\u0004\bx\u0010vR\u0017\u0010y\u001a\u00020s8G¢\u0006\f\n\u0004\by\u0010G\u001a\u0004\bz\u0010vR\u0017\u0010{\u001a\u00020s8G¢\u0006\f\n\u0004\b{\u0010G\u001a\u0004\b|\u0010vR\u0017\u0010}\u001a\u00020s8G¢\u0006\f\n\u0004\b}\u0010G\u001a\u0004\b~\u0010vR\u001b\u0010\u0080\u0001\u001a\u00020\u007f8G¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010O\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008d\u0001"}, d2 = {"Lof/x;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/f0$a;", "Ltb/e0;", "P", "Lof/z;", "request", "Lof/e;", "E", "Lof/g0;", "listener", "Lof/f0;", "a", "Lof/x$a;", "D", "Lof/p;", "dispatcher", "Lof/p;", "p", "()Lof/p;", "Lof/k;", "connectionPool", "Lof/k;", "l", "()Lof/k;", BuildConfig.FLAVOR, "Lof/v;", "interceptors", "Ljava/util/List;", "A", "()Ljava/util/List;", "networkInterceptors", "C", "Lof/r$c;", "eventListenerFactory", "Lof/r$c;", "t", "()Lof/r$c;", BuildConfig.FLAVOR, "retryOnConnectionFailure", "Z", "M", "()Z", "Lof/b;", "authenticator", "Lof/b;", "f", "()Lof/b;", "followRedirects", "v", "followSslRedirects", "w", "Lof/n;", "cookieJar", "Lof/n;", "o", "()Lof/n;", "Lof/c;", "cache", "Lof/c;", "g", "()Lof/c;", "Lof/q;", "dns", "Lof/q;", "q", "()Lof/q;", "Ljava/net/Proxy;", "proxy", "Ljava/net/Proxy;", "I", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "proxySelector", "Ljava/net/ProxySelector;", "K", "()Ljava/net/ProxySelector;", "proxyAuthenticator", "J", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/SocketFactory;", "N", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "O", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "R", "()Ljavax/net/ssl/X509TrustManager;", "Lof/l;", "connectionSpecs", "m", "Lof/y;", "protocols", "H", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "y", "()Ljavax/net/ssl/HostnameVerifier;", "Lof/g;", "certificatePinner", "Lof/g;", "j", "()Lof/g;", "Lbg/c;", "certificateChainCleaner", "Lbg/c;", "i", "()Lbg/c;", BuildConfig.FLAVOR, "callTimeoutMillis", "h", "()I", "connectTimeoutMillis", "k", "readTimeoutMillis", "L", "writeTimeoutMillis", "Q", "pingIntervalMillis", "F", BuildConfig.FLAVOR, "minWebSocketMessageToCompress", "B", "()J", "Ltf/h;", "routeDatabase", "Ltf/h;", "x", "()Ltf/h;", "builder", "<init>", "(Lof/x$a;)V", "()V", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class x implements Cloneable, f0.a {
    public static final b Companion = new b(null);

    /* renamed from: t4 */
    private static final List<y> f18324t4 = pf.d.w(y.HTTP_2, y.HTTP_1_1);

    /* renamed from: u4 */
    private static final List<l> f18325u4 = pf.d.w(l.f18252h, l.f18254j);
    private final boolean U3;
    private final of.b V3;
    private final boolean W3;
    private final boolean X3;
    private final n Y3;
    private final c Z3;

    /* renamed from: a4 */
    private final q f18326a4;

    /* renamed from: b4 */
    private final Proxy f18327b4;

    /* renamed from: c */
    private final p f18328c;

    /* renamed from: c4 */
    private final ProxySelector f18329c4;

    /* renamed from: d */
    private final k f18330d;

    /* renamed from: d4 */
    private final of.b f18331d4;

    /* renamed from: e4 */
    private final SocketFactory f18332e4;

    /* renamed from: f4 */
    private final SSLSocketFactory f18333f4;

    /* renamed from: g4 */
    private final X509TrustManager f18334g4;

    /* renamed from: h4 */
    private final List<l> f18335h4;

    /* renamed from: i4 */
    private final List<y> f18336i4;

    /* renamed from: j4 */
    private final HostnameVerifier f18337j4;

    /* renamed from: k4 */
    private final g f18338k4;

    /* renamed from: l4 */
    private final bg.c f18339l4;

    /* renamed from: m4 */
    private final int f18340m4;

    /* renamed from: n4 */
    private final int f18341n4;

    /* renamed from: o4 */
    private final int f18342o4;

    /* renamed from: p4 */
    private final int f18343p4;

    /* renamed from: q */
    private final List<v> f18344q;

    /* renamed from: q4 */
    private final int f18345q4;

    /* renamed from: r4 */
    private final long f18346r4;

    /* renamed from: s4 */
    private final tf.h f18347s4;

    /* renamed from: x */
    private final List<v> f18348x;

    /* renamed from: y */
    private final r.c f18349y;

    @Metadata(bv = {}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001B\u0014\b\u0010\u0012\u0007\u0010Ç\u0001\u001a\u00020.¢\u0006\u0006\bÅ\u0001\u0010È\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aJ\u0014\u0010 \u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0014\u0010#\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$J\u0016\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)J\u0016\u0010,\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)J\u0006\u0010/\u001a\u00020.R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\"\u0010D\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\u000e\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010J\u001a\u0004\bV\u0010L\"\u0004\bJ\u0010NR\"\u0010W\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010J\u001a\u0004\bX\u0010L\"\u0004\bY\u0010NR\"\u0010[\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010s\u001a\u0004\u0018\u00010r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010y\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010Q\u001a\u0004\bz\u0010S\"\u0004\b{\u0010UR%\u0010}\u001a\u00020|8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R+\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R+\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001f\u0010>\u001a\u0005\b\u008f\u0001\u0010@\"\u0006\b\u0090\u0001\u0010\u0091\u0001R+\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\"\u0010>\u001a\u0005\b\u0092\u0001\u0010@\"\u0006\b\u0093\u0001\u0010\u0091\u0001R*\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R'\u0010%\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b%\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R,\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R)\u0010¨\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b¨\u0001\u0010K\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R)\u0010\u00ad\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u00ad\u0001\u0010K\u001a\u0006\b®\u0001\u0010ª\u0001\"\u0006\b¯\u0001\u0010¬\u0001R)\u0010°\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b°\u0001\u0010K\u001a\u0006\b±\u0001\u0010ª\u0001\"\u0006\b²\u0001\u0010¬\u0001R)\u0010³\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b³\u0001\u0010K\u001a\u0006\b´\u0001\u0010ª\u0001\"\u0006\bµ\u0001\u0010¬\u0001R)\u0010¶\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b¶\u0001\u0010K\u001a\u0006\b·\u0001\u0010ª\u0001\"\u0006\b¸\u0001\u0010¬\u0001R)\u0010¹\u0001\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bº\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006É\u0001"}, d2 = {"Lof/x$a;", BuildConfig.FLAVOR, "Lof/p;", "dispatcher", "g", "Lof/v;", "interceptor", "a", "Lof/r;", "eventListener", "h", BuildConfig.FLAVOR, "retryOnConnectionFailure", "R", "followRedirects", "i", "followProtocolRedirects", "j", "Lof/c;", "cache", "c", "Ljava/net/Proxy;", "proxy", "P", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "j0", BuildConfig.FLAVOR, "Lof/l;", "connectionSpecs", "f", "Lof/y;", "protocols", "O", "Lof/g;", "certificatePinner", "d", BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "Q", "k0", "Lof/x;", "b", "Lof/p;", "t", "()Lof/p;", "X", "(Lof/p;)V", "Lof/k;", "connectionPool", "Lof/k;", "q", "()Lof/k;", "setConnectionPool$okhttp", "(Lof/k;)V", BuildConfig.FLAVOR, "interceptors", "Ljava/util/List;", "z", "()Ljava/util/List;", "networkInterceptors", "B", "Lof/r$c;", "eventListenerFactory", "Lof/r$c;", "v", "()Lof/r$c;", "Y", "(Lof/r$c;)V", "Z", "I", "()Z", "e0", "(Z)V", "Lof/b;", "authenticator", "Lof/b;", "k", "()Lof/b;", "setAuthenticator$okhttp", "(Lof/b;)V", "w", "followSslRedirects", "x", "a0", "Lof/n;", "cookieJar", "Lof/n;", "s", "()Lof/n;", "setCookieJar$okhttp", "(Lof/n;)V", "Lof/c;", "l", "()Lof/c;", "S", "(Lof/c;)V", "Lof/q;", "dns", "Lof/q;", "u", "()Lof/q;", "setDns$okhttp", "(Lof/q;)V", "Ljava/net/Proxy;", "E", "()Ljava/net/Proxy;", "c0", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "proxySelector", "Ljava/net/ProxySelector;", "G", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxyAuthenticator", "F", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/SocketFactory;", "K", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "L", "()Ljavax/net/ssl/SSLSocketFactory;", "g0", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "N", "()Ljavax/net/ssl/X509TrustManager;", "i0", "(Ljavax/net/ssl/X509TrustManager;)V", "r", "W", "(Ljava/util/List;)V", "D", "b0", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "y", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lof/g;", "o", "()Lof/g;", "U", "(Lof/g;)V", "Lbg/c;", "certificateChainCleaner", "Lbg/c;", "n", "()Lbg/c;", "T", "(Lbg/c;)V", BuildConfig.FLAVOR, "callTimeout", "m", "()I", "setCallTimeout$okhttp", "(I)V", "connectTimeout", "p", "V", "readTimeout", "H", "d0", "writeTimeout", "M", "h0", "pingInterval", "C", "setPingInterval$okhttp", "minWebSocketMessageToCompress", "J", "A", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Ltf/h;", "routeDatabase", "Ltf/h;", "()Ltf/h;", "f0", "(Ltf/h;)V", "<init>", "()V", "okHttpClient", "(Lof/x;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private int A;
        private int B;
        private long C;
        private tf.h D;

        /* renamed from: a */
        private p f18350a;

        /* renamed from: b */
        private k f18351b;

        /* renamed from: c */
        private final List<v> f18352c;

        /* renamed from: d */
        private final List<v> f18353d;

        /* renamed from: e */
        private r.c f18354e;

        /* renamed from: f */
        private boolean f18355f;

        /* renamed from: g */
        private of.b f18356g;

        /* renamed from: h */
        private boolean f18357h;

        /* renamed from: i */
        private boolean f18358i;

        /* renamed from: j */
        private n f18359j;

        /* renamed from: k */
        private c f18360k;

        /* renamed from: l */
        private q f18361l;

        /* renamed from: m */
        private Proxy f18362m;

        /* renamed from: n */
        private ProxySelector f18363n;

        /* renamed from: o */
        private of.b f18364o;

        /* renamed from: p */
        private SocketFactory f18365p;

        /* renamed from: q */
        private SSLSocketFactory f18366q;

        /* renamed from: r */
        private X509TrustManager f18367r;

        /* renamed from: s */
        private List<l> f18368s;

        /* renamed from: t */
        private List<? extends y> f18369t;

        /* renamed from: u */
        private HostnameVerifier f18370u;

        /* renamed from: v */
        private g f18371v;

        /* renamed from: w */
        private bg.c f18372w;

        /* renamed from: x */
        private int f18373x;

        /* renamed from: y */
        private int f18374y;

        /* renamed from: z */
        private int f18375z;

        public a() {
            this.f18350a = new p();
            this.f18351b = new k();
            this.f18352c = new ArrayList();
            this.f18353d = new ArrayList();
            this.f18354e = pf.d.g(r.f18288a);
            this.f18355f = true;
            of.b bVar = of.b.f18078a;
            this.f18356g = bVar;
            this.f18357h = true;
            this.f18358i = true;
            this.f18359j = n.f18276a;
            this.f18361l = q.f18286a;
            this.f18364o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            hc.t.d(socketFactory, "getDefault()");
            this.f18365p = socketFactory;
            b bVar2 = x.Companion;
            this.f18368s = bVar2.a();
            this.f18369t = bVar2.b();
            this.f18370u = bg.d.f6031a;
            this.f18371v = g.f18166c;
            this.f18374y = 10000;
            this.f18375z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(x xVar) {
            this();
            hc.t.e(xVar, "okHttpClient");
            this.f18350a = xVar.p();
            this.f18351b = xVar.l();
            ub.z.x(this.f18352c, xVar.A());
            ub.z.x(this.f18353d, xVar.C());
            this.f18354e = xVar.t();
            this.f18355f = xVar.M();
            this.f18356g = xVar.f();
            this.f18357h = xVar.v();
            this.f18358i = xVar.w();
            this.f18359j = xVar.o();
            this.f18360k = xVar.g();
            this.f18361l = xVar.q();
            this.f18362m = xVar.I();
            this.f18363n = xVar.K();
            this.f18364o = xVar.J();
            this.f18365p = xVar.N();
            this.f18366q = xVar.f18333f4;
            this.f18367r = xVar.R();
            this.f18368s = xVar.m();
            this.f18369t = xVar.H();
            this.f18370u = xVar.y();
            this.f18371v = xVar.j();
            this.f18372w = xVar.i();
            this.f18373x = xVar.h();
            this.f18374y = xVar.k();
            this.f18375z = xVar.L();
            this.A = xVar.Q();
            this.B = xVar.F();
            this.C = xVar.B();
            this.D = xVar.x();
        }

        public final long A() {
            return this.C;
        }

        public final List<v> B() {
            return this.f18353d;
        }

        public final int C() {
            return this.B;
        }

        public final List<y> D() {
            return this.f18369t;
        }

        public final Proxy E() {
            return this.f18362m;
        }

        public final of.b F() {
            return this.f18364o;
        }

        public final ProxySelector G() {
            return this.f18363n;
        }

        public final int H() {
            return this.f18375z;
        }

        public final boolean I() {
            return this.f18355f;
        }

        public final tf.h J() {
            return this.D;
        }

        public final SocketFactory K() {
            return this.f18365p;
        }

        public final SSLSocketFactory L() {
            return this.f18366q;
        }

        public final int M() {
            return this.A;
        }

        public final X509TrustManager N() {
            return this.f18367r;
        }

        public final a O(List<? extends y> list) {
            List H0;
            hc.t.e(list, "protocols");
            H0 = ub.c0.H0(list);
            y yVar = y.H2_PRIOR_KNOWLEDGE;
            boolean z10 = false;
            if (H0.contains(yVar) || H0.contains(y.HTTP_1_1)) {
                if (!H0.contains(yVar) || H0.size() <= 1) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException(hc.t.l("protocols containing h2_prior_knowledge cannot use other protocols: ", H0).toString());
                }
                if (!(!H0.contains(y.HTTP_1_0))) {
                    throw new IllegalArgumentException(hc.t.l("protocols must not contain http/1.0: ", H0).toString());
                }
                if (!(!H0.contains(null))) {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
                H0.remove(y.SPDY_3);
                if (!hc.t.a(H0, D())) {
                    f0(null);
                }
                List<? extends y> unmodifiableList = Collections.unmodifiableList(H0);
                hc.t.d(unmodifiableList, "unmodifiableList(protocolsCopy)");
                b0(unmodifiableList);
                return this;
            }
            throw new IllegalArgumentException(hc.t.l("protocols must contain h2_prior_knowledge or http/1.1: ", H0).toString());
        }

        public final a P(Proxy proxy) {
            if (!hc.t.a(proxy, E())) {
                f0(null);
            }
            c0(proxy);
            return this;
        }

        public final a Q(long j10, TimeUnit timeUnit) {
            hc.t.e(timeUnit, "unit");
            d0(pf.d.k("timeout", j10, timeUnit));
            return this;
        }

        public final a R(boolean z10) {
            e0(z10);
            return this;
        }

        public final void S(c cVar) {
            this.f18360k = cVar;
        }

        public final void T(bg.c cVar) {
            this.f18372w = cVar;
        }

        public final void U(g gVar) {
            hc.t.e(gVar, "<set-?>");
            this.f18371v = gVar;
        }

        public final void V(int i10) {
            this.f18374y = i10;
        }

        public final void W(List<l> list) {
            hc.t.e(list, "<set-?>");
            this.f18368s = list;
        }

        public final void X(p pVar) {
            hc.t.e(pVar, "<set-?>");
            this.f18350a = pVar;
        }

        public final void Y(r.c cVar) {
            hc.t.e(cVar, "<set-?>");
            this.f18354e = cVar;
        }

        public final void Z(boolean z10) {
            this.f18357h = z10;
        }

        public final a a(v vVar) {
            hc.t.e(vVar, "interceptor");
            z().add(vVar);
            return this;
        }

        public final void a0(boolean z10) {
            this.f18358i = z10;
        }

        public final x b() {
            return new x(this);
        }

        public final void b0(List<? extends y> list) {
            hc.t.e(list, "<set-?>");
            this.f18369t = list;
        }

        public final a c(c cVar) {
            S(cVar);
            return this;
        }

        public final void c0(Proxy proxy) {
            this.f18362m = proxy;
        }

        public final a d(g gVar) {
            hc.t.e(gVar, "certificatePinner");
            if (!hc.t.a(gVar, o())) {
                f0(null);
            }
            U(gVar);
            return this;
        }

        public final void d0(int i10) {
            this.f18375z = i10;
        }

        public final a e(long j10, TimeUnit timeUnit) {
            hc.t.e(timeUnit, "unit");
            V(pf.d.k("timeout", j10, timeUnit));
            return this;
        }

        public final void e0(boolean z10) {
            this.f18355f = z10;
        }

        public final a f(List<l> list) {
            hc.t.e(list, "connectionSpecs");
            if (!hc.t.a(list, r())) {
                f0(null);
            }
            W(pf.d.U(list));
            return this;
        }

        public final void f0(tf.h hVar) {
            this.D = hVar;
        }

        public final a g(p pVar) {
            hc.t.e(pVar, "dispatcher");
            X(pVar);
            return this;
        }

        public final void g0(SSLSocketFactory sSLSocketFactory) {
            this.f18366q = sSLSocketFactory;
        }

        public final a h(r rVar) {
            hc.t.e(rVar, "eventListener");
            Y(pf.d.g(rVar));
            return this;
        }

        public final void h0(int i10) {
            this.A = i10;
        }

        public final a i(boolean z10) {
            Z(z10);
            return this;
        }

        public final void i0(X509TrustManager x509TrustManager) {
            this.f18367r = x509TrustManager;
        }

        public final a j(boolean z10) {
            a0(z10);
            return this;
        }

        public final a j0(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            hc.t.e(sSLSocketFactory, "sslSocketFactory");
            hc.t.e(x509TrustManager, "trustManager");
            if (!hc.t.a(sSLSocketFactory, L()) || !hc.t.a(x509TrustManager, N())) {
                f0(null);
            }
            g0(sSLSocketFactory);
            T(bg.c.Companion.a(x509TrustManager));
            i0(x509TrustManager);
            return this;
        }

        public final of.b k() {
            return this.f18356g;
        }

        public final a k0(long j10, TimeUnit timeUnit) {
            hc.t.e(timeUnit, "unit");
            h0(pf.d.k("timeout", j10, timeUnit));
            return this;
        }

        public final c l() {
            return this.f18360k;
        }

        public final int m() {
            return this.f18373x;
        }

        public final bg.c n() {
            return this.f18372w;
        }

        public final g o() {
            return this.f18371v;
        }

        public final int p() {
            return this.f18374y;
        }

        public final k q() {
            return this.f18351b;
        }

        public final List<l> r() {
            return this.f18368s;
        }

        public final n s() {
            return this.f18359j;
        }

        public final p t() {
            return this.f18350a;
        }

        public final q u() {
            return this.f18361l;
        }

        public final r.c v() {
            return this.f18354e;
        }

        public final boolean w() {
            return this.f18357h;
        }

        public final boolean x() {
            return this.f18358i;
        }

        public final HostnameVerifier y() {
            return this.f18370u;
        }

        public final List<v> z() {
            return this.f18352c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lof/x$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/y;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lof/l;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<l> a() {
            return x.f18325u4;
        }

        public final List<y> b() {
            return x.f18324t4;
        }
    }

    public x() {
        this(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0071, code lost:
        if (r0 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(of.x.a r4) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.x.<init>(of.x$a):void");
    }

    private final void P() {
        boolean z10;
        boolean z11 = true;
        if (!this.f18344q.contains(null)) {
            if (!(!this.f18348x.contains(null))) {
                throw new IllegalStateException(hc.t.l("Null network interceptor: ", C()).toString());
            }
            List<l> list = this.f18335h4;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (l lVar : list) {
                    if (lVar.f()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                if (this.f18333f4 == null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
                if (this.f18339l4 == null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                if (this.f18334g4 == null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
                return;
            }
            if (!(this.f18333f4 == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.f18339l4 == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (this.f18334g4 != null) {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!hc.t.a(this.f18338k4, g.f18166c)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException(hc.t.l("Null interceptor: ", A()).toString());
    }

    public final List<v> A() {
        return this.f18344q;
    }

    public final long B() {
        return this.f18346r4;
    }

    public final List<v> C() {
        return this.f18348x;
    }

    public a D() {
        return new a(this);
    }

    public e E(z zVar) {
        hc.t.e(zVar, "request");
        return new tf.e(this, zVar, false);
    }

    public final int F() {
        return this.f18345q4;
    }

    public final List<y> H() {
        return this.f18336i4;
    }

    public final Proxy I() {
        return this.f18327b4;
    }

    public final of.b J() {
        return this.f18331d4;
    }

    public final ProxySelector K() {
        return this.f18329c4;
    }

    public final int L() {
        return this.f18342o4;
    }

    public final boolean M() {
        return this.U3;
    }

    public final SocketFactory N() {
        return this.f18332e4;
    }

    public final SSLSocketFactory O() {
        SSLSocketFactory sSLSocketFactory = this.f18333f4;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int Q() {
        return this.f18343p4;
    }

    public final X509TrustManager R() {
        return this.f18334g4;
    }

    @Override // of.f0.a
    public f0 a(z zVar, g0 g0Var) {
        hc.t.e(zVar, "request");
        hc.t.e(g0Var, "listener");
        cg.d dVar = new cg.d(sf.e.f21693h, zVar, g0Var, new Random(), this.f18345q4, null, this.f18346r4);
        dVar.o(this);
        return dVar;
    }

    public Object clone() {
        return super.clone();
    }

    public final of.b f() {
        return this.V3;
    }

    public final c g() {
        return this.Z3;
    }

    public final int h() {
        return this.f18340m4;
    }

    public final bg.c i() {
        return this.f18339l4;
    }

    public final g j() {
        return this.f18338k4;
    }

    public final int k() {
        return this.f18341n4;
    }

    public final k l() {
        return this.f18330d;
    }

    public final List<l> m() {
        return this.f18335h4;
    }

    public final n o() {
        return this.Y3;
    }

    public final p p() {
        return this.f18328c;
    }

    public final q q() {
        return this.f18326a4;
    }

    public final r.c t() {
        return this.f18349y;
    }

    public final boolean v() {
        return this.W3;
    }

    public final boolean w() {
        return this.X3;
    }

    public final tf.h x() {
        return this.f18347s4;
    }

    public final HostnameVerifier y() {
        return this.f18337j4;
    }
}
