package ta;

import hc.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\n\u000bB%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"Lta/t;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d */
    public static final a f22120d = new a(null);

    /* renamed from: e */
    private static final fb.a<t> f22121e = new fb.a<>("TimeoutFeature");

    /* renamed from: a */
    private final Long f22122a;

    /* renamed from: b */
    private final Long f22123b;

    /* renamed from: c */
    private final Long f22124c;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lta/t$a;", "Lta/k;", "Lta/t$b;", "Lta/t;", "Lqa/e;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", BuildConfig.FLAVOR, "INFINITE_TIMEOUT_MS", "J", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements k<b, t>, qa.e<b> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpTimeout$Feature$install$1", f = "HttpTimeout.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ta.t$a$a */
        /* loaded from: classes.dex */
        public static final class C0387a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ t V3;
            final /* synthetic */ na.a W3;

            /* renamed from: y */
            int f22125y;

            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
            /* renamed from: ta.t$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0388a extends hc.v implements gc.l<Throwable, e0> {

                /* renamed from: c */
                final /* synthetic */ a2 f22126c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0388a(a2 a2Var) {
                    super(1);
                    this.f22126c = a2Var;
                }

                public final void b(Throwable th2) {
                    a2.a.a(this.f22126c, null, 1, null);
                }

                @Override // gc.l
                public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
                    b(th2);
                    return e0.f22152a;
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @zb.f(c = "io.ktor.client.features.HttpTimeout$Feature$install$1$1$killer$1", f = "HttpTimeout.kt", l = {148}, m = "invokeSuspend")
            /* renamed from: ta.t$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
                final /* synthetic */ Long U3;
                final /* synthetic */ a2 V3;
                final /* synthetic */ jb.e<Object, ya.c> W3;

                /* renamed from: y */
                int f22127y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Long l10, a2 a2Var, jb.e<Object, ya.c> eVar, xb.d<? super b> dVar) {
                    super(2, dVar);
                    this.U3 = l10;
                    this.V3 = a2Var;
                    this.W3 = eVar;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    Object c10;
                    c10 = yb.d.c();
                    int i10 = this.f22127y;
                    if (i10 == 0) {
                        tb.t.b(obj);
                        long longValue = this.U3.longValue();
                        this.f22127y = 1;
                        if (a1.a(longValue, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        tb.t.b(obj);
                    }
                    this.V3.r(new r(this.W3.b()));
                    return e0.f22152a;
                }

                /* renamed from: d0 */
                public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
                    return ((b) j(q0Var, dVar)).B(e0.f22152a);
                }

                @Override // zb.a
                public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                    return new b(this.U3, this.V3, this.W3, dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0387a(t tVar, na.a aVar, xb.d<? super C0387a> dVar) {
                super(3, dVar);
                this.V3 = tVar;
                this.W3 = aVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                a2 d10;
                yb.d.c();
                if (this.f22125y == 0) {
                    tb.t.b(obj);
                    jb.e eVar = (jb.e) this.U3;
                    a aVar = t.f22120d;
                    b bVar = (b) ((ya.c) eVar.b()).e(aVar);
                    if (bVar == null && this.V3.f()) {
                        bVar = new b(null, null, null, 7, null);
                        ((ya.c) eVar.b()).i(aVar, bVar);
                    }
                    if (bVar != null) {
                        t tVar = this.V3;
                        na.a aVar2 = this.W3;
                        Long c10 = bVar.c();
                        if (c10 == null) {
                            c10 = tVar.f22123b;
                        }
                        bVar.i(c10);
                        Long e10 = bVar.e();
                        if (e10 == null) {
                            e10 = tVar.f22124c;
                        }
                        bVar.k(e10);
                        Long d11 = bVar.d();
                        if (d11 == null) {
                            d11 = tVar.f22122a;
                        }
                        bVar.j(d11);
                        Long d12 = bVar.d();
                        if (d12 == null) {
                            d12 = tVar.f22122a;
                        }
                        if (d12 != null && d12.longValue() != Long.MAX_VALUE) {
                            d10 = kotlinx.coroutines.l.d(aVar2, null, null, new b(d12, ((ya.c) eVar.b()).f(), eVar, null), 3, null);
                            ((ya.c) eVar.b()).f().D0(new C0388a(d10));
                        }
                    }
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                C0387a c0387a = new C0387a(this.V3, this.W3, dVar);
                c0387a.U3 = eVar;
                return c0387a.B(e0.f22152a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(t tVar, na.a aVar) {
            hc.t.e(tVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.a(), new C0387a(tVar, aVar, null));
        }

        /* renamed from: d */
        public t a(gc.l<? super b, e0> lVar) {
            hc.t.e(lVar, "block");
            b bVar = new b(null, null, null, 7, null);
            lVar.invoke(bVar);
            return bVar.a();
        }

        @Override // ta.k
        public fb.a<t> getKey() {
            return t.f22121e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u00002\u00020\u0001:\u0001\u0007B-\b\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R/\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R/\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R(\u0010 \u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R(\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R(\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014¨\u0006)"}, d2 = {"Lta/t$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "b", "(Ljava/lang/Long;)Ljava/lang/Long;", "Lta/t;", "a", "()Lta/t;", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "<set-?>", "_requestTimeoutMillis$delegate", "Lkc/d;", "g", "()Ljava/lang/Long;", "m", "(Ljava/lang/Long;)V", "_requestTimeoutMillis", "_connectTimeoutMillis$delegate", "f", "l", "_connectTimeoutMillis", "_socketTimeoutMillis$delegate", "h", "n", "_socketTimeoutMillis", "d", "j", "requestTimeoutMillis", "c", "i", "connectTimeoutMillis", "e", "k", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final kc.d f22130a;

        /* renamed from: b */
        private final kc.d f22131b;

        /* renamed from: c */
        private final kc.d f22132c;

        /* renamed from: d */
        static final /* synthetic */ oc.k<Object>[] f22128d = {k0.e(new hc.y(b.class, "_requestTimeoutMillis", "get_requestTimeoutMillis()Ljava/lang/Long;", 0)), k0.e(new hc.y(b.class, "_connectTimeoutMillis", "get_connectTimeoutMillis()Ljava/lang/Long;", 0)), k0.e(new hc.y(b.class, "_socketTimeoutMillis", "get_socketTimeoutMillis()Ljava/lang/Long;", 0))};
        public static final a Companion = new a(null);

        /* renamed from: e */
        private static final fb.a<b> f22129e = new fb.a<>("TimeoutConfiguration");

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lta/t$b$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* renamed from: ta.t$b$b */
        /* loaded from: classes.dex */
        public static final class C0389b implements kc.d<Object, Long> {

            /* renamed from: a */
            private Long f22133a;

            /* renamed from: b */
            final /* synthetic */ Object f22134b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0389b(Object obj) {
                this.f22134b = obj;
                this.f22133a = obj;
            }

            @Override // kc.d, kc.c
            public Long a(Object obj, oc.k<?> kVar) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                return this.f22133a;
            }

            @Override // kc.d
            public void b(Object obj, oc.k<?> kVar, Long l10) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                this.f22133a = l10;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class c implements kc.d<Object, Long> {

            /* renamed from: a */
            private Long f22135a;

            /* renamed from: b */
            final /* synthetic */ Object f22136b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(Object obj) {
                this.f22136b = obj;
                this.f22135a = obj;
            }

            @Override // kc.d, kc.c
            public Long a(Object obj, oc.k<?> kVar) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                return this.f22135a;
            }

            @Override // kc.d
            public void b(Object obj, oc.k<?> kVar, Long l10) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                this.f22135a = l10;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class d implements kc.d<Object, Long> {

            /* renamed from: a */
            private Long f22137a;

            /* renamed from: b */
            final /* synthetic */ Object f22138b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(Object obj) {
                this.f22138b = obj;
                this.f22137a = obj;
            }

            @Override // kc.d, kc.c
            public Long a(Object obj, oc.k<?> kVar) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                return this.f22137a;
            }

            @Override // kc.d
            public void b(Object obj, oc.k<?> kVar, Long l10) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                this.f22137a = l10;
            }
        }

        public b(Long l10, Long l11, Long l12) {
            this.f22130a = new C0389b(0L);
            this.f22131b = new c(0L);
            this.f22132c = new d(0L);
            j(l10);
            i(l11);
            k(l12);
        }

        public /* synthetic */ b(Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
        }

        private final Long b(Long l10) {
            if (l10 == null || l10.longValue() > 0) {
                return l10;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS".toString());
        }

        private final Long f() {
            return (Long) this.f22131b.a(this, f22128d[1]);
        }

        private final Long g() {
            return (Long) this.f22130a.a(this, f22128d[0]);
        }

        private final Long h() {
            return (Long) this.f22132c.a(this, f22128d[2]);
        }

        private final void l(Long l10) {
            this.f22131b.b(this, f22128d[1], l10);
        }

        private final void m(Long l10) {
            this.f22130a.b(this, f22128d[0], l10);
        }

        private final void n(Long l10) {
            this.f22132c.b(this, f22128d[2], l10);
        }

        public final t a() {
            return new t(d(), c(), e());
        }

        public final Long c() {
            return f();
        }

        public final Long d() {
            return g();
        }

        public final Long e() {
            return h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !hc.t.a(k0.b(b.class), k0.b(obj.getClass()))) {
                return false;
            }
            b bVar = (b) obj;
            return hc.t.a(g(), bVar.g()) && hc.t.a(f(), bVar.f()) && hc.t.a(h(), bVar.h());
        }

        public int hashCode() {
            Long g10 = g();
            int i10 = 0;
            int hashCode = (g10 == null ? 0 : g10.hashCode()) * 31;
            Long f10 = f();
            int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            Long h10 = h();
            if (h10 != null) {
                i10 = h10.hashCode();
            }
            return hashCode2 + i10;
        }

        public final void i(Long l10) {
            l(b(l10));
        }

        public final void j(Long l10) {
            m(b(l10));
        }

        public final void k(Long l10) {
            n(b(l10));
        }
    }

    public t(Long l10, Long l11, Long l12) {
        this.f22122a = l10;
        this.f22123b = l11;
        this.f22124c = l12;
    }

    public final boolean f() {
        return (this.f22122a == null && this.f22123b == null && this.f22124c == null) ? false : true;
    }
}
