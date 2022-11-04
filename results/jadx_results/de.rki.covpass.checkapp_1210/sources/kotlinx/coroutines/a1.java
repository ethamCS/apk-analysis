package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "timeMillis", "Ltb/e0;", "a", "(JLxb/d;)Ljava/lang/Object;", "Lxb/g;", "Lkotlinx/coroutines/z0;", "b", "(Lxb/g;)Lkotlinx/coroutines/z0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a1 {
    public static final Object a(long j10, xb.d<? super tb.e0> dVar) {
        xb.d b10;
        Object c10;
        Object c11;
        if (j10 <= 0) {
            return tb.e0.f22152a;
        }
        b10 = yb.c.b(dVar);
        q qVar = new q(b10, 1);
        qVar.z();
        if (j10 < Long.MAX_VALUE) {
            b(qVar.b()).b(j10, qVar);
        }
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return s10 == c11 ? s10 : tb.e0.f22152a;
    }

    public static final z0 b(xb.g gVar) {
        g.b i10 = gVar.i(xb.e.X0);
        z0 z0Var = i10 instanceof z0 ? (z0) i10 : null;
        return z0Var == null ? w0.a() : z0Var;
    }
}
