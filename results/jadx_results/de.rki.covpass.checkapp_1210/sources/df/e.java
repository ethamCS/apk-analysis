package df;

import kotlin.Metadata;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b2(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"E", "Lkotlinx/coroutines/q0;", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Lkotlinx/coroutines/s0;", "start", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Ldf/f;", "Lxb/d;", BuildConfig.FLAVOR, "block", "Ldf/e0;", "a", "(Lkotlinx/coroutines/q0;Lxb/g;ILkotlinx/coroutines/s0;Lgc/l;Lgc/p;)Ldf/e0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final <E> e0<E> a(q0 q0Var, xb.g gVar, int i10, s0 s0Var, gc.l<? super Throwable, tb.e0> lVar, gc.p<? super f<E>, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        xb.g d10 = k0.d(q0Var, gVar);
        i b10 = l.b(i10, null, null, 6, null);
        d uVar = s0Var.h() ? new u(d10, b10, pVar) : new d(d10, b10, true);
        if (lVar != null) {
            ((i2) uVar).D0(lVar);
        }
        ((kotlinx.coroutines.a) uVar).k1(s0Var, uVar, pVar);
        return uVar;
    }

    public static /* synthetic */ e0 b(q0 q0Var, xb.g gVar, int i10, s0 s0Var, gc.l lVar, gc.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        xb.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            s0Var = s0.DEFAULT;
        }
        s0 s0Var2 = s0Var;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return a(q0Var, gVar2, i12, s0Var2, lVar, pVar);
    }
}
