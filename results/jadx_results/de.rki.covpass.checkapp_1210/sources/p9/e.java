package p9;

import gc.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.j;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import ub.v;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lp9/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "countries", "Ltb/e0;", "d", "(Ljava/util/Collection;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "c", "(Lxb/d;)Ljava/lang/Object;", "b", "Lp9/a;", "covPasCountriesDao", "<init>", "(Lp9/a;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final p9.a f19017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.rules.local.countries.CovPassCountriesLocalDataSource$deleteAll$2", f = "CovPassCountriesLocalDataSource.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f19018y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f19018y;
            if (i10 == 0) {
                t.b(obj);
                p9.a aVar = e.this.f19017a;
                this.f19018y = 1;
                if (aVar.a(this) == c10) {
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
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.rules.local.countries.CovPassCountriesLocalDataSource$getAllCountries$2", f = "CovPassCountriesLocalDataSource.kt", l = {23}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, xb.d<? super List<? extends String>>, Object> {

        /* renamed from: y */
        int f19019y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            int s10;
            c10 = yb.d.c();
            int i10 = this.f19019y;
            if (i10 == 0) {
                t.b(obj);
                p9.a aVar = e.this.f19017a;
                this.f19019y = 1;
                obj = aVar.b(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            Iterable<d> iterable = (Iterable) obj;
            s10 = v.s(iterable, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (d dVar : iterable) {
                arrayList.add(dVar.a());
            }
            return arrayList;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super List<String>> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.rules.local.countries.CovPassCountriesLocalDataSource$insertAll$2", f = "CovPassCountriesLocalDataSource.kt", l = {17}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Collection<String> V3;

        /* renamed from: y */
        int f19020y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Collection<String> collection, xb.d<? super c> dVar) {
            super(2, dVar);
            e.this = r1;
            this.V3 = collection;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f19020y;
            if (i10 == 0) {
                t.b(obj);
                p9.a aVar = e.this.f19017a;
                Collection<String> collection = this.V3;
                this.f19020y = 1;
                if (aVar.d(collection, this) == c10) {
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
            return new c(this.V3, dVar);
        }
    }

    public e(p9.a aVar) {
        hc.t.e(aVar, "covPasCountriesDao");
        this.f19017a = aVar;
    }

    public final Object b(xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new a(null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }

    public final Object c(xb.d<? super List<String>> dVar) {
        return j.g(s4.l.a().a(), new b(null), dVar);
    }

    public final Object d(Collection<String> collection, xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new c(collection, null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }
}
