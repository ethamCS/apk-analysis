package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Lxb/g;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lxb/d;", BuildConfig.FLAVOR, "block", "a", "(Lxb/g;Lgc/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class k {
    public static final <T> T a(xb.g gVar, gc.p<? super q0, ? super xb.d<? super T>, ? extends Object> pVar) {
        k1 k1Var;
        t1 t1Var;
        Thread currentThread = Thread.currentThread();
        xb.e eVar = (xb.e) gVar.i(xb.e.X0);
        if (eVar == null) {
            k1Var = b3.f15314a.b();
            t1Var = t1.f15571c;
            gVar = gVar.B(k1Var);
        } else {
            k1 k1Var2 = null;
            k1 k1Var3 = eVar instanceof k1 ? (k1) eVar : null;
            if (k1Var3 != null) {
                if (k1Var3.s1()) {
                    k1Var2 = k1Var3;
                }
                if (k1Var2 != null) {
                    k1Var = k1Var2;
                    t1Var = t1.f15571c;
                }
            }
            k1Var = b3.f15314a.a();
            t1Var = t1.f15571c;
        }
        h hVar = new h(k0.d(t1Var, gVar), currentThread, k1Var);
        hVar.k1(s0.DEFAULT, hVar, pVar);
        return (T) hVar.l1();
    }

    public static /* synthetic */ Object b(xb.g gVar, gc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        return j.e(gVar, pVar);
    }
}
