package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.e;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aR\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/q0;", "Lxb/g;", "context", "Lkotlinx/coroutines/s0;", "start", "Lkotlin/Function2;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "block", "Lkotlinx/coroutines/a2;", "c", "(Lkotlinx/coroutines/q0;Lxb/g;Lkotlinx/coroutines/s0;Lgc/p;)Lkotlinx/coroutines/a2;", "T", "Lkotlinx/coroutines/x0;", "a", "(Lkotlinx/coroutines/q0;Lxb/g;Lkotlinx/coroutines/s0;Lgc/p;)Lkotlinx/coroutines/x0;", "e", "(Lxb/g;Lgc/p;Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class l {
    public static final <T> x0<T> a(q0 q0Var, xb.g gVar, s0 s0Var, gc.p<? super q0, ? super xb.d<? super T>, ? extends Object> pVar) {
        xb.g d10 = k0.d(q0Var, gVar);
        y0 k2Var = s0Var.h() ? new k2(d10, pVar) : new y0(d10, true);
        ((a) k2Var).k1(s0Var, k2Var, pVar);
        return k2Var;
    }

    public static /* synthetic */ x0 b(q0 q0Var, xb.g gVar, s0 s0Var, gc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        if ((i10 & 2) != 0) {
            s0Var = s0.DEFAULT;
        }
        return j.a(q0Var, gVar, s0Var, pVar);
    }

    public static final a2 c(q0 q0Var, xb.g gVar, s0 s0Var, gc.p<? super q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        xb.g d10 = k0.d(q0Var, gVar);
        a l2Var = s0Var.h() ? new l2(d10, pVar) : new v2(d10, true);
        l2Var.k1(s0Var, l2Var, pVar);
        return l2Var;
    }

    public static /* synthetic */ a2 d(q0 q0Var, xb.g gVar, s0 s0Var, gc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        if ((i10 & 2) != 0) {
            s0Var = s0.DEFAULT;
        }
        return j.c(q0Var, gVar, s0Var, pVar);
    }

    public static final <T> Object e(xb.g gVar, gc.p<? super q0, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super T> dVar) {
        Object obj;
        Object c10;
        xb.g b10 = dVar.b();
        xb.g e10 = k0.e(b10, gVar);
        e2.h(e10);
        if (e10 == b10) {
            kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(e10, dVar);
            obj = ff.b.b(zVar, zVar, pVar);
        } else {
            e.b bVar = xb.e.X0;
            if (hc.t.a(e10.i(bVar), b10.i(bVar))) {
                d3 d3Var = new d3(e10, dVar);
                Object c11 = kotlinx.coroutines.internal.f0.c(e10, null);
                try {
                    Object b11 = ff.b.b(d3Var, d3Var, pVar);
                    kotlinx.coroutines.internal.f0.a(e10, c11);
                    obj = b11;
                } catch (Throwable th2) {
                    kotlinx.coroutines.internal.f0.a(e10, c11);
                    throw th2;
                }
            } else {
                c1 c1Var = new c1(e10, dVar);
                ff.a.d(pVar, c1Var, c1Var, null, 4, null);
                obj = c1Var.m1();
            }
        }
        c10 = yb.d.c();
        if (obj == c10) {
            zb.h.c(dVar);
        }
        return obj;
    }
}
