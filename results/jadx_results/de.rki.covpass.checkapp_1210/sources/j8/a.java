package j8;

import de.rki.covpass.logging.Lumber;
import hc.t;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.m;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¨\u0006\u000f"}, d2 = {"Lj8/a;", "Ls4/i;", BuildConfig.FLAVOR, "Ltb/e0;", "j", BuildConfig.FLAVOR, "throwable", "i", "Lkotlinx/coroutines/q0;", "scope", "Lf9/c;", "sdkDependencies", "<init>", "(Lkotlinx/coroutines/q0;Lf9/c;)V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class a extends s4.i<Object> {

    /* renamed from: d */
    private final f9.c f14049d;

    /* renamed from: e */
    private final C0200a f14050e = new C0200a(this, new b(null));

    /* renamed from: f */
    private final C0200a f14051f = new C0200a(this, new c(null));

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B.\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lj8/a$a;", BuildConfig.FLAVOR, "Ltb/e0;", "b", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lxb/d;", "block", "<init>", "(Lj8/a;Lgc/p;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: j8.a$a */
    /* loaded from: classes.dex */
    public final class C0200a {

        /* renamed from: a */
        private gc.p<? super q0, ? super xb.d<? super e0>, ? extends Object> f14052a;

        /* renamed from: b */
        private a2 f14053b;

        /* renamed from: c */
        final /* synthetic */ a f14054c;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: j8.a$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0201a extends hc.a implements gc.p<Throwable, xb.d<? super e0>, Object> {
            C0201a(Object obj) {
                super(2, obj, a.class, "logOnError", "logOnError(Ljava/lang/Throwable;)V", 4);
            }

            /* renamed from: c */
            public final Object u(Throwable th2, xb.d<? super e0> dVar) {
                return C0200a.c((a) this.f11741c, th2, dVar);
            }
        }

        public C0200a(a aVar, gc.p<? super q0, ? super xb.d<? super e0>, ? extends Object> pVar) {
            t.e(pVar, "block");
            this.f14054c = aVar;
            this.f14052a = pVar;
        }

        public static final /* synthetic */ Object c(a aVar, Throwable th2, xb.d dVar) {
            aVar.i(th2);
            return e0.f22152a;
        }

        public final void b() {
            a2 a2Var = this.f14053b;
            boolean z10 = true;
            if (a2Var == null || !a2Var.j()) {
                z10 = false;
            }
            if (!z10) {
                this.f14053b = m.a.b(this.f14054c, null, null, null, new C0201a(this.f14054c), this.f14052a, 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.BackgroundUpdateViewModel$backgroundDscListUpdater$1", f = "BackgroundUpdateViewModel.kt", l = {26}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f14055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f14055y;
            if (i10 == 0) {
                tb.t.b(obj);
                if (h9.f.a(a.this.f14049d.G0().c().getValue())) {
                    z9.i F0 = a.this.f14049d.F0();
                    this.f14055y = 1;
                    if (F0.a(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
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
    @zb.f(c = "de.rki.covpass.commonapp.BackgroundUpdateViewModel$valueSetsUpdater$1", f = "BackgroundUpdateViewModel.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f14056y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f14056y;
            if (i10 == 0) {
                tb.t.b(obj);
                if (h9.f.a(a.this.f14049d.Y0().d().getValue())) {
                    j9.g x02 = a.this.f14049d.x0();
                    this.f14056y = 1;
                    if (x02.d(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
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
    public a(q0 q0Var, f9.c cVar) {
        super(q0Var);
        t.e(q0Var, "scope");
        t.e(cVar, "sdkDependencies");
        this.f14049d = cVar;
    }

    protected final void i(Throwable th2) {
        t.e(th2, "throwable");
        if (Lumber.Companion.getEnabled()) {
            timber.log.a.f22457a.e(th2, null, new Object[0]);
        }
    }

    public void j() {
        this.f14050e.b();
        this.f14051f.b();
    }
}
