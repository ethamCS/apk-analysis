package io.ktor.utils.io;

import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\\\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0012*\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/q0;", "Lxb/g;", "coroutineContext", "Lio/ktor/utils/io/c;", "channel", "Lkotlin/Function2;", "Lio/ktor/utils/io/u;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "block", "Lio/ktor/utils/io/t;", "b", "(Lkotlinx/coroutines/q0;Lxb/g;Lio/ktor/utils/io/c;Lgc/p;)Lio/ktor/utils/io/t;", BuildConfig.FLAVOR, "autoFlush", "c", "(Lkotlinx/coroutines/q0;Lxb/g;ZLgc/p;)Lio/ktor/utils/io/t;", "S", "context", "attachJob", "Lio/ktor/utils/io/m;", "a", "(Lkotlinx/coroutines/q0;Lxb/g;Lio/ktor/utils/io/c;ZLgc/p;)Lio/ktor/utils/io/m;", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class p {

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/q0;", "S", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<Throwable, e0> {

        /* renamed from: c */
        final /* synthetic */ c f12950c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f12950c = cVar;
        }

        public final void b(Throwable th2) {
            this.f12950c.a(th2);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "S", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ boolean V3;
        final /* synthetic */ c W3;
        final /* synthetic */ gc.p<S, xb.d<? super e0>, Object> X3;
        final /* synthetic */ l0 Y3;

        /* renamed from: y */
        int f12951y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, c cVar, gc.p<? super S, ? super xb.d<? super e0>, ? extends Object> pVar, l0 l0Var, xb.d<? super b> dVar) {
            super(2, dVar);
            this.V3 = z10;
            this.W3 = cVar;
            this.X3 = pVar;
            this.Y3 = l0Var;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f12951y;
            try {
                if (i10 == 0) {
                    tb.t.b(obj);
                    q0 q0Var = (q0) this.U3;
                    if (this.V3) {
                        c cVar = this.W3;
                        g.b i11 = q0Var.h().i(a2.W0);
                        hc.t.b(i11);
                        cVar.d((a2) i11);
                    }
                    n nVar = new n(q0Var, this.W3);
                    gc.p<S, xb.d<? super e0>, Object> pVar = this.X3;
                    this.f12951y = 1;
                    if (pVar.u(nVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    tb.t.b(obj);
                }
            } catch (Throwable th2) {
                if (!hc.t.a(this.Y3, g1.d()) && this.Y3 != null) {
                    throw th2;
                }
                this.W3.g(th2);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, this.W3, this.X3, this.Y3, dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    private static final <S extends q0> m a(q0 q0Var, xb.g gVar, c cVar, boolean z10, gc.p<? super S, ? super xb.d<? super e0>, ? extends Object> pVar) {
        a2 d10;
        d10 = kotlinx.coroutines.l.d(q0Var, gVar, null, new b(z10, cVar, pVar, (l0) q0Var.h().i(l0.f15483d), null), 2, null);
        d10.D0(new a(cVar));
        return new m(d10, cVar);
    }

    public static final t b(q0 q0Var, xb.g gVar, c cVar, gc.p<? super u, ? super xb.d<? super e0>, ? extends Object> pVar) {
        hc.t.e(q0Var, "<this>");
        hc.t.e(gVar, "coroutineContext");
        hc.t.e(cVar, "channel");
        hc.t.e(pVar, "block");
        return a(q0Var, gVar, cVar, false, pVar);
    }

    public static final t c(q0 q0Var, xb.g gVar, boolean z10, gc.p<? super u, ? super xb.d<? super e0>, ? extends Object> pVar) {
        hc.t.e(q0Var, "<this>");
        hc.t.e(gVar, "coroutineContext");
        hc.t.e(pVar, "block");
        return a(q0Var, gVar, e.a(z10), true, pVar);
    }

    public static /* synthetic */ t d(q0 q0Var, xb.g gVar, c cVar, gc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        return b(q0Var, gVar, cVar, pVar);
    }

    public static /* synthetic */ t e(q0 q0Var, xb.g gVar, boolean z10, gc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c(q0Var, gVar, z10, pVar);
    }
}
