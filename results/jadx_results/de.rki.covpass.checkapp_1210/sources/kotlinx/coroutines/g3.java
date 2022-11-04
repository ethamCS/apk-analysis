package kotlinx.coroutines;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Ltb/e0;", "a", "(Lxb/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g3 {
    public static final Object a(xb.d<? super tb.e0> dVar) {
        xb.d b10;
        Object obj;
        Object c10;
        Object c11;
        xb.g b11 = dVar.b();
        e2.h(b11);
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.internal.f fVar = b10 instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) b10 : null;
        if (fVar == null) {
            obj = tb.e0.f22152a;
        } else {
            if (fVar.f15415x.R0(b11)) {
                fVar.k(b11, tb.e0.f22152a);
            } else {
                f3 f3Var = new f3();
                xb.g B = b11.B(f3Var);
                tb.e0 e0Var = tb.e0.f22152a;
                fVar.k(B, e0Var);
                if (f3Var.f15339d && !kotlinx.coroutines.internal.g.d(fVar)) {
                    obj = e0Var;
                }
            }
            obj = yb.d.c();
        }
        c10 = yb.d.c();
        if (obj == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return obj == c11 ? obj : tb.e0.f22152a;
    }
}
