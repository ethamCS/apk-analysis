package sa;

import bb.w;
import fb.n;
import gc.p;
import hc.q;
import hc.v;
import java.io.Closeable;
import java.net.Proxy;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t1;
import of.b0;
import of.c0;
import of.x;
import org.conscrypt.BuildConfig;
import ta.t;
import tb.e0;
import tb.l;
import tb.m;
import ub.y0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b3\u00104J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u001b\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lsa/d;", "Lqa/c;", "Lof/x;", "engine", "Lof/z;", "engineRequest", "Lxb/g;", "callContext", "Lya/g;", "G", "(Lof/x;Lof/z;Lxb/g;Lxb/d;)Ljava/lang/Object;", "Lya/d;", "requestData", "B", "(Lof/x;Lof/z;Lxb/g;Lya/d;Lxb/d;)Ljava/lang/Object;", "Lof/b0;", "response", "Lib/b;", "requestTime", BuildConfig.FLAVOR, "body", "u", "Lta/t$b;", "timeoutExtension", "z", "data", "E0", "(Lya/d;Lxb/d;)Ljava/lang/Object;", "Ltb/e0;", "close", "Lsa/c;", "config", "Lsa/c;", "M", "()Lsa/c;", "Lkotlinx/coroutines/l0;", "dispatcher$delegate", "Lkotlin/Lazy;", "I0", "()Lkotlinx/coroutines/l0;", "dispatcher", BuildConfig.FLAVOR, "Lqa/e;", "supportedCapabilities", "Ljava/util/Set;", "p0", "()Ljava/util/Set;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "<init>", "(Lsa/c;)V", "c", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends qa.c {
    private static final c Companion = new c(null);
    @Deprecated
    private static final Lazy<x> Y3 = l.a(b.f21575c);
    private final Set<qa.e<?>> U3;
    private final xb.g V3;
    private final xb.g W3;

    /* renamed from: x */
    private final sa.c f21572x;

    /* renamed from: y */
    private final Lazy f21573y = l.a(new f());
    private final Map<t.b, x> X3 = fb.g.a(new C0362d(this), e.f21576c, k().c());

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f21574y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            d.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21574y;
            try {
                if (i10 == 0) {
                    tb.t.b(obj);
                    g.b i11 = d.this.V3.i(a2.W0);
                    hc.t.b(i11);
                    this.f21574y = 1;
                    if (((a2) i11).V0(this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    tb.t.b(obj);
                }
                for (Map.Entry entry : r4) {
                    x xVar = (x) entry.getValue();
                    xVar.l().a();
                    xVar.p().b().shutdown();
                }
                ((Closeable) d.this.I0()).close();
                return e0.f22152a;
            } finally {
                for (Map.Entry entry2 : d.this.X3.entrySet()) {
                    x xVar2 = (x) entry2.getValue();
                    xVar2.l().a();
                    xVar2.p().b().shutdown();
                }
                ((Closeable) d.this.I0()).close();
            }
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lof/x;", "b", "()Lof/x;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.a<x> {

        /* renamed from: c */
        public static final b f21575c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final x invoke() {
            return new x.a().b();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lsa/d$c;", BuildConfig.FLAVOR, "Lof/x;", "okHttpClientPrototype$delegate", "Lkotlin/Lazy;", "a", "()Lof/x;", "okHttpClientPrototype", "<init>", "()V", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            return (x) d.Y3.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: sa.d$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0362d extends q implements gc.l<t.b, x> {
        C0362d(Object obj) {
            super(1, obj, d.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/features/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        }

        /* renamed from: i0 */
        public final x invoke(t.b bVar) {
            return ((d) this.f11756d).z(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lof/x;", "it", "Ltb/e0;", "b", "(Lof/x;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.l<x, e0> {

        /* renamed from: c */
        public static final e f21576c = new e();

        e() {
            super(1);
        }

        public final void b(x xVar) {
            hc.t.e(xVar, "it");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(x xVar) {
            b(xVar);
            return e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/l0;", "b", "()Lkotlinx/coroutines/l0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.a<l0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            d.this = r1;
        }

        /* renamed from: b */
        public final l0 invoke() {
            return ab.c.b(g1.f15390a, d.this.k().b(), "ktor-okhttp-dispatcher");
        }
    }

    @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {70, 77, 79}, m = "execute")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class g extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f21578x;

        /* renamed from: y */
        Object f21579y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(xb.d<? super g> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return d.this.E0(null, this);
        }
    }

    @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {112}, m = "executeHttpRequest")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f21580x;

        /* renamed from: y */
        Object f21581y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return d.this.B(null, null, null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class i extends v implements gc.l<Throwable, e0> {

        /* renamed from: c */
        final /* synthetic */ c0 f21582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(c0 c0Var) {
            super(1);
            this.f21582c = c0Var;
        }

        public final void b(Throwable th2) {
            c0 c0Var = this.f21582c;
            if (c0Var == null) {
                return;
            }
            c0Var.close();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    @zb.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {101}, m = "executeWebSocketRequest")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class j extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f21583x;

        /* renamed from: y */
        Object f21584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(xb.d<? super j> dVar) {
            super(dVar);
            d.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return d.this.G(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sa.c cVar) {
        super("ktor-okhttp");
        Lazy a10;
        Set<qa.e<?>> e10;
        hc.t.e(cVar, "config");
        this.f21572x = cVar;
        a10 = m.a(new f());
        this.f21573y = a10;
        e10 = y0.e(t.f22120d, xa.a.f25507a);
        this.U3 = e10;
        g.b i10 = super.h().i(a2.W0);
        hc.t.b(i10);
        xb.g a11 = n.a((a2) i10);
        this.V3 = a11;
        this.W3 = super.h().B(a11);
        kotlinx.coroutines.j.c(t1.f15571c, super.h(), s0.ATOMIC, new a(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(of.x r7, of.z r8, xb.g r9, ya.d r10, xb.d<? super ya.g> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof sa.d.h
            if (r0 == 0) goto L13
            r0 = r11
            sa.d$h r0 = (sa.d.h) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            sa.d$h r0 = new sa.d$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.V3
            ib.b r7 = (ib.b) r7
            java.lang.Object r8 = r0.U3
            r10 = r8
            ya.d r10 = (ya.d) r10
            java.lang.Object r8 = r0.f21581y
            r9 = r8
            xb.g r9 = (xb.g) r9
            java.lang.Object r8 = r0.f21580x
            sa.d r8 = (sa.d) r8
            tb.t.b(r11)
            goto L60
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            tb.t.b(r11)
            ib.b r11 = ib.a.b(r4, r3, r4)
            r0.f21580x = r6
            r0.f21581y = r9
            r0.U3 = r10
            r0.V3 = r11
            r0.Y3 = r3
            java.lang.Object r7 = sa.h.b(r7, r8, r10, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r8 = r6
            r5 = r11
            r11 = r7
            r7 = r5
        L60:
            of.b0 r11 = (of.b0) r11
            of.c0 r0 = r11.b()
            kotlinx.coroutines.a2$b r1 = kotlinx.coroutines.a2.W0
            xb.g$b r1 = r9.i(r1)
            hc.t.b(r1)
            kotlinx.coroutines.a2 r1 = (kotlinx.coroutines.a2) r1
            sa.d$i r2 = new sa.d$i
            r2.<init>(r0)
            r1.D0(r2)
            if (r0 != 0) goto L7c
            goto L87
        L7c:
            eg.e r0 = r0.f()
            if (r0 != 0) goto L83
            goto L87
        L83:
            io.ktor.utils.io.h r4 = sa.e.d(r0, r9, r10)
        L87:
            if (r4 != 0) goto L8f
            io.ktor.utils.io.h$a r10 = io.ktor.utils.io.h.Companion
            io.ktor.utils.io.h r4 = r10.a()
        L8f:
            ya.g r7 = r8.u(r11, r7, r4, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.d.B(of.x, of.z, xb.g, ya.d, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(of.x r6, of.z r7, xb.g r8, xb.d<? super ya.g> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof sa.d.j
            if (r0 == 0) goto L13
            r0 = r9
            sa.d$j r0 = (sa.d.j) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            sa.d$j r0 = new sa.d$j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.V3
            sa.f r6 = (sa.f) r6
            java.lang.Object r7 = r0.U3
            ib.b r7 = (ib.b) r7
            java.lang.Object r8 = r0.f21584y
            xb.g r8 = (xb.g) r8
            java.lang.Object r0 = r0.f21583x
            sa.d r0 = (sa.d) r0
            tb.t.b(r9)
            goto L75
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            tb.t.b(r9)
            r9 = 0
            ib.b r9 = ib.a.b(r9, r3, r9)
            sa.f r2 = new sa.f
            sa.c r4 = r5.k()
            of.f0$a r4 = r4.f()
            if (r4 != 0) goto L56
            r4 = r6
        L56:
            r2.<init>(r6, r4, r7, r8)
            r2.o()
            kotlinx.coroutines.y r6 = r2.m()
            r0.f21583x = r5
            r0.f21584y = r8
            r0.U3 = r9
            r0.V3 = r2
            r0.Y3 = r3
            java.lang.Object r6 = r6.G(r0)
            if (r6 != r1) goto L71
            return r1
        L71:
            r0 = r5
            r7 = r9
            r9 = r6
            r6 = r2
        L75:
            of.b0 r9 = (of.b0) r9
            ya.g r6 = r0.u(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.d.G(of.x, of.z, xb.g, xb.d):java.lang.Object");
    }

    private final ya.g u(b0 b0Var, ib.b bVar, Object obj, xb.g gVar) {
        return new ya.g(new w(b0Var.i(), b0Var.u()), bVar, sa.h.c(b0Var.s()), sa.h.d(b0Var.M()), obj, gVar);
    }

    public final x z(t.b bVar) {
        x e10 = k().e();
        if (e10 == null) {
            e10 = Companion.a();
        }
        x.a D = e10.D();
        D.g(new of.p());
        k().d().invoke(D);
        Proxy a10 = k().a();
        if (a10 != null) {
            D.P(a10);
        }
        if (bVar != null) {
            sa.e.h(D, bVar);
        }
        return D.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    @Override // qa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E0(ya.d r10, xb.d<? super ya.g> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof sa.d.g
            if (r0 == 0) goto L13
            r0 = r11
            sa.d$g r0 = (sa.d.g) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            sa.d$g r0 = new sa.d$g
            r0.<init>(r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.U3
            java.lang.Object r0 = yb.b.c()
            int r1 = r6.W3
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            tb.t.b(r11)
            goto L91
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            tb.t.b(r11)
            goto L85
        L3c:
            java.lang.Object r10 = r6.f21579y
            ya.d r10 = (ya.d) r10
            java.lang.Object r1 = r6.f21578x
            sa.d r1 = (sa.d) r1
            tb.t.b(r11)
            goto L59
        L48:
            tb.t.b(r11)
            r6.f21578x = r9
            r6.f21579y = r10
            r6.W3 = r4
            java.lang.Object r11 = qa.n.a(r6)
            if (r11 != r0) goto L58
            return r0
        L58:
            r1 = r9
        L59:
            r5 = r10
            r4 = r11
            xb.g r4 = (xb.g) r4
            of.z r10 = sa.e.a(r5, r4)
            java.util.Map<ta.t$b, of.x> r11 = r1.X3
            ta.t$a r7 = ta.t.f22120d
            java.lang.Object r7 = r5.c(r7)
            java.lang.Object r11 = r11.get(r7)
            of.x r11 = (of.x) r11
            if (r11 == 0) goto L92
            boolean r7 = ya.e.a(r5)
            r8 = 0
            r6.f21578x = r8
            r6.f21579y = r8
            if (r7 == 0) goto L86
            r6.W3 = r3
            java.lang.Object r11 = r1.G(r11, r10, r4, r6)
            if (r11 != r0) goto L85
            return r0
        L85:
            return r11
        L86:
            r6.W3 = r2
            r2 = r11
            r3 = r10
            java.lang.Object r11 = r1.B(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L91
            return r0
        L91:
            return r11
        L92:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "OkHttpClient can't be constructed because HttpTimeout feature is not installed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.d.E0(ya.d, xb.d):java.lang.Object");
    }

    @Override // qa.b
    public l0 I0() {
        return (l0) this.f21573y.getValue();
    }

    /* renamed from: M */
    public sa.c k() {
        return this.f21572x;
    }

    @Override // qa.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        g.b i10 = this.V3.i(a2.W0);
        Objects.requireNonNull(i10, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((kotlinx.coroutines.b0) i10).V();
    }

    @Override // qa.c, kotlinx.coroutines.q0
    public xb.g h() {
        return this.W3;
    }

    @Override // qa.c, qa.b
    public Set<qa.e<?>> p0() {
        return this.U3;
    }
}
