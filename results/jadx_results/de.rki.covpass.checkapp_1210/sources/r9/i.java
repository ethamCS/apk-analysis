package r9;

import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import gc.p;
import j$.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.j;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lr9/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "keep", BuildConfig.FLAVOR, "Lj9/d;", "add", "Ltb/e0;", "e", "(Ljava/util/Collection;Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "Lr9/b;", "c", "(Lxb/d;)Ljava/lang/Object;", "countryIsoCode", "j$/time/ZonedDateTime", "validationClock", "Ldgca/verifier/app/engine/data/Type;", "type", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "d", "(Ljava/lang/String;Lj$/time/ZonedDateTime;Ldgca/verifier/app/engine/data/Type;Ldgca/verifier/app/engine/data/RuleCertificateType;Lxb/d;)Ljava/lang/Object;", "b", "Lr9/e;", "covPassEuRulesDao", "<init>", "(Lr9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final e f20552a;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.rules.eu.CovPassEuRulesLocalDataSource$deleteAll$2", f = "CovPassEuRulesLocalDataSource.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f20553y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f20553y;
            if (i10 == 0) {
                t.b(obj);
                e eVar = i.this.f20552a;
                this.f20553y = 1;
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "Lr9/b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.rules.eu.CovPassEuRulesLocalDataSource$getAllRules$2", f = "CovPassEuRulesLocalDataSource.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, xb.d<? super List<? extends r9.b>>, Object> {

        /* renamed from: y */
        int f20554y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f20554y;
            if (i10 == 0) {
                t.b(obj);
                e eVar = i.this.f20552a;
                this.f20554y = 1;
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
        public final Object u(q0 q0Var, xb.d<? super List<r9.b>> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "Lj9/d;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.rules.eu.CovPassEuRulesLocalDataSource$getRulesBy$2", f = "CovPassEuRulesLocalDataSource.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<q0, xb.d<? super List<? extends j9.d>>, Object> {
        final /* synthetic */ String V3;
        final /* synthetic */ ZonedDateTime W3;
        final /* synthetic */ Type X3;
        final /* synthetic */ RuleCertificateType Y3;

        /* renamed from: y */
        int f20555y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, ZonedDateTime zonedDateTime, Type type, RuleCertificateType ruleCertificateType, xb.d<? super c> dVar) {
            super(2, dVar);
            i.this = r1;
            this.V3 = str;
            this.W3 = zonedDateTime;
            this.X3 = type;
            this.Y3 = ruleCertificateType;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f20555y == 0) {
                t.b(obj);
                return r9.c.e(i.this.f20552a.d(this.V3, this.W3, this.X3, this.Y3, RuleCertificateType.GENERAL));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super List<j9.d>> dVar) {
            return ((c) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new c(this.V3, this.W3, this.X3, this.Y3, dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.rules.eu.CovPassEuRulesLocalDataSource$replaceRules$2", f = "CovPassEuRulesLocalDataSource.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Collection<String> V3;
        final /* synthetic */ List<j9.d> W3;

        /* renamed from: y */
        int f20556y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection<String> collection, List<j9.d> list, xb.d<? super d> dVar) {
            super(2, dVar);
            i.this = r1;
            this.V3 = collection;
            this.W3 = list;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f20556y;
            if (i10 == 0) {
                t.b(obj);
                e eVar = i.this.f20552a;
                Collection<String> collection = this.V3;
                List<r9.d> f10 = r9.c.f(this.W3);
                this.f20556y = 1;
                if (eVar.i(collection, f10, this) == c10) {
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
            return ((d) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new d(this.V3, this.W3, dVar);
        }
    }

    public i(e eVar) {
        hc.t.e(eVar, "covPassEuRulesDao");
        this.f20552a = eVar;
    }

    public final Object b(xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new a(null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }

    public final Object c(xb.d<? super List<r9.b>> dVar) {
        return j.g(s4.l.a().a(), new b(null), dVar);
    }

    public final Object d(String str, ZonedDateTime zonedDateTime, Type type, RuleCertificateType ruleCertificateType, xb.d<? super List<j9.d>> dVar) {
        return j.g(s4.l.a().a(), new c(str, zonedDateTime, type, ruleCertificateType, null), dVar);
    }

    public final Object e(Collection<String> collection, List<j9.d> list, xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new d(collection, list, null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }
}
