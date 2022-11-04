package of;

import eg.f;
import hc.p0;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.t;
import of.z;
import org.conscrypt.BuildConfig;
import rf.d;
import ub.y0;
import yf.h;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00042\u000734B!\b\u0000\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b/\u00101J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u00065"}, d2 = {"Lof/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lrf/d$b;", "Lrf/d;", "editor", "Ltb/e0;", "b", "Lof/z;", "request", "Lof/b0;", "e", "(Lof/z;)Lof/b0;", "response", "Lrf/b;", "i", "(Lof/b0;)Lrf/b;", "j", "(Lof/z;)V", "cached", "network", "u", "(Lof/b0;Lof/b0;)V", "flush", "close", "Lrf/c;", "cacheStrategy", "s", "(Lrf/c;)V", "r", "()V", BuildConfig.FLAVOR, "writeSuccessCount", "I", "h", "()I", "p", "(I)V", "writeAbortCount", "f", "n", "Ljava/io/File;", "directory", BuildConfig.FLAVOR, "maxSize", "Lxf/a;", "fileSystem", "<init>", "(Ljava/io/File;JLxf/a;)V", "(Ljava/io/File;J)V", "a", "c", "d", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c implements Closeable, Flushable {
    public static final b Companion = new b(null);
    private int U3;

    /* renamed from: c */
    private final rf.d f18102c;

    /* renamed from: d */
    private int f18103d;

    /* renamed from: q */
    private int f18104q;

    /* renamed from: x */
    private int f18105x;

    /* renamed from: y */
    private int f18106y;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\n\u001a\u00060\bR\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001b\u0010\n\u001a\u00060\bR\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lof/c$a;", "Lof/c0;", "Lof/w;", "e", BuildConfig.FLAVOR, "b", "Leg/e;", "f", "Lrf/d$d;", "Lrf/d;", "snapshot", "Lrf/d$d;", "h", "()Lrf/d$d;", BuildConfig.FLAVOR, "contentType", "contentLength", "<init>", "(Lrf/d$d;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends c0 {

        /* renamed from: c */
        private final d.C0347d f18107c;

        /* renamed from: d */
        private final String f18108d;

        /* renamed from: q */
        private final String f18109q;

        /* renamed from: x */
        private final eg.e f18110x;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"of/c$a$a", "Leg/i;", "Ltb/e0;", "close", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.c$a$a */
        /* loaded from: classes3.dex */
        public static final class C0285a extends eg.i {

            /* renamed from: d */
            final /* synthetic */ eg.a0 f18111d;

            /* renamed from: q */
            final /* synthetic */ a f18112q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0285a(eg.a0 a0Var, a aVar) {
                super(a0Var);
                this.f18111d = a0Var;
                this.f18112q = aVar;
            }

            @Override // eg.i, eg.a0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f18112q.h().close();
                super.close();
            }
        }

        public a(d.C0347d c0347d, String str, String str2) {
            hc.t.e(c0347d, "snapshot");
            this.f18107c = c0347d;
            this.f18108d = str;
            this.f18109q = str2;
            this.f18110x = eg.n.d(new C0285a(c0347d.e(1), this));
        }

        @Override // of.c0
        public long b() {
            String str = this.f18109q;
            if (str == null) {
                return -1L;
            }
            return pf.d.W(str, -1L);
        }

        @Override // of.c0
        public w e() {
            String str = this.f18108d;
            if (str == null) {
                return null;
            }
            return w.Companion.b(str);
        }

        @Override // of.c0
        public eg.e f() {
            return this.f18110x;
        }

        public final d.C0347d h() {
            return this.f18107c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lof/c$b;", BuildConfig.FLAVOR, "Lof/t;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "requestHeaders", "responseHeaders", "e", "Lof/u;", "url", "b", "Leg/e;", "source", BuildConfig.FLAVOR, "c", "(Leg/e;)I", "Lof/b0;", "cachedResponse", "cachedRequest", "Lof/z;", "newRequest", BuildConfig.FLAVOR, "g", "a", "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> d(t tVar) {
            Set<String> b10;
            boolean v10;
            List<String> x02;
            CharSequence S0;
            Comparator w9;
            int size = tVar.size();
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                v10 = bf.x.v("Vary", tVar.b(i10), true);
                if (v10) {
                    String i12 = tVar.i(i10);
                    if (treeSet == null) {
                        w9 = bf.x.w(p0.f11777a);
                        treeSet = new TreeSet(w9);
                    }
                    x02 = bf.y.x0(i12, new char[]{','}, false, 0, 6, null);
                    for (String str : x02) {
                        S0 = bf.y.S0(str);
                        treeSet.add(S0.toString());
                    }
                }
                i10 = i11;
            }
            if (treeSet == null) {
                b10 = y0.b();
                return b10;
            }
            return treeSet;
        }

        private final t e(t tVar, t tVar2) {
            Set<String> d10 = d(tVar2);
            if (d10.isEmpty()) {
                return pf.d.f19189b;
            }
            t.a aVar = new t.a();
            int i10 = 0;
            int size = tVar.size();
            while (i10 < size) {
                int i11 = i10 + 1;
                String b10 = tVar.b(i10);
                if (d10.contains(b10)) {
                    aVar.a(b10, tVar.i(i10));
                }
                i10 = i11;
            }
            return aVar.d();
        }

        public final boolean a(b0 b0Var) {
            hc.t.e(b0Var, "<this>");
            return d(b0Var.s()).contains("*");
        }

        @fc.c
        public final String b(u uVar) {
            hc.t.e(uVar, "url");
            return eg.f.Companion.d(uVar.toString()).A().x();
        }

        public final int c(eg.e eVar) {
            hc.t.e(eVar, "source");
            try {
                long v02 = eVar.v0();
                String b02 = eVar.b0();
                if (v02 >= 0 && v02 <= 2147483647L) {
                    if (!(b02.length() > 0)) {
                        return (int) v02;
                    }
                }
                throw new IOException("expected an int but was \"" + v02 + b02 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final t f(b0 b0Var) {
            hc.t.e(b0Var, "<this>");
            b0 z10 = b0Var.z();
            hc.t.b(z10);
            return e(z10.W().f(), b0Var.s());
        }

        public final boolean g(b0 b0Var, t tVar, z zVar) {
            hc.t.e(b0Var, "cachedResponse");
            hc.t.e(tVar, "cachedRequest");
            hc.t.e(zVar, "newRequest");
            Set<String> d10 = d(b0Var.s());
            if (!(d10 instanceof Collection) || !d10.isEmpty()) {
                for (String str : d10) {
                    if (!hc.t.a(tVar.k(str), zVar.e(str))) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u001b\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lof/c$c;", BuildConfig.FLAVOR, "Leg/e;", "source", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "c", "Leg/d;", "sink", "certificates", "Ltb/e0;", "e", "Lrf/d$b;", "Lrf/d;", "editor", "f", "Lof/z;", "request", "Lof/b0;", "response", BuildConfig.FLAVOR, "b", "Lrf/d$d;", "snapshot", "d", "a", "()Z", "isHttps", "Leg/a0;", "rawSource", "<init>", "(Leg/a0;)V", "(Lof/b0;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: of.c$c */
    /* loaded from: classes3.dex */
    public static final class C0286c {
        public static final a Companion = new a(null);

        /* renamed from: k */
        private static final String f18113k;

        /* renamed from: l */
        private static final String f18114l;

        /* renamed from: a */
        private final u f18115a;

        /* renamed from: b */
        private final t f18116b;

        /* renamed from: c */
        private final String f18117c;

        /* renamed from: d */
        private final y f18118d;

        /* renamed from: e */
        private final int f18119e;

        /* renamed from: f */
        private final String f18120f;

        /* renamed from: g */
        private final t f18121g;

        /* renamed from: h */
        private final s f18122h;

        /* renamed from: i */
        private final long f18123i;

        /* renamed from: j */
        private final long f18124j;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lof/c$c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.c$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            h.a aVar = yf.h.Companion;
            f18113k = hc.t.l(aVar.g().g(), "-Sent-Millis");
            f18114l = hc.t.l(aVar.g().g(), "-Received-Millis");
        }

        /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable, of.s] */
        public C0286c(eg.a0 a0Var) {
            hc.t.e(a0Var, "rawSource");
            try {
                eg.e d10 = eg.n.d(a0Var);
                String b02 = d10.b0();
                u f10 = u.Companion.f(b02);
                if (f10 == null) {
                    IOException iOException = new IOException(hc.t.l("Cache corruption for ", b02));
                    yf.h.Companion.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f18115a = f10;
                this.f18117c = d10.b0();
                t.a aVar = new t.a();
                int c10 = c.Companion.c(d10);
                boolean z10 = false;
                int i10 = 0;
                while (i10 < c10) {
                    i10++;
                    aVar.b(d10.b0());
                }
                this.f18116b = aVar.d();
                uf.k a10 = uf.k.Companion.a(d10.b0());
                this.f18118d = a10.f23626a;
                this.f18119e = a10.f23627b;
                this.f18120f = a10.f23628c;
                t.a aVar2 = new t.a();
                int c11 = c.Companion.c(d10);
                int i11 = 0;
                while (i11 < c11) {
                    i11++;
                    aVar2.b(d10.b0());
                }
                String str = f18113k;
                String e10 = aVar2.e(str);
                String str2 = f18114l;
                String e11 = aVar2.e(str2);
                aVar2.g(str);
                aVar2.g(str2);
                long j10 = 0;
                this.f18123i = e10 == null ? 0L : Long.parseLong(e10);
                if (e11 != null) {
                    j10 = Long.parseLong(e11);
                }
                this.f18124j = j10;
                this.f18121g = aVar2.d();
                th = 0;
                if (a()) {
                    String b03 = d10.b0();
                    if (b03.length() > 0 ? true : z10) {
                        throw new IOException("expected \"\" but was \"" + b03 + '\"');
                    }
                    this.f18122h = s.Companion.b(!d10.g0() ? e0.Companion.a(d10.b0()) : e0.SSL_3_0, i.Companion.b(d10.b0()), c(d10), c(d10));
                } else {
                    this.f18122h = th;
                }
                tb.e0 e0Var = tb.e0.f22152a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                    dc.b.a(a0Var, th2);
                }
            }
        }

        public C0286c(b0 b0Var) {
            hc.t.e(b0Var, "response");
            this.f18115a = b0Var.W().j();
            this.f18116b = c.Companion.f(b0Var);
            this.f18117c = b0Var.W().h();
            this.f18118d = b0Var.M();
            this.f18119e = b0Var.i();
            this.f18120f = b0Var.u();
            this.f18121g = b0Var.s();
            this.f18122h = b0Var.n();
            this.f18123i = b0Var.e0();
            this.f18124j = b0Var.V();
        }

        private final boolean a() {
            return hc.t.a(this.f18115a.p(), "https");
        }

        private final List<Certificate> c(eg.e eVar) {
            List<Certificate> h10;
            int c10 = c.Companion.c(eVar);
            if (c10 == -1) {
                h10 = ub.u.h();
                return h10;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c10);
                int i10 = 0;
                while (i10 < c10) {
                    i10++;
                    String b02 = eVar.b0();
                    eg.c cVar = new eg.c();
                    eg.f a10 = eg.f.Companion.a(b02);
                    hc.t.b(a10);
                    cVar.k0(a10);
                    arrayList.add(certificateFactory.generateCertificate(cVar.d1()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(eg.d dVar, List<? extends Certificate> list) {
            try {
                dVar.T0(list.size()).i0(10);
                for (Certificate certificate : list) {
                    byte[] encoded = certificate.getEncoded();
                    f.a aVar = eg.f.Companion;
                    hc.t.d(encoded, "bytes");
                    dVar.Q0(f.a.f(aVar, encoded, 0, 0, 3, null).b()).i0(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(z zVar, b0 b0Var) {
            hc.t.e(zVar, "request");
            hc.t.e(b0Var, "response");
            return hc.t.a(this.f18115a, zVar.j()) && hc.t.a(this.f18117c, zVar.h()) && c.Companion.g(b0Var, this.f18116b, zVar);
        }

        public final b0 d(d.C0347d c0347d) {
            hc.t.e(c0347d, "snapshot");
            String a10 = this.f18121g.a("Content-Type");
            String a11 = this.f18121g.a("Content-Length");
            return new b0.a().s(new z.a().m(this.f18115a).f(this.f18117c, null).e(this.f18116b).b()).q(this.f18118d).g(this.f18119e).n(this.f18120f).l(this.f18121g).b(new a(c0347d, a10, a11)).j(this.f18122h).t(this.f18123i).r(this.f18124j).c();
        }

        public final void f(d.b bVar) {
            hc.t.e(bVar, "editor");
            eg.d c10 = eg.n.c(bVar.f(0));
            try {
                c10.Q0(this.f18115a.toString()).i0(10);
                c10.Q0(this.f18117c).i0(10);
                c10.T0(this.f18116b.size()).i0(10);
                int size = this.f18116b.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    c10.Q0(this.f18116b.b(i10)).Q0(": ").Q0(this.f18116b.i(i10)).i0(10);
                    i10 = i11;
                }
                c10.Q0(new uf.k(this.f18118d, this.f18119e, this.f18120f).toString()).i0(10);
                c10.T0(this.f18121g.size() + 2).i0(10);
                int size2 = this.f18121g.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c10.Q0(this.f18121g.b(i12)).Q0(": ").Q0(this.f18121g.i(i12)).i0(10);
                }
                c10.Q0(f18113k).Q0(": ").T0(this.f18123i).i0(10);
                c10.Q0(f18114l).Q0(": ").T0(this.f18124j).i0(10);
                if (a()) {
                    c10.i0(10);
                    s sVar = this.f18122h;
                    hc.t.b(sVar);
                    c10.Q0(sVar.a().c()).i0(10);
                    e(c10, this.f18122h.d());
                    e(c10, this.f18122h.c());
                    c10.Q0(this.f18122h.e().g()).i0(10);
                }
                tb.e0 e0Var = tb.e0.f22152a;
                th = null;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000f\u001a\u00060\rR\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lof/c$d;", "Lrf/b;", "Ltb/e0;", "b", "Leg/y;", "a", BuildConfig.FLAVOR, "done", "Z", "d", "()Z", "e", "(Z)V", "Lrf/d$b;", "Lrf/d;", "editor", "<init>", "(Lof/c;Lrf/d$b;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class d implements rf.b {

        /* renamed from: a */
        private final d.b f18125a;

        /* renamed from: b */
        private final eg.y f18126b;

        /* renamed from: c */
        private final eg.y f18127c;

        /* renamed from: d */
        private boolean f18128d;

        /* renamed from: e */
        final /* synthetic */ c f18129e;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"of/c$d$a", "Leg/h;", "Ltb/e0;", "close", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class a extends eg.h {

            /* renamed from: d */
            final /* synthetic */ c f18130d;

            /* renamed from: q */
            final /* synthetic */ d f18131q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, d dVar, eg.y yVar) {
                super(yVar);
                this.f18130d = cVar;
                this.f18131q = dVar;
            }

            @Override // eg.h, eg.y, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c cVar = this.f18130d;
                d dVar = this.f18131q;
                synchronized (cVar) {
                    if (dVar.d()) {
                        return;
                    }
                    dVar.e(true);
                    cVar.p(cVar.h() + 1);
                    super.close();
                    this.f18131q.f18125a.b();
                }
            }
        }

        public d(c cVar, d.b bVar) {
            hc.t.e(cVar, "this$0");
            hc.t.e(bVar, "editor");
            this.f18129e = cVar;
            this.f18125a = bVar;
            eg.y f10 = bVar.f(1);
            this.f18126b = f10;
            this.f18127c = new a(cVar, this, f10);
        }

        @Override // rf.b
        public eg.y a() {
            return this.f18127c;
        }

        @Override // rf.b
        public void b() {
            c cVar = this.f18129e;
            synchronized (cVar) {
                if (d()) {
                    return;
                }
                e(true);
                cVar.n(cVar.f() + 1);
                pf.d.m(this.f18126b);
                try {
                    this.f18125a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean d() {
            return this.f18128d;
        }

        public final void e(boolean z10) {
            this.f18128d = z10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(File file, long j10) {
        this(file, j10, xf.a.f25606a);
        hc.t.e(file, "directory");
    }

    public c(File file, long j10, xf.a aVar) {
        hc.t.e(file, "directory");
        hc.t.e(aVar, "fileSystem");
        this.f18102c = new rf.d(aVar, file, 201105, 2, j10, sf.e.f21693h);
    }

    private final void b(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18102c.close();
    }

    public final b0 e(z zVar) {
        hc.t.e(zVar, "request");
        try {
            d.C0347d G = this.f18102c.G(Companion.b(zVar.j()));
            if (G == null) {
                return null;
            }
            try {
                C0286c c0286c = new C0286c(G.e(0));
                b0 d10 = c0286c.d(G);
                if (c0286c.b(zVar, d10)) {
                    return d10;
                }
                c0 b10 = d10.b();
                if (b10 != null) {
                    pf.d.m(b10);
                }
                return null;
            } catch (IOException unused) {
                pf.d.m(G);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final int f() {
        return this.f18104q;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f18102c.flush();
    }

    public final int h() {
        return this.f18103d;
    }

    public final rf.b i(b0 b0Var) {
        d.b bVar;
        hc.t.e(b0Var, "response");
        String h10 = b0Var.W().h();
        if (uf.f.f23611a.a(b0Var.W().h())) {
            try {
                j(b0Var.W());
            } catch (IOException unused) {
            }
            return null;
        } else if (!hc.t.a(h10, "GET")) {
            return null;
        } else {
            b bVar2 = Companion;
            if (bVar2.a(b0Var)) {
                return null;
            }
            C0286c c0286c = new C0286c(b0Var);
            try {
                bVar = rf.d.B(this.f18102c, bVar2.b(b0Var.W().j()), 0L, 2, null);
                if (bVar == null) {
                    return null;
                }
                try {
                    c0286c.f(bVar);
                    return new d(this, bVar);
                } catch (IOException unused2) {
                    b(bVar);
                    return null;
                }
            } catch (IOException unused3) {
                bVar = null;
            }
        }
    }

    public final void j(z zVar) {
        hc.t.e(zVar, "request");
        this.f18102c.K0(Companion.b(zVar.j()));
    }

    public final void n(int i10) {
        this.f18104q = i10;
    }

    public final void p(int i10) {
        this.f18103d = i10;
    }

    public final synchronized void r() {
        this.f18106y++;
    }

    public final synchronized void s(rf.c cVar) {
        hc.t.e(cVar, "cacheStrategy");
        this.U3++;
        if (cVar.b() != null) {
            this.f18105x++;
        } else if (cVar.a() != null) {
            this.f18106y++;
        }
    }

    public final void u(b0 b0Var, b0 b0Var2) {
        hc.t.e(b0Var, "cached");
        hc.t.e(b0Var2, "network");
        C0286c c0286c = new C0286c(b0Var2);
        c0 b10 = b0Var.b();
        Objects.requireNonNull(b10, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        d.b bVar = null;
        try {
            bVar = ((a) b10).h().b();
            if (bVar == null) {
                return;
            }
            c0286c.f(bVar);
            bVar.b();
        } catch (IOException unused) {
            b(bVar);
        }
    }
}
