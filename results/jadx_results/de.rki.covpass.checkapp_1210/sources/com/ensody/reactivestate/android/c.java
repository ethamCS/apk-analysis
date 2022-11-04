package com.ensody.reactivestate.android;

import gc.p;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.q0;
import s4.w;
import s4.x;
import tb.e0;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls4/v;", "T", "Ls4/x;", "handler", "Landroidx/lifecycle/v;", "owner", "Ltb/e0;", "a", "(Ls4/x;Ls4/v;Landroidx/lifecycle/v;)V", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls4/v;", "T", "Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ androidx.lifecycle.v f6761c;

        /* renamed from: d */
        final /* synthetic */ x<T> f6762d;

        /* renamed from: q */
        final /* synthetic */ s4.v f6763q;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls4/v;", "T", "Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.ensody.reactivestate.android.c$a$a */
        /* loaded from: classes.dex */
        public static final class C0099a extends v implements gc.a<e0> {

            /* renamed from: c */
            final /* synthetic */ a2 f6764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0099a(a2 a2Var) {
                super(0);
                this.f6764c = a2Var;
            }

            public final void b() {
                a2.a.a(this.f6764c, null, 1, null);
            }

            @Override // gc.a
            public /* bridge */ /* synthetic */ e0 invoke() {
                b();
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ls4/v;", "T", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "com.ensody.reactivestate.android.EventNotifierKt$handleEvents$1$job$1", f = "EventNotifier.kt", l = {39}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends zb.l implements p<q0, xb.d<? super e0>, Object> {
            final /* synthetic */ x<T> U3;
            final /* synthetic */ s4.v V3;

            /* renamed from: y */
            int f6765y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x xVar, s4.v vVar, xb.d dVar) {
                super(2, dVar);
                this.U3 = xVar;
                this.V3 = vVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f6765y;
                if (i10 == 0) {
                    t.b(obj);
                    x<T> xVar = this.U3;
                    s4.v vVar = this.V3;
                    this.f6765y = 1;
                    if (w.a(xVar, vVar, this) == c10) {
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
                return ((b) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new b(this.U3, this.V3, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.lifecycle.v vVar, x xVar, s4.v vVar2) {
            super(0);
            this.f6761c = vVar;
            this.f6762d = xVar;
            this.f6763q = vVar2;
        }

        public final void b() {
            a2 d10;
            d10 = kotlinx.coroutines.l.d(androidx.lifecycle.w.a(this.f6761c), null, null, new b(this.f6762d, this.f6763q, null), 3, null);
            e.l(this.f6761c, new C0099a(d10));
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    public static final <T extends s4.v> void a(x<T> xVar, T t10, androidx.lifecycle.v vVar) {
        hc.t.e(xVar, "<this>");
        hc.t.e(t10, "handler");
        hc.t.e(vVar, "owner");
        e.j(vVar, new a(vVar, xVar, t10));
    }
}
