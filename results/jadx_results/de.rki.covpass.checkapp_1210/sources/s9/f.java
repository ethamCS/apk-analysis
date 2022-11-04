package s9;

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
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Ls9/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "keep", BuildConfig.FLAVOR, "Lj9/f;", "add", "Ltb/e0;", "d", "(Ljava/util/Collection;Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "Ls9/a;", "c", "(Lxb/d;)Ljava/lang/Object;", "b", "Ls9/c;", "covPassValueSetsDao", "<init>", "(Ls9/c;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final s9.c f21560a;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.valuesets.CovPassValueSetsLocalDataSource$deleteAll$2", f = "CovPassValueSetsLocalDataSource.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f21561y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21561y;
            if (i10 == 0) {
                t.b(obj);
                s9.c cVar = f.this.f21560a;
                this.f21561y = 1;
                if (s9.c.b(cVar, null, this, 1, null) == c10) {
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "Ls9/a;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.valuesets.CovPassValueSetsLocalDataSource$getAll$2", f = "CovPassValueSetsLocalDataSource.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, xb.d<? super List<? extends s9.a>>, Object> {

        /* renamed from: y */
        int f21562y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21562y;
            if (i10 == 0) {
                t.b(obj);
                s9.c cVar = f.this.f21560a;
                this.f21562y = 1;
                obj = cVar.c(this);
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
        public final Object u(q0 q0Var, xb.d<? super List<s9.a>> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.local.valuesets.CovPassValueSetsLocalDataSource$update$2", f = "CovPassValueSetsLocalDataSource.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Collection<String> V3;
        final /* synthetic */ List<j9.f> W3;

        /* renamed from: y */
        int f21563y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Collection<String> collection, List<j9.f> list, xb.d<? super c> dVar) {
            super(2, dVar);
            f.this = r1;
            this.V3 = collection;
            this.W3 = list;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21563y;
            if (i10 == 0) {
                t.b(obj);
                s9.c cVar = f.this.f21560a;
                Collection<String> collection = this.V3;
                List<s9.a> b10 = s9.b.b(this.W3);
                this.f21563y = 1;
                if (cVar.e(collection, b10, this) == c10) {
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

    public f(s9.c cVar) {
        hc.t.e(cVar, "covPassValueSetsDao");
        this.f21560a = cVar;
    }

    public final Object b(xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new a(null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }

    public final Object c(xb.d<? super List<s9.a>> dVar) {
        return j.g(s4.l.a().a(), new b(null), dVar);
    }

    public final Object d(Collection<String> collection, List<j9.f> list, xb.d<? super e0> dVar) {
        Object c10;
        Object g10 = j.g(s4.l.a().a(), new c(collection, list, null), dVar);
        c10 = yb.d.c();
        return g10 == c10 ? g10 : e0.f22152a;
    }
}
