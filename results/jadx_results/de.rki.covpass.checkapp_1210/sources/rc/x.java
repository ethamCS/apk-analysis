package rc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import oe.n1;
import org.conscrypt.BuildConfig;
import rc.w;
import sc.e;
import xc.u0;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lrc/w$a;", BuildConfig.FLAVOR, "isGetter", "Lsc/d;", "b", "Lxc/u0;", "g", BuildConfig.FLAVOR, "f", "(Lrc/w$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class x {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sc.d<?> b(rc.w.a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.x.b(rc.w$a, boolean):sc.d");
    }

    private static final sc.e<Field> c(w.a<?, ?> aVar, boolean z10, Field field) {
        sc.e<Field> eVar;
        if (g(aVar.K().E()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                eVar = aVar.H() ? new e.g.a(field, e(aVar), f(aVar)) : new e.g.c(field, e(aVar));
            } else if (!aVar.H()) {
                return new e.f.c(field);
            } else {
                eVar = new e.f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                return aVar.H() ? new e.f.b(field) : new e.f.d(field);
            }
            eVar = aVar.H() ? new e.g.b(field, e(aVar)) : new e.g.d(field, e(aVar));
        } else if (z10) {
            return new e.f.C0366e(field);
        } else {
            eVar = new e.g.C0367e(field, e(aVar));
        }
        return eVar;
    }

    private static final boolean d(w.a<?, ?> aVar) {
        return aVar.K().E().j().B(j0.j());
    }

    private static final boolean e(w.a<?, ?> aVar) {
        return !n1.l(aVar.K().E().getType());
    }

    public static final Object f(w.a<?, ?> aVar) {
        hc.t.e(aVar, "<this>");
        return aVar.K().K();
    }

    private static final boolean g(u0 u0Var) {
        xc.m b10 = u0Var.b();
        hc.t.d(b10, "containingDeclaration");
        if (!ae.d.x(b10)) {
            return false;
        }
        xc.m b11 = b10.b();
        return (!ae.d.C(b11) && !ae.d.t(b11)) || ((u0Var instanceof me.j) && vd.i.f(((me.j) u0Var).X()));
    }
}
