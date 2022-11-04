package wf;

import eg.a0;
import hc.t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.t;
import of.x;
import of.y;
import of.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lwf/g;", "Luf/d;", "Lof/z;", "request", BuildConfig.FLAVOR, "contentLength", "Leg/y;", "f", "Ltb/e0;", "b", "d", "c", BuildConfig.FLAVOR, "expectContinue", "Lof/b0$a;", "g", "Lof/b0;", "response", "a", "Leg/a0;", "e", "cancel", "Ltf/f;", "connection", "Ltf/f;", "h", "()Ltf/f;", "Lof/x;", "client", "Luf/g;", "chain", "Lwf/f;", "http2Connection", "<init>", "(Lof/x;Ltf/f;Luf/g;Lwf/f;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g implements uf.d {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final List<String> f25019g = pf.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    private static final List<String> f25020h = pf.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final tf.f f25021a;

    /* renamed from: b */
    private final uf.g f25022b;

    /* renamed from: c */
    private final f f25023c;

    /* renamed from: d */
    private volatile i f25024d;

    /* renamed from: e */
    private final y f25025e;

    /* renamed from: f */
    private volatile boolean f25026f;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lwf/g$a;", BuildConfig.FLAVOR, "Lof/z;", "request", BuildConfig.FLAVOR, "Lwf/c;", "a", "Lof/t;", "headerBlock", "Lof/y;", "protocol", "Lof/b0$a;", "b", BuildConfig.FLAVOR, "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<c> a(z zVar) {
            t.e(zVar, "request");
            of.t f10 = zVar.f();
            ArrayList arrayList = new ArrayList(f10.size() + 4);
            arrayList.add(new c(c.f24894f, zVar.h()));
            arrayList.add(new c(c.f24895g, uf.i.f23624a.c(zVar.j())));
            String d10 = zVar.d("Host");
            if (d10 != null) {
                arrayList.add(new c(c.f24897i, d10));
            }
            arrayList.add(new c(c.f24896h, zVar.j().p()));
            int i10 = 0;
            int size = f10.size();
            while (i10 < size) {
                int i11 = i10 + 1;
                String b10 = f10.b(i10);
                Locale locale = Locale.US;
                t.d(locale, "US");
                String lowerCase = b10.toLowerCase(locale);
                t.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f25019g.contains(lowerCase) || (t.a(lowerCase, "te") && t.a(f10.i(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, f10.i(i10)));
                }
                i10 = i11;
            }
            return arrayList;
        }

        public final b0.a b(of.t tVar, y yVar) {
            t.e(tVar, "headerBlock");
            t.e(yVar, "protocol");
            t.a aVar = new t.a();
            int size = tVar.size();
            uf.k kVar = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String b10 = tVar.b(i10);
                String i12 = tVar.i(i10);
                if (hc.t.a(b10, ":status")) {
                    kVar = uf.k.Companion.a(hc.t.l("HTTP/1.1 ", i12));
                } else if (!g.f25020h.contains(b10)) {
                    aVar.c(b10, i12);
                }
                i10 = i11;
            }
            if (kVar != null) {
                return new b0.a().q(yVar).g(kVar.f23627b).n(kVar.f23628c).l(aVar.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public g(x xVar, tf.f fVar, uf.g gVar, f fVar2) {
        hc.t.e(xVar, "client");
        hc.t.e(fVar, "connection");
        hc.t.e(gVar, "chain");
        hc.t.e(fVar2, "http2Connection");
        this.f25021a = fVar;
        this.f25022b = gVar;
        this.f25023c = fVar2;
        List<y> H = xVar.H();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        this.f25025e = !H.contains(yVar) ? y.HTTP_2 : yVar;
    }

    @Override // uf.d
    public long a(b0 b0Var) {
        hc.t.e(b0Var, "response");
        if (!uf.e.b(b0Var)) {
            return 0L;
        }
        return pf.d.v(b0Var);
    }

    @Override // uf.d
    public void b(z zVar) {
        hc.t.e(zVar, "request");
        if (this.f25024d != null) {
            return;
        }
        this.f25024d = this.f25023c.i1(Companion.a(zVar), zVar.a() != null);
        if (this.f25026f) {
            i iVar = this.f25024d;
            hc.t.b(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f25024d;
        hc.t.b(iVar2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar2.v().g(this.f25022b.i(), timeUnit);
        i iVar3 = this.f25024d;
        hc.t.b(iVar3);
        iVar3.G().g(this.f25022b.k(), timeUnit);
    }

    @Override // uf.d
    public void c() {
        i iVar = this.f25024d;
        hc.t.b(iVar);
        iVar.n().close();
    }

    @Override // uf.d
    public void cancel() {
        this.f25026f = true;
        i iVar = this.f25024d;
        if (iVar == null) {
            return;
        }
        iVar.f(b.CANCEL);
    }

    @Override // uf.d
    public void d() {
        this.f25023c.flush();
    }

    @Override // uf.d
    public a0 e(b0 b0Var) {
        hc.t.e(b0Var, "response");
        i iVar = this.f25024d;
        hc.t.b(iVar);
        return iVar.p();
    }

    @Override // uf.d
    public eg.y f(z zVar, long j10) {
        hc.t.e(zVar, "request");
        i iVar = this.f25024d;
        hc.t.b(iVar);
        return iVar.n();
    }

    @Override // uf.d
    public b0.a g(boolean z10) {
        i iVar = this.f25024d;
        hc.t.b(iVar);
        b0.a b10 = Companion.b(iVar.E(), this.f25025e);
        if (!z10 || b10.h() != 100) {
            return b10;
        }
        return null;
    }

    @Override // uf.d
    public tf.f h() {
        return this.f25021a;
    }
}
