package ff;

import gc.p;
import hc.q0;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.j2;
import org.conscrypt.BuildConfig;
import tb.s;
import tb.t;
import xb.d;
import xb.g;
import zb.h;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aT\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aV\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "receiver", "completion", "Ltb/e0;", "a", "(Lgc/p;Ljava/lang/Object;Lxb/d;)V", "Lkotlinx/coroutines/internal/z;", "block", "b", "(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;Lgc/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        Object obj;
        Object c10;
        d a10 = h.a(dVar);
        try {
            g b10 = dVar.b();
            Object c11 = f0.c(b10, null);
            obj = ((p) q0.d(pVar, 2)).u(r10, a10);
            f0.a(b10, c11);
            c10 = yb.d.c();
        } catch (Throwable th2) {
            s.a aVar = s.Companion;
            obj = t.a(th2);
        }
        if (obj != c10) {
            s.a aVar2 = s.Companion;
            a10.y(s.c(obj));
        }
    }

    public static final <T, R> Object b(z<? super T> zVar, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object c10;
        Object x02;
        Object c11;
        try {
            obj = ((p) q0.d(pVar, 2)).u(r10, zVar);
        } catch (Throwable th2) {
            obj = new d0(th2, false, 2, null);
        }
        c10 = yb.d.c();
        if (obj == c10 || (x02 = zVar.x0(obj)) == j2.f15469b) {
            c11 = yb.d.c();
            return c11;
        } else if (x02 instanceof d0) {
            throw ((d0) x02).f15325a;
        } else {
            return j2.h(x02);
        }
    }
}
