package d8;

import c8.n;
import gc.p;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import m7.v;
import s4.v0;
import tb.e0;
import tb.m;
import tb.t;
import ub.u;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u001b\u0010\t\u001a\u00020\u00048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Ld8/c;", "Lr8/h;", "Ltb/e0;", "w2", "Ly8/d;", "fragmentStateAdapter$delegate", "Lkotlin/Lazy;", "y2", "()Ly8/d;", "fragmentStateAdapter", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c extends r8.h {
    private final Lazy W4;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.onboarding.OnboardingContainerFragment$finishOnboarding$1", f = "OnboardingContainerFragment.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f8391y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            c.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f8391y;
            if (i10 == 0) {
                t.b(obj);
                v0<Integer> a10 = l8.b.b(c.this).f().a();
                Integer c11 = zb.b.c(18);
                this.f8391y = 1;
                if (v0.a.a(a10, c11, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            v.s(m7.g.b(c.this, 0, 1, null), false, 1, null);
            m7.g.b(c.this, 0, 1, null).v(new n(), true);
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly8/d;", "b", "()Ly8/d;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.a<y8.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            c.this = r1;
        }

        /* renamed from: b */
        public final y8.d invoke() {
            List k10;
            c cVar = c.this;
            k10 = u.k(new e(), new f(), new d8.b());
            return new y8.d(cVar, k10);
        }
    }

    public c() {
        Lazy a10;
        a10 = m.a(new b());
        this.W4 = a10;
    }

    @Override // r8.h
    protected void w2() {
        o2(new a(null));
    }

    @Override // r8.h
    protected y8.d y2() {
        return (y8.d) this.W4.getValue();
    }
}
