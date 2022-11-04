package qc;

import hc.k0;
import hc.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import oc.e;
import oc.n;
import oc.o;
import rc.b0;
import rc.y;
import ub.c0;
import xc.f;
import xc.h;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loc/n;", "Loc/d;", "b", "(Loc/n;)Loc/d;", "getJvmErasure$annotations", "(Loc/n;)V", "jvmErasure", "Loc/e;", "a", "(Loc/e;)Loc/d;", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final oc.d<?> a(e eVar) {
        xc.e eVar2;
        oc.d<?> b10;
        Object X;
        boolean z10;
        t.e(eVar, "<this>");
        if (eVar instanceof oc.d) {
            return (oc.d) eVar;
        }
        if (!(eVar instanceof o)) {
            throw new b0("Cannot calculate JVM erasure for type: " + eVar);
        }
        List<n> upperBounds = ((o) eVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            n nVar = (n) next;
            t.c(nVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            h z11 = ((y) nVar).l().W0().z();
            if (z11 instanceof xc.e) {
                eVar2 = (xc.e) z11;
            }
            if (eVar2 == null || eVar2.h() == f.INTERFACE || eVar2.h() == f.ANNOTATION_CLASS) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                eVar2 = next;
                break;
            }
        }
        n nVar2 = (n) eVar2;
        if (nVar2 == null) {
            X = c0.X(upperBounds);
            nVar2 = (n) X;
        }
        return (nVar2 == null || (b10 = b(nVar2)) == null) ? k0.b(Object.class) : b10;
    }

    public static final oc.d<?> b(n nVar) {
        oc.d<?> a10;
        t.e(nVar, "<this>");
        e f10 = nVar.f();
        if (f10 == null || (a10 = a(f10)) == null) {
            throw new b0("Cannot calculate JVM erasure for type: " + nVar);
        }
        return a10;
    }
}
