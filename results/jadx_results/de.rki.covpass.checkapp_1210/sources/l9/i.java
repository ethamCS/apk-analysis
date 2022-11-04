package l9;

import gc.p;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.j;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Ll9/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "keep", BuildConfig.FLAVOR, "Lk9/a;", "boosterRules", "Ltb/e0;", "d", "(Ljava/util/Collection;Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "Ll9/b;", "c", "(Lxb/d;)Ljava/lang/Object;", "b", "Ll9/e;", "boosterRulesDao", "<init>", "(Ll9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final e f15911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.booster.local.CovPassBoosterRulesLocalDataSource$deleteAll$2", f = "CovPassBoosterRulesLocalDataSource.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f15912y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f15912y;
            if (i10 == 0) {
                t.b(obj);
                e eVar = i.this.f15911a;
                this.f15912y = 1;
                if (e.b(eVar, null, this, 1, null) == c10) {
                    return c10;
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
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "Ll9/b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.booster.local.CovPassBoosterRulesLocalDataSource$getAllBoosterRules$2", f = "CovPassBoosterRulesLocalDataSource.kt", l = {25}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, xb.d<? super List<? extends l9.b>>, Object> {

        /* renamed from: y */
        int f15913y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f15913y;
            if (i10 == 0) {
                t.b(obj);
                e eVar = i.this.f15911a;
                this.f15913y = 1;
                obj = eVar.c(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return obj;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super List<l9.b>> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.booster.local.CovPassBoosterRulesLocalDataSource$replaceRules$2", f = "CovPassBoosterRulesLocalDataSource.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Collection<String> V3;
        final /* synthetic */ List<k9.a> W3;

        /* renamed from: y */
        int f15914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Collection<String> collection, List<k9.a> list, xb.d<? super c> dVar) {
            super(2, dVar);
            i.this = r1;
            this.V3 = collection;
            this.W3 = list;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f15914y;
            if (i10 == 0) {
                t.b(obj);
                e eVar = i.this.f15911a;
                Collection<String> collection = this.V3;
                List<d> d10 = l9.c.d(this.W3);
                this.f15914y = 1;
                if (eVar.h(collection, d10, this) == c10) {
                    return c10;
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
            return new c(this.V3, this.W3, dVar);
        }
    }

    public i(e eVar) {
        hc.t.e(eVar, "boosterRulesDao");
        this.f15911a = eVar;
    }

    public final Object b(xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new a(null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }

    public final Object c(xb.d<? super List<l9.b>> dVar) {
        return j.g(s4.l.a().a(), new b(null), dVar);
    }

    public final Object d(Collection<String> collection, List<k9.a> list, xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new c(collection, list, null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }
}
