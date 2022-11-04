package s4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\u001c\u0010!\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00000\u001ej\b\u0012\u0004\u0012\u00028\u0000` ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Ls4/p;", "T", "Ls4/h;", "Ltb/e0;", "w", "Lkotlinx/coroutines/flow/e;", "collector", BuildConfig.FLAVOR, "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "x", BuildConfig.FLAVOR, "v", "()Z", "hasScope", "Ls4/e;", "autoRunner", "Ls4/e;", "t", "()Ls4/e;", "Lkotlinx/coroutines/flow/d;", "flow", "Lkotlinx/coroutines/flow/d;", "u", "()Lkotlinx/coroutines/flow/d;", "getValue", "()Ljava/lang/Object;", "value", "Ls4/m;", "launcher", "Lkotlin/Function1;", "Ls4/r0;", "Lcom/ensody/reactivestate/AutoRunCallback;", "observer", "<init>", "(Ls4/m;Lgc/l;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class p<T> extends h<T> {
    private final s4.e<T> U3;
    private final kotlinx.coroutines.flow.d<T> V3;
    private List<? extends Object> W3;
    private d1<T> X3;

    /* renamed from: y */
    private final gc.l<r0, T> f21427y;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ls4/e;", "it", "Ltb/e0;", "b", "(Ls4/e;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<s4.e<T>, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ p<T> f21428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar) {
            super(1);
            this.f21428c = pVar;
        }

        public final void b(s4.e<T> eVar) {
            hc.t.e(eVar, "it");
            if (this.f21428c.m() > 0) {
                eVar.p();
            }
            this.f21428c.l().e(tb.e0.f22152a);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Object obj) {
            b((s4.e) obj);
            return tb.e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ls4/r0;", "b", "(Ls4/r0;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<r0, T> {

        /* renamed from: c */
        final /* synthetic */ p<T> f21429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p<T> pVar) {
            super(1);
            this.f21429c = pVar;
        }

        /* renamed from: b */
        public final T invoke(r0 r0Var) {
            hc.t.e(r0Var, "$this$$receiver");
            T t10 = (T) ((p) this.f21429c).f21427y.invoke(r0Var);
            ((p) this.f21429c).X3 = new d1(t10);
            return t10;
        }
    }

    @zb.f(c = "com.ensody.reactivestate.DerivedStateFlow", f = "Derived.kt", l = {311, 95, 321, 321}, m = "collect")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        Object U3;
        /* synthetic */ Object V3;
        final /* synthetic */ p<T> W3;
        int X3;

        /* renamed from: x */
        Object f21430x;

        /* renamed from: y */
        Object f21431y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p<T> pVar, xb.d<? super c> dVar) {
            super(dVar);
            this.W3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return this.W3.a(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d implements kotlinx.coroutines.flow.d<T> {

        /* renamed from: c */
        final /* synthetic */ kotlinx.coroutines.flow.d f21432c;

        /* renamed from: d */
        final /* synthetic */ p f21433d;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: c */
            final /* synthetic */ kotlinx.coroutines.flow.e f21434c;

            /* renamed from: d */
            final /* synthetic */ p f21435d;

            @zb.f(c = "com.ensody.reactivestate.DerivedStateFlow$special$$inlined$map$1$2", f = "Derived.kt", l = {224}, m = "emit")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: s4.p$d$a$a */
            /* loaded from: classes.dex */
            public static final class C0356a extends zb.d {

                /* renamed from: x */
                /* synthetic */ Object f21436x;

                /* renamed from: y */
                int f21437y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0356a(xb.d dVar) {
                    super(dVar);
                    a.this = r1;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    this.f21436x = obj;
                    this.f21437y |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.e eVar, p pVar) {
                this.f21434c = eVar;
                this.f21435d = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object c(java.lang.Object r5, xb.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof s4.p.d.a.C0356a
                    if (r0 == 0) goto L13
                    r0 = r6
                    s4.p$d$a$a r0 = (s4.p.d.a.C0356a) r0
                    int r1 = r0.f21437y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f21437y = r1
                    goto L18
                L13:
                    s4.p$d$a$a r0 = new s4.p$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f21436x
                    java.lang.Object r1 = yb.b.c()
                    int r2 = r0.f21437y
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tb.t.b(r6)
                    goto L53
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tb.t.b(r6)
                    kotlinx.coroutines.flow.e r6 = r4.f21434c
                    tb.e0 r5 = (tb.e0) r5
                    s4.p r5 = r4.f21435d
                    s4.d1 r5 = s4.p.p(r5)
                    if (r5 != 0) goto L46
                    java.lang.String r5 = "cachedValue"
                    hc.t.s(r5)
                    r5 = 0
                L46:
                    java.lang.Object r5 = r5.a()
                    r0.f21437y = r3
                    java.lang.Object r5 = r6.c(r5, r0)
                    if (r5 != r1) goto L53
                    return r1
                L53:
                    tb.e0 r5 = tb.e0.f22152a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: s4.p.d.a.c(java.lang.Object, xb.d):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.d dVar, p pVar) {
            this.f21432c = dVar;
            this.f21433d = pVar;
        }

        @Override // kotlinx.coroutines.flow.d
        public Object a(kotlinx.coroutines.flow.e eVar, xb.d dVar) {
            Object c10;
            Object a10 = this.f21432c.a(new a(eVar, this.f21433d), dVar);
            c10 = yb.d.c();
            return a10 == c10 ? a10 : tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class e extends hc.v implements gc.a<tb.e0> {

        /* renamed from: c */
        final /* synthetic */ p<T> f21438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p<T> pVar) {
            super(0);
            this.f21438c = pVar;
        }

        public final void b() {
            if (this.f21438c.m() == 0) {
                r0 r0Var = new r0(this.f21438c.i());
                p<T> pVar = this.f21438c;
                ((p) pVar).X3 = new d1(((p) pVar).f21427y.invoke(r0Var));
                p<T> pVar2 = this.f21438c;
                ((p) pVar2).W3 = pVar2.n(r0Var);
                this.f21438c.i().m(r0Var);
            }
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ tb.e0 invoke() {
            b();
            return tb.e0.f22152a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(m mVar, gc.l<? super r0, ? extends T> lVar) {
        super(mVar);
        hc.t.e(mVar, "launcher");
        hc.t.e(lVar, "observer");
        this.f21427y = lVar;
        this.U3 = new s4.e<>(mVar, new a(this), null, new b(this), 4, null);
        this.V3 = kotlinx.coroutines.flow.f.f(new d(l(), this));
        if (v()) {
            w();
        }
    }

    public /* synthetic */ p(m mVar, gc.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? o.d() : mVar, lVar);
    }

    private final boolean v() {
        s0 d10;
        m j10 = j();
        d10 = o.d();
        return j10 != d10;
    }

    private final void w() {
        o(m() + 1);
        if (m() == 1) {
            i().p();
            this.W3 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.e<? super T> r9, xb.d<?> r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.p.a(kotlinx.coroutines.flow.e, xb.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.w
    public T getValue() {
        if (m() == 0 && !hc.t.a(n(i().c()), this.W3)) {
            y0.b(k(), new e(this));
        }
        d1<T> d1Var = this.X3;
        if (d1Var == null) {
            hc.t.s("cachedValue");
            d1Var = null;
        }
        return d1Var.a();
    }

    /* renamed from: t */
    public s4.e<T> i() {
        return this.U3;
    }

    protected kotlinx.coroutines.flow.d<T> u() {
        return this.V3;
    }

    protected final void x() {
        o(m() - 1);
        if (m() == 0) {
            this.W3 = n(i().c());
            i().g();
        }
    }
}
