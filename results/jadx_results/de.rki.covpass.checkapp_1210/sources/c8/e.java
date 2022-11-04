package c8;

import gc.p;
import j8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import tb.e0;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lc8/e;", "Lj8/a;", "Ltb/e0;", "j", "Lkotlinx/coroutines/q0;", "scope", "Lf9/c;", "sdkDependencies", "<init>", "(Lkotlinx/coroutines/q0;Lf9/c;)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e extends j8.a {

    /* renamed from: g */
    private final f9.c f6358g;

    /* renamed from: h */
    private final a.C0200a f6359h;

    /* renamed from: i */
    private final a.C0200a f6360i;

    /* renamed from: j */
    private final a.C0200a f6361j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.CovpassCheckBackgroundViewModel$countryListUpdater$1", f = "CovpassCheckBackgroundViewModel.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f6362y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6362y;
            if (i10 == 0) {
                t.b(obj);
                if (h9.f.a(e.this.f6358g.Y0().a().getValue())) {
                    j9.a e02 = e.this.f6358g.e0();
                    this.f6362y = 1;
                    if (e02.c(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.CovpassCheckBackgroundViewModel$domesticRulesUpdater$1", f = "CovpassCheckBackgroundViewModel.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f6363y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6363y;
            if (i10 == 0) {
                t.b(obj);
                if (h9.f.a(e.this.f6358g.Y0().b().getValue())) {
                    j9.b l02 = e.this.f6358g.l0();
                    this.f6363y = 1;
                    if (l02.e(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.CovpassCheckBackgroundViewModel$euRulesUpdater$1", f = "CovpassCheckBackgroundViewModel.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f6364y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6364y;
            if (i10 == 0) {
                t.b(obj);
                if (h9.f.a(e.this.f6358g.Y0().c().getValue())) {
                    j9.c r02 = e.this.f6358g.r0();
                    this.f6364y = 1;
                    if (r02.e(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((c) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new c(dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q0 q0Var, f9.c cVar) {
        super(q0Var, cVar);
        hc.t.e(q0Var, "scope");
        hc.t.e(cVar, "sdkDependencies");
        this.f6358g = cVar;
        this.f6359h = new a.C0200a(this, new c(null));
        this.f6360i = new a.C0200a(this, new b(null));
        this.f6361j = new a.C0200a(this, new a(null));
    }

    public /* synthetic */ e(q0 q0Var, f9.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, (i10 & 2) != 0 ? f9.d.a() : cVar);
    }

    @Override // j8.a
    public void j() {
        super.j();
        this.f6359h.b();
        this.f6360i.b();
        this.f6361j.b();
    }
}
