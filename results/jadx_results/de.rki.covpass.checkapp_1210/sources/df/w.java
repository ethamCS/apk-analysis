package df;

import kotlin.Metadata;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0096\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0004\u0018\u0001`\r2*\b\u0001\u0010\u0013\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"E", "Lkotlinx/coroutines/q0;", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlinx/coroutines/s0;", "start", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Ldf/y;", "Lxb/d;", BuildConfig.FLAVOR, "block", "Ldf/a0;", "a", "(Lkotlinx/coroutines/q0;Lxb/g;ILdf/h;Lkotlinx/coroutines/s0;Lgc/l;Lgc/p;)Ldf/a0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w {
    public static final <E> a0<E> a(q0 q0Var, xb.g gVar, int i10, h hVar, s0 s0Var, gc.l<? super Throwable, tb.e0> lVar, gc.p<? super y<? super E>, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        x xVar = new x(k0.d(q0Var, gVar), l.b(i10, hVar, null, 4, null));
        if (lVar != null) {
            xVar.D0(lVar);
        }
        xVar.k1(s0Var, xVar, pVar);
        return xVar;
    }

    public static /* synthetic */ a0 b(q0 q0Var, xb.g gVar, int i10, h hVar, s0 s0Var, gc.l lVar, gc.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = xb.h.f25516c;
        }
        xb.g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            hVar = h.SUSPEND;
        }
        h hVar2 = hVar;
        if ((i11 & 8) != 0) {
            s0Var = s0.DEFAULT;
        }
        s0 s0Var2 = s0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return a(q0Var, gVar2, i12, hVar2, s0Var2, lVar, pVar);
    }
}
