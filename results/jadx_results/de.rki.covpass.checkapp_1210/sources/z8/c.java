package z8;

import bb.f0;
import bb.l0;
import de.rki.covpass.logging.Lumber;
import dg.a;
import gc.p;
import hc.t;
import hc.v;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.Metadata;
import of.e0;
import of.g;
import of.i;
import of.l;
import of.x;
import org.conscrypt.BuildConfig;
import ta.a0;
import ta.t;
import tb.m;
import timber.log.a;
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\"\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lz8/c;", "Lz8/d;", "Ltb/e0;", "m", "Lz8/e;", "logLevel", "d", BuildConfig.FLAVOR, "pattern", "pin", "a", "Lkotlin/Function1;", "Lna/b;", "Lsa/c;", "block", "Lna/a;", "c", "userAgent", "b", "Ljavax/net/ssl/X509TrustManager;", "trustManager$delegate", "Lkotlin/Lazy;", "q", "()Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLContext;", "sslContext$delegate", "o", "()Ljavax/net/ssl/SSLContext;", "sslContext", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory$delegate", "p", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lof/x;", "okHttpClient$delegate", "n", "()Lof/x;", "okHttpClient", "<init>", "()V", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c implements z8.d {

    /* renamed from: a */
    private boolean f26512a;

    /* renamed from: c */
    private String f26514c;

    /* renamed from: e */
    private final Lazy f26516e;

    /* renamed from: f */
    private final Lazy f26517f;

    /* renamed from: g */
    private final Lazy f26518g;

    /* renamed from: i */
    private final Lazy f26520i;

    /* renamed from: b */
    private z8.e f26513b = z8.e.NONE;

    /* renamed from: d */
    private final l f26515d = new l.a(l.f18251g).j(e0.TLS_1_3, e0.TLS_1_2).c(i.f18221o1, i.f18218n1, i.f18179a1, i.Z0, i.f18191e1, i.f18188d1).a();

    /* renamed from: h */
    private final g.a f26519h = new g.a();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lna/b;", "Lsa/c;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends v implements gc.l<na.b<sa.c>, tb.e0> {

        /* renamed from: d */
        final /* synthetic */ gc.l<na.b<sa.c>, tb.e0> f26522d;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/c;", "Ltb/e0;", "b", "(Lsa/c;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: z8.c$a$a */
        /* loaded from: classes.dex */
        public static final class C0468a extends v implements gc.l<sa.c, tb.e0> {

            /* renamed from: c */
            final /* synthetic */ c f26523c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0468a(c cVar) {
                super(1);
                this.f26523c = cVar;
            }

            public final void b(sa.c cVar) {
                t.e(cVar, "$this$engine");
                x.a D = this.f26523c.n().D();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cVar.g(D.e(0L, timeUnit).Q(0L, timeUnit).k0(0L, timeUnit).a(new a9.a()).b());
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(sa.c cVar) {
                b(cVar);
                return tb.e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lta/t$b;", "Ltb/e0;", "b", "(Lta/t$b;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends v implements gc.l<t.b, tb.e0> {

            /* renamed from: c */
            public static final b f26524c = new b();

            b() {
                super(1);
            }

            public final void b(t.b bVar) {
                hc.t.e(bVar, "$this$install");
                bVar.i(15000L);
                bVar.j(15000L);
                bVar.k(15000L);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(t.b bVar) {
                b(bVar);
                return tb.e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lta/a0$a;", "Ltb/e0;", "b", "(Lta/a0$a;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: z8.c$a$c */
        /* loaded from: classes.dex */
        public static final class C0469c extends v implements gc.l<a0.a, tb.e0> {

            /* renamed from: c */
            final /* synthetic */ String f26525c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0469c(String str) {
                super(1);
                this.f26525c = str;
            }

            public final void b(a0.a aVar) {
                hc.t.e(aVar, "$this$install");
                aVar.b(this.f26525c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(a0.a aVar) {
                b(aVar);
                return tb.e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class d extends v implements gc.l<ya.c, tb.e0> {

            /* renamed from: c */
            public static final d f26526c = new d();

            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbb/f0;", "it", "Ltb/e0;", "b", "(Lbb/f0;Lbb/f0;)V"}, k = 3, mv = {1, 7, 1})
            /* renamed from: z8.c$a$d$a */
            /* loaded from: classes.dex */
            public static final class C0470a extends v implements p<f0, f0, tb.e0> {

                /* renamed from: c */
                public static final C0470a f26527c = new C0470a();

                C0470a() {
                    super(2);
                }

                public final void b(f0 f0Var, f0 f0Var2) {
                    hc.t.e(f0Var, "$this$url");
                    hc.t.e(f0Var2, "it");
                    f0Var.r(l0.Companion.d());
                }

                @Override // gc.p
                public /* bridge */ /* synthetic */ tb.e0 u(f0 f0Var, f0 f0Var2) {
                    b(f0Var, f0Var2);
                    return tb.e0.f22152a;
                }
            }

            d() {
                super(1);
            }

            public final void b(ya.c cVar) {
                hc.t.e(cVar, "$this$defaultRequest");
                cVar.n(C0470a.f26527c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(ya.c cVar) {
                b(cVar);
                return tb.e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.l<? super na.b<sa.c>, tb.e0> lVar) {
            super(1);
            c.this = r1;
            this.f26522d = lVar;
        }

        public final void b(na.b<sa.c> bVar) {
            hc.t.e(bVar, "$this$HttpClient");
            bVar.b(new C0468a(c.this));
            bVar.o(false);
            bVar.j(ta.t.f22120d, b.f26524c);
            String str = c.this.f26514c;
            if (str != null) {
                bVar.j(a0.f22033b, new C0469c(str));
            }
            ta.e.a(bVar, d.f26526c);
            this.f26522d.invoke(bVar);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(na.b<sa.c> bVar) {
            b(bVar);
            return tb.e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lof/x;", "b", "()Lof/x;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<x> {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f26529a;

            static {
                int[] iArr = new int[z8.e.values().length];
                iArr[z8.e.NONE.ordinal()] = 1;
                iArr[z8.e.HEADERS.ordinal()] = 2;
                iArr[z8.e.BODY.ordinal()] = 3;
                f26529a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            c.this = r1;
        }

        /* renamed from: b */
        public final x invoke() {
            List<l> d10;
            dg.a aVar;
            a.EnumC0133a enumC0133a;
            c.this.f26512a = true;
            x.a aVar2 = new x.a();
            c cVar = c.this;
            aVar2.i(false);
            d10 = ub.t.d(cVar.f26515d);
            aVar2.f(d10);
            aVar2.d(cVar.f26519h.b());
            aVar2.j0(cVar.p(), cVar.q());
            int i10 = a.f26529a[cVar.f26513b.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    aVar = new dg.a(null, 1, null);
                    enumC0133a = a.EnumC0133a.HEADERS;
                } else if (i10 != 3) {
                    throw new tb.p();
                } else {
                    aVar = new dg.a(null, 1, null);
                    enumC0133a = a.EnumC0133a.BODY;
                }
                aVar2.a(aVar.e(enumC0133a));
            } else {
                tb.e0 e0Var = tb.e0.f22152a;
            }
            return aVar2.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljavax/net/ssl/SSLContext;", "kotlin.jvm.PlatformType", "b", "()Ljavax/net/ssl/SSLContext;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: z8.c$c */
    /* loaded from: classes.dex */
    public static final class C0471c extends v implements gc.a<SSLContext> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0471c() {
            super(0);
            c.this = r1;
        }

        /* renamed from: b */
        public final SSLContext invoke() {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{c.this.q()}, new SecureRandom());
            return sSLContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljavax/net/ssl/SSLSocketFactory;", "kotlin.jvm.PlatformType", "b", "()Ljavax/net/ssl/SSLSocketFactory;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<SSLSocketFactory> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            c.this = r1;
        }

        /* renamed from: b */
        public final SSLSocketFactory invoke() {
            return c.this.o().getSocketFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz8/b;", "b", "()Lz8/b;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<z8.b> {

        /* renamed from: c */
        public static final e f26532c = new e();

        e() {
            super(0);
        }

        /* renamed from: b */
        public final z8.b invoke() {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            boolean z10 = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z10 = false;
            }
            if (z10) {
                TrustManager trustManager = trustManagers[0];
                hc.t.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return new z8.b((X509TrustManager) trustManager);
            }
            throw new IllegalStateException(("Unexpected default trust managers: " + trustManagers).toString());
        }
    }

    public c() {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        a10 = m.a(e.f26532c);
        this.f26516e = a10;
        a11 = m.a(new C0471c());
        this.f26517f = a11;
        a12 = m.a(new d());
        this.f26518g = a12;
        a13 = m.a(new b());
        this.f26520i = a13;
    }

    private final void m() {
        if (!this.f26512a) {
            return;
        }
        throw new IllegalStateException("The HttpConfig is frozen already. Please enable logging only at app launch.");
    }

    public final SSLContext o() {
        Object value = this.f26517f.getValue();
        hc.t.d(value, "<get-sslContext>(...)");
        return (SSLContext) value;
    }

    public final SSLSocketFactory p() {
        Object value = this.f26518g.getValue();
        hc.t.d(value, "<get-sslSocketFactory>(...)");
        return (SSLSocketFactory) value;
    }

    public final X509TrustManager q() {
        return (X509TrustManager) this.f26516e.getValue();
    }

    @Override // z8.d
    public void a(String str, String str2) {
        hc.t.e(str, "pattern");
        hc.t.e(str2, "pin");
        m();
        if (Lumber.Companion.getEnabled()) {
            a.b bVar = timber.log.a.f22457a;
            bVar.d(null, "Pinning host pattern " + str + " to public key " + str2, new Object[0]);
        }
        this.f26519h.a(str, str2);
    }

    @Override // z8.d
    public void b(String str) {
        hc.t.e(str, "userAgent");
        this.f26514c = str;
    }

    @Override // z8.d
    public na.a c(gc.l<? super na.b<sa.c>, tb.e0> lVar) {
        hc.t.e(lVar, "block");
        return na.c.a(sa.a.f21564a, new a(lVar));
    }

    @Override // z8.d
    public void d(z8.e eVar) {
        hc.t.e(eVar, "logLevel");
        m();
        this.f26513b = eVar;
    }

    public x n() {
        return (x) this.f26520i.getValue();
    }
}
