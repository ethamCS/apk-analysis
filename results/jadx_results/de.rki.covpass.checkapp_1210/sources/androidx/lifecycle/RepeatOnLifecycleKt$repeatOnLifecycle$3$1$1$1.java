package androidx.lifecycle;

import androidx.lifecycle.m;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/v;", "<anonymous parameter 0>", "Landroidx/lifecycle/m$b;", "event", "Ltb/e0;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$b;)V"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements s {
    final /* synthetic */ kotlinx.coroutines.sync.b U3;
    final /* synthetic */ gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> V3;

    /* renamed from: c */
    final /* synthetic */ m.b f4278c;

    /* renamed from: d */
    final /* synthetic */ hc.j0<a2> f4279d;

    /* renamed from: q */
    final /* synthetic */ kotlinx.coroutines.q0 f4280q;

    /* renamed from: x */
    final /* synthetic */ m.b f4281x;

    /* renamed from: y */
    final /* synthetic */ kotlinx.coroutines.p<tb.e0> f4282y;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, androidx.constraintlayout.widget.i.E2}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> {
        Object U3;
        int V3;
        final /* synthetic */ kotlinx.coroutines.sync.b W3;
        final /* synthetic */ gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> X3;

        /* renamed from: y */
        Object f4283y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
        /* loaded from: classes.dex */
        public static final class C0050a extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> V3;

            /* renamed from: y */
            int f4284y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0050a(gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar, xb.d<? super C0050a> dVar) {
                super(2, dVar);
                this.V3 = pVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f4284y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> pVar = this.V3;
                    this.f4284y = 1;
                    if (pVar.u((kotlinx.coroutines.q0) this.U3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    tb.t.b(obj);
                }
                return tb.e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super tb.e0> dVar) {
                return ((C0050a) j(q0Var, dVar)).B(tb.e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
                C0050a c0050a = new C0050a(this.V3, dVar);
                c0050a.U3 = obj;
                return c0050a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.sync.b bVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar, xb.d<? super a> dVar) {
            super(2, dVar);
            this.W3 = bVar;
            this.X3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            kotlinx.coroutines.sync.b bVar;
            gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> pVar;
            kotlinx.coroutines.sync.b bVar2;
            Throwable th2;
            c10 = yb.d.c();
            int i10 = this.V3;
            try {
                if (i10 == 0) {
                    tb.t.b(obj);
                    bVar = this.W3;
                    pVar = this.X3;
                    this.f4283y = bVar;
                    this.U3 = pVar;
                    this.V3 = 1;
                    if (bVar.c(null, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (kotlinx.coroutines.sync.b) this.f4283y;
                    try {
                        tb.t.b(obj);
                        tb.e0 e0Var = tb.e0.f22152a;
                        bVar2.a(null);
                        return e0Var;
                    } catch (Throwable th3) {
                        th2 = th3;
                        bVar2.a(null);
                        throw th2;
                    }
                } else {
                    pVar = (gc.p) this.U3;
                    tb.t.b(obj);
                    bVar = (kotlinx.coroutines.sync.b) this.f4283y;
                }
                C0050a c0050a = new C0050a(pVar, null);
                this.f4283y = bVar;
                this.U3 = null;
                this.V3 = 2;
                if (kotlinx.coroutines.r0.f(c0050a, this) == c10) {
                    return c10;
                }
                bVar2 = bVar;
                tb.e0 e0Var2 = tb.e0.f22152a;
                bVar2.a(null);
                return e0Var2;
            } catch (Throwable th4) {
                bVar2 = bVar;
                th2 = th4;
                bVar2.a(null);
                throw th2;
            }
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.W3, this.X3, dVar);
        }
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.a2] */
    @Override // androidx.lifecycle.s
    public final void f(v vVar, m.b bVar) {
        ?? d10;
        hc.t.e(vVar, "<anonymous parameter 0>");
        hc.t.e(bVar, "event");
        if (bVar == this.f4278c) {
            hc.j0<a2> j0Var = this.f4279d;
            d10 = kotlinx.coroutines.l.d(this.f4280q, null, null, new a(this.U3, this.V3, null), 3, null);
            j0Var.f11764c = d10;
            return;
        }
        if (bVar == this.f4281x) {
            a2 a2Var = this.f4279d.f11764c;
            if (a2Var != null) {
                a2.a.a(a2Var, null, 1, null);
            }
            this.f4279d.f11764c = null;
        }
        if (bVar != m.b.ON_DESTROY) {
            return;
        }
        kotlinx.coroutines.p<tb.e0> pVar = this.f4282y;
        s.a aVar = tb.s.Companion;
        pVar.y(tb.s.c(tb.e0.f22152a));
    }
}
