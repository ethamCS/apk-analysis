package ta;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0014\u0015Bh\b\u0000\u0012(\u0010\u000e\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012(\u0010\u000f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lta/i;", BuildConfig.FLAVOR, "Lza/c;", "response", "Ltb/e0;", "f", "(Lza/c;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "cause", "e", "(Ljava/lang/Throwable;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lkotlin/Function2;", "Lxb/d;", "responseValidators", "callExceptionHandlers", BuildConfig.FLAVOR, "expectSuccess", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final fb.a<i> f22063d = new fb.a<>("HttpResponseValidator");

    /* renamed from: a */
    private final List<gc.p<za.c, xb.d<? super e0>, Object>> f22064a;

    /* renamed from: b */
    private final List<gc.p<Throwable, xb.d<? super e0>, Object>> f22065b;

    /* renamed from: c */
    private final boolean f22066c;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lta/i$a;", "Lta/k;", "Lta/i$b;", "Lta/i;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements k<b, i> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", l = {112, 115}, m = "invokeSuspend")
        /* renamed from: ta.i$a$a */
        /* loaded from: classes.dex */
        public static final class C0381a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            final /* synthetic */ i W3;

            /* renamed from: y */
            int f22067y;

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: ta.i$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0382a extends hc.v implements gc.a<Boolean> {

                /* renamed from: c */
                final /* synthetic */ i f22068c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0382a(i iVar) {
                    super(0);
                    this.f22068c = iVar;
                }

                /* renamed from: b */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f22068c.f22066c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0381a(i iVar, xb.d<? super C0381a> dVar) {
                super(3, dVar);
                this.W3 = iVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f22067y;
                try {
                    if (i10 == 0) {
                        tb.t.b(obj);
                        jb.e eVar = (jb.e) this.U3;
                        Object obj2 = this.V3;
                        ((ya.c) eVar.b()).c().d(j.b(), new C0382a(this.W3));
                        this.U3 = null;
                        this.f22067y = 1;
                        if (eVar.O0(obj2, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.U3;
                        tb.t.b(obj);
                        throw th2;
                    } else {
                        tb.t.b(obj);
                    }
                    return e0.f22152a;
                } catch (Throwable th3) {
                    Throwable a10 = ab.e.a(th3);
                    i iVar = this.W3;
                    this.U3 = a10;
                    this.f22067y = 2;
                    if (iVar.e(a10, this) != c10) {
                        throw a10;
                    }
                    return c10;
                }
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                C0381a c0381a = new C0381a(this.W3, dVar);
                c0381a.U3 = eVar;
                c0381a.V3 = obj;
                return c0381a.B(e0.f22152a);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", "Lza/d;", "Loa/b;", "container", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", l = {e.j.K0, 127}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends zb.l implements gc.q<jb.e<za.d, oa.b>, za.d, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            final /* synthetic */ i W3;

            /* renamed from: y */
            int f22069y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, xb.d<? super b> dVar) {
                super(3, dVar);
                this.W3 = iVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f22069y;
                try {
                    if (i10 == 0) {
                        tb.t.b(obj);
                        jb.e eVar = (jb.e) this.U3;
                        za.d dVar = (za.d) this.V3;
                        this.U3 = null;
                        this.f22069y = 1;
                        if (eVar.O0(dVar, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.U3;
                        tb.t.b(obj);
                        throw th2;
                    } else {
                        tb.t.b(obj);
                    }
                    return e0.f22152a;
                } catch (Throwable th3) {
                    Throwable a10 = ab.e.a(th3);
                    i iVar = this.W3;
                    this.U3 = a10;
                    this.f22069y = 2;
                    if (iVar.e(a10, this) != c10) {
                        throw a10;
                    }
                    return c10;
                }
            }

            /* renamed from: d0 */
            public final Object s(jb.e<za.d, oa.b> eVar, za.d dVar, xb.d<? super e0> dVar2) {
                b bVar = new b(this.W3, dVar2);
                bVar.U3 = eVar;
                bVar.V3 = dVar;
                return bVar.B(e0.f22152a);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lta/y;", "Loa/b;", "call", "Lya/c;", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", l = {133}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends zb.l implements gc.r<y, oa.b, ya.c, xb.d<? super oa.b>, Object> {
            /* synthetic */ Object U3;
            final /* synthetic */ i V3;

            /* renamed from: y */
            int f22070y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(i iVar, xb.d<? super c> dVar) {
                super(4, dVar);
                this.V3 = iVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f22070y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oa.b bVar = (oa.b) this.U3;
                    tb.t.b(obj);
                    return bVar;
                }
                tb.t.b(obj);
                oa.b bVar2 = (oa.b) this.U3;
                i iVar = this.V3;
                za.c g10 = bVar2.g();
                this.U3 = bVar2;
                this.f22070y = 1;
                return iVar.f(g10, this) == c10 ? c10 : bVar2;
            }

            /* renamed from: d0 */
            public final Object M(y yVar, oa.b bVar, ya.c cVar, xb.d<? super oa.b> dVar) {
                c cVar2 = new c(this.V3, dVar);
                cVar2.U3 = bVar;
                return cVar2.B(e0.f22152a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(i iVar, na.a aVar) {
            hc.t.e(iVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.a(), new C0381a(iVar, null));
            jb.h hVar = new jb.h("BeforeReceive");
            aVar.u().n(za.f.f26572i.b(), hVar);
            aVar.u().o(hVar, new b(iVar, null));
            ((s) l.b(aVar, s.f22105c)).d(new c(iVar, null));
        }

        /* renamed from: d */
        public i a(gc.l<? super b, e0> lVar) {
            List q02;
            List q03;
            hc.t.e(lVar, "block");
            b bVar = new b();
            lVar.invoke(bVar);
            q02 = c0.q0(bVar.c());
            q03 = c0.q0(bVar.b());
            return new i(q02, q03, bVar.a());
        }

        @Override // ta.k
        public fb.a<i> getKey() {
            return i.f22063d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u0019J4\u0010\u0007\u001a\u00020\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR?\u0010\n\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00020\t8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR?\u0010\u000f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00020\t8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR(\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lta/i$b;", BuildConfig.FLAVOR, "Lkotlin/Function2;", "Lza/c;", "Lxb/d;", "Ltb/e0;", "block", "e", "(Lgc/p;)V", BuildConfig.FLAVOR, "responseValidators", "Ljava/util/List;", "c", "()Ljava/util/List;", BuildConfig.FLAVOR, "responseExceptionHandlers", "b", BuildConfig.FLAVOR, "expectSuccess", "Z", "a", "()Z", "d", "(Z)V", "getExpectSuccess$annotations", "()V", "<init>", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<gc.p<za.c, xb.d<? super e0>, Object>> f22071a = new ArrayList();

        /* renamed from: b */
        private final List<gc.p<Throwable, xb.d<? super e0>, Object>> f22072b = new ArrayList();

        /* renamed from: c */
        private boolean f22073c = true;

        public final boolean a() {
            return this.f22073c;
        }

        public final List<gc.p<Throwable, xb.d<? super e0>, Object>> b() {
            return this.f22072b;
        }

        public final List<gc.p<za.c, xb.d<? super e0>, Object>> c() {
            return this.f22071a;
        }

        public final void d(boolean z10) {
            this.f22073c = z10;
        }

        public final void e(gc.p<? super za.c, ? super xb.d<? super e0>, ? extends Object> pVar) {
            hc.t.e(pVar, "block");
            this.f22071a.add(pVar);
        }
    }

    @zb.f(c = "io.ktor.client.features.HttpCallValidator", f = "HttpCallValidator.kt", l = {58}, m = "processException")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f22074x;

        /* renamed from: y */
        Object f22075y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return i.this.e(null, this);
        }
    }

    @zb.f(c = "io.ktor.client.features.HttpCallValidator", f = "HttpCallValidator.kt", l = {54}, m = "validateResponse")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f22076x;

        /* renamed from: y */
        Object f22077y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return i.this.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends gc.p<? super za.c, ? super xb.d<? super e0>, ? extends Object>> list, List<? extends gc.p<? super Throwable, ? super xb.d<? super e0>, ? extends Object>> list2, boolean z10) {
        hc.t.e(list, "responseValidators");
        hc.t.e(list2, "callExceptionHandlers");
        this.f22064a = list;
        this.f22065b = list2;
        this.f22066c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Throwable r6, xb.d<? super tb.e0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ta.i.c
            if (r0 == 0) goto L13
            r0 = r7
            ta.i$c r0 = (ta.i.c) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            ta.i$c r0 = new ta.i$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f22075y
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f22074x
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            tb.t.b(r7)
            r7 = r2
            goto L46
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            tb.t.b(r7)
            java.util.List<gc.p<java.lang.Throwable, xb.d<? super tb.e0>, java.lang.Object>> r7 = r5.f22065b
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L46:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()
            gc.p r2 = (gc.p) r2
            r0.f22074x = r7
            r0.f22075y = r6
            r0.W3 = r3
            java.lang.Object r2 = r2.u(r7, r0)
            if (r2 != r1) goto L46
            return r1
        L5f:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.i.e(java.lang.Throwable, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(za.c r6, xb.d<? super tb.e0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ta.i.d
            if (r0 == 0) goto L13
            r0 = r7
            ta.i$d r0 = (ta.i.d) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            ta.i$d r0 = new ta.i$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f22077y
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f22076x
            za.c r2 = (za.c) r2
            tb.t.b(r7)
            r7 = r2
            goto L46
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            tb.t.b(r7)
            java.util.List<gc.p<za.c, xb.d<? super tb.e0>, java.lang.Object>> r7 = r5.f22064a
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L46:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()
            gc.p r2 = (gc.p) r2
            r0.f22076x = r7
            r0.f22077y = r6
            r0.W3 = r3
            java.lang.Object r2 = r2.u(r7, r0)
            if (r2 != r1) goto L46
            return r1
        L5f:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.i.f(za.c, xb.d):java.lang.Object");
    }
}
